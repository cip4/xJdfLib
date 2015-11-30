package org.cip4.lib.xjdf.uri;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * Base class for all concrete classes which are used to resolve an uri.
 */
public abstract class AbstractURIResolver {

    /**
     * The base uri to resolve against.
     */
    private final URI baseUri;

    /**
     * Base constructor for implementations.
     *
     * @param baseUri The base uri.
     */
    public AbstractURIResolver(final URI baseUri) {
        this.baseUri = baseUri;
    }

    /**
     * Resolves the given string against the base uri.
     *
     * @param uriString The string to resolve.
     *
     * @return The resolved uri.
     *
     * @throws URISyntaxException If the string could not be resolved.
     */
    public abstract URI resolve(final String uriString) throws URISyntaxException;

    /**
     * Relativize the given uri against the base uri.
     *
     * @param uri The uri to relativize.
     *
     * @return The relativized string.
     *
     * @throws URISyntaxException If the uri could not be relativized.
     */
    public abstract String toString(final URI uri) throws URISyntaxException;

    /**
     * Returns the base uri.
     *
     * @return The base uri.
     */
    public final URI getBaseUri() {
        return baseUri;
    }

    /**
     * Autodetect the most suitable implementation of AbstractURIResolver and return a new instance.
     *
     * @param baseUri The base uri used to resolve against.
     * @param uriString The uri used for resolving.
     *
     * @return The most suitable AbstractURIResolver.
     */
    public static AbstractURIResolver create(final URI baseUri, final String uriString) {
        // Pattern 1
        if (uriString.matches("^[a-z]+:\\p{ASCII}*")) {
            return new AbsoluteURIResolver();
        }

        // Pattern 2
        if (uriString.startsWith("//")) {
            return new AuthorityURIResolver(baseUri);
        }

        // Pattern 3
        if (uriString.startsWith("/")) {
            return new AbsoluteURIPathResolver(baseUri);
        }

        // Pattern 4
        return new RelativeURIPathResolver(baseUri);
    }

}
