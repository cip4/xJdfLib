package org.cip4.lib.xjdf.validator.element;

import org.cip4.lib.xjdf.schema.AssemblingIntent;
import org.cip4.lib.xjdf.schema.Product;
import org.cip4.lib.xjdf.validator.Ancestors;
import org.cip4.lib.xjdf.validator.ValidationResultBuilder;

/**
 * Validates that {@code AssemblingIntent/@Container} does not reference the parent product.
 */
public class AssemblingIntentValidator extends SimpleValidator<AssemblingIntent> {

    /**
     * Creates the validator.
     */
    public AssemblingIntentValidator() {
    }


    /**
     * Validates the assembling intent.
     *
     * @param element The element to validate.
     * @param ancestors The ancestors of the element.
     * @param validationResult Collector for violations.
     */
    @Override
    public void validate(
        final AssemblingIntent element, final Ancestors ancestors, final ValidationResultBuilder validationResult
    ) {
        Product product = ancestors.getNearestAncestor(Product.class);
        if (element.getContainer().equals(product)) {
            validationResult.append(
                "//AssemblingIntent/@Container SHALL NOT reference the parent Product."
            );
        }
    }

    /**
     * Returns true for {@link AssemblingIntent} elements.
     *
     * @param o The candidate element.
     *
     * @return True in case the element is an assembling intent.
     */
    @Override
    public boolean canValidate(final Object o) {
        return o instanceof AssemblingIntent;
    }
}
