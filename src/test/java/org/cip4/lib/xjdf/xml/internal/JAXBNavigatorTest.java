package org.cip4.lib.xjdf.xml.internal;

import org.cip4.lib.xjdf.XJdfNodeFactory;
import org.cip4.lib.xjdf.builder.XJdfBuilder;
import org.cip4.lib.xjdf.schema.FileSpec;
import org.cip4.lib.xjdf.schema.XJDF;
import org.cip4.lib.xjdf.type.URI;
import org.junit.Test;

import javax.xml.xpath.XPathConstants;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class JAXBNavigatorTest {

    @Test
    public void evaluateNode() throws Exception {
        XJdfBuilder builder = new XJdfBuilder("123JobID");
        builder.addParameter(new XJdfNodeFactory().createRunList(new URI(new java.net.URI("MyUri"))));
        final XJDF xjdf = builder.build();
        JAXBNavigator<XJDF> navigator = new JAXBNavigator<>(xjdf);
        final Object object = navigator.evaluate("//xjdf:FileSpec", XPathConstants.NODE);
        assertTrue(object instanceof FileSpec);
    }

    @Test
    public void evaluateNodeSet() throws Exception {
        XJdfBuilder builder = new XJdfBuilder("123JobID");
        builder.addParameter(new XJdfNodeFactory().createRunList(new URI(new java.net.URI("FirstUri"))));
        builder.addParameter(new XJdfNodeFactory().createRunList(new URI(new java.net.URI("SecondUri"))));
        final XJDF xjdf = builder.build();
        JAXBNavigator<XJDF> navigator = new JAXBNavigator<>(xjdf);
        final Object object = navigator.evaluate("//xjdf:FileSpec", XPathConstants.NODESET);
        assertTrue(object instanceof Object[]);
        Object[] array = (Object[]) object;
        assertEquals(2, array.length);
    }

    @Test(expected = IllegalArgumentException.class)
    public void evaluateFails() throws Exception {
        XJdfBuilder builder = new XJdfBuilder("123JobID");
        builder.addParameter(new XJdfNodeFactory().createRunList(new URI(new java.net.URI("MyUri"))));
        final XJDF xjdf = builder.build();
        JAXBNavigator<XJDF> navigator = new JAXBNavigator<>(xjdf);
        navigator.evaluate("//xjdf:FileSpec", XPathConstants.STRING);
    }
}