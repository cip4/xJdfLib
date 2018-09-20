package org.cip4.lib.xjdf.uri.relativizer;

import java.net.URI;

/**
 * Relativizer class which is responsible for relativizing uris with an absolute path.
 */
public class AbsoluteURIPathRelativizer implements URIRelativizerInterface {

    @Override
    public String relativize(final URI baseUri, final URI uri) {
        return uri.getPath();
    }
}
