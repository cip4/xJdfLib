/**
 * All rights reserved by
 * 
 * flyeralarm GmbH
 * Alfred-Nobel-Straße 18
 * 97080 Würzburg
 *
 * Email: info@flyeralarm.com
 * Website: http://www.flyeralarm.com
 */
package org.cip4.lib.xjdf.xml;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.cip4.lib.xjdf.XJdfNodeFactory;
import org.cip4.lib.xjdf.builder.ProductBuilder;
import org.cip4.lib.xjdf.builder.XJdfBuilder;
import org.cip4.lib.xjdf.schema.Product;
import org.cip4.lib.xjdf.schema.XJDF;
import org.cip4.lib.xjdf.xml.internal.AbstractXmlPackager.CompressionLevel;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * JUnit test case for XjdfPackager
 * @author stefan.meissner
 * @date 26.01.2013
 */
public class XJdfPackagerTest {

	private final static String RES_PDF = "/org/cip4/lib/xjdf/test.pdf";

	private final static String RES_XML = "/org/cip4/lib/xjdf/NewFile.xml";

	private final static String RES_JDF = "/org/cip4/lib/xjdf/layout.jdf";

	private final static String RES_XJDF = "/org/cip4/lib/xjdf/relative.xjdf";

	/**
	 * Setup unit test.
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Tear down unit test.
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.xml.XJdfPackager#packageXJdf(org.cip4.lib.xjdf.schema.XJDF, java.io.OutputStream)}.
	 * @throws Exception
	 */
	@Test
	public void testPackageXJdfAbsolutePath() throws Exception {

		// arrange
		String resPdf = XJdfPackagerTest.class.getResource(RES_PDF).toURI().getPath();
		String resXml = XJdfPackagerTest.class.getResource(RES_XML).toURI().getPath();
		String resJdf = XJdfPackagerTest.class.getResource(RES_JDF).toURI().getPath();

		XJdfNodeFactory nf = new XJdfNodeFactory();

		ProductBuilder productBuilder = new ProductBuilder(1000);
		Product product = productBuilder.build();

		XJdfBuilder xJdfBuilder = new XJdfBuilder("MyJobId");
		xJdfBuilder.addProduct(product);
		xJdfBuilder.addParameter(nf.createRunList(resPdf));
		xJdfBuilder.addParameter(nf.createRunList(resXml));
		XJDF xjdf = xJdfBuilder.build();
		xjdf.setCommentURL(resJdf);

		XJdfParser parser = new XJdfParser();
		ByteArrayOutputStream bosXJdf = new ByteArrayOutputStream();
		parser.parseXJdf(xjdf, bosXJdf);
		bosXJdf.close();

		// act
		ByteArrayOutputStream bosResult = new ByteArrayOutputStream();

		XJdfPackager packager = new XJdfPackager(bosXJdf.toByteArray());
		packager.setCompressionLevel(CompressionLevel.BEST_SPEED);
		packager.packageXJdf(bosResult, "MyFile.xjdf");

		bosResult.close();

		// assert
		String dir = unzipStream(new ByteArrayInputStream(bosResult.toByteArray()));

		File xJdf = new File(FilenameUtils.concat(dir, "MyFile.xjdf"));
		File pdf = new File(FilenameUtils.concat(dir, "artwork/test.pdf"));

		Assert.assertTrue("XJDF File does not exist.", xJdf.exists());
		Assert.assertTrue("XJDF File size is 0.", xJdf.length() > 0);

		XJdfNavigator ptkNav = new XJdfNavigator(new FileInputStream(xJdf));
		String pdfPath = ptkNav.readAttribute("//FileSpec/@URL");
		Assert.assertEquals("URL attribute is wrong.", "artwork/test.pdf", pdfPath);

		Assert.assertTrue("PDF File does not exist.", pdf.exists());
		Assert.assertTrue("PDF File size is 0.", pdf.length() > 0);

		FileUtils.deleteDirectory(new File(dir));
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.xml.XJdfPackager#packageXJdf(org.cip4.lib.xjdf.schema.XJDF, java.io.OutputStream)}.
	 * @throws Exception
	 */
	@Test
	public void testPackageXJdfRelativePath() throws Exception {

		// arrange
		String resPdf = XJdfPackagerTest.class.getResource(RES_PDF).toURI().getPath();
		String resXml = XJdfPackagerTest.class.getResource(RES_XML).toURI().getPath();
		String resJdf = XJdfPackagerTest.class.getResource(RES_JDF).toURI().getPath();

		String rootPath = FilenameUtils.getFullPath(resJdf);

		resPdf = "./" + FilenameUtils.getName(resPdf);
		resXml = "./" + FilenameUtils.getName(resXml);

		XJdfNodeFactory nf = new XJdfNodeFactory();

		ProductBuilder productBuilder = new ProductBuilder(1000);
		Product product = productBuilder.build();

		XJdfBuilder xJdfBuilder = new XJdfBuilder("MyJobId");
		xJdfBuilder.addProduct(product);
		xJdfBuilder.addParameter(nf.createRunList(resPdf));
		xJdfBuilder.addParameter(nf.createRunList(resXml));
		XJDF xjdf = xJdfBuilder.build();
		xjdf.setCommentURL(resJdf);

		XJdfParser parser = new XJdfParser();
		ByteArrayOutputStream bosXJdf = new ByteArrayOutputStream();
		parser.parseXJdf(xjdf, bosXJdf);
		bosXJdf.close();

		// act
		ByteArrayOutputStream bosResult = new ByteArrayOutputStream();

		XJdfPackager packager = new XJdfPackager(bosXJdf.toByteArray(), rootPath);
		packager.setCompressionLevel(CompressionLevel.BEST_SPEED);
		packager.packageXJdf(bosResult, "MyFile.xjdf");

		bosResult.close();

		// assert
		String dir = unzipStream(new ByteArrayInputStream(bosResult.toByteArray()));

		File xJdf = new File(FilenameUtils.concat(dir, "MyFile.xjdf"));
		File pdf = new File(FilenameUtils.concat(dir, "artwork/test.pdf"));

		Assert.assertTrue("XJDF File does not exist.", xJdf.exists());
		Assert.assertTrue("XJDF File size is 0.", xJdf.length() > 0);

		XJdfNavigator ptkNav = new XJdfNavigator(new FileInputStream(xJdf));
		String pdfPath = ptkNav.readAttribute("//FileSpec/@URL");
		Assert.assertEquals("URL attribute is wrong.", "artwork/test.pdf", pdfPath);

		Assert.assertTrue("PDF File does not exist.", pdf.exists());
		Assert.assertTrue("PDF File size is 0.", pdf.length() > 0);

		FileUtils.deleteDirectory(new File(dir));
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.xml.XJdfPackager#packageXJdf(org.cip4.lib.xjdf.schema.XJDF, java.io.OutputStream)}.
	 * @throws Exception
	 */
	@Test
	public void testPackageXJdfRelativePathFile() throws Exception {

		// arrange
		String pathXJdf = XJdfPackagerTest.class.getResource(RES_XJDF).toURI().getPath();

		// act
		ByteArrayOutputStream bosResult = new ByteArrayOutputStream();
		XJdfPackager packager = new XJdfPackager(pathXJdf);
		packager.setCompressionLevel(CompressionLevel.BEST_SPEED);
		packager.packageXJdf(bosResult, "MyFile.xjdf");

		bosResult.close();

		// assert
		String dir = unzipStream(new ByteArrayInputStream(bosResult.toByteArray()));

		File xJdf = new File(FilenameUtils.concat(dir, "MyFile.xjdf"));
		File pdf = new File(FilenameUtils.concat(dir, "artwork/test.pdf"));
		File pdf2 = new File(FilenameUtils.concat(dir, "artwork/test2.pdf"));

		Assert.assertTrue("XJDF File does not exist.", xJdf.exists());
		Assert.assertTrue("XJDF File size is 0.", xJdf.length() > 0);

		XJdfNavigator ptkNav = new XJdfNavigator(new FileInputStream(xJdf));

		String pdfPath = ptkNav.readAttribute("(//FileSpec/@URL)[1]");
		Assert.assertEquals("URL attribute is wrong.", "artwork/test.pdf", pdfPath);
		String pdfPath2 = ptkNav.readAttribute("(//FileSpec/@URL)[2]");
		Assert.assertEquals("URL attribute is wrong.", "artwork/test2.pdf", pdfPath2);

		Assert.assertTrue("PDF File does not exist.", pdf.exists());
		Assert.assertTrue("PDF File size is 0.", pdf.length() > 0);

		Assert.assertTrue("PDF File 2 does not exist.", pdf2.exists());
		Assert.assertTrue("PDF File 2 size is 0.", pdf2.length() > 0);

		FileUtils.deleteDirectory(new File(dir));
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.xml.XJdfPackager#packageXJdf(org.cip4.lib.xjdf.schema.XJDF, java.io.OutputStream)}.
	 * @throws Exception
	 */
	@Test
	public void testPackageXJdfWithoutHierarchy() throws Exception {

		// arrange
		String resPdf = XJdfPackagerTest.class.getResource(RES_PDF).toURI().getPath();
		String resXml = XJdfPackagerTest.class.getResource(RES_XML).toURI().getPath();
		String resJdf = XJdfPackagerTest.class.getResource(RES_JDF).toURI().getPath();

		XJdfNodeFactory nf = new XJdfNodeFactory();

		ProductBuilder productBuilder = new ProductBuilder(1000);
		Product product = productBuilder.build();

		XJdfBuilder xJdfBuilder = new XJdfBuilder("MyJobId");
		xJdfBuilder.addProduct(product);
		xJdfBuilder.addParameter(nf.createRunList(resPdf));
		xJdfBuilder.addParameter(nf.createRunList(resXml));
		XJDF xjdf = xJdfBuilder.build();
		xjdf.setCommentURL(resJdf);

		XJdfParser parser = new XJdfParser();
		ByteArrayOutputStream bosXJdf = new ByteArrayOutputStream();
		parser.parseXJdf(xjdf, bosXJdf);
		bosXJdf.close();

		// act
		ByteArrayOutputStream bosResult = new ByteArrayOutputStream();

		XJdfPackager packager = new XJdfPackager(bosXJdf.toByteArray());
		packager.setCompressionLevel(CompressionLevel.BEST_SPEED);
		packager.packageXJdf(bosResult, "MyFile.xjdf", true);

		bosResult.close();

		// assert
		String dir = unzipStream(new ByteArrayInputStream(bosResult.toByteArray()));

		File xJdf = new File(FilenameUtils.concat(dir, "MyFile.xjdf"));
		File pdf = new File(FilenameUtils.concat(dir, "test.pdf"));

		Assert.assertTrue("XJDF File does not exist.", xJdf.exists());
		Assert.assertTrue("XJDF File size is 0.", xJdf.length() > 0);

		XJdfNavigator ptkNav = new XJdfNavigator(new FileInputStream(xJdf));
		String pdfPath = ptkNav.readAttribute("//FileSpec/@URL");
		Assert.assertEquals("URL attribute is wrong.", "test.pdf", pdfPath);

		Assert.assertTrue("PDF File does not exist.", pdf.exists());
		Assert.assertTrue("PDF File size is 0.", pdf.length() > 0);

		FileUtils.deleteDirectory(new File(dir));
	}

	/**
	 * Private helper method for unpackaging zip stream.
	 * @param inputStream ZipStream as InputStream.
	 * @param dir Target directory.
	 * @throws IOException
	 */
	private String unzipStream(InputStream inputStream) throws IOException {

		// create packaging root
		String strDir = FilenameUtils.concat(FileUtils.getTempDirectoryPath(), "XJDF-Packaging-" + UUID.randomUUID().toString());
		File dir = new File(strDir);
		dir.deleteOnExit();

		ZipInputStream zis = new ZipInputStream(inputStream);
		ZipEntry entry = null;

		while ((entry = zis.getNextEntry()) != null) {

			String entryName = entry.getName();

			if (!entry.isDirectory()) {
				// target path
				File f = new File(FilenameUtils.concat(dir.getAbsolutePath(), entryName));

				// create directory
				String s = FilenameUtils.getFullPath(f.getPath());
				new File(s).mkdirs();

				// create file
				OutputStream out = new FileOutputStream(f);
				IOUtils.copy(zis, out);
				out.close();
			}
		}

		return strDir;
	}

}
