package org.cip4.lib.xjdf.exception;

/**
 * Exception related to the XJDF Document processing.
 */
public class XJdfDocumentException extends Exception {

    /**
     * Constructor.
     *
     * @param message Exception message.
     */
    public XJdfDocumentException(final String message) {
        super(message);
    }

    /**
     * Constructor.
     *
     * @param message Exception message.
     * @param cause the cause.
     */
    public XJdfDocumentException(final String message, final Throwable cause) {
        super(message, cause);
    }

}
