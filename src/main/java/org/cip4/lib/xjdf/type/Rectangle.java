package org.cip4.lib.xjdf.type;

import java.util.Locale;

/**
 * XML Attributes of type rectangle are used to describe rectangular locations on the page, Sheet or other printable
 * surface. A rectangle is represented as an array of four numbers — llx lly urx ury — specifying the lower-left x,
 * lowerleft y, upper-right x and upper-right y coordinates of the rectangle, in that order.
 * This is equivalent to the ordering: Left Bottom Right Top. All numbers are defined in points.
 *
 * @author stefan.meissner
 * @author michel.hartmann
 */
public final class Rectangle extends AbstractXJdfType<String, Rectangle> {

    private static final long serialVersionUID = 1L;

    private final float llx;

    private final float lly;

    private final float urx;

    private final float ury;

    private final float width;

    private final float height;

    private final XYPair size;

    private final XYPair lowerLeft;

    private final XYPair lowerRight;

    private final XYPair upperRight;

    private final XYPair upperLeft;

    /**
     * Default constructor.
     */
    public Rectangle() {
        this(0, 0, 0, 0);
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

        // compute derived values once
        this.width = urx - llx;
        this.height = ury - lly;
        this.size = new XYPair(width, height);
        this.lowerLeft = new XYPair(llx, lly);
        this.lowerRight = new XYPair(urx, lly);
        this.upperRight = new XYPair(urx, ury);
        this.upperLeft = new XYPair(llx, ury);
    }

    /**
     * Custom constructor, accepting one point.
     *
     * @param xyPair The point
     */
    public Rectangle(XYPair xyPair) {
        this(0, 0, xyPair.getX(), xyPair.getY());
    }

    /**
     * Custom constructor, accepting two points.
     *
     * @param lowerLeft The lower left coordinates
     * @param upperRight The upper right coordinates
     */
    public Rectangle(XYPair lowerLeft, XYPair upperRight) {
        this(lowerLeft.getX(), lowerLeft.getY(), upperRight.getX(), upperRight.getY());
    }

    /**
     * Custom Constructor. Creates a new Rectangle instance by a String expression.
     *
     * @param expression Rectangle as String expression.
     */
    public Rectangle(String expression) {
        this(parseRectangle(expression));
    }

    /**
     * Private constructor, accepting the four coordinates as an array so the String constructor
     * can delegate to the primary constructor after splitting the expression exactly once.
     *
     * @param v Coordinates in the order llx, lly, urx, ury.
     */
    private Rectangle(float[] v) {
        this(v[0], v[1], v[2], v[3]);
    }

    /**
     * Creates a new Rectangle instance by a String expression.
     *
     * @param expression Rectangle as String expression.
     *
     * @return The parsed Rectangle.
     */
    public static Rectangle parse(final String expression) {
        return new Rectangle(expression);
    }

    /**
     * Splits a Rectangle String expression once and parses all four coordinates.
     *
     * @param expression Rectangle as String expression.
     * @return The parsed coordinates in the order llx, lly, urx, ury.
     */
    private static float[] parseRectangle(String expression) {
        final String[] s = XmlValues.split("Rectangle", expression, 4);
        return new float[] {
            XmlValues.parseFloat("Rectangle", s[0]),
            XmlValues.parseFloat("Rectangle", s[1]),
            XmlValues.parseFloat("Rectangle", s[2]),
            XmlValues.parseFloat("Rectangle", s[3])
        };
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
        return width;
    }

    /**
     * Returns the height of the rectangle.
     * @return The rectangles height.
     */
    public float getHeight() {
        return height;
    }

    /**
     * Returns the size of the rectangle.
     * @return The rectangles size.
     */
    public XYPair getSize() {
        return size;
    }

    /**
     * Returns the lower left point as XYPair.
     * @return lower left as XYPair object.
     */
    public XYPair getLowerLeft() {
        return lowerLeft;
    }

    /**
     * Returns the lower right point as XYPair.
     * @return lower right as XYPair object.
     */
    public XYPair getLowerRight() {
        return lowerRight;
    }

    /**
     * Returns the upper right point as XYPair.
     * @return upper right as XYPair object.
     */
    public XYPair getUpperRight() {
        return upperRight;
    }

    /**
     * Returns the upper left point as XYPair.
     * @return upper left as XYPair object.
     */
    public XYPair getUpperLeft() {
        return upperLeft;
    }

    /**
     * Returns true in case the point is located inside this rectangle (inclusive its edges).
     *
     * @param point The point to check.
     *
     * @return True in case the point is contained.
     */
    public boolean contains(final XYPair point) {
        return point.getX() >= llx && point.getX() <= urx
            && point.getY() >= lly && point.getY() <= ury;
    }

    /**
     * Returns true in case the other rectangle overlaps with this rectangle.
     *
     * @param other The other rectangle.
     *
     * @return True in case both rectangles overlap.
     */
    public boolean intersects(final Rectangle other) {
        return llx <= other.urx && urx >= other.llx
            && lly <= other.ury && ury >= other.lly;
    }

    /**
     * Moves this rectangle.
     *
     * @param dx Offset along the x axis, in points.
     * @param dy Offset along the y axis, in points.
     *
     * @return The translated rectangle.
     */
    public Rectangle translate(final float dx, final float dy) {
        return new Rectangle(llx + dx, lly + dy, urx + dx, ury + dy);
    }

    /**
     * Serializes the rectangle as {@code "llx lly urx ury"} with three decimals.
     *
     * @param v The rectangle to serialize.
     *
     * @return The formatted value, or null in case the rectangle is null.
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
        return String.format(Locale.US, "%.3f %.3f %.3f %.3f", llx, lly, urx, ury);
    }

    /**
     * Parses a rectangle from {@code "llx lly urx ury"}.
     *
     * @param v The rectangle string.
     *
     * @return The parsed rectangle.
     *
     * @throws IllegalArgumentException in case the value is not four whitespace separated numbers.
     */
    @Override
    public Rectangle unmarshal(String v) {

        return new Rectangle(v);
    }

    /**
     * Returns the rectangle as {@code "llx lly urx ury"} with three decimals.
     *
     * @return The formatted value.
     */
    @Override
    public String toString() {
        return marshal(this);
    }

    /**
     * Two rectangles are equal in case all four coordinates are equal. This intentionally matches the behavior of
     * {@link AbstractXJdfType#equals(Object)} but avoids the loss of precision of the string based comparison.
     */
    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rectangle rectangle = (Rectangle) o;

        return Float.compare(rectangle.llx, llx) == 0
            && Float.compare(rectangle.lly, lly) == 0
            && Float.compare(rectangle.urx, urx) == 0
            && Float.compare(rectangle.ury, ury) == 0;
    }

    /**
     * Returns a hash code based on the four coordinates.
     *
     * @return The hash code.
     */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Float.floatToIntBits(llx);
        result = 31 * result + Float.floatToIntBits(lly);
        result = 31 * result + Float.floatToIntBits(urx);
        result = 31 * result + Float.floatToIntBits(ury);
        return result;
    }
}
