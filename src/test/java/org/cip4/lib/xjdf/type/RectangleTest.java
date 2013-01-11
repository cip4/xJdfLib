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
 * JUnit test case for XJDF Type Rectangle
 * @author stefan.meissner
 * @date 18.12.2012
 */
public class RectangleTest {

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
	 * Test method for {@link org.cip4.lib.xjdf.type.Rectangle#newInstance()}.
	 */
	@Test
	public void testNewInstance() {

		// arrange

		// act
		Rectangle r = new Rectangle();

		// assert
		Assert.assertEquals("Llx is wrong.", 0d, r.getLlx());
		Assert.assertEquals("Lly is wrong.", 0d, r.getLly());
		Assert.assertEquals("Urx is wrong.", 0d, r.getUrx());
		Assert.assertEquals("Ury is wrong.", 0d, r.getUry());
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.type.Rectangle#newInstance(java.lang.String)}.
	 */
	@Test
	public void testNewInstanceString() {

		// arrange
		final String value = "1 0 3.14 21631.3";

		// act
		Rectangle r = new Rectangle(value);

		// assert
		Assert.assertEquals("Llx is wrong.", 1d, r.getLlx());
		Assert.assertEquals("Lly is wrong.", 0d, r.getLly());
		Assert.assertEquals("Urx is wrong.", 3.14d, r.getUrx());
		Assert.assertEquals("Ury is wrong.", 21631.3d, r.getUry());
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.type.Rectangle#newInstance(double, double, double, double)}.
	 */
	@Test
	public void testNewInstanceDoubleDoubleDoubleDouble() {

		// arrange

		// act
		Rectangle r = new Rectangle(1d, 0d, 3.14d, 21631.3d);

		// assert
		Assert.assertEquals("Llx is wrong.", 1d, r.getLlx());
		Assert.assertEquals("Lly is wrong.", 0d, r.getLly());
		Assert.assertEquals("Urx is wrong.", 3.14d, r.getUrx());
		Assert.assertEquals("Ury is wrong.", 21631.3d, r.getUry());
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.type.Rectangle#toString()}.
	 * @throws Exception
	 */
	@Test
	public void testToString() throws Exception {

		// arrange / act
		String result = new Rectangle(1d, 0d, 3.14d, 21631.3d).toString();

		// assert
		Assert.assertEquals("Result is wrong.", "1.0 0.0 3.14 21631.3", result);
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.type.Rectangle#marshal(org.cip4.lib.xjdf.type.Rectangle)}.
	 * @throws Exception
	 */
	@Test
	public void testMarshalRectangle() throws Exception {

		// arrange
		Rectangle r = new Rectangle(1d, 0d, 3.14d, 21631.3d);

		// act
		String result = new Rectangle().marshal(r);

		// assert
		Assert.assertEquals("Result is wrong.", "1.0 0.0 3.14 21631.3", result);
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.type.Rectangle#unmarshal(java.lang.String)}.
	 * @throws Exception
	 */
	@Test
	public void testUnmarshalString() throws Exception {

		// arrange
		final String value = "1 0 3.14 21631.3";

		// act
		Rectangle r = new Rectangle().unmarshal(value);

		// assert
		Assert.assertEquals("Llx is wrong.", 1d, r.getLlx());
		Assert.assertEquals("Lly is wrong.", 0d, r.getLly());
		Assert.assertEquals("Urx is wrong.", 3.14d, r.getUrx());
		Assert.assertEquals("Ury is wrong.", 21631.3d, r.getUry());
	}

}
