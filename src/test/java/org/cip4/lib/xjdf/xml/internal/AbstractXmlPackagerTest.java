package org.cip4.lib.xjdf.xml.internal;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.net.URI;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * Unit-Test for AbstractXmlPackager
 */
public class AbstractXmlPackagerTest {

	private class MinimalXmlPackager extends AbstractXmlPackager {
		public MinimalXmlPackager(final OutputStream out) throws Exception {
			this(out, null);
		}

		public MinimalXmlPackager(final OutputStream out, final URI rootPath) throws Exception {
            super(out, rootPath);
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
			temp.getRoot().toURI()
		);
		ZipEntry zipEntry = packager.writeReferencedFile(temp.newFile("foo.zip").getPath(), "bar");

		Assert.assertEquals("bar/foo.zip", zipEntry.getName());
	}

	@Test(expected = PackagerException.class)
	public void testWriteReferencedFileThrowsExceptionIfRootPathNotProvidedForRelativePath() throws Exception {
		AbstractXmlPackager packager = new MinimalXmlPackager(
            new ByteArrayOutputStream(),
			null
		);
        packager.createSourceURI("foo.zip");
		packager.writeReferencedFile(temp.newFile("foo.zip").getPath(), "bar");
	}

	@Test
	public void testWriteReferencedFileIfRootPathNotProvidedForAbsolutePath() throws Exception {
        AbstractXmlPackager packager = new MinimalXmlPackager(
            new ByteArrayOutputStream(),
            temp.getRoot().toURI()
        );

		ZipEntry zipEntry = packager.writeReferencedFile(temp.newFile("foo.zip").getAbsolutePath(), "bar");
		Assert.assertEquals("bar/foo.zip", zipEntry.getName());
	}

	@Test
	public void testWriteReferencedFileIfRootPathNotProvidedForAbsoluteUrl() throws Exception {
        AbstractXmlPackager packager = new MinimalXmlPackager(
            new ByteArrayOutputStream(),
            null
        );
		ZipEntry zipEntry = packager.writeReferencedFile(temp.newFile("foo.zip").getPath(), "bar");
		Assert.assertEquals("bar/foo.zip", zipEntry.getName());
	}

    @Test
    public void testPackageXmlWithBackslash() throws Exception {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        AbstractXmlPackager packager = new MinimalXmlPackager(
            bos,
            temp.getRoot().toURI()
        );
        packager.writeReferencedFile(temp.newFile().getPath(), "foo\\bar\\baz");
        packager.packageXml(new XmlNavigator(minimalXml), "document.xml", false);

        ZipInputStream zipIn = new ZipInputStream(new ByteArrayInputStream(bos.toByteArray()));
        ZipEntry zipEntry;
        while (null != (zipEntry = zipIn.getNextEntry())) {
            Assert.assertFalse("ZipEntry may not contain '\'.", zipEntry.getName().contains("\\"));
        }
    }

//    @Test
//    public void normalizeFileName() throws Exception {
//        AbstractXmlPackager packager = new MinimalXmlPackager(minimalXml, null);
//        String str = packager.normalizeFileName("25.88.Eililu!$%_----__AbC.de.fG01239-->>>--___.987zipEqr234=)(/Arc");
//        assertEquals("25.88.Eililu__----__AbC.de.fG01239--_--___.987zipEqr234_Arc", str);
//    }
}
