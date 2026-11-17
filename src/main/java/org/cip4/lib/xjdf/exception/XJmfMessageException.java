package org.cip4.lib.xjdf.exception;

/**
 * Thrown when an operation on an XJMF message is invalid, for example adding a message of an unsupported type.
 */
public class XJmfMessageException extends Exception {

    /**
     * Constructor.
     *
     * @param message Exception message.
     */
    public XJmfMessageException(final String message) {
        super(message);
    }

    /**
     * Constructor.
     *
     * @param message Exception message.
     * @param cause the cause.
     */
    public XJmfMessageException(final String message, final Throwable cause) {
        super(message, cause);
    }

}
