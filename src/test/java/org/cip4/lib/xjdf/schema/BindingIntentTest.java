package org.cip4.lib.xjdf.schema;

import org.junit.Test;

import java.util.Collections;

import static org.junit.Assert.*;

public class BindingIntentTest {

    @Test
    public void productGetRawChildRefs() throws Exception {
        Product childProduct = new Product();
        BindingIntent bindingIntent = new BindingIntent().withChildRefs(childProduct);
        assertEquals(Collections.singletonList(childProduct), bindingIntent.getRawChildRefs());
    }

    @Test
    public void productGetRawChildRefsIsEmptyByDefault() throws Exception {
        BindingIntent bindingIntent = new BindingIntent();
        assertNull(bindingIntent.getRawChildRefs());
    }
}