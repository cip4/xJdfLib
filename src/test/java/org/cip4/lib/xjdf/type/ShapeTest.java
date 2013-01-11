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
 * JUnit test case for XJDF data type Shape.
 * @author stefan.meissner
 * @date 18.12.2012
 */
public class ShapeTest {

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
	 * Test method for {@link org.cip4.lib.xjdf.type.Shape#newInstance()}.
	 */
	@Test
	public void testNewInstance() {

		// arrange

		// act
		Shape s = new Shape();

		// assert
		Assert.assertEquals("X is wrong.", 0d, s.getX());
		Assert.assertEquals("Y is wrong.", 0d, s.getY());
		Assert.assertEquals("Z is wrong.", 0d, s.getZ());
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.type.Shape#newInstance(java.lang.String)}.
	 */
	@Test
	public void testNewInstanceString() {

		// arrange
		final String value = "10.1 20.33 40";

		// act
		Shape s = new Shape(value);

		// assert
		Assert.assertEquals("X is wrong.", 10.1d, s.getX());
		Assert.assertEquals("Y is wrong.", 20.33d, s.getY());
		Assert.assertEquals("Z is wrong.", 40d, s.getZ());
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.type.Shape#newInstance(double, double, double)}.
	 */
	@Test
	public void testNewInstanceDoubleDoubleDouble() {

		// arrange

		// act
		Shape s = new Shape(10.1, 20.33, 40);

		// assert
		Assert.assertEquals("X is wrong.", 10.1d, s.getX());
		Assert.assertEquals("Y is wrong.", 20.33d, s.getY());
		Assert.assertEquals("Z is wrong.", 40d, s.getZ());
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.type.Shape#newInstance(double, double, double)}.
	 */
	@Test
	public void testNewInstanceDoubleDouble() {

		// arrange

		// act
		Shape s = new Shape(10.1, 20.33);

		// assert
		Assert.assertEquals("X is wrong.", 10.1d, s.getX());
		Assert.assertEquals("Y is wrong.", 20.33d, s.getY());
		Assert.assertEquals("Z is wrong.", 0d, s.getZ());
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.type.Shape#toString()}.
	 * @throws Exception
	 */
	@Test
	public void testToString() throws Exception {

		// arrange / act
		String result = new Shape(10.1, 20.33, 40).toString();

		// assert
		Assert.assertEquals("String is wrong.", "10.1 20.33 40.0", result);
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.type.Shape#marshal(org.cip4.lib.xjdf.type.Shape)}.
	 * @throws Exception
	 */
	@Test
	public void testMarshalShape() throws Exception {

		// arrange
		Shape s = new Shape(10.1, 20.33, 40);

		// act
		String result = new Shape().marshal(s);

		// assert
		Assert.assertEquals("String is wrong.", "10.1 20.33 40.0", result);
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.type.Shape#unmarshal(java.lang.String)}.
	 * @throws Exception
	 */
	@Test
	public void testUnmarshalString() throws Exception {

		// arrange
		final String value = "10.1 20.33 40";

		// act
		Shape s = new Shape().unmarshal(value);

		// assert
		Assert.assertEquals("X is wrong.", 10.1d, s.getX());
		Assert.assertEquals("Y is wrong.", 20.33d, s.getY());
		Assert.assertEquals("Z is wrong.", 40d, s.getZ());
	}

}
