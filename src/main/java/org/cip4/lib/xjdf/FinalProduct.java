package org.cip4.lib.xjdf;

import jakarta.xml.bind.JAXBElement;
import org.cip4.lib.xjdf.schema.*;

import javax.xml.namespace.QName;
import java.util.*;

/**
 * Helper class to manage products involved in an xjdf document.
 */
public class FinalProduct {

    private final String ROOT_PRODUCT = "ROOT_PRODUCT";

    private final Map<String, Product> productParts;

    /**
     * Default constructor.
     */
    public FinalProduct() {
        this((Integer) null, (String) null);
    }

    /**
     * Custom constructor. Accepting multiple parameters for initializing.
     */
    public FinalProduct(Integer amount, String descriptiveName) {

        // init product parts
        productParts = new LinkedHashMap<>();
        productParts.put(ROOT_PRODUCT, new Product());

        // set attributes of root product
        productParts.get(ROOT_PRODUCT)
                .withAmount(amount)
                .withDescriptiveName(descriptiveName)
                .setIsRoot(true);
    }

    /**
     * Custom constructor creating a final product from the root product part and the list of all product parts.
     *
     * @param rootProductPart The root product part.
     * @param allProductParts The list of all product parts in the XJDF.
     */
    public FinalProduct(Product rootProductPart, List<Product> allProductParts) {

        // init product parts
        productParts = new LinkedHashMap<>();
        productParts.put(ROOT_PRODUCT, rootProductPart);

        // TODO: add further product parts

    }

    /**
     * Return the root product part.
     * @return The root product part
     */
    public Product getProduct() {
        return productParts.get(ROOT_PRODUCT);
    }

    /**
     * Returns the (root) product's descriptive name.
     * @return The (root) product's descriptive name
     */
    public String getDescriptiveName() {
        return getProduct().getDescriptiveName();
    }

    /**
     * Set's the (root) product's descriptive name.
     * @param descriptiveName The descriptive name to be set.
     */
    public void setDescriptiveName(String descriptiveName) {
        getProduct().setDescriptiveName(descriptiveName);
    }

    /**
     * Returns the (root) product's amount.
     * @return The (root) product's amount
     */
    public Integer getAmount() {
        return getProduct().getAmount();
    }

    /**
     * Set's the (root) product's amount.
     * @param amount The amount value to be set.
     */
    public void setAmount(Integer amount) {
        getProduct().setAmount(amount);
    }

    /**
     * Returns the (root) product's id.
     * @return The (root) product's id
     */
    public String getId() {
        return getProduct().getID();
    }

    /**
     * Set's the (root) product's id.
     * @param id The id to be set.
     */
    public void setId(String id) {
        getProduct().setID(id);
    }

    /**
     * Add intents to the product.
     *
     * @param productIntents The intents to be added.
     */
    public void addIntents(ProductIntent... productIntents) {
        for(ProductIntent productIntent : productIntents) {
            addIntent(productIntent);
        }
    }

    /**
     * Add an intent to the product.
     *
     * @param productIntent The intent to be added.
     * @return The generic intent object for customization.
     */
    public Intent addIntent(ProductIntent productIntent) {

        // prepare product intent
        String paramName = productIntent.getClass().getSimpleName();
        QName qname = new QName(XJdfConstants.NAMESPACE_JDF20, paramName);
        JAXBElement<ProductIntent> productIntentJaxB = new JAXBElement(
                qname,
                SpecificResource.class,
                null,
                productIntent
        );

        // create intent
        Intent intent = new Intent()
                .withName(paramName)
                .withProductIntent(productIntentJaxB);


        // add intent to product
        productParts.get(ROOT_PRODUCT).getIntent().add(intent);

        // sort
        productParts.get(ROOT_PRODUCT).getIntent().sort(Comparator.comparing(Intent::getName));

        // return the created intent
        return intent;
    }

    /**
     * Returns a product intent's intent element.
     * @param productIntentType The type of the product intent.
     * @return The generic intent element.
     */
    public <T extends ProductIntent> Intent getIntent(Class<T> productIntentType) {
        for(Intent intent: productParts.get(ROOT_PRODUCT).getIntent()) {
            if(intent.getProductIntent().getValue().getClass() == productIntentType) {
                return intent;
            }
        }

        return null;
    }

    /**
     * Return list of all intents.
     * @return the list of intents.
     */
    public List<Intent> getIntents() {
        return getProduct().getIntent();
    }

    /**
     * Returns a specific product intent.
     * @param productIntentType The type of the product intent.
     * @return The specific product intent.
     */
    public <T extends ProductIntent> T getProductIntent(Class<T> productIntentType) {
        Intent intent = getIntent(productIntentType);
        return intent == null ? null : (T) intent.getProductIntent().getValue();
    }

    public List<Class<?>> getProductIntentTypes() {
        List<Class<?>> classes = new ArrayList<>();

        for(Intent intent: productParts.get(ROOT_PRODUCT).getIntent()) {
            classes.add(intent.getProductIntent().getValue().getClass());
        }

        return classes;
    }

    /**
     * Return all product parts of the final product.
     *
     * @return All product parts of the final product.
     */
    public List<Product> getProductParts() {
        return new ArrayList<>(productParts.values());
    }
}
