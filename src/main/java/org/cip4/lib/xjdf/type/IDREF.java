package org.cip4.lib.xjdf.type;

import org.apache.commons.lang3.StringUtils;
import org.cip4.lib.xjdf.schema.Part;
import org.cip4.lib.xjdf.schema.Resource;
import org.cip4.lib.xjdf.schema.Product;
import org.cip4.lib.xjdf.schema.SpecificResource;
import org.cip4.lib.xjdf.util.Identifiers;
import org.cip4.lib.xjdf.util.Resources;


/**
 * DataType for IDRefs
 */
public class IDREF extends AbstractXJdfType<String, IDREF> {

    private final String id;

    private final Object element;

    /**
     * Default constructor.
     */
    public IDREF() {
        this.id = "";
        element = null;
    }

    public IDREF(SpecificResource specificResource) {
        this(specificResource, null, Identifiers.generate("PAR"));
    }

    public IDREF(SpecificResource specificResource, Part part, String id) {

        // generate ID
        this.id = id;

        // create resource
        Resource resource = Resources.createResource(specificResource, part);
        resource.setID(this.id);

        // set element
        this.element = resource;
    }

    public IDREF(Product product) {

        this(product, generateId(product));
    }

    public IDREF(Product product, String id) {
        this.id = id;
        product.setID(id);
        this.element = product;
    }

    /**
     * Custom constructor. Accepting accepting a String expression for initializing..
     */
    public IDREF(final String expression) {
        id = expression;
        this.element = null;
    }

    /**
     * Getter for id attribute.
     *
     * @return the id
     */
    public String getId() {
        return id;
    }

    public Resource getResource() {
        return (Resource) element;
    }

    public Product getProduct() {
        return (Product) element;
    }

    /**
     * @see jakarta.xml.bind.annotation.adapters.XmlAdapter#marshal(java.lang.Object)
     */
    @Override
    public String marshal(IDREF idRef) {
        if (idRef == null)
            return null;

        return idRef.getId();
    }

    /**
     * @see jakarta.xml.bind.annotation.adapters.XmlAdapter#unmarshal(java.lang.Object)
     */
    @Override
    public IDREF unmarshal(String v) {
        return new IDREF(v);
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return marshal(this);
    }

    /**
     * If necessary, generate a ID for a product
     *
     * @return ID for a product.
     */
    private static String generateId(Product product) {

        String productId = product.getID();

        if (StringUtils.isEmpty(productId)) {
            productId = Identifiers.generate("PRD");
        }

        return productId;
    }
}
