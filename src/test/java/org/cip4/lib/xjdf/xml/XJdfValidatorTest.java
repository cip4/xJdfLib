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
import java.io.InputStream;

import javax.xml.bind.JAXBException;

import junit.framework.Assert;

import org.cip4.lib.xjdf.XJdfNodeFactory;
import org.cip4.lib.xjdf.builder.XJdfBuilder;
import org.cip4.lib.xjdf.schema.GeneralID;
import org.cip4.lib.xjdf.schema.XJDF;
import org.cip4.lib.xjdf.xml.internal.AbstractXmlParser;
import org.cip4.lib.xjdf.xml.internal.JAXBContextFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * JUnit test case for XJdfValidator.
 * @author s.meissner
 * @date 11.04.2012
 */
public class XJdfValidatorTest {

	private final String RES_TEST_XJDF = "/org/cip4/lib/xjdf/test.xjdf";

	private XJdfValidator xJdfValidator;

	private XJdfNodeFactory xJdfNodeFactory;

	private XJdfBuilder xJdfBuilder;

	/**
	 * Default constructor.
	 */
	public XJdfValidatorTest() {
		try {
			JAXBContextFactory.init();
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Setup unit test.
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {

		// init instance variables
		xJdfValidator = XJdfValidator.newInstance();
		xJdfNodeFactory = XJdfNodeFactory.newInstance();
		xJdfBuilder = XJdfBuilder.newInstance();
	}

	/**
	 * Tear down unit test.
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		xJdfValidator = null;
		xJdfNodeFactory = null;
		xJdfBuilder = null;
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.xml.XJdfValidator#validate(java.io.InputStream)}.
	 * @throws Exception
	 */
	@Test
	public void testIntegrationInvalide() throws Exception {

		// arrange
		GeneralID generalId = xJdfNodeFactory.createGeneralID("CatalobID", "42");
		xJdfBuilder.addGeneralID(generalId);

		xJdfBuilder.getXJdf().setID("MyId");

		// act
		InputStream xJdfFileStream = builder2InputStream(xJdfBuilder);
		boolean isValid = xJdfValidator.check(xJdfFileStream).isValid();

		// assert
		Assert.assertFalse("Validation result is wrong", isValid);
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.xml.XJdfValidator#validate(java.io.InputStream)}.
	 * @throws Exception
	 */
	@Test
	public void testIntegrationValide() throws Exception {

		// arrange
		GeneralID generalId = xJdfNodeFactory.createGeneralID("CatalobID", "42");
		xJdfBuilder.addGeneralID(generalId);

		xJdfBuilder.getXJdf().setID("MyId");
		xJdfBuilder.getXJdf().getTypes().add("Web2Print");
		xJdfBuilder.getXJdf().setVersion(XJdfConstants.XJDF_CURRENT_VERSION);

		// act
		InputStream xJdfFileStream = builder2InputStream(xJdfBuilder);
		boolean isValid = xJdfValidator.check(xJdfFileStream).isValid();

		// assert
		Assert.assertTrue("Validation result is wrong", isValid);
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.xml.XJdfValidator#validate(java.io.InputStream)}.
	 * @throws Exception
	 */
	@Test
	public void testIntegrationValideSingleLineCall() throws Exception {

		// arrange
		GeneralID generalId = xJdfNodeFactory.createGeneralID("CatalobID", "42");
		xJdfBuilder.addGeneralID(generalId);

		xJdfBuilder.getXJdf().setID("MyId");
		xJdfBuilder.getXJdf().getTypes().add("Web2Print");
		xJdfBuilder.getXJdf().setVersion(XJdfConstants.XJDF_CURRENT_VERSION);

		// act
		InputStream xJdfFileStream = builder2InputStream(xJdfBuilder);
		boolean isValid = XJdfValidator.newInstance().check(xJdfFileStream).isValid();

		// assert
		Assert.assertTrue("Validation result is wrong", isValid);
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.xml.XJdfValidator#validate(java.io.InputStream)}.
	 * @throws Exception
	 */
	@Test
	public void testIntegrationAnalyzeMessagesInvalid() throws Exception {

		// arrange
		GeneralID generalId = xJdfNodeFactory.createGeneralID("CatalobID", "42");
		xJdfBuilder.addGeneralID(generalId);

		xJdfBuilder.getXJdf().setID("MyId");

		// act
		InputStream xJdfFileStream = builder2InputStream(xJdfBuilder);
		xJdfValidator.check(xJdfFileStream);

		// assert
		int size = xJdfValidator.getMessages().size();
		boolean isValid = xJdfValidator.isValid();

		Assert.assertEquals("Number messages is wrong.", 2, size);
		Assert.assertFalse("Validation result is wrong", isValid);
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.xml.XJdfValidator#validate(java.io.InputStream)}.
	 * @throws Exception
	 */
	@Test
	public void testIntegrationAnalyzeMessagesValid() throws Exception {

		// arrange
		GeneralID generalId = xJdfNodeFactory.createGeneralID("CatalobID", "42");
		xJdfBuilder.addGeneralID(generalId);

		xJdfBuilder.getXJdf().setID("MyId");
		xJdfBuilder.getXJdf().getTypes().add("Web2Print");
		xJdfBuilder.getXJdf().setVersion(XJdfConstants.XJDF_CURRENT_VERSION);

		// act
		InputStream xJdfFileStream = builder2InputStream(xJdfBuilder);
		xJdfValidator.check(xJdfFileStream);

		// assert
		int size = xJdfValidator.getMessages().size();
		boolean isValid = xJdfValidator.isValid();

		Assert.assertEquals("Number messages is wrong.", 0, size);
		Assert.assertTrue("Validation result is wrong", isValid);
	}

	@Test
	public void testCheck() throws Exception {

		// arrange
		InputStream is = XJdfValidatorTest.class.getResourceAsStream(RES_TEST_XJDF);

		// act
		boolean isValid = xJdfValidator.check(is).isValid();

		// assert
		System.out.println(xJdfValidator.getMessagesText());

		// TODO: XSD Validation ID etc...
		// Assert.assertTrue("Validation result is wrong", isValid);
	}

	/**
	 * Helper converting builder to input stream.
	 * @param xJdfBuilder XJdfBuilder object to convert to.
	 * @return XJDF as InputStream object.
	 * @throws Exception
	 */
	private InputStream builder2InputStream(XJdfBuilder xJdfBuilder) throws Exception {

		XJDF xJdf = xJdfBuilder.build();

		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		AbstractXmlParser xJdfParser = XJdfParser.newInstance();
		xJdfParser.parseXJdf(xJdf, bos, true);

		return new ByteArrayInputStream(bos.toByteArray());

	}
}