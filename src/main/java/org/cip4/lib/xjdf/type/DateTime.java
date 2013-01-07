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
	 * Private custom constructor. Accepting a Calendar object for initializing.
	 * @param calendar Calendar object for initializing.
	 */
	private DateTime(Calendar calendar) {
		this.calendar = calendar;
	}

	/**
	 * Returns the current time as XJDF DateTime.
	 * @return Current Time as XJDF DateTime
	 */
	public static DateTime newInstance() {
		return new DateTime();
	}

	/**
	 * Creates a XJDF DateTime instance by a Calendar object.
	 * @param calendar Calendar object for initializing.
	 * @return created XJDF DateTime object.
	 */
	public static DateTime newInstance(Calendar calendar) {
		return new DateTime(calendar);
	}

	/**
	 * Creates a XJDF DateTime instance by a String expression object.
	 * @param expression XJDF DateTime String expression.
	 * @return XJDF DateTime data type object.
	 * @throws ParseException
	 */
	public static DateTime newInstance(String expression) throws ParseException {

		// parse
		DateFormat dateFormat = new SimpleDateFormat(PATTERN_GLOBAL);
		dateFormat.parse(expression);
		Calendar result = dateFormat.getCalendar();

		String[] ids = TimeZone.getAvailableIDs(result.get(Calendar.ZONE_OFFSET));
		result.setTimeZone(TimeZone.getTimeZone(ids[0]));

		// return result
		return new DateTime(result);
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
		return newInstance(dateTime);
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return marshal(this);
	}
}
