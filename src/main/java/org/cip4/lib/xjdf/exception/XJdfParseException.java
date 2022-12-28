package org.cip4.lib.xjdf.exception;

/**
 * Exception thrown in case of XML parse exceptions.
 */
public class XJdfParseException extends Exception {

    public XJdfParseException(Throwable throwable) {
        super(throwable);
    }

    public XJdfParseException(String message) {
        super(message);
    }

    public XJdfParseException(String message, Throwable throwable) {
        super(message, throwable);
    }

}
