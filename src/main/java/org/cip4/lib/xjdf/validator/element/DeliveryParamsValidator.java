package org.cip4.lib.xjdf.validator.element;

import org.cip4.lib.xjdf.schema.DeliveryParams;
import org.cip4.lib.xjdf.schema.FileSpec;
import org.cip4.lib.xjdf.validator.Ancestors;
import org.cip4.lib.xjdf.validator.ValidationResult;
import org.cip4.lib.xjdf.validator.ValidationResultBuilder;

import java.util.Arrays;
import java.util.List;

/**
 * Extended validation for element //FoldingIntent.
 */
public class DeliveryParamsValidator extends SimpleValidator<DeliveryParams> {

    /**
     * List of allowed resource usages within FileSpec elements.
     */
    private final List<String> allowedResourceUsages = Arrays.asList("DeliveryContents", "MailingList", "RemoteURL");

    @Override
    public void validate(
        final DeliveryParams deliveryParams, final Ancestors ancestors, ValidationResultBuilder validationResult
    ) {
        List<FileSpec> fileSpecs = deliveryParams.getFileSpec();
        for (String resourceUsage : allowedResourceUsages) {
            validationResult.append(validateResourceUsageCount(fileSpecs, resourceUsage));
        }

        for (FileSpec fileSpec : fileSpecs) {
            if (!allowedResourceUsages.contains(fileSpec.getResourceUsage())) {
                validationResult.append(String.format(
                    "FileSpec with @ResourceUsage='%s' is not allowed within element '//DeliveryParams'.",
                    fileSpec.getResourceUsage()
                ));
            }
        }

        // Validate FileSpec elements in DeliveryParams
    }

    @Override
    public boolean canValidate(final Object o) {
        return o instanceof DeliveryParams;
    }

    /**
     * Validate that a resourceUsage value is only used for a single FileSpec element.
     *
     * @param fileSpecs List of FileSpec elements to validate.
     * @param resourceUsage Value of @ResourceUsage to search for.
     *
     * @return Result of the validation.
     */
    final ValidationResult validateResourceUsageCount(final List<FileSpec> fileSpecs, final String resourceUsage) {
        int count = 0;
        for (FileSpec fileSpec : fileSpecs) {
            if (resourceUsage.equals(fileSpec.getResourceUsage())) {
                ++count;
            }
        }
        if (count > 1) {
            return new ValidationResult(String.format(
                "FileSpec with @ResourceUsage='%s' is only allowed once within element '//DeliveryParams' but %d"
                    + " are present.",
                fileSpecs,
                count
            ));
        }
        return new ValidationResult();
    }


}
