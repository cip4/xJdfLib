package org.cip4.lib.xjdf.builder;

import org.cip4.lib.xjdf.schema.Intent;
import org.cip4.lib.xjdf.schema.ProductIntent;
import org.cip4.lib.xjdf.schema.Product;
import org.cip4.lib.xjdf.xml.XJdfConstants;
import org.w3c.dom.Node;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;

/**
 * Implementation of a Product builder class.
 */
public class ProductBuilder extends AbstractNodeBuilder<Product> {

    private static final String ID_PREFIX = "PRD";

    /**
     * Default constructor.
     */
    public ProductBuilder() {

        this(null, null, null, null);
    }

    /**
     * Custom constructor. Accepting a W3C Node object for initializing.
     *
     * @param productNode W2C Node object for
     */
    public ProductBuilder(Node productNode) throws JAXBException {
        super(productNode, Product.class);
    }

    /**
     * Custom Constructor. Creates a new instance of ProductBuilder which already contains attribute Amount.
     *
     * @param amount Value of Amount attribute
     */
    public ProductBuilder(Integer amount) {

        this(amount, null, null, null);
    }

    /**
     * Custom Constructor. Creates a new instance of ProductBuilder which already contains attributes Amount, ID,
     * ProductType and ProductTypeDetails.
     *
     * @param amount Value of Amount attribute
     * @param productType Value of ProductType attribute
     * @param productTypeDetails Value of ProductTypeDetails attribute
     */
    public ProductBuilder(Integer amount, String productType, String productTypeDetails) {

        this(amount, productType, productTypeDetails, null);
    }

    /**
     * Custom Constructor. Creates a new instance of ProductBuilder which already contains attributes Amount, ID,
     * ProductType and ProductTypeDetails.
     *
     * @param amount Value of Amount attribute
     * @param productType Value of ProductType attribute
     * @param productTypeDetails Value of ProductTypeDetails attribute
     * @param descriptiveName String value for DescriptiveName attribute.
     */
    public ProductBuilder(Integer amount, String productType, String productTypeDetails, String descriptiveName) {

        // initialize objects
        super(new Product());

        // set attributes
        getProduct().setAmount(amount);
        getProduct().setProductType(productType);
        getProduct().setProductTypeDetails(productTypeDetails);
        getProduct().setDescriptiveName(descriptiveName);
    }

    /**
     * Custom Constructor. Creates a new instance of ProductBuilder based on a existing Product Node.
     *
     * @param product Product node for initializing.
     */
    public ProductBuilder(Product product) {

        // call super class
        super(product);

        // init
    }

    /**
     * Getter for product attribute.
     *
     * @return the product
     */
    protected Product getProduct() {
        return getNode();
    }

    /**
     * Append Intent node to Product Definition.
     *
     * @param intent Intent object to append to.
     */
    public void addIntent(ProductIntent intent) {

        if (intent == null)
            return;

        String intentName = intent.getClass().getSimpleName();

        // create intent node
        Intent it = new Intent()
            .withName(intentName);

        QName qname = new QName(XJdfConstants.NAMESPACE_JDF20, intentName);
        JAXBElement<ProductIntent> obj = new JAXBElement(qname, intent.getClass(), intent);
        it.setProductIntent(obj);

        // append intent to product
        getProduct().getIntent().add(it);
    }

}
