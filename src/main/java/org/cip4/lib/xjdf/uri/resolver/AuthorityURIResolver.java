package org.cip4.lib.xjdf.uri.resolver;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Objects;

/**
 * Resolver class which is responsible for resolving uris with an authority/host part.
 */
class AuthorityURIResolver implements URIResolverInterface {

    /**
     * Creates a new AuthorityURIResolver.
     */
    AuthorityURIResolver() {
    }

    @Override
    public final URI resolve(final URI baseUri, final String uriString) throws URISyntaxException {
        Objects.requireNonNull(baseUri, "baseUri must not be null.");

        final URI tmpUri = new URI(uriString);

        return new URI(baseUri.getScheme(), tmpUri.getAuthority(), tmpUri.getPath(), null, null);
    }

    @Override
    public boolean canResolve(final String uriString) {
        return uriString.matches("^//\\p{ASCII}+");
    }
}
