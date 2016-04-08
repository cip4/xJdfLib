package org.cip4.lib.xjdf.type;

import java.nio.file.Path;
import java.nio.file.Paths;

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
    private final Path destinationPath;

    /**
     * Constructor.
     */
    public URI() {
        this(null);
    }

    /**
     * Constructor. Using this constructor will prevent packaging the file.
     *
     * @param sourceUri Source uri of the file.
     */
    public URI(final java.net.URI sourceUri) {
        this(sourceUri, null);
    }

    /**
     * Constructor. Using this constructor the file will be packaged into given destination path.
     *
     * @param sourceUri Source uri.
     * @param destPath Destination path. Should be given in case the file has to be packaged.
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
