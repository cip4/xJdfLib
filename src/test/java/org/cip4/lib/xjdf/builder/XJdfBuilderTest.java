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
package org.cip4.lib.xjdf.builder;

import java.util.UUID;

import org.cip4.lib.xjdf.XJdfNodeFactory;
import org.cip4.lib.xjdf.builder.XJdfBuilder;
import org.cip4.lib.xjdf.schema.jdf.FileSpec;
import org.cip4.lib.xjdf.schema.jdf.GeneralID;
import org.cip4.lib.xjdf.schema.jdf.NodeInfo;
import org.cip4.lib.xjdf.schema.jdf.Part;
import org.cip4.lib.xjdf.schema.jdf.Product;
import org.cip4.lib.xjdf.schema.jdf.RunList;
import org.cip4.lib.xjdf.schema.jdf.XJDF;
import org.cip4.lib.xjdf.xml.internal.JAXBContextFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * JUnit test case for XJdfBuilder.
 * @author s.meissner
 * @date 29.02.2012
 */
public class XJdfBuilderTest extends AbstractBuilderTest<XJDF> {

	private XJdfBuilder xJdfBuilder;

	/**
	 * Setup unit test.
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		xJdfBuilder = XJdfBuilder.newInstance();

		JAXBContextFactory.init();
	}

	/**
	 * Tear down unit test.
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		xJdfBuilder = null;
	}

	/**
	 * Add one GeneralID Parameter to XJDF document.
	 * @throws Exception
	 */
	@Test
	public void testAddGeneralIDParams() throws Exception {
		// arrange
		final String ID_USAGE = UUID.randomUUID().toString();
		final String ID_VALUE = UUID.randomUUID().toString();

		// act
		GeneralID generalId = XJdfNodeFactory.getInstance().createGeneralID(ID_USAGE, ID_VALUE);
		xJdfBuilder.addGeneralID(generalId);

		// assert
		byte[] bytes = marsahlResult(xJdfBuilder);

		String actualIDUsage = getXPathValue(bytes, "/ns:XJDF/ns:GeneralID/@IDUsage");
		Assert.assertEquals("IDUsage in GeneralID is wrong.", ID_USAGE, actualIDUsage);

		String actualIDValue = getXPathValue(bytes, "/ns:XJDF/ns:GeneralID/@IDValue");
		Assert.assertEquals("IDValue in GeneralID is wrong.", ID_VALUE, actualIDValue);

	}

	/**
	 * Add Multiple GeneralID Parameter to XJDF document.
	 * @throws Exception
	 */
	@Test
	public void testAddGeneralIDParamsMultiple() throws Exception {
		// arrange
		final String ID_USAGE_1 = UUID.randomUUID().toString();
		final String ID_VALUE_1 = UUID.randomUUID().toString();

		final String ID_USAGE_2 = UUID.randomUUID().toString();
		final String ID_VALUE_2 = UUID.randomUUID().toString();

		final String ID_VALUE_3 = "";

		// act
		xJdfBuilder.addGeneralID(XJdfNodeFactory.getInstance().createGeneralID(ID_USAGE_1, ID_VALUE_1));
		xJdfBuilder.addGeneralID(XJdfNodeFactory.getInstance().createGeneralID(ID_USAGE_2, ID_VALUE_2));

		// assert
		byte[] bytes = marsahlResult(xJdfBuilder);

		String actualIDUsage_1 = getXPathValue(bytes, "/ns:XJDF/ns:GeneralID[1]/@IDUsage");
		Assert.assertEquals("IDUsage in GeneralID is wrong.", ID_USAGE_1, actualIDUsage_1);

		String actualIDValue_1 = getXPathValue(bytes, "/ns:XJDF/ns:GeneralID[1]/@IDValue");
		Assert.assertEquals("IDValue in GeneralID is wrong.", ID_VALUE_1, actualIDValue_1);

		String actualIDUsage_2 = getXPathValue(bytes, "/ns:XJDF/ns:GeneralID[2]/@IDUsage");
		Assert.assertEquals("IDUsage in GeneralID is wrong.", ID_USAGE_2, actualIDUsage_2);

		String actualIDValue_2 = getXPathValue(bytes, "/ns:XJDF/ns:GeneralID[2]/@IDValue");
		Assert.assertEquals("IDValue in GeneralID is wrong.", ID_VALUE_2, actualIDValue_2);

		String actualIDValue_3 = getXPathValue(bytes, "/ns:XJDF/ns:GeneralID[3]/@IDValue");
		Assert.assertEquals("IDValue in GeneralID is wrong.", ID_VALUE_3, actualIDValue_3);

	}

