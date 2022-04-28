package org.cip4.lib.xjdf.type;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junitpioneer.jupiter.DefaultLocale;

/**
 * JUnit test case for XJDF data type Shape.
 * @author stefan.meissner
 */
public class ShapeTest {

	@Test
	public void testNewInstance() {

		// arrange

		// act
		Shape s = new Shape();

		// assert
		assertEquals(0d, s.getX(), 0.1d, "X is wrong.");
		assertEquals(0d, s.getY(), 0.1d, "Y is wrong.");
		assertEquals(0d, s.getZ(), 0.1d, "Z is wrong.");
	}

	@Test
	public void testNewInstanceString() {

		// arrange
		final String value = "10.1 20.33 40";

		// act
		Shape s = new Shape(value);

		// assert
		assertEquals(10.1d, s.getX(), 0.1d, "X is wrong.");
		assertEquals(20.33d, s.getY(), 0.1d, "Y is wrong.");
		assertEquals(40d, s.getZ(), 0.1d, "Z is wrong.");
	}

	@Test
	public void testNewInstanceString_2() {

		// arrange
		final String value = "10.1 20.33";

		// act
		Shape s = new Shape(value);

		// assert
		assertEquals(10.1d, s.getX(), 0.1d, "X is wrong.");
		assertEquals(20.33d, s.getY(), 0.1d, "Y is wrong.");
		assertEquals(0, s.getZ(), 0.1d, "Z is wrong.");
	}

	@Test
	public void testNewInstanceString_3() {

		// arrange
		final String value = "10.1333";

		// act
		Shape s = new Shape(value);

		// assert
		assertEquals(10.1d, s.getX(), 0.1d, "X is wrong.");
		assertEquals(0, s.getY(), 0.1d, "Y is wrong.");
		assertEquals(0, s.getZ(), 0.1d, "Z is wrong.");
	}

	@Test
	public void testNewInstanceDoubleDoubleDouble() {

		// arrange

		// act
		Shape s = new Shape(10.1f, 20.33f, 40f);

		// assert
		assertEquals(10.1d, s.getX(), 0.1d, "X is wrong.");
		assertEquals(20.33d, s.getY(), 0.1d, "Y is wrong.");
		assertEquals(40d, s.getZ(), 0.1d, "Z is wrong.");
	}

	@Test
	public void testNewInstanceDoubleDouble() {

		// arrange

		// act
		Shape s = new Shape(10.1f, 20.33f);

		// assert
		assertEquals(10.1d, s.getX(), 0.1d, "X is wrong.");
		assertEquals(20.33d, s.getY(), 0.1d, "Y is wrong.");
		assertEquals(0d, s.getZ(), 0.1d, "Z is wrong.");
	}

	@Test
	@DefaultLocale("de-de")
	public void testToStringDeDe() {
		String result = new Shape(10.1f, 20.33f, 40f).toString();
		assertEquals("10.100 20.330 40.000", result, "String is wrong.");
	}

	@Test
	@DefaultLocale("en-us")
	public void testToStringEnUs() {
		String result = new Shape(10.1f, 20.33f, 40f).toString();
		assertEquals("10.100 20.330 40.000", result, "String is wrong.");
	}

	@Test
	@DefaultLocale("de-de")
	public void testMarshalShapeDeDe() {
		Shape s = new Shape(10.1f, 20.33f, 40f);
		String result = new Shape().marshal(s);
		assertEquals("10.100 20.330 40.000", result, "String is wrong.");
	}

	@Test
	@DefaultLocale("en-us")
	public void testMarshalShapeEnUs() {
		Shape s = new Shape(10.1f, 20.33f, 40f);
		String result = new Shape().marshal(s);
		assertEquals("10.100 20.330 40.000", result, "String is wrong.");
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.type.Shape#unmarshal(java.lang.String)}.
	 */
	@Test
	public void testUnmarshalString() {

		// arrange
		final String value = "10.1 20.33 40";

		// act
		Shape s = new Shape().unmarshal(value);

		// assert
		assertEquals(10.1d, s.getX(), 0.1d, "X is wrong.");
		assertEquals(20.33d, s.getY(), 0.1d, "Y is wrong.");
		assertEquals(40d, s.getZ(), 0.1d, "Z is wrong.");
	}

}
