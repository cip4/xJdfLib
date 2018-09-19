package org.cip4.lib.xjdf.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit test case for DimensionUtil class.
 * @author s.meissner
 */
public class DimensionUtilTest {

	@Test
	public void testMm2Dtp() {

		// arrange
		final double mm = 10d;
		final double expected = 28.346457d;

		// act
		double actual = DimensionUtil.mm2Dtp(mm);

		// assert
		assertEquals(expected, actual, 0.00001, "DTP-Points are wrong.");
	}

	@Test
	public void testDtp2Mm() {

		// arrange
		final double dtp = 28.346457d;
		final double expected = 10d;

		// act
		double actual = DimensionUtil.dtp2Mm(dtp);

		// assert
		assertEquals(expected, actual, 0.00001, "Millimeters are wrong.");
	}

	@Test
	public void testMm2DtpFloat() {

		// arrange
		final float mm = 10f;
		final float expected = 28.346457f;

		// act
		float actual = DimensionUtil.mm2Dtp(mm);

		// assert
		assertEquals(expected, actual, 0.00001, "DTP-Points are wrong.");
	}

	@Test
	public void testDtp2MmFloat() {

		// arrange
		final float dtp = 28.346457f;
		final float expected = 10f;

		// act
		float actual = DimensionUtil.dtp2Mm(dtp);

		// assert
		assertEquals(expected, actual, 0.00001, "Millimeters are wrong.");
	}

	@Test
	public void testDtp2MmS() {

		// arrange
		final String dtp = "28.346457";
		final double expected = 10d;

		// act
		double actual = DimensionUtil.dtp2MmS(dtp);

		// assert
		assertEquals(expected, actual, 0.00001, "Millimeters are wrong.");
	}

	@Test
	public void testMm2DtpS() {

		// arrange
		final double mm = 10d;
		final String expected = "28.34645669291339";

		// act
		String actual = DimensionUtil.mm2DtpS(mm);

		// assert
		assertEquals(expected, actual, "DTP-Points are wrong.");
	}

}
