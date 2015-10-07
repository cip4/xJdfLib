package org.cip4.lib.xjdf.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilTest {

    @Test
    public void normalize() {
        String str = StringUtil.normalize("ABCabc0123{³²!!§$.zip");
        assertEquals("ABCabc0123_______.zip", str);
    }
}