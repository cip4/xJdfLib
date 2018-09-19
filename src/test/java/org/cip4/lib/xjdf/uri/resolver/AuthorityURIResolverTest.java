package org.cip4.lib.xjdf.uri.resolver;

import org.junit.jupiter.api.Test;

import java.net.URI;

import static org.junit.jupiter.api.Assertions.*;

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
    public void canResolve() {
        assertTrue(new AuthorityURIResolver().canResolve("//cip4@localhost:8080/pub/document-archives/xJdfSpec.pdf"));
    }

    @Test
    public void canNotResolve_AbsoluteURI() {
        assertFalse(
            new AuthorityURIResolver().canResolve("http://localhost:8080/pub/document-archives/xJdfSpec.pdf")
        );
    }

    @Test
    public void canNotResolve_AbsoluteURIPath() {
        assertFalse(
            new AuthorityURIResolver().canResolve("/pub/document-archives/xJdfSpec.pdf")
        );
    }

    @Test
    public void canNotResolve_RelativeURI() {
        assertFalse(new AuthorityURIResolver().canResolve("pub/document-archives/xJdfSpec.pdf"));
    }
}