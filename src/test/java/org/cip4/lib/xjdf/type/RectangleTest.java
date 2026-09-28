package org.cip4.lib.xjdf.type;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junitpioneer.jupiter.DefaultLocale;

/**
 * JUnit test case for XJDF Type Rectangle
 * @author stefan.meissner
 * @author michel.hartmann
 */
public class RectangleTest {

	@Test
	public void testNewInstance() {

		// arrange

		// act
		Rectangle r = new Rectangle();

		// assert
		assertEquals(0d, r.getLlx(), 0.01, "Llx is wrong.");
		assertEquals(0d, r.getLly(), 0.01, "Lly is wrong.");
		assertEquals(0d, r.getUrx(), 0.01, "Urx is wrong.");
		assertEquals(0d, r.getUry(), 0.01, "Ury is wrong.");
	}

	@Test
	public void testNewInstanceString() {

		// arrange
		final String value = "1 0 3.14 21631.3";

		// act
		Rectangle r = new Rectangle(value);

		// assert
		assertEquals(1d, r.getLlx(), 0.01, "Llx is wrong.");
		assertEquals(0d, r.getLly(), 0.01, "Lly is wrong.");
		assertEquals(3.14d, r.getUrx(), 0.01, "Urx is wrong.");
		assertEquals(21631.3d, r.getUry(), 0.01, "Ury is wrong.");
	}

	@Test
	public void testNewInstanceDoubleDoubleDoubleDouble() {

		// arrange

		// act
		Rectangle r = new Rectangle(1f, 0f, 3.14f, 21631.3f);

		// assert
		assertEquals(1f, r.getLlx(), 0.01, "Llx is wrong.");
		assertEquals(0f, r.getLly(), 0.01, "Lly is wrong.");
		assertEquals(3.14f, r.getUrx(), 0.01, "Urx is wrong.");
		assertEquals(21631.3f, r.getUry(), 0.01, "Ury is wrong.");
	}

	@Test
	public void testNewInstanceXYPair() {

		// arrange
		XYPair ll = new XYPair(1,2);
		XYPair ur = new XYPair(3,4);

		// act
		Rectangle r = new Rectangle(ll, ur);

		// assert
		assertEquals(1f, r.getLlx(), 0.01, "Llx is wrong.");
		assertEquals(2f, r.getLly(), 0.01, "Lly is wrong.");
		assertEquals(3f, r.getUrx(), 0.01, "Urx is wrong.");
		assertEquals(4f, r.getUry(), 0.01, "Ury is wrong.");
	}

	@Test
	@DefaultLocale("de-de")
	public void testToStringDeDe() {
		String result = new Rectangle(1f, 0f, 3.14f, 21631.3f).toString();
		assertEquals("1.000 0.000 3.140 21631.301", result, "Result is wrong.");
	}

	@Test
	@DefaultLocale("en-us")
	public void testToStringEnUs() {
		String result = new Rectangle(1f, 0f, 3.14f, 21631.3f).toString();
		assertEquals("1.000 0.000 3.140 21631.301", result, "Result is wrong.");
	}

	@Test
	@DefaultLocale("de-de")
	public void testMarshalRectangleDeDe() {
		Rectangle r = new Rectangle(1f, 0f, 3.14f, 21631.3f);
		String result = new Rectangle().marshal(r);
		assertEquals("1.000 0.000 3.140 21631.301", result, "Result is wrong.");
	}

