package org.cip4.lib.xjdf.uri;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Objects;

/**
 * Resolver class which is responsible for resolving uris with an absolute path.
 */
public class AbsoluteURIPathResolver extends AbstractURIResolver {

    /**
     * Creates a AbsoluteURIPathResolver.
     *
     * @param baseUri The base uri.
     */
    public AbsoluteURIPathResolver(final URI baseUri) {
        super(Objects.requireNonNull(baseUri, "baseUri must not be null."));
    }

    @Override
    public URI resolve(final String uriString) throws URISyntaxException {
        final URI tmpUri = new URI(uriString);
        final URI baseUri = getBaseUri();

        return new URI(baseUri.getScheme(), baseUri.getAuthority(), tmpUri.getPath(), null, null);
    }

    @Override
    public String relativize(final URI uri) throws URISyntaxException {
        return uri.getPath();
    }
}
