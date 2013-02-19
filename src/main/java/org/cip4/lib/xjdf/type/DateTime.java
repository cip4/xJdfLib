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

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

/**
 * Implementation of the XJDF DateTime data type.
 * @author stefan.meissner
 * @date 05.01.2013
 */
public class DateTime extends AbstractXJdfType<String, DateTime> {

	private static final String PATTERN_UTC = "yyyy-MM-dd'T'HH:mm:ss'Z'";

	private static final String PATTERN_GLOBAL = "yyyy-MM-dd'T'HH:mm:ssZ";

	// not supported in 1.6
	// private static final String PATTERN_GLOBAL = "yyyy-MM-dd'T'HH:mm:ssXXX";

	private final Calendar calendar;

	/**
	 * Default constructor.
	 */
	public DateTime() {
		this.calendar = Calendar.getInstance();
	}

	/**
	 * Custom constructor. Accepting values for initializing.
	 * @param year The value used to set the YEAR.
	 * @param month The value used to set the MONTH in year. January is "1".
	 * @param day The value used to set the DAY in month.
	 */
	public DateTime(int year, int month, int day) {

		this(year, month, day, 23, 59);
	}

	/**
	 * Custom constructor. Accepting values for initializing.
	 * @param year The value used to set the YEAR.
	 * @param month The value used to set the MONTH in year. January is "1".
	 * @param day The value used to set the DAY in month.
	 * @param hour The value used to set the HOUR of day.
	 * @param minute The value used to set the MINUTE in of.
	 */
	public DateTime(int year, int month, int day, int hour, int minute) {

		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, day, hour, minute, 0);

		// initialize instance variable
		this.calendar = cal;
	}

	/**
	 * Custom constructor. Accepting a Calendar object for initializing.
	 * @param calendar Calendar object for initializing.
	 */
	public DateTime(Calendar calendar) {
		this.calendar = calendar;
	}

	/**
	 * Custom constructor. Creates a XJDF DateTime instance by a String expression object.
	 * @param expression XJDF DateTime String expression.
	 * @return XJDF DateTime data type object.
	 * @throws ParseException
	 */
	public DateTime(String expression) throws ParseException {

		// // timezone
		// int offset = 0;
		//
		// int posPlus = expression.lastIndexOf("+");
		// int posMinus = expression.lastIndexOf("-");
		//
		// if (posPlus > -1) {
		// offset = Integer.valueOf(expression.substring(posPlus + 1, posPlus + 3));
		//
		// } else if (posMinus > -1) {
		// offset = Integer.valueOf(expression.substring(posMinus, posMinus + 3));
		//
		// }
		//
		// String[] ids = TimeZone.getAvailableIDs(offset * 3600 * 1000);
		// this.calendar.setTimeZone(TimeZone.getTimeZone(ids[0]));

		// prepare expression
		if (expression.endsWith(":00")) {
			expression = expression.substring(0, expression.length() - 3) + "00";
		} else if (expression.endsWith("Z")) {
			expression = expression.replaceFirst("Z", "+0000");
		}

		// parse
		DateFormat dateFormat = new SimpleDateFormat(PATTERN_GLOBAL);
		dateFormat.parse(expression);
		this.calendar = dateFormat.getCalendar();

		// only java 1.7
		String[] ids = TimeZone.getAvailableIDs(this.calendar.get(Calendar.ZONE_OFFSET));
		this.calendar.setTimeZone(TimeZone.getTimeZone(ids[0]));
	}

	/**
	 * Getter for calendar attribute.
	 * @return the calendar
	 */
	public Calendar getCalendar() {
		return this.calendar;
	}

	/**
	 * @see javax.xml.bind.annotation.adapters.XmlAdapter#marshal(java.lang.Object)
	 */
	@Override
	public String marshal(DateTime dateTime) {

		String result;

		if (dateTime == null)
			return null;

		TimeZone timeZone = dateTime.getCalendar().getTimeZone();

		// check time zone
		if (timeZone.getRawOffset() == 0) {

			// UTC
			DateFormat dateFormat = new SimpleDateFormat(PATTERN_UTC);
			dateFormat.setTimeZone(timeZone);
			result = dateFormat.format(dateTime.getCalendar().getTime());

		} else {

			// different TimeZone
			DateFormat dateFormat = new SimpleDateFormat(PATTERN_GLOBAL);
			dateFormat.setTimeZone(timeZone);
			result = dateFormat.format(dateTime.getCalendar().getTime());

			// extend result by a ":"
			result = result.substring(0, result.length() - 2) + ":" + result.substring(result.length() - 2);

		}

		// return result
		return result;
	}

	/**
	 * @see javax.xml.bind.annotation.adapters.XmlAdapter#unmarshal(java.lang.Object)
	 */
	@Override
	public DateTime unmarshal(String dateTime) throws Exception {
		return new DateTime(dateTime);
	}

}
