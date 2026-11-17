package org.cip4.lib.xjdf.type;


import java.text.ParseException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Implementation of the XJDF DateTime data type.
 */
public final class DateTime extends AbstractXJdfType<String, DateTime> {

    private static final long serialVersionUID = 1L;

    private static final DateTimeFormatter OUTPUT_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");

    private final ZonedDateTime zonedDateTime;

    /**
     * Default constructor.
     */
    public DateTime() {
        this.zonedDateTime = ZonedDateTime.now();
    }

    /**
     * Creates a value for the given zoned date time.
     *
     * @param zonedDateTime The zoned date time.
     */
    public DateTime(ZonedDateTime zonedDateTime) {
        this.zonedDateTime = zonedDateTime;
    }


    /**
     * Custom constructor. Accepting values for initializing.
     *
     * @param year The value used to set the YEAR.
     * @param month The value used to set the MONTH in year. January is "1".
     * @param day The value used to set the DAY in month.
     */
    public DateTime(final int year, final int month, final int day) {
        this(year, month, day, 0, 0);
    }

    /**
     * Custom constructor. Accepting values for initializing.
     *
     * @param year The value used to set the YEAR.
     * @param month The value used to set the MONTH in year. January is "1".
     * @param day The value used to set the DAY in month.
     * @param hour The value used to set the HOUR of day.
     * @param minute The value used to set the MINUTE in of.
     */
    public DateTime(final int year, final int month, final int day, final int hour, final int minute) {
        this(year, month, day, hour, minute, 0);
    }

    /**
     * Custom constructor. Accepting values for initializing.
     *
     * @param year The value used to set the YEAR.
     * @param month The value used to set the MONTH in year. January is "1".
     * @param day The value used to set the DAY in month.
     * @param hour The value used to set the HOUR of day.
     * @param minute The value used to set the MINUTE.
     * @param second The value used to set the SECOND.
     */
    public DateTime(
        final int year, final int month, final int day,
        final int hour, final int minute, final int second
    ) {
        this(year, month, day, hour, minute, second, 0, ZoneId.systemDefault());
    }

    /**
     * Custom constructor. Accepting values for initializing.
     *
     * @param year The value used to set the YEAR.
     * @param month The value used to set the MONTH in year. January is "1".
     * @param day The value used to set the DAY in month.
     * @param hour The value used to set the HOUR of day.
     * @param minute The value used to set the MINUTE.
     * @param second The value used to set the SECOND.
     * @param millis The value used to set the MILLISECONDS
     * @param zoneId The zone id.
     */
    public DateTime(
        final int year, final int month, final int day,
        final int hour, final int minute, final int second,
        final int millis, ZoneId zoneId
    ) {
        zonedDateTime = ZonedDateTime.of(year, month, day, hour, minute, second, millis * 1000000,  zoneId);
    }

    /**
     * Creates a XJDF DateTime instance by a String expression object.
     *
     * @param dateTime XJDF DateTime String expression. Values without a timezone are interpreted in the system
     * default timezone.
     *
     * @throws ParseException if the passed expression cannot be parsed as xs:dateTime.
     */
    public DateTime(final String dateTime) throws ParseException {
        try {
            final java.time.temporal.TemporalAccessor parsed = DateTimeFormatter.ISO_DATE_TIME.parseBest(
                dateTime, ZonedDateTime::from, java.time.LocalDateTime::from
            );

            zonedDateTime = parsed instanceof ZonedDateTime
                ? (ZonedDateTime) parsed
                : ((java.time.LocalDateTime) parsed).atZone(ZoneId.systemDefault());
        } catch (DateTimeParseException | NullPointerException e) {
            throw new ParseException(
                String.format("Invalid xs:dateTime expression: \"%s\".", dateTime), 0
            );
        }
    }

    /**
     * Creates a XJDF DateTime instance by a Date object.
     *
     * @param date Date object.
     */
    public DateTime(final Date date) {
        zonedDateTime = ZonedDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
    }

    /**
     * Creates a XJDF DateTime instance by a Date object.
     *
     * @param epochMillis Epoch millis.
     */
    public DateTime(final long epochMillis) {
        zonedDateTime = ZonedDateTime.ofInstant(Instant.ofEpochMilli(epochMillis), ZoneId.systemDefault());
    }

    /**
     * Clones the underlying calendar and returns it.
     *
     * @return the cloned calendar
     */
    public final Calendar getCalendar() {
        return GregorianCalendar.from(this.zonedDateTime);
    }

    /**
     * Returns the DateTime value as epoch millis.
     * @return The DateTime value as epoch millis.
     */
    public final long toEpochMillis() {
        return getZonedDateTime().toInstant().toEpochMilli();
    }

    /**
     * Returns the DateTime value as {@link Instant}.
     *
     * @return The DateTime value as an Instant.
     */
    public final Instant toInstant() {
        return zonedDateTime.toInstant();
    }

    /**
     * Returns the zoned date time object representing the date times value.
     *
     * @return The ZonedDateTime object.
     */
    public final ZonedDateTime getZonedDateTime() {
        return zonedDateTime;
    }

    /**
     * Serializes the value to an xs:dateTime string.
     *
     * @param dateTime The value to serialize.
     *
     * @return The xs:dateTime string, or null in case the value is null.
     */
    @Override
    public final String marshal(final DateTime dateTime) {
        if (dateTime == null) {
            return null;
        }

        return dateTime.toString();
    }

    /**
     * Parses an xs:dateTime string.
     *
     * @param dateTime The xs:dateTime string.
     *
     * @return The parsed value.
     *
     * @throws Exception in case the value cannot be parsed.
     */
    @Override
    public final DateTime unmarshal(final String dateTime) throws Exception {
        return new DateTime(dateTime);
    }

    /**
     * Formats the value with milliseconds and an ISO offset, for example {@code 2024-08-06T12:00:00.000+02:00}.
     *
     * @return The formatted value.
     */
    @Override
    public final String toString() {
        return zonedDateTime.format(OUTPUT_FORMAT);
    }

    /**
     * Formats the value in the given time zone with milliseconds and an ISO offset.
     *
     * @param zoneId The time zone to format in.
     *
     * @return The formatted value.
     */
    public final String toString(ZoneId zoneId) {
        return ZonedDateTime.ofInstant(zonedDateTime.toInstant(), zoneId).format(OUTPUT_FORMAT);
    }
}
