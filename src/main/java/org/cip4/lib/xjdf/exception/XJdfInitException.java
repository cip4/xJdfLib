package org.cip4.lib.xjdf.exception;

/**
 * Thrown when the JAXB context of the library cannot be initialized.
 *
 * <p>
 * This is an unchecked exception, because initialization happens once during application startup and cannot be
 * recovered from at the call site.
 * </p>
 */
public class XJdfInitException extends IllegalArgumentException {

    /**
     * Creates an exception from the underlying initialization failure.
     *
     * @param throwable The cause.
     */
    public XJdfInitException(Throwable throwable) {
        super(throwable);
    }

    /**
     * Creates an exception with a message and the underlying initialization failure.
     *
     * @param message The detail message.
     * @param throwable The cause.
     */
    public XJdfInitException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
