package org.cip4.lib.xjdf.uri.resolver;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.net.URI;

import static org.junit.Assert.*;

public class AbsoluteURIPathResolverTest {

    private static final URI TEMP_DIR_URI = FileUtils.getTempDirectory().toURI();
    private static final URI LOCALHOST_URI = URI.create("http://localhost:8080/");

    @Test
    public void createAbsoluteURIPathResolver_LocalFileSystem() throws Exception {
        final URI resolvedUri = new AbsoluteURIPathResolver().resolve(
            TEMP_DIR_URI,
            "/pub/document-archives/xJdfSpec.pdf"
        );

        assertEquals("file:/pub/document-archives/xJdfSpec.pdf", resolvedUri.toString());
        assertTrue(resolvedUri.isAbsolute());
    }

    @Test
    public void createAbsoluteURIPathResolver_Http() throws Exception {
        final URI resolvedUri = new AbsoluteURIPathResolver().resolve(
            LOCALHOST_URI,
            "/pub/document-archives/xJdfSpec.pdf"
        );

        assertEquals("http://localhost:8080/pub/document-archives/xJdfSpec.pdf", resolvedUri.toString());
        assertTrue(resolvedUri.isAbsolute());
    }

    @Test
    public void canResolve() throws Exception {
        assertTrue(new AbsoluteURIPathResolver().canResolve("/pub/document-archives/xJdfSpec.pdf"));
    }
}