	@Test
	@DefaultLocale("en-us")
	public void testMarshalRectangleEnUs() {
		Rectangle r = new Rectangle(1f, 0f, 3.14f, 21631.3f);
		String result = new Rectangle().marshal(r);
		assertEquals("1.000 0.000 3.140 21631.301", result, "Result is wrong.");
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.type.Rectangle#unmarshal(java.lang.String)}.
	 */
	@Test
	public void testUnmarshalString() {

		// arrange
		final String value = "1 0 3.14 21631.3";

		// act
		Rectangle r = new Rectangle().unmarshal(value);

		// assert
		assertEquals(1f, r.getLlx(), 0.01, "Llx is wrong.");
		assertEquals(0f, r.getLly(), 0.01, "Lly is wrong.");
		assertEquals(3.14f, r.getUrx(), 0.01, "Urx is wrong.");
		assertEquals(21631.3f, r.getUry(), 0.01, "Ury is wrong.");
	}

    @Test
    public void testEqualsNull() {
        Rectangle r = new Rectangle(1,2,3,4);
        assertNotEquals(null, r);
    }

    @Test
    public void testEquals() {
        Rectangle r = new Rectangle(1,2,3,4);
        assertEquals(new Rectangle(1,2,3,4), r);
    }

    @Test
    public void testHashCodeMatch() {
        Rectangle r = new Rectangle(1,2,3,4);
        assertEquals(new Rectangle(1,2,3,4).hashCode(), r.hashCode());
    }

    @Test
    public void testHashCodeMissmatch() {
        Rectangle r = new Rectangle(1,2,3,4);
        assertNotEquals(new Rectangle(0,2,3,4).hashCode(), r.hashCode());
    }

    @Test
    public void testWidth() {
		Rectangle r = new Rectangle(1,2,4,8);
		assertEquals(3, r.getWidth(), 0.001, "Width is wrong.");
	}

	@Test
	public void testHeight() {
		Rectangle r = new Rectangle(1,2,4,8);
		assertEquals(6, r.getHeight(), 0.001, "Height is wrong.");
	}

	@Test
	public void testSize() {
		Rectangle r = new Rectangle(1,2,4,8);
		assertEquals(new XYPair(3,6), r.getSize(),  "Size is wrong.");
	}

	@Test
	public void testLowerLeft() {
		Rectangle r = new Rectangle(1,2,4,8);
		assertEquals(new XYPair(1,2), r.getLowerLeft(),  "Size is wrong.");
	}

	@Test
	public void testUpperRight() {
		Rectangle r = new Rectangle(1,2,4,8);
		assertEquals(new XYPair(4,8), r.getUpperRight(),  "Size is wrong.");
	}

	@Test
	public void testLowerRight() {
		Rectangle r = new Rectangle(1,2,4,8);
		assertEquals(new XYPair(4,2), r.getLowerRight(),  "Size is wrong.");
	}

	@Test
	public void testUpperLeft() {
		Rectangle r = new Rectangle(1,2,4,8);
		assertEquals(new XYPair(1,8), r.getUpperLeft(),  "Size is wrong.");
	}

	/**
	 * Derived getters must match freshly-computed expectations for a range of inputs,
	 * regardless of which constructor was used to build the Rectangle.
	 */
	@ParameterizedTest
	@CsvSource({
			"0, 0, 0, 0",
			"1, 2, 4, 8",
			"-5, -5, 5, 5",
			"10, 20, 3, 4",
			"0.5, 1.25, 3.75, 9.5",
			"-100.5, 200.25, -50.75, 300.0"
	})
	public void testDerivedGettersMatchComputedExpectations_floatCtor(float llx, float lly, float urx, float ury) {
		Rectangle r = new Rectangle(llx, lly, urx, ury);
		assertDerivedValuesMatchExpectations(r, llx, lly, urx, ury);
	}

	@ParameterizedTest
	@CsvSource({
			"0, 0, 0, 0",
			"1, 2, 4, 8",
			"-5, -5, 5, 5",
			"10, 20, 3, 4",
			"0.5, 1.25, 3.75, 9.5"
	})
	public void testDerivedGettersMatchComputedExpectations_xyPairCtor(float llx, float lly, float urx, float ury) {
		Rectangle r = new Rectangle(new XYPair(llx, lly), new XYPair(urx, ury));
		assertDerivedValuesMatchExpectations(r, llx, lly, urx, ury);
	}

	@ParameterizedTest
	@CsvSource({
			"0, 0, 0, 0",
			"1, 2, 4, 8",
			"-5, -5, 5, 5",
			"10, 20, 3, 4",
			"0.5, 1.25, 3.75, 9.5"
	})
	public void testDerivedGettersMatchComputedExpectations_stringCtor(float llx, float lly, float urx, float ury) {
		String expression = String.format(java.util.Locale.US, "%s %s %s %s", llx, lly, urx, ury);
		Rectangle r = new Rectangle(expression);
		assertDerivedValuesMatchExpectations(r, llx, lly, urx, ury);
	}

	@Test
	public void testDerivedGettersMatchComputedExpectations_noArgCtor() {
		Rectangle r = new Rectangle();
		assertDerivedValuesMatchExpectations(r, 0f, 0f, 0f, 0f);
	}

	private void assertDerivedValuesMatchExpectations(Rectangle r, float llx, float lly, float urx, float ury) {
		assertEquals(urx - llx, r.getWidth(), 0.0001, "Width is wrong.");
		assertEquals(ury - lly, r.getHeight(), 0.0001, "Height is wrong.");
		assertEquals(new XYPair(urx - llx, ury - lly), r.getSize(), "Size is wrong.");
		assertEquals(new XYPair(llx, lly), r.getLowerLeft(), "LowerLeft is wrong.");
		assertEquals(new XYPair(urx, lly), r.getLowerRight(), "LowerRight is wrong.");
		assertEquals(new XYPair(urx, ury), r.getUpperRight(), "UpperRight is wrong.");
		assertEquals(new XYPair(llx, ury), r.getUpperLeft(), "UpperLeft is wrong.");
	}
}
