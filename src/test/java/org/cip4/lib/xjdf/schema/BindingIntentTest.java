package org.cip4.lib.xjdf.schema;

import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

public class BindingIntentTest {

    @Test
    public void productGetChildrenRaw() {
        Product childProduct = new Product();
        BindingIntent bindingIntent = new BindingIntent().withChildren(childProduct);
        assertEquals(Collections.singletonList(childProduct), bindingIntent.getChildrenRaw());
    }

    @Test
    public void productGetChildrenRawIsEmptyByDefault() {
        BindingIntent bindingIntent = new BindingIntent();
        assertNull(bindingIntent.getChildrenRaw());
    }
}