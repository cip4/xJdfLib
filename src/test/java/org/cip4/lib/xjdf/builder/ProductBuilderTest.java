package org.cip4.lib.xjdf.builder;

import org.cip4.lib.xjdf.XJdfNodeFactory;
import org.cip4.lib.xjdf.schema.BindingIntent;
import org.cip4.lib.xjdf.schema.ColorIntent;
import org.cip4.lib.xjdf.schema.EnumBindingType;
import org.cip4.lib.xjdf.schema.LayoutIntent;
import org.cip4.lib.xjdf.schema.MediaIntent;
import org.cip4.lib.xjdf.schema.Product;
import org.cip4.lib.xjdf.schema.XJDF;
import org.cip4.lib.xjdf.type.Shape;
import org.cip4.lib.xjdf.xml.XJdfConstants;
import org.cip4.lib.xjdf.xml.XJdfNavigator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Node;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

import static org.junit.Assert.*;

/**
 * JUnit test case for Product Builder class.
 */
public class ProductBuilderTest extends AbstractBuilderTest<Product> {

    private final static String RES_XJDF = "/org/cip4/lib/xjdf/JOB_1.xjdf";

    private ProductBuilder productBuilder;

    /**
     * Set up unit test.
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        productBuilder = new ProductBuilder();
    }

    /**
     * Tear down unit test.
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
        productBuilder = null;
    }

    @Test
    public void testInitAttributes() throws Exception {
        // arrange
        final int AMOUNT = 5000;

        // act
        productBuilder = new ProductBuilder(AMOUNT);

        // arrange
        byte[] bytes = marshalResult(productBuilder);

        String actual = getXPathValue(bytes, "/xjdf:Product/@Amount");
        assertEquals("Attribute Amount in Node Product is wrong.", "5000", actual);
    }

    @Test
    public void testAddIntent() throws Exception {

        // arrange
        MediaIntent mediaIntent = new XJdfNodeFactory().createMediaIntent();
        mediaIntent.setWeight(135d);

        LayoutIntent layoutIntent = new XJdfNodeFactory().createLayoutIntent();
        layoutIntent.setFinishedDimensions(new Shape(595.27559055d, 822.04724409d));
        BindingIntent bindingIntent = new XJdfNodeFactory().createBindingIntent();
        bindingIntent.setBindingType(EnumBindingType.SADDLE_STITCH);

        // act
        productBuilder.addIntent(mediaIntent);
        productBuilder.addIntent(layoutIntent);
        productBuilder.addIntent(bindingIntent);

        // arrange
        byte[] bytes = marshalResult(productBuilder);
        String actual;

        actual = getXPathValue(bytes, "/xjdf:Product/xjdf:Intent/xjdf:MediaIntent/@Weight");
        assertEquals("Attribute Weight in Node MediaIntent is wrong.", "135.0", actual);

        actual = getXPathValue(bytes, "/xjdf:Product/xjdf:Intent/@Name");
        assertEquals("Attribute Name in Node Intent is wrong.", "MediaIntent", actual);

        actual = getXPathValue(bytes, "/xjdf:Product/xjdf:Intent/xjdf:LayoutIntent/@FinishedDimensions");
        assertEquals(
            "Attribute FinishedDimensions in Node LayoutIntent is wrong.",
            "595.27559055 822.04724409 0.0",
            actual
        );
    }

    /**
     * Simple XJDF with single product
     * @throws Exception
     */
    @Test
    public void testWithoutChildren() throws Exception {

        // arrange
        ProductBuilder dbRoot = new ProductBuilder(1000);
        dbRoot.addIntent(new ColorIntent());
        Product product = dbRoot.build();

        // act
        XJdfBuilder xJdfBuilder = new XJdfBuilder();
        xJdfBuilder.addProduct(product);

        // assert
        XJDF xjdf = xJdfBuilder.build();
        assertSame(product, xjdf.getProductList().getProduct().get(0));
    }

    /**
     * Create product with without id.
     * @throws Exception
     */
    @Test
    public void newProductIdIsNull() throws Exception {
        Product product = new Product();
        assertNull("Product ID is not null.", product.getID());
    }

    /**
     * Create new Builder instance from W3C Node object.
     * @throws Exception
     */
    @Test
    public void testConstructorNode() throws Exception {

        // arrange
        InputStream is = ProductBuilderTest.class.getResourceAsStream(RES_XJDF);
        XJdfNavigator nav = new XJdfNavigator(is, true);
        nav.addNamespace("xjdf", XJdfConstants.NAMESPACE_JDF20);

        Node node = nav.evaluateNode("//xjdf:XJDF/xjdf:ProductList/xjdf:Product");

        // act
        ProductBuilder builder = new ProductBuilder(node);

        // assert
        Product product = builder.build();

        assertNotNull("Amount is null.", product.getAmount());
        assertEquals("Amount is wrong.", 15000, product.getAmount().intValue());
    }
}
