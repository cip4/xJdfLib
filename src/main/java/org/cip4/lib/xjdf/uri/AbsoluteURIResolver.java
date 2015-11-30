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
    protected String toString(final URI uri) throws URISyntaxException {
        return uri.toString();
    }

    @Override
    protected URI resolve(final String uriString) throws URISyntaxException {
        return new URI(uriString);
    }

}
