package org.cip4.lib.xjdf.uri;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Objects;

/**
 * Resolver class which is responsible for resolving uris with an authority/host part.
 */
public class AuthorityURIResolver extends AbstractURIResolver {

    /**
     * Creates a new AuthorityURIResolver.
     *
     * @param baseUri The base uri.
     */
    public AuthorityURIResolver(final URI baseUri) {
        super(baseUri);
    }

    @Override
    public URI resolve(final String uriString) throws URISyntaxException {
        final URI tmpUri = new URI(uriString);

        return new URI(getBaseUri().getScheme(), tmpUri.getAuthority(), tmpUri.getPath(), null, null);
    }

    @Override
    public String toString(final URI uri) throws URISyntaxException {
        return String.format(
            "//%s%s",
            uri.getAuthority(),
            Objects.toString(uri.getPath(), "")
        );
    }

}
