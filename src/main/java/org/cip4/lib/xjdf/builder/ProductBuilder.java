/**
 * All rights reserved by
 * 
 * flyeralarm GmbH
 * Alfred-Nobel-Straße 18
 * 97080 Würzburg
 *
 * info@flyeralarm.com
 * http://www.flyeralarm.com
 */
package org.cip4.lib.xjdf.builder;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.cip4.lib.xjdf.XJdfNodeFactory;
import org.cip4.lib.xjdf.schema.jdf.Intent;
import org.cip4.lib.xjdf.schema.jdf.IntentType;
import org.cip4.lib.xjdf.schema.jdf.Product;
import org.cip4.lib.xjdf.xml.XJdfConstants;

/**
 * Implementation of a Product builder class.
 * @author s.meissner
 * @date 05.03.2012
 */
public class ProductBuilder extends AbstractNodeBuilder<Product> {

	private final XJdfNodeFactory xJdfNodeFactory;

	/**
	 * Default constructor.
	 */
	private ProductBuilder() {

		// initialize objects
		super(XJdfNodeFactory.newInstance().createProduct());

		xJdfNodeFactory = XJdfNodeFactory.newInstance();
	}

	/**
	 * Create and return a new instance of ProductBuilder.
	 * @return New ProductBuilder instance.
	 */
	public static ProductBuilder newInstance() {

		// return new instance
		return new ProductBuilder();
	}

	/**
	 * Create and return a new instance of ProductBuilder which already contains attribute Amount.
	 * @param amount Value of Amount attribute
	 * @return New instance of ProductBuilder which already contains values for defined attributes.
	 */
	public static ProductBuilder newInstance(int amount) {

		// return new instance
		return newInstance(amount, null, null, null);
	}

	/**
	 * Create and return a new instance of ProductBuilder which already contains attributes Amount, ID, ProductType and ProductTypeDetails.
	 * @param amount Value of Amount attribute
	 * @param id Value of ID attribute
	 * @param productType Value of ProductType attribute
	 * @param productTypeDetails Value of ProductTypeDetails attribute
	 * @return New instance of ProductBuilder which already contains values for defined attributes.
	 */
	public static ProductBuilder newInstance(int amount, String id, String productType, String productTypeDetails) {

		// create new instance
		ProductBuilder builder = newInstance();

		// set attributes
		builder.getNode().setAmount(amount);
		builder.getNode().setID(id);
		builder.getNode().setProductType(productType);
		builder.getNode().setProductTypeDetails(productTypeDetails);

		// return instance
		return builder;
	}

	/**
	 * Getter for product attribute.
	 * @return the product
	 */
	public Product getProduct() {
		return getNode();
	}

	/**
	 * Initialize most common attributes of Product Node.
	 * @param amount
	 * @return
	 */
	public ProductBuilder initAttributes(Integer amount) {

		// set attributes
		getProduct().setAmount(amount);
		// TODO implement further attributes

		// return current builder
		return this;
	}

	/**
	 * Append Intent node to Product Definition.
	 * @param intent Intent object to append to.
	 * @return The current ProductBuilder instance.
	 */
	public ProductBuilder addIntent(IntentType intent) {

		// get parameter name
		String intentName = intent.getClass().getSimpleName();

		// create intent node
		Intent it = xJdfNodeFactory.createIntent();
		it.setName(intentName);

		QName qname = new QName(XJdfConstants.NAMESPACE_JDF20, intentName);
		JAXBElement obj = new JAXBElement(qname, intent.getClass(), null, intent);
		it.getIntentTypes().add(obj);

		// append intent to product
		getProduct().getIntents().add(it);

		// return current builder
		return this;
	}

}
