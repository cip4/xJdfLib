/**
 * Framework for validating XJDF documents beyond XML schema validation.
 *
 * <p>
 * Schema validation (see {@link org.cip4.lib.xjdf.xml.XJdfValidator}) only verifies the XML structure. This package
 * adds element validators for rules that the schema cannot express, such as consistency between resource sets,
 * combined process indices or intent attributes.
 * </p>
 *
 * <p>
 * Entry point for users:
 * </p>
 * <pre>{@code
 * ValidationResult result = new XjdfValidator().validate(xjdf);
 * if (!result.isValid()) {
 *     for (String violation : result.getViolations()) {
 *         System.err.println(violation);
 *     }
 * }
 * }</pre>
 *
 * <p>
 * The validators are discovered through {@link org.cip4.lib.xjdf.validator.ValidatorLoader} and dispatched by
 * {@link org.cip4.lib.xjdf.validator.ValidationDispatcher}. The classes in
 * {@link org.cip4.lib.xjdf.validator.element} implement the individual rules.
 * </p>
 */
package org.cip4.lib.xjdf.validator;
