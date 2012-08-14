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
import org.cip4.lib.xjdf.schema.GeneralID;
import org.cip4.lib.xjdf.schema.Parameter;
import org.cip4.lib.xjdf.schema.ParameterSet;
import org.cip4.lib.xjdf.schema.ParameterType;
import org.cip4.lib.xjdf.schema.Part;
import org.cip4.lib.xjdf.schema.Product;
import org.cip4.lib.xjdf.schema.XJDF;
import org.cip4.lib.xjdf.xml.XJdfConstants;

/**
 * Implementation of a XJdf builder class.
 * @author s.meissner
 * @date 29.02.2012
 */
public class XJdfBuilder extends AbstractNodeBuilder<XJDF> {

	private final XJdfNodeFactory xJdfNodeFactory;

	private final Map<String, ParameterSet> mapParameterSets;

	/**
	 * Private default constructor. Class cannot being instantiated from external.
	 */
	private XJdfBuilder() {

		// initialize objects
		super(XJdfNodeFactory.newInstance().createXJDF());
		mapParameterSets = new HashMap<String, ParameterSet>(20);

		xJdfNodeFactory = XJdfNodeFactory.newInstance();
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
	 * Create and return a new instance of XJdfBuilder which already contains values for attributes Category (='Web2Print') and JobID.
	 * @param jobID Value of attribute JobID.
	 * @return New instance of XJDFBuilder which already contains values for defined attributes.
	 */
	public static XJdfBuilder newInstance(String jobID) {

		// return new instance
		return newInstance(jobID, "Web2Print", null, null);
	}

	/**
	 * Create and return a new instance of XJdfBuilder which already contains values for attributes Category, JobID.
	 * @param jobID Value of attribute JobID.
	 * @param category Value of attribute Category.
	 * @return New instance of XJDFBuilder which already contains values for defined attributes.
	 */
	public static XJdfBuilder newInstance(String jobID, String category) {

		// return new instance
		return newInstance(jobID, category, null, null);
	}

	/**
	 * Create and return a new instance of XJdfBuilder which already contains values for attributes Category, JobID, DescriptiveName.
	 * @param jobID Value of attribute JobID.
	 * @param category Value of attribute Category.
	 * @param descriptiveName Value of attribute DescriptiveName.
	 * @return New instance of XJDFBuilder which already contains values for defined attributes.
	 */
	public static XJdfBuilder newInstance(String jobID, String category, String descriptiveName) {

		// return new instance
		return newInstance(jobID, category, descriptiveName, null);
	}

	/**
	 * Create and return a new instance of XJdfBuilder which already contains values for attributes Category, JobID, DescriptiveName and RelatedJobID.
	 * @param jobID Value of attribute JobID.
	 * @param category Value of attribute Category.
	 * @param descriptiveName Value of attribute DescriptiveName.
	 * @param relatedJobID Value of attribute RelatedJobID.
	 * @return New instance of XJDFBuilder which already contains values for defined attributes.
	 */
	public static XJdfBuilder newInstance(String jobID, String category, String descriptiveName, String relatedJobID) {

		// create instance
		XJdfBuilder xJdfBuilder = newInstance();

		// preconfiguration
		xJdfBuilder.getXJdf().setJobID(jobID);
		xJdfBuilder.getXJdf().setCategory(category);
		xJdfBuilder.getXJdf().setDescriptiveName(descriptiveName);
		xJdfBuilder.getXJdf().setRelatedJobID(relatedJobID);

		// return instance
		return xJdfBuilder;
	}

	/**
	 * Getter for xJdf attribute.
	 * @return the xJdf
	 */
	protected XJDF getXJdf() {
		return getNode();
	}

	/**
	 * Append GeneralID node to xJdf Document.
	 * @param generalId GeneralID object to append.
	 * @return The current XJdfBuilder instance.
	 */
	public XJdfBuilder addGeneralID(GeneralID generalId) {

		// append GeneralID object
		getXJdf().getGeneralIDs().add(generalId);

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
		if (getXJdf().getProductList() == null) {
			getXJdf().setProductList(xJdfNodeFactory.createProductList());
		}

		// add product
		getXJdf().getProductList().getProducts().add(product);

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
		Parameter param = xJdfNodeFactory.createParameter();

		QName qname = new QName(XJdfConstants.NAMESPACE_JDF20, paramName);
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
			parameterSet = xJdfNodeFactory.createParameterSet();
			parameterSet.setName(paramName);

			// append element to lists
			getXJdf().getSetTypes().add(xJdfNodeFactory.createParameterSet(parameterSet));
			mapParameterSets.put(paramName, parameterSet);
		}

		// append parameter to parameterSet
		parameterSet.getParameters().add(param);

		// return XJdfBuilder object
		return this;
	}
}
