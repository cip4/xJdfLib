package org.cip4.lib.xjdf.type;


import java.util.Locale;

/**
 * XML Attributes of type XYPair are used to describe sizes like Dimensions and StartPosition. They can also be used to
 * describe positions on a page. All
 * numbers that describe lengths are defined in points. XYPair Attributes are primitive data types and are encoded as a
 * string of two numbers, separated by
 * whitespace: "x y"
 *
 * @author stefan.meissner
 */
public final class XYPair extends AbstractXJdfType<String, XYPair> {

    private static final long serialVersionUID = 1L;

    /**
     * An XYPair with both coordinates set to zero.
     */
    public static final XYPair ZERO = new XYPair(0, 0);

    private final float x;

    private final float y;

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
    public XYPair(float x, float y) {

        // init class
        this.x = x;
        this.y = y;
    }

    /**
     * Custom Constructor. Creates a new XYPair instance by a String expression.
     *
     * @param expression XYPair as String expression.
     */
    public XYPair(String expression) {

        // split string
        final String[] s = XmlValues.split("XYPair", expression, 2);

        // extract values
        this.x = XmlValues.parseFloat("XYPair", s[0]);
        this.y = XmlValues.parseFloat("XYPair", s[1]);
    }

    /**
     * Creates a new XYPair instance by a String expression.
     *
     * @param expression XYPair as String expression.
     *
     * @return The parsed XYPair.
     */
    public static XYPair parse(final String expression) {
        return new XYPair(expression);
    }

    /**
     * Getter for x attribute.
     *
     * @return the x
     */
    public float getX() {
        return x;
    }

    /**
     * Getter for y attribute.
     *
     * @return the y
     */
    public float getY() {
        return y;
    }

    /**
     * Adds another XYPair the current one.
     * @param other The other one.
     * @return The sum of both XYPairs.
     */
    public XYPair add(XYPair other) {
        return new XYPair(
                this.getX() + other.getX(),
                this.getY() + other.getY()
        );
    }

    /**
     * Subtracts another XYPair from the current one.
     * @param other The other one.
     * @return The difference of both XYPairs.
     */
    public XYPair subtract(XYPair other) {
        return new XYPair(
                this.getX() - other.getX(),
                this.getY() - other.getY()
        );
    }

    /**
     * Scales both coordinates with the given factor.
     *
     * @param factor The scale factor.
     *
     * @return The scaled XYPair.
     */
    public XYPair scale(final float factor) {
        return new XYPair(this.x * factor, this.y * factor);
    }

    /**
     * Serializes the pair as {@code "x y"} with three decimals.
     *
     * @param xyPair The pair to serialize.
     *
     * @return The formatted value, or null in case the pair is null.
     */
    @Override
    public String marshal(XYPair xyPair) {

        if (xyPair == null)
            return null;

        // get params
        float x = xyPair.getX();
        float y = xyPair.getY();

        return String.format(Locale.US, "%.3f %.3f", x, y);
    }

    /**
     * Parses a pair from {@code "x y"}.
     *
     * @param v The pair string.
     *
     * @return The parsed pair.
     *
     * @throws IllegalArgumentException in case the value is not two whitespace separated numbers.
     */
    @Override
    public XYPair unmarshal(String v) {
        return new XYPair(v);
    }

    /**
     * Returns the pair as {@code "x y"} with three decimals.
     *
     * @return The formatted value.
     */
    @Override
    public String toString() {
        return marshal(this);
    }
}
