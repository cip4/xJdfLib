package org.cip4.lib.xjdf.validator.element;

import org.cip4.lib.xjdf.XJdfNodeFactory;
import org.cip4.lib.xjdf.schema.Intent;
import org.cip4.lib.xjdf.schema.LayoutIntent;
import org.junit.jupiter.api.Test;

import static org.cip4.lib.xjdf.validator.element.ElementValid.isValid;

import static org.hamcrest.MatcherAssert.assertThat;

public class IntentValidatorTest {

    XJdfNodeFactory nodeFactory = new XJdfNodeFactory();

    @Test
    public void equalNamesAllowed() throws Exception {
        Intent intent = new Intent()
            .withName("LayoutIntent")
            .withProductIntent(nodeFactory.createLayoutIntent(new LayoutIntent()));
        IntentValidator validator = new IntentValidator();
        assertThat(intent, isValid(validator));
    }

    @Test
    public void divergentNamesNotAllowed() throws Exception {
        Intent intent = new Intent()
            .withName("BindingIntent")
            .withProductIntent(nodeFactory.createLayoutIntent(new LayoutIntent()));
        IntentValidator validator = new IntentValidator();
        ValidationAssertions.assertIsInvalid(
            validator,
            intent,
            "The name of the element within //Intent SHALL be equal to //Intent/@Name."
        );
    }

    @Test
    public void allowIntentWithoutSpecificIntent() throws Exception {
        Intent intent = new Intent()
            .withName("BindingIntent");
        IntentValidator validator = new IntentValidator();
        assertThat(
            intent,
            isValid(validator)
        );
    }
}