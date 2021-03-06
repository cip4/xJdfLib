package org.cip4.lib.xjdf.validator;

import org.cip4.lib.xjdf.schema.XJDF;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class XjdfValidatorTest {

    @Test
    public void executeValidationDispatcherForXjdfNode() {
        XJDF xjdf = new XJDF().withJobID("foo");
        ValidationDispatcher dispatcher = Mockito.mock(ValidationDispatcher.class);

        XjdfValidator validator = new XjdfValidator(dispatcher);
        validator.validate(xjdf);

        Mockito.verify(dispatcher).validate(xjdf);
    }
}