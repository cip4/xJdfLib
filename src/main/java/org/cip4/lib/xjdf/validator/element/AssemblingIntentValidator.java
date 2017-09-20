package org.cip4.lib.xjdf.validator.element;

import org.cip4.lib.xjdf.schema.AssemblingIntent;
import org.cip4.lib.xjdf.schema.Product;
import org.cip4.lib.xjdf.validator.Ancestors;
import org.cip4.lib.xjdf.validator.ValidationResultBuilder;

public class AssemblingIntentValidator extends SimpleValidator<AssemblingIntent> {


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
}
