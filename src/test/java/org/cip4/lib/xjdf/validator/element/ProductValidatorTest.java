package org.cip4.lib.xjdf.validator.element;

import org.cip4.lib.xjdf.schema.Intent;
import org.cip4.lib.xjdf.schema.Product;
import static org.cip4.lib.xjdf.validator.element.ElementValid.isValid;
import org.junit.Test;

import java.util.Collections;

import static org.junit.Assert.*;

public class ProductValidatorTest {

    @Test
    public void duplicateIntentsAllowed() throws Exception {
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
    public void distinctIntentsAllowed() throws Exception {
        Product product = new Product().withIntent(
            new Intent().withName("LayoutIntent")
        );
        ProductValidator validator = new ProductValidator();
        assertThat(product, isValid(validator));
    }

    @Test
    public void noIntentsAllowed() throws Exception {
        Product product = new Product();
        ProductValidator validator = new ProductValidator();
        assertThat(product, isValid(validator));
    }
}