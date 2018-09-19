package org.cip4.lib.xjdf.type;

import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.TimeZone;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * JUnit Test Case for XJDF DateTime
 */
public class DateTimeTest {

	@Test
	public void dateTimeToString() {
		final String expected = "2012-03-04T16:20:45Z";

        final String actual = new DateTime(2012, Calendar.MARCH, 4, 16, 20, 45).toString();

		assertEquals(expected, actual, "DateTime format is wrong.");
	}

    @Test
    public void dateTimeToString2() throws Exception {
        final String expected = "2012-03-04T13:20:40Z";

        final String actual = new DateTime(expected).toString();

        assertEquals(expected, actual, "Date is wrong.");
    }

	@Test
	public void dateTimeToStringUTC() {
        final String expected = "2012-03-04T16:20:45Z";

        final String actual = new DateTime(2012, Calendar.MARCH, 4, 16, 20, 45)
            .toString(TimeZone.getTimeZone("UTC"));

		assertEquals(expected, actual, "DateTime format is wrong.");
	}

	@Test
	public void dateTimeToStringBerlin() {
        final String expected = "2012-03-04T13:20:40+01:00";

        final String actual = new DateTime(2012, Calendar.MARCH, 4, 12, 20, 40)
            .toString(TimeZone.getTimeZone("Europe/Berlin"));

		assertEquals(expected, actual, "Date format is wrong.");
	}

	@Test
	public void dateTimeToStringPacific() {
        final String expected = "2012-03-04T06:20:40-08:00";

        final String actual = new DateTime(2012, Calendar.MARCH, 4, 14, 20, 40)
            .toString(TimeZone.getTimeZone("US/Pacific"));

		assertEquals(expected, actual, "Date format is wrong.");
	}

	@Test
	public void dateTimeToStringHawaii() {
		final String expected = "2012-03-04T06:20:40-10:00";

        final String actual = new DateTime(2012, Calendar.MARCH, 4, 16, 20, 40)
            .toString(TimeZone.getTimeZone("US/Hawaii"));

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
    public void createDateTimeWithTimeZoneISO8601() throws Exception {
        final String dateTimeString = "2015-08-06T12:00:00+02:00";
        final String expectedDateTimeStringUTC = "2015-08-06T10:00:00Z";

        final DateTime dateTime = new DateTime(dateTimeString);

        assertEquals(dateTimeString, dateTime.toString(TimeZone.getTimeZone("Europe/Berlin")), "Date format is wrong.");
        assertEquals(expectedDateTimeStringUTC, dateTime.toString(TimeZone.getTimeZone("UTC")), "Date format is wrong.");
        assertEquals(expectedDateTimeStringUTC, dateTime.toString(), "Date format is wrong.");
    }

	@Test
	public void createDateTimeWithTimeZoneRFC822() throws Exception {
		final String dateTimeString = "2015-08-06T12:00:00+0200";
        final String dateTimeStringISO8601 = "2015-08-06T12:00:00+02:00";
		final String expectedDateTimeStringUTC = "2015-08-06T10:00:00Z";

		final DateTime dateTime = new DateTime(dateTimeString);

		assertEquals(dateTimeStringISO8601, dateTime.toString(TimeZone.getTimeZone("Europe/Berlin")), "Date format is wrong.");
		assertEquals(expectedDateTimeStringUTC, dateTime.toString(TimeZone.getTimeZone("UTC")), "Date format is wrong.");
		assertEquals(expectedDateTimeStringUTC, dateTime.toString(), "Date format is wrong.");
	}

}
