package org.cip4.lib.xjdf.uri.resolver;

import org.junit.Test;

import java.net.URI;

import static org.junit.Assert.*;

public class AuthorityURIResolverTest {

    private static final URI LOCALHOST_URI = URI.create("https://localhost:8080/");

    @Test
    public void createAuthorityURIResolver_Http() throws Exception {
        final URI resolvedUri = new AuthorityURIResolver().resolve(
            LOCALHOST_URI,
            "//www.cip4.org/download/xJDF-2.0-Spec.pdf"
        );

        assertEquals("https://www.cip4.org/download/xJDF-2.0-Spec.pdf", resolvedUri.toString());
        assertTrue(resolvedUri.isAbsolute());
    }

    @Test
    public void canResolve() throws Exception {
        assertTrue(new AuthorityURIResolver().canResolve("//cip4@localhost:8080/pub/document-archives/xJdfSpec.pdf"));
    }
}