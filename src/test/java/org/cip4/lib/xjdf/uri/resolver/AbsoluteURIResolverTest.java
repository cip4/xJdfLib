package org.cip4.lib.xjdf.uri.resolver;

import org.junit.jupiter.api.Test;

import java.net.URI;

import static org.junit.jupiter.api.Assertions.*;

public class AbsoluteURIResolverTest {

    @Test
    public void createAbsoluteURIResolver_LocalFileSystem() throws Exception {
        final URI resolvedUri = new AbsoluteURIResolver().resolve(
            null,
            "file:///C:/Documents%20and%20Settings/cip4/xJdfSpec.pdf"
        );

        assertEquals("file:///C:/Documents%20and%20Settings/cip4/xJdfSpec.pdf", resolvedUri.toString());
        assertTrue(resolvedUri.isAbsolute());
    }

    @Test
    public void createAbsoluteURIResolver_Http() throws Exception {
        final URI resolvedUri = new AbsoluteURIResolver().resolve(
            null,
            "https://confluence.cip4.org/download/attachments/688513/XJDF-2.0-DRAFT-2015-10-16-BLD19.pdf?api=v2"
        );

        assertEquals(
            "https://confluence.cip4.org/download/attachments/688513/XJDF-2.0-DRAFT-2015-10-16-BLD19.pdf?api=v2",
            resolvedUri.toString()
        );
        assertTrue(resolvedUri.isAbsolute());
    }

    @Test
    public void canResolve() throws Exception {
        assertTrue(new AbsoluteURIResolver().canResolve("http://localhost:8080/pub/document-archives/xJdfSpec.pdf"));
    }

    @Test
    public void canNotResolve_AbsoluteURIPath() throws Exception {
        assertFalse(
            new AbsoluteURIResolver().canResolve("/pub/document-archives/xJdfSpec.pdf")
        );
    }

    @Test
    public void canNotResolve_AuthorityURI() throws Exception {
        assertFalse(
            new AbsoluteURIResolver().canResolve("//cip4@localhost:8080/pub/document-archives/xJdfSpec.pdf")
        );
    }

    @Test
    public void canNotResolve_RelativeURI() throws Exception {
        assertFalse(new AbsoluteURIResolver().canResolve("pub/document-archives/xJdfSpec.pdf"));
    }
}