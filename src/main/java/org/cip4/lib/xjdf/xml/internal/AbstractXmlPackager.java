package org.cip4.lib.xjdf.xml.internal;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.xpath.XPathExpressionException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.zip.Deflater;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Packaging logic for XML Documents. Package an XML with all references in a ZIP Package.
 */
public abstract class AbstractXmlPackager {

    /**
     * ZIP Compression Level.
     */
    public enum CompressionLevel {
        /**
         * Best speed.
         */
        BEST_SPEED(Deflater.BEST_SPEED),
        /**
         * Best compression.
         */
        BEST_COMPRESSION(Deflater.BEST_COMPRESSION),
        /**
         * Default compression.
         */
        DEFAULT_COMPRESSION(Deflater.DEFAULT_COMPRESSION),
        /**
         * No compression.
         */
        NO_COMPRESSION(Deflater.NO_COMPRESSION);

        /**
         * The compression level.
         */
        private final int level;

        /**
         * Constructor.
         *
         * @param level The compression level.
         */
        CompressionLevel(int level) {
            this.level = level;
        }

        /**
         * Get the compression level.
         *
         * @return Compression level.
         */
        public int getLevel() {
            return level;
        }
    }

    /**
     * The ZipOutputStream to write to.
     */
    private final ZipOutputStream zout;

    /**
     * The level of compression to use while writing.
     */
    private CompressionLevel compressionLevel = CompressionLevel.DEFAULT_COMPRESSION;

    /**
     * The root URI to use when dealing with relative URIs.
     */
    private final URI rootUri;

    /**
     * Create a new AbstractXmlPackager.
     *
     * @param out The underlying OutputStream to write the package to.
     * @param rootUri The root URI to use when dealign with relative URIs.
     */
    public AbstractXmlPackager(OutputStream out, URI rootUri) {
        zout = new ZipOutputStream(out);
        this.rootUri = rootUri;
    }

    /**
     * Getter for compressionLevel attribute.
     *
     * @return The compressionLevel.
     */
    public CompressionLevel getCompressionLevel() {
        return compressionLevel;
    }

    /**
     * Setter for compressionLevel attribute.
     *
     * @param compressionLevel the compressionLevel to set
     */
    public void setCompressionLevel(CompressionLevel compressionLevel) {
        this.compressionLevel = compressionLevel;
    }

    /**
     * Packages an XML document to a zipped binary output stream.
     *
     * @param xmlNavigator XML Navigator which is being packaged.
     * @param docName File name of the document in the zip package.
     * @param withoutHierarchy Put all files into the ZIP Root.
     *
     * @throws Exception If the XML document could not be packaged.
     */
    protected void packageXml(XmlNavigator xmlNavigator, String docName, final boolean withoutHierarchy) throws Exception {
        final XmlNavigator _xmlNavigator = new XmlNavigator(xmlNavigator);

        // set compression level
        zout.setLevel(compressionLevel.getLevel());

        // put all files to archive
        try {
            writeReferencedFiles(
                _xmlNavigator.evaluateNodeList("//FileSpec/@URL"),
                withoutHierarchy
                    ? ""
                    : "artwork"
            );
            writeReferencedFiles(
                _xmlNavigator.evaluateNodeList("//Preview/@URL"),
                withoutHierarchy
                    ? ""
                    : "preview"
            );
            writeReferencedFiles(
                _xmlNavigator.evaluateNodeList("//XJDF/@CommentURL"),
                withoutHierarchy
                    ? ""
                    : "docs"
            );
        } catch (XPathExpressionException e) {
            throw new PackagerException("NodeList could not be retrieved from xml.", e);
        }

        // put XML to archive
        ZipEntry zipEntryXml = new ZipEntry(docName);
        zout.putNextEntry(zipEntryXml);
        zout.write(_xmlNavigator.getXmlBytes());

        // flush
        zout.finish();
    }

    /**
     * Write the content of the passed NodeList to the ZIP package.
     *
     * @param nodeList NodeList which contains a set of nodes with the URIs.
     * @param targetDir String which defines the target directory inside the ZIP package.
     *
     * @throws PackagerException If files can not be resolved.
     * @throws IOException If files can not be read.
     */
    final void writeReferencedFiles(NodeList nodeList, String targetDir) throws IOException, PackagerException {
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);

            ZipEntry zipEntry = writeReferencedFile(node.getTextContent(), targetDir);

            // update filename
            node.setNodeValue(zipEntry.getName());
        }
    }

    /**
     * Write the given URI to the ZIP package.
     *
     * @param sourceFile The source file to write to the package.
     * @param targetDir The target directory to write to.
     *
     * @return The ZipEntry that was written to the ZIP package.
     *
     * @throws IOException If the URI could not be written to the ZIP package.
     * @throws PackagerException If the passed source path could not be resolved.
     */
    final ZipEntry writeReferencedFile(
        String sourceFile,
        String targetDir
    ) throws IOException, PackagerException {
        URI sourceUri = createSourceURI(sourceFile);
        ZipEntry zipEntry = createZipEntry(targetDir, sourceUri);

        try (final InputStream in = sourceUri.toURL().openStream()) {
            zout.putNextEntry(zipEntry);
            IOUtils.copy(in, zout);
        }

        return zipEntry;
    }

    /**
     * Creates a URI based on the given String.
     *
     * @param srcPath The String representation of the URI.
     *
     * @return URI respresentation.
     *
     * @throws PackagerException If the passed source path could not be resolved.
     */
    protected URI createSourceURI(String srcPath) throws PackagerException {
        URI srcUri;

        try {
            srcUri = new URI(srcPath);
        } catch (URISyntaxException e) {
            srcUri = null;
        }

        if (srcUri == null || !srcUri.isAbsolute()) {
            File file = new File(srcPath);
            if (!file.isAbsolute()) {
                if (rootUri == null) {
                    throw new PackagerException(
                        String.format(
                            "Can not resolve relative path '%s' because no rootPath was provided.",
                            srcPath
                        )
                    );
                }

                file = new File(rootUri.resolve(FilenameUtils.separatorsToUnix(file.getPath())));
            }
            srcUri = file.toURI();
        }

        return srcUri;
    }

    /**
     * Creates a ZipEntry for the given URI.
     *
     * @param targetDir The target directory inside the ZIP package.
     * @param fileUri The URI to write to the package.
     *
     * @return The ZipEntry for the given URI.
     */
    protected ZipEntry createZipEntry(String targetDir, URI fileUri) {
        final String zipEntryName = FilenameUtils.separatorsToUnix(
            FilenameUtils.concat(
                targetDir,
                normalizeFileName(
                    fileUri.resolve(".").relativize(fileUri).getPath()
                )
            )
        );
        ZipEntry zipEntry = new ZipEntry(zipEntryName);

        return zipEntry;
    }

    /**
     * Normalizes a file name by replacing any non alphanumeric character (except '.' and '-') with an underscore.
     *
     * @param fileName The file name to normalize.
     *
     * @return Normalized file name.
     */
    final String normalizeFileName(final String fileName) {
        return fileName.replaceAll("[^-_a-zA-Z0-9.]+", "_");
    }

}
