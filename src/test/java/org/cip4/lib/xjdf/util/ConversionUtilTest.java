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

import java.text.ParseException;
import java.util.Calendar;
import java.util.TimeZone;

import junit.framework.Assert;

import org.junit.Test;

/**
 * JUnit Test Case for ConversionUtil class.
 * @author stefan.meissner
 * @date 21.03.2012
 */
public class ConversionUtilTest {

	/**
	 * Test method for {@link org.cip4.lib.xjdf.util.ConversionUtil#date2String(java.util.Date)}.
	 */
	@Test
	public void testDate2StringUTC() {

		// arrange
		String expected = "2012-03-04T16:20:45Z";

		Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
		calendar.set(2012, Calendar.MARCH, 4, 16, 20, 45);

		// act
		String actual = ConversionUtil.date2String(calendar);

		// assert
		System.out.println("Result UTC: " + actual);
		Assert.assertEquals("Date format is wrong.", expected, actual);
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.util.ConversionUtil#date2String(java.util.Date)}.
	 */
	@Test
	public void testDate2StringBerlin() {

		// arrange
		String expected = "2012-03-04T13:20:40+01:00";

		Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Europe/Berlin"));
		calendar.set(2012, Calendar.MARCH, 4, 13, 20, 40);

		// act
		String actual = ConversionUtil.date2String(calendar);

		// assert
		System.out.println("Result other TimeZone: " + actual);
		Assert.assertEquals("Date format is wrong.", expected, actual);
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.util.ConversionUtil#date2String(java.util.Date)}.
	 */
	@Test
	public void testDate2StringPacific() {

		// arrange
		String expected = "2012-03-04T06:20:40-08:00";

		Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("US/Pacific"));
		calendar.set(2012, Calendar.MARCH, 4, 6, 20, 40);

		// act
		String actual = ConversionUtil.date2String(calendar);

		// assert
		System.out.println("Result other TimeZone: " + actual);
		Assert.assertEquals("Date format is wrong.", expected, actual);
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.util.ConversionUtil#string2Date(java.lang.String)}.
	 * @throws ParseException
	 */
	@Test
	public void testString2DateUTC() throws ParseException {

		// arrange
		final String strDate = "2012-03-04T13:20:40Z";

		// act
		Calendar cal = ConversionUtil.string2Date(strDate);

		// assert
		Assert.assertEquals("Year is wrong.", 2012, cal.get(Calendar.YEAR));
		Assert.assertEquals("Month is wrong.", Calendar.MARCH, cal.get(Calendar.MONTH));
		Assert.assertEquals("Day is wrong.", 4, cal.get(Calendar.DAY_OF_MONTH));
		Assert.assertEquals("Hour is wrong.", 13, cal.get(Calendar.HOUR_OF_DAY));
		Assert.assertEquals("Minutes are wrong.", 20, cal.get(Calendar.MINUTE));
		Assert.assertEquals("Secondes are wrong.", 40, cal.get(Calendar.SECOND));
		Assert.assertEquals("TimeZone is wrong.", 0, cal.get(Calendar.ZONE_OFFSET));
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.util.ConversionUtil#string2Date(java.lang.String)}.
	 * @throws ParseException
	 */
	@Test
	public void testString2DateBerlin() throws ParseException {

		// arrange
		final String strDate = "2012-03-04T13:20:40+01:00";

		// act
		Calendar cal = ConversionUtil.string2Date(strDate);

		// assert
		Assert.assertEquals("Year is wrong.", 2012, cal.get(Calendar.YEAR));
		Assert.assertEquals("Month is wrong.", Calendar.MARCH, cal.get(Calendar.MONTH));
		Assert.assertEquals("Day is wrong.", 4, cal.get(Calendar.DAY_OF_MONTH));
		Assert.assertEquals("Hour is wrong.", 13, cal.get(Calendar.HOUR_OF_DAY));
		Assert.assertEquals("Minutes is wrong.", 20, cal.get(Calendar.MINUTE));
		Assert.assertEquals("Secondes is wrong.", 40, cal.get(Calendar.SECOND));
		Assert.assertEquals("TimeZone is wrong.", 3600000, cal.get(Calendar.ZONE_OFFSET));
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.util.ConversionUtil#string2Date(java.lang.String)}.
	 * @throws ParseException
	 */
	@Test
	public void testString2DatePacifc() throws ParseException {

		// arrange
		final String strDate = "2012-11-04T15:30:40-08:00";

		// act
		Calendar cal = ConversionUtil.string2Date(strDate);

		// assert
		Assert.assertEquals("Year is wrong.", 2012, cal.get(Calendar.YEAR));
		Assert.assertEquals("Month is wrong.", Calendar.NOVEMBER, cal.get(Calendar.MONTH));
		Assert.assertEquals("Day is wrong.", 4, cal.get(Calendar.DAY_OF_MONTH));
		Assert.assertEquals("Hour is wrong.", 15, cal.get(Calendar.HOUR_OF_DAY));
		Assert.assertEquals("Minutes is wrong.", 30, cal.get(Calendar.MINUTE));
		Assert.assertEquals("Secondes is wrong.", 40, cal.get(Calendar.SECOND));
		Assert.assertEquals("TimeZone is wrong.", -28800000, cal.get(Calendar.ZONE_OFFSET));
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.util.ConversionUtil#string2Date(java.lang.String)}.
	 * @throws ParseException
	 */
	@Test
	public void testForwardAndBackwardBerlin() throws ParseException {

		// arrange
		final String strDate = "2012-03-04T13:20:40+01:00";

		// act
		Calendar calendar = ConversionUtil.string2Date(strDate);
		String actual = ConversionUtil.date2String(calendar);

		// assert
		Assert.assertEquals("Date is wrong.", strDate, actual);

	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.util.ConversionUtil#string2Date(java.lang.String)}.
	 * @throws ParseException
	 */
	@Test
	public void testForwardAndBackwardUTC() throws ParseException {

		// arrange
		final String strDate = "2012-03-04T13:20:40Z";

		// act
		Calendar calendar = ConversionUtil.string2Date(strDate);
		String actual = ConversionUtil.date2String(calendar);

		// assert
		Assert.assertEquals("Date is wrong.", strDate, actual);

	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.util.ConversionUtil#string2Date(java.lang.String)}.
	 * @throws ParseException
	 */
	@Test
	public void testForwardAndBackwardPacific() throws ParseException {

		// arrange
		final String strDate = "2012-03-04T13:20:40-08:00";

		// act
		Calendar calendar = ConversionUtil.string2Date(strDate);
		String actual = ConversionUtil.date2String(calendar);

		// assert
		Assert.assertEquals("Date is wrong.", strDate, actual);

	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.util.ConversionUtil#mm2Dtp(float)}.
	 */
	@Test
	public void testMm2Dtp() {

		// arrange
		final double mm = 10d;
		final double expected = 28.346457d;

		// act
		double actual = ConversionUtil.mm2Dtp(mm);

		// assert
		Assert.assertEquals("DTP-Points are wrong.", expected, actual, 0.00001);
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.util.ConversionUtil#dtp2Mm(float)}.
	 */
	@Test
	public void testDtp2Mm() {

		// arrange
		final double dtp = 28.346457d;
		final double expected = 10d;

		// act
		double actual = ConversionUtil.dtp2Mm(dtp);

		// assert
		Assert.assertEquals("Millimeters are wrong.", expected, actual, 0.00001);
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.util.ConversionUtil#dtp2MmS(java.lang.String)}.
	 */
	@Test
	public void testDtp2MmS() {

		// arrange
		final String dtp = "28.346457";
		final double expected = 10d;

		// act
		double actual = ConversionUtil.dtp2MmS(dtp);

		// assert
		Assert.assertEquals("Millimeters are wrong.", expected, actual, 0.00001);
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.util.ConversionUtil#mm2DtpS(float)}.
	 */
	@Test
	public void testMm2DtpS() {

		// arrange
		final double mm = 10d;
		final String expected = "28.34645669291339";

		// act
		String actual = ConversionUtil.mm2DtpS(mm);

		// assert
		Assert.assertEquals("DTP-Points are wrong.", expected, actual);
	}
}
