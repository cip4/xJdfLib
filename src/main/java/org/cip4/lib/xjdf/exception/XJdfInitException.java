package org.cip4.lib.xjdf.exception;

public class XJdfInitException extends IllegalArgumentException {

    public XJdfInitException(Throwable throwable) {
        super(throwable);
    }

    public XJdfInitException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
