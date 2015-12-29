package org.cip4.lib.xjdf.xml.internal;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;

import static org.junit.Assert.*;

/**
 * Unit-Test for AbstractXmlPackager
 */
public class AbstractXmlPackagerTest {

	private class MinimalXmlPackager extends AbstractXmlPackager {
		public MinimalXmlPackager(final OutputStream out) throws Exception {
            super(out);
		}
	}

	private byte[] minimalXml = ("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n"
		+ "<XJDF xmlns=\"http://www.CIP4.org/JDFSchema_2_0\" Version=\"2.0\"></XJDF>").getBytes();

	@Rule
	public TemporaryFolder temp = new TemporaryFolder();

	@Test
	public void testWriteReferencedFile() throws Exception {
		AbstractXmlPackager packager = new MinimalXmlPackager(new ByteArrayOutputStream());
        ZipEntry zipEntry = packager.writeReferencedFile(temp.newFile("foo.zip").toURI(), "bar/");

        assertEquals("bar/foo.zip", zipEntry.getName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWriteReferencedFileThrowsExceptionIfRootPathNotProvidedForRelativePath() throws Exception {
        AbstractXmlPackager packager = new MinimalXmlPackager(new ByteArrayOutputStream());
		packager.writeReferencedFile(new URI("foo.zip"), "bar");
	}

    @Test
    public void testWriteReferencedFileIfRootPathNotProvidedForAbsolutePath() throws Exception {
        AbstractXmlPackager packager = new MinimalXmlPackager(new ByteArrayOutputStream());

        ZipEntry zipEntry = packager.writeReferencedFile(temp.newFile("foo.zip").toURI(), "bar");
        assertEquals("bar/foo.zip", zipEntry.getName());
    }

    @Test
    public void testWriteReferencedFileIfRootPathNotProvidedForAbsoluteUrl() throws Exception {
        AbstractXmlPackager packager = new MinimalXmlPackager(new ByteArrayOutputStream());
        ZipEntry zipEntry = packager.writeReferencedFile(temp.newFile("foo.zip").toURI(), "bar");
        assertEquals("bar/foo.zip", zipEntry.getName());
    }

    @Test(expected = URISyntaxException.class)
    public void testPackageXmlWithBackslash() throws Exception {
        AbstractXmlPackager packager = new MinimalXmlPackager(new ByteArrayOutputStream());
        packager.writeReferencedFile(temp.newFile().toURI(), "foo\\bar\\baz");
        packager.packageXml(new XmlNavigator(minimalXml), "document.xml", temp.getRoot().toURI(), false);
    }
}
