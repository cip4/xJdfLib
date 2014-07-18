package org.cip4.lib.xjdf.merger;

/**
 * Exception thrown if merging of nodes in a xjdf document fails.
 */
public class MergeConflictException extends Exception {

    /**
     * Constructor.
     *
     * @param message message describing the error.
     */
    public MergeConflictException(final String message) {
        super(message);
    }

}
