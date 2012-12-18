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
 * Coordinate transformation matrices are widely used throughout the whole printing Process, especially in Layout Resources. They represent two dimensional
 * transformations as defined by [PS] and [PDF1.6]. For more information, refer to the respective reference manuals, and look for “Coordinate Systems and
 * Transformations.” The “identity matrix”, which is “1 0 0 1 0 0”, is often used as a default throughout this specification. When another matrix is factored
 * against a matrix with the identity matrix value, the result is that the original matrix remains unchanged. Coordinate transformation matrices are primitive
 * data types and are encoded as a list of six numbers (as doubles), separated by whitespace: “a b c d Tx Ty”. The variables Tx and Ty describe distances and
 * are defined in points.
 * @author stefan.meissner
 * @date 18.12.2012
 */
public class Matrix extends XmlAdapter<String, Matrix> {

	private final double a;

	private final double b;

	private final double c;

	private final double d;

	private final double tx;

	private final double ty;

	/**
	 * Default constructor.
	 */
	public Matrix() {
		this.a = 1d;
		this.b = 0d;
		this.c = 0d;
		this.d = 1d;
		this.tx = 0d;
		this.ty = 0d;
	}

	/**
	 * Custom constructor, accepting several values for initializing.
	 */
	private Matrix(double a, double b, double c, double d, double tx, double ty) {

		// init class
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.tx = tx;
		this.ty = ty;
	}

	/**
	 * Creates the "identity matrix", which is "1 0 0 1 0 0" and often used as a default throughout in XJDF Specification.
	 * @return Returns the Identity Matrix.
	 */
	public static Matrix newInstance() {

		// create Identity Matrix
		return new Matrix();
	}

	/**
	 * Creates a new Matrix instance by a String expression.
	 * @param expression Matrix as String expression.
	 * @return New Matrix instance.
	 */
	public static Matrix newInstance(String expression) {

		// split string
		String[] s = expression.split(" ");

		// extract values
		double a = Double.valueOf(s[0]);
		double b = Double.valueOf(s[1]);
		double c = Double.valueOf(s[2]);
		double d = Double.valueOf(s[3]);
		double tx = Double.valueOf(s[4]);
		double ty = Double.valueOf(s[5]);

		// create new object
		return new Matrix(a, b, c, d, tx, ty);
	}

	/**
	 * Creates a new Matrix instance.
	 * @return New Matrix instance.
	 */
	public static Matrix newInstance(double a, double b, double c, double d, double tx, double ty) {

		// create new object
		return new Matrix(a, b, c, d, tx, ty);
	}

	/**
	 * Getter for a attribute.
	 * @return the a
	 */
	public double getA() {
		return a;
	}

	/**
	 * Getter for b attribute.
	 * @return the b
	 */
	public double getB() {
		return b;
	}

	/**
	 * Getter for c attribute.
	 * @return the c
	 */
	public double getC() {
		return c;
	}

	/**
	 * Getter for d attribute.
	 * @return the d
	 */
	public double getD() {
		return d;
	}

	/**
	 * Getter for tx attribute.
	 * @return the tx
	 */
	public double getTx() {
		return tx;
	}

	/**
	 * Getter for ty attribute.
	 * @return the ty
	 */
	public double getTy() {
		return ty;
	}

	/**
	 * @see javax.xml.bind.annotation.adapters.XmlAdapter#marshal(java.lang.Object)
	 */
	@Override
	public String marshal(Matrix matrix) throws Exception {

		if (matrix == null)
			return null;

		// get params
		double a = matrix.getA();
		double b = matrix.getB();
		double c = matrix.getC();
		double d = matrix.getD();
		double tx = matrix.getTx();
		double ty = matrix.getTy();

		// create string
		String result = String.format("%s %s %s %s %s %s", a, b, c, d, tx, ty);

		// return result
		return result;
	}

	/**
	 * @see javax.xml.bind.annotation.adapters.XmlAdapter#unmarshal(java.lang.Object)
	 */
	@Override
	public Matrix unmarshal(String v) throws Exception {

		return newInstance(v);
	}

}
