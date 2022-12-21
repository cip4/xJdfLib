package org.cip4.lib.xjdf.xml.internal;

import org.cip4.lib.xjdf.xml.XJdfConstants;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XJdfNamespaceMapperTest {

    @Test
    public void getPreferredPrefix_enforce() throws Exception {

        // arrange
        XJdfNamespaceMapper xJdfNamespaceMapper = new XJdfNamespaceMapper(true);

        // act
        String prefix = xJdfNamespaceMapper.getPreferredPrefix(XJdfConstants.NAMESPACE_JDF20, "foo", false);

        // assert
        assertEquals("xjdf", prefix, "Prefix is wrong.");
    }

    @Test
    public void getPreferredPrefix_enforce_suggestion() throws Exception {

        // arrange
        XJdfNamespaceMapper xJdfNamespaceMapper = new XJdfNamespaceMapper(true);

        // act
        String prefix = xJdfNamespaceMapper.getPreferredPrefix("bar", "foo", false);

        // assert
        assertEquals("foo", prefix, "Prefix is wrong.");
    }

    @Test
    public void getPreferredPrefix_optional() throws Exception {

        // arrange
        XJdfNamespaceMapper xJdfNamespaceMapper = new XJdfNamespaceMapper(false);

        // act
        String prefix = xJdfNamespaceMapper.getPreferredPrefix(XJdfConstants.NAMESPACE_JDF20, "foo", false);

        // assert
        assertEquals("", prefix, "Prefix is wrong.");
    }

    @Test
    public void getPreferredPrefix_optional_suggestion() throws Exception {

        // arrange
        XJdfNamespaceMapper xJdfNamespaceMapper = new XJdfNamespaceMapper(false);

        // act
        String prefix = xJdfNamespaceMapper.getPreferredPrefix("bar", "foo", false);

        // assert
        assertEquals("", prefix, "Prefix is wrong.");
    }

    @Test
    public void getPreferredPrefix_optional_requirePrefix() throws Exception {

        // arrange
        XJdfNamespaceMapper xJdfNamespaceMapper = new XJdfNamespaceMapper(false);

        // act
        String prefix = xJdfNamespaceMapper.getPreferredPrefix(XJdfConstants.NAMESPACE_JDF20, "foo", true);

        // assert
        assertEquals("xjdf", prefix, "Prefix is wrong.");
    }

    @Test
    public void getPreferredPrefix_optional_suggestion_requirePrefix() throws Exception {

        // arrange
        XJdfNamespaceMapper xJdfNamespaceMapper = new XJdfNamespaceMapper(false);

        // act
        String prefix = xJdfNamespaceMapper.getPreferredPrefix("bar", "foo", true);

        // assert
        assertEquals("foo", prefix, "Prefix is wrong.");
    }
}