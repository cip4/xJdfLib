/**
 * Helper classes for common XJDF tasks.
 *
 * <ul>
 *     <li>{@link org.cip4.lib.xjdf.util.Headers} - creates default XJDF/XJMF headers from the
 *         {@link org.cip4.lib.xjdf.XJdfConstants}.</li>
 *     <li>{@link org.cip4.lib.xjdf.util.Identifiers} - generates unique IDs for resources and products.</li>
 *     <li>{@link org.cip4.lib.xjdf.util.Resources} - wraps a specific resource in a {@code Resource} element.</li>
 *     <li>{@link org.cip4.lib.xjdf.util.Partitions} - reads partition keys and looks up resources by partition.</li>
 *     <li>{@link org.cip4.lib.xjdf.util.Dimensions} - converts between millimeters and DTP points.</li>
 *     <li>{@link org.cip4.lib.xjdf.util.XJdfLib} - library version information and JAXB initialization.</li>
 * </ul>
 *
 * <p>
 * All classes are static utility classes and cannot be instantiated.
 * </p>
 */
package org.cip4.lib.xjdf.util;
