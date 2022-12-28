package org.cip4.lib.xjdf.type;

import java.text.ParseException;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Implementation of the XJDF DateTime data type.
 */
public class DateTime extends AbstractXJdfType<String, DateTime> {

    private final ZonedDateTime zonedDateTime;

    private final DateTimeFormatter DATETIME_OUTPUT_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");

    /**
     * Default constructor.
     */
    public DateTime() {
        this.zonedDateTime = ZonedDateTime.now();
    }

    /**
     * Custom constructor. Accepting values for initializing.
     *
     * @param year The value used to set the YEAR.
     * @param month The value used to set the MONTH in year. January is "0".
     * @param day The value used to set the DAY in month.
     */
    public DateTime(final int year, final int month, final int day) {
        this(year, month, day, 0, 0);
    }

    /**
     * Custom constructor. Accepting values for initializing.
     *
     * @param year The value used to set the YEAR.
     * @param month The value used to set the MONTH in year. January is "0".
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
     * @param month The value used to set the MONTH in year. January is "0".
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
     * @param month The value used to set the MONTH in year. January is "0".
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
     * @param dateTime XJDF DateTime String expression. Should match the format yyyy-MM-dd'T'HH:mm:ss'Z'.
     *
     * @throws ParseException if the passed expression
     */
    public DateTime(final String dateTime) throws ParseException {
        zonedDateTime = ZonedDateTime.parse(dateTime, DateTimeFormatter.ISO_DATE_TIME);
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
     * Clones the underlying calendar and returns it.
     *
     * @return the cloned calendar
     */
    public final Calendar getCalendar() {
        return GregorianCalendar.from(this.zonedDateTime);
    }

    /**
     * @see jakarta.xml.bind.annotation.adapters.XmlAdapter#marshal(java.lang.Object)
     */
    @Override
    public final String marshal(final DateTime dateTime) {
        if (dateTime == null) {
            return null;
        }

        return dateTime.toString();
    }

    /**
     * @see jakarta.xml.bind.annotation.adapters.XmlAdapter#unmarshal(java.lang.Object)
     */
    @Override
    public final DateTime unmarshal(final String dateTime) throws Exception {
        return new DateTime(dateTime);
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public final String toString() {
        return zonedDateTime.format(DATETIME_OUTPUT_FORMAT);
    }

    /**
     * @see java.lang.Object#toString()
     */
    public final String toString(ZoneId zoneId) {
        return ZonedDateTime.ofInstant(zonedDateTime.toInstant(), zoneId).format(DATETIME_OUTPUT_FORMAT);
    }
}