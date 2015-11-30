package org.cip4.lib.xjdf.uri;

import org.junit.Test;

import java.net.URI;

import static org.junit.Assert.*;

public class AbsoluteURIResolverTest {

    @Test
    public void createAbsoluteURIResolver_LocalFileSystem() throws Exception {
        final URI resolvedUri = new AbsoluteURIResolver().resolve(
            "file:///C:/Documents%20and%20Settings/cip4/xJdfSpec.pdf"
        );

        assertEquals("file:///C:/Documents%20and%20Settings/cip4/xJdfSpec.pdf", resolvedUri.toString());
        assertTrue(resolvedUri.isAbsolute());
    }

    @Test
    public void createAbsoluteURIResolver_Http() throws Exception {
        final URI resolvedUri = new AbsoluteURIResolver().resolve(
            "https://confluence.cip4.org/download/attachments/688513/XJDF-2.0-DRAFT-2015-10-16-BLD19.pdf?api=v2"
        );

        assertEquals(
            "https://confluence.cip4.org/download/attachments/688513/XJDF-2.0-DRAFT-2015-10-16-BLD19.pdf?api=v2",
            resolvedUri.toString()
        );
        assertTrue(resolvedUri.isAbsolute());
    }

    @Test
    public void toStringAbsoluteURIResolver_LocalFileSystem() throws Exception {
        final String relativizedUriString = new AbsoluteURIResolver().toString(
            new URI(
                "file:///C:/Documents%20and%20Settings/cip4/xJdfSpec.pdf"
            )
        );

        assertEquals("file:///C:/Documents%20and%20Settings/cip4/xJdfSpec.pdf", relativizedUriString);
    }

    @Test
    public void toStringAbsoluteURIResolver_Http() throws Exception {
        final String relativizedUriString = new AbsoluteURIResolver().toString(
            new URI(
                "https://confluence.cip4.org/download/attachments/688513/XJDF-2.0-DRAFT-2015-10-16-BLD19.pdf?api=v2"
            )
        );

        assertEquals(
            "https://confluence.cip4.org/download/attachments/688513/XJDF-2.0-DRAFT-2015-10-16-BLD19.pdf?api=v2",
            relativizedUriString
        );
    }
}