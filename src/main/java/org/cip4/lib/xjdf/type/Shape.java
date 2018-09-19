package org.cip4.lib.xjdf.type;

/**
 * XML Attributes of type shape are used to describe a three dimensional box. A shape is represented as an array of
 * three (positive or zero) numbers — x y z —
 * specifying the Width x, height y and depth z coordinates of the shape, in that order.
 *
 * @author stefan.meissner
 */
public class Shape extends AbstractXJdfType<String, Shape> {

    private final double x;

    private final double y;

    private final double z;

    /**
     * Default constructor.
     */
    public Shape() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    /**
     * Custom constructor, accepting several values for initializing.
     */
    public Shape(double x, double y) {

        // init class
        this.x = x;
        this.y = y;
        this.z = 0d;
    }

    /**
     * Custom constructor, accepting several values for initializing.
     */
    public Shape(double x, double y, double z) {

        // init class
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Custom Constructor. Creates a new Shape instance by a String expression.
     *
     * @param expression Shape as String expression.
     */
    public Shape(String expression) {

        // split string
        String[] s = expression.split(" ");

        // extract values
        if (s.length >= 1) {
            this.x = Double.valueOf(s[0]);
        } else {
            this.x = 0;
        }

        if (s.length >= 2) {
            this.y = Double.valueOf(s[1]);
        } else {
            this.y = 0;
        }

        if (s.length >= 3) {
            this.z = Double.valueOf(s[2]);
        } else {
            this.z = 0;
        }
    }

    /**
     * Getter for x attribute.
     *
     * @return the x
     */
    public double getX() {
        return x;
    }

    /**
     * Getter for y attribute.
     *
     * @return the y
     */
    public double getY() {
        return y;
    }

    /**
     * Getter for z attribute.
     *
     * @return the z
     */
    public double getZ() {
        return z;
    }

    /**
     * @see javax.xml.bind.annotation.adapters.XmlAdapter#marshal(java.lang.Object)
     */
    @Override
    public String marshal(Shape shape) {

        if (shape == null)
            return null;

        // get params
        double x = shape.getX();
        double y = shape.getY();
        double z = shape.getZ();

        // create string
        return String.format("%s %s %s", x, y, z);
    }

    /**
     * @see javax.xml.bind.annotation.adapters.XmlAdapter#unmarshal(java.lang.Object)
     */
    @Override
    public Shape unmarshal(String v) {
        return new Shape(v);
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return marshal(this);
    }
}
