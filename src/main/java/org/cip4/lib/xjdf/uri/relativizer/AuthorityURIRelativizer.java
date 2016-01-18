package org.cip4.lib.xjdf.uri.relativizer;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Objects;

/**
 * Relativizer class which is responsible for resolving uris with an authority/host part.
 */
public class AuthorityURIRelativizer implements URIRelativizerInterface {

    @Override
    public String relativize(final URI baseUri, final URI uri) throws URISyntaxException {
        return String.format(
            "//%s%s",
            uri.getAuthority(),
            Objects.toString(uri.getPath(), "")
        );
    }
}
