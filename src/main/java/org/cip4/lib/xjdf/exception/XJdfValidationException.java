package org.cip4.lib.xjdf.exception;

/**
 * Exception thrown in case of XML parse exceptions.
 */
public class XJdfValidationException extends Exception {

    public XJdfValidationException(String message) {
        super(message);
    }

    public XJdfValidationException(Throwable throwable) {
        super(throwable);
    }

    public XJdfValidationException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
