package org.cip4.lib.xjdf.type;

public class DoubleFormatter {

    public static String printDouble(final Double value) {
        return value == null ? null :
            Double.valueOf(value.intValue()).equals(value) ? String.valueOf(value.intValue()) : String.valueOf(value);
    }

    public static Double parseDouble(String value) {
        return Double.valueOf(value);
    }
}
