package org.cip4.lib.xjdf.validator.element;

import org.cip4.lib.xjdf.schema.ResourceSet;
import org.cip4.lib.xjdf.schema.XJDF;
import org.cip4.lib.xjdf.type.IntegerList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ResourceSetAmbiguityValidatorTest {

    @Test
    public void canValidateXjdf() {
        assertTrue(new ResourceSetAmbiguityValidator().canValidate(new XJDF()));
    }

    @Test
    public void canNotValidateResourceSet() {
        assertFalse(new ResourceSetAmbiguityValidator().canValidate(new ResourceSet()));
    }

    @Test
    public void resourceSetWithSameNameIsAmbiguous() {
        XJDF xjdf = new XJDF()
            .withResourceSet(
                new ResourceSet()
                    .withName("Foo")
            ).withResourceSet(
                new ResourceSet()
                    .withName("Foo")
            );

        ValidationAssertions.assertIsInvalid(
            new ResourceSetAmbiguityValidator(),
            xjdf,
            "same values of @Name, @Usage, @ProcessUsage and common or no entries in @CombinedProcessIndex"
        );
    }

    @Test
    public void resourceSetWithSameUsageIsAmbiguous() {
        XJDF xjdf = new XJDF()
            .withResourceSet(
                new ResourceSet()
                    .withUsage(ResourceSet.Usage.INPUT)
            ).withResourceSet(
                new ResourceSet()
                    .withUsage(ResourceSet.Usage.INPUT)
            );

        ValidationAssertions.assertIsInvalid(
            new ResourceSetAmbiguityValidator(),
            xjdf,
            "same values of @Name, @Usage, @ProcessUsage and common or no entries in @CombinedProcessIndex"
        );
    }

    @Test
    public void resourceSetWithSameProcessUsageIsAmbiguous() {
        XJDF xjdf = new XJDF()
            .withResourceSet(
                new ResourceSet()
                    .withProcessUsage("Foo")
            ).withResourceSet(
                new ResourceSet()
                    .withProcessUsage("Foo")
            );

        ValidationAssertions.assertIsInvalid(
            new ResourceSetAmbiguityValidator(),
            xjdf,
            "same values of @Name, @Usage, @ProcessUsage and common or no entries in @CombinedProcessIndex"
        );
    }

    @Test
    public void resourceSetWithOverlappingCombinedProcessUsageIsAmbiguous() {
        XJDF xjdf = new XJDF()
            .withResourceSet(
                new ResourceSet()
                    .withCombinedProcessIndex(new IntegerList(1, 2))
            ).withResourceSet(
                new ResourceSet()
                    .withCombinedProcessIndex(new IntegerList(2, 3))
            );

        ValidationAssertions.assertIsInvalid(
            new ResourceSetAmbiguityValidator(),
            xjdf,
            "same values of @Name, @Usage, @ProcessUsage and common or no entries in @CombinedProcessIndex"
        );
    }

    @Test
    public void resourceSetWithoutCombinedProcessUsageIsAmbiguous() {
        XJDF xjdf = new XJDF()
            .withResourceSet(
                new ResourceSet()
                    .withCombinedProcessIndex(new IntegerList(1, 2))
            ).withResourceSet(
                new ResourceSet()
            );

        ValidationAssertions.assertIsInvalid(
            new ResourceSetAmbiguityValidator(),
            xjdf,
            "same values of @Name, @Usage, @ProcessUsage and common or no entries in @CombinedProcessIndex"
        );
    }

    @Test
    public void resourceSetWithDifferentNameIsValid() {
        XJDF xjdf = new XJDF()
            .withResourceSet(
                new ResourceSet()
                    .withName("Foo")
            ).withResourceSet(
                new ResourceSet()
                    .withName("Bar")
            );

        ValidationAssertions.assertIsValid(
            new ResourceSetAmbiguityValidator(),
            xjdf
        );
    }


    @Test
    public void resourceSetWithDiffeentUsageIsValid() {
        XJDF xjdf = new XJDF()
            .withResourceSet(
                new ResourceSet()
                    .withUsage(ResourceSet.Usage.INPUT)
            ).withResourceSet(
                new ResourceSet()
                    .withUsage(ResourceSet.Usage.OUTPUT)
            );

        ValidationAssertions.assertIsValid(
            new ResourceSetAmbiguityValidator(),
            xjdf
        );
    }

    @Test
    public void resourceSetWithDifferentProcessUsageIsValid() {
        XJDF xjdf = new XJDF()
            .withResourceSet(
                new ResourceSet()
                    .withProcessUsage("Foo")
            ).withResourceSet(
                new ResourceSet()
                    .withProcessUsage("Bar")
            );

        ValidationAssertions.assertIsValid(
            new ResourceSetAmbiguityValidator(),
            xjdf
        );
    }

    @Test
    public void resourceSetWithNoOverlappingCombinedProcessUsageIsValid() {
        XJDF xjdf = new XJDF()
            .withResourceSet(
                new ResourceSet()
                    .withCombinedProcessIndex(new IntegerList(1, 2))
            ).withResourceSet(
                new ResourceSet()
                    .withCombinedProcessIndex(new IntegerList(3, 4))
            );

        ValidationAssertions.assertIsValid(
            new ResourceSetAmbiguityValidator(),
            xjdf
        );
    }


}