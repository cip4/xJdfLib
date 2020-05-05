package org.cip4.lib.xjdf.type;

import static java.lang.Float.parseFloat;

/**
 * XML Attributes of type rectangle are used to describe rectangular locations on the page, Sheet or other printable
 * surface. A rectangle is represented as an array of four numbers — llx lly urx ury — specifying the lower-left x,
 * lowerleft y, upper-right x and upper-right y coordinates of the rectangle, in that order.
 * This is equivalent to the ordering: Left Bottom Right Top. All numbers are defined in points.
 *
 * @author stefan.meissner
 * @author michel.hartmann
 */
public class Rectangle extends AbstractXJdfType<String, Rectangle> {

    private final float llx;

    private final float lly;

    private final float urx;

    private final float ury;

    /**
     * Default constructor.
     */
    public Rectangle() {
        this.llx = 0;
        this.lly = 0;
        this.urx = 0;
        this.ury = 0;
    }

    /**
     * Custom constructor, accepting values for page coordinates.
     *
     * @param llx Lower-left x.
     * @param lly Lower-left y.
     * @param urx Upper-right x.
     * @param ury Upper-right y.
     */
    public Rectangle(float llx, float lly, float urx, float ury) {

        // init class
        this.llx = llx;
        this.lly = lly;
        this.urx = urx;
        this.ury = ury;
    }

    /**
     * Custom constructor, accepting two points.
     *
     * @param lowerLeft The lower left coordinates
     * @param upperRight The upper right coordinates
     */
    public Rectangle(XYPair lowerLeft, XYPair upperRight) {

        // init class
        this.llx = lowerLeft.getX();
        this.lly = lowerLeft.getY();
        this.urx = upperRight.getX();
        this.ury = upperRight.getY();
    }

    /**
     * Custom Constructor. Creates a new Rectangle instance by a String expression.
     *
     * @param expression Rectangle as String expression.
     */
    public Rectangle(String expression) {

        // split string
        String[] s = expression.split(" ");

        // extract values
        this.llx = parseFloat(s[0]);
        this.lly = parseFloat(s[1]);
        this.urx = parseFloat(s[2]);
        this.ury = parseFloat(s[3]);
    }

    /**
     * Getter for llx attribute.
     *
     * @return the llx
     */
    public float getLlx() {
        return llx;
    }

    /**
     * Getter for lly attribute.
     *
     * @return the lly
     */
    public float getLly() {
        return lly;
    }

    /**
     * Getter for urx attribute.
     *
     * @return the urx
     */
    public float getUrx() {
        return urx;
    }

    /**
     * Getter for ury attribute.
     *
     * @return the ury
     */
    public float getUry() {
        return ury;
    }

    /**
     * Returns the width of the rectangle.
     * @return The rectangles width.
     */
    public float getWidth() {
        return urx - llx;
    }

    /**
     * Returns the height of the rectangle.
     * @return The rectangles height.
     */
    public float getHeight() {
        return ury - lly;
    }

    /**
     * Returns the size of the rectangle.
     * @return The rectangles size.
     */
    public XYPair getSize() { return new XYPair(getWidth(), getHeight());}

    /**
     * Returns the lower left point as XYPair.
     * @return lower left as XYPair object.
     */
    public XYPair getLowerLeft() {
        return new XYPair(llx, lly);
    }

    /**
     * Returns the upper right point as XYPair.
     * @return upper right as XYPair object.
     */
    public XYPair getUpperRight() {
        return new XYPair(urx, ury);
    }

    /**
     * @see javax.xml.bind.annotation.adapters.XmlAdapter#marshal(java.lang.Object)
     */
    @Override
    public String marshal(Rectangle v) {

        if (v == null)
            return null;

        // read values
        float llx = v.getLlx();
        float lly = v.getLly();
        float urx = v.getUrx();
        float ury = v.getUry();

        // process marshalling
        return String.format("%.3f %.3f %.3f %.3f", llx, lly, urx, ury);
    }

    /**
     * @see javax.xml.bind.annotation.adapters.XmlAdapter#unmarshal(java.lang.Object)
     */
    @Override
    public Rectangle unmarshal(String v) {

        return new Rectangle(v);
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return marshal(this);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Rectangle rectangle = (Rectangle) o;

        if (Float.compare(rectangle.llx, llx) != 0) return false;
        if (Float.compare(rectangle.lly, lly) != 0) return false;
        if (Float.compare(rectangle.urx, urx) != 0) return false;
        if (Float.compare(rectangle.ury, ury) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Float.floatToIntBits(llx);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Float.floatToIntBits(lly);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Float.floatToIntBits(urx);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Float.floatToIntBits(ury);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
