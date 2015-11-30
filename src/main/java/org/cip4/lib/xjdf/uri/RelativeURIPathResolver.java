package org.cip4.lib.xjdf.uri;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * Resolver class which is responsible for resolving uris with an relative path.
 */
public class RelativeURIPathResolver extends AbstractURIResolver {

    /**
     * Creates a RelativeURIPathResolver.
     *
     * @param baseUri The base uri.
     */
    public RelativeURIPathResolver(final URI baseUri) {
        super(baseUri);
    }

    @Override
    public URI resolve(final String uriString) throws URISyntaxException {
        return getBaseUri().resolve(uriString).normalize();
    }

    @Override
    public String toString(final URI uri) throws URISyntaxException {
        String uriPath = getBaseUri().relativize(uri).normalize().getPath();
        if (uriPath.startsWith("/")) {
            uriPath = uriPath.substring(1);
        }
        return uriPath;
    }
}
