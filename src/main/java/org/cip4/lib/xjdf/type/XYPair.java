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

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * XML Attributes of type XYPair are used to describe sizes like Dimensions and StartPosition. They can also be used to describe positions on a page. All
 * numbers that describe lengths are defined in points. XYPair Attributes are primitive data types and are encoded as a string of two numbers, separated by
 * whitespace: "x y"
 * @author stefan.meissner
 * @date 18.12.2012
 */
public class XYPair extends XmlAdapter<String, XYPair> {

	private final double x;

	private final double y;

	/**
	 * Default constructor.
	 */
	public XYPair() {
		x = 0;
		y = 0;
	}

	/**
	 * Custom constructor, accepting several values for initializing.
	 */
	private XYPair(double x, double y) {

		// init class
		this.x = x;
		this.y = y;
	}

	/**
	 * Creates an default XYPair object.
	 * @return Returns the default XYPair object.
	 */
	public static XYPair newInstance() {

		// create default XYPair
		return new XYPair();
	}

	/**
	 * Creates a new XYPair instance by a String expression.
	 * @param expression XYPair as String expression.
	 * @return New XYPair instance.
	 */
	public static XYPair newInstance(String expression) {

		// split string
		String[] s = expression.split(" ");

		// extract values
		double x = Double.valueOf(s[0]);
		double y = Double.valueOf(s[1]);

		// create new object
		return new XYPair(x, y);
	}

	/**
	 * Creates a new XYPair instance.
	 * @return New XYPair instance.
	 */
	public static XYPair newInstance(double x, double y) {

		// create new object
		return new XYPair(x, y);
	}

	/**
	 * Getter for x attribute.
	 * @return the x
	 */
	public double getX() {
		return x;
	}

	/**
	 * Getter for y attribute.
	 * @return the y
	 */
	public double getY() {
		return y;
	}

	/**
	 * @see javax.xml.bind.annotation.adapters.XmlAdapter#marshal(java.lang.Object)
	 */
	@Override
	public String marshal(XYPair xyPair) throws Exception {

		if (xyPair == null)
			return null;

		// get params
		double x = xyPair.getX();
		double y = xyPair.getY();

		// create string
		String result = String.format("%s %s", x, y);

		// return result
		return result;
	}

	/**
	 * @see javax.xml.bind.annotation.adapters.XmlAdapter#unmarshal(java.lang.Object)
	 */
	@Override
	public XYPair unmarshal(String v) throws Exception {
		return newInstance(v);
	}

}
