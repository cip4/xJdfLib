package org.cip4.lib.xjdf.util;

/**
 * Dimensions utility class providing conversion functionality.
 */
public class Dimensions {

    /**
     * Private constructor for utility class.
     */
    private Dimensions() {
    }

    /**
     * Convert Millimeter to DTP-Points.
     *
     * @param millimeter Millimeter as double value.
     *
     * @return Millimeter value in DTP-Points.
     */
    public static double mm2Dtp(double millimeter) {
        return millimeter / 25.4d * 72d;
    }

    /**
     * Convert DTP-Points to Millimeter.
     *
     * @param dtp DTP-Points as value.
     *
     * @return DTP-Points value in Millimeter.
     */
    public static double dtp2Mm(double dtp) {
        return dtp / 72d * 25.4d;
    }

    /**
     * Convert Millimeter to DTP-Points.
     *
     * @param millimeter Millimeter as double value.
     *
     * @return Millimeter value in DTP-Points.
     */
    public static float mm2Dtp(float millimeter) {
        return millimeter / 25.4f * 72f;
    }

    /**
     * Convert DTP-Points to Millimeter.
     *
     * @param dtp DTP-Points as value.
     *
     * @return DTP-Points value in Millimeter.
     */
    public static float dtp2Mm(float dtp) {
        return dtp / 72f * 25.4f;
    }

    /**
     * Convert DTP-Points String to Millimeter.
     *
     * @param strDtp DTP-Points as String.
     *
     * @return DTP-Points value in Millimeter.
     */
    public static double dtp2MmS(String strDtp) {

        // convert string to double
        double val = Double.parseDouble(strDtp);

        // compute
        return dtp2Mm(val);
    }

    /**
     * Convert Millimeter to DTP-Points String.
     *
     * @param millimeter Millimeter as double value.
     *
     * @return Millimeter value in DTP-Points as String.
     */
    public static String mm2DtpS(double millimeter) {

        // convert
        double dtp = mm2Dtp(millimeter);

        // result as string
        return Double.toString(dtp);
    }

}
