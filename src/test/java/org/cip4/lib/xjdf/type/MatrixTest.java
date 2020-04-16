package org.cip4.lib.xjdf.type;

import org.junit.jupiter.api.Test;

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
		assertEquals(1d, r.getA(), "a value is wrong.");
		assertEquals(0d, r.getB(), "b value is wrong.");
		assertEquals(0d, r.getC(), "c value is wrong.");
		assertEquals(1d, r.getD(), "d value is wrong.");
		assertEquals(3.14d, r.getTx(), "Tx value is wrong.");
		assertEquals(21631.3d, r.getTy(), "Ty value is wrong.");
	}

	@Test
	public void testNewInstanceDoubleDoubleDoubleDoubleDoubleDouble() {

		// arrange
		final double a = 1d;
		final double b = 0d;
		final double c = 0d;
		final double d = 1d;
		final double tx = 3.14d;
		final double ty = 21631.3d;

		// act
		Matrix r = new Matrix(a, b, c, d, tx, ty);

		// assert
		assertEquals(1d, r.getA(), "a value is wrong.");
		assertEquals(0d, r.getB(), "b value is wrong.");
		assertEquals(0d, r.getC(), "c value is wrong.");
		assertEquals(1d, r.getD(), "d value is wrong.");
		assertEquals(3.14d, r.getTx(), "Tx value is wrong.");
		assertEquals(21631.3d, r.getTy(), "Ty value is wrong.");
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.type.Matrix#toString()}.
	 */
	@Test
	public void testToString() {

		// arrange
		final double a = 1d;
		final double b = 0d;
		final double c = 0d;
		final double d = 1d;
		final double tx = 3.14d;
		final double ty = 21631.3d;

		// act
		String actual = new Matrix(a, b, c, d, tx, ty).toString();

		// assert
		assertEquals("1.000 0.000 0.000 1.000 3.140 21631.300", actual, "String value is wrong.");
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.type.Matrix#marshal(org.cip4.lib.xjdf.type.Matrix)}.
	 */
	@Test
	public void testMarshalMatrix() {

		// arrange
		final double a = 1d;
		final double b = 0d;
		final double c = 0d;
		final double d = 1d;
		final double tx = 3.14d;
		final double ty = 21631.3d;

		// act
		Matrix r = new Matrix(a, b, c, d, tx, ty);
		String actual = new Matrix().marshal(r);

		// assert
		assertEquals("1.000 0.000 0.000 1.000 3.140 21631.300", actual, "String value is wrong.");
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.type.Matrix#unmarshal(java.lang.String)}.
	 */
	@Test
	public void testUnmarshalString() {
		// arrange
		final String VALUE = "1 0 0 1 3.14 21631.3";

		// act
		Matrix r = new Matrix().unmarshal(VALUE);

		// assert
		assertEquals(1d, r.getA(), "a value is wrong.");
		assertEquals(0d, r.getB(), "b value is wrong.");
		assertEquals(0d, r.getC(), "c value is wrong.");
		assertEquals(1d, r.getD(), "d value is wrong.");
		assertEquals(3.14d, r.getTx(), "Tx value is wrong.");
		assertEquals(21631.3d, r.getTy(), "Ty value is wrong.");
	}

}
