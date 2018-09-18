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

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
	@BeforeEach
	public void setUp() throws Exception {
	}

	/**
	 * Tear down unit test.
	 * @throws java.lang.Exception
	 */
	@AfterEach
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.type.XYPair#newInstance()}.
	 */
	@Test
	public void testNewInstance() {

		// arrange

		// act
		XYPair p = new XYPair();

		// assert
		assertEquals(0d, p.getX(), "X is wrong.");
		assertEquals(0d, p.getY(), "Y is wrong.");

	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.type.XYPair#newInstance(java.lang.String)}.
	 */
	@Test
	public void testNewInstanceString() {

		// arrange
		final String value = "612.22 792.44";

		// act
		XYPair p = new XYPair(value);

		// assert
		assertEquals(612.22d, p.getX(), "X is wrong.");
		assertEquals(792.44d, p.getY(), "Y is wrong.");
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.type.XYPair#newInstance(double, double)}.
	 */
	@Test
	public void testNewInstanceDoubleDouble() {

		// arrange

		// act
		XYPair p = new XYPair(612.22, 792.44);

		// assert
		assertEquals(612.22d, p.getX(), "X is wrong.");
		assertEquals(792.44d, p.getY(), "Y is wrong.");
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.type.XYPair#toString()}.
	 * @throws Exception
	 */
	@Test
	public void testToString() throws Exception {

		// arrange / act
		String result = new XYPair(612.22, 792.44).toString();

		// assert
		assertEquals("612.22 792.44", result, "Result is wrong.");
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.type.XYPair#marshal(org.cip4.lib.xjdf.type.XYPair)}.
	 * @throws Exception
	 */
	@Test
	public void testMarshalXYPair() throws Exception {

		// arrange
		XYPair p = new XYPair(612.22, 792.44);

		// act
		String result = new XYPair().marshal(p);

		// assert
		assertEquals("612.22 792.44", result, "Result is wrong.");
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
		XYPair p = new XYPair().unmarshal(value);

		// assert
		assertEquals(612.22d, p.getX(), "X is wrong.");
		assertEquals(792.44d, p.getY(), "Y is wrong.");
	}

}
