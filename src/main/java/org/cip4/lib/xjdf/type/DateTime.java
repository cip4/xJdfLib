package org.cip4.lib.xjdf.type;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Implementation of the XJDF DateTime data type.
 */
public class DateTime extends AbstractXJdfType<String, DateTime> {

    /**
     * UTC time zone.
     */
    private static final TimeZone TIME_ZONE_UTC = TimeZone.getTimeZone("UTC");

    /**
     * UTC date format.
     */
    private final DateFormat DATE_FORMAT_UTC = createUTCDateFormat();

    /**
     * RFC 822 date format.
     */
    private final DateFormat DATE_FORMAT_WITH_TIME_ZONE_RFC_822 = new SimpleDateFormat(
        "yyyy-MM-dd'T'HH:mm:ssZ"
    );

    /**
     * ISO 8601 date format.
     */
    private final DateFormat DATE_FORMAT_WITH_TIME_ZONE_ISO_8601 = new SimpleDateFormat(
        "yyyy-MM-dd'T'HH:mm:ssXXX"
    );


    /**
     * Calendar which holds the date information.
     */
    private final Calendar calendar = Calendar.getInstance(TIME_ZONE_UTC);

    /**
     * Default constructor.
     */
    public DateTime() {
        super();
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
        calendar.set(year, month, day, hour, minute, second);
    }

    /**
     * Creates a XJDF DateTime instance by a String expression object.
     *
     * @param dateTime XJDF DateTime String expression. Should match the format yyyy-MM-dd'T'HH:mm:ss'Z'.
     *
     * @throws ParseException if the passed expression
     */
    public DateTime(final String dateTime) throws ParseException {
        try {
            calendar.setTime(DATE_FORMAT_UTC.parse(dateTime));
        } catch (ParseException e1) {
            try {
                calendar.setTime(DATE_FORMAT_WITH_TIME_ZONE_RFC_822.parse(dateTime));
            } catch (ParseException e2) {
                calendar.setTime(DATE_FORMAT_WITH_TIME_ZONE_ISO_8601.parse(dateTime));
            }
        }
    }

    /**
     * Creates a XJDF DateTime instance by a Date object.
     *
     * @param date Date object.
     */
    public DateTime(final Date date) {
        calendar.setTime(date);
    }

    /**
     * Clones the underlying calendar and returns it.
     *
     * @return the cloned calendar
     */
    public final Calendar getCalendar() {
        return (Calendar) this.calendar.clone();
    }

    /**
     * Creates a DateFormat with the pattern <b>yyyy-MM-dd'T'HH:mm:ss'Z'</b> and the time zone set to UTC.
     *
     * @return The DateFormat.
     */
    private static DateFormat createUTCDateFormat() {
        final DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        dateFormat.setLenient(false);
        dateFormat.setTimeZone(TIME_ZONE_UTC);

        return dateFormat;
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
        return DATE_FORMAT_UTC.format(calendar.getTime());
    }

    /**
     * Formats this DateTime object using the passed time zone.
     *
     * @param timeZone The time zone to use.
     *
     * @return String representation based for the passed time zone.
     */
    public final String toString(final TimeZone timeZone) {
        if (timeZone == null) {
            throw new IllegalArgumentException("time zone has not been specified");
        }

        DATE_FORMAT_WITH_TIME_ZONE_ISO_8601.setTimeZone(timeZone);

        return DATE_FORMAT_WITH_TIME_ZONE_ISO_8601.format(calendar.getTime());
    }

}