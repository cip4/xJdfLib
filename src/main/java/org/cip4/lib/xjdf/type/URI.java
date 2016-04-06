package org.cip4.lib.xjdf.type;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Adapter for the file references within XJDF context.
 */
public class URI extends AbstractXJdfType<String, URI> {

    /**
     * Source uri.
     */
    private final java.net.URI sourceUri;

    /**
     * Destination path.
     */
    private final Path destinationPath;

    /**
     * Constructor.
     */
    public URI() {
        this(null);
    }

    /**
     * Constructor.
     *
     * @param sourceUri Source uri.
     */
    public URI(final java.net.URI sourceUri) {
        this(sourceUri, null);
    }

    /**
     * Constructor.
     *
     * @param sourceUri Source uri.
     * @param destPath Destination path.
     */
    public URI(final java.net.URI sourceUri, final Path destPath) {
        this.sourceUri = sourceUri;
        this.destinationPath = destPath;
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
    public final Path getDestinationPath() {
        return destinationPath;
    }

    @Override
    public final String marshal(final URI v) throws Exception {
        if (v == null) {
            return null;
        }
        return v.destinationPath == null
            ? v.sourceUri.toString()
            : v.destinationPath.toString();
    }

    @Override
    public final URI unmarshal(final String v) throws Exception {
        final java.net.URI source = new java.net.URI(v);
        if (source.isAbsolute()) {
            return new URI(source);
        } else {
            return new URI(source, Paths.get(source.getPath()));
        }
    }

    @Override
    public final String toString() {
        return "URI{" + "sourceUri=" + sourceUri + ", destinationPath=" + destinationPath + '}';
    }
}
