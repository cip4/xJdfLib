package org.cip4.lib.xjdf.validator.element;

import org.cip4.lib.xjdf.schema.DeviceInfo;
import org.cip4.lib.xjdf.schema.FileSpec;
import org.cip4.lib.xjdf.validator.Ancestors;
import org.cip4.lib.xjdf.validator.ValidationResult;
import org.cip4.lib.xjdf.validator.ValidationResultBuilder;

import java.util.List;

/**
 * Extended validation for element //FoldingIntent.
 */
public class DeviceInfoValidator extends SimpleValidator<DeviceInfo> {

    @Override
    public final void validate(
        final DeviceInfo deviceInfo, final Ancestors ancestors, ValidationResultBuilder validationResult
    ) {
        validateFileSpec(deviceInfo, validationResult);
        validateIdleStartTime(deviceInfo, validationResult);
    }

    @Override
    public boolean canValidate(final Object o) {
        return o instanceof DeviceInfo;
    }

    /**
     * Validate rules of attribute @IdleStartTime.
     *
     * @param deviceInfo DeviceInfo element to validate.
     * @param resultBuilder Container validations will be reported to.
     */
    private void validateIdleStartTime(final DeviceInfo deviceInfo, final ValidationResultBuilder resultBuilder) {
        if (null != deviceInfo.getIdleStartTime()) {
            if (null != deviceInfo.getJobPhase() && !deviceInfo.getJobPhase().isEmpty()) {
                resultBuilder.append(
                    "//DeviceInfo/@IdleStartTime SHALL NOT be specified if JobPhase Elements are present in the "
                        + "DeviceInfo"
                );
            }
        }
    }

    /**
     * Validate that only allowed FileSpec elements appear within the DeviceInfo element.
     *
     * @param deviceInfo DeviceInfo element to validate.
     * @param validationResult Container validations will be reported to.
     */
    private void validateFileSpec(final DeviceInfo deviceInfo, final ValidationResultBuilder validationResult) {
        List<FileSpec> fileSpecs = deviceInfo.getFileSpec();
        for (FileSpec fileSpec : fileSpecs) {
            if (!"Schema".equals(fileSpec.getResourceUsage()) && !"CurrentSchema".equals(fileSpec.getResourceUsage())) {
                validationResult.append(String.format(
                    "Element DeviceInfo may only contain FileSpec with @ResourceUsage='Schema', but @ResourceUsage='%s' "
                        + "was given",
                    fileSpec.getResourceUsage()
                ));
            }
        }
    }

}
