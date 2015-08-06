package org.cip4.lib.xjdf.type;

import org.junit.Test;

import java.util.Calendar;
import java.util.TimeZone;

import static org.junit.Assert.assertEquals;

/**
 * JUnit Test Case for XJDF DateTime
 */
public class DateTimeTest {

	@Test
	public void dateTimeToString() throws Exception {
		final String expected = "2012-03-04T16:20:45Z";

        final String actual = new DateTime(2012, Calendar.MARCH, 4, 16, 20, 45).toString();

		System.out.println("Result UTC: " + actual);
		assertEquals("DateTime format is wrong.", expected, actual);
	}

    @Test
    public void dateTimeToString2() throws Exception {
        final String expected = "2012-03-04T13:20:40Z";

        final String actual = new DateTime(expected).toString();

        assertEquals("Date is wrong.", expected, actual);
    }

	@Test
	public void dateTimeToStringUTC() throws Exception {
        final String expected = "2012-03-04T16:20:45Z";

        final String actual = new DateTime(2012, Calendar.MARCH, 4, 16, 20, 45)
            .toString(TimeZone.getTimeZone("UTC"));

		System.out.println("Result UTC: " + actual);
		assertEquals("DateTime format is wrong.", expected, actual);
	}

	@Test
	public void dateTimeToStringBerlin() throws Exception {
        final String expected = "2012-03-04T13:20:40+01:00";

        final String actual = new DateTime(2012, Calendar.MARCH, 4, 12, 20, 40)
            .toString(TimeZone.getTimeZone("Europe/Berlin"));

		System.out.println("Result TimeZone 'Europe/Berlin': " + actual);
		assertEquals("Date format is wrong.", expected, actual);
	}

	@Test
	public void dateTimeToStringPacific() throws Exception {
        final String expected = "2012-03-04T06:20:40-08:00";

        final String actual = new DateTime(2012, Calendar.MARCH, 4, 14, 20, 40)
            .toString(TimeZone.getTimeZone("US/Pacific"));

		System.out.println("Result TimeZone 'US/Pacific': " + actual);
		assertEquals("Date format is wrong.", expected, actual);
	}

	@Test
	public void dateTimeToStringHawaii() throws Exception {
		final String expected = "2012-03-04T06:20:40-10:00";

        final String actual = new DateTime(2012, Calendar.MARCH, 4, 16, 20, 40)
            .toString(TimeZone.getTimeZone("US/Hawaii"));

		System.out.println("Result TimeZone 'US/Hawaii': " + actual);
		assertEquals("Date format is wrong.", expected, actual);
	}

	@Test
	public void dateTimeToStringVladivostok() throws Exception {
        final String expected = "2015-08-06T18:55:00+10:00";

        final String actual = new DateTime(2015, Calendar.AUGUST, 6, 8, 55, 0)
            .toString(TimeZone.getTimeZone("Asia/Vladivostok"));

		System.out.println("Result TimeZone 'Asia/Vladivostok': " + actual);
		assertEquals("Date format is wrong.", expected, actual);
	}

	@Test
	public void createDateTime() throws Exception {
		final String dateTimeString = "2012-03-04T13:20:40Z";

        final DateTime dateTime = new DateTime(dateTimeString);
		final Calendar cal = dateTime.getCalendar();

		assertEquals("Year is wrong.", 2012, cal.get(Calendar.YEAR));
		assertEquals("Month is wrong.", Calendar.MARCH, cal.get(Calendar.MONTH));
		assertEquals("Day is wrong.", 4, cal.get(Calendar.DAY_OF_MONTH));
		assertEquals("Hour is wrong.", 13, cal.get(Calendar.HOUR_OF_DAY));
		assertEquals("Minutes are wrong.", 20, cal.get(Calendar.MINUTE));
		assertEquals("Secondes are wrong.", 40, cal.get(Calendar.SECOND));
		assertEquals("TimeZone is wrong.", 0, cal.get(Calendar.ZONE_OFFSET));
	}

    @Test
    public void createDateTimeNoUTCFormat() throws Exception {
        final String dateTimeString = "2015-08-06T12:00:00+02:00";
        final String expectedDateTimeStringUTC = "2015-08-06T10:00:00Z";

        final DateTime dateTime = new DateTime(dateTimeString);

        assertEquals("Date format is wrong.", dateTimeString, dateTime.toString(TimeZone.getTimeZone("Europe/Berlin")));
        assertEquals("Date format is wrong.", expectedDateTimeStringUTC, dateTime.toString(TimeZone.getTimeZone("UTC")));
        assertEquals("Date format is wrong.", expectedDateTimeStringUTC, dateTime.toString());
    }

}
