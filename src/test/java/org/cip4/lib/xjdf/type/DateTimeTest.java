package org.cip4.lib.xjdf.type;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.time.ZoneId;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
		final java.time.ZonedDateTime zonedDateTime = dateTime.getZonedDateTime();

		assertEquals(2012, zonedDateTime.getYear(), "Year is wrong.");
		assertEquals(java.time.Month.MARCH, zonedDateTime.getMonth(), "Month is wrong.");
		assertEquals(4, zonedDateTime.getDayOfMonth(), "Day is wrong.");
		assertEquals(13, zonedDateTime.getHour(), "Hour is wrong.");
		assertEquals(20, zonedDateTime.getMinute(), "Minutes are wrong.");
		assertEquals(40, zonedDateTime.getSecond(), "Secondes are wrong.");
		assertEquals(java.time.ZoneOffset.UTC, zonedDateTime.getOffset(), "TimeZone is wrong.");
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

	@Test
	public void createDateTimeWithoutTimeZone() throws Exception {
		final DateTime dateTime = new DateTime("2015-08-06T12:00:00");

		assertEquals(2015, dateTime.getZonedDateTime().getYear(), "Year is wrong.");
		assertEquals(8, dateTime.getZonedDateTime().getMonthValue(), "Month is wrong.");
		assertEquals(6, dateTime.getZonedDateTime().getDayOfMonth(), "Day is wrong.");
		assertEquals(12, dateTime.getZonedDateTime().getHour(), "Hour is wrong.");
	}

	@Test
	public void createDateTimeInvalid() {
		assertThrows(ParseException.class, () -> new DateTime("not a date"));
		assertThrows(ParseException.class, () -> new DateTime(""));
	}

	@Test
	public void toInstantMatchesEpochMillis() throws Exception {
		final DateTime dateTime = new DateTime("2015-08-06T12:00:00.000+02:00");

		assertEquals(dateTime.toEpochMillis(), dateTime.toInstant().toEpochMilli());
	}

}
