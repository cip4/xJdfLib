package org.cip4.lib.xjdf.xml.internal;

import org.apache.commons.io.IOUtils;
import org.cip4.lib.xjdf.schema.FileSpec;
import org.cip4.lib.xjdf.schema.XJDF;
import org.cip4.lib.xjdf.type.URI;
import org.cip4.lib.xjdf.xml.XJdfConstants;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
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
     * A reference to an already existing archive that should be enhanced.
     */
    private Path zipPath;

    /**
     * True, in case the document should become validated before packaging.
     */
    private boolean validation = true;

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
        this(null, out);
    }

    /**
     * Create a new AbstractXmlPackager.
     *
     * @param zipPath The path to an existing zip archive.
     * @param out The underlying OutputStream to write the package to.
     */
    public AbstractXmlPackager(final Path zipPath, final OutputStream out) {
        this.zipPath = zipPath;
        this.zout = new ZipOutputStream(out);
    }

    /**
     * Sets a reference to an already existing archive.
     *
     * @param zipPath The path to existing archive
     *
     * @return This AbstractXmlPackager
     */
    public final AbstractXmlPackager<T> withZipPath(final Path zipPath) {
        this.zipPath = zipPath;
        return this;
    }

    /**
     * Returns the validation value.
     * @return True in case the docuemnt should become validated before packaging.
     */
    public boolean isValidation() {
        return validation;
    }

    /**
     * Setter for validation attribute.
     *
     * @param validation True in case the XML should become validated before packaging.
     */
    public void setValidation(final boolean validation) {
        this.validation = validation;
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
    protected final void packageXml(final T document, final String docName) throws PackagerException {

        try {
            // add namespace
            final JAXBNavigator<T> jaxbNavigator = new JAXBNavigator<>(document);
            jaxbNavigator.addNamespace("xjdf", XJdfConstants.NAMESPACE_JDF20);
            jaxbNavigator.addNamespace("ptk", XJdfConstants.NAMESPACE_JDF20);
            Collection<URI> assetReferences = new LinkedList<>();

            // process FileSpec assets
            assetReferences.addAll(collectReferences(
                (URIExtractor<FileSpec>) FileSpec::getURL,
                jaxbNavigator.evaluateNodeList("//xjdf:FileSpec")
            ));

            // process XJDF assets
            assetReferences.addAll(collectReferences(
                (URIExtractor<XJDF>) XJDF::getCommentURL,
                new Object[]{document instanceof XJDF ? document : jaxbNavigator.evaluateNode("//xjdf:XJDF")}
            ));

            // write XJDF Document to ZIP Archive
            writeZipEntry(new ZipEntry(docName), new ByteArrayInputStream(parseDocument(document, validation)));

            // write assets to ZIP Archive
            try (final FileSystem zipfs = zipPath != null ? FileSystems.newFileSystem(zipPath, null) : null) {

                // for each asset reference
                for (URI uri : assetReferences) {
                    final String destPath = uri.getDestinationPath();

                    if (destPath != null) {
                        final java.net.URI srcUri = uri.getSourceUri();

                        if (uri.getSourceInputStream() != null) {
                            try (InputStream is = uri.getSourceInputStream()) {
                                writeZipEntry(new ZipEntry(destPath), is);
                            }
                        } else if (!srcUri.isAbsolute()) {
                            try (InputStream is = Files.newInputStream(zipfs.getPath("/", srcUri.getPath()))) {
                                writeZipEntry(new ZipEntry(destPath), is);
                            }
                        } else {
                            try (InputStream is = srcUri.toURL().openStream()) {
                                writeZipEntry(new ZipEntry(destPath), is);
                            }
                        }
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
                result.add(uri.complete());
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
     * @param validation true, in case XML validation should be validated before packaging.
     *
     * @return Parsed document as byte array.
     * @throws Exception If parsing fails.
     */
    protected abstract byte[] parseDocument(final T document, boolean validation) throws Exception;
}