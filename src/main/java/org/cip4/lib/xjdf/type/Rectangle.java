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
 * XML Attributes of type rectangle are used to describe rectangular locations on the page, Sheet or other printable surface. A rectangle is represented as an
 * array of four numbers — llx lly urx ury — specifying the lower-left x, lowerleft y, upper-right x and upper-right y coordinates of the rectangle, in that
 * order. This is equivalent to the ordering: Left Bottom Right Top. All numbers are defined in points.
 * @author stefan.meissner
 * @date 18.12.2012
 */
public class Rectangle extends AbstractXJdfType<String, Rectangle> {

	private final double llx;

	private final double lly;

	private final double urx;

	private final double ury;

	/**
	 * Default constructor.
	 */
	public Rectangle() {
		this.llx = 0;
		this.lly = 0;
		this.urx = 0;
		this.ury = 0;
	}

	/**
	 * Custom constructor, accepting values for page coordinates.
	 * @param llx Lower-left x.
	 * @param lly Lower-left y.
	 * @param urx Upper-right x.
	 * @param ury Upper-right y.
	 */
	public Rectangle(double llx, double lly, double urx, double ury) {

		// init class
		this.llx = llx;
		this.lly = lly;
		this.urx = urx;
		this.ury = ury;
	}

	/**
	 * Custom Constructor. Creates a new Rectangle instance by a String expression.
	 * @param expression Rectangle as String expression.
	 * @return New Rectangle instance.
	 */
	public Rectangle(String expression) {

		// split string
		String[] s = expression.split(" ");

		// extract values
		this.llx = Double.valueOf(s[0]);
		this.lly = Double.valueOf(s[1]);
		this.urx = Double.valueOf(s[2]);
		this.ury = Double.valueOf(s[3]);
	}

	/**
	 * Getter for llx attribute.
	 * @return the llx
	 */
	public double getLlx() {
		return llx;
	}

	/**
	 * Getter for lly attribute.
	 * @return the lly
	 */
	public double getLly() {
		return lly;
	}

	/**
	 * Getter for urx attribute.
	 * @return the urx
	 */
	public double getUrx() {
		return urx;
	}

	/**
	 * Getter for ury attribute.
	 * @return the ury
	 */
	public double getUry() {
		return ury;
	}

	/**
	 * @see javax.xml.bind.annotation.adapters.XmlAdapter#marshal(java.lang.Object)
	 */
	@Override
	public String marshal(Rectangle v) {

		if (v == null)
			return null;

		// read values
		double llx = v.getLlx();
		double lly = v.getLly();
		double urx = v.getUrx();
		double ury = v.getUry();

		// process marshalling
		String result = String.format("%s %s %s %s", llx, lly, urx, ury);

		// return result
		return result;
	}

	/**
	 * @see javax.xml.bind.annotation.adapters.XmlAdapter#unmarshal(java.lang.Object)
	 */
	@Override
	public Rectangle unmarshal(String v) throws Exception {

		return new Rectangle(v);
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return marshal(this);
	}
}
