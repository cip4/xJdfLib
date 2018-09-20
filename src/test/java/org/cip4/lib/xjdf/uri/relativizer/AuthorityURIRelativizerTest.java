package org.cip4.lib.xjdf.uri.relativizer;

import org.junit.jupiter.api.Test;

import java.net.URI;

import static org.junit.jupiter.api.Assertions.*;

public class AuthorityURIRelativizerTest {

    private static final URI LOCALHOST_URI = URI.create("https://localhost:8080/");

    @Test
    public void relativizeAuthorityURIResolver_Http() throws Exception {
        final String relativizedUriString = new AuthorityURIRelativizer().relativize(
            LOCALHOST_URI,
            new URI(
                "//www.cip4.org/download/xJDF-2.0-Spec.pdf"
            )
        );

        assertEquals("//www.cip4.org/download/xJDF-2.0-Spec.pdf", relativizedUriString);
    }

}