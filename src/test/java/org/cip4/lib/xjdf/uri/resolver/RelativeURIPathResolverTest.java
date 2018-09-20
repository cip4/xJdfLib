package org.cip4.lib.xjdf.uri.resolver;

import org.junit.jupiter.api.Test;

import java.net.URI;

import static org.junit.jupiter.api.Assertions.*;

public class RelativeURIPathResolverTest {

    private static final URI HOME_DIR_URI = URI.create("file:/home/cip4/");
    private static final URI LOCALHOST_URI = URI.create("http://localhost:8080/cip4/");

    @Test
    public void createRelativeURIPathResolver_LocalFileSystem() throws Exception {
        final URI resolvedUri = new RelativeURIPathResolver().resolve(
            HOME_DIR_URI,
            "pub/document-archives/xJdfSpec.pdf"
        );

        assertEquals(
            "file:/home/cip4/pub/document-archives/xJdfSpec.pdf",
            resolvedUri.toString()
        );
        assertTrue(resolvedUri.isAbsolute());
    }

    @Test
    public void createRelativeURIPathResolver_Http() throws Exception {
        final URI resolvedUri = new RelativeURIPathResolver().resolve(
            LOCALHOST_URI,
            "pub/document-archives/xJdfSpec.pdf"
        );

        assertEquals(
            "http://localhost:8080/cip4/pub/document-archives/xJdfSpec.pdf",
            resolvedUri.toString()
        );
        assertTrue(resolvedUri.isAbsolute());
    }

    @Test
    public void canResolve() {
        assertTrue(new RelativeURIPathResolver().canResolve("pub/document-archives/xJdfSpec.pdf"));
    }

    @Test
    public void canResolve_AbsoluteURI() {
        assertTrue(
            new RelativeURIPathResolver().canResolve("http://localhost:8080/pub/document-archives/xJdfSpec.pdf")
        );
    }

    @Test
    public void canResolve_AbsoluteURIPath() {
        assertTrue(new RelativeURIPathResolver().canResolve("/pub/document-archives/xJdfSpec.pdf"));
    }

    @Test
    public void canResolve_AuthorityURI() {
        assertTrue(
            new RelativeURIPathResolver().canResolve("//cip4@localhost:8080/pub/document-archives/xJdfSpec.pdf")
        );
    }
}