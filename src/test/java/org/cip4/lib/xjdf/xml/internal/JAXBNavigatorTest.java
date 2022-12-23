package org.cip4.lib.xjdf.xml.internal;

import org.cip4.lib.xjdf.XJdfDocument;
import org.cip4.lib.xjdf.schema.AmountPool;
import org.cip4.lib.xjdf.schema.FileSpec;
import org.cip4.lib.xjdf.schema.Media;
import org.cip4.lib.xjdf.schema.ObjectFactory;
import org.cip4.lib.xjdf.schema.PartAmount;
import org.cip4.lib.xjdf.schema.Product;
import org.cip4.lib.xjdf.schema.Resource;
import org.cip4.lib.xjdf.schema.ResourceSet;
import org.cip4.lib.xjdf.schema.RunList;
import org.cip4.lib.xjdf.schema.XJDF;
import org.cip4.lib.xjdf.type.URI;
import org.cip4.lib.xjdf.xml.XJdfConstants;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import javax.xml.xpath.XPathExpressionException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JAXBNavigatorTest {

    @Test
    public void getRoot() throws Exception {
        JAXBNavigator<XJDF> navigator = new JAXBNavigator<>(new XJDF());
        assertNotNull(navigator.getRoot());
    }

    @Test
    public void evaluateNode() throws Exception {

        XJdfDocument xJdfDocument = new XJdfDocument("123JobID");
        xJdfDocument.addResourceSet(new RunList().withFileSpec(new FileSpec().withURL(new URI(new java.net.URI("MyUri")))), ResourceSet.Usage.INPUT);

        JAXBNavigator<XJDF> navigator = new JAXBNavigator<>(xJdfDocument.getXJdf());
        navigator.addNamespace("xjdf", XJdfConstants.NAMESPACE_JDF20);
        final Object object = navigator.evaluateNode("//xjdf:FileSpec");
        assertTrue(object instanceof FileSpec);
    }

    @Test
    public void evaluateNodeFails() throws Exception {

        XJdfDocument xJdfDocument = new XJdfDocument("123JobID");
        xJdfDocument.addResourceSet(new RunList().withFileSpec(new FileSpec().withURL(new URI(new java.net.URI("MyUri")))), ResourceSet.Usage.INPUT);

        final JAXBNavigator<XJDF> navigator = new JAXBNavigator<>(xJdfDocument.getXJdf());
        assertThrows(XPathExpressionException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                navigator.evaluateNode("//xjdf:FileSpec/[]");
            }
        });
    }

    @Test
    public void evaluateNodeSet() throws Exception {

        XJdfDocument xJdfDocument = new XJdfDocument("123JobID");
        xJdfDocument.addResourceSet(new RunList().withFileSpec(new FileSpec().withURL(new URI(new java.net.URI("FirstUri")))), ResourceSet.Usage.INPUT);
        xJdfDocument.addResourceSet(new RunList().withFileSpec(new FileSpec().withURL(new URI(new java.net.URI("SecondUri")))), ResourceSet.Usage.INPUT);

        JAXBNavigator<XJDF> navigator = new JAXBNavigator<>(xJdfDocument.getXJdf());
        navigator.addNamespace("xjdf", XJdfConstants.NAMESPACE_JDF20);
        final Object object = navigator.evaluateNodeList("//xjdf:FileSpec");
        assertNotNull(object);
        Object[] array = (Object[]) object;
        assertEquals(2, array.length);
    }

    @Test
    public void evaluateNodeSetFails() throws Exception {

        XJdfDocument xJdfDocument = new XJdfDocument("123JobID");
        xJdfDocument.addResourceSet(new RunList().withFileSpec(new FileSpec().withURL(new URI(new java.net.URI("FirstUri")))), ResourceSet.Usage.INPUT);
        xJdfDocument.addResourceSet(new RunList().withFileSpec(new FileSpec().withURL(new URI(new java.net.URI("SecondUri")))), ResourceSet.Usage.INPUT);

        final JAXBNavigator<XJDF> navigator = new JAXBNavigator<>(xJdfDocument.getXJdf());

        assertThrows(
            XPathExpressionException.class,
            new Executable() {
                @Override
                public void execute() throws Throwable {
                    navigator.evaluateNodeList("//xjdf:FileSpec/[]");
                }
            }
        );
    }

    @Test
    public void evaluateInt() throws Exception {

        XJdfDocument xJdfDocument = new XJdfDocument();
        xJdfDocument.addProduct(new Product().withAmount(100));

        JAXBNavigator<XJDF> navigator = new JAXBNavigator<>(xJdfDocument.getXJdf());
        navigator.addNamespace("xjdf", XJdfConstants.NAMESPACE_JDF20);

        assertEquals(100, (int) navigator.evaluateInt("//xjdf:Product/@Amount"));
    }

    @Test
    public void evaluateIntWrongXpath() throws Exception {

        XJdfDocument xJdfDocument = new XJdfDocument();

        final JAXBNavigator<XJDF> navigator = new JAXBNavigator<>(xJdfDocument.getXJdf());
        navigator.addNamespace("xjdf", XJdfConstants.NAMESPACE_JDF20);

        assertThrows(
            XPathExpressionException.class,
            new Executable() {
                @Override
                public void execute() throws Throwable {
                    navigator.evaluateInt("[]");
                }
            }
        );
    }

    @Test
    public void evaluateIntNullValue() throws Exception {

        XJdfDocument xJdfDocument = new XJdfDocument();

        JAXBNavigator<XJDF> navigator = new JAXBNavigator<>(xJdfDocument.getXJdf());
        navigator.addNamespace("xjdf", XJdfConstants.NAMESPACE_JDF20);

        assertNull(navigator.evaluateInt("//xjdf:Product/@Amount"));
    }

    @Test
    public void evaluateDouble() throws Exception {

        XJdfDocument xJdfDocument = new XJdfDocument();
        xJdfDocument.addResourceSet(new Media(), ResourceSet.Usage.INPUT)
            .getResource().get(0)
            .withAmountPool(new AmountPool().withPartAmount(new PartAmount().withAmount(100.5)));

        JAXBNavigator<XJDF> navigator = new JAXBNavigator<>(xJdfDocument.getXJdf());
        navigator.addNamespace("xjdf", XJdfConstants.NAMESPACE_JDF20);

        assertEquals(100.5d, navigator.evaluateDouble("//xjdf:PartAmount/@Amount"), 0.001);
    }

    @Test
    public void evaluateDoubleWrongXpath() throws Exception {

        XJdfDocument xJdfDocument = new XJdfDocument();
        final JAXBNavigator<XJDF> navigator = new JAXBNavigator<>(xJdfDocument.getXJdf());
        navigator.addNamespace("xjdf", XJdfConstants.NAMESPACE_JDF20);

        assertThrows(
            XPathExpressionException.class,
            new Executable() {
                @Override
                public void execute() throws Throwable {
                    navigator.evaluateDouble("[]");
                }
            }
        );
    }

    @Test
    public void evaluateDoubleNullValue() throws Exception {

        XJdfDocument xJdfDocument = new XJdfDocument();
        JAXBNavigator<XJDF> navigator = new JAXBNavigator<>(xJdfDocument.getXJdf());
        navigator.addNamespace("xjdf", XJdfConstants.NAMESPACE_JDF20);

        assertNull(navigator.evaluateDouble("//xjdf:Product/@Amount"));
    }

    @Test
    public void evaluateString() throws Exception {

        XJdfDocument xJdfDocument = new XJdfDocument();
        xJdfDocument.addProduct(new Product().withDescriptiveName("Product"));

        JAXBNavigator<XJDF> navigator = new JAXBNavigator<>(xJdfDocument.getXJdf());
        navigator.addNamespace("xjdf", XJdfConstants.NAMESPACE_JDF20);

        assertEquals("Product", navigator.evaluateString("//xjdf:Product/@DescriptiveName"));
    }

    @Test
    public void evaluateStringWrongXpath() throws Exception {

        XJdfDocument xJdfDocument = new XJdfDocument();
        final JAXBNavigator<XJDF> navigator = new JAXBNavigator<>(xJdfDocument.getXJdf());
        navigator.addNamespace("xjdf", XJdfConstants.NAMESPACE_JDF20);

        assertThrows(
            XPathExpressionException.class,
            new Executable() {
                @Override
                public void execute() throws Throwable {
                    navigator.evaluateString("[]");
                }
            }
        );
    }

    @Test
    public void evaluateStringNullValue() throws Exception {

        XJdfDocument xJdfDocument = new XJdfDocument();
        JAXBNavigator<XJDF> navigator = new JAXBNavigator<>(xJdfDocument.getXJdf());
        navigator.addNamespace("xjdf", XJdfConstants.NAMESPACE_JDF20);

        assertNull(navigator.evaluateDouble("//xjdf:Product/@Amount"));
    }

    @Test
    public void addNamespace() throws Exception {

        XJdfDocument xJdfDocument = new XJdfDocument("123JobID");

        final URI fileSpecUrl = new URI(new java.net.URI("MyUri"));
        xJdfDocument.addResourceSet(new RunList().withFileSpec(new FileSpec().withURL(fileSpecUrl)), ResourceSet.Usage.INPUT);

        JAXBNavigator<XJDF> navigator = new JAXBNavigator<>(xJdfDocument.getXJdf());
        navigator.addNamespace("xjdf", XJdfConstants.NAMESPACE_JDF20);

        assertEquals(fileSpecUrl, ((FileSpec) navigator.evaluateNode("//xjdf:FileSpec")).getURL());
    }

    @Test
    public void addNamespaceOmitted() throws Exception {

        XJdfDocument xJdfDocument = new XJdfDocument("123JobID");

        final URI fileSpecUrl = new URI(new java.net.URI("MyUri"));
        xJdfDocument.addResourceSet(new RunList().withFileSpec(new FileSpec().withURL(fileSpecUrl)), ResourceSet.Usage.INPUT);

        final JAXBNavigator<XJDF> navigator = new JAXBNavigator<>(xJdfDocument.getXJdf());

        assertThrows(
            XPathExpressionException.class,
            new Executable() {
                @Override
                public void execute() throws Throwable {
                    navigator.evaluateNode("//xjdf:FileSpec");
                }
            }
        );
    }
}