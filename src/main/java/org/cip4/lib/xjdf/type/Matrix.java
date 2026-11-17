package org.cip4.lib.xjdf.type;

import java.util.Locale;

/**
 * Coordinate transformation matrices are widely used throughout the whole printing Process, especially in Layout
 * Resources. They represent two dimensional
 * transformations as defined by [PS] and [PDF1.6]. For more information, refer to the respective reference manuals, and
 * look for "Coordinate Systems and
 * Transformations." The "identity matrix", which is "1 0 0 1 0 0", is often used as a default throughout this
 * specification. When another matrix is factored
 * against a matrix with the identity matrix value, the result is that the original matrix remains unchanged. Coordinate
 * transformation matrices are primitive
 * data types and are encoded as a list of six numbers (as floats), separated by whitespace: "a b c d Tx Ty". The
 * variables Tx and Ty describe distances and
 * are defined in points.
 *
 * @author stefan.meissner
 */
public final class Matrix extends AbstractXJdfType<String, Matrix> {

    private static final long serialVersionUID = 1L;

    /**
     * The identity matrix "1 0 0 1 0 0".
     */
    public static final Matrix IDENTITY = new Matrix();

    private final float a;

    private final float b;

    private final float c;

    private final float d;

    private final float tx;

    private final float ty;

    /**
     * Default constructor. Creates the "identity matrix", which is "1 0 0 1 0 0" and often used as a default throughout
     * in XJDF Specification.
     */
    public Matrix() {
        this.a = 1f;
        this.b = 0f;
        this.c = 0f;
        this.d = 1f;
        this.tx = 0f;
        this.ty = 0f;
    }

    /**
     * Creates a matrix from all six values.
     *
     * @param a The a value.
     * @param b The b value.
     * @param c The c value.
     * @param d The d value.
     * @param tx The x translation in points.
     * @param ty The y translation in points.
     */
    public Matrix(float a, float b, float c, float d, float tx, float ty) {

        // init class
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.tx = tx;
        this.ty = ty;
    }

    /**
     * Creates a translation matrix.
     *
     * @param tx The x translation in points.
     * @param ty The y translation in points.
     */
    public Matrix(float tx, float ty) {

        // init class
        this.a = 1f;
        this.b = 0f;
        this.c = 0f;
        this.d = 1f;
        this.tx = tx;
        this.ty = ty;
    }

    /**
     * Custom constructor, accepting a String expression for initializing.
     *
     * @param expression Matrix as String expression.
     */
    public Matrix(String expression) {

        // split string
        final String[] s = XmlValues.split("Matrix", expression, 6);

        // extract values
        this.a = XmlValues.parseFloat("Matrix", s[0]);
        this.b = XmlValues.parseFloat("Matrix", s[1]);
        this.c = XmlValues.parseFloat("Matrix", s[2]);
        this.d = XmlValues.parseFloat("Matrix", s[3]);
        this.tx = XmlValues.parseFloat("Matrix", s[4]);
        this.ty = XmlValues.parseFloat("Matrix", s[5]);
    }

    /**
     * Creates a new Matrix instance by a String expression.
     *
     * @param expression Matrix as String expression.
     *
     * @return The parsed Matrix.
     */
    public static Matrix parse(final String expression) {
        return new Matrix(expression);
    }

    /**
     * Creates a translation matrix.
     *
     * @param tx Translation along the x axis, in points.
     * @param ty Translation along the y axis, in points.
     *
     * @return The translation matrix.
     */
    public static Matrix translation(final float tx, final float ty) {
        return new Matrix(tx, ty);
    }

    /**
     * Creates a scaling matrix.
     *
     * @param sx Scale factor along the x axis.
     * @param sy Scale factor along the y axis.
     *
     * @return The scaling matrix.
     */
    public static Matrix scaling(final float sx, final float sy) {
        return new Matrix(sx, 0f, 0f, sy, 0f, 0f);
    }

    /**
     * Creates a rotation matrix.
     *
     * @param radians Rotation angle in radians, counter clockwise.
     *
     * @return The rotation matrix.
     */
    public static Matrix rotation(final double radians) {
        final float cos = (float) Math.cos(radians);
        final float sin = (float) Math.sin(radians);
        return new Matrix(cos, sin, -sin, cos, 0f, 0f);
    }

    /**
     * Getter for a attribute.
     *
     * @return the a
     */
    public float getA() {
        return a;
    }

    /**
     * Getter for b attribute.
     *
     * @return the b
     */
    public float getB() {
        return b;
    }

    /**
     * Getter for c attribute.
     *
     * @return the c
     */
    public float getC() {
        return c;
    }

    /**
     * Getter for d attribute.
     *
     * @return the d
     */
    public float getD() {
        return d;
    }

    /**
     * Getter for tx attribute.
     *
     * @return the tx
     */
    public float getTx() {
        return tx;
    }

    /**
     * Getter for ty attribute.
     *
     * @return the ty
     */
    public float getTy() {
        return ty;
    }

    /**
     * Multiplies this matrix with another matrix. The resulting matrix applies this transformation first and the
     * other transformation afterwards.
     *
     * @param other The matrix to factor against this matrix.
     *
     * @return The resulting matrix.
     */
    public Matrix multiply(final Matrix other) {
        return new Matrix(
            a * other.a + b * other.c,
            a * other.b + b * other.d,
            c * other.a + d * other.c,
            c * other.b + d * other.d,
            tx * other.a + ty * other.c + other.tx,
            tx * other.b + ty * other.d + other.ty
        );
    }

    /**
     * Applies the transformation to a point.
     *
     * @param point The point to transform.
     *
     * @return The transformed point.
     */
    public XYPair transform(final XYPair point) {
        return new XYPair(
            a * point.getX() + c * point.getY() + tx,
            b * point.getX() + d * point.getY() + ty
        );
    }

    /**
     * Serializes the matrix as six numbers with three decimals.
     *
     * @param matrix The matrix to serialize.
     *
     * @return The formatted value, or null in case the matrix is null.
     */
    @Override
    public String marshal(Matrix matrix) {

        if (matrix == null)
            return null;

        // get params
        float a = matrix.getA();
        float b = matrix.getB();
        float c = matrix.getC();
        float d = matrix.getD();
        float tx = matrix.getTx();
        float ty = matrix.getTy();

        return String.format(Locale.US, "%.3f %.3f %.3f %.3f %.3f %.3f", a, b, c, d, tx, ty);
    }

    /**
     * Parses a matrix from six whitespace separated numbers.
     *
     * @param v The matrix string.
     *
     * @return The parsed matrix.
     *
     * @throws IllegalArgumentException in case the value is not six whitespace separated numbers.
     */
    @Override
    public Matrix unmarshal(String v) {

        return new Matrix(v);
    }

    /**
     * Returns the matrix as six numbers with three decimals.
     *
     * @return The formatted value.
     */
    @Override
    public String toString() {
        return marshal(this);
    }

}
