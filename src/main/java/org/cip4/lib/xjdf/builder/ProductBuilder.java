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
import org.cip4.lib.xjdf.schema.Intent;
import org.cip4.lib.xjdf.schema.IntentType;
import org.cip4.lib.xjdf.schema.Product;
import org.cip4.lib.xjdf.util.IDGeneratorUtil;
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
		return newInstance(amount, null, null);
	}

	/**
	 * Create and return a new instance of ProductBuilder which already contains attributes Amount, ID, ProductType and ProductTypeDetails.
	 * @param amount Value of Amount attribute
	 * @param id Value of ID attribute
	 * @param productType Value of ProductType attribute
	 * @param productTypeDetails Value of ProductTypeDetails attribute
	 * @return New instance of ProductBuilder which already contains values for defined attributes.
	 */
	public static ProductBuilder newInstance(int amount, String productType, String productTypeDetails) {

		// create new instance
		ProductBuilder builder = newInstance();

		// set attributes
		builder.getProduct().setAmount(amount);
		builder.getProduct().setProductType(productType);
		builder.getProduct().setProductTypeDetails(productTypeDetails);

		// default values
		builder.getProduct().setID(IDGeneratorUtil.generateID("PRD"));

		// return instance
		return builder;
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
	 * @return The current ProductBuilder instance.
	 */
	public ProductBuilder addIntent(IntentType intent) {

		if (intent == null)
			return this;

		// get parameter name
		String intentName = intent.getClass().getSimpleName();

		// create intent node
		Intent it = xJdfNodeFactory.createIntent();
		it.setName(intentName);

		QName qname = new QName(XJdfConstants.NAMESPACE_JDF20, intentName);
		JAXBElement obj = new JAXBElement(qname, intent.getClass(), null, intent);
		it.getIntentType().add(obj);

		// append intent to product
		getProduct().getIntent().add(it);

		// return current builder
		return this;
	}

}
