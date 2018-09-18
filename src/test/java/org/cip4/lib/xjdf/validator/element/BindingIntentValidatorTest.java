package org.cip4.lib.xjdf.validator.element;

import org.cip4.lib.xjdf.schema.AdhesiveNote;
import org.cip4.lib.xjdf.schema.AssemblingIntent;
import org.cip4.lib.xjdf.schema.BindingIntent;
import org.cip4.lib.xjdf.schema.Edge;
import org.cip4.lib.xjdf.schema.EdgeGluing;
import org.cip4.lib.xjdf.schema.HardCoverBinding;
import org.cip4.lib.xjdf.schema.LooseBinding;
import org.cip4.lib.xjdf.schema.SaddleStitching;
import org.cip4.lib.xjdf.schema.SideStitching;
import org.cip4.lib.xjdf.schema.SoftCoverBinding;
import org.junit.Test;

import static org.junit.Assert.*;

public class BindingIntentValidatorTest {

    @Test
    public void canValidateBindingIntent() {
        assertTrue(
            new BindingIntentValidator().canValidate(new BindingIntent())
        );
    }

    @Test
    public void canNotValidateAssemblingIntent() {
        assertFalse(
            new BindingIntentValidator().canValidate(new AssemblingIntent())
        );
    }

    @Test
    public void onlyBindingSideIsValid() {
        ValidationAssertions.assertIsValid(
            new BindingIntentValidator(),
            new BindingIntent().withBindingSide(Edge.BOTTOM)
        );
    }

    @Test
    public void noBindingSideIsValid() {
        ValidationAssertions.assertIsValid(
            new BindingIntentValidator(),
            new BindingIntent()
        );
    }

    @Test
    public void onlyBindingOrderIsValid() {
        ValidationAssertions.assertIsValid(
            new BindingIntentValidator(),
            new BindingIntent().withBindingOrder(BindingIntent.BindingOrder.COLLECTING)
        );
    }

    @Test
    public void nonNoneBindingOrderAndBindingSideIsValid() {
        ValidationAssertions.assertIsValid(
            new BindingIntentValidator(),
            new BindingIntent()
                .withBindingOrder(BindingIntent.BindingOrder.COLLECTING)
                .withBindingSide(Edge.BOTTOM)
        );
    }

    @Test
    public void BindingOrderNoneAndBindingSideIsInValid() {
        ValidationAssertions.assertIsInvalid(
            new BindingIntentValidator(),
            new BindingIntent()
                .withBindingOrder(BindingIntent.BindingOrder.NONE)
                .withBindingSide(Edge.BOTTOM),
            "BindingIntent/@BindingSide SHALL NOT be provided if BindingIntent/@BindingOrder=\"None\"."
        );
    }

    @Test
    public void adhesiveNoteMayBeEmptyForCorrespondingBindingType() {
        ValidationAssertions.assertIsValid(
            new BindingIntentValidator(),
            new BindingIntent().withBindingType(BindingIntent.BindingType.ADHESIVE_NOTE)
        );
    }

    @Test
    public void adhesiveNoteMayBePresentForCorrespondingBindingType() {
        ValidationAssertions.assertIsValid(
            new BindingIntentValidator(),
            new BindingIntent()
                .withBindingType(BindingIntent.BindingType.ADHESIVE_NOTE)
                .withAdhesiveNote(new AdhesiveNote())
        );
    }

    @Test
    public void adhesiveNoteMayNotBePresentForOtherBindingType() {
        ValidationAssertions.assertIsInvalid(
            new BindingIntentValidator(),
            new BindingIntent()
                .withBindingType(BindingIntent.BindingType.CHANNEL_BINDING)
                .withAdhesiveNote(new AdhesiveNote()),
            "@AdhesiveNote SHALL NOT be provided unless BindingIntent/@BindingType=\"AdhesiveNote\"."
        );
    }

    @Test
    public void adhesiveNoteMayNotBePresentWithoutBindingType() {
        ValidationAssertions.assertIsInvalid(
            new BindingIntentValidator(),
            new BindingIntent()
                .withAdhesiveNote(new AdhesiveNote()),
            "@AdhesiveNote SHALL NOT be provided unless BindingIntent/@BindingType=\"AdhesiveNote\"."
        );
    }

    @Test
    public void edgeGluingMayBeEmptyForCorrespondingBindingType() {
        ValidationAssertions.assertIsValid(
            new BindingIntentValidator(),
            new BindingIntent().withBindingType(BindingIntent.BindingType.EDGE_GLUING)
        );
    }

    @Test
    public void edgeGluingMayBePresentForCorrespondingBindingType() {
        ValidationAssertions.assertIsValid(
            new BindingIntentValidator(),
            new BindingIntent()
                .withBindingType(BindingIntent.BindingType.EDGE_GLUING)
                .withEdgeGluing(new EdgeGluing())
        );
    }

