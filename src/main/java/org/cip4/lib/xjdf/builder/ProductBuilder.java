package org.cip4.lib.xjdf.builder;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;

import org.apache.commons.lang3.StringUtils;
import org.cip4.lib.xjdf.XJdfNodeFactory;
import org.cip4.lib.xjdf.schema.ChildProduct;
import org.cip4.lib.xjdf.schema.Intent;
import org.cip4.lib.xjdf.schema.IntentType;
import org.cip4.lib.xjdf.schema.Product;
import org.cip4.lib.xjdf.xml.XJdfConstants;
import org.w3c.dom.Node;

/**
 * Implementation of a Product builder class.
 * @author s.meissner
 */
public class ProductBuilder extends AbstractNodeBuilder<Product> {

    private static final String ID_PREFIX = "PRD";

    private final XJdfNodeFactory xJdfNodeFactory;

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
     *
     * @throws JAXBException
     */
    public ProductBuilder(Node productNode) throws JAXBException {

        super(productNode, Product.class);

        // init factory
        xJdfNodeFactory = new XJdfNodeFactory();
    }

    /**
     * Custom Constructor. Creates a new instance of ProductBuilder which already contains attribute Amount.
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
        super(new XJdfNodeFactory().createProduct());
        xJdfNodeFactory = new XJdfNodeFactory();

        // set attributes
        getProduct().setAmount(amount);
        getProduct().setProductType(productType);
        getProduct().setProductTypeDetails(productTypeDetails);
        getProduct().setDescriptiveName(descriptiveName);
    }

    /**
     * Custom Constructor. Creates a new instance of ProductBuilder based on a existing Product Node.
     * @param product Product node for initializing.
     */
    public ProductBuilder(Product product) {

        // call super class
        super(product);

        // init
        xJdfNodeFactory = new XJdfNodeFactory();
    }

    /**
     * Getter for product attribute.
     * @return the product
     */
    protected Product getProduct() {
        return getNode();
    }

    /**
     * Append Intent node to Product Definition.
     * @param intent Intent object to append to.
     */
    public void addIntent(IntentType intent) {

        if (intent == null)
            return;

        // get parameter name
        String intentName = intent.getClass().getSimpleName();

        // create intent node
        Intent it = xJdfNodeFactory.createIntent();
        it.setName(intentName);

        QName qname = new QName(XJdfConstants.NAMESPACE_JDF20, intentName);
        JAXBElement<IntentType> obj = new JAXBElement(qname, intent.getClass(), intent);
        it.setIntentType(obj);

        // append intent to product
        getProduct().getIntent().add(it);
    }

    /**
     * Append another product as child.
     *
     * @param childRef Reference to the cild product to append.
     * @throws IllegalArgumentException
     */
    public final void addChildProduct(final Product childRef) throws IllegalArgumentException {
        if (StringUtils.isEmpty(childRef.getID())) {
            throw new IllegalArgumentException("'ID' must not be null or blank.");
        }

        // create child product
        ChildProduct childProduct = xJdfNodeFactory.createChildProduct();
        childProduct.setChildRef(childRef);
        getProduct().getChildProduct().add(childProduct);

        // set root flag
        getProduct().setIsRoot(true);
    }

}
