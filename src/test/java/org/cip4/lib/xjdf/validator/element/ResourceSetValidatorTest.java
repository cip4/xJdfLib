package org.cip4.lib.xjdf.validator.element;

import org.cip4.lib.xjdf.XJdfNodeFactory;
import org.cip4.lib.xjdf.schema.DeliveryParams;
import org.cip4.lib.xjdf.schema.Resource;
import org.cip4.lib.xjdf.schema.ResourceSet;
import static org.cip4.lib.xjdf.validator.element.ElementValid.isValid;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ResourceSetValidatorTest {

    private XJdfNodeFactory xJdfNodeFactory;

    @Before
    public void setUp() throws Exception {
        xJdfNodeFactory = new XJdfNodeFactory();
    }

    @Test
    public void validateAllowsResourceOfCorrectName() throws Exception {
        ResourceSet parameterSet = new ResourceSet().withName("DeliveryParams");
        parameterSet.withResource(xJdfNodeFactory.createResource(new DeliveryParams()));

        ResourceSetValidator validator = new ResourceSetValidator();
        assertThat(parameterSet, isValid(validator));
    }

    @Test
    public void validateAllowsSetWithoutResource() throws Exception {
        ResourceSet parameterSet = new ResourceSet().withName("DeliveryParams");

        ResourceSetValidator validator = new ResourceSetValidator();

        assertThat(parameterSet, isValid(validator));
    }

    @Test
    public void validateDisallowsResourceOfDifferentName() throws Exception {
        ResourceSet parameterSet = new ResourceSet().withName("PreflightParams");
        parameterSet.withResource(xJdfNodeFactory.createResource(new DeliveryParams()));

        ResourceSetValidator validator = new ResourceSetValidator();

        ValidationAssertions.assertIsInvalid(validator, parameterSet);
    }

    @Test
    public void validateDisallowsNameEmpty() throws Exception {
        ResourceSet parameterSet = new ResourceSet().withName("");

        ResourceSetValidator validator = new ResourceSetValidator();

        ValidationAssertions.assertIsInvalid(validator, parameterSet);
    }

    @Test
    public void validateDisallowsNameNull() throws Exception {
        ResourceSet parameterSet = new ResourceSet().withName(null);

        ResourceSetValidator validator = new ResourceSetValidator();

        ValidationAssertions.assertIsInvalid(validator, parameterSet);
    }

    @Test
    public void validateAllowsResourceWithoutSpecificResource() throws Exception {
        ResourceSet parameterSet = new ResourceSet()
            .withName("Foo")
            .withResource(new Resource());

        ResourceSetValidator validator = new ResourceSetValidator();

        assertThat(parameterSet, isValid(validator));
    }
}