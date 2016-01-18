package org.cip4.lib.xjdf.uri.relativizer;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * Relativizer class which is responsible for relativizing uris with an relative path.
 */
public class RelativeURIPathRelativizer implements URIRelativizerInterface {

    @Override
    public String relativize(final URI baseUri, final URI uri) throws URISyntaxException {
        String uriPath = baseUri.relativize(uri).normalize().getPath();
        if (uriPath.startsWith("/")) {
            uriPath = uriPath.substring(1);
        }
        return uriPath;
    }
}
