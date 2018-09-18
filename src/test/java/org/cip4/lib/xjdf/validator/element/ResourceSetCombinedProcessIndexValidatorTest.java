package org.cip4.lib.xjdf.validator.element;

import org.cip4.lib.xjdf.schema.ResourceSet;
import org.cip4.lib.xjdf.schema.XJDF;
import org.cip4.lib.xjdf.type.IntegerList;
import org.cip4.lib.xjdf.validator.Ancestors;
import org.junit.Test;

public class ResourceSetCombinedProcessIndexValidatorTest {

    @Test
    public void combinedIndexMustBeWithinTheRangeOfTypes() {
        ResourceSet resourceSet = new ResourceSet().withCombinedProcessIndex(new IntegerList(1));
        XJDF xjdf = new XJDF()
            .withTypes("Foo")
            .withResourceSet(
                resourceSet
            );
        ValidationAssertions.assertIsInvalid(
            new ResourceSetCombinedProcessIndexValidator(),
            new Ancestors(xjdf),
            resourceSet,
            "@CombinedProcessIndex SHALL NOT reference an index bigger"
        );
    }

    @Test
    public void combinedProcessIndexCanReferenceTypesByIndex() {
        ResourceSet resourceSet = new ResourceSet().withCombinedProcessIndex(new IntegerList(0));
        XJDF xjdf = new XJDF()
            .withTypes("Foo")
            .withResourceSet(
                resourceSet
            );
        ValidationAssertions.assertIsValid(
            new ResourceSetCombinedProcessIndexValidator(),
            new Ancestors(xjdf),
            resourceSet
        );
    }
}