/**
 * XML parsing, serialization and schema validation.
 *
 * <ul>
 *     <li>{@link org.cip4.lib.xjdf.xml.XJdfParser} - reads XJDF and XJMF XML into the generated schema classes.</li>
 *     <li>{@link org.cip4.lib.xjdf.xml.XJdfValidator} - validates XML against the XJDF schema.</li>
 *     <li>{@link org.cip4.lib.xjdf.xml.JAXBContextFactory} - creates and caches the JAXB context.</li>
 * </ul>
 *
 * <p>
 * {@link org.cip4.lib.xjdf.xml.JAXBContextFactory#init()} should be called once at application start. The
 * {@code XJdfDocument} and {@code XJmfMessage} classes do this lazily if it has not been done.
 * </p>
 */
package org.cip4.lib.xjdf.xml;
