package org.cip4.lib.xjdf;

import org.cip4.lib.xjdf.exception.XJdfPackagerException;
import org.cip4.lib.xjdf.exception.XJdfParseException;
import org.cip4.lib.xjdf.exception.XJdfValidationException;
import org.cip4.lib.xjdf.type.URI;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/**
 * Create and read XJDF ZIP packages.
 *
 * <p>
 * An XJDF ZIP package bundles a single XJDF document together with the files it references, for example the
 * artwork referenced through {@code FileSpec/@URL}. The XJDF document is always the first entry of the archive.
 * The referenced files are added manually with {@link Builder#withFile(URI, byte[])}; their entry names must
 * match the relative URLs used by the document.
 * </p>
 *
 * <pre>{@code
 * XJdfZipPackage pkg = new XJdfZipPackage.Builder()
 *     .withXJdfDocument(new URI("0b520d.xjdf"), document)
 *     .withFile(new URI("artwork/my-artwork.pdf"), artwork)
 *     .build();
 * byte[] zip = pkg.packageFiles();
 * }</pre>
 */
public class XJdfZipPackage {

    private static final String XJDF_EXTENSION = ".xjdf";

    private final URI xjdfUri;

    /**
     * The entries of the package, in archive order. The XJDF document is always the first entry.
     */
    private final Map<URI, byte[]> files;

    /**
     * Creates a package from an XJDF document and its files.
     *
     * @param xjdfUri The entry name of the XJDF document.
     * @param xJdfDocument The XJDF document.
     * @param files The files referenced by the document.
     *
     * @throws XJdfValidationException in case the document is invalid.
     * @throws XJdfParseException in case the document cannot be serialized.
     */
    XJdfZipPackage(final URI xjdfUri, @NotNull final XJdfDocument xJdfDocument, @NotNull final Map<URI, byte[]> files)
        throws XJdfValidationException, XJdfParseException {

        this.xjdfUri = xjdfUri;

        Map<URI, byte[]> fileMap = new LinkedHashMap<>();
        fileMap.put(xjdfUri, xJdfDocument.toXml());
        fileMap.putAll(files);

        this.files = Collections.unmodifiableMap(fileMap);
    }

    /**
     * Reads a package from an existing zip archive.
     *
     * <p>
     * The archive must contain exactly one XJDF document, identified by its {@code .xjdf} file extension.
     * </p>
     *
     * @param zipArchive The archive as byte array.
     *
     * @throws IOException in case the archive cannot be read.
     * @throws XJdfPackagerException in case the archive does not contain exactly one XJDF document.
     */
    public XJdfZipPackage(final byte[] zipArchive) throws IOException, XJdfPackagerException {
        Map<URI, byte[]> entries;
        try {
            entries = ZipArchive.read(zipArchive);
        } catch (URISyntaxException e) {
            throw new XJdfPackagerException("The archive contains an entry name that is not a valid URI.", e);
        }

        URI xjdfEntry = findSingleXjdfEntry(entries);

        Map<URI, byte[]> fileMap = new LinkedHashMap<>();
        fileMap.put(xjdfEntry, entries.remove(xjdfEntry));
        fileMap.putAll(entries);

        this.xjdfUri = xjdfEntry;
        this.files = Collections.unmodifiableMap(fileMap);
    }

    private static URI findSingleXjdfEntry(final Map<URI, byte[]> entries) throws XJdfPackagerException {
        List<URI> xjdfEntries = new LinkedList<>();

        for (URI uri : entries.keySet()) {
            String name = uri.toString().toLowerCase(Locale.ROOT);
            if (name.endsWith(XJDF_EXTENSION)) {
                xjdfEntries.add(uri);
            }
        }

        if (xjdfEntries.isEmpty()) {
            throw new XJdfPackagerException("The archive contains no XJDF document.");
        }

        if (xjdfEntries.size() > 1) {
            throw new XJdfPackagerException(
                "The archive contains more than one XJDF document: " + xjdfEntries + "."
            );
        }

        return xjdfEntries.get(0);
    }

    /**
     * Returns the entry name of the XJDF document.
     *
     * @return The entry name of the XJDF document.
     */
    public URI getXJdfUri() {
        return xjdfUri;
    }

