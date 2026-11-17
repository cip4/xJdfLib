package org.cip4.lib.xjdf.type;


import java.net.URISyntaxException;

/**
 * Implementation of the XJDF URI data type.
 */
public final class URI extends AbstractXJdfType<String, URI> {

    private static final long serialVersionUID = 1L;

    /**
     * Source uri.
     */
    private final java.net.URI uri;

    /**
     * Default Constructor.
     */
    public URI() {
        this.uri = null;
    }

    /**
     * Creates a URI from a string. The value is normalized.
     *
     * @param uri The URI string.
     *
     * @throws java.net.URISyntaxException in case the value is not a valid URI.
     */
    public URI(final String uri) throws URISyntaxException {
        this(new java.net.URI(uri));
    }

    /**
     * Creates a URI from a Java URI. The value is normalized.
     *
     * @param uri Source uri of the file, may be null.
     */
    public URI(final java.net.URI uri) {
        this.uri = uri == null ? null : uri.normalize();
    }

    /**
     * Get the source uri.
     *
     * @return Source uri.
     */
    public final java.net.URI getUri() {
        return uri;
    }

    /**
     * Returns the URI as a string.
     *
     * @param v The URI to serialize.
     *
     * @return The URI string, or null in case the value is null.
     */
    @Override
    public final String marshal(final URI v) {
        if (v == null) {
            return null;
        }
        return v.toString();
    }

    /**
     * Parses a URI string.
     *
     * @param value The URI string.
     *
     * @return The parsed URI.
     *
     * @throws Exception in case the value is not a valid URI.
     */
    @Override
    public final URI unmarshal(final String value) throws Exception {
        return new URI(new java.net.URI(value));
    }

    /**
     * Returns the normalized URI as a string, or an empty string for the default instance.
     *
     * @return The URI string.
     */
    @Override
    public final String toString() {
        return uri == null ? "" : uri.toString();
    }
}
