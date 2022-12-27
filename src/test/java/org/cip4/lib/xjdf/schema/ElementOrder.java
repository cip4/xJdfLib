package org.cip4.lib.xjdf.schema;

import org.cip4.lib.xjdf.exception.XJdfValidationException;
import org.cip4.lib.xjdf.xml.XJdfValidator;
import org.junit.jupiter.api.Test;


public class ElementOrder {

    @Test
    public void queryHeaderBeforeSubscription() {
        XJdfValidator validator = new XJdfValidator();
        try {
            validator.validate(this.getClass().getResourceAsStream("elementOrderInQuery.xjdf"));
        } catch (XJdfValidationException e) {
            throw new AssertionError(
                String.format(
                    "Sample is invalid:\n%s",
                    e.getMessage()
                ),
                e
            );
        }
    }


}
