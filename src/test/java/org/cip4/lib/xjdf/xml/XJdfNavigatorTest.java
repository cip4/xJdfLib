/**
 * All rights reserved by
 * 
 * flyeralarm GmbH
 * Alfred-Nobel-Straße 18
 * 97080 Würzburg
 *
 * info@flyeralarm.com
 * http://www.flyeralarm.com
 */
package org.cip4.lib.xjdf.xml;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.UUID;

import org.apache.commons.io.IOUtils;
import org.cip4.lib.xjdf.type.Shape;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * JUnit test case for XPathNavigator.
 * @author s.meissner
 * @date 06.03.2012
 */
public class XJdfNavigatorTest {

	private final String RES_TEST_XJDF = "/org/cip4/lib/xjdf/test.xjdf";

	private XJdfNavigator xJdfNavigator;

	/**
	 * Set up unit test.
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {

		InputStream is = XJdfNavigator.class.getResourceAsStream(RES_TEST_XJDF);
		xJdfNavigator = new XJdfNavigator(is);
	}

	/**
	 * Tear down unit test.
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		xJdfNavigator = null;
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.xml.XJdfNavigator#readAttribute(java.lang.String)}.
	 */
	@Test
	public void testReadAttribute() throws Exception {

		// arrange
		String expected_1 = "CatalogID";
		String expected_2 = "890e81ed-6830-4868-b23d-8ab8af8a4047";
		String expected_3 = "";

		// act
		String actual_1 = xJdfNavigator.readAttribute("/XJDF/GeneralID/@IDUsage");
		String actual_2 = xJdfNavigator.readAttribute("/XJDF/GeneralID/@IDValue");
		String actual_3 = xJdfNavigator.readAttribute("/XJDF/GeneralID/@IDValue1111");

		// assert
		Assert.assertEquals("Value IDUsage is wrong.", expected_1, actual_1);
		Assert.assertEquals("Value IDValue is wrong.", expected_2, actual_2);
		Assert.assertEquals("Value IDValue is wrong.", expected_3, actual_3);
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.xml.XJdfNavigator#readAttribute(java.lang.String)}.
	 */
	@Test
	public void testReadAttributeDataType() throws Exception {

		// arrange
		Shape expected = new Shape("595.27559055 822.04724409 0.0");

		// act
		Shape actual = (Shape) xJdfNavigator.readAttribute("/XJDF/ProductList/Product/Intent[@Name='LayoutIntent']/LayoutIntent/@FinishedDimensions", Shape.class);

		// assert
		Assert.assertEquals("Shape is wrong.", expected, actual);
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.xml.XJdfNavigator#updateAttribute(java.lang.String, java.lang.String)}.
	 * @throws Exception
	 */
	@Test
	public void testUpdateAttribute() throws Exception {

		// arrange
		final String NEW_VALUE = UUID.randomUUID().toString();

		// act
		xJdfNavigator.updateAttribute("/XJDF/GeneralID/@IDUsage", NEW_VALUE);

		// assert
		InputStream is = xJdfNavigator.getXmlStream();

		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		IOUtils.copy(is, bos);
		String doc = new String(bos.toByteArray());

		int i = doc.indexOf(NEW_VALUE);

		Assert.assertFalse(i == -1);
	}

	@Test
	public void testSpeedTest() throws Exception {
		// arrange
		final int MAX_LOOP = 100;
		final String NEW_VALUE = "newValue";
		final String XPATH = "/XJDF/GeneralID/@IDUsage";

		String actual = null;

		// act
		long startTime = System.currentTimeMillis();

		for (int i = 0; i < MAX_LOOP; i++) {
			// read
			actual = xJdfNavigator.readAttribute(XPATH);
		}

		long readFirstFinished = System.currentTimeMillis();

		for (int i = 0; i < MAX_LOOP; i++) {
			// update
			xJdfNavigator.updateAttribute(XPATH, NEW_VALUE);
		}

		long updateFinished = System.currentTimeMillis();

		for (int i = 0; i < MAX_LOOP; i++) {
			// read
			actual = xJdfNavigator.readAttribute(XPATH);
		}

		long readSecondFinished = System.currentTimeMillis();

		// assert
		System.out.println("Result XPathNavigator Speed Test:");
		System.out.println("---------------------------------");
		System.out.println("Time first read: " + (readFirstFinished - startTime));
		System.out.println("Time update: " + (updateFinished - readFirstFinished));
		System.out.println("Time second read: " + (readSecondFinished - updateFinished));

		Assert.assertEquals("New value is wrong.", NEW_VALUE, actual);
	}

	@Test
	public void testXPathExpressions() throws Exception {

		// arrange
		String actual;

		// act / assert
		actual = xJdfNavigator.readAttribute(XJdfNavigator.JOB_ID);
		Assert.assertEquals("Value 'JobID' is wrong.", "Job258596", actual);

		actual = xJdfNavigator.readAttribute(XJdfNavigator.CATEGORY);
		Assert.assertEquals("Value 'Category' is wrong.", "Web2Print", actual);

		actual = xJdfNavigator.readAttribute(XJdfNavigator.GENERAL_CATALOG_ID);
		Assert.assertEquals("Value 'CatalogID' is wrong.", "890e81ed-6830-4868-b23d-8ab8af8a4047", actual);

		actual = xJdfNavigator.readAttribute(XJdfNavigator.GENERAL_LINE_ID);
		Assert.assertEquals("Value 'LineID' is wrong.", "", actual);

		actual = xJdfNavigator.readAttribute(XJdfNavigator.FILE_SPEC_URL);
		Assert.assertEquals("Value 'FileSpec/Url' is wrong.", "http://www.w2p.com:8080/w2p/getPDF/w2p/hd_a5_32.pdf", actual);

		actual = xJdfNavigator.readAttribute(XJdfNavigator.MIN_APPROVALS);
		Assert.assertEquals("Value 'MinApprovals' is wrong.", "1", actual);

		actual = xJdfNavigator.readAttribute(XJdfNavigator.CUSTOMER_ID);
		Assert.assertEquals("Value 'CustomerID' is wrong.", "FA-WEB-DE", actual);

		actual = xJdfNavigator.readAttribute(XJdfNavigator.AMOUNT);
		Assert.assertEquals("Value 'Amount' is wrong.", "1000", actual);

		actual = xJdfNavigator.readAttribute(XJdfNavigator.MEDIA_QUALITY);
		Assert.assertEquals("Value 'MediaQuality' is wrong.", "IPG_135", actual);

		actual = xJdfNavigator.readAttribute(XJdfNavigator.LAYOUT_FINISHED_DIMENSIONS);
		Assert.assertEquals("Value 'FinishedDimensions' is wrong.", "595.27559055 822.04724409", actual);

		actual = xJdfNavigator.readAttribute(XJdfNavigator.PRODUCTION_PRINT_PROCESS);
		Assert.assertEquals("Value 'PrintProcess' is wrong.", "Lithography", actual);

		actual = xJdfNavigator.readAttribute(XJdfNavigator.FOLDING_CATALOG);
		Assert.assertEquals("Value 'FoldingCatalog' is wrong.", "F6-1", actual);

		actual = xJdfNavigator.readAttribute(XJdfNavigator.COLOR_NUM_COLORS);
		Assert.assertEquals("Value 'NumColors' is wrong.", "4 4", actual);

	}
}
