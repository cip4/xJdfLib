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

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.cip4.lib.xjdf.XJdfNodeFactory;
import org.cip4.lib.xjdf.schema.jdf.GeneralID;
import org.cip4.lib.xjdf.schema.jdf.Parameter;
import org.cip4.lib.xjdf.schema.jdf.ParameterSet;
import org.cip4.lib.xjdf.schema.jdf.ParameterType;
import org.cip4.lib.xjdf.schema.jdf.Part;
import org.cip4.lib.xjdf.schema.jdf.Product;
import org.cip4.lib.xjdf.schema.jdf.XJDF;
import org.cip4.lib.xjdf.xml.XmlConstants;

/**
 * Implementation of a XJdf builder class.
 * @author s.meissner
 * @date 29.02.2012
 */
public class XJdfBuilder extends AbstractBuilder<XJDF> {

	private final Map<String, ParameterSet> mapParameterSets;

	/**
	 * Default constructor.
	 */
	private XJdfBuilder() {

		// initialize objects
		super(XJdfNodeFactory.getInstance().createXJDF());
		mapParameterSets = new HashMap<String, ParameterSet>(20);
	}

	/**
	 * Create and return a new instance of XJdfBuilder.
	 * @return New XJdfBuilder instance.
	 */
	public static XJdfBuilder newInstance() {

		// return new instance
		return new XJdfBuilder();
	}

	/**
	 * Getter for xJdf attribute.
	 * @return the xJdf
	 */
	public XJDF getxJdf() {
		return getNode();
	}

	/**
	 * Append GeneralID node to xJdf Document.
	 * @param generalId GeneralID object to append.
	 * @return The current XJdfBuilder instance.
	 */
	public XJdfBuilder addGeneralID(GeneralID generalId) {

		// append GeneralID object
		getxJdf().getGeneralIDs().add(generalId);

		// return XJdfBuilder object
		return this;
	}

	/**
	 * Append Product node to xJdf Document.
	 * @param product Product object to append.
	 * @return The current XJdfBuilder instance.
	 */
	public XJdfBuilder addProduct(Product product) {

		// if necessary, create new ProductList object
		if (getxJdf().getProductList() == null) {
			getxJdf().setProductList(XJdfNodeFactory.getInstance().createProductList());
		}

		// add product
		getxJdf().getProductList().getProducts().add(product);

		// return XJdfBuilder object
		return this;
	}

	/**
	 * Append Parameter node to xJdf Document.
	 * @param parameter Parameter object to append.
	 * @return The current XJdfBuilder instance.
	 */
	public XJdfBuilder addParameter(ParameterType parameter) {

		// call default implementation
		return addParameter(parameter, null);
	}

	/**
	 * Append Parameter node to xJdf Document.
	 * @param parameter Parameter object to append.
	 * @param part Partitioning definitions.
	 * @return The current XJdfBuilder instance.
	 */
	public XJdfBuilder addParameter(ParameterType parameter, Part part) {

		// get parameter name
		String paramName = parameter.getClass().getSimpleName();

		// create parameter
		Parameter param = XJdfNodeFactory.getInstance().createParameter();

		QName qname = new QName(XmlConstants.NAMESPACE_JDF20, paramName);
		JAXBElement obj = new JAXBElement(qname, parameter.getClass(), null, parameter);
		param.getParameterTypes().add(obj);

		if (part != null) {
			param.getParts().add(part);
		}

		// get ParameterSet according to parameter
		ParameterSet parameterSet;

		if (mapParameterSets.containsKey(paramName)) {
			// get ParameterSet object
			parameterSet = mapParameterSets.get(paramName);

		} else {
			// create ParameterSet object
			parameterSet = XJdfNodeFactory.getInstance().createParameterSet();
			parameterSet.setName(paramName);

			// append element to lists
			getxJdf().getSetTypes().add(XJdfNodeFactory.getInstance().createParameterSet(parameterSet));
			mapParameterSets.put(paramName, parameterSet);
		}

		// append parameter to parameterSet
		parameterSet.getParameters().add(param);

		// return XJdfBuilder object
		return this;
	}
}
