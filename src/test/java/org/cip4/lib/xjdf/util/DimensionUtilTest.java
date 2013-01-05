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
package org.cip4.lib.xjdf.util;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * JUnit test case for DimensionUtil class.
 * @author s.meissner
 * @date 28.06.2012
 */
public class DimensionUtilTest {

	/**
	 * Setup unit test.
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
	 * Test method for {@link org.cip4.lib.xjdf.util.ConversionUtils#mm2Dtp(float)}.
	 */
	@Test
	public void testMm2Dtp() {

		// arrange
		final double mm = 10d;
		final double expected = 28.346457d;

		// act
		double actual = DimensionUtil.mm2Dtp(mm);

		// assert
		Assert.assertEquals("DTP-Points are wrong.", expected, actual, 0.00001);
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.util.ConversionUtils#dtp2Mm(float)}.
	 */
	@Test
	public void testDtp2Mm() {

		// arrange
		final double dtp = 28.346457d;
		final double expected = 10d;

		// act
		double actual = DimensionUtil.dtp2Mm(dtp);

		// assert
		Assert.assertEquals("Millimeters are wrong.", expected, actual, 0.00001);
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.util.ConversionUtils#dtp2MmS(java.lang.String)}.
	 */
	@Test
	public void testDtp2MmS() {

		// arrange
		final String dtp = "28.346457";
		final double expected = 10d;

		// act
		double actual = DimensionUtil.dtp2MmS(dtp);

		// assert
		Assert.assertEquals("Millimeters are wrong.", expected, actual, 0.00001);
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.util.ConversionUtils#mm2DtpS(float)}.
	 */
	@Test
	public void testMm2DtpS() {

		// arrange
		final double mm = 10d;
		final String expected = "28.34645669291339";

		// act
		String actual = DimensionUtil.mm2DtpS(mm);

		// assert
		Assert.assertEquals("DTP-Points are wrong.", expected, actual);
	}

}
