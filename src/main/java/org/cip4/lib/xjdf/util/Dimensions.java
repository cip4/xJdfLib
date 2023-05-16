package org.cip4.lib.xjdf.util;

import org.cip4.lib.xjdf.type.Rectangle;
import org.cip4.lib.xjdf.type.XYPair;

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
     * @param rectangleMm Rectangle in millimeters.
     *
     * @return Rectangle object in DTP-Points.
     */
    public static Rectangle mm2Dtp(Rectangle rectangleMm) {
        return new Rectangle(
                mm2Dtp(rectangleMm.getLlx()),
                mm2Dtp(rectangleMm.getLly()),
                mm2Dtp(rectangleMm.getUrx()),
                mm2Dtp(rectangleMm.getUry())
        );
    }

    /**
     * Convert DTP-Points to Millimeter.
     *
     * @param rectangleDtp Rectangle object in DTP-Pointse.
     *
     * @return Rectangle object value in millimeters.
     */
    public static Rectangle dtp2Mm(Rectangle rectangleDtp) {
        return new Rectangle(
                dtp2Mm(rectangleDtp.getLlx()),
                dtp2Mm(rectangleDtp.getLly()),
                dtp2Mm(rectangleDtp.getUrx()),
                dtp2Mm(rectangleDtp.getUry())
        );
    }

    /**
     * Convert Millimeter to DTP-Points.
     *
     * @param xyPairMm XYPair in millimeters.
     *
     * @return XYPair object in DTP-Points.
     */
    public static XYPair mm2Dtp(XYPair xyPairMm) {
        return new XYPair(
                mm2Dtp(xyPairMm.getX()),
                mm2Dtp(xyPairMm.getY())
        );
    }

    /**
     * Convert DTP-Points to Millimeter.
     *
     * @param xyPairDtp XYPair object in DTP-Pointse.
     *
     * @return XYPair object value in millimeters.
     */
    public static XYPair dtp2Mm(XYPair xyPairDtp) {
        return new XYPair(
                dtp2Mm(xyPairDtp.getX()),
                dtp2Mm(xyPairDtp.getY())
        );
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
