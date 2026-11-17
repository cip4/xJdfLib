package org.cip4.lib.xjdf.type;



import java.math.BigDecimal;
import java.time.Period;

/**
 * Durations are a component of time intervals and define the amount of intervening time in a time interval. Durations
 * are represented by the format
 * P[n]Y[n]M[n]DT[n]H[n]M[n]S
 *
 * @author s.meissner
 */
public final class Duration extends AbstractXJdfType<String, Duration> {

    private static final long serialVersionUID = 1L;

    /**
     * xs:duration pattern as defined by XML Schema Part 2.
     */
    private static final java.util.regex.Pattern XS_DURATION = java.util.regex.Pattern.compile(
        "^(?<sign>-)?P" +
            "(?:(?<years>\\d+)Y)?" +
            "(?:(?<months>\\d+)M)?" +
            "(?:(?<days>\\d+)D)?" +
            "(?:T" +
            "(?:(?<hours>\\d+)H)?" +
            "(?:(?<minutes>\\d+)M)?" +
            "(?:(?<seconds>\\d+(?:\\.\\d+)?)S)?" +
            ")?$"
    );

    private final int year;

    private final int month;

    private final int day;

    private final int hour;

    private final int minute;

    private final int second;

    /**
     * Fractional part of the seconds, e.g. 0.5 for "PT0.5S".
     */
    private final BigDecimal fractionalSecond;

    /**
     * True in case the duration is negative, e.g. "-P1D".
     */
    private final boolean negative;

    /**
     * Default constructor.
     */
    public Duration() {
        year = 0;
        month = 0;
        day = 0;
        hour = 0;
        minute = 0;
        second = 0;
        fractionalSecond = BigDecimal.ZERO;
        negative = false;
    }

    /**
     * Creates a duration of the given number of days.
     *
     * @param day The number of days.
     */
    public Duration(int day) {
        this(0, 0, day, 0, 0, 0);
    }

    /**
     * Creates a duration of the given number of days and hours.
     *
     * @param day The number of days.
     * @param hour The number of hours.
     */
    public Duration(int day, int hour) {
        this(0, 0, day, hour, 0, 0);
    }

    /**
     * Parses an xs:duration expression. A null value creates a zero duration.
     *
     * @param expression The xs:duration expression, for example {@code "P1Y2M3DT4H5M6S"}.
     *
     * @throws IllegalArgumentException in case the expression is not a valid duration.
     */
    public Duration(final String expression) {

        if (expression == null) {

            // default values
            year = 0;
            month = 0;
            day = 0;
            hour = 0;
            minute = 0;
            second = 0;
            fractionalSecond = BigDecimal.ZERO;
            negative = false;

            // return
            return;
        }

        // format: -?P[n]Y[n]M[n]DT[n]H[n]M[n]S
        final String normalized = normalize(expression);
        final java.util.regex.Matcher matcher = XS_DURATION.matcher(normalized);

        if (!matcher.matches() || normalized.equals("P") || normalized.equals("PT")) {
            throw new IllegalArgumentException(
                String.format("Invalid xs:duration expression: \"%s\".", expression)
            );
        }

        negative = matcher.group("sign") != null;
        year = parseGroup(matcher, "years");
        month = parseGroup(matcher, "months");
        day = parseGroup(matcher, "days");
        hour = parseGroup(matcher, "hours");
        minute = parseGroup(matcher, "minutes");

        final String seconds = matcher.group("seconds");
        if (seconds == null) {
            second = 0;
            fractionalSecond = BigDecimal.ZERO;
        } else {
            final BigDecimal value = new BigDecimal(seconds);
            second = value.intValue();
            fractionalSecond = value.subtract(BigDecimal.valueOf(second));
        }
    }

