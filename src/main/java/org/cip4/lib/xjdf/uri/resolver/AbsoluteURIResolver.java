package org.cip4.lib.xjdf.uri.resolver;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * Resolver class which is responsible for resolving absolute uris.
 */
class AbsoluteURIResolver implements URIResolverInterface {

    /**
     * Creates a new AbsoluteURIResolver.
     */
    AbsoluteURIResolver() {
    }

    @Override
    public final URI resolve(final URI baseUri, final String uriString) throws URISyntaxException {
        return new URI(uriString);
    }

    @Override
    public boolean canResolve(final String uriString) {
        return uriString.matches("^[a-z]+:\\p{ASCII}*");
    }
}
