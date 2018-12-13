package org.cip4.lib.xjdf.validator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AncestorsTest {

    @Test
    void parentReturnsNullIfItHasNoParent() {
        assertNull(new Ancestors().parent());
    }


    @Test
    void parentReturnsParent() {
        String root = "root";
        String parent = "parent";
        assertSame(parent, new Ancestors(root, parent).parent());
    }


}