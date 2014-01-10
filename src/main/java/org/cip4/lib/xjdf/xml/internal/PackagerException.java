package org.cip4.lib.xjdf.xml.internal;

/**
 * Exception in the packaging process.
 */
public class PackagerException extends Exception {

    /**
     * Constructor.
     *
     * @param message Exception message.
     */
    PackagerException(final String message) {
        super(message);
    }

    /**
     * Constructor.
     *
     * @param message Exception message.
     * @param cause the cause.
     */
    PackagerException(final String message, final Throwable cause) {
        super(message, cause);
    }

}
