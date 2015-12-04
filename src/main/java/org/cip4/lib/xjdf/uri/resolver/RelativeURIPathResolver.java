package org.cip4.lib.xjdf.uri.resolver;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Objects;

/**
 * Resolver class which is responsible for resolving uris with an relative path.
 */
class RelativeURIPathResolver implements URIResolverInterface {

    /**
     * Creates a RelativeURIPathResolver.
     */
    RelativeURIPathResolver() {
    }

    @Override
    public final URI resolve(final URI baseUri, final String uriString) throws URISyntaxException {
        Objects.requireNonNull(baseUri, "baseUri must not be null.");

        return baseUri.resolve(new URI(uriString)).normalize();
    }

    @Override
    public boolean canResolve(final String uriString) {
        return true;
    }
}
