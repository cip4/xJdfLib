/**
 * Entry points for working with XJDF and XJMF in Java.
 *
 * <p>
 * The main classes are:
 * </p>
 * <ul>
 *     <li>{@link org.cip4.lib.xjdf.XJdfDocument} - create, read and modify XJDF documents.</li>
 *     <li>{@link org.cip4.lib.xjdf.XJmfMessage} - create and read XJMF messages.</li>
 *     <li>{@link org.cip4.lib.xjdf.XJmfZipPackage} - bundle an XJMF message, XJDF documents and referenced files in a
 *         ZIP package.</li>
 *     <li>{@link org.cip4.lib.xjdf.FinalProduct} - manage the products of an XJDF document.</li>
 *     <li>{@link org.cip4.lib.xjdf.XJdfConstants} - global agent settings used for generated headers and audits.</li>
 * </ul>
 *
 * <p>
 * Before the first document or message is created, {@link org.cip4.lib.xjdf.XJdfConstants} must be initialized:
 * </p>
 * <pre>{@code
 * XJdfConstants.AGENT_NAME = "PreviewService";
 * XJdfConstants.AGENT_VERSION = "1.2.34";
 * XJdfConstants.DEVICE_ID = "PREVIEW_SERVICE";
 * }</pre>
 *
 * <h2>Typical workflow</h2>
 * <ol>
 *     <li>Create or parse an {@link org.cip4.lib.xjdf.XJdfDocument}.</li>
 *     <li>Add resource sets and specific resources using the fluent builders of the generated schema classes.</li>
 *     <li>Wrap the document in an {@link org.cip4.lib.xjdf.XJmfMessage} or an
 *         {@link org.cip4.lib.xjdf.XJmfZipPackage}.</li>
 *     <li>Serialize with {@code toXml()} and optionally validate the result.</li>
 * </ol>
 *
 * <p>
 * The generated classes in {@link org.cip4.lib.xjdf.schema} provide the type-safe object model for the XJDF
 * schema. Parsing and schema validation are available in {@link org.cip4.lib.xjdf.xml}, and explicit element
 * validation in {@link org.cip4.lib.xjdf.validator}.
 * </p>
 */
package org.cip4.lib.xjdf;
