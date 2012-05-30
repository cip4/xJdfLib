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

import junit.framework.Assert;

import org.cip4.lib.xjdf.util.IOUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * JUnit test case for XPathNavigator.
 * @author s.meissner
 * @date 06.03.2012
 */
public class XPathNavigatorTest {

	private final String RES_TEST_XJDF = "/org/cip4/lib/xjdf/test.xjdf";

	private XPathNavigator xPathNavigator;

	/**
	 * Set up unit test.
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {

		InputStream is = XPathNavigator.class.getResourceAsStream(RES_TEST_XJDF);
		xPathNavigator = XPathNavigator.newInstance(is);
	}

	/**
	 * Tear down unit test.
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		xPathNavigator = null;
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.xml.XPathNavigator#readAttribute(java.lang.String)}.
	 */
	@Test
	public void testReadAttribute() throws Exception {

		// arrange
		String expected_1 = "CatalogID";
		String expected_2 = "890e81ed-6830-4868-b23d-8ab8af8a4047";

		// act
		String actual_1 = xPathNavigator.readAttribute("/XJDF/GeneralID/@IDUsage");
		String actual_2 = xPathNavigator.readAttribute("/XJDF/GeneralID/@IDValue");
		String actual_3 = xPathNavigator.readAttribute("/XJDF/GeneralID/@IDValue1111");

		// assert
		Assert.assertEquals("Value IDUsage is wrong.", expected_1, actual_1);
		Assert.assertEquals("Value IDValue is wrong.", expected_2, actual_2);
		Assert.assertNull("Value IDValue is wrong.", actual_3);
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.xml.XPathNavigator#updateAttribute(java.lang.String, java.lang.String)}.
	 * @throws Exception
	 */
	@Test
	public void testUpdateAttribute() throws Exception {

		// arrange
		final String NEW_VALUE = UUID.randomUUID().toString();

		// act
		xPathNavigator.updateAttribute("/XJDF/GeneralID/@IDUsage", NEW_VALUE);

		// assert
		InputStream is = xPathNavigator.getXJdfStream();

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
			actual = xPathNavigator.readAttribute(XPATH);
		}

		long readFirstFinished = System.currentTimeMillis();

		for (int i = 0; i < MAX_LOOP; i++) {
			// update
			xPathNavigator.updateAttribute(XPATH, NEW_VALUE);
		}

		long updateFinished = System.currentTimeMillis();

		for (int i = 0; i < MAX_LOOP; i++) {
			// read
			actual = xPathNavigator.readAttribute(XPATH);
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

}
