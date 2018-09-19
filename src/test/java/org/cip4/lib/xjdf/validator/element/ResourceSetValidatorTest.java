package org.cip4.lib.xjdf.validator.element;

import org.cip4.lib.xjdf.XJdfNodeFactory;
import org.cip4.lib.xjdf.schema.DeliveryParams;
import org.cip4.lib.xjdf.schema.Resource;
import org.cip4.lib.xjdf.schema.ResourceSet;
import static org.cip4.lib.xjdf.validator.element.ElementValid.isValid;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class ResourceSetValidatorTest {

    private XJdfNodeFactory xJdfNodeFactory;

    @BeforeEach
    public void setUp() {
        xJdfNodeFactory = new XJdfNodeFactory();
    }

    @Test
    public void validateAllowsResourceOfCorrectName() {
        ResourceSet parameterSet = new ResourceSet().withName("DeliveryParams");
        parameterSet.withResource(xJdfNodeFactory.createResource(new DeliveryParams()));

        ResourceSetValidator validator = new ResourceSetValidator();
        assertThat(parameterSet, isValid(validator));
    }

    @Test
    public void validateAllowsSetWithoutResource() {
        ResourceSet parameterSet = new ResourceSet().withName("DeliveryParams");

        ResourceSetValidator validator = new ResourceSetValidator();

        assertThat(parameterSet, isValid(validator));
    }

    @Test
    public void validateDisallowsResourceOfDifferentName() {
        ResourceSet parameterSet = new ResourceSet().withName("PreflightParams");
        parameterSet.withResource(xJdfNodeFactory.createResource(new DeliveryParams()));

        ResourceSetValidator validator = new ResourceSetValidator();

        ValidationAssertions.assertIsInvalid(validator, parameterSet);
    }

    @Test
    public void validateDisallowsNameEmpty() {
        ResourceSet parameterSet = new ResourceSet().withName("");

        ResourceSetValidator validator = new ResourceSetValidator();

        ValidationAssertions.assertIsInvalid(validator, parameterSet);
    }

    @Test
    public void validateDisallowsNameNull() {
        ResourceSet parameterSet = new ResourceSet().withName(null);

        ResourceSetValidator validator = new ResourceSetValidator();

        ValidationAssertions.assertIsInvalid(validator, parameterSet);
    }

    @Test
    public void validateAllowsResourceWithoutSpecificResource() {
        ResourceSet parameterSet = new ResourceSet()
            .withName("Foo")
            .withResource(new Resource());

        ResourceSetValidator validator = new ResourceSetValidator();

        assertThat(parameterSet, isValid(validator));
    }
}