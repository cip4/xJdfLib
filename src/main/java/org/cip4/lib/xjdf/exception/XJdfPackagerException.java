package org.cip4.lib.xjdf.exception;

/**
 * Exception in the packaging process.
 */
public class XJdfPackagerException extends Exception {

    /**
     * Constructor.
     *
     * @param message Exception message.
     */
    XJdfPackagerException(final String message) {
        super(message);
    }

    /**
     * Constructor.
     *
     * @param message Exception message.
     * @param cause the cause.
     */
    XJdfPackagerException(final String message, final Throwable cause) {
        super(message, cause);
    }

}
