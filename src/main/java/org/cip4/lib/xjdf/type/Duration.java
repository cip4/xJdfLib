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


/**
 * Durations are a component of time intervals and define the amount of intervening time in a time interval. Durations are represented by the format
 * P[n]Y[n]M[n]DT[n]H[n]M[n]S
 * @author s.meissner
 * @date 11.01.2013
 */
public class Duration extends AbstractXJdfType<String, Duration> {

	private final int year;

	private final int month;

	private final int day;

	private final int hour;

	private final int minute;

	private final int second;

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
	}

	/**
	 * Custom constructor. Accepting a value for day.
	 */
	public Duration(int day) {
		this(0, 0, day, 0, 0, 0);
	}

	/**
	 * Custom constructor. Accepting values for day and hour.
	 */
	public Duration(int day, int hour) {
		this(0, 0, day, hour, 0, 0);
	}

	/**
	 * Custom constructor. Accepting accepting a String expression for initializing..
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

			// return
			return;
		}

		// format: P[n]Y[n]M[n]DT[n]H[n]M[n]S
		String expr = expression;

		// extract daytime
		int posDaytime = expr.indexOf("T");

		if (posDaytime != -1) {
			String daytime = expr.substring(posDaytime + 1);
			expr = expr.substring(0, posDaytime);

			// extract hour
			int posHour = daytime.indexOf("H");

			if (posHour != -1) {
				hour = Integer.parseInt(daytime.substring(0, posHour));
			} else {
				hour = 0;
			}

			daytime = daytime.substring(posHour + 1);

			// extract minute
			int posMinute = daytime.indexOf("M");

			if (posMinute != -1) {
				minute = Integer.parseInt(daytime.substring(0, posMinute));
			} else {
				minute = 0;
			}

			daytime = daytime.substring(posMinute + 1);

			// extract second
			int posSecond = daytime.indexOf("S");

			if (posSecond != -1) {
				second = Integer.parseInt(daytime.substring(0, posSecond));
			} else {
				second = 0;
			}

		} else {
			hour = 0;
			minute = 0;
			second = 0;
		}

		// extract date
		int posDate = expression.indexOf("P");

		if (posDate != -1) {
			String date = expr.substring(posDate + 1);

			// extract year
			int posYear = date.indexOf("Y");

			if (posYear != -1) {
				year = Integer.parseInt(date.substring(0, posYear));
			} else {
				year = 0;
			}

			date = date.substring(posYear + 1);

			// extract month
			int posMonth = date.indexOf("M");

			if (posMonth != -1) {
				month = Integer.parseInt(date.substring(0, posMonth));
			} else {
				month = 0;
			}

			date = date.substring(posMonth + 1);

			// extract day
			int posDay = date.indexOf("D");

			if (posDay != -1) {
				day = Integer.parseInt(date.substring(0, posDay));
			} else {
				day = 0;
			}

		} else {
			year = 0;
			month = 0;
			day = 0;
		}
	}

	/**
	 * Custom constructor. Accepting values for all attributes.
	 */
	public Duration(int year, int month, int day, int hour, int minute, int second) {
		this.year = year;
		this.month = month;
		this.day = day;
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	/**
	 * Getter for year attribute.
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * Getter for month attribute.
	 * @return the month
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * Getter for day attribute.
	 * @return the day
	 */
	public int getDay() {
		return day;
	}

	/**
	 * Getter for hour attribute.
	 * @return the hour
	 */
	public int getHour() {
		return hour;
	}

	/**
	 * Getter for minute attribute.
	 * @return the minute
	 */
	public int getMinute() {
		return minute;
	}

	/**
	 * Getter for second attribute.
	 * @return the second
	 */
	public int getSecond() {
		return second;
	}

	/**
	 * @see javax.xml.bind.annotation.adapters.XmlAdapter#unmarshal(java.lang.Object)
	 */
	@Override
	public Duration unmarshal(String v) {
		return new Duration(v);
	}

	/**
	 * @see javax.xml.bind.annotation.adapters.XmlAdapter#marshal(java.lang.Object)
	 */
	@Override
	public String marshal(Duration duration) {

		if (duration == null)
			return null;

		// format: P[n]Y[n]M[n]DT[n]H[n]M[n]S
		StringBuilder b = new StringBuilder(25);

		if (duration.year != 0 || duration.month != 0 || duration.day != 0) {
			b.append("P");

			// year expression
			if (duration.year > 0) {
				b.append(duration.year);
				b.append("Y");
			}

			// month expression
			if (duration.month > 0) {
				b.append(duration.month);
				b.append("M");
			}

			// day expression
			if (duration.day > 0) {
				b.append(duration.day);
				b.append("D");
			}
		}

		if (duration.hour != 0 || duration.minute != 0 || duration.second != 0) {
			b.append("T");

			// hour expression
			if (duration.hour > 0) {
				b.append(duration.hour);
				b.append("H");
			}

			// minute expression
			if (duration.minute > 0) {
				b.append(duration.minute);
				b.append("M");
			}

			// second expression
			if (duration.second > 0) {
				b.append(duration.second);
				b.append("S");
			}
		}

		// return result
		return b.toString();
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return marshal(this);
	}

}