    @Test
    public void edgeGluingMayNotBePresentForOtherBindingType() {
        ValidationAssertions.assertIsInvalid(
            new BindingIntentValidator(),
            new BindingIntent()
                .withBindingType(BindingIntent.BindingType.CHANNEL_BINDING)
                .withEdgeGluing(new EdgeGluing()),
            "@EdgeGluing SHALL NOT be provided unless BindingIntent/@BindingType=\"EdgeGluing\"."
        );
    }

    @Test
    public void edgeGluingMayNotBePresentWithoutBindingType() {
        ValidationAssertions.assertIsInvalid(
            new BindingIntentValidator(),
            new BindingIntent()
                .withEdgeGluing(new EdgeGluing()),
            "@EdgeGluing SHALL NOT be provided unless BindingIntent/@BindingType=\"EdgeGluing\"."
        );
    }

    @Test
    public void hardCoverMayBeEmptyForCorrespondingBindingType() {
        ValidationAssertions.assertIsValid(
            new BindingIntentValidator(),
            new BindingIntent().withBindingType(BindingIntent.BindingType.HARD_COVER)
        );
    }

    @Test
    public void hardCoverMayBePresentForCorrespondingBindingType() {
        ValidationAssertions.assertIsValid(
            new BindingIntentValidator(),
            new BindingIntent()
                .withBindingType(BindingIntent.BindingType.HARD_COVER)
                .withHardCoverBinding(new HardCoverBinding())
        );
    }

    @Test
    public void hardCoverMayNotBePresentForOtherBindingType() {
        ValidationAssertions.assertIsInvalid(
            new BindingIntentValidator(),
            new BindingIntent()
                .withBindingType(BindingIntent.BindingType.CHANNEL_BINDING)
                .withHardCoverBinding(new HardCoverBinding()),
            "@HardCoverBinding SHALL NOT be provided unless BindingIntent/@BindingType=\"HardCover\"."
        );
    }

    @Test
    public void hardCoverMayNotBePresentWithoutBindingType() {
        ValidationAssertions.assertIsInvalid(
            new BindingIntentValidator(),
            new BindingIntent()
                .withHardCoverBinding(new HardCoverBinding()),
            "@HardCoverBinding SHALL NOT be provided unless BindingIntent/@BindingType=\"HardCover\"."
        );
    }

    @Test
    public void looseBindingMayBeEmptyForCorrespondingBindingType() {
        ValidationAssertions.assertIsValid(
            new BindingIntentValidator(),
            new BindingIntent().withBindingType(BindingIntent.BindingType.CHANNEL_BINDING)
        );
    }

    @Test
    public void looseBindingMayBePresentForChannelBinding() {
        ValidationAssertions.assertIsValid(
            new BindingIntentValidator(),
            new BindingIntent()
                .withBindingType(BindingIntent.BindingType.CHANNEL_BINDING)
                .withLooseBinding(new LooseBinding())
        );
    }

    @Test
    public void looseBindingMayBePresentForCoilBinding() {
        ValidationAssertions.assertIsValid(
            new BindingIntentValidator(),
            new BindingIntent()
                .withBindingType(BindingIntent.BindingType.COIL_BINDING)
                .withLooseBinding(new LooseBinding())
        );
    }

    @Test
    public void looseBindingMayBePresentForCombBinding() {
        ValidationAssertions.assertIsValid(
            new BindingIntentValidator(),
            new BindingIntent()
                .withBindingType(BindingIntent.BindingType.COMB_BINDING)
                .withLooseBinding(new LooseBinding())
        );
    }

    @Test
    public void looseBindingMayBePresentForRingBinding() {
        ValidationAssertions.assertIsValid(
            new BindingIntentValidator(),
            new BindingIntent()
                .withBindingType(BindingIntent.BindingType.RING_BINDING)
                .withLooseBinding(new LooseBinding())
        );
    }

    @Test
    public void looseBindingMayBePresentForStripBinding() {
        ValidationAssertions.assertIsValid(
            new BindingIntentValidator(),
            new BindingIntent()
                .withBindingType(BindingIntent.BindingType.STRIP_BINDING)
                .withLooseBinding(new LooseBinding())
        );
    }

    @Test
    public void looseBindingMayNotBePresentForOtherBindingType() {
        ValidationAssertions.assertIsInvalid(
            new BindingIntentValidator(),
            new BindingIntent()
                .withBindingType(BindingIntent.BindingType.HARD_COVER)
                .withLooseBinding(new LooseBinding()),
            "@LooseBinding SHALL NOT be provided unless BindingIntent/@BindingType is one of"
        );
    }

