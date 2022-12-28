package org.cip4.lib.xjdf;

import org.cip4.lib.xjdf.exception.XJdfInitException;
import org.cip4.lib.xjdf.exception.XJdfParseException;
import org.cip4.lib.xjdf.exception.XJdfValidationException;
import org.cip4.lib.xjdf.type.URI;
import org.jetbrains.annotations.NotNull;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/**
 * This class provides functionality all about packaging.
 */
public class ZipPackage {

    private final Map<URI, byte[]> files;

    private static final URI URI_ROOT_XJMF = initUriRootXJMF();

    /**
     * Initialize URI root XJMF.
     * @return The root xjmf name.
     */
    private static URI initUriRootXJMF() {
        try {
            return new URI("root.xjmf");

        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Default constructor.
     */
    public ZipPackage() {
        this.files = new HashMap<>();
    }

    /**
     * Custom constructor. <br />
     * Accepting a root XJMF and a map of XJDF Documents for initializing.
     *
     * @param rootJmf The root xjmf message.
     */
    public ZipPackage(XJmfMessage rootJmf)
        throws XJdfValidationException, XJdfParseException {
        this(rootJmf, new HashMap<>(), new HashMap<>());
    }

    /**
     * Custom constructor. <br />
     * Accepting a root XJMF and a map of XJDF Documents for initializing.
     *
     * @param rootJmf The root xjmf message.
     * @param xJdfDocuments Map of XJDF Documents
     */
    public ZipPackage(XJmfMessage rootJmf, @NotNull Map<URI, XJdfDocument> xJdfDocuments)
        throws XJdfValidationException, XJdfParseException {
        this(rootJmf, xJdfDocuments, new HashMap<>());
    }

    /**
     * Custom constructor. <br />
     * Accepting a root XJMF and a map of XJDF Documents for initializing.
     *
     * @param rootJmf The root xjmf message.
     * @param xJdfDocuments Map of XJDF Documents
     * @param files Map of files
     */
    public ZipPackage(XJmfMessage rootJmf, @NotNull Map<URI, XJdfDocument> xJdfDocuments, @NotNull Map<URI, byte[]> files)
        throws XJdfValidationException, XJdfParseException {
        this();

        this.files.put(URI_ROOT_XJMF, rootJmf.toXml());

        for(URI uri: xJdfDocuments.keySet()) {
            this.files.put(uri, xJdfDocuments.get(uri).toXml());
        }

        for(URI uri: files.keySet()) {
            this.files.put(uri, files.get(uri));
        }
    }

    /**
     * Custom constructor. <br />
     * Accepting a zip archive for initializing.
     */
    public ZipPackage(byte[] zipArchive) throws IOException, URISyntaxException {
        this();

        try (
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(zipArchive);
            ZipInputStream packageStream = new ZipInputStream(byteArrayInputStream)
        ) {
            ZipEntry entry = packageStream.getNextEntry();


            while (entry != null) {
                files.put(
                    new URI(entry.getName()),
                    packageStream.readAllBytes()
                );

                entry = packageStream.getNextEntry();
            }
        }
    }

    /**
     * Returns list of all files.
     * @return Set of file URIs.
     */
    public Set<URI> listFiles() {
        return files.keySet();
    }

    /**
     * Returns a file as byte array.
     * @param uri The uri as string.
     * @return The file as byte array.
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
     */
    public XJdfDocument getXJdfDocument(String uri) throws XJdfInitException, XJdfParseException, URISyntaxException {
        return new XJdfDocument(getFile(uri));
    }

    /**
     * Returns an XJDF Document by uri.
     * @param uri The uri object.
     * @return The XJDF Document.
     */
    public XJdfDocument getXJdfDocument(URI uri) throws XJdfInitException, XJdfParseException {
        return new XJdfDocument(getFile(uri));
    }

    /**
     * Returns the XJMF Root Message in the package.
     * @return The XJMF root message.
     */
    public XJmfMessage getXJmfRoot() throws XJdfInitException, XJdfParseException {
        return new XJmfMessage(getFile(URI_ROOT_XJMF));
    }

    /**
     * Packages files to a zip archive.
     * @return The zip packaged files as byte array.
     */
    public byte[] packageFiles() throws IOException {
        byte[] result;

        try (
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ZipOutputStream packageStream = new ZipOutputStream(byteArrayOutputStream)
        ) {

            for(URI uri: files.keySet()) {
                ZipEntry zipEntry = new ZipEntry(uri.toString());
                packageStream.putNextEntry(zipEntry);
                packageStream.write(files.get(uri));
                packageStream.closeEntry();
            }

            packageStream.close();
            result = byteArrayOutputStream.toByteArray();
        }

        // return zip archive
        return result;
    }
}
