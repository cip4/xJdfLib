package org.cip4.lib.xjdf.exception;

/**
 * Thrown when a document or message violates the XJDF schema or a validation rule.
 *
 * <p>
 * The message contains the individual violations, separated by line breaks.
 * </p>
 */
public class XJdfValidationException extends Exception {

    /**
     * Creates an exception with a detail message.
     *
     * @param message The detail message.
     */
    public XJdfValidationException(String message) {
        super(message);
    }

    /**
     * Creates an exception from the underlying validation failure.
     *
     * @param throwable The cause.
     */
    public XJdfValidationException(Throwable throwable) {
        super(throwable);
    }

    /**
     * Creates an exception with a detail message and the underlying validation failure.
     *
     * @param message The detail message.
     * @param throwable The cause.
     */
    public XJdfValidationException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
