package org.cip4.lib.xjdf.validator.element;

import org.cip4.lib.xjdf.schema.Resource;
import org.cip4.lib.xjdf.schema.ResourceInfo;
import org.cip4.lib.xjdf.schema.ResourceSet;
import org.cip4.lib.xjdf.validator.Ancestors;
import org.junit.jupiter.api.Test;

class ResourceSetUsageValidatorTest {

    @Test
    void resourceWithoutIdWithinResourceSetWithoutUsageAndIdIsInvalid() {
        Resource resource = new Resource();

        ResourceSet set = new ResourceSet()
            .withName("Foo")
            .withResource(resource);

        ValidationAssertions.assertIsInvalid(
            new ResourceSetUsageValidator(),
            set
        );
    }

    @Test
    void resourceWithinResourceInfoDoesNotNeedAnId() {
        Resource resource = new Resource();

        ResourceSet set = new ResourceSet()
            .withName("Foo")
            .withResource(resource);

        ValidationAssertions.assertIsValid(
            new ResourceSetUsageValidator(),
            new Ancestors(new ResourceInfo().withResourceSet(set)),
            set
        );
    }


}