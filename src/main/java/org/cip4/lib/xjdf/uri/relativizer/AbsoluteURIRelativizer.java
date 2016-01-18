package org.cip4.lib.xjdf.uri.relativizer;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * Relativizer class which is responsible for relativizing absolute uris.
 */
public class AbsoluteURIRelativizer implements URIRelativizerInterface {

    @Override
    public String relativize(final URI baseUri, final URI uri) throws URISyntaxException {
        return uri.toString();
    }
}
