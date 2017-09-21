package org.cip4.lib.xjdf.validator.element;

import org.cip4.lib.xjdf.schema.Intent;
import org.cip4.lib.xjdf.schema.Product;
import org.cip4.lib.xjdf.validator.Ancestors;
import org.cip4.lib.xjdf.validator.ValidationResult;
import org.cip4.lib.xjdf.validator.ValidationResultBuilder;

import java.util.HashSet;
import java.util.Set;

public class ProductValidator extends SimpleValidator<Product> {
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

    @Override
    public boolean canValidate(final Object o) {
        return o instanceof Product;
    }
}
