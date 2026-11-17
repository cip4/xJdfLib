/**
 * Immutable value objects for the primitive XJDF data types.
 *
 * <p>
 * The XJDF schema defines several primitive types whose XML representation is a whitespace separated list of
 * numbers. These classes parse and format those values, and also act as JAXB
 * {@link jakarta.xml.bind.annotation.adapters.XmlAdapter}s so that generated schema classes can expose them as
 * typed properties.
 * </p>
 *
 * <table>
 *     <caption>Available types</caption>
 *     <tr>
 *         <th>Type</th>
 *         <th>XML representation</th>
 *     </tr>
 *     <tr>
 *         <td>{@link org.cip4.lib.xjdf.type.XYPair}</td>
 *         <td>{@code "x y"}</td>
 *     </tr>
 *     <tr>
 *         <td>{@link org.cip4.lib.xjdf.type.Shape}</td>
 *         <td>{@code "x y z"}</td>
 *     </tr>
 *     <tr>
 *         <td>{@link org.cip4.lib.xjdf.type.Rectangle}</td>
 *         <td>{@code "llx lly urx ury"}</td>
 *     </tr>
 *     <tr>
 *         <td>{@link org.cip4.lib.xjdf.type.Matrix}</td>
 *         <td>{@code "a b c d Tx Ty"}</td>
 *     </tr>
 *     <tr>
 *         <td>{@link org.cip4.lib.xjdf.type.DateTime}</td>
 *         <td>xs:dateTime, for example {@code "2024-08-06T12:00:00.000+02:00"}</td>
 *     </tr>
 *     <tr>
 *         <td>{@link org.cip4.lib.xjdf.type.Duration}</td>
 *         <td>xs:duration, for example {@code "P1Y2M3DT4H5M6S"}</td>
 *     </tr>
 *     <tr>
 *         <td>{@link org.cip4.lib.xjdf.type.IntegerList}</td>
 *         <td>space separated integers</td>
 *     </tr>
 *     <tr>
 *         <td>{@link org.cip4.lib.xjdf.type.NMTokens}</td>
 *         <td>space separated NMTOKEN values</td>
 *     </tr>
 *     <tr>
 *         <td>{@link org.cip4.lib.xjdf.type.URI}</td>
 *         <td>xs:anyURI</td>
 *     </tr>
 *     <tr>
 *         <td>{@link org.cip4.lib.xjdf.type.IDREF}</td>
 *         <td>xs:IDREF</td>
 *     </tr>
 * </table>
 *
 * <h2>Guarantees</h2>
 * <ul>
 *     <li>All types are immutable and thread-safe.</li>
 *     <li>All types are {@link java.io.Serializable}, because the generated schema classes are serializable.</li>
 *     <li>{@link java.lang.Object#equals(Object)} and {@link java.lang.Object#hashCode()} are based on the XML
 *         representation, except for {@link org.cip4.lib.xjdf.type.Rectangle}, which compares its coordinates.</li>
 *     <li>Invalid input is rejected with {@link java.lang.IllegalArgumentException}, never with raw
 *         {@link java.lang.NumberFormatException} or {@link java.lang.ArrayIndexOutOfBoundsException}.</li>
 *     <li>Numbers are written with the US locale and a fixed number of decimals, independent of the default
 *         locale.</li>
 * </ul>
 */
package org.cip4.lib.xjdf.type;
