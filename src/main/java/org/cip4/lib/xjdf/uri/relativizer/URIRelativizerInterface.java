package org.cip4.lib.xjdf.uri.relativizer;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * Interface for classes relativizing a uri.
 */
interface URIRelativizerInterface {

    /**
     * Relativize the given uri against the base uri.
     *
     * @param baseUri The base uri to relativize against.
     * @param uri The uri to relativize.
     *
     * @return The relativized string.
     *
     * @throws URISyntaxException If the uri could not be relativized.
     */
    String relativize(final URI baseUri, final URI uri) throws URISyntaxException;
}
