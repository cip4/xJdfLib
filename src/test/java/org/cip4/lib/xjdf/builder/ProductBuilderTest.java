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

import java.io.ByteArrayOutputStream;

import junit.framework.Assert;

import org.cip4.lib.xjdf.XJdfNodeFactory;
import org.cip4.lib.xjdf.schema.BindingIntent;
import org.cip4.lib.xjdf.schema.LayoutIntent;
import org.cip4.lib.xjdf.schema.MediaIntent;
import org.cip4.lib.xjdf.schema.Product;
import org.cip4.lib.xjdf.type.IDREF;
import org.cip4.lib.xjdf.type.IntegerList;
import org.cip4.lib.xjdf.type.Shape;
import org.cip4.lib.xjdf.xml.XJdfParser;
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
		productBuilder = new ProductBuilder();
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
		productBuilder = new ProductBuilder(AMOUNT);

		// arrange
		byte[] bytes = marsahlResult(productBuilder);

		String actual = getXPathValue(bytes, "/xjdf:Product/@Amount");
		Assert.assertEquals("Attribute Amount in Node Product is wrong.", "5000", actual);
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.builder.ProductBuilder#addIntent(org.cip4.lib.xjdf.schema.jdf.IntentType)}.
	 * @throws Exception
	 */
	@Test
	public void testAddIntent() throws Exception {

		// arrange
		MediaIntent mediaIntent = new XJdfNodeFactory().createMediaIntent();
		mediaIntent.setWeight(135d);

		LayoutIntent layoutIntent = new XJdfNodeFactory().createLayoutIntent();
		layoutIntent.setFinishedDimensions(new Shape(595.27559055d, 822.04724409d));
		BindingIntent bindingIntent = new XJdfNodeFactory().createBindingIntent();
		bindingIntent.setBindingType("SaddleStitch");

		// act
		productBuilder.addIntent(mediaIntent);
		productBuilder.addIntent(layoutIntent);
		productBuilder.addIntent(bindingIntent);

		// arrange
		byte[] bytes = marsahlResult(productBuilder);
		String actual;

		actual = getXPathValue(bytes, "/xjdf:Product/xjdf:Intent/xjdf:MediaIntent/@Weight");
		Assert.assertEquals("Attribute Weight in Node MediaIntent is wrong.", "135.0", actual);

		actual = getXPathValue(bytes, "/xjdf:Product/xjdf:Intent/@Name");
		Assert.assertEquals("Attribute Name in Node Intent is wrong.", "MediaIntent", actual);

		actual = getXPathValue(bytes, "/xjdf:Product/xjdf:Intent/xjdf:LayoutIntent/@FinishedDimensions");
		Assert.assertEquals("Attribute FinishedDimensions in Node LayoutIntent is wrong.", "595.27559055 822.04724409 0.0", actual);
	}

	/**
	 * Simple XJDF with single product
	 * @throws Exception
	 */
	@Test
	public void testWithoutChildren() throws Exception {

		// arrange
		XJdfNodeFactory nf = new XJdfNodeFactory();

		ProductBuilder dbRoot = new ProductBuilder(1000);
		dbRoot.addIntent(nf.createColorIntent(new IntegerList(4, 5)));

		// act
		XJdfBuilder xJdfBuilder = new XJdfBuilder();
		xJdfBuilder.addProduct(dbRoot.build());

		// assert
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		new XJdfParser().parseXJdf(xJdfBuilder.build(), bos);
		bos.close();

		byte[] bytes = bos.toByteArray();

		System.out.println(new String(bytes));

		String actual;

		actual = getXPathValue(bytes, "/xjdf:XJDF/xjdf:ProductList//xjdf:Product/xjdf:Intent[@Name='ColorIntent']/xjdf:ColorIntent/@NumColors");
		Assert.assertEquals("NomColors is wrong.", "4 5", actual);
	}

	/**
	 * Simple XJDF containing a product with childproducts.
	 * @throws Exception
	 */
	@Test
	public void testMultipleChildren() throws Exception {

		// arrange
		XJdfNodeFactory nf = new XJdfNodeFactory();

		ProductBuilder pbRoot = new ProductBuilder(1000);
		pbRoot.addIntent(nf.createColorIntent(new IntegerList(4, 5)));

		ProductBuilder pbChild_1 = new ProductBuilder();
		pbChild_1.addIntent(nf.createMediaIntent("IPG_135"));
		IDREF childRef_1 = new IDREF(pbChild_1.build());

		ProductBuilder pbChild_2 = new ProductBuilder();
		pbChild_2.addIntent(nf.createMediaIntent("IPG_90"));
		IDREF childRef_2 = new IDREF(pbChild_2.build());

		// act
		pbRoot.addChildProduct(childRef_1);
		pbRoot.addChildProduct(childRef_2);

		XJdfBuilder xJdfBuilder = new XJdfBuilder();
		xJdfBuilder.addProduct(pbRoot.build());
		xJdfBuilder.addProduct(childRef_1.getProduct());
		xJdfBuilder.addProduct(childRef_1.getProduct());

		// assert
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		new XJdfParser().parseXJdf(xJdfBuilder.build(), bos);
		bos.close();

		byte[] bytes = bos.toByteArray();

		System.out.println(new String(bytes));

		String actual;

		actual = getXPathValue(bytes, "/xjdf:XJDF/xjdf:ProductList/xjdf:Product/xjdf:Intent[@Name='ColorIntent']/xjdf:ColorIntent/@NumColors");
		Assert.assertEquals("NumColors is wrong.", "4 5", actual);

		actual = getXPathValue(bytes, "/xjdf:XJDF/xjdf:ProductList/xjdf:Product[1]/@IsRoot");
		Assert.assertEquals("IsRoot is wrong.", "true", actual);

		actual = getXPathValue(bytes, "/xjdf:XJDF/xjdf:ProductList/xjdf:Product[2]/@IsRoot");
		Assert.assertEquals("IsRoot is wrong.", "", actual);

		actual = getXPathValue(bytes, "/xjdf:XJDF/xjdf:ProductList/xjdf:Product[2]/xjdf:Intent[@Name='MediaIntent']/xjdf:MediaIntent/@MediaQuality");
		Assert.assertEquals("MediaQuality is wrong.", "IPG_135", actual);

		actual = getXPathValue(bytes, "/xjdf:XJDF/xjdf:ProductList/xjdf:Product[2]/@ID");
		Assert.assertFalse("ProductID is wrong.", "".equals(actual));

		actual = getXPathValue(bytes, "/xjdf:XJDF/xjdf:ProductList/xjdf:Product[3]/xjdf:Intent[@Name='MediaIntent']/xjdf:MediaIntent/@MediaQuality");
		Assert.assertEquals("MediaQuality is wrong.", "IPG_90", actual);
	}
}
