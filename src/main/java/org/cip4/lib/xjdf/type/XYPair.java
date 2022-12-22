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
public class XYPair extends AbstractXJdfType<String, XYPair> {

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
        String[] s = expression.split(" ");

        // extract values
        this.x = Float.valueOf(s[0]);
        this.y = Float.valueOf(s[1]);
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
     * Adds another XYPair the the current one.
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
     * @see jakarta.xml.bind.annotation.adapters.XmlAdapter#marshal(java.lang.Object)
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
     * @see jakarta.xml.bind.annotation.adapters.XmlAdapter#unmarshal(java.lang.Object)
     */
    @Override
    public XYPair unmarshal(String v) {
        return new XYPair(v);
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return marshal(this);
    }
}
