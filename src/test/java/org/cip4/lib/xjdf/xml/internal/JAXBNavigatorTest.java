package org.cip4.lib.xjdf.xml.internal;

import org.cip4.lib.xjdf.XJdfNodeFactory;
import org.cip4.lib.xjdf.builder.XJdfBuilder;
import org.cip4.lib.xjdf.schema.FileSpec;
import org.cip4.lib.xjdf.schema.XJDF;
import org.cip4.lib.xjdf.type.URI;
import org.cip4.lib.xjdf.xml.XJdfConstants;
import org.junit.Test;

import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class JAXBNavigatorTest {

    @Test
    public void evaluateNode() throws Exception {
        XJdfBuilder builder = new XJdfBuilder("123JobID");
        builder.addParameter(new XJdfNodeFactory().createRunList(new URI(new java.net.URI("MyUri"))));
        final XJDF xjdf = builder.build();
        JAXBNavigator<XJDF> navigator = new JAXBNavigator<>(xjdf);
        navigator.addNamespace("xjdf", XJdfConstants.NAMESPACE_JDF20);
        final Object object = navigator.evaluateNode("//xjdf:FileSpec");
        assertTrue(object instanceof FileSpec);
    }

    @Test(expected = XPathExpressionException.class)
    public void evaluateNodeFails() throws Exception {
        XJdfBuilder builder = new XJdfBuilder("123JobID");
        builder.addParameter(new XJdfNodeFactory().createRunList(new URI(new java.net.URI("MyUri"))));
        final XJDF xjdf = builder.build();
        JAXBNavigator<XJDF> navigator = new JAXBNavigator<>(xjdf);
        navigator.evaluateNode("//xjdf:FileSpec/[]");
    }

    @Test
    public void evaluateNodeSet() throws Exception {
        XJdfBuilder builder = new XJdfBuilder("123JobID");
        builder.addParameter(new XJdfNodeFactory().createRunList(new URI(new java.net.URI("FirstUri"))));
        builder.addParameter(new XJdfNodeFactory().createRunList(new URI(new java.net.URI("SecondUri"))));
        final XJDF xjdf = builder.build();
        JAXBNavigator<XJDF> navigator = new JAXBNavigator<>(xjdf);
        navigator.addNamespace("xjdf", XJdfConstants.NAMESPACE_JDF20);
        final Object object = navigator.evaluateNodeList("//xjdf:FileSpec");
        assertTrue(object instanceof Object[]);
        Object[] array = (Object[]) object;
        assertEquals(2, array.length);
    }

    @Test(expected = XPathExpressionException.class)
    public void evaluateNodeSetFails() throws Exception {
        XJdfBuilder builder = new XJdfBuilder("123JobID");
        builder.addParameter(new XJdfNodeFactory().createRunList(new URI(new java.net.URI("FirstUri"))));
        builder.addParameter(new XJdfNodeFactory().createRunList(new URI(new java.net.URI("SecondUri"))));
        final XJDF xjdf = builder.build();
        JAXBNavigator<XJDF> navigator = new JAXBNavigator<>(xjdf);
        navigator.evaluateNodeList("//xjdf:FileSpec/[]");
    }

    @Test
    public void addNamespace() throws Exception {

        XJdfBuilder builder = new XJdfBuilder("123JobID");
        final URI fileSpecUrl = new URI(new java.net.URI("MyUri"));
        builder.addParameter(new XJdfNodeFactory().createRunList(fileSpecUrl));
        JAXBNavigator<XJDF> navigator = new JAXBNavigator<>(builder.build());
        navigator.addNamespace("xjdf", XJdfConstants.NAMESPACE_JDF20);

        assertEquals(fileSpecUrl, ((FileSpec) navigator.evaluateNode("//xjdf:FileSpec")).getURL());
    }

    @Test(expected = IllegalArgumentException.class)
    public void addNamespaceOmitted() throws Exception {
        XJdfBuilder builder = new XJdfBuilder("123JobID");
        final URI fileSpecUrl = new URI(new java.net.URI("MyUri"));
        builder.addParameter(new XJdfNodeFactory().createRunList(fileSpecUrl));
        JAXBNavigator<XJDF> navigator = new JAXBNavigator<>(builder.build());

        navigator.evaluateNode("//xjdf:FileSpec");
    }
}