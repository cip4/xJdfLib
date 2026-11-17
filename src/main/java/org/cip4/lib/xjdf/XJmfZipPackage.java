package org.cip4.lib.xjdf;

import org.cip4.lib.xjdf.exception.XJdfInitException;
import org.cip4.lib.xjdf.exception.XJdfParseException;
import org.cip4.lib.xjdf.exception.XJdfValidationException;
import org.cip4.lib.xjdf.type.URI;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Create and read XJMF ZIP packages.
 *
 * <p>
 * An XJMF ZIP package bundles the {@code root.xjmf} message, one or more XJDF documents and any files referenced by
 * those documents into a single archive. The package can be created from an existing archive or composed with
 * {@link org.cip4.lib.xjdf.XJmfZipPackage.Builder}.
 * </p>
 *
 * <pre>{@code
 * byte[] zip = new XJmfZipPackage.Builder()
 *     .withXJmfRoot(message)
 *     .withXJdfDocument(new URI("0b520d.xjdf"), document)
 *     .withFile(new URI("artwork/my-artwork.pdf"), artwork)
 *     .build()
 *     .packageFiles();
 * }</pre>
 *
 * <p>
 * The entries of a package are exposed through {@link #listFiles()} and {@link #getFile(URI)}.
 * </p>
 */
public class XJmfZipPackage {

    private final Map<URI, byte[]> files;

    private static final URI URI_ROOT_XJMF;

    static {
        try {
            URI_ROOT_XJMF = new URI("root.xjmf");
        } catch (URISyntaxException e) {
            throw new IllegalStateException("The root XJMF entry name is not a valid URI.", e);
        }
    }

    /**
     * Default constructor.
     */
    public XJmfZipPackage() {
        this.files = Collections.unmodifiableMap(new LinkedHashMap<>());
    }

    /**
     * Creates a package from a root XJMF message.
     *
     * @param rootJmf The root xjmf message.
     *
     * @throws XJdfValidationException in case the root message is invalid.
     * @throws XJdfParseException in case the root message cannot be serialized.
     */
    public XJmfZipPackage(XJmfMessage rootJmf)
        throws XJdfValidationException, XJdfParseException {
        this(rootJmf, new LinkedHashMap<>(), new LinkedHashMap<>());
    }

    /**
     * Custom constructor.
     * Accepting a root XJMF and a map of XJDF Documents for initializing.
     *
     * @param rootJmf The root xjmf message.
     * @param xJdfDocuments Map of XJDF Documents
     */
    public XJmfZipPackage(XJmfMessage rootJmf, @NotNull Map<URI, XJdfDocument> xJdfDocuments)
        throws XJdfValidationException, XJdfParseException {
        this(rootJmf, xJdfDocuments, new LinkedHashMap<>());
    }

    /**
     * Custom constructor.
     * Accepting a root XJMF and a map of XJDF Documents for initializing.
     *
     * @param rootJmf The root xjmf message.
     * @param xJdfDocuments Map of XJDF Documents
     * @param files Map of files
     */
    public XJmfZipPackage(XJmfMessage rootJmf, @NotNull Map<URI, XJdfDocument> xJdfDocuments, @NotNull Map<URI, byte[]> files)
        throws XJdfValidationException, XJdfParseException {

        Map<URI, byte[]> fileMap = new LinkedHashMap<>();
        fileMap.put(URI_ROOT_XJMF, rootJmf.toXml());

        for (Map.Entry<URI, XJdfDocument> entry : xJdfDocuments.entrySet()) {
            fileMap.put(entry.getKey(), entry.getValue().toXml());
        }
        files.forEach(fileMap::put);

        this.files = Collections.unmodifiableMap(fileMap);
    }

    /**
     * Custom constructor.
     * Accepting a zip archive for initializing.
     */
    public XJmfZipPackage(byte[] zipArchive) throws IOException, URISyntaxException {
        this.files = Collections.unmodifiableMap(ZipArchive.read(zipArchive));
    }

    /**
     * Returns list of all files.
     * @return Set of file URIs, in archive order.
     */
    public Set<URI> listFiles() {
        return files.keySet();
    }

    /**
     * Returns a file as byte array.
     * @param uri The uri as string.
     * @return The file as byte array.
     *
     * @throws java.net.URISyntaxException in case the string is not a valid URI.
     */
    public byte[] getFile(String uri) throws URISyntaxException {
        return getFile(new URI(uri));
    }

    /**
     * Returns a file as byte array.
     * @param uri The uri object.
     * @return The file as byte array.
     */
    public byte[] getFile(URI uri) {
        return this.files.get(uri);
    }

    /**
     * Returns an XJDF Document by uri.
     * @param uri The uri object.
     * @return The XJDF Document.
     *
     * @throws XJdfInitException in case JAXB cannot be initialized.
     * @throws XJdfParseException in case the document cannot be parsed.
     * @throws java.net.URISyntaxException in case the string is not a valid URI.
     */
    public XJdfDocument getXJdfDocument(String uri) throws XJdfInitException, XJdfParseException, URISyntaxException {
        return new XJdfDocument(getFile(uri));
    }

    /**
     * Returns an XJDF Document by uri.
     * @param uri The uri object.
     * @return The XJDF Document.
     *
     * @throws XJdfInitException in case JAXB cannot be initialized.
     * @throws XJdfParseException in case the document cannot be parsed.
     */
    public XJdfDocument getXJdfDocument(URI uri) throws XJdfInitException, XJdfParseException {
        return new XJdfDocument(getFile(uri));
    }

    /**
     * Returns the XJMF Root Message in the package.
     * @return The XJMF root message.
     *
     * @throws XJdfInitException in case JAXB cannot be initialized.
     * @throws XJdfParseException in case the message cannot be parsed.
     */
    public XJmfMessage getXJmfRoot() throws XJdfInitException, XJdfParseException {
        return new XJmfMessage(getFile(URI_ROOT_XJMF));
    }

    /**
     * Packages files to a zip archive.
     * @return The zip packaged files as byte array.
     */
    public byte[] packageFiles() throws IOException {
        return ZipArchive.write(files);
    }

    /**
     * Builder for {@link XJmfZipPackage} instances.
     */
    public static class Builder {

        private XJmfMessage xjmfRoot;

        private final Map<URI, XJdfDocument> xJdfDocumentMap;

        private final Map<URI, byte[]> fileMap;

        /**
         * Default constructor.
         */
        public Builder() {
            xJdfDocumentMap = new LinkedHashMap<>();
            fileMap = new LinkedHashMap<>();
        }

        /**
         * Sets the XJMF message that becomes {@code root.xjmf}.
         *
         * @param xJmfRoot The root XJMF message.
         *
         * @return This builder.
         */
        public Builder withXJmfRoot(XJmfMessage xJmfRoot) {
            this.xjmfRoot = xJmfRoot;
            return this;
        }

        /**
         * Adds an XJDF document to the package.
         *
         * @param uri The package entry name of the document.
         * @param xJdfDocument The document.
         *
         * @return This builder.
         */
        public Builder withXJdfDocument(URI uri, XJdfDocument xJdfDocument) {
            xJdfDocumentMap.put(uri, xJdfDocument);
            return this;
        }

        /**
         * Adds an XJDF document and all its referenced files to the package.
         *
         * <p>
         * The entries keep the entry names of the source package. Point
         * {@code QueueSubmissionParams/@URL} to {@link XJdfZipPackage#getXJdfUri()} to reference the document.
         * If an entry name is added twice, the later one wins.
         * </p>
         *
         * @param xJdfZipPackage The XJDF package to add.
         *
         * @return This builder.
         */
        public Builder withXJdfZipPackage(XJdfZipPackage xJdfZipPackage) {
            fileMap.putAll(xJdfZipPackage.getFiles());
            return this;
        }

        /**
         * Adds a binary file to the package.
         *
         * @param uri The package entry name of the file.
         * @param bytes The file content.
         *
         * @return This builder.
         */
        public Builder withFile(URI uri, byte[] bytes) {
            fileMap.put(uri, bytes);
            return this;
        }

        /**
         * Creates the package from the configured content.
         *
         * @return The new package.
         *
         * @throws XJdfValidationException in case the root message or a document is invalid.
         * @throws XJdfParseException in case the root message or a document cannot be serialized.
         */
        public XJmfZipPackage build() throws XJdfValidationException, XJdfParseException {
            return new XJmfZipPackage(xjmfRoot, xJdfDocumentMap, fileMap);
        }
    }
}
