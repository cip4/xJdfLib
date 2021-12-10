package org.cip4.lib.xjdf.type;

import org.junit.jupiter.api.Test;
import org.junitpioneer.jupiter.DefaultLocale;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit test case for XJDF Type Matrix.
 * @author stefan.meissner
 */
public class MatrixTest {

	@Test
	public void testNewInstance() {

		// arrange

		// act
		Matrix r = new Matrix();

		// assert
		assertEquals(1d, r.getA(), "a value is wrong.");
		assertEquals(0d, r.getB(), "b value is wrong.");
		assertEquals(0d, r.getC(), "c value is wrong.");
		assertEquals(1d, r.getD(), "d value is wrong.");
		assertEquals(0d, r.getTx(), "Tx value is wrong.");
		assertEquals(0d, r.getTy(), "Ty value is wrong.");
	}

	@Test
	public void testNewInstanceString() {

		// arrange
		final String VALUE = "1 0 0 1 3.14 21631.3";

		// act
		Matrix r = new Matrix(VALUE);

		// assert
		assertEquals(1f, r.getA(), "a value is wrong.");
		assertEquals(0f, r.getB(), "b value is wrong.");
		assertEquals(0f, r.getC(), "c value is wrong.");
		assertEquals(1f, r.getD(), "d value is wrong.");
		assertEquals(3.14f, r.getTx(), "Tx value is wrong.");
		assertEquals(21631.3f, r.getTy(), "Ty value is wrong.");
	}

	@Test
	public void testNewInstanceDoubleDoubleDoubleDoubleDoubleDouble() {

		// arrange
		final float a = 1f;
		final float b = 0f;
		final float c = 0f;
		final float d = 1f;
		final float tx = 3.14f;
		final float ty = 21631.3f;

		// act
		Matrix r = new Matrix(a, b, c, d, tx, ty);

		// assert
		assertEquals(1d, r.getA(), 0.01f, "a value is wrong.");
		assertEquals(0d, r.getB(), 0.01f, "b value is wrong.");
		assertEquals(0d, r.getC(), 0.01f, "c value is wrong.");
		assertEquals(1d, r.getD(), 0.01f, "d value is wrong.");
		assertEquals(3.14d, r.getTx(), 0.01f, "Tx value is wrong.");
		assertEquals(21631.3d, r.getTy(), 0.01f, "Ty value is wrong.");
	}

	@Test
	@DefaultLocale("de-de")
	public void testToStringDeDe() {

		// arrange
		final float a = 1f;
		final float b = 0f;
		final float c = 0f;
		final float d = 1f;
		final float tx = 3.14f;
		final float ty = 21631.3f;

		// act
		String actual = new Matrix(a, b, c, d, tx, ty).toString();

		// assert
		assertEquals("1.000 0.000 0.000 1.000 3.140 21631.301", actual, "String value is wrong.");
	}

	@Test
	@DefaultLocale("en-us")
	public void testToStringEnUs() {

		// arrange
		final float a = 1f;
		final float b = 0f;
		final float c = 0f;
		final float d = 1f;
		final float tx = 3.14f;
		final float ty = 21631.3f;

		// act
		String actual = new Matrix(a, b, c, d, tx, ty).toString();

		// assert
		assertEquals("1.000 0.000 0.000 1.000 3.140 21631.301", actual, "String value is wrong.");
	}

	@Test
	@DefaultLocale("de-de")
	public void testMarshalMatrixDeDe() {

		// arrange
		final float a = 1f;
		final float b = 0f;
		final float c = 0f;
		final float d = 1f;
		final float tx = 3.14f;
		final float ty = 21631.3f;

		// act
		Matrix r = new Matrix(a, b, c, d, tx, ty);
		String actual = new Matrix().marshal(r);

		// assert
		assertEquals("1.000 0.000 0.000 1.000 3.140 21631.301", actual, "String value is wrong.");
	}

	@Test
	@DefaultLocale("en-us")
	public void testMarshalMatrixEnUs() {

		// arrange
		final float a = 1f;
		final float b = 0f;
		final float c = 0f;
		final float d = 1f;
		final float tx = 3.14f;
		final float ty = 21631.3f;

		// act
		Matrix r = new Matrix(a, b, c, d, tx, ty);
		String actual = new Matrix().marshal(r);

		// assert
		assertEquals("1.000 0.000 0.000 1.000 3.140 21631.301", actual, "String value is wrong.");
	}

	@Test
	public void testUnmarshalString() {
		// arrange
		final String VALUE = "1 0 0 1 3.14 21631.3";

		// act
		Matrix r = new Matrix().unmarshal(VALUE);

		// assert
		assertEquals(1f, r.getA(), "a value is wrong.");
		assertEquals(0f, r.getB(), "b value is wrong.");
		assertEquals(0f, r.getC(), "c value is wrong.");
		assertEquals(1f, r.getD(), "d value is wrong.");
		assertEquals(3.14f, r.getTx(), "Tx value is wrong.");
		assertEquals(21631.3f, r.getTy(), "Ty value is wrong.");
	}

}
