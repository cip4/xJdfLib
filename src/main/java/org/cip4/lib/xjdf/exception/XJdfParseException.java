package org.cip4.lib.xjdf.exception;

/**
 * Thrown when XJDF or XJMF XML cannot be read or written.
 *
 * <p>
 * The cause is usually a JAXB or XML parser exception.
 * </p>
 */
public class XJdfParseException extends Exception {

    /**
     * Creates an exception from the underlying parse failure.
     *
     * @param throwable The cause.
     */
    public XJdfParseException(Throwable throwable) {
        super(throwable);
    }

    /**
     * Creates an exception with a detail message.
     *
     * @param message The detail message.
     */
    public XJdfParseException(String message) {
        super(message);
    }

    /**
     * Creates an exception with a detail message and the underlying parse failure.
     *
     * @param message The detail message.
     * @param throwable The cause.
     */
    public XJdfParseException(String message, Throwable throwable) {
        super(message, throwable);
    }

}
