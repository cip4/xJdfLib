package org.cip4.lib.xjdf.type;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit test case for XJDF Datatype XYPair.
 * @author stefan.meissner
 */
public class XYPairTest {

	@Test
	public void testNewInstance() {

		// arrange

		// act
		XYPair p = new XYPair();

		// assert
		assertEquals(0d, p.getX(), "X is wrong.");
		assertEquals(0d, p.getY(), "Y is wrong.");

	}

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
	 */
	@Test
	public void testToString() {

		// arrange / act
		String result = new XYPair(612.22, 792.44).toString();

		// assert
		assertEquals("612.220 792.440", result, "Result is wrong.");
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.type.XYPair#marshal(org.cip4.lib.xjdf.type.XYPair)}.
	 */
	@Test
	public void testMarshalXYPair() {

		// arrange
		XYPair p = new XYPair(612.22, 792.44);

		// act
		String result = new XYPair().marshal(p);

		// assert
		assertEquals("612.220 792.440", result, "Result is wrong.");
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.type.XYPair#unmarshal(java.lang.String)}.
	 */
	@Test
	public void testUnmarshalString() {

		// arrange
		final String value = "612.22 792.44";

		// act
		XYPair p = new XYPair().unmarshal(value);

		// assert
		assertEquals(612.22d, p.getX(), "X is wrong.");
		assertEquals(792.44d, p.getY(), "Y is wrong.");
	}

}
