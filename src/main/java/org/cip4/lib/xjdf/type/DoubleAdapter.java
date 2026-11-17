package org.cip4.lib.xjdf.type;

/**
 * Adapter for the double values.
 *
 * @deprecated Not referenced by the generated schema classes or any binding; it will be removed in a future
 *     release.
 */
@Deprecated(since = "2.3", forRemoval = true)
public final class DoubleAdapter {

    /**
     * Prevent instances.
     */
    private DoubleAdapter() {

    }

    /**
     * Converts a double to a String.
     *
     * @param value Double to convert.
     *
     * @return String representation of a double.
     */
    public static String doubleToString(final Double value) {
        if (value == null) {
            return null;
        } else if (Double.valueOf(value.intValue()).equals(value)) {
            return String.valueOf(value.intValue());
        } else {
            return String.valueOf(value);
        }
    }

    /**
     * Parses a String converting it to a double.
     *
     * @param value String to convert.
     *
     * @return Parsed double.
     */
    public static Double stringToDouble(final String value) {
        if (value == null) {
            return null;
        } else {
            return Double.valueOf(value);
        }
    }
}