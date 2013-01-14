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

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * Implementation of the XJDF DateTime data type.
 * @author stefan.meissner
 * @date 05.01.2013
 */
public class DateTime extends XmlAdapter<String, DateTime> {

	private static final String PATTERN_UTC = "yyyy-MM-dd'T'HH:mm:ss'Z'";

	private static final String PATTERN_GLOBAL = "yyyy-MM-dd'T'HH:mm:ssXXX";

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

		// parse
		DateFormat dateFormat = new SimpleDateFormat(PATTERN_GLOBAL);
		dateFormat.parse(expression);
		this.calendar = dateFormat.getCalendar();

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

		if (dateTime == null)
			return null;

		DateFormat dateFormat;

		// check time zone
		if (dateTime.getCalendar().getTimeZone().getRawOffset() == 0) {

			// UTC
			dateFormat = new SimpleDateFormat(PATTERN_UTC);

		} else {

			// different TimeZone
			dateFormat = new SimpleDateFormat(PATTERN_GLOBAL);

		}

		// parse
		dateFormat.setTimeZone(dateTime.getCalendar().getTimeZone());
		String result = dateFormat.format(dateTime.getCalendar().getTime());

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

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return marshal(this);
	}
}