    /**
     * Creates a duration from all components.
     *
     * @param year The number of years.
     * @param month The number of months.
     * @param day The number of days.
     * @param hour The number of hours.
     * @param minute The number of minutes.
     * @param second The number of seconds.
     */
    public Duration(int year, int month, int day, int hour, int minute, int second) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.fractionalSecond = BigDecimal.ZERO;
        this.negative = false;
    }

    private static int parseGroup(final java.util.regex.Matcher matcher, final String group) {
        final String value = matcher.group(group);
        return value == null ? 0 : Integer.parseInt(value);
    }

    /**
     * Normalizes legacy expressions such as "T4H" (missing the leading "P") into the xs:duration format "PT4H".
     *
     * @param expression The raw duration expression.
     *
     * @return The normalized expression.
     */
    private static String normalize(final String expression) {
        String value = expression.trim();

        if (value.startsWith("-")) {
            value = "-" + normalize(value.substring(1));
        } else if (value.startsWith("T")) {
            value = "P" + value;
        }

        return value;
    }

    /**
     * Getter for year attribute.
     *
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * Getter for month attribute.
     *
     * @return the month
     */
    public int getMonth() {
        return month;
    }

    /**
     * Getter for day attribute.
     *
     * @return the day
     */
    public int getDay() {
        return day;
    }

    /**
     * Getter for hour attribute.
     *
     * @return the hour
     */
    public int getHour() {
        return hour;
    }

    /**
     * Getter for minute attribute.
     *
     * @return the minute
     */
    public int getMinute() {
        return minute;
    }

    /**
     * Getter for second attribute.
     *
     * @return the second
     */
    public int getSecond() {
        return second;
    }

    /**
     * Returns the fractional part of the seconds, e.g. 0.5 for "PT0.5S".
     *
     * @return The fractional seconds in the range [0, 1).
     */
    public BigDecimal getFractionalSecond() {
        return fractionalSecond;
    }

    /**
     * Returns true in case this duration is negative, e.g. "-P1D".
     *
     * @return True in case the duration is negative.
     */
    public boolean isNegative() {
        return negative;
    }

    /**
     * Converts the day and time part of this XJDF duration into a {@link java.time.Duration}. Years and months are not
     * convertible into a fixed duration and are therefore ignored; use {@link #toPeriod()} for the date part.
     *
     * @return The day and time part as java.time.Duration.
     */
    public java.time.Duration toJavaDuration() {
        final java.time.Duration duration = java.time.Duration.ofDays(day)
            .plusHours(hour)
            .plusMinutes(minute)
            .plusSeconds(second)
            .plusNanos(fractionalSecond.movePointRight(9).longValueExact());

        return negative ? duration.negated() : duration;
    }

    /**
     * Converts the year, month and day part of this XJDF duration into a {@link Period}.
     *
     * @return The date part as java.time.Period.
     */
    public Period toPeriod() {
        final Period period = Period.of(year, month, day);
        return negative ? period.negated() : period;
    }

    /**
     * Parses an xs:duration string. Legacy expressions such as {@code "T4H"} are accepted and normalized.
     *
     * @param v The duration string.
     *
     * @return The parsed duration.
     *
     * @throws IllegalArgumentException in case the value is not a valid duration.
     */
    @Override
    public Duration unmarshal(String v) {
        return new Duration(v);
    }

    /**
     * Serializes the duration to an xs:duration string. A zero duration is written as {@code "PT0S"}.
     *
     * @param duration The duration to serialize.
     *
     * @return The xs:duration string, or null in case the value is null.
     */
    @Override
    public String marshal(Duration duration) {

        if (duration == null)
            return null;

        // format: -?P[n]Y[n]M[n]DT[n]H[n]M[n]S
        StringBuilder b = new StringBuilder(25);

        if (duration.negative) {
            b.append("-");
        }

        final boolean hasDate = duration.year != 0 || duration.month != 0 || duration.day != 0;
        final boolean hasTime = duration.hour != 0 || duration.minute != 0 || duration.second != 0
            || duration.fractionalSecond.signum() != 0;

        if (!hasDate && !hasTime) {
            // zero duration
            return (duration.negative ? "-" : "") + "PT0S";
        }

        b.append("P");

        if (hasDate) {
            // year expression
            if (duration.year != 0) {
                b.append(duration.year);
                b.append("Y");
            }

            // month expression
            if (duration.month != 0) {
                b.append(duration.month);
                b.append("M");
            }

            // day expression
            if (duration.day != 0) {
                b.append(duration.day);
                b.append("D");
            }
        }

        if (hasTime) {
            b.append("T");

            // hour expression
            if (duration.hour != 0) {
                b.append(duration.hour);
                b.append("H");
            }

            // minute expression
            if (duration.minute != 0) {
                b.append(duration.minute);
                b.append("M");
            }

            // second expression
            if (duration.second != 0 || duration.fractionalSecond.signum() != 0) {
                if (duration.fractionalSecond.signum() == 0) {
                    b.append(duration.second);
                } else {
                    b.append(BigDecimal.valueOf(duration.second).add(duration.fractionalSecond).toPlainString());
                }
                b.append("S");
            }
        }

        // return result
        return b.toString();
    }

    /**
     * Returns the duration as an xs:duration string.
     *
     * @return The xs:duration string.
     */
    @Override
    public String toString() {
        return marshal(this);
    }

}
