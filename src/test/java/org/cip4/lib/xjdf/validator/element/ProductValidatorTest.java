package org.cip4.lib.xjdf.validator.element;

import org.cip4.lib.xjdf.schema.Intent;
import org.cip4.lib.xjdf.schema.Product;
import org.junit.jupiter.api.Test;

public class ProductValidatorTest {

    @Test
    public void duplicateIntentsAllowed() {
        Product product = new Product().withIntent(
            new Intent().withName("LayoutIntent")
        ).withIntent(
            new Intent().withName("LayoutIntent")
        );
        ProductValidator validator = new ProductValidator();
        ValidationAssertions.assertIsInvalid(
            validator,
            product,
            "Product elements SHALL contain at most one intent element with the same Intent/@Name."
        );
    }

    @Test
    public void distinctIntentsAllowed() {
        Product product = new Product().withIntent(
            new Intent().withName("LayoutIntent")
        );
        ProductValidator validator = new ProductValidator();
        ValidationAssertions.assertIsValid(validator, product);
    }

    @Test
    public void noIntentsAllowed() {
        Product product = new Product();
        ProductValidator validator = new ProductValidator();
        ValidationAssertions.assertIsValid(validator, product);
    }
}