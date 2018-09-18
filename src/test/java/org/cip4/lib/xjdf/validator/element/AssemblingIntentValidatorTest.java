package org.cip4.lib.xjdf.validator.element;

import org.cip4.lib.xjdf.schema.AssemblingIntent;
import org.cip4.lib.xjdf.schema.Product;
import org.cip4.lib.xjdf.validator.Ancestors;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class AssemblingIntentValidatorTest {

    @Test
    public void allowReferenceToForeignProduct() throws Exception {
        AssemblingIntent assemblingIntent = new AssemblingIntent().withContainer(new Product().withID("foo"));
        assertThat(
            assemblingIntent,
            ElementValid.isValid(
                new AssemblingIntentValidator(),
                new Ancestors(new Product().withID("bar"))
            )
        );
    }

    @Test
    public void disallowReferencingParentProductAsContainer() throws Exception {
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