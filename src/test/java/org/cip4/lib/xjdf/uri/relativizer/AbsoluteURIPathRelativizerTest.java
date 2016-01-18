package org.cip4.lib.xjdf.uri.relativizer;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.net.URI;

import static org.junit.Assert.*;

public class AbsoluteURIPathRelativizerTest {

    private static final URI TEMP_DIR_URI = FileUtils.getTempDirectory().toURI();
    private static final URI LOCALHOST_URI = URI.create("http://localhost:8080/");

    @Test
    public void relativizeAbsoluteURIPathResolver_LocalFileSystem() throws Exception {
        final String relativizedUriString = new AbsoluteURIPathRelativizer().relativize(
            TEMP_DIR_URI,
            new URI(
                "file:/pub/document-archives/xJdfSpec.pdf"
            )
        );

        assertEquals("/pub/document-archives/xJdfSpec.pdf", relativizedUriString);
    }

    @Test
    public void relativizeAbsoluteURIPathRelativizer_Http() throws Exception {
        final String relativizedUriString = new AbsoluteURIPathRelativizer().relativize(
            LOCALHOST_URI,
            new URI(
                "http://localhost:8080/pub/document-archives/xJdfSpec.pdf"
            )
        );

        assertEquals("/pub/document-archives/xJdfSpec.pdf", relativizedUriString);
    }
}