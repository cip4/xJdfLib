package org.cip4.lib.xjdf.xml.internal;

import org.apache.commons.io.FilenameUtils;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;

/**
 * Unit-Test for AbstractXmlPackager
 */
public class AbstractXmlPackagerTest {

	private class MinimalXmlPackager extends AbstractXmlPackager {
		public MinimalXmlPackager(final String xmlPath) throws Exception {
			super(xmlPath);
		}

		public MinimalXmlPackager(final byte[] xmlDoc, final String rootPath) throws Exception {
			super(xmlDoc, rootPath);
		}
	}

	private byte[] minimalXml = ("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n"
		+ "<XJDF xmlns=\"http://www.CIP4.org/JDFSchema_2_0\" Version=\"2.0\"></XJDF>").getBytes();

	@Rule
	public TemporaryFolder temp = new TemporaryFolder();

	@Test
	public void testRegisterFile() throws Exception {
		AbstractXmlPackager packager = new MinimalXmlPackager(
			minimalXml,
			temp.getRoot().getAbsolutePath()
		);
		File targetFile = packager.registerFile("foo.zip", "bar");

		Assert.assertEquals("bar/foo.zip", FilenameUtils.separatorsToUnix(targetFile.getPath()));
	}

	@Test(expected = PackagerException.class)
	public void testRegisterFileThrowsExceptionIfRootPathNotProvidedForRelativePath() throws Exception {
		AbstractXmlPackager packager = new MinimalXmlPackager(
			minimalXml,
			null
		);
		packager.registerFile("foo.zip", "bar");
	}

	@Test
	public void testRegisterFileIfRootPathNotProvidedForAbsolutePath() throws Exception {
		AbstractXmlPackager packager = new MinimalXmlPackager(
			minimalXml,
			null
		);

		File targetFile = packager.registerFile(temp.newFile("foo.zip").getAbsolutePath(), "bar");
		Assert.assertEquals("bar/foo.zip", FilenameUtils.separatorsToUnix(targetFile.getPath()));
	}

	@Test
	public void testRegisterFileIfRootPathNotProvidedForAbsoluteUrl() throws Exception {
		AbstractXmlPackager packager = new MinimalXmlPackager(
			minimalXml,
			null
		);
		File targetFile = packager.registerFile(temp.newFile("foo.zip").toURI().toString(), "bar");
		Assert.assertEquals("bar/foo.zip", FilenameUtils.separatorsToUnix(targetFile.getPath()));
	}
}
