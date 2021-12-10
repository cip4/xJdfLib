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
public class Matrix extends AbstractXJdfType<String, Matrix> {

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
     * Custom constructor, accepting several values for initializing.
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
     * Custom constructor, accepting several values for initializing.
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
        String[] s = expression.split(" ");

        // extract values
        this.a = Float.parseFloat(s[0]);
        this.b = Float.parseFloat(s[1]);
        this.c = Float.parseFloat(s[2]);
        this.d = Float.parseFloat(s[3]);
        this.tx = Float.parseFloat(s[4]);
        this.ty = Float.parseFloat(s[5]);
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
     * @see javax.xml.bind.annotation.adapters.XmlAdapter#marshal(java.lang.Object)
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
     * @see javax.xml.bind.annotation.adapters.XmlAdapter#unmarshal(java.lang.Object)
     */
    @Override
    public Matrix unmarshal(String v) {

        return new Matrix(v);
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return marshal(this);
    }

}