    /**
     * Returns the XJDF document of the package.
     *
     * @return The XJDF document.
     *
     * @throws XJdfParseException in case the document cannot be parsed.
     */
    public XJdfDocument getXJdfDocument() throws XJdfParseException {
        return new XJdfDocument(getFile(xjdfUri));
    }

    /**
     * Returns list of all files.
     *
     * @return Set of file URIs, in archive order.
     */
    public Set<URI> listFiles() {
        return files.keySet();
    }

    /**
     * Returns all entries of the package, in archive order. The XJDF document is always the first entry.
     *
     * @return The entries as unmodifiable map.
     */
    public Map<URI, byte[]> getFiles() {
        return files;
    }

    /**
     * Returns a file as byte array.
     *
     * @param uri The uri as string.
     * @return The file as byte array.
     *
     * @throws URISyntaxException in case the string is not a valid URI.
     */
    public byte[] getFile(final String uri) throws URISyntaxException {
        return getFile(new URI(uri));
    }

    /**
     * Returns a file as byte array.
     *
     * @param uri The uri object.
     * @return The file as byte array.
     */
    public byte[] getFile(final URI uri) {
        return this.files.get(uri);
    }

    /**
     * Packages files to a zip archive.
     *
     * @return The zip packaged files as byte array.
     *
     * @throws IOException in case the archive cannot be written.
     */
    public byte[] packageFiles() throws IOException {
        return ZipArchive.write(files);
    }

    /**
     * Returns the default entry name of an XJDF document: the JobID with a {@code .xjdf} extension, or
     * {@code document.xjdf} in case the document has no JobID that forms a valid URI.
     *
     * @param xJdfDocument The XJDF document.
     *
     * @return The default entry name.
     */
    static URI defaultXJdfUri(final XJdfDocument xJdfDocument) {
        String jobId = xJdfDocument.getXJdf().getJobID();

        if (jobId != null && !jobId.isEmpty()) {
            try {
                return new URI(jobId + XJDF_EXTENSION);
            } catch (URISyntaxException e) {
                // fall through to the fallback name
            }
        }

        try {
            return new URI("document" + XJDF_EXTENSION);
        } catch (URISyntaxException e) {
            // unreachable: the fallback name is a valid URI
            throw new IllegalStateException(e);
        }
    }

    /**
     * Builder for {@link XJdfZipPackage} instances.
     */
    public static class Builder {

        private URI xjdfUri;

        private XJdfDocument xJdfDocument;

        private final Map<URI, byte[]> fileMap;

        /**
         * Default constructor.
         */
        public Builder() {
            fileMap = new LinkedHashMap<>();
        }

        /**
         * Adds the XJDF document that becomes the first entry of the package.
         *
         * @param uri The package entry name of the document.
         * @param xJdfDocument The document.
         *
         * @return This builder.
         */
        public Builder withXJdfDocument(final URI uri, final XJdfDocument xJdfDocument) {
            this.xjdfUri = uri;
            this.xJdfDocument = xJdfDocument;
            return this;
        }

        /**
         * Adds the XJDF document that becomes the first entry of the package. The entry name defaults to the
         * JobID of the document.
         *
         * @param xJdfDocument The document.
         *
         * @return This builder.
         */
        public Builder withXJdfDocument(final XJdfDocument xJdfDocument) {
            this.xJdfDocument = xJdfDocument;
            return this;
        }

        /**
         * Adds a binary file to the package.
         *
         * @param uri The package entry name of the file. It must match the relative URL used by the XJDF
         *     document.
         * @param bytes The file content.
         *
         * @return This builder.
         */
        public Builder withFile(final URI uri, final byte[] bytes) {
            fileMap.put(uri, bytes);
            return this;
        }

        /**
         * Creates the package from the configured content.
         *
         * @return The new package.
         *
         * @throws XJdfPackagerException in case no document was added.
         * @throws XJdfValidationException in case the document is invalid.
         * @throws XJdfParseException in case the document cannot be serialized.
         */
        public XJdfZipPackage build()
            throws XJdfPackagerException, XJdfValidationException, XJdfParseException {

            if (xJdfDocument == null) {
                throw new XJdfPackagerException("No XJDF document was added to the package.");
            }

            URI uri = xjdfUri == null ? defaultXJdfUri(xJdfDocument) : xjdfUri;

            return new XJdfZipPackage(uri, xJdfDocument, fileMap);
        }
    }
}
