package org.cip4.lib.xjdf.xml;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.UUID;

import org.apache.commons.io.IOUtils;
import org.cip4.lib.xjdf.schema.Product;
import org.cip4.lib.xjdf.type.Shape;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * JUnit test case for XPathNavigator.
 * @author s.meissner
 */
public class XJdfNavigatorTest {

	private final String RES_TEST_XJDF = "/org/cip4/lib/xjdf/test.xjdf";

	private final String RES_TEST_JDF = "/org/cip4/lib/xjdf/layout.jdf";

	private final String RES_TEST_JOB_1 = "/org/cip4/lib/xjdf/JOB_1.xjdf";

	/**
	 * Test method for {@link org.cip4.lib.xjdf.xml.XJdfNavigator#readAttribute(java.lang.String)}.
	 */
	@Test
	public void testReadAttribute() throws Exception {

		// arrange
		InputStream is = XJdfNavigator.class.getResourceAsStream(RES_TEST_XJDF);
		XJdfNavigator xJdfNavigator = new XJdfNavigator(is);

		String expected_1 = "CatalogID";
		String expected_2 = "890e81ed-6830-4868-b23d-8ab8af8a4047";
		String expected_3 = "";

		// act
		String actual_1 = xJdfNavigator.readAttribute("/XJDF/GeneralID/@IDUsage");
		String actual_2 = xJdfNavigator.readAttribute("/XJDF/GeneralID/@IDValue");
		String actual_3 = xJdfNavigator.readAttribute("/XJDF/GeneralID/@IDValue1111");

		// assert
		assertEquals(expected_1, actual_1, "Value IDUsage is wrong.");
		assertEquals(expected_2, actual_2, "Value IDValue is wrong.");
		assertEquals(expected_3, actual_3, "Value IDValue is wrong.");
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.xml.XJdfNavigator#readAttribute(java.lang.String)}.
	 */
	@Test
	public void testReadAttributeDataType() throws Exception {

		// arrange
		InputStream is = XJdfNavigator.class.getResourceAsStream(RES_TEST_XJDF);
		XJdfNavigator xJdfNavigator = new XJdfNavigator(is);

		Shape expected = new Shape("595.27559055 822.04724409 0.0");

		// act
		Shape actual = (Shape) xJdfNavigator.readAttribute("/XJDF/ProductList/Product/Intent[@Name='LayoutIntent']/LayoutIntent/@FinishedDimensions", Shape.class);

		// assert
		assertEquals(expected, actual, "Shape is wrong.");
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.xml.XJdfNavigator#updateAttribute(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testUpdateAttribute() throws Exception {

		// arrange
		InputStream is = XJdfNavigator.class.getResourceAsStream(RES_TEST_XJDF);
		XJdfNavigator xJdfNavigator = new XJdfNavigator(is);

		final String NEW_VALUE = UUID.randomUUID().toString();

		// act
		xJdfNavigator.updateAttribute("/XJDF/GeneralID/@IDUsage", NEW_VALUE);

		// assert
		byte[] bytes = xJdfNavigator.getXmlBytes();
		String doc = new String(bytes);

		int i = doc.indexOf(NEW_VALUE);

		assertFalse(i == -1);
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.xml.XJdfNavigator#updateAttribute(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testUpdateAttributeXJdfType() throws Exception {

		// arrange
		InputStream is = XJdfNavigator.class.getResourceAsStream(RES_TEST_XJDF);
		XJdfNavigator xJdfNavigator = new XJdfNavigator(is);

		final Shape fdim = new Shape(10d, 20d, 30d);

		// act
		xJdfNavigator.updateAttribute("/XJDF/ProductList/Product/Intent[@Name='LayoutIntent']/LayoutIntent/@FinishedDimensions", fdim);

		// assert
		byte[] bytes = xJdfNavigator.getXmlBytes();
		String doc = new String(bytes);

		int i = doc.indexOf("10.0 20.0 30.0");

		assertFalse(i == -1);
	}

	@Test
	public void testSpeedTest() throws Exception {
		// arrange
		InputStream is = XJdfNavigator.class.getResourceAsStream(RES_TEST_XJDF);
		XJdfNavigator xJdfNavigator = new XJdfNavigator(is);

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
		assertEquals(NEW_VALUE, actual, "New value is wrong.");
	}

	@Test
	public void testXPathExpressions() throws Exception {

		// arrange
		InputStream is = XJdfNavigator.class.getResourceAsStream(RES_TEST_XJDF);
		XJdfNavigator xJdfNavigator = new XJdfNavigator(is, true);

		String actual;

		// act / assert
		actual = xJdfNavigator.readAttribute(XJdfNavigator.JOB_ID);
		assertEquals("Job258596", actual, "Value 'JobID' is wrong.");

		actual = xJdfNavigator.readAttribute(XJdfNavigator.CATEGORY);
		assertEquals("Web2Print", actual, "Value 'Category' is wrong.");

		actual = xJdfNavigator.readAttribute(XJdfNavigator.GENERAL_CATALOG_ID);
		assertEquals("890e81ed-6830-4868-b23d-8ab8af8a4047", actual, "Value 'CatalogID' is wrong.");

		actual = xJdfNavigator.readAttribute(XJdfNavigator.GENERAL_LINE_ID);
		assertEquals("", actual, "Value 'LineID' is wrong.");

		actual = xJdfNavigator.readAttribute(XJdfNavigator.FILE_SPEC_URL);
		assertEquals("http://www.w2p.com:8080/w2p/getPDF/w2p/hd_a5_32.pdf", actual, "Value 'FileSpec/Url' is wrong.");

		actual = xJdfNavigator.readAttribute(XJdfNavigator.MIN_APPROVALS);
		assertEquals("1", actual, "Value 'MinApprovals' is wrong.");

		actual = xJdfNavigator.readAttribute(XJdfNavigator.CUSTOMER_ID);
		assertEquals("FA-WEB-DE", actual, "Value 'CustomerID' is wrong.");

		actual = xJdfNavigator.readAttribute(XJdfNavigator.AMOUNT);
		assertEquals("1000", actual, "Value 'Amount' is wrong.");

		actual = xJdfNavigator.readAttribute(XJdfNavigator.MEDIA_QUALITY);
		assertEquals("IPG_135", actual, "Value 'MediaQuality' is wrong.");

		actual = xJdfNavigator.readAttribute(XJdfNavigator.LAYOUT_FINISHED_DIMENSIONS);
		assertEquals("595.27559055 822.04724409 0.0", actual, "Value 'FinishedDimensions' is wrong.");

		actual = xJdfNavigator.readAttribute(XJdfNavigator.PRODUCTION_PRINT_PROCESS);
		assertEquals("Lithography", actual, "Value 'PrintProcess' is wrong.");

		actual = xJdfNavigator.readAttribute(XJdfNavigator.FOLD_CATALOG);
		assertEquals("F6-1", actual, "Value 'FoldCatalog' is wrong.");

		actual = xJdfNavigator.readAttribute(XJdfNavigator.COLOR_NUM_COLORS);
		assertEquals("4 4", actual, "Value 'NumColors' is wrong.");

	}

	@Test
	public void testEvaluateDouble() throws Exception {

		// arrange
		InputStream is = XJdfNavigator.class.getResourceAsStream(RES_TEST_JDF);
		XJdfNavigator xJdfNavigator = new XJdfNavigator(is);

		// act
		double version = xJdfNavigator.evaluateDouble("/JDF/@Version");

		// assert
		assertEquals(1.2d, version, 0.001, "Version is wrong.");
	}

	@Test
	public void testEvaluateInt() throws Exception {

		// arrange
		InputStream is = XJdfNavigator.class.getResourceAsStream(RES_TEST_XJDF);
		XJdfNavigator xJdfNavigator = new XJdfNavigator(is);

		// act
		int val = xJdfNavigator.evaluateInt("/XJDF/ResourceSet[@Name='ApprovalParams']/Resource/ApprovalParams/@MinApprovals");

		// assert
		assertEquals(1, val, "Value is wrong.");
	}

	@Test
	public void testEvaluateLong() throws Exception {

		// arrange
		InputStream is = XJdfNavigator.class.getResourceAsStream(RES_TEST_XJDF);
		XJdfNavigator xJdfNavigator = new XJdfNavigator(is);

		// act
		long val = xJdfNavigator.evaluateLong("/XJDF/ResourceSet[@Name='ApprovalParams']/Resource/ApprovalParams/@MinApprovals");

		// assert
		assertEquals(1, val, "Value is wrong.");
	}

	@Test
	public void testEvaluateIntNull() throws Exception {

		// arrange
		InputStream is = XJdfNavigator.class.getResourceAsStream(RES_TEST_XJDF);
		XJdfNavigator xJdfNavigator = new XJdfNavigator(is);

		// act
		Integer val = xJdfNavigator.evaluateInt("/XJDF/ResourceSet[@Name='xxx']/Resource/ApprovalParams/@MinApprovals");

		// assert
		assertNull(val, "Integer Value is not null.");
	}

	@Test
	public void testEvaluateIntString() throws Exception {

		// arrange
		InputStream is = XJdfNavigator.class.getResourceAsStream(RES_TEST_XJDF);
		XJdfNavigator xJdfNavigator = new XJdfNavigator(is);

		// act
		Integer val = xJdfNavigator.evaluateInt("/XJDF/@Category");

		// assert
		assertNull(val, "Integer Value is not null.");
	}

	@Test
	public void testEvaluateString() throws Exception {

		// arrange
		InputStream is = XJdfNavigator.class.getResourceAsStream(RES_TEST_XJDF);
		XJdfNavigator xJdfNavigator = new XJdfNavigator(is);

		// act
		String version = xJdfNavigator.evaluateString("/XJDF/@Category");

		// assert
		assertEquals("Web2Print", version, "Category is wrong.");
	}

	@Test
	public void testEvaluateNodeBytes() throws Exception {

		// arrange
		InputStream is = XJdfNavigator.class.getResourceAsStream(RES_TEST_XJDF);
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		IOUtils.copy(is, bos);
		is.close();
		bos.close();

		XJdfNavigator xJdfNavigator = new XJdfNavigator(bos.toByteArray());

		// act
		Node node = xJdfNavigator.evaluateNode("/XJDF/ProductList/Product");

		// assert
		assertEquals("Product", node.getNodeName(), "Node-Name is wrong.");
		assertNull(node.getNamespaceURI(), "Node-Name is wrong.");
	}

	@Test
	public void testEvaluateNodeNamespaceAwareBytes() throws Exception {

		// arrange
		InputStream is = XJdfNavigator.class.getResourceAsStream(RES_TEST_XJDF);
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		IOUtils.copy(is, bos);
		is.close();
		bos.close();

		XJdfNavigator xJdfNavigator = new XJdfNavigator(bos.toByteArray(), true);

		// act
		Node node = xJdfNavigator.evaluateNode("/xjdf:XJDF/xjdf:ProductList/xjdf:Product");

		// assert
		assertEquals("Product", node.getNodeName(), "Node-Name is wrong.");
		assertEquals("http://www.CIP4.org/JDFSchema_2_0", node.getNamespaceURI(), "Node-Name is wrong.");
	}

	@Test
	public void testEvaluateNodeIS() throws Exception {

		// arrange
		InputStream is = XJdfNavigator.class.getResourceAsStream(RES_TEST_XJDF);
		XJdfNavigator xJdfNavigator = new XJdfNavigator(is);

		// act
		Node node = xJdfNavigator.evaluateNode("/XJDF/ProductList/Product");

		// assert
		assertEquals("Product", node.getNodeName(), "Node-Name is wrong.");
		assertNull(node.getNamespaceURI(), "Node-Name is wrong.");
	}

	@Test
	public void testEvaluateNodeNamespaceAwareIS() throws Exception {

		// arrange
		InputStream is = XJdfNavigator.class.getResourceAsStream(RES_TEST_XJDF);
		XJdfNavigator xJdfNavigator = new XJdfNavigator(is, true);

		// act
		Node node = xJdfNavigator.evaluateNode("/xjdf:XJDF/xjdf:ProductList/xjdf:Product");

		// assert
		assertEquals("Product", node.getNodeName(), "Node-Name is wrong.");
		assertEquals("http://www.CIP4.org/JDFSchema_2_0", node.getNamespaceURI(), "Node-Name is wrong.");
	}

	@Test
	public void testEvaluateNodeList() throws Exception {

		// arrange
		InputStream is = XJdfNavigator.class.getResourceAsStream(RES_TEST_XJDF);
		XJdfNavigator xJdfNavigator = new XJdfNavigator(is);

		// act
		NodeList nodeList = xJdfNavigator.evaluateNodeList("/XJDF/ProductList/Product/Intent");

		// assert
		assertEquals(5, nodeList.getLength(), "Number intent elements is wrong.");
	}

	@Test
	public void testEvaluateBoolean() throws Exception {

		// arrange
		InputStream is = XJdfNavigator.class.getResourceAsStream(RES_TEST_XJDF);
		XJdfNavigator xJdfNavigator = new XJdfNavigator(is);

		// act
		boolean val = xJdfNavigator.evaluateBoolean("/XJDF/ProductList/Product/@IsRoot");

		// assert
		assertTrue(val, "Value is wrong.");
	}

	@Test
	public void testXJdfNodeModification() throws Exception {

		// arrange
		File testBefore = new File(XJdfNavigatorTest.class.getResource(RES_TEST_JOB_1).toURI());
		File fileAfter = File.createTempFile("cip4-test", ".xjdf");
		fileAfter.deleteOnExit();

		XJdfNavigator xJdfNavigator = new XJdfNavigator(new FileInputStream(testBefore), true);

		// act
		Product product = (Product) xJdfNavigator.extractNode("//xjdf:XJDF/xjdf:ProductList/xjdf:Product");
		product.getIntent().remove(0);
		xJdfNavigator.replaceNode("//xjdf:XJDF/xjdf:ProductList/xjdf:Product", product);

		FileOutputStream fos = new FileOutputStream(fileAfter);
		IOUtils.write(xJdfNavigator.getXmlBytes(), fos);
		fos.close();

		// assert
		XJdfNavigator navBefore = new XJdfNavigator(testBefore);
		int cntItemsBefore = navBefore.evaluateInt("count(//XJDF/ProductList/Product/Intent)");

		XJdfNavigator navAfter = new XJdfNavigator(fileAfter);
		int cntItemsAfter = navAfter.evaluateInt("count(//XJDF/ProductList/Product/Intent)");

		assertEquals(3, cntItemsBefore, "Number of Intents before is wrong.");
		assertEquals(2, cntItemsAfter, "Number of Intents after is wrong.");
	}

	@Test
	public void testXJdfNodeRemoval() throws Exception {

		// arrange
		File testBefore = new File(XJdfNavigatorTest.class.getResource(RES_TEST_JOB_1).toURI());
		File fileAfter = File.createTempFile("cip4-test", ".xjdf");
		fileAfter.deleteOnExit();

		XJdfNavigator xJdfNavigator = new XJdfNavigator(new FileInputStream(testBefore), false);

		// act
		xJdfNavigator.removeNode("//XJDF/ProductList/Product/Intent[1]");

		FileOutputStream fos = new FileOutputStream(fileAfter);
		IOUtils.write(xJdfNavigator.getXmlBytes(), fos);
		fos.close();

		// assert
		XJdfNavigator navBefore = new XJdfNavigator(testBefore);
		int cntItemsBefore = navBefore.evaluateInt("count(//XJDF/ProductList/Product/Intent)");

		XJdfNavigator navAfter = new XJdfNavigator(fileAfter);
		int cntItemsAfter = navAfter.evaluateInt("count(//XJDF/ProductList/Product/Intent)");

		assertEquals(3, cntItemsBefore, "Number of Intents before is wrong.");
		assertEquals(2, cntItemsAfter, "Number of Intents after is wrong.");
	}
}
