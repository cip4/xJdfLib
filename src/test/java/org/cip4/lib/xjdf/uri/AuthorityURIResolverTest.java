package org.cip4.lib.xjdf.uri;

import org.junit.Test;

import java.net.URI;

import static org.junit.Assert.*;

public class AuthorityURIResolverTest {

    private static final URI LOCALHOST_URI = URI.create("https://localhost:8080/");

    @Test
    public void createAuthorityURIResolver_Http() throws Exception {
        final URI resolvedUri = new AuthorityURIResolver(LOCALHOST_URI).resolve(
            "//www.cip4.org/download/xJDF-2.0-Spec.pdf"
        );

        assertEquals("https://www.cip4.org/download/xJDF-2.0-Spec.pdf", resolvedUri.toString());
        assertTrue(resolvedUri.isAbsolute());
    }

    @Test
    public void toStringAuthorityURIResolver_Http() throws Exception {
        final String relativizedUriString = new AuthorityURIResolver(LOCALHOST_URI).relativize(
            new URI(
                "//www.cip4.org/download/xJDF-2.0-Spec.pdf"
            )
        );

        assertEquals("//www.cip4.org/download/xJDF-2.0-Spec.pdf", relativizedUriString);
    }

}