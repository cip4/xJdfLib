package org.cip4.lib.xjdf.validator.element;

import org.cip4.lib.xjdf.schema.AssemblingIntent;
import org.cip4.lib.xjdf.schema.Product;
import org.cip4.lib.xjdf.validator.Ancestors;
import org.junit.jupiter.api.Test;

public class AssemblingIntentValidatorTest {

    @Test
    public void allowReferenceToForeignProduct() {
        AssemblingIntent assemblingIntent = new AssemblingIntent().withContainer(new Product().withID("foo"));
        ValidationAssertions.assertIsValid(
            new AssemblingIntentValidator(),
            new Ancestors(new Product().withID("bar")),
            assemblingIntent
        );
    }

    @Test
    public void disallowReferencingParentProductAsContainer() {
        Product product = new Product().withID("foo");
        AssemblingIntent assemblingIntent = new AssemblingIntent().withContainer(product);
        ValidationAssertions.assertIsInvalid(
            new AssemblingIntentValidator(),
            new Ancestors(product),
            assemblingIntent,
            "@Container SHALL NOT reference the parent Product"
        );
    }
}