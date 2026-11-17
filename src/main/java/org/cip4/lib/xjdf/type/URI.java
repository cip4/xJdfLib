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
     * Custom Constructor.
     * Using this constructor will not package the file.
     *
     * @param uri The uri of the file.
     */
    public URI(final String uri) throws URISyntaxException {
        this(new java.net.URI(uri));
    }

    /**
     * Custom Constructor.
     * Using this constructor will not package the file.
     *
     * @param uri Source uri of the file.
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

    @Override
    public final String marshal(final URI v) {
        if (v == null) {
            return null;
        }
        return v.toString();
    }

    @Override
    public final URI unmarshal(final String value) throws Exception {
        return new URI(new java.net.URI(value));
    }

    @Override
    public final String toString() {
        return uri == null ? "" : uri.toString();
    }
}
