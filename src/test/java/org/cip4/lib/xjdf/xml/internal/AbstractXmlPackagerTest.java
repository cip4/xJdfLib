package org.cip4.lib.xjdf.xml.internal;

import org.cip4.lib.xjdf.uri.AbsoluteURIPathResolver;
import org.cip4.lib.xjdf.uri.AbstractURIResolver;
import org.cip4.lib.xjdf.uri.RelativeURIPathResolver;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.net.URISyntaxException;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import static org.junit.Assert.*;

/**
 * Unit-Test for AbstractXmlPackager
 */
public class AbstractXmlPackagerTest {

    private class MinimalXmlPackager extends AbstractXmlPackager {
        public MinimalXmlPackager(final OutputStream out, final AbstractURIResolver uriResolver) throws Exception {
            super(out, uriResolver);
        }
    }

    private byte[] minimalXml = ("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n"
        + "<XJDF xmlns=\"http://www.CIP4.org/JDFSchema_2_0\" Version=\"2.0\"></XJDF>").getBytes();

    @Rule
    public TemporaryFolder temp = new TemporaryFolder();

    @Test
    public void testWriteReferencedFile() throws Exception {
        AbstractXmlPackager packager = new MinimalXmlPackager(
            new ByteArrayOutputStream(),
            new RelativeURIPathResolver(temp.getRoot().toURI())
        );
        ZipEntry zipEntry = packager.writeReferencedFile(temp.newFile("foo.zip").toURI(), "bar/");

        assertEquals("bar/foo.zip", zipEntry.getName());
    }

    @Test(expected = NullPointerException.class)
    public void testWriteReferencedFileThrowsExceptionIfRootPathNotProvidedForRelativePath() throws Exception {
        AbstractXmlPackager packager = new MinimalXmlPackager(
            new ByteArrayOutputStream(),
            new RelativeURIPathResolver(null)
        );
        packager.writeReferencedFile(temp.newFile("foo.zip").toURI(), "bar");
    }

    @Test
    public void testWriteReferencedFileIfRootPathNotProvidedForAbsolutePath() throws Exception {
        AbstractXmlPackager packager = new MinimalXmlPackager(
            new ByteArrayOutputStream(),
            new AbsoluteURIPathResolver(temp.getRoot().toURI())
        );

        ZipEntry zipEntry = packager.writeReferencedFile(temp.newFile("foo.zip").toURI(), "bar");
        assertEquals("bar/foo.zip", zipEntry.getName());
    }

    @Test
    public void testWriteReferencedFileIfRootPathNotProvidedForAbsoluteUrl() throws Exception {
        AbstractXmlPackager packager = new MinimalXmlPackager(
            new ByteArrayOutputStream(),
            new AbsoluteURIPathResolver(Paths.get(".").toAbsolutePath().toUri())
        );
        ZipEntry zipEntry = packager.writeReferencedFile(temp.newFile("foo.zip").toURI(), "bar");
        assertEquals("bar/foo.zip", zipEntry.getName());
    }

    @Test(expected = URISyntaxException.class)
    public void testPackageXmlWithBackslash() throws Exception {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        AbstractXmlPackager packager = new MinimalXmlPackager(
            bos,
            new RelativeURIPathResolver(temp.getRoot().toURI())
        );
        packager.writeReferencedFile(temp.newFile().toURI(), "foo\\bar\\baz");
        packager.packageXml(new XmlNavigator(minimalXml), "document.xml", false);

        ZipInputStream zipIn = new ZipInputStream(new ByteArrayInputStream(bos.toByteArray()));
        ZipEntry zipEntry;
        while (null != (zipEntry = zipIn.getNextEntry())) {
            assertFalse("ZipEntry may not contain '\'.", zipEntry.getName().contains("\\"));
        }
    }
}
