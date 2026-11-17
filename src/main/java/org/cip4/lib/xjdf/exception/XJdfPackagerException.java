package org.cip4.lib.xjdf.exception;

/**
 * Thrown when an XJDF or XJMF ZIP package cannot be created or read, for example because no XJDF document was
 * added or an archive does not contain exactly one XJDF document.
 */
public class XJdfPackagerException extends Exception {

    /**
     * Creates an exception with a detail message.
     *
     * @param message The detail message.
     */
    public XJdfPackagerException(final String message) {
        super(message);
    }

    /**
     * Creates an exception with a detail message and the underlying failure.
     *
     * @param message The detail message.
     * @param cause The cause.
     */
    public XJdfPackagerException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
