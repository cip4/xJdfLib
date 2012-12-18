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
package org.cip4.lib.xjdf.type;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * JUnit test case for XJDF Datatype XYPair.
 * @author stefan.meissner
 * @date 18.12.2012
 */
public class XYPairTest {

	/**
	 * Set up unit test.
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
	 * Test method for {@link org.cip4.lib.xjdf.type.XYPair#newInstance()}.
	 */
	@Test
	public void testNewInstance() {

		// arrange

		// act
		XYPair p = XYPair.newInstance();

		// assert
		Assert.assertEquals("X is wrong.", 0d, p.getX());
		Assert.assertEquals("Y is wrong.", 0d, p.getY());

	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.type.XYPair#newInstance(java.lang.String)}.
	 */
	@Test
	public void testNewInstanceString() {

		// arrange
		final String value = "612.22 792.44";

		// act
		XYPair p = XYPair.newInstance(value);

		// assert
		Assert.assertEquals("X is wrong.", 612.22d, p.getX());
		Assert.assertEquals("Y is wrong.", 792.44d, p.getY());
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.type.XYPair#newInstance(double, double)}.
	 */
	@Test
	public void testNewInstanceDoubleDouble() {

		// arrange

		// act
		XYPair p = XYPair.newInstance(612.22, 792.44);

		// assert
		Assert.assertEquals("X is wrong.", 612.22d, p.getX());
		Assert.assertEquals("Y is wrong.", 792.44d, p.getY());
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.type.XYPair#marshal(org.cip4.lib.xjdf.type.XYPair)}.
	 * @throws Exception
	 */
	@Test
	public void testMarshalXYPair() throws Exception {

		// arrange
		XYPair p = XYPair.newInstance(612.22, 792.44);

		// act
		String result = XYPair.newInstance().marshal(p);

		// assert
		Assert.assertEquals("Result is wrong.", "612.22 792.44", result);
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.type.XYPair#unmarshal(java.lang.String)}.
	 * @throws Exception
	 */
	@Test
	public void testUnmarshalString() throws Exception {

		// arrange
		final String value = "612.22 792.44";

		// act
		XYPair p = XYPair.newInstance().unmarshal(value);

		// assert
		Assert.assertEquals("X is wrong.", 612.22d, p.getX());
		Assert.assertEquals("Y is wrong.", 792.44d, p.getY());
	}

}
