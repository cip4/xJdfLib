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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.UUID;

import javax.xml.bind.JAXBException;
import javax.xml.bind.ValidationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.cip4.lib.xjdf.XJdfNodeFactory;
import org.cip4.lib.xjdf.builder.XJdfBuilder;
import org.cip4.lib.xjdf.schema.GeneralID;
import org.cip4.lib.xjdf.schema.XJDF;
import org.cip4.lib.xjdf.xml.internal.JAXBContextFactory;
import org.cip4.lib.xjdf.xml.internal.NamespaceManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.xml.sax.InputSource;

/**
 * JUnit test case for XmlParser class.
 * @author s.meissner
 * @date 06.03.2012
 */
public class XJdfParserTest {

	private final String RES_TEST_XJDF = "/org/cip4/lib/xjdf/test.xjdf";

	private XJdfParser xJdfParser;

	/**
	 * Default constructor.
	 */
	public XJdfParserTest() {
		try {
			JAXBContextFactory.init();
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Set up unit test.
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		// new instance
		xJdfParser = new XJdfParser();
	}

	/**
	 * Tear down unit test.
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		// clean up
		xJdfParser = null;
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.xml.XJdfParser#parseXJdf(org.cip4.lib.xjdf.schema.jdf.XJDF, java.io.OutputStream)}.
	 */
	@Test
	public void testParseXJdfSkipValidation() throws Exception {

		// arrange
		final String VALUE = UUID.randomUUID().toString();

		XJdfNodeFactory xJdfNodeFactory = new XJdfNodeFactory();
		XJdfBuilder xJdfBuilder = new XJdfBuilder();

		GeneralID generalId = xJdfNodeFactory.createGeneralID("CatalobID", VALUE);
		xJdfBuilder.addGeneralID(generalId);

		XJDF xJdf = xJdfBuilder.build();

		ByteArrayOutputStream bos = new ByteArrayOutputStream();

		// act
		xJdfParser.parseXJdf(xJdf, bos, true);

		// assert
		NamespaceManager nsManager = new NamespaceManager();
		nsManager.addNamespace("ns", XJdfConstants.NAMESPACE_JDF20);

		XPathFactory xPathFactory = XPathFactory.newInstance();
		XPath xPath = xPathFactory.newXPath();
		xPath.setNamespaceContext(nsManager);

		XPathExpression xPathExpression = xPath.compile("/ns:XJDF/ns:GeneralID/@IDValue");
		InputStream is = new ByteArrayInputStream(bos.toByteArray());
		String actual = xPathExpression.evaluate(new InputSource(is));

		Assert.assertEquals("Expected value is wrong.", VALUE, actual);
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.xml.XJdfParser#parseXJdf(org.cip4.lib.xjdf.schema.jdf.XJDF, java.io.OutputStream)}.
	 */
	@Test(expected = ValidationException.class)
	public void testParseXJdfInvalid() throws Exception {

		// arrange
		final String VALUE = UUID.randomUUID().toString();

		XJdfNodeFactory xJdfNodeFactory = new XJdfNodeFactory();
		XJdfBuilder xJdfBuilder = new XJdfBuilder();

		GeneralID generalId = xJdfNodeFactory.createGeneralID("CatalobID", VALUE);
		xJdfBuilder.addGeneralID(generalId);

		XJDF xJdf = xJdfBuilder.build();
		xJdf.setID(null);

		ByteArrayOutputStream bos = new ByteArrayOutputStream();

		// act
		xJdfParser.parseXJdf(xJdf, bos);

		// assert
		// exception expected
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.xml.XJdfParser#parseXJdf(org.cip4.lib.xjdf.schema.jdf.XJDF, java.io.OutputStream)}.
	 */
	@Test
	public void testParseXJdfValid() throws Exception {

		// arrange
		final String VALUE = UUID.randomUUID().toString();

		XJdfNodeFactory xJdfNodeFactory = new XJdfNodeFactory();
		XJdfBuilder xJdfBuilder = new XJdfBuilder();

		GeneralID generalId = xJdfNodeFactory.createGeneralID("CatalobID", VALUE);
		xJdfBuilder.addGeneralID(generalId);

		xJdfBuilder.build().setID("MyId");
		xJdfBuilder.build().getTypes().add("MyType");
		xJdfBuilder.build().setVersion(XJdfConstants.XJDF_CURRENT_VERSION);

		XJDF xJdf = xJdfBuilder.build();

		ByteArrayOutputStream bos = new ByteArrayOutputStream();

		// act
		xJdfParser.parseXJdf(xJdf, bos);

		// assert
		NamespaceManager nsManager = new NamespaceManager();
		nsManager.addNamespace("ns", XJdfConstants.NAMESPACE_JDF20);

		XPathFactory xPathFactory = XPathFactory.newInstance();
		XPath xPath = xPathFactory.newXPath();
		xPath.setNamespaceContext(nsManager);

		System.out.println(new String(bos.toByteArray()));

		XPathExpression xPathExpression = xPath.compile("/ns:XJDF/ns:GeneralID/@IDValue");
		InputStream is = new ByteArrayInputStream(bos.toByteArray());
		String actual = xPathExpression.evaluate(new InputSource(is));

		Assert.assertEquals("Expected value is wrong.", VALUE, actual);
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.xml.XJdfParser#parseXmlStream(java.io.InputStream)}.
	 */
	@Test
	public void testParseXmlStream() throws Exception {
		// arrange
		final String RESULT = "890e81ed-6830-4868-b23d-8ab8af8a4047";

		InputStream is = XJdfParserTest.class.getResourceAsStream(RES_TEST_XJDF);

		// act
		XJDF xJdf = xJdfParser.parseStream(is);

		// assert
		Assert.assertEquals("Result is wrong.", RESULT, xJdf.getGeneralID().get(0).getIDValue());
	}

}
