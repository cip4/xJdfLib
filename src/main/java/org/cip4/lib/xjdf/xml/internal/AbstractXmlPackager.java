package org.cip4.lib.xjdf.xml.internal;

import org.apache.commons.io.IOUtils;
import org.cip4.lib.xjdf.uri.resolver.URIResolver;
import org.cip4.lib.xjdf.xml.XJdfNavigator;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.xpath.XPathExpressionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.Deflater;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Packaging logic for XML Documents. Package an XML with all references in a ZIP Package.
 */
public abstract class AbstractXmlPackager {

    /**
     * A simple class for storing the prepared packaging data.
     */
    final class PreparedPackagingData {

        /**
         * The prepared XmlNavigator.
         */
        final XmlNavigator nav;

        /**
         * The map that stores referenced files used in the prepared XmlNavigator.
         */
        final Map<String, String> fileRefs = new HashMap<>();

        /**
         * Constructor.
         *
         * @param xJdfNavigator The prepared XmlNavigator.
         * @param fileRefs The map containing the referenced files.
         */
        PreparedPackagingData(final XJdfNavigator xJdfNavigator, final Map<String, String>... fileRefs) {
            this.nav = xJdfNavigator;
            for (final Map<String, String> fileRefMap : fileRefs) {
                for (final Map.Entry<String, String> entry : fileRefMap.entrySet()) {
                    this.fileRefs.put(entry.getKey(), entry.getValue());
                }
            }
        }
    }

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
     * Tells whether all files should be put into the zip root.
     */
    private final boolean withoutHierarchy;

    /**
     * Create a new AbstractXmlPackager.
     *
     * @param out The underlying OutputStream to write the package to.
     */
    public AbstractXmlPackager(final OutputStream out) {
        this(out, false);
    }

    /**
     * Create a new AbstractXmlPackager.
     *
     * @param out The underlying OutputStream to write the package to.
     * @param withoutHierarchy Put all files into the zip root.
     */
    public AbstractXmlPackager(final OutputStream out, final boolean withoutHierarchy) {
        this.zout = new ZipOutputStream(out);
        this.withoutHierarchy = withoutHierarchy;
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
     * Packages an XML Document to a zipped binary output stream.
     *
     * @param xmlNavigator The XmlNavigator containing the data.
     * @param rootUri The root URI to use when dealing with relative URIs.
     *
     * @throws PackagerException If the XML document could not be packaged.
     * @throws XPathExpressionException If the JobId of the XJDF could not be read.
     */
    public abstract void packageXml(
        final XmlNavigator xmlNavigator,
        final URI rootUri
    ) throws PackagerException, XPathExpressionException;

    /**
     * Packages an XML document to a zipped binary output stream.
     *
     * @param xmlNavigator XML Navigator which is being packaged.
     * @param docName File name of the document in the zip package.
     * @param rootUri The root URI to use when dealing with relative URIs.
     *
     * @throws PackagerException If the XML document could not be packaged.
     */
    protected final void packageXml(
        final XmlNavigator xmlNavigator,
        final String docName,
        final URI rootUri
    ) throws PackagerException {
        try {
            final PreparedPackagingData packagingData = prepareForPackaging(xmlNavigator);

            // put XML to archive
            writeZipEntry(new ZipEntry(docName), packagingData.nav.getXmlStream());

            // put all files to archive
            for (final Map.Entry<String, String> entry : packagingData.fileRefs.entrySet()) {
                final URI uri = URIResolver.resolve(rootUri, entry.getKey());

                // only write local uri to zip
                if (uri.getHost() == null) {
                    final String targetPath = entry.getValue();

                    try (final InputStream is = uri.toURL().openStream()) {
                        writeZipEntry(new ZipEntry(targetPath), is);
                    }
                }
            }

            zout.finish();
        } catch (Exception e) {
            throw new PackagerException("Error while packaging XML document.", e);
        }
    }

    /**
     * Returns the URI encoded base name of the path.
     *
     * @param path The path to encode the base name from.
     *
     * @return The encoded base name.
     * @throws URISyntaxException If the given path could not be encoded.
     */
    private String encodeURIBaseName(final String path) throws URISyntaxException {
        return new URI(
            null,
            null,
            path.substring(path.lastIndexOf('/') + 1),
            null
        ).toASCIIString();
    }

    /**
     * Prepares the given XmlNavigator for packaging.
     *
     * @param nav The XmlNavigator to be prepared.
     *
     * @return The prepared data used for packaging.
     * @throws URISyntaxException If a file reference could not be encoded.
     * @throws Exception If the XmlNavigator could not be evaluated.
     */
    final PreparedPackagingData prepareForPackaging(final XmlNavigator nav) throws URISyntaxException, Exception {
        final XJdfNavigator xJdfNavigator = new XJdfNavigator(nav.getXmlBytes(), true);

        return new PreparedPackagingData(
            xJdfNavigator,
            relativizeNodeList(xJdfNavigator.evaluateNodeList("//xjdf:FileSpec/@URL"), "artwork/"),
            relativizeNodeList(xJdfNavigator.evaluateNodeList("//xjdf:Preview/@URL"), "preview/"),
            relativizeNodeList(xJdfNavigator.evaluateNodeList("//xjdf:XJDF/@CommentURL"), "docs/")
        );
    }

    /**
     * Relativizes the file references in the passed node list.
     *
     * @param nodeList The file references to relativize.
     * @param targetDir The target directory where the file references should be created.
     *
     * @return A map containing the mapping between the source and the target file.
     * @throws URISyntaxException If a file reference could not be encoded.
     */
    private Map<String, String> relativizeNodeList(
        final NodeList nodeList,
        final String targetDir
    ) throws URISyntaxException {
        final Map<String, String> referencedFiles = new HashMap<>();

        for (int i = 0; i < nodeList.getLength(); i++) {
            final Node node = nodeList.item(i);

            final String uriString = node.getNodeValue();
            final String baseName = encodeURIBaseName(uriString);
            final String uriFileName = withoutHierarchy
                ? baseName
                : targetDir + baseName;

            node.setNodeValue(uriFileName);

            referencedFiles.put(uriString, uriFileName);
        }

        return referencedFiles;
    }

    /**
     * Writes the content of the passed input stream to the given zip entry.
     *
     * @param zipEntry The zip entry to write to.
     * @param inputStream The input stream to read content from.
     *
     * @throws IOException If the content could not be read or written.
     */
    private void writeZipEntry(final ZipEntry zipEntry, final InputStream inputStream) throws IOException {
        zout.putNextEntry(zipEntry);
        IOUtils.copy(inputStream, zout);
    }
}