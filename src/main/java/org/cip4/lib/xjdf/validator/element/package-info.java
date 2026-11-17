/**
 * Individual element validators used by {@link org.cip4.lib.xjdf.validator.XjdfValidator}.
 *
 * <p>
 * <strong>Internal API.</strong> This package is an implementation detail of the validation framework. The classes
 * are public so that {@link java.util.ServiceLoader}-style discovery and extension are possible, but they are not
 * part of the stable public API and may change without notice.
 * </p>
 *
 * <p>
 * Each validator implements {@link org.cip4.lib.xjdf.validator.element.Validator} and declares which element types it
 * can validate through {@link org.cip4.lib.xjdf.validator.element.Validator#canValidate(Object)}. Implementations
 * are discovered by scanning this package, so a new rule is a public class with a public no-argument constructor in
 * this package.
 * </p>
 */
package org.cip4.lib.xjdf.validator.element;
