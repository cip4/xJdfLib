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
 * XML Attributes of type shape are used to describe a three dimensional box. A shape is represented as an array of three (positive or zero) numbers — x y z —
 * specifying the Width x, height y and depth z coordinates of the shape, in that order.
 * @author stefan.meissner
 * @date 18.12.2012
 */
public class Shape extends XmlAdapter<String, Shape> {

	private final double x;

	private final double y;

	private final double z;

	/**
	 * Default constructor.
	 */
	public Shape() {
		this.x = 0;
		this.y = 0;
		this.z = 0;
	}

	/**
	 * Custom constructor, accepting several values for initializing.
	 */
	private Shape(double x, double y, double z) {

		// init class
		this.x = x;
		this.y = y;
		this.z = z;
	}

	/**
	 * Creates an default Shape object.
	 * @return Returns the default Shape object.
	 */
	public static Shape newInstance() {

		// create default Shape
		return new Shape();
	}

	/**
	 * Creates a new Shape instance by a String expression.
	 * @param expression Shape as String expression.
	 * @return New Shape instance.
	 */
	public static Shape newInstance(String expression) {

		// split string
		String[] s = expression.split(" ");

		// extract values
		double x = Double.valueOf(s[0]);
		double y = Double.valueOf(s[1]);
		double z = Double.valueOf(s[2]);

		// create new object
		return new Shape(x, y, z);
	}

	/**
	 * Creates a new Shape instance.
	 * @return New Shape instance.
	 */
	public static Shape newInstance(double x, double y) {

		// create new object
		return new Shape(x, y, 0);
	}

	/**
	 * Creates a new Shape instance.
	 * @return New Shape instance.
	 */
	public static Shape newInstance(double x, double y, double z) {

		// create new object
		return new Shape(x, y, z);
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
	 * Getter for z attribute.
	 * @return the z
	 */
	public double getZ() {
		return z;
	}

	/**
	 * @see javax.xml.bind.annotation.adapters.XmlAdapter#marshal(java.lang.Object)
	 */
	@Override
	public String marshal(Shape shape) {

		if (shape == null)
			return null;

		// get params
		double x = shape.getX();
		double y = shape.getY();
		double z = shape.getZ();

		// create string
		String result = String.format("%s %s %s", x, y, z);

		// return result
		return result;
	}

	/**
	 * @see javax.xml.bind.annotation.adapters.XmlAdapter#unmarshal(java.lang.Object)
	 */
	@Override
	public Shape unmarshal(String v) throws Exception {
		return newInstance(v);
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return marshal(this);
	}
}
