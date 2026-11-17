package org.cip4.lib.xjdf.validator.element;

import org.cip4.lib.xjdf.schema.DeliveryParams;
import org.cip4.lib.xjdf.schema.FileSpec;
import org.junit.jupiter.api.Test;

public class DeliveryParamsValidatorTest {

    @Test
    public void validateAllowsSingleOccurrence() {
        DeliveryParamsValidator validator = new DeliveryParamsValidator();
        ValidationAssertions.assertIsValid(validator, getDeliveryParams("RemoteURL"));
    }

    @Test
    public void validateAllowsNoOccurrence() {
        DeliveryParamsValidator validator = new DeliveryParamsValidator();
        ValidationAssertions.assertIsValid(validator, getDeliveryParams());
    }

    @Test
    public void validateDisallowsDuplicate() {
        DeliveryParamsValidator validator = new DeliveryParamsValidator();
        ValidationAssertions.assertIsInvalid(validator, getDeliveryParams("RemoteURL", "RemoteURL"));
    }

    @Test
    public void validateDisallowsUnknownResourceUsages() {
        DeliveryParamsValidator validator = new DeliveryParamsValidator();
        ValidationAssertions.assertIsInvalid(validator, getDeliveryParams("SomeInvalidString"));
    }

    @Test
    public void validateDisallowsEmptyResourceUsage() {
        DeliveryParamsValidator validator = new DeliveryParamsValidator();
        ValidationAssertions.assertIsInvalid(validator, getDeliveryParams(""));
    }

    @Test
    public void validateDisallowsResourceUsageNull() {
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