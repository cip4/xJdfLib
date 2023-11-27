package org.cip4.lib.xjdf.util;

import org.cip4.lib.xjdf.type.Rectangle;
import org.cip4.lib.xjdf.type.Shape;
import org.cip4.lib.xjdf.type.XYPair;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit test case for DimensionUtil class.
 * @author s.meissner
 */
public class DimensionsTest {

	@Test
	public void mm2Dtp_rectangle() {

		// arrange
		Rectangle rectangleMm = new Rectangle(10, 20, 30, 40);

		// act
		Rectangle rectangleDtp = Dimensions.mm2Dtp(rectangleMm);

		// assert
		assertEquals(28.34645f, rectangleDtp.getLlx(), 0.00001, "Llx is wrong.");
		assertEquals(56.69291f, rectangleDtp.getLly(), 0.00001, "Lly is wrong.");
		assertEquals(85.03937f, rectangleDtp.getUrx(), 0.00001, "Urx is wrong.");
		assertEquals(113.38582f, rectangleDtp.getUry(), 0.00001, "Ury is wrong.");
	}

	@Test
	public void dtp2Mm_rectangle() {

		// arrange
		Rectangle rectangleDtp = new Rectangle(10, 20, 30, 40);

		// act
		Rectangle rectangleMm = Dimensions.dtp2Mm(rectangleDtp);

		// assert
		assertEquals(3.52777f, rectangleMm.getLlx(), 0.00001, "Llx is wrong.");
		assertEquals(7.05555f, rectangleMm.getLly(), 0.00001, "Lly is wrong.");
		assertEquals(10.58333f, rectangleMm.getUrx(), 0.00001, "Urx is wrong.");
		assertEquals(14.11111f, rectangleMm.getUry(), 0.00001, "Ury is wrong.");
	}

	@Test
	public void mm2Dtp_xypair() {

		// arrange
		XYPair xyPairMm = new XYPair(10, 20);

		// act
		XYPair xyPairDtp = Dimensions.mm2Dtp(xyPairMm);

		// assert
		assertEquals(28.34645f, xyPairDtp.getX(), 0.00001, "X is wrong.");
		assertEquals(56.69291f, xyPairDtp.getY(), 0.00001, "Y is wrong.");
	}

	@Test
	public void dtp2Mm_xypair() {

		// arrange
		XYPair xyPairDtp = new XYPair(10, 20);

		// act
		XYPair xyPairMm = Dimensions.dtp2Mm(xyPairDtp);

		// assert
		assertEquals(3.52777f, xyPairMm.getX(), 0.00001, "X is wrong.");
		assertEquals(7.05555f, xyPairMm.getY(), 0.00001, "Y is wrong.");
	}

	@Test
	public void mm2Dtp_shape() {

		// arrange
		Shape shapeMm = new Shape(10, 20, 30);

		// act
		Shape shapeDtp = Dimensions.mm2Dtp(shapeMm);

		// assert
		assertEquals(28.34645f, shapeDtp.getX(), 0.00001, "X is wrong.");
		assertEquals(56.69291f, shapeDtp.getY(), 0.00001, "Y is wrong.");
		assertEquals(85.03937f, shapeDtp.getZ(), 0.00001, "Z is wrong.");
	}

	@Test
	public void dtp2Mm_shape() {

		// arrange
		Shape shapeDtp = new Shape(10, 20, 30);

		// act
		Shape shapeMm = Dimensions.dtp2Mm(shapeDtp);

		// assert
		assertEquals(3.52777f, shapeMm.getX(), 0.00001, "X is wrong.");
		assertEquals(7.05555f, shapeMm.getY(), 0.00001, "Y is wrong.");
		assertEquals(10.58333f, shapeMm.getZ(), 0.00001, "Z is wrong.");
	}

	@Test
	public void testMm2Dtp() {

		// arrange
		final double mm = 10d;
		final double expected = 28.346457d;

		// act
		double actual = Dimensions.mm2Dtp(mm);

		// assert
		assertEquals(expected, actual, 0.00001, "DTP-Points are wrong.");
	}

	@Test
	public void testDtp2Mm() {

		// arrange
		final double dtp = 28.346457d;
		final double expected = 10d;

		// act
		double actual = Dimensions.dtp2Mm(dtp);

		// assert
		assertEquals(expected, actual, 0.00001, "Millimeters are wrong.");
	}

	@Test
	public void testMm2DtpFloat() {

		// arrange
		final float mm = 10f;
		final float expected = 28.346457f;

		// act
		float actual = Dimensions.mm2Dtp(mm);

		// assert
		assertEquals(expected, actual, 0.00001, "DTP-Points are wrong.");
	}

	@Test
	public void testDtp2MmFloat() {

		// arrange
		final float dtp = 28.346457f;
		final float expected = 10f;

		// act
		float actual = Dimensions.dtp2Mm(dtp);

		// assert
		assertEquals(expected, actual, 0.00001, "Millimeters are wrong.");
	}

	@Test
	public void testDtp2MmS() {

		// arrange
		final String dtp = "28.346457";
		final double expected = 10d;

		// act
		double actual = Dimensions.dtp2MmS(dtp);

		// assert
		assertEquals(expected, actual, 0.00001, "Millimeters are wrong.");
	}

	@Test
	public void testMm2DtpS() {

		// arrange
		final double mm = 10d;
		final String expected = "28.34645669291339";

		// act
		String actual = Dimensions.mm2DtpS(mm);

		// assert
		assertEquals(expected, actual, "DTP-Points are wrong.");
	}

}
