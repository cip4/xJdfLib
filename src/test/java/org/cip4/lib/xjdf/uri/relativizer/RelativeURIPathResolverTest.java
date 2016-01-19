package org.cip4.lib.xjdf.uri.relativizer;

import org.junit.Test;

import java.net.URI;

import static org.junit.Assert.*;

public class RelativeURIPathResolverTest {

    private static final URI HOME_DIR_URI = URI.create("file:/home/cip4/");
    private static final URI LOCALHOST_URI = URI.create("http://localhost:8080/cip4/");

    @Test
    public void relativizeRelativeURIPathResolver_LocalFileSystem() throws Exception {
        final String resolvedUriString = new RelativeURIPathRelativizer().relativize(
            HOME_DIR_URI,
            new URI(
                "pub/document-archives/xJdfSpec.pdf"
            )
        );

        assertEquals("pub/document-archives/xJdfSpec.pdf", resolvedUriString);
    }

    @Test
    public void relativizeRelativeURIPathResolver_Http() throws Exception {
        final String resolvedUriString = new RelativeURIPathRelativizer().relativize(
            LOCALHOST_URI,
            new URI(
                "pub/document-archives/xJdfSpec.pdf"
            )
        );

        assertEquals("pub/document-archives/xJdfSpec.pdf", resolvedUriString);
    }

}