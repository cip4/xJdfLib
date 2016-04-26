package org.cip4.lib.xjdf.type;

import java.net.URISyntaxException;
import java.util.Objects;

/**
 * Implementation of the XJDF URI data type.
 */
public class URI extends AbstractXJdfType<String, URI> {

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
        this.sourceUri = null;
        this.stashedDestinationPath = null;
    }

    /**
     * Constructor. Using this constructor will not package the file.
     *
     * @param sourceUri Source uri of the file.
     */
    public URI(final java.net.URI sourceUri) {
        this.sourceUri = sourceUri.normalize();
        this.stashedDestinationPath = null;
    }

    /**
     * Constructor. Using this constructor the file will be packaged into given destination path.
     *
     * @param sourceUri Source uri.
     * @param destPath Destination path. Should be given in case the file has to be packaged.
     */
    public URI(final java.net.URI sourceUri, final String destPath) throws URISyntaxException {
        Objects.requireNonNull(destPath, "destPath must not be null");
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
    public final String marshal(final URI v) throws Exception {
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