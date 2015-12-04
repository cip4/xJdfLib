package org.cip4.lib.xjdf.uri.relativizer;

import org.junit.Test;

import java.net.URI;

import static org.junit.Assert.*;

public class AbsoluteURIRelativizerTest {

    @Test
    public void relativizeAbsoluteURIRelativizer_LocalFileSystem() throws Exception {
        final String relativizedUriString = new AbsoluteURIRelativizer().relativize(
            null,
            new URI(
                "file:///C:/Documents%20and%20Settings/cip4/xJdfSpec.pdf"
            )
        );

        assertEquals("file:///C:/Documents%20and%20Settings/cip4/xJdfSpec.pdf", relativizedUriString);
    }

    @Test
    public void relativizeAbsoluteURIResolver_Http() throws Exception {
        final String relativizedUriString = new AbsoluteURIRelativizer().relativize(
            null,
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