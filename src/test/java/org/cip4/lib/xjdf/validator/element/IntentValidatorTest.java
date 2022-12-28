package org.cip4.lib.xjdf.validator.element;

import org.cip4.lib.xjdf.schema.Intent;
import org.cip4.lib.xjdf.schema.LayoutIntent;
import org.cip4.lib.xjdf.schema.ObjectFactory;
import org.junit.jupiter.api.Test;

import static org.cip4.lib.xjdf.validator.element.ElementValid.isValid;

import static org.hamcrest.MatcherAssert.assertThat;

public class IntentValidatorTest {

    @Test
    public void equalNamesAllowed() {
        Intent intent = new Intent()
            .withName("LayoutIntent")
            .withProductIntent(new ObjectFactory().createLayoutIntent(new LayoutIntent()));
        IntentValidator validator = new IntentValidator();
        assertThat(intent, isValid(validator));
    }

    @Test
    public void divergentNamesNotAllowed() {
        Intent intent = new Intent()
            .withName("BindingIntent")
            .withProductIntent(new ObjectFactory().createLayoutIntent(new LayoutIntent()));
        IntentValidator validator = new IntentValidator();
        ValidationAssertions.assertIsInvalid(
            validator,
            intent,
            "The name of the element within //Intent SHALL be equal to //Intent/@Name."
        );
    }

    @Test
    public void allowIntentWithoutSpecificIntent() {
        Intent intent = new Intent()
            .withName("BindingIntent");
        IntentValidator validator = new IntentValidator();
        assertThat(
            intent,
            isValid(validator)
        );
    }
}