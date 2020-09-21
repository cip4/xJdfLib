package org.cip4.lib.xjdf.type;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.util.Objects;

/**
 * Implementation of the XJDF URI data type.
 */
public class URI extends AbstractXJdfType<String, URI> {

    /**
     * The source as input stream.
     */
    private final InputStream sourceInputStream;

    /**
     * Source uri.
     */
    private final java.net.URI sourceUri;

    /**
     * Destination path.
     */
    private String destinationPath;

    /**
     * The stashed destination path.
     */
    private final String stashedDestinationPath;

    /**
     * Constructor.
     */
    public URI() {
        this.sourceInputStream = null;
        this.sourceUri = null;
        this.stashedDestinationPath = null;
    }

    /**
     * Constructor. Using this constructor will not package the file.
     *
     * @param sourceUri Source uri of the file.
     */
    public URI(final java.net.URI sourceUri) {
        this.sourceInputStream = null;
        this.sourceUri = sourceUri.normalize();
        this.stashedDestinationPath = null;
    }

    /**
     * Constructor. Using this constructor the file will be packaged into given destination path.
     *
     * @param sourceUri Source uri.
     * @param destPath  Destination path. Should be given in case the file has to be packaged.
     */
    public URI(final java.net.URI sourceUri, final String destPath) throws URISyntaxException {
        this(sourceUri, null, destPath);
    }

    /**
     * Constructor. Using this constructor the file will be packaged into given destination path.
     *
     * @param source   The Source as bytes.
     * @param destPath Destination path. Should be given in case the file has to be packaged.
     */
    public URI(final byte[] source, final String destPath) throws URISyntaxException {
        this(new ByteArrayInputStream(source), destPath);
    }

    /**
     * Constructor. Using this constructor the file will be packaged into given destination path.
     *
     * @param source   The Source as InputStream.
     * @param destPath Destination path. Should be given in case the file has to be packaged.
     */
    public URI(final InputStream source, final String destPath) throws URISyntaxException {
        this(new java.net.URI(destPath), source, destPath);
    }

    /**
     * Constructor. Using this constructor the file will be packaged into given destination path.
     *
     * @param sourceUri         Source uri.
     * @param sourceInputStream Source input stream.
     * @param destPath          Destination path. Should be given in case the file has to be packaged.
     */
    private URI(final java.net.URI sourceUri, InputStream sourceInputStream, final String destPath)
        throws URISyntaxException {
        Objects.requireNonNull(destPath, "destPath must not be null");
        this.sourceInputStream = sourceInputStream;
        this.sourceUri = sourceUri.normalize();
        this.stashedDestinationPath = new java.net.URI(null, null, destPath, null).normalize().getPath();
    }

    /**
     * Get the source uri.
     *
     * @return Source uri.
     */
    public final java.net.URI getSourceUri() {
        return sourceUri;
    }

    /**
     * Get the source input stream.
     *
     * @return Source input stream.
     */
    public final InputStream getSourceInputStream() {
        return sourceInputStream;
    }

    /**
     * Get the destination path.
     *
     * @return Destination path
     */
    public final String getDestinationPath() {
        return destinationPath;
    }

    /**
     * Completes this URI in order to marshal the correct file reference.
     *
     * @return This URI
     */
    public final URI complete() {
        this.destinationPath = stashedDestinationPath;
        return this;
    }

    @Override
    public final String marshal(final URI v) {
        if (v == null) {
            return null;
        }
        return v.destinationPath == null
            ? v.sourceUri.toString()
            : v.destinationPath;
    }

    @Override
    public final URI unmarshal(final String v) throws Exception {
        final java.net.URI source = new java.net.URI(v);
        if (source.isAbsolute()) {
            return new URI(source);
        } else {
            return new URI(source, source.getPath());
        }
    }

    @Override
    public final String toString() {
        return "URI{" + "sourceUri=" + sourceUri + ", destinationPath=" + destinationPath + '}';
    }
}