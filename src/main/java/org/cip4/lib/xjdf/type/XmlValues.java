package org.cip4.lib.xjdf.type;

/**
 * Utility methods shared by the whitespace separated XJDF data types.
 */
final class XmlValues {

    private XmlValues() {
        // prevent instances
    }

    /**
     * Splits a whitespace separated XJDF value. Leading, trailing and repeated whitespace
     * (spaces, tabs, new lines) is treated as a single separator.
     *
     * @param expression The raw value.
     *
     * @return The whitespace separated items. Empty for a blank expression.
     */
    static String[] split(final String expression) {
        if (expression == null) {
            throw new IllegalArgumentException("XJDF value must not be null.");
        }

        final String trimmed = expression.trim();
        return trimmed.isEmpty() ? new String[0] : trimmed.split("\\s+");
    }

    /**
     * Splits a whitespace separated XJDF value and ensures it contains exactly the expected number of items.
     *
     * @param typeName The XJDF data type name, used for error messages.
     * @param expression The raw value.
     * @param expected The expected number of items.
     *
     * @return The whitespace separated items.
     */
    static String[] split(final String typeName, final String expression, final int expected) {
        final String[] items = split(expression);

        if (items.length != expected) {
            throw new IllegalArgumentException(String.format(
                "%s requires exactly %d whitespace separated value(s) but got %d: \"%s\".",
                typeName, expected, items.length, expression
            ));
        }

        return items;
    }

    /**
     * Parses a single float item and wraps parsing errors into an IllegalArgumentException.
     *
     * @param typeName The XJDF data type name, used for error messages.
     * @param value The raw value.
     *
     * @return The parsed float.
     */
    static float parseFloat(final String typeName, final String value) {
        try {
            return Float.parseFloat(value);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(
                String.format("%s contains an invalid number: \"%s\".", typeName, value), e
            );
        }
    }

    /**
     * Parses a single integer item and wraps parsing errors into an IllegalArgumentException.
     *
     * @param typeName The XJDF data type name, used for error messages.
     * @param value The raw value.
     *
     * @return The parsed integer.
     */
    static int parseInt(final String typeName, final String value) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(
                String.format("%s contains an invalid integer: \"%s\".", typeName, value), e
            );
        }
    }
}