    @Test
    public void looseBindingMayNotBePresentWithoutBindingType() {
        ValidationAssertions.assertIsInvalid(
            new BindingIntentValidator(),
            new BindingIntent()
                .withLooseBinding(new LooseBinding()),
            "@LooseBinding SHALL NOT be provided unless BindingIntent/@BindingType is one of"
        );
    }

    @Test
    public void saddleStitchMayBeEmptyForCorrespondingBindingType() {
        ValidationAssertions.assertIsValid(
            new BindingIntentValidator(),
            new BindingIntent().withBindingType(BindingIntent.BindingType.SADDLE_STITCH)
        );
    }

    @Test
    public void saddleStitchMayBePresentForCorrespondingBindingType() {
        ValidationAssertions.assertIsValid(
            new BindingIntentValidator(),
            new BindingIntent()
                .withBindingType(BindingIntent.BindingType.SADDLE_STITCH)
                .withSaddleStitching(new SaddleStitching())
        );
    }

    @Test
    public void saddleStitchMayNotBePresentForOtherBindingType() {
        ValidationAssertions.assertIsInvalid(
            new BindingIntentValidator(),
            new BindingIntent()
                .withBindingType(BindingIntent.BindingType.CHANNEL_BINDING)
                .withSaddleStitching(new SaddleStitching()),
            "@SaddleStitching SHALL NOT be provided unless BindingIntent/@BindingType=\"SaddleStitch\"."
        );
    }

    @Test
    public void saddleStitchMayNotBePresentWithoutBindingType() {
        ValidationAssertions.assertIsInvalid(
            new BindingIntentValidator(),
            new BindingIntent()
                .withSaddleStitching(new SaddleStitching()),
            "@SaddleStitching SHALL NOT be provided unless BindingIntent/@BindingType=\"SaddleStitch\"."
        );
    }

    @Test
    public void sideStitchMayBeEmptyForCorrespondingBindingType() {
        ValidationAssertions.assertIsValid(
            new BindingIntentValidator(),
            new BindingIntent().withBindingType(BindingIntent.BindingType.SIDE_STITCH)
        );
    }

    @Test
    public void sideStitchMayBePresentForCorrespondingBindingType() {
        ValidationAssertions.assertIsValid(
            new BindingIntentValidator(),
            new BindingIntent()
                .withBindingType(BindingIntent.BindingType.SIDE_STITCH)
                .withSideStitching(new SideStitching())
        );
    }

    @Test
    public void sideStitchMayNotBePresentForOtherBindingType() {
        ValidationAssertions.assertIsInvalid(
            new BindingIntentValidator(),
            new BindingIntent()
                .withBindingType(BindingIntent.BindingType.CHANNEL_BINDING)
                .withSideStitching(new SideStitching()),
            "@SideStitching SHALL NOT be provided unless BindingIntent/@BindingType=\"SideStitch\"."
        );
    }

    @Test
    public void sideStitchMayNotBePresentWithoutBindingType() {
        ValidationAssertions.assertIsInvalid(
            new BindingIntentValidator(),
            new BindingIntent()
                .withSideStitching(new SideStitching()),
            "@SideStitching SHALL NOT be provided unless BindingIntent/@BindingType=\"SideStitch\"."
        );
    }

    @Test
    public void softCoverMayBeEmptyForCorrespondingBindingType() {
        ValidationAssertions.assertIsValid(
            new BindingIntentValidator(),
            new BindingIntent().withBindingType(BindingIntent.BindingType.SOFT_COVER)
        );
    }

    @Test
    public void softCoverMayBePresentForCorrespondingBindingType() {
        ValidationAssertions.assertIsValid(
            new BindingIntentValidator(),
            new BindingIntent()
                .withBindingType(BindingIntent.BindingType.SOFT_COVER)
                .withSoftCoverBinding(new SoftCoverBinding())
        );
    }

    @Test
    public void softCoverMayNotBePresentForOtherBindingType() {
        ValidationAssertions.assertIsInvalid(
            new BindingIntentValidator(),
            new BindingIntent()
                .withBindingType(BindingIntent.BindingType.CHANNEL_BINDING)
                .withSoftCoverBinding(new SoftCoverBinding()),
            "@SoftCoverBinding SHALL NOT be provided unless BindingIntent/@BindingType=\"SoftCover\"."
        );
    }

    @Test
    public void softCoverMayNotBePresentWithoutBindingType() {
        ValidationAssertions.assertIsInvalid(
            new BindingIntentValidator(),
            new BindingIntent()
                .withSoftCoverBinding(new SoftCoverBinding()),
            "@SoftCoverBinding SHALL NOT be provided unless BindingIntent/@BindingType=\"SoftCover\"."
        );
    }
}