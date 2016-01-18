package org.cip4.lib.xjdf.uri.resolver;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * Interface for classes resolving a uri.
 */
interface URIResolverInterface {

    /**
     * Resolves the given string against the base uri.
     * This method should always return an absolute uri.
     *
     * @param uriString The uri string to resolve.
     *
     * @return The resolved uri.
     *
     * @throws URISyntaxException If the string could not be resolved.
     */
    URI resolve(final URI baseUri, final String uriString) throws URISyntaxException;

    /**
     * Checks if the given uri string can be resolved against the given base uri.
     *
     * @param uriString The uri string to resolve.
     *
     * @return True if the uri could be resolved, false otherwise.
     */
    boolean canResolve(final String uriString);
}
