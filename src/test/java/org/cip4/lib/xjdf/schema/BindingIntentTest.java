package org.cip4.lib.xjdf.schema;

import org.junit.Test;

import java.util.Collections;

import static org.junit.Assert.*;

public class BindingIntentTest {

    @Test
    public void productGetChildrenRaw() throws Exception {
        Product childProduct = new Product();
        BindingIntent bindingIntent = new BindingIntent().withChildren(childProduct);
        assertEquals(Collections.singletonList(childProduct), bindingIntent.getChildrenRaw());
    }

    @Test
    public void productGetChildrenRawIsEmptyByDefault() throws Exception {
        BindingIntent bindingIntent = new BindingIntent();
        assertNull(bindingIntent.getChildrenRaw());
    }
}