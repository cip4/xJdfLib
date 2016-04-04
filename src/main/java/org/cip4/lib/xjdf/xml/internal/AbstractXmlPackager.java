package org.cip4.lib.xjdf.xml.internal;

import org.apache.commons.io.IOUtils;
import org.cip4.lib.xjdf.schema.FileSpec;
import org.cip4.lib.xjdf.schema.Preview;
import org.cip4.lib.xjdf.schema.XJDF;
import org.cip4.lib.xjdf.type.URI;
import org.cip4.lib.xjdf.xml.XJdfParser;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.xpath.XPathConstants;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.zip.Deflater;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Packaging logic for XML Documents. Package an XML with all references in a ZIP Package.
 */
public abstract class AbstractXmlPackager {

    /**
     * Interface for the extraction of file reference out of a node.
     */
    interface URIExtractor {
        /**
         * Extracts the file reference out of a node.
         *
         * @param node Node to extract the reference from.
         *
         * @return Extracted reference.
         */
        org.cip4.lib.xjdf.type.URI extract(Node node);
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
     * Create a new AbstractXmlPackager.
     *
     * @param out The underlying OutputStream to write the package to.
     */
    public AbstractXmlPackager(final OutputStream out) {
        this.zout = new ZipOutputStream(out);
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
     * @param xjdf XJDF document to package.
     * @param docName File name of the document in the zip package.
     *
     * @throws PackagerException If the XML document could not be packaged.
     */
    protected final void packageXml(
        final XJDF xjdf,
        final String docName
    ) throws PackagerException {
        try {
            final JAXBNavigator<XJDF> jaxbNavigator = new JAXBNavigator<>(xjdf);
            Collection<org.cip4.lib.xjdf.type.URI> assetReferences = new LinkedList<>();

            assetReferences.addAll(collectReferences(
                (NodeList) jaxbNavigator.evaluate("//xjdf:Preview", XPathConstants.NODESET),
                new URIExtractor() {
                    @Override
                    public org.cip4.lib.xjdf.type.URI extract(final Node node) {
                        return ((Preview) jaxbNavigator.getJAXBNode(node)).getURL();
                    }
                }
                )
            );

            assetReferences.addAll(collectReferences(
                (NodeList) jaxbNavigator.evaluate("//xjdf:FileSpec", XPathConstants.NODESET),
                new URIExtractor() {
                    @Override
                    public org.cip4.lib.xjdf.type.URI extract(final Node node) {
                        return ((FileSpec) jaxbNavigator.getJAXBNode(node)).getURL();
                    }
                }
                )
            );

            final URI commentURL = xjdf.getCommentURL();
            if (commentURL != null) {
                assetReferences.add(commentURL);
            }

            // put XML to archive
            writeZipEntry(new ZipEntry(docName), new ByteArrayInputStream(new XJdfParser().parseXJdf(xjdf)));

            // put all files to archive
            for (org.cip4.lib.xjdf.type.URI uri : assetReferences) {
                final Path destPath = uri.getDestinationPath();
                if (destPath != null) {
                    try (InputStream inputStream = uri.getSourceUri().toURL().openStream()) {
                        writeZipEntry(new ZipEntry(destPath.toString()), inputStream);
                    }
                }
            }

            zout.finish();
        } catch (Exception e) {
            throw new PackagerException("Error while packaging XML document.", e);
        }
    }

    /**
     * Collects uri references of a node list.
     *
     * @param nodeListArr Node list to collect references from.
     * @param extractor Extracts the references.
     *
     * @return Collected uri references.
     */
    final Collection<org.cip4.lib.xjdf.type.URI> collectReferences(
        final NodeList nodeListArr, final URIExtractor extractor
    ) {
        Collection<org.cip4.lib.xjdf.type.URI> result = new ArrayList<>(nodeListArr.getLength());
        for (int i = 0; i < nodeListArr.getLength(); i++) {
            Node node = nodeListArr.item(i);
            result.add(extractor.extract(node));
        }
        return result;
    }

    /**
     * Writes the content of the passed input stream to the given zip entry.
     *
     * @param zipEntry The zip entry to write to.
     * @param inputStream The input stream to read content from.
     *
     * @throws IOException If the content could not be read or written.
     */
    final void writeZipEntry(final ZipEntry zipEntry, final InputStream inputStream) throws IOException {
        zout.putNextEntry(zipEntry);
        IOUtils.copy(inputStream, zout);
    }
}