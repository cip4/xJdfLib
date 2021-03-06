package org.cip4.lib.xjdf.builder;

import org.cip4.lib.xjdf.XJdfNodeFactory;
import org.cip4.lib.xjdf.schema.*;
import org.cip4.lib.xjdf.type.Shape;
import org.cip4.lib.xjdf.xml.XJdfConstants;
import org.cip4.lib.xjdf.xml.XJdfNavigator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.w3c.dom.Node;

import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit test case for Product Builder class.
 */
public class ProductBuilderTest extends AbstractBuilderTest<Product> {

    private final static String RES_XJDF = "/org/cip4/lib/xjdf/JOB_1.xjdf";

    private ProductBuilder productBuilder;

    @BeforeEach
    public void setUp() {
        productBuilder = new ProductBuilder();
    }

    @AfterEach
    public void tearDown() {
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
        assertEquals("5000", actual, "Attribute Amount in Node Product is wrong.");
    }

    @Test
    public void testAddIntent() throws Exception {

        // arrange
        MediaIntent mediaIntent = new MediaIntent()
                .withWeight(135f);

        LayoutIntent layoutIntent = new LayoutIntent()
                .withFinishedDimensions(new Shape(595.27559055f, 822.04724409f));

        BindingIntent bindingIntent = new BindingIntent()
                .withBindingType(BindingIntent.BindingType.SADDLE_STITCH);

        // act
        productBuilder.addIntent(mediaIntent);
        productBuilder.addIntent(layoutIntent);
        productBuilder.addIntent(bindingIntent);

        // arrange
        byte[] bytes = marshalResult(productBuilder);
        String actual;

        actual = getXPathValue(bytes, "/xjdf:Product/xjdf:Intent/xjdf:MediaIntent/@Weight");
        assertEquals("135.0", actual, "Attribute Weight in Node MediaIntent is wrong.");

        actual = getXPathValue(bytes, "/xjdf:Product/xjdf:Intent/@Name");
        assertEquals("MediaIntent", actual, "Attribute Name in Node Intent is wrong.");

        actual = getXPathValue(bytes, "/xjdf:Product/xjdf:Intent/xjdf:LayoutIntent/@FinishedDimensions");
        assertEquals(
            "595.276 822.047 0.000",
            actual,
            "Attribute FinishedDimensions in Node LayoutIntent is wrong."
        );
    }

    /**
     * Simple XJDF with single product
     */
    @Test
    public void testWithoutChildren() {

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
     */
    @Test
    public void newProductIdIsNull() {
        Product product = new Product();
        assertNull(product.getID(), "Product ID is not null.");
    }

    /**
     * Create new Builder instance from W3C Node object.
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

        assertNotNull(product.getAmount(), "Amount is null.");
        assertEquals(15000, product.getAmount().intValue(), "Amount is wrong.");
    }
}
