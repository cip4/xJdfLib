package org.cip4.lib.xjdf.validator.element;

import org.cip4.lib.xjdf.schema.Intent;
import org.cip4.lib.xjdf.schema.Product;
import org.cip4.lib.xjdf.validator.Ancestors;
import org.cip4.lib.xjdf.validator.ValidationResultBuilder;

import java.util.HashSet;
import java.util.Set;

/**
 * Validates that a product does not contain two intents with the same {@code Intent/@Name}.
 */
public class ProductValidator extends SimpleValidator<Product> {

    /**
     * Creates the validator.
     */
    public ProductValidator() {
    }
    /**
     * Validates the product.
     *
     * @param product The element to validate.
     * @param ancestors The ancestors of the element.
     * @param validationResult Collector for violations.
     */
    @Override
    public void validate(
        final Product product, final Ancestors ancestors, ValidationResultBuilder validationResult
    ) {
        Set<String> discoveredIntentNames = new HashSet<>();
        for (Intent intent : product.getIntent()) {
            if (discoveredIntentNames.contains(intent.getName())) {
                validationResult.append(String.format(
                    "Product elements SHALL contain at most one intent element with the same Intent/@Name. "
                        + "Multiple Intents with Name '%s' are present.",
                    intent.getName()
                ));
            }
            discoveredIntentNames.add(intent.getName());
        }
    }

    /**
     * Returns true for {@link Product} elements.
     *
     * @param o The candidate element.
     *
     * @return True in case the element is a product.
     */
    @Override
    public boolean canValidate(final Object o) {
        return o instanceof Product;
    }
}
