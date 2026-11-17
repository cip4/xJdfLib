/**
 * Checked exceptions thrown by xJdfLib.
 *
 * <p>
 * Most exceptions are checked and carry a human readable message. Many wrap the underlying cause (for example a
 * JAXB or XML exception) and expose it through {@link java.lang.Throwable#getCause()}. The exception to that rule is
 * {@link org.cip4.lib.xjdf.exception.XJdfInitException}, which is an unchecked
 * {@link java.lang.IllegalArgumentException} because a failed initialization cannot be recovered from.
 * </p>
 *
 * <ul>
 *     <li>{@link org.cip4.lib.xjdf.exception.XJdfParseException} - XML cannot be read or written.</li>
 *     <li>{@link org.cip4.lib.xjdf.exception.XJdfValidationException} - a document violates the schema or a rule.</li>
 *     <li>{@link org.cip4.lib.xjdf.exception.XJdfDocumentException} - an operation on an XJDF document is invalid.</li>
 *     <li>{@link org.cip4.lib.xjdf.exception.XJmfMessageException} - an operation on an XJMF message is invalid.</li>
 *     <li>{@link org.cip4.lib.xjdf.exception.XJdfInitException} - JAXB initialization failed.</li>
 *     <li>{@link org.cip4.lib.xjdf.exception.XJdfPackagerException} - packaging or unpackaging failed.</li>
 * </ul>
 */
package org.cip4.lib.xjdf.exception;
