package org.cip4.lib.xjdf.xml.internal;

import org.cip4.lib.xjdf.builder.XJdfBuilder;
import org.cip4.lib.xjdf.schema.AmountPool;
import org.cip4.lib.xjdf.schema.FileSpec;
import org.cip4.lib.xjdf.schema.ObjectFactory;
import org.cip4.lib.xjdf.schema.PartAmount;
import org.cip4.lib.xjdf.schema.Product;
import org.cip4.lib.xjdf.schema.Resource;
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

        XJdfBuilder builder = new XJdfBuilder();
        JAXBNavigator<XJDF> navigator = new JAXBNavigator<>(builder.build());

        assertNotNull(navigator.getRoot());
    }

    @Test
    public void evaluateNode() throws Exception {
        XJdfBuilder builder = new XJdfBuilder("123JobID");
        builder.addResource(new RunList().withFileSpec(new FileSpec().withURL(new URI(new java.net.URI("MyUri")))));
        JAXBNavigator<XJDF> navigator = new JAXBNavigator<>(builder.build());
        navigator.addNamespace("xjdf", XJdfConstants.NAMESPACE_JDF20);
        final Object object = navigator.evaluateNode("//xjdf:FileSpec");
        assertTrue(object instanceof FileSpec);
    }

    @Test
    public void evaluateNodeFails() throws Exception {
        XJdfBuilder builder = new XJdfBuilder("123JobID");
        builder.addResource(new RunList().withFileSpec(new FileSpec().withURL(new URI(new java.net.URI("MyUri")))));
        final JAXBNavigator<XJDF> navigator = new JAXBNavigator<>(builder.build());
        assertThrows(XPathExpressionException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                navigator.evaluateNode("//xjdf:FileSpec/[]");
            }
        });
    }

    @Test
    public void evaluateNodeSet() throws Exception {
        XJdfBuilder builder = new XJdfBuilder("123JobID");
        builder.addResource(new RunList().withFileSpec(new FileSpec().withURL(new URI(new java.net.URI("FirstUri")))));
        builder.addResource(new RunList().withFileSpec(new FileSpec().withURL(new URI(new java.net.URI("SecondUri")))));
        JAXBNavigator<XJDF> navigator = new JAXBNavigator<>(builder.build());
        navigator.addNamespace("xjdf", XJdfConstants.NAMESPACE_JDF20);
        final Object object = navigator.evaluateNodeList("//xjdf:FileSpec");
        assertNotNull(object);
        Object[] array = (Object[]) object;
        assertEquals(2, array.length);
    }

    @Test
    public void evaluateNodeSetFails() throws Exception {
        XJdfBuilder builder = new XJdfBuilder("123JobID");
        builder.addResource(new RunList().withFileSpec(new FileSpec().withURL(new URI(new java.net.URI("FirstUri")))));
        builder.addResource(new RunList().withFileSpec(new FileSpec().withURL(new URI(new java.net.URI("SecondUri")))));
        final JAXBNavigator<XJDF> navigator = new JAXBNavigator<>(builder.build());

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
        XJdfBuilder builder = new XJdfBuilder();
        builder.addProduct(new Product().withAmount(100));
        JAXBNavigator<XJDF> navigator = new JAXBNavigator<>(builder.build());
        navigator.addNamespace("xjdf", XJdfConstants.NAMESPACE_JDF20);

        assertEquals(100, (int) navigator.evaluateInt("//xjdf:Product/@Amount"));
    }

    @Test
    public void evaluateIntWrongXpath() throws Exception {
        XJdfBuilder builder = new XJdfBuilder();
        final JAXBNavigator<XJDF> navigator = new JAXBNavigator<>(builder.build());
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
        XJdfBuilder builder = new XJdfBuilder();
        JAXBNavigator<XJDF> navigator = new JAXBNavigator<>(builder.build());
        navigator.addNamespace("xjdf", XJdfConstants.NAMESPACE_JDF20);

        assertNull(navigator.evaluateInt("//xjdf:Product/@Amount"));
    }

    @Test
    public void evaluateDouble() throws Exception {
        XJdfBuilder builder = new XJdfBuilder();
        builder.addResourceSet(
            new ObjectFactory().createResourceSet().withResource(
                new Resource().withAmountPool(
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

        assertEquals(100.5d, navigator.evaluateDouble("//xjdf:PartAmount/@Amount"), 0.001);
    }

    @Test
    public void evaluateDoubleWrongXpath() throws Exception {
        XJdfBuilder builder = new XJdfBuilder();
        final JAXBNavigator<XJDF> navigator = new JAXBNavigator<>(builder.build());
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

    @Test
    public void evaluateStringWrongXpath() throws Exception {
        XJdfBuilder builder = new XJdfBuilder();
        final JAXBNavigator<XJDF> navigator = new JAXBNavigator<>(builder.build());
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
        XJdfBuilder builder = new XJdfBuilder();
        JAXBNavigator<XJDF> navigator = new JAXBNavigator<>(builder.build());
        navigator.addNamespace("xjdf", XJdfConstants.NAMESPACE_JDF20);

        assertNull(navigator.evaluateDouble("//xjdf:Product/@Amount"));
    }

    @Test
    public void addNamespace() throws Exception {
        XJdfBuilder builder = new XJdfBuilder("123JobID");
        final URI fileSpecUrl = new URI(new java.net.URI("MyUri"));
        builder.addResource(new RunList().withFileSpec(new FileSpec().withURL(fileSpecUrl)));
        JAXBNavigator<XJDF> navigator = new JAXBNavigator<>(builder.build());
        navigator.addNamespace("xjdf", XJdfConstants.NAMESPACE_JDF20);

        assertEquals(fileSpecUrl, ((FileSpec) navigator.evaluateNode("//xjdf:FileSpec")).getURL());
    }

    @Test
    public void addNamespaceOmitted() throws Exception {
        XJdfBuilder builder = new XJdfBuilder("123JobID");
        final URI fileSpecUrl = new URI(new java.net.URI("MyUri"));
        builder.addResource(new RunList().withFileSpec(new FileSpec().withURL(fileSpecUrl)));
        final JAXBNavigator<XJDF> navigator = new JAXBNavigator<>(builder.build());

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