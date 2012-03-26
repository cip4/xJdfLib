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
package org.cip4.lib.xjdf;

import java.util.UUID;

import junit.framework.Assert;

import org.cip4.lib.xjdf.XJdfNodeFactory;
import org.cip4.lib.xjdf.schema.jdf.Product;
import org.cip4.lib.xjdf.schema.jdf.RunList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * JUnit test case for XJdfNodeFactory.
 * @author s.meissner
 * @date 05.03.2012
 */
public class XJdfNodeFactoryTest {

	private XJdfNodeFactory xJdfNodeFactory;

	/**
	 * Set up unit test.
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		xJdfNodeFactory = XJdfNodeFactory.getInstance();
	}

	/**
	 * Tear down unit test.
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		xJdfNodeFactory = null;
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.XJdfNodeFactory#createRunList(java.lang.String)}.
	 */
	@Test
	public void testCreateRunListString() {
		// arrange
		final String FILE_SPEC_URL = UUID.randomUUID().toString();

		// act
		RunList runList = xJdfNodeFactory.createRunList(FILE_SPEC_URL);

		// assert
		Assert.assertEquals("Attribute URL in Node FileSpec is wrong", FILE_SPEC_URL, runList.getFileSpec().getURL());
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.XJdfNodeFactory#createProduct(int)}.
	 */
	@Test
	public void testCreateProductInt() {
		// arrange
		final int AMOUNT = (int) Math.random() * 10000;

		// act
		Product product = xJdfNodeFactory.createProduct(AMOUNT);

		// assert
		Assert.assertEquals("Attribute 'Amount' is wrong", AMOUNT, product.getAmount().intValue());
	}

}
