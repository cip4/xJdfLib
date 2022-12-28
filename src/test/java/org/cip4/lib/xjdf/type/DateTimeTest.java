package org.cip4.lib.xjdf.type;

import org.junit.jupiter.api.Test;

import java.time.ZoneId;
import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * JUnit Test Case for XJDF DateTime
 */
public class DateTimeTest {

	@Test
	public void dateTimeToString_1() {
		final String expected = "2012-03-04T16:20:45.999Z";

        final String actual = new DateTime(2012, 3, 4, 16, 20, 45, 999, ZoneId.of("UTC")).toString();

		assertEquals(expected, actual, "DateTime format is wrong.");
	}

    @Test
    public void dateTimeToString_2() throws Exception {
        final String expected = "2012-03-04T13:20:40.123Z";

        final String actual = new DateTime(expected).toString();

        assertEquals(expected, actual, "Date is wrong.");
    }

	@Test
	public void dateTimeToString_3() throws Exception {
		final String expected = "2012-03-04T13:20:40.123+03:00";

		final String actual = new DateTime(expected).toString();

		assertEquals(expected, actual, "Date is wrong.");
	}

	@Test
	public void dateTimeToStringUTC() {
        final String expected = "2012-03-04T16:20:45.042Z";

        final String actual = new DateTime(2012, 3, 4, 16, 20, 45, 42, ZoneId.of("UTC")).toString();

		assertEquals(expected, actual, "DateTime format is wrong.");
	}

	@Test
	public void dateTimeToStringBerlin() {
        final String expected = "2012-03-04T12:20:40.123+01:00";

        final String actual = new DateTime(2012, 3, 4, 12, 20, 40, 123, ZoneId.of("Europe/Berlin")).toString();

		assertEquals(expected, actual, "Date format is wrong.");
	}

	@Test
	public void dateTimeToStringPacific() {
        final String expected = "2012-03-04T12:20:40.000-08:00";

		final String actual = new DateTime(2012, 3, 4, 12, 20, 40, 0, ZoneId.of("US/Pacific")).toString();

		assertEquals(expected, actual, "Date format is wrong.");
	}

	@Test
	public void dateTimeToStringHawaii() {
		final String expected = "2012-03-04T06:20:40.000-10:00";

		final String actual = new DateTime(2012, 3, 4, 16, 20, 40, 0, ZoneId.of("UTC"))
			.toString(ZoneId.of("US/Hawaii"));


		assertEquals(expected, actual, "Date format is wrong.");
	}

	@Test
	public void createDateTimeUTC() throws Exception {
		final String dateTimeString = "2012-03-04T13:20:40Z";

        final DateTime dateTime = new DateTime(dateTimeString);
		final Calendar cal = dateTime.getCalendar();

		assertEquals(2012, cal.get(Calendar.YEAR), "Year is wrong.");
		assertEquals(Calendar.MARCH, cal.get(Calendar.MONTH), "Month is wrong.");
		assertEquals(4, cal.get(Calendar.DAY_OF_MONTH), "Day is wrong.");
		assertEquals(13, cal.get(Calendar.HOUR_OF_DAY), "Hour is wrong.");
		assertEquals(20, cal.get(Calendar.MINUTE), "Minutes are wrong.");
		assertEquals(40, cal.get(Calendar.SECOND), "Secondes are wrong.");
		assertEquals(0, cal.get(Calendar.ZONE_OFFSET), "TimeZone is wrong.");
	}

    @Test
    public void createDateTimeWithTimeZone_1() throws Exception {
        final String dateTimeString = "2015-08-06T12:00:00.000+02:00";
        final String expectedDateTimeStringUTC = "2015-08-06T10:00:00.000Z";

        final DateTime dateTime = new DateTime(dateTimeString);

        assertEquals(dateTimeString, dateTime.toString(ZoneId.of("Europe/Berlin")), "Date format is wrong.");
        assertEquals(expectedDateTimeStringUTC, dateTime.toString(ZoneId.of("UTC")), "Date format is wrong.");
    }

	@Test
	public void createDateTimeWithTimeZone_2() throws Exception {
		final String dateTimeString = "2015-08-06T12:00:00+02:00";
        final String dateTimeStringISO8601 = "2015-08-06T12:00:00.000+02:00";
		final String expectedDateTimeStringUTC = "2015-08-06T10:00:00.000Z";

		final DateTime dateTime = new DateTime(dateTimeString);

		assertEquals(dateTimeStringISO8601, dateTime.toString(ZoneId.of("Europe/Berlin")), "Date format is wrong.");
		assertEquals(expectedDateTimeStringUTC, dateTime.toString(ZoneId.of("UTC")), "Date format is wrong.");
	}

}
