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
package org.cip4.lib.xjdf.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

/**
 * Static helper util class which provides conversion functionality.
 * @author s.meissner
 * @date 21.03.2012
 */
public class ConversionUtil {

	private static final String patternUTC = "yyyy-MM-dd'T'HH:mm:ss'Z'";

	private static final String patternGlobal = "yyyy-MM-dd'T'HH:mm:ssXXX";

	/**
	 * Private constructor.<br/>
	 * This class cannot be instantiated.
	 */
	private ConversionUtil() {
	}

	/**
	 * Convert a Java Date object to a JDF Date String value.
	 * @param date Date object to convert to.
	 * @return Date as JDF String value.
	 */
	public static String date2String(Calendar calendar) {

		DateFormat dateFormat;

		if (calendar.getTimeZone().getRawOffset() == 0) {
			// UTC
			dateFormat = new SimpleDateFormat(patternUTC);

		} else {
			// different TimeZone
			dateFormat = new SimpleDateFormat(patternGlobal);

		}

		// parse
		dateFormat.setTimeZone(calendar.getTimeZone());
		String result = dateFormat.format(calendar.getTime());

		// return result
		return result;
	}

	/**
	 * Convert a JDF Date String value to a Java Date object.
	 * @param strDate JDF Date String value.
	 * @return JDF Date String as Java Date object.
	 * @throws ParseException
	 */
	public static Calendar string2Date(String strDate) throws ParseException {

		// parse
		DateFormat dateFormat = new SimpleDateFormat(patternGlobal);
		dateFormat.parse(strDate);
		Calendar result = dateFormat.getCalendar();

		String[] ids = TimeZone.getAvailableIDs(result.get(Calendar.ZONE_OFFSET));
		result.setTimeZone(TimeZone.getTimeZone(ids[0]));

		// return result
		return result;
	}

	/**
	 * Convert Millimeter to DTP-Points.
	 * @param millimeter Millimeter as float value.
	 * @return Millimeter value in DTP-Points.
	 */
	public static float mm2Dtp(float millimeter) {
		return millimeter / 25.4f * 72f;
	}

	/**
	 * Convert DTP-Points to Millimeter.
	 * @param dtp DTP-Points as value.
	 * @return DTP-Points value in Millimeter.
	 */
	public static float dtp2Mm(float dtp) {
		return dtp / 72f * 25.4f;
	}

	/**
	 * Convert DTP-Points String to Millimeter.
	 * @param dtp DTP-Points as String.
	 * @return DTP-Points value in Millimeter.
	 */
	public static float dtp2MmS(String strDtp) {

		// convert string to float
		float val = Float.valueOf(strDtp);

		// compute
		return dtp2Mm(val);
	}

	/**
	 * Convert Millimeter to DTP-Points String.
	 * @param millimeter Millimeter as float value.
	 * @return Millimeter value in DTP-Points as String.
	 */
	public static String mm2DtpS(float millimeter) {

		// convert
		float dtp = mm2Dtp(millimeter);

		// result as string
		return Float.toString(dtp);
	}
}
