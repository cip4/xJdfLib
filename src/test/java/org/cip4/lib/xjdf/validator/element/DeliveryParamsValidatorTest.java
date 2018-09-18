package org.cip4.lib.xjdf.validator.element;

import org.cip4.lib.xjdf.schema.DeliveryParams;
import org.cip4.lib.xjdf.schema.FileSpec;
import org.junit.jupiter.api.Test;

import static org.cip4.lib.xjdf.validator.element.ElementValid.isValid;
import static org.hamcrest.MatcherAssert.assertThat;

public class DeliveryParamsValidatorTest {

    @Test
    public void validateAllowsSingleOccurrence() throws Exception {
        DeliveryParamsValidator validator = new DeliveryParamsValidator();
        assertThat(getDeliveryParams("RemoteURL"), isValid(validator));
    }

    @Test
    public void validateAllowsNoOccurrence() throws Exception {
        DeliveryParamsValidator validator = new DeliveryParamsValidator();
        assertThat(getDeliveryParams(), isValid(validator));
    }

    @Test
    public void validateDisallowsDuplicate() throws Exception {
        DeliveryParamsValidator validator = new DeliveryParamsValidator();
        ValidationAssertions.assertIsInvalid(validator, getDeliveryParams("RemoteURL", "RemoteURL"));
    }

    @Test
    public void validateDisallowsUnknownResourceUsages() throws Exception {
        DeliveryParamsValidator validator = new DeliveryParamsValidator();
        ValidationAssertions.assertIsInvalid(validator, getDeliveryParams("SomeInvalidString"));
    }

    @Test
    public void validateDisallowsEmptyResourceUsage() throws Exception {
        DeliveryParamsValidator validator = new DeliveryParamsValidator();
        ValidationAssertions.assertIsInvalid(validator, getDeliveryParams(""));
    }

    @Test
    public void validateDisallowsResourceUsageNull() throws Exception {
        DeliveryParamsValidator validator = new DeliveryParamsValidator();
        ValidationAssertions.assertIsInvalid(validator, getDeliveryParams(new String[]{null}));
    }

    private DeliveryParams getDeliveryParams(String... fileSpecResourceUsages) {
        DeliveryParams deliveryParams = new DeliveryParams();
        for (String resourceUsage : fileSpecResourceUsages) {
            deliveryParams.withFileSpec(new FileSpec().withResourceUsage(resourceUsage));
        }
        return deliveryParams;
    }
}