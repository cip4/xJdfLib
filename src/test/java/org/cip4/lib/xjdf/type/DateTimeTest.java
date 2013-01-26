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
package org.cip4.lib.xjdf.type;

import java.util.Calendar;
import java.util.TimeZone;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * JUnit Test Case for XJDF DateTime
 * @author stefan.meissner
 * @date 05.01.2013
 */
public class DateTimeTest {

	/**
	 * Set up unit test.
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
	 * Test method for {@link org.cip4.lib.xjdf.type.DateTime#toString()}.
	 */
	@Test
	public void testToString() throws Exception {

		// arrange
		String expected = "2012-03-04T16:20:45Z";

		Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
		calendar.set(2012, Calendar.MARCH, 4, 16, 20, 45);

		// act
		String actual = new DateTime(calendar).toString();

		// assert
		System.out.println("Result UTC: " + actual);
		Assert.assertEquals("DateTime format is wrong.", expected, actual);
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.type.DateTime#marshal(org.cip4.lib.xjdf.type.DateTime)}.
	 */
	@Test
	public void testMarshalDateTimeUTC() throws Exception {

		// arrange
		String expected = "2012-03-04T16:20:45Z";

		Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
		calendar.set(2012, Calendar.MARCH, 4, 16, 20, 45);

		// act
		DateTime r = new DateTime(calendar);
		String actual = new DateTime().marshal(r);

		// assert
		System.out.println("Result UTC: " + actual);
		Assert.assertEquals("DateTime format is wrong.", expected, actual);
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.type.DateTime#marshal(org.cip4.lib.xjdf.type.DateTime)}.
	 */
	@Test
	public void testMarshalDateTimeBerlin() throws Exception {

		// arrange
		String expected = "2012-03-04T13:20:40+01:00";

		Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Europe/Berlin"));
		calendar.set(2012, Calendar.MARCH, 4, 13, 20, 40);

		// act
		DateTime r = new DateTime(calendar);
		String actual = new DateTime().marshal(r);

		// assert
		System.out.println("Result TimeZone 'Europe/Berlin': " + actual);
		Assert.assertEquals("Date format is wrong.", expected, actual);
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.type.DateTime#marshal(org.cip4.lib.xjdf.type.DateTime)}.
	 */
	@Test
	public void testMarshalDateTimePacific() throws Exception {

		// arrange
		String expected = "2012-03-04T06:20:40-08:00";

		Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("US/Pacific"));
		calendar.set(2012, Calendar.MARCH, 4, 6, 20, 40);

		// act
		DateTime r = new DateTime(calendar);
		String actual = new DateTime().marshal(r);

		// assert
		System.out.println("Result TimeZone 'US/Pacific': " + actual);
		Assert.assertEquals("Date format is wrong.", expected, actual);
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.type.DateTime#marshal(org.cip4.lib.xjdf.type.DateTime)}.
	 */
	@Test
	public void testMarshalDateTimeHawaii() throws Exception {

		// arrange
		String expected = "2012-03-04T06:20:40-10:00";

		Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("US/Hawaii"));
		calendar.set(2012, Calendar.MARCH, 4, 6, 20, 40);

		// act
		DateTime r = new DateTime(calendar);
		String actual = new DateTime().marshal(r);

		// assert
		System.out.println("Result TimeZone 'US/Pacific': " + actual);
		Assert.assertEquals("Date format is wrong.", expected, actual);
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.type.DateTime#marshal(org.cip4.lib.xjdf.type.DateTime)}.
	 */
	@Test
	public void testMarshalDateTimeVladivostok() throws Exception {

		// arrange
		String expected = "2012-03-04T06:20:40+11:00";

		Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Asia/Vladivostok"));
		calendar.set(2012, Calendar.MARCH, 4, 6, 20, 40);

		// act
		DateTime r = new DateTime(calendar);
		String actual = new DateTime().marshal(r);

		// assert
		System.out.println("Result TimeZone 'US/Pacific': " + actual);
		Assert.assertEquals("Date format is wrong.", expected, actual);
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.type.DateTime#unmarshal(java.lang.String)}.
	 */
	@Test
	public void testUnmarshalStringUTC() throws Exception {

		// arrange
		final String strDate = "2012-03-04T13:20:40Z";

		// act
		DateTime r = new DateTime().unmarshal(strDate);
		Calendar cal = r.getCalendar();

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
	 * Test method for {@link org.cip4.lib.xjdf.type.DateTime#unmarshal(java.lang.String)}.
	 */
	@Test
	public void testUnmarshalStringBerlin() throws Exception {

		// arrange
		final String strDate = "2012-03-04T13:20:40+01:00";

		// act
		DateTime r = new DateTime().unmarshal(strDate);
		Calendar cal = r.getCalendar();

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
	 * Test method for {@link org.cip4.lib.xjdf.type.DateTime#unmarshal(java.lang.String)}.
	 */
	@Test
	public void testUnmarshalStringPacifc() throws Exception {

		// arrange
		final String strDate = "2012-11-04T15:30:40-08:00";

		// act
		DateTime r = new DateTime().unmarshal(strDate);
		Calendar cal = r.getCalendar();

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
	 * Test method for {@link org.cip4.lib.xjdf.type.DateTime#marshal(org.cip4.lib.xjdf.type.DateTime)}.
	 */
	@Test
	public void testUnmarshalStringHawaii() throws Exception {

		// arrange
		String strDate = "2012-03-04T06:20:40-10:00";

		// act
		DateTime r = new DateTime().unmarshal(strDate);
		Calendar cal = r.getCalendar();

		// assert
		Assert.assertEquals("Year is wrong.", 2012, cal.get(Calendar.YEAR));
		Assert.assertEquals("Month is wrong.", Calendar.MARCH, cal.get(Calendar.MONTH));
		Assert.assertEquals("Day is wrong.", 4, cal.get(Calendar.DAY_OF_MONTH));
		Assert.assertEquals("Hour is wrong.", 6, cal.get(Calendar.HOUR_OF_DAY));
		Assert.assertEquals("Minutes is wrong.", 20, cal.get(Calendar.MINUTE));
		Assert.assertEquals("Secondes is wrong.", 40, cal.get(Calendar.SECOND));
		Assert.assertEquals("TimeZone is wrong.", -3600 * 1000 * 10, cal.get(Calendar.ZONE_OFFSET));
	}

	/**
	 * Test method for marshal and unmarshal in combination.
	 * @throws Exception
	 */
	@Test
	public void testMarshalUnmarshalBerlin() throws Exception {

		// arrange
		final String strDate = "2012-03-04T13:20:40+01:00";

		// act
		DateTime dt = new DateTime().unmarshal(strDate);
		String actual = new DateTime().marshal(dt);

		// assert
		Assert.assertEquals("Date is wrong.", strDate, actual);

	}

	/**
	 * Test method for marshal and unmarshal in combination.
	 * @throws Exception
	 */
	@Test
	public void testMarshalUnmarshalUTC() throws Exception {

		// arrange
		final String strDate = "2012-03-04T13:20:40Z";

		// act
		DateTime dt = new DateTime().unmarshal(strDate);
		String actual = new DateTime().marshal(dt);

		// assert
		Assert.assertEquals("Date is wrong.", strDate, actual);

	}

	/**
	 * Test method for marshal and unmarshal in combination.
	 * @throws Exception
	 */
	@Test
	public void testMarshalUnmarshalPacific() throws Exception {

		// arrange
		final String strDate = "2012-03-04T13:20:40-08:00";

		// act
		DateTime dt = new DateTime().unmarshal(strDate);
		String actual = new DateTime().marshal(dt);

		// assert
		Assert.assertEquals("Date is wrong.", strDate, actual);

	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.type.DateTime#unmarshal(java.lang.String)}.
	 */
	@Test
	public void testMarshalString() throws Exception {

		// arrange
		final DateTime date = new DateTime(2012, 11, 04, 15, 30);

		// act
		String r = new DateTime().marshal(date);

		// assert
		Assert.assertTrue("Date is wrong.", r.startsWith("2012-11-04T15:30:00"));
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.type.DateTime#unmarshal(java.lang.String)}.
	 */
	@Test
	public void testMarshalString2() throws Exception {

		// arrange
		final DateTime date = new DateTime(2012, 11, 04);

		// act
		String r = new DateTime().marshal(date);

		// assert
		Assert.assertTrue("Date is wrong.", r.startsWith("2012-11-04T23:59:00"));
	}
}
