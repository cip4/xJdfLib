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

import junit.framework.Assert;

import org.cip4.lib.xjdf.XJdfNodeFactory;
import org.cip4.lib.xjdf.schema.jdf.BindingIntent;
import org.cip4.lib.xjdf.schema.jdf.LayoutIntent;
import org.cip4.lib.xjdf.schema.jdf.MediaIntent;
import org.cip4.lib.xjdf.schema.jdf.Product;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * JUnit test case for Product Builder class.
 * @author s.meissner
 * @date 05.03.2012
 */
public class ProductBuilderTest extends AbstractBuilderTest<Product> {

	private ProductBuilder productBuilder;

	/**
	 * Set up unit test.
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		productBuilder = ProductBuilder.newInstance();
	}

	/**
	 * Tear down unit test.
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		productBuilder = null;
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.builder.ProductBuilder#initAttributes(java.lang.Integer)}.
	 */
	@Test
	public void testInitAttributes() throws Exception {
		// arrange
		final int AMOUNT = 5000;

		// act
		productBuilder.initAttributes(AMOUNT);

		// arrange
		byte[] bytes = marsahlResult(productBuilder);

		String actual = getXPathValue(bytes, "/ns:Product/@Amount");
		Assert.assertEquals("Attribute Amount in Node Product is wrong.", "5000", actual);
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.builder.ProductBuilder#initAttributes(java.lang.Integer)}.
	 */
	@Test
	public void testInitAttributesEmtpyParams() throws Exception {
		// arrange

		// act
		productBuilder.initAttributes(null);

		// arrange
		byte[] bytes = marsahlResult(productBuilder);

		String actual = getXPathValue(bytes, "/ns:Product/@Amount");
		Assert.assertEquals("Attribute Amount in Node Product is wrong.", "", actual);
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.builder.ProductBuilder#addIntent(org.cip4.lib.xjdf.schema.jdf.IntentType)}.
	 * @throws Exception
	 */
	@Test
	public void testAddIntent() throws Exception {

		// arrange
		MediaIntent mediaIntent = XJdfNodeFactory.newInstance().createMediaIntent();
		mediaIntent.setWeight(135d);

		LayoutIntent layoutIntent = XJdfNodeFactory.newInstance().createLayoutIntent();
		layoutIntent.getFinishedDimensions().add(595.27559055d);
		layoutIntent.getFinishedDimensions().add(822.04724409d);

		BindingIntent bindingIntent = XJdfNodeFactory.newInstance().createBindingIntent();
		bindingIntent.setBindingType("SaddleStitch");

		// act
		productBuilder.addIntent(mediaIntent);
		productBuilder.addIntent(layoutIntent);
		productBuilder.addIntent(bindingIntent);

		// arrange
		byte[] bytes = marsahlResult(productBuilder);
		String actual;

		actual = getXPathValue(bytes, "/ns:Product/ns:Intent/ns:MediaIntent/@Weight");
		Assert.assertEquals("Attribute Weight in Node MediaIntent is wrong.", "135.0", actual);

		actual = getXPathValue(bytes, "/ns:Product/ns:Intent/@Name");
		Assert.assertEquals("Attribute Name in Node Intent is wrong.", "MediaIntent", actual);

		actual = getXPathValue(bytes, "/ns:Product/ns:Intent/ns:LayoutIntent/@FinishedDimensions");
		Assert.assertEquals("Attribute FinishedDimensions in Node LayoutIntent is wrong.", "595.27559055 822.04724409", actual);
	}

}
