package org.cip4.lib.xjdf.builder;

import java.io.InputStream;

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
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Node;

import static org.junit.Assert.assertSame;

/**
 * JUnit test case for Product Builder class.
 * @author s.meissner
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
        byte[] bytes = marsahlResult(productBuilder);

        String actual = getXPathValue(bytes, "/xjdf:Product/@Amount");
        Assert.assertEquals("Attribute Amount in Node Product is wrong.", "5000", actual);
    }

    /**
     * @throws Exception
     */
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
        byte[] bytes = marsahlResult(productBuilder);
        String actual;

        actual = getXPathValue(bytes, "/xjdf:Product/xjdf:Intent/xjdf:MediaIntent/@Weight");
        Assert.assertEquals("Attribute Weight in Node MediaIntent is wrong.", "135.0", actual);

        actual = getXPathValue(bytes, "/xjdf:Product/xjdf:Intent/@Name");
        Assert.assertEquals("Attribute Name in Node Intent is wrong.", "MediaIntent", actual);

        actual = getXPathValue(bytes, "/xjdf:Product/xjdf:Intent/xjdf:LayoutIntent/@FinishedDimensions");
        Assert.assertEquals(
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
     * Add child product with product ID.
     * @throws Exception
     */
    @Test
    public void addChildProduct() throws Exception {
        Product childProduct = new Product();
        childProduct.setID("abc");
        ProductBuilder rootProductBuilder = new ProductBuilder();
        rootProductBuilder.addChildProduct(childProduct);

        final Product childRef = rootProductBuilder.getProduct().getChildRefs().get(0);
        Assert.assertEquals("abc", childRef.getID());
    }

    /**
     * Add child product without product ID.
     * @throws Exception
     */
    @Test(expected = IllegalArgumentException.class)
    public void addChildProductWithoutId() throws Exception {
        Product childProduct = new Product();
        ProductBuilder rootProductBuilder = new ProductBuilder();
        rootProductBuilder.addChildProduct(childProduct);
    }

    /**
     * Add child product with empty product ID.
     * @throws Exception
     */
    @Test(expected = IllegalArgumentException.class)
    public void addChildProductWithIdBlank() throws Exception {
        Product childProduct = new Product();
        childProduct.setID("");
        ProductBuilder rootProductBuilder = new ProductBuilder();
        rootProductBuilder.addChildProduct(childProduct);
    }

    /**
     * Add child product with empty product ID.
     * @throws Exception
     */
    @Test(expected = IllegalArgumentException.class)
    public void addChildProductWithIdNull() throws Exception {
        Product childProduct = new Product();
        childProduct.setID(null);
        ProductBuilder rootProductBuilder = new ProductBuilder();
        rootProductBuilder.addChildProduct(childProduct);
    }

    /**
     * Create product with without id.
     * @throws Exception
     */
    @Test
    public void newProductIdIsNull() throws Exception {
        Product product = new Product();
        Assert.assertNull("Product ID is not null.", product.getID());
    }

    /**
     * Simple XJDF containing a product with childproducts.
     * @throws Exception
     */
    @Test
    public void testMultipleChildren() throws Exception {

        // arrange
        XJdfNodeFactory nf = new XJdfNodeFactory();

        ProductBuilder pbRoot = new ProductBuilder(1000);
        pbRoot.addIntent(new ColorIntent());
        Product productRoot = pbRoot.build();

        ProductBuilder pbChild_1 = new ProductBuilder();
        pbChild_1.getProduct().setID("a");
        pbChild_1.addIntent(nf.createMediaIntent("IPG_135"));
        Product productChild1 = pbChild_1.build();

        ProductBuilder pbChild_2 = new ProductBuilder();
        pbChild_2.getProduct().setID("b");
        pbChild_2.addIntent(nf.createMediaIntent("IPG_90"));
        Product productChild2 = pbChild_2.build();

        // act
        pbRoot.addChildProduct(pbChild_1.build());
        pbRoot.addChildProduct(pbChild_2.build());

        XJdfBuilder xJdfBuilder = new XJdfBuilder();
        xJdfBuilder.addProduct(productRoot);
        xJdfBuilder.addProduct(productChild1);
        xJdfBuilder.addProduct(productChild2);

        // assert
        XJDF xjdf = xJdfBuilder.build();
        assertSame(productRoot, xjdf.getProductList().getProduct().get(0));
        assertSame(productChild1, xjdf.getProductList().getProduct().get(1));
        assertSame(productChild2, xjdf.getProductList().getProduct().get(2));
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

        Assert.assertNotNull("Amount is null.", product.getAmount());
        Assert.assertEquals("Amount is wrong.", 15000, product.getAmount().intValue());
    }
}
