package org.cip4.lib.xjdf.uri;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * Resolver class which is responsible for resolving absolute uris.
 */
public class AbsoluteURIResolver extends AbstractURIResolver {

    /**
     * Creates a new AbsoluteURIResolver.
     */
    public AbsoluteURIResolver() {
        super(null);
    }

    @Override
    public String toString(final URI uri) throws URISyntaxException {
        return uri.toString();
    }

    @Override
    public URI resolve(final String uriString) throws URISyntaxException {
        return new URI(uriString);
    }

}
