package org.cip4.lib.xjdf.type;

import org.junit.jupiter.api.Test;
import org.junitpioneer.jupiter.DefaultLocale;

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
		assertEquals(612.22d, p.getX(), 0.01f, "X is wrong.");
		assertEquals(792.44d, p.getY(), 0.01f, "Y is wrong.");
	}

	@Test
	public void testNewInstanceDoubleDouble() {

		// arrange

		// act
		XYPair p = new XYPair(612.22f, 792.44f);

		// assert
		assertEquals(612.22f, p.getX(), 0.01f, "X is wrong.");
		assertEquals(792.44f, p.getY(), 0.01f, "Y is wrong.");
	}

	@Test
	@DefaultLocale("de-de")
	public void testToStringDeDe() {
		String result = new XYPair(612.22f, 792.44f).toString();
		assertEquals("612.220 792.440", result, "Result is wrong.");
	}

	@Test
	@DefaultLocale("en-us")
	public void testToStringEnUs() {
		String result = new XYPair(612.22f, 792.44f).toString();
		assertEquals("612.220 792.440", result, "Result is wrong.");
	}

	@Test
	@DefaultLocale("de-de")
	public void testMarshalXYPairDeDe() {
		XYPair p = new XYPair(612.22f, 792.44f);
		String result = new XYPair().marshal(p);
		assertEquals("612.220 792.440", result, "Result is wrong.");
	}

	@Test
	@DefaultLocale("en-us")
	public void testMarshalXYPairEnUs() {
		XYPair p = new XYPair(612.22f, 792.44f);
		String result = new XYPair().marshal(p);
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
		assertEquals(612.22d, p.getX(), 0.01f, "X is wrong.");
		assertEquals(792.44d, p.getY(), 0.01f, "Y is wrong.");
	}

	@Test
	public void testAdd() {

		// arrange
		XYPair p1 = new XYPair(1,2);
		XYPair p2 = new XYPair(3,4);

		// act
		XYPair result = p1.add(p2);

		// assert
		assertEquals(new XYPair(4,6), result, "The addition was wrong.");
	}

	@Test
	public void testSubtract() {

		// arrange
		XYPair p1 = new XYPair(1,2);
		XYPair p2 = new XYPair(3,4);

		// act
		XYPair result = p1.subtract(p2);

		// assert
		assertEquals(new XYPair(-2,-2), result, "The subtraction was wrong.");
	}

	@Test
	public void testScale() {
		assertEquals(new XYPair(2, 4), new XYPair(1, 2).scale(2), "The scaling was wrong.");
	}

	@Test
	public void testZeroConstant() {
		assertEquals(new XYPair(0, 0), XYPair.ZERO);
	}

	@Test
	public void testParseWithMixedWhitespace() {
		final XYPair p = XYPair.parse("  612.22\t792.44 ");

		assertEquals(612.22f, p.getX(), 0.01f);
		assertEquals(792.44f, p.getY(), 0.01f);
	}

	@Test
	public void testParseInvalid() {
		assertThrows(IllegalArgumentException.class, () -> XYPair.parse("1"));
		assertThrows(IllegalArgumentException.class, () -> XYPair.parse("1 2 3"));
		assertThrows(IllegalArgumentException.class, () -> XYPair.parse("a b"));
		assertThrows(IllegalArgumentException.class, () -> XYPair.parse(""));
	}
}
