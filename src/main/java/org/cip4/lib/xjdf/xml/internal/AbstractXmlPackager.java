package org.cip4.lib.xjdf.xml.internal;

import org.apache.commons.io.IOUtils;
import org.cip4.lib.xjdf.uri.AbstractURIResolver;
import org.cip4.lib.xjdf.uri.RelativeURIPathResolver;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.xpath.XPathExpressionException;
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
        CompressionLevel(final int level) {
            this.level = level;
        }
    }

    /**
     * The ZipOutputStream to write to.
     */
    private final ZipOutputStream zout;

    /**
     * The uri resolver to use when resolving a file reference.
     */
    private final AbstractURIResolver uriResolver;

    /**
     * Create a new AbstractXmlPackager.
     *
     * @param out The underlying OutputStream to write the package to.
     * @param uriResolver The uri resolver to use when resolving a file reference.
     */
    public AbstractXmlPackager(final OutputStream out, final AbstractURIResolver uriResolver) {
        zout = new ZipOutputStream(out);
        this.uriResolver = uriResolver;
    }

    /**
     * Setter for compressionLevel attribute.
     *
     * @param compressionLevel the compressionLevel to set
     */
    public final void setCompressionLevel(final CompressionLevel compressionLevel) {
        zout.setLevel(compressionLevel.level);
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
    protected final void packageXml(
        final XmlNavigator xmlNavigator,
        final String docName,
        final boolean withoutHierarchy
    ) throws Exception {
        final XmlNavigator tmpXmlNavigator = new XmlNavigator(xmlNavigator);

        // put all files to archive
        try {
            writeReferencedFiles(
                tmpXmlNavigator.evaluateNodeList("//FileSpec/@URL"),
                withoutHierarchy
                    ? ""
                    : "artwork/"
            );
            writeReferencedFiles(
                tmpXmlNavigator.evaluateNodeList("//Preview/@URL"),
                withoutHierarchy
                    ? ""
                    : "preview/"
            );
            writeReferencedFiles(
                tmpXmlNavigator.evaluateNodeList("//XJDF/@CommentURL"),
                withoutHierarchy
                    ? ""
                    : "docs/"
            );
        } catch (XPathExpressionException e) {
            throw new PackagerException("NodeList could not be retrieved from xml.", e);
        }

        // put XML to archive
        ZipEntry zipEntryXml = new ZipEntry(docName);
        zout.putNextEntry(zipEntryXml);
        zout.write(tmpXmlNavigator.getXmlBytes());

        // flush
        zout.finish(); // TODO finish here?
    }

    /**
     * Write the content of the passed NodeList to the ZIP package.
     *
     * @param nodeList NodeList which contains a set of nodes with the URIs.
     * @param targetDir String which defines the target directory inside the ZIP package.
     *
     * @throws URISyntaxException If files can not be resolved.
     * @throws IOException If files can not be read.
     */
    final void writeReferencedFiles(
        final NodeList nodeList,
        final String targetDir
    ) throws IOException, URISyntaxException {
        for (int i = 0; i < nodeList.getLength(); i++) {
            final Node node = nodeList.item(i);

            final URI sourceUri = uriResolver.resolve(node.getTextContent());
            final ZipEntry zipEntry = writeReferencedFile(sourceUri, targetDir);

            // update filename
            node.setNodeValue(zipEntry.getName());
        }
    }

    /**
     * Write the given URI to the ZIP package.
     *
     * @param sourceUri The source URI to write to the package.
     * @param targetDir The target directory to write to.
     *
     * @return The ZipEntry that was written to the ZIP package.
     *
     * @throws IOException If the URI could not be written to the ZIP package.
     * @throws URISyntaxException If the passed source path could not be resolved.
     */
    final ZipEntry writeReferencedFile(
        final URI sourceUri,
        final String targetDir
    ) throws IOException, URISyntaxException {
        String tmpTargetDir = targetDir;
        if (!tmpTargetDir.endsWith("/")) {
            tmpTargetDir += "/";
        }

        final ZipEntry zipEntry = createZipEntry(tmpTargetDir, sourceUri);
        try (final InputStream in = sourceUri.toURL().openStream()) {
            zout.putNextEntry(zipEntry);
            IOUtils.copy(in, zout);
        }

        return zipEntry;
    }

    /**
     * Creates a ZipEntry for the given URI.
     *
     * @param targetDir The target directory inside the ZIP package.
     * @param fileUri The URI to write to the package.
     *
     * @return The ZipEntry for the given URI.
     *
     * @throws URISyntaxException If the passed source path could not be resolved.
     */
    final ZipEntry createZipEntry(final String targetDir, final URI fileUri) throws URISyntaxException {
        final String fileUriPath = fileUri.getPath();
        final String uriFileName = fileUriPath.substring(fileUriPath.lastIndexOf('/') + 1);

        final RelativeURIPathResolver tmpUriResolver = new RelativeURIPathResolver(fileUri.resolve("."));
        final String zipEntryName = tmpUriResolver.relativize(tmpUriResolver.resolve(targetDir).resolve(uriFileName));

        return new ZipEntry(zipEntryName);
    }
}
