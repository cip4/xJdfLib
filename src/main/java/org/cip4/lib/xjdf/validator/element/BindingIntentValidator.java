package org.cip4.lib.xjdf.validator.element;

import org.cip4.lib.xjdf.schema.BindingIntent;
import org.cip4.lib.xjdf.validator.Ancestors;
import org.cip4.lib.xjdf.validator.ValidationResultBuilder;

public class BindingIntentValidator implements Validator<BindingIntent> {
    @Override
    public void validate(
        final BindingIntent element, final Ancestors ancestors, final ValidationResultBuilder validationResult
    ) {
        if (
            BindingIntent.BindingOrder.NONE.equals(element.getBindingOrder())
                && null != element.getBindingSide()
        ) {
            validationResult.append(
                "BindingIntent/@BindingSide SHALL NOT be provided if BindingIntent/@BindingOrder=\"None\"."
            );
        }

        if (element.getAdhesiveNote() != null
            && !BindingIntent.BindingType.ADHESIVE_NOTE.equals(element.getBindingType())
        ) {
            validationResult.append(
                "@AdhesiveNote SHALL NOT be provided unless BindingIntent/@BindingType=\"AdhesiveNote\"."
            );
        }
        if (element.getEdgeGluing() != null
            && !BindingIntent.BindingType.EDGE_GLUING.equals(element.getBindingType())
        ) {
            validationResult.append(
                "@EdgeGluing SHALL NOT be provided unless BindingIntent/@BindingType=\"EdgeGluing\"."
            );
        }
        if (element.getHardCoverBinding() != null
            && !BindingIntent.BindingType.HARD_COVER.equals(element.getBindingType())
        ) {
            validationResult.append(
                "@HardCoverBinding SHALL NOT be provided unless BindingIntent/@BindingType=\"HardCover\"."
            );
        }
        if (element.getLooseBinding() != null
            && !BindingIntent.BindingType.CHANNEL_BINDING.equals(element.getBindingType())
            && !BindingIntent.BindingType.COIL_BINDING.equals(element.getBindingType())
            && !BindingIntent.BindingType.COMB_BINDING.equals(element.getBindingType())
            && !BindingIntent.BindingType.RING_BINDING.equals(element.getBindingType())
            && !BindingIntent.BindingType.STRIP_BINDING.equals(element.getBindingType())
        ) {
            validationResult.append(
                "@LooseBinding SHALL NOT be provided unless BindingIntent/@BindingType is one of "
                    + "\"ChannelBinding\", \"CoilBinding\", \"CombBinding\", \"RingBinding\" or \"StripBinding\"."
            );
        }
        if (element.getSaddleStitching() != null
            && !BindingIntent.BindingType.SADDLE_STITCH.equals(element.getBindingType())
        ) {
            validationResult.append(
                "@SaddleStitching SHALL NOT be provided unless BindingIntent/@BindingType=\"SaddleStitch\"."
            );
        }
        if (element.getSideStitching() != null
            && !BindingIntent.BindingType.SIDE_STITCH.equals(element.getBindingType())
        ) {
            validationResult.append(
                "@SideStitching SHALL NOT be provided unless BindingIntent/@BindingType=\"SideStitch\"."
            );
        }
        if (element.getSoftCoverBinding() != null
            && !BindingIntent.BindingType.SOFT_COVER.equals(element.getBindingType())
        ) {
            validationResult.append(
                "@SoftCoverBinding SHALL NOT be provided unless BindingIntent/@BindingType=\"SoftCover\"."
            );
        }
    }

    @Override
    public boolean canValidate(final Object o) {
        return o instanceof BindingIntent;
    }
}
