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
import java.io.FileOutputStream;

import org.apache.commons.io.IOUtils;
import org.cip4.lib.xjdf.XJdfNodeFactory;
import org.cip4.lib.xjdf.builder.ProductBuilder;
import org.cip4.lib.xjdf.builder.XJdfBuilder;
import org.cip4.lib.xjdf.schema.Product;
import org.cip4.lib.xjdf.schema.XJDF;
import org.junit.After;
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
	public void testPackageXJdf() throws Exception {

		// arrange
		String resPdf = XJdfPackagerTest.class.getResource(RES_PDF).getFile();
		String resXml = XJdfPackagerTest.class.getResource(RES_XML).getFile();

		XJdfNodeFactory nf = new XJdfNodeFactory();

		ProductBuilder productBuilder = new ProductBuilder(1000);
		Product product = productBuilder.build();

		XJdfBuilder xJdfBuilder = new XJdfBuilder("MyJobId");
		xJdfBuilder.addProduct(product);
		xJdfBuilder.addParameter(nf.createRunList(resPdf));
		xJdfBuilder.addParameter(nf.createRunList(resXml));
		XJDF xjdf = xJdfBuilder.build();

		// act
		ByteArrayOutputStream bos = new ByteArrayOutputStream();

		XJdfPackager packager = new XJdfPackager();
		packager.packageXJdf(xjdf, bos);

		bos.close();

		// assert
		FileOutputStream fos = new FileOutputStream("D:\\Temp\\myZip.zip");
		IOUtils.copy(new ByteArrayInputStream(bos.toByteArray()), fos);
		fos.close();
	}
}
