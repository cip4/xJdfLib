package org.cip4.lib.xjdf.uri;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.net.URI;

import static org.junit.Assert.*;

public class AbsoluteURIPathResolverTest {

    private static final URI TEMP_DIR_URI = FileUtils.getTempDirectory().toURI();
    private static final URI LOCALHOST_URI = URI.create("http://localhost:8080/");

    @Test
    public void createAbsoluteURIPathResolver_LocalFileSystem() throws Exception {
        final URI resolvedUri = new AbsoluteURIPathResolver(TEMP_DIR_URI).resolve(
            "/pub/document-archives/xJdfSpec.pdf"
        );

        assertEquals("file:/pub/document-archives/xJdfSpec.pdf", resolvedUri.toString());
        assertTrue(resolvedUri.isAbsolute());
    }

    @Test
    public void createAbsoluteURIPathResolver_Http() throws Exception {
        final URI resolvedUri = new AbsoluteURIPathResolver(LOCALHOST_URI).resolve(
            "/pub/document-archives/xJdfSpec.pdf"
        );

        assertEquals("http://localhost:8080/pub/document-archives/xJdfSpec.pdf", resolvedUri.toString());
        assertTrue(resolvedUri.isAbsolute());
    }

    @Test
    public void toStringAbsoluteURIPathResolver_LocalFileSystem() throws Exception {
        final String relativizedUriString = new AbsoluteURIPathResolver(TEMP_DIR_URI).toString(
            new URI(
                "file:/pub/document-archives/xJdfSpec.pdf"
            )
        );

        assertEquals("/pub/document-archives/xJdfSpec.pdf", relativizedUriString);
    }

    @Test
    public void toStringAbsoluteURIPathResolver_Http() throws Exception {
        final String relativizedUriString = new AbsoluteURIPathResolver(LOCALHOST_URI).toString(
            new URI(
                "http://localhost:8080/pub/document-archives/xJdfSpec.pdf"
            )
        );

        assertEquals("/pub/document-archives/xJdfSpec.pdf", relativizedUriString);
    }
}