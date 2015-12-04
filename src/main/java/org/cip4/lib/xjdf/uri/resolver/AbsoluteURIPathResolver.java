package org.cip4.lib.xjdf.uri.resolver;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Objects;

/**
 * Resolver class which is responsible for resolving uris with an absolute path.
 */
class AbsoluteURIPathResolver implements URIResolverInterface {

    /**
     * Creates a AbsoluteURIPathResolver.
     */
    AbsoluteURIPathResolver() {
    }

    @Override
    public final URI resolve(final URI baseUri, final String uriString) throws URISyntaxException {
        Objects.requireNonNull(baseUri, "baseUri must not be null.");

        final URI tmpUri = new URI(uriString);

        return new URI(baseUri.getScheme(), baseUri.getAuthority(), tmpUri.getPath(), null, null);
    }

    @Override
    public boolean canResolve(final String uriString) {
        return uriString.startsWith("/");
    }
}