	/**
	 * Add Parameter "Product" to XJDF document.
	 * @throws Exception
	 */
	@Test
	public void testAddProductSimple() throws Exception {
		// arrange
		Product product = XJdfNodeFactory.getInstance().createProduct();
		product.setAmount(1000);

		// act
		xJdfBuilder.addProduct(product);

		// assert
		byte[] bytes = marsahlResult(xJdfBuilder);

	}

	/**
	 * Add Parameter "RunList" to XJDF document.
	 * @throws Exception
	 */
	@Test
	public void testAddParameterRunList() throws Exception {

		// arrange
		final String URL = "http://www.example.org/w2p/Cover.pdf";

		FileSpec fileSpec = XJdfNodeFactory.getInstance().createFileSpec();
		fileSpec.setURL(URL);

		RunList runList = XJdfNodeFactory.getInstance().createRunList();
		runList.setFileSpec(fileSpec);

		Part partCover = XJdfNodeFactory.getInstance().createPart();
		partCover.setRun("Cover");

		Part partContent = XJdfNodeFactory.getInstance().createPart();
		partContent.setRun("Content");

		// act
		xJdfBuilder.addParameter(runList, partCover);

		// assert
		byte[] bytes = marsahlResult(xJdfBuilder);

		String actualName = getXPathValue(bytes, "/ns:XJDF/ns:ParameterSet/@Name");
		Assert.assertEquals("Name in ParameterSet is wrong.", "RunList", actualName);

		String actualPartRun = getXPathValue(bytes, "/ns:XJDF/ns:ParameterSet/ns:Parameter/ns:Part/@Run");
		Assert.assertEquals("RunTag in RunList is wrong.", "Cover", actualPartRun);

		String actualUrl = getXPathValue(bytes, "/ns:XJDF/ns:ParameterSet/ns:Parameter/ns:RunList/ns:FileSpec/@URL");
		Assert.assertEquals("RunTag in RunList is wrong.", URL, actualUrl);
	}

	/**
	 * Add Multiple Parameter o XJDF document.
	 * @throws Exception
	 */
	@Test
	public void testAddParameterMultiple() throws Exception {
		// arrange
		final String urlContent = "http://www.example.org/w2p/Content.pdf";
		final String urlCover = "http://www.example.org/w2p/Cover.pdf";

		RunList runListCover = XJdfNodeFactory.getInstance().createRunList(urlCover);
		RunList runListContent = XJdfNodeFactory.getInstance().createRunList(urlContent);

		Part partCover = XJdfNodeFactory.getInstance().createPart();
		partCover.setRun("Cover");

		Part partContent = XJdfNodeFactory.getInstance().createPart();
		partContent.setRun("Content");

		NodeInfo nodeInfo = new NodeInfo();
		nodeInfo.setEnd("now");

		// act
		xJdfBuilder.addParameter(runListCover, partCover);
		xJdfBuilder.addParameter(runListContent, partContent);
		xJdfBuilder.addParameter(nodeInfo);

		// assert
		byte[] bytes = marsahlResult(xJdfBuilder);

		String actualName = getXPathValue(bytes, "/ns:XJDF/ns:ParameterSet/@Name");
		Assert.assertEquals("Name in ParameterSet is wrong.", "RunList", actualName);

	}

}
