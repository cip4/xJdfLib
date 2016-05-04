package org.cip4.lib.xjdf.xml.internal;

import org.cip4.lib.xjdf.XJdfNodeFactory;
import org.cip4.lib.xjdf.builder.XJdfBuilder;
import org.cip4.lib.xjdf.schema.AmountPool;
import org.cip4.lib.xjdf.schema.FileSpec;
import org.cip4.lib.xjdf.schema.Parameter;
import org.cip4.lib.xjdf.schema.PartAmount;
import org.cip4.lib.xjdf.schema.Product;
import org.cip4.lib.xjdf.schema.XJDF;
import org.cip4.lib.xjdf.type.URI;
import org.cip4.lib.xjdf.xml.XJdfConstants;
import org.junit.Test;

import javax.xml.xpath.XPathExpressionException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class JAXBNavigatorTest {

    @Test
    public void getRoot() throws Exception {

        XJdfBuilder builder = new XJdfBuilder();
        JAXBNavigator<XJDF> navigator = new JAXBNavigator<>(builder.build());

        assertNotNull(navigator.getRoot());
    }

    @Test
    public void evaluateNode() throws Exception {
        XJdfBuilder builder = new XJdfBuilder("123JobID");
        builder.addParameter(new XJdfNodeFactory().createRunList(new URI(new java.net.URI("MyUri"))));
        JAXBNavigator<XJDF> navigator = new JAXBNavigator<>(builder.build());
        navigator.addNamespace("xjdf", XJdfConstants.NAMESPACE_JDF20);
        final Object object = navigator.evaluateNode("//xjdf:FileSpec");
        assertTrue(object instanceof FileSpec);
    }

    @Test(expected = XPathExpressionException.class)
    public void evaluateNodeFails() throws Exception {
        XJdfBuilder builder = new XJdfBuilder("123JobID");
        builder.addParameter(new XJdfNodeFactory().createRunList(new URI(new java.net.URI("MyUri"))));
        JAXBNavigator<XJDF> navigator = new JAXBNavigator<>(builder.build());
        navigator.evaluateNode("//xjdf:FileSpec/[]");
    }

    @Test
    public void evaluateNodeSet() throws Exception {
        XJdfBuilder builder = new XJdfBuilder("123JobID");
        final XJdfNodeFactory xJdfNodeFactory = new XJdfNodeFactory();
        builder.addParameter(xJdfNodeFactory.createRunList(new URI(new java.net.URI("FirstUri"))));
        builder.addParameter(xJdfNodeFactory.createRunList(new URI(new java.net.URI("SecondUri"))));
        JAXBNavigator<XJDF> navigator = new JAXBNavigator<>(builder.build());
        navigator.addNamespace("xjdf", XJdfConstants.NAMESPACE_JDF20);
        final Object object = navigator.evaluateNodeList("//xjdf:FileSpec");
        assertTrue(object != null);
        Object[] array = (Object[]) object;
        assertEquals(2, array.length);
    }

    @Test(expected = XPathExpressionException.class)
    public void evaluateNodeSetFails() throws Exception {
        XJdfBuilder builder = new XJdfBuilder("123JobID");
        final XJdfNodeFactory xJdfNodeFactory = new XJdfNodeFactory();
        builder.addParameter(xJdfNodeFactory.createRunList(new URI(new java.net.URI("FirstUri"))));
        builder.addParameter(xJdfNodeFactory.createRunList(new URI(new java.net.URI("SecondUri"))));
        JAXBNavigator<XJDF> navigator = new JAXBNavigator<>(builder.build());
        navigator.evaluateNodeList("//xjdf:FileSpec/[]");
    }

    @Test
    public void evaluateInt() throws Exception {
        XJdfBuilder builder = new XJdfBuilder();
        builder.addProduct(new Product().withAmount(100));
        JAXBNavigator<XJDF> navigator = new JAXBNavigator<>(builder.build());
        navigator.addNamespace("xjdf", XJdfConstants.NAMESPACE_JDF20);

        assertEquals(100, (int) navigator.evaluateInt("//xjdf:Product/@Amount"));
    }

    @Test(expected = XPathExpressionException.class)
    public void evaluateIntWrongXpath() throws Exception {
        XJdfBuilder builder = new XJdfBuilder();
        JAXBNavigator<XJDF> navigator = new JAXBNavigator<>(builder.build());
        navigator.addNamespace("xjdf", XJdfConstants.NAMESPACE_JDF20);
        navigator.evaluateInt("[]");
    }

    @Test
    public void evaluateIntNullValue() throws Exception {
        XJdfBuilder builder = new XJdfBuilder();
        JAXBNavigator<XJDF> navigator = new JAXBNavigator<>(builder.build());
        navigator.addNamespace("xjdf", XJdfConstants.NAMESPACE_JDF20);

        assertNull(navigator.evaluateInt("//xjdf:Product/@Amount"));
    }

    @Test
    public void evaluateDouble() throws Exception {
        XJdfBuilder builder = new XJdfBuilder();
        builder.addParameterSet(
            new XJdfNodeFactory().createParameterSet().withParameter(
                new Parameter().withAmountPool(
                    new AmountPool().withPartAmount(
                        new PartAmount().withAmount(
                            100.5
                        )
                    )
                )
            )
        );
        JAXBNavigator<XJDF> navigator = new JAXBNavigator<>(builder.build());
        navigator.addNamespace("xjdf", XJdfConstants.NAMESPACE_JDF20);

        assertEquals(100.5d, navigator.evaluateDouble("//xjdf:PartAmount/@Amount"), 0.0);
    }

    @Test(expected = XPathExpressionException.class)
    public void evaluateDoubleWrongXpath() throws Exception {
        XJdfBuilder builder = new XJdfBuilder();
        JAXBNavigator<XJDF> navigator = new JAXBNavigator<>(builder.build());
        navigator.addNamespace("xjdf", XJdfConstants.NAMESPACE_JDF20);
        navigator.evaluateDouble("[]");
    }

    @Test
    public void evaluateDoubleNullValue() throws Exception {
        XJdfBuilder builder = new XJdfBuilder();
        JAXBNavigator<XJDF> navigator = new JAXBNavigator<>(builder.build());
        navigator.addNamespace("xjdf", XJdfConstants.NAMESPACE_JDF20);

        assertNull(navigator.evaluateDouble("//xjdf:Product/@Amount"));
    }

    @Test
    public void evaluateString() throws Exception {
        XJdfBuilder builder = new XJdfBuilder();
        builder.addProduct(new Product().withDescriptiveName("Product"));
        JAXBNavigator<XJDF> navigator = new JAXBNavigator<>(builder.build());
        navigator.addNamespace("xjdf", XJdfConstants.NAMESPACE_JDF20);

        assertEquals("Product", navigator.evaluateString("//xjdf:Product/@DescriptiveName"));
    }

    @Test(expected = XPathExpressionException.class)
    public void evaluateStringWrongXpath() throws Exception {
        XJdfBuilder builder = new XJdfBuilder();
        JAXBNavigator<XJDF> navigator = new JAXBNavigator<>(builder.build());
        navigator.addNamespace("xjdf", XJdfConstants.NAMESPACE_JDF20);
        navigator.evaluateString("[]");
    }

    @Test
    public void evaluateStringNullValue() throws Exception {
        XJdfBuilder builder = new XJdfBuilder();
        JAXBNavigator<XJDF> navigator = new JAXBNavigator<>(builder.build());
        navigator.addNamespace("xjdf", XJdfConstants.NAMESPACE_JDF20);

        assertNull(navigator.evaluateDouble("//xjdf:Product/@Amount"));
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

    @Test(expected = XPathExpressionException.class)
    public void addNamespaceOmitted() throws Exception {
        XJdfBuilder builder = new XJdfBuilder("123JobID");
        final URI fileSpecUrl = new URI(new java.net.URI("MyUri"));
        builder.addParameter(new XJdfNodeFactory().createRunList(fileSpecUrl));
        JAXBNavigator<XJDF> navigator = new JAXBNavigator<>(builder.build());
        navigator.evaluateNode("//xjdf:FileSpec");
    }
}