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
 * XML Attributes of type XYPair are used to describe sizes like Dimensions and StartPosition. They can also be used to describe positions on a page. All
 * numbers that describe lengths are defined in points. XYPair Attributes are primitive data types and are encoded as a string of two numbers, separated by
 * whitespace: "x y"
 * @author stefan.meissner
 */
public class XYPair extends AbstractXJdfType<String, XYPair> {

	private final double x;

	private final double y;

	/**
	 * Default constructor. Creates an default XYPair object.
	 */
	public XYPair() {
		x = 0;
		y = 0;
	}

	/**
	 * Custom constructor, accepting several values for initializing.
	 */
	public XYPair(double x, double y) {

		// init class
		this.x = x;
		this.y = y;
	}

	/**
	 * Custom Constructor. Creates a new XYPair instance by a String expression.
	 * @param expression XYPair as String expression.
	 * @return New XYPair instance.
	 */
	public XYPair(String expression) {

		// split string
		String[] s = expression.split(" ");

		// extract values
		this.x = Double.valueOf(s[0]);
		this.y = Double.valueOf(s[1]);
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
	public String marshal(XYPair xyPair) {

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
		return new XYPair(v);
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return marshal(this);
	}
}
