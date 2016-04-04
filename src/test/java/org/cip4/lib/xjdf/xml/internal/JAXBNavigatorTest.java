package org.cip4.lib.xjdf.xml.internal;

import org.cip4.lib.xjdf.XJdfNodeFactory;
import org.cip4.lib.xjdf.builder.XJdfBuilder;
import org.cip4.lib.xjdf.schema.XJDF;
import org.cip4.lib.xjdf.type.URI;
import org.junit.Test;
import org.w3c.dom.Node;

import javax.xml.xpath.XPathConstants;

import static org.junit.Assert.*;

public class JAXBNavigatorTest {

    @Test
    public void evaluate() throws Exception {
        XJdfBuilder builder = new XJdfBuilder("123JobID");
        JAXBNavigator<XJDF> navigator = new JAXBNavigator<>(builder.build());
        assertNotNull(navigator.evaluate("//xjdf:XJDF/@JobID", XPathConstants.STRING));
    }

    @Test
    public void getJAXBNode() throws Exception {
        XJdfBuilder builder = new XJdfBuilder("JOB123");
        XJdfNodeFactory factory = new XJdfNodeFactory();
        builder.addParameter(factory.createRunList(new URI(new java.net.URI("MyUri"))));
        JAXBNavigator<XJDF> navigator = new JAXBNavigator<>(builder.build());
        final Object jaxbNode = navigator.getJAXBNode((Node) navigator.evaluate("//xjdf:FileSpec", XPathConstants.NODE));
        assertNotNull(jaxbNode);
    }
}