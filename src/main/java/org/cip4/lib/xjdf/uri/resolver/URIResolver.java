package org.cip4.lib.xjdf.uri.resolver;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Base class for classes resolving a uri.
 */
public final class URIResolver {

    /**
     * A list of URIResolverInterfaces used to resolve a uri.
     */
    private static final List<URIResolverInterface> URI_RESOLVER_LIST = Arrays.asList(
        new AbsoluteURIResolver(),
        new AuthorityURIResolver(),
        new AbsoluteURIPathResolver(),
        new RelativeURIPathResolver()
    );

    /**
     * Creates an absolute uri based on the passed arguments.
     *
     * See the xJDF specification
     *  <i>Appendix: Resolving RunList/@Directory and FileSpec/@URL URI References</i>
     * for further details.
     *
     * @param baseUri The base uri to resolve against.
     * @param uriString The uri to resolve.
     *
     * @return The resolved uri.
     */
    public static URI resolve(final URI baseUri, final String uriString) throws URISyntaxException {
        Objects.requireNonNull(uriString, "Parameter uriString must not be null");

        for (final URIResolverInterface uriResolver : URI_RESOLVER_LIST) {
            if (uriResolver.canResolve(uriString)) {
                return uriResolver.resolve(baseUri, uriString);
            }
        }

        throw new RuntimeException(
            String.format(
                "No resolver can resolve the passed URI '%s' against the base URI '%s'.",
                uriString,
                baseUri
            )
        );
    }
}