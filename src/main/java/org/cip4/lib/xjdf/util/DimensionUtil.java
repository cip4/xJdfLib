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

/**
 * Static helper class which provides dimension conversion functionality.
 * @author s.meissner
 */
public class DimensionUtil {

	/**
	 * Private constructor.<br/>
	 * This class cannot be instantiated.
	 */
	private DimensionUtil() {

		// protection from reflection
		throw new AssertionError("Class cannot be instantiated.");
	}

	/**
	 * Convert Millimeter to DTP-Points.
	 * @param millimeter Millimeter as double value.
	 * @return Millimeter value in DTP-Points.
	 */
	public static double mm2Dtp(double millimeter) {
		return millimeter / 25.4d * 72d;
	}

	/**
	 * Convert DTP-Points to Millimeter.
	 * @param dtp DTP-Points as value.
	 * @return DTP-Points value in Millimeter.
	 */
	public static double dtp2Mm(double dtp) {
		return dtp / 72d * 25.4d;
	}

	/**
	 * Convert Millimeter to DTP-Points.
	 * @param millimeter Millimeter as double value.
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
	 * @param strDtp DTP-Points as String.
	 * @return DTP-Points value in Millimeter.
	 */
	public static double dtp2MmS(String strDtp) {

		// convert string to double
		double val = Double.valueOf(strDtp);

		// compute
		return dtp2Mm(val);
	}

	/**
	 * Convert Millimeter to DTP-Points String.
	 * @param millimeter Millimeter as double value.
	 * @return Millimeter value in DTP-Points as String.
	 */
	public static String mm2DtpS(double millimeter) {

		// convert
		double dtp = mm2Dtp(millimeter);

		// result as string
		return Double.toString(dtp);
	}

}
