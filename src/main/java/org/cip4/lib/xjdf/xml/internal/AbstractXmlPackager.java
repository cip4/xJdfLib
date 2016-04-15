package org.cip4.lib.xjdf.xml.internal;

import org.apache.commons.io.IOUtils;
import org.cip4.lib.xjdf.schema.FileSpec;
import org.cip4.lib.xjdf.schema.Preview;
import org.cip4.lib.xjdf.schema.XJDF;
import org.cip4.lib.xjdf.type.URI;
import org.cip4.lib.xjdf.xml.XJdfConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
 *
 * @param <T> Object type to create the abstract xml packager for.
 */
public abstract class AbstractXmlPackager<T> {

    /**
     * Logger.
     */
    public static final Logger LOGGER = LoggerFactory.getLogger(AbstractXmlPackager.class);

    /**
     * Interface for the extraction of a file reference.
     *
     * @param <T> Object to extract the reference from.
     */
    interface URIExtractor<T> {
        /**
         * Extracts the file reference.
         *
         * @param xjdfElement XJDF Element to extract the reference from.
         *
         * @return Extracted reference.
         */
        org.cip4.lib.xjdf.type.URI extract(T xjdfElement);
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
     * @param document Document to package.
     * @param docName File name of the document in the zip package.
     *
     * @throws PackagerException If the XML document could not be packaged.
     */
    protected final void packageXml(
        final T document,
        final String docName
    ) throws PackagerException {
        try {
            final JAXBNavigator<T> jaxbNavigator = new JAXBNavigator<>(document);
            jaxbNavigator.addNamespace("xjdf", XJdfConstants.NAMESPACE_JDF20);
            jaxbNavigator.addNamespace("ptk", XJdfConstants.NAMESPACE_JDF20);
            Collection<URI> assetReferences = new LinkedList<>();

            assetReferences.addAll(collectReferences(
                new URIExtractor<Preview>() {
                    @Override
                    public org.cip4.lib.xjdf.type.URI extract(final Preview preview) {
                        return preview.getURL();
                    }
                },
                jaxbNavigator.evaluateNodeList("//xjdf:Preview")
                )
            );

            assetReferences.addAll(collectReferences(
                new URIExtractor<FileSpec>() {
                    @Override
                    public org.cip4.lib.xjdf.type.URI extract(final FileSpec fileSpec) {
                        return fileSpec.getURL();
                    }
                },
                jaxbNavigator.evaluateNodeList("//xjdf:FileSpec")
                )
            );

            assetReferences.addAll(collectReferences(
                new URIExtractor<XJDF>() {
                    @Override
                    public org.cip4.lib.xjdf.type.URI extract(final XJDF xjdf) {
                        return xjdf.getCommentURL();
                    }
                },
                new Object[]{document instanceof XJDF ? document : jaxbNavigator.evaluateNode("//xjdf:XJDF")}
                )
            );

            writeZipEntry(new ZipEntry(docName), new ByteArrayInputStream(parseDocument(document)));

            for (URI uri : assetReferences) {
                final Path destPath = uri.getDestinationPath();
                LOGGER.debug(String.format("Start processing uri '%s'.", uri));
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
     * Collects uri references.
     *
     * @param extractor Object that extracts the references.
     * @param refs References to extract.
     *
     * @return Collected uri references.
     */
    final Collection<org.cip4.lib.xjdf.type.URI> collectReferences(
        final URIExtractor extractor, final Object[] refs
    ) {
        Collection<org.cip4.lib.xjdf.type.URI> result = new ArrayList<>();
        for (Object ref : refs) {
            final URI uri = extractor.extract(ref);
            if (uri != null) {
                result.add(uri);
            }
        }
        return result;
    }

    /**
     * Writes the content of the passed input stream to the given zip entry.
     *
     * @param zipEntry The zip entry to write to.
     * @param inputStream Input stream to write to the zip entry.
     *
     * @throws IOException If the content could not be read or written.
     */
    private void writeZipEntry(final ZipEntry zipEntry, final InputStream inputStream) throws IOException {
        zout.putNextEntry(zipEntry);
        IOUtils.copy(inputStream, zout);
    }

    /**
     * Parses an XML document into a byte array.
     *
     * @param document XML document to parse.
     *
     * @return Parsed document as byte array.
     * @throws Exception If parsing fails.
     */
    protected abstract byte[] parseDocument(final T document) throws Exception;
}