package org.cip4.lib.xjdf.uri;

import org.junit.Test;

import java.net.URI;

import static org.junit.Assert.*;

public class RelativeURIPathResolverTest {

    private static final URI HOME_DIR_URI = URI.create("file:/home/cip4/");
    private static final URI LOCALHOST_URI = URI.create("http://localhost:8080/cip4/");

    @Test
    public void createRelativeURIPathResolver_LocalFileSystem() throws Exception {
        final URI resolvedUri = new RelativeURIPathResolver(HOME_DIR_URI).resolve(
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
        final URI resolvedUri = new RelativeURIPathResolver(LOCALHOST_URI).resolve(
            "pub/document-archives/xJdfSpec.pdf"
        );

        assertEquals(
            "http://localhost:8080/cip4/pub/document-archives/xJdfSpec.pdf",
            resolvedUri.toString()
        );
        assertTrue(resolvedUri.isAbsolute());
    }

    @Test
    public void toStringRelativeURIPathResolver_LocalFileSystem() throws Exception {
        final String resolvedUriString = new RelativeURIPathResolver(HOME_DIR_URI).relativize(
            new URI(
                "pub/document-archives/xJdfSpec.pdf"
            )
        );

        assertEquals("pub/document-archives/xJdfSpec.pdf", resolvedUriString);
    }

    @Test
    public void toStringRelativeURIPathResolver_Http() throws Exception {
        final String resolvedUriString = new RelativeURIPathResolver(LOCALHOST_URI).relativize(
            new URI(
                "pub/document-archives/xJdfSpec.pdf"
            )
        );

        assertEquals("pub/document-archives/xJdfSpec.pdf", resolvedUriString);
    }

}