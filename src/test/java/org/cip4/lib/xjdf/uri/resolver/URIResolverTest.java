package org.cip4.lib.xjdf.uri.resolver;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.net.URI;

import static org.junit.Assert.*;

public class URIResolverTest {

    private static final URI TEMP_DIR_URI = FileUtils.getTempDirectory().toURI();
    private static final URI LOCALHOST_URI = URI.create("http://localhost:8080/");

    @Test
    public void resolveAbsoluteURI_LocalFileSystem() throws Exception {
        final URI resolvedURI = URIResolver.resolve(
            null,
            "file:///C:/Documents%20and%20Settings/cip4/xJdfSpec.pdf"
        );
        assertEquals(URI.create("file:///C:/Documents%20and%20Settings/cip4/xJdfSpec.pdf"), resolvedURI);
    }

    @Test
    public void resolveAbsoluteURI_Http() throws Exception {
        final URI resolvedURI = URIResolver.resolve(
            null,
            "https://confluence.cip4.org/download/attachments/688513/XJDF-2.0-DRAFT-2015-10-16-BLD19.pdf?api=v2"
        );
        assertEquals(
            URI.create(
                "https://confluence.cip4.org/download/attachments/688513/XJDF-2.0-DRAFT-2015-10-16-BLD19.pdf?api=v2"
            ),
            resolvedURI
        );
    }

    @Test
    public void resolveAuthorityURI() throws Exception {
        final URI resolvedURI = URIResolver.resolve(LOCALHOST_URI, "//www.cip4.org");
        assertEquals(URI.create("http://www.cip4.org"), resolvedURI);
    }

    @Test
    public void resolveAbsoluteURIPath_LocalFileSystem() throws Exception {
        final URI resolvedURI = URIResolver.resolve(TEMP_DIR_URI, "/cip4/xJdfSpec.pdf");
        assertEquals(URI.create("file:///cip4/xJdfSpec.pdf"), resolvedURI);
    }

    @Test
    public void resolveAbsoluteURIPath_Http() throws Exception {
        final URI resolvedURI = URIResolver.resolve(LOCALHOST_URI, "/cip4/xJdfSpec.pdf");
        assertEquals(URI.create("http://localhost:8080/cip4/xJdfSpec.pdf"), resolvedURI);
    }

    @Test
    public void resolveRelativeURIPath_LocalFileSystem() throws Exception {
        final URI resolvedURI = URIResolver.resolve(TEMP_DIR_URI, "cip4/xJdfSpec.pdf");
        assertEquals(TEMP_DIR_URI.resolve("cip4/xJdfSpec.pdf"), resolvedURI);
    }

    @Test
    public void resolveRelativeURIPath_Http() throws Exception {
        final URI resolvedURI = URIResolver.resolve(LOCALHOST_URI, "cip4/xJdfSpec.pdf");
        assertEquals(URI.create("http://localhost:8080/cip4/xJdfSpec.pdf"), resolvedURI);
    }
}