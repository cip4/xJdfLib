package org.cip4.lib.xjdf.uri;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.net.URI;

import static org.junit.Assert.*;

public class AbstractURIResolverTest {

    private static final URI TEMP_DIR_URI = FileUtils.getTempDirectory().toURI();
    private static final URI LOCALHOST_URI = URI.create("http://localhost:8080/");

    @Test
    public void createAbsoluteURIResolver_LocalFileSystem() throws Exception {
        assertSame(
            AbsoluteURIResolver.class,
            AbstractURIResolver.create(
                null,
                "file:///C:/Documents%20and%20Settings/cip4/xJdfSpec.pdf"
            ).getClass()
        );
    }

    @Test
    public void createAbsoluteURIResolver_Http() throws Exception {
        assertSame(
            AbsoluteURIResolver.class,
            AbstractURIResolver.create(
                null,
                "https://confluence.cip4.org/download/attachments/688513/XJDF-2.0-DRAFT-2015-10-16-BLD19.pdf?api=v2"
            ).getClass()
        );
    }

    @Test
    public void createAuthorityURIResolver() throws Exception {
        assertSame(
            AuthorityURIResolver.class,
            AbstractURIResolver.create(
                LOCALHOST_URI,
                "//www.cip4.org"
            ).getClass()
        );
    }

    @Test
    public void createAbsoluteURIPathResolver_LocalFileSystem() throws Exception {
        assertSame(
            AbsoluteURIPathResolver.class,
            AbstractURIResolver.create(
                TEMP_DIR_URI,
                "/cip4/xJdfSpec.pdf"
            ).getClass()
        );
    }

    @Test
    public void createAbsoluteURIPathResolver_Http() throws Exception {
        assertSame(
            AbsoluteURIPathResolver.class,
            AbstractURIResolver.create(
                LOCALHOST_URI,
                "/cip4/xJdfSpec.pdf"
            ).getClass()
        );
    }

    @Test
    public void createRelativeURIPathResolver_LocalFileSystem() throws Exception {
        assertSame(
            RelativeURIPathResolver.class,
            AbstractURIResolver.create(
                TEMP_DIR_URI,
                "cip4/xJdfSpec.pdf"
            ).getClass()
        );
    }

    @Test
    public void createRelativeURIPathResolver_Http() throws Exception {
        assertSame(
            RelativeURIPathResolver.class,
            AbstractURIResolver.create(
                LOCALHOST_URI,
                "cip4/xJdfSpec.pdf"
            ).getClass()
        );
    }

}