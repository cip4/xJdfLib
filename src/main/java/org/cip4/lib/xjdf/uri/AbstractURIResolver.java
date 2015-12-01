package org.cip4.lib.xjdf.uri;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * Base class for classes resolving an uri.
 */
public abstract class AbstractURIResolver {

    /**
     * The base uri.
     */
    private final URI baseUri;

    /**
     * Constructor.
     *
     * @param baseUri The base uri.
     */
    public AbstractURIResolver(final URI baseUri) {
        this.baseUri = baseUri;
    }

    /**
     * Resolves the given string against the base uri.
     * This method should always return an absolute uri.
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
     * Gets the base uri.
     *
     * @return The base uri.
     */
    public final URI getBaseUri() {
        return baseUri;
    }

    /**
     * Creates the most suitable implementation of an AbstractURIResolver.
     *
     * See the xJDF specification
     *  <i>Appendix: Resolving RunList/@Directory and FileSpec/@URL URI References</i>
     * for further details.
     *
     * @param baseUri The base uri used to resolve against.
     * @param uriString The uri used for resolving.
     *
     * @return The created AbstractURIResolver.
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
