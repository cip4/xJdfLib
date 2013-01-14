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
import org.cip4.lib.xjdf.schema.ChildProduct;
import org.cip4.lib.xjdf.schema.Comment;
import org.cip4.lib.xjdf.schema.GeneralID;
import org.cip4.lib.xjdf.schema.Parameter;
import org.cip4.lib.xjdf.schema.ParameterSet;
import org.cip4.lib.xjdf.schema.ParameterType;
import org.cip4.lib.xjdf.schema.Part;
import org.cip4.lib.xjdf.schema.Product;
import org.cip4.lib.xjdf.schema.XJDF;
import org.cip4.lib.xjdf.util.IDGeneratorUtil;
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
		return newInstance(null, null, null, null);
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
		XJdfBuilder xJdfBuilder = new XJdfBuilder();

		// preconfiguration
		xJdfBuilder.getXJdf().setJobID(jobID);
		xJdfBuilder.getXJdf().setCategory(category);
		xJdfBuilder.getXJdf().setDescriptiveName(descriptiveName);
		xJdfBuilder.getXJdf().setRelatedJobID(relatedJobID);

		// default values
		xJdfBuilder.getXJdf().setVersion(XJdfConstants.XJDF_CURRENT_VERSION);
		xJdfBuilder.getXJdf().setID(IDGeneratorUtil.generateID("XJDF"));

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
	 * Append Comment to XJDF Document.
	 * @param comment Comment to append to.
	 * @return The current XJdfBuilder instance.
	 */
	public XJdfBuilder addComment(String comment) {

		Comment obj = xJdfNodeFactory.createComment(comment);
		getNode().getComment().add(obj);

		// return XJdfBuilder object
		return this;
	}

	/**
	 * Append GeneralID node to xJdf Document.
	 * @param generalId GeneralID object to append.
	 * @return The current XJdfBuilder instance.
	 */
	public XJdfBuilder addGeneralID(GeneralID generalId) {

		if (generalId == null)
			return this;

		// append GeneralID object
		getXJdf().getGeneralID().add(generalId);

		// return XJdfBuilder object
		return this;
	}

	/**
	 * Append Product node to xJdf Document.
	 * @param product Product object to append.
	 * @return The current XJdfBuilder instance.
	 */
	public XJdfBuilder addProduct(Product product) {

		if (product == null)
			return this;

		// if necessary, create new ProductList object
		if (getXJdf().getProductList() == null) {
			getXJdf().setProductList(xJdfNodeFactory.createProductList());
		}

		// add product
		getXJdf().getProductList().getProduct().add(product);

		// add all child products
		for (ChildProduct child : product.getChildProduct()) {
			getXJdf().getProductList().getProduct().add((Product) child.getChildRef());
		}

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

		if (parameter == null)
			return this;

		// get parameter name
		String paramName = parameter.getClass().getSimpleName();

		// create parameter
		Parameter param = xJdfNodeFactory.createParameter();

		QName qname = new QName(XJdfConstants.NAMESPACE_JDF20, paramName);
		JAXBElement obj = new JAXBElement(qname, parameter.getClass(), null, parameter);
		param.getParameterType().add(obj);

		if (part != null) {
			param.getPart().add(part);
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
			getXJdf().getSetType().add(xJdfNodeFactory.createParameterSet(parameterSet));
			mapParameterSets.put(paramName, parameterSet);
		}

		// append parameter to parameterSet
		parameterSet.getParameter().add(param);

		// return XJdfBuilder object
		return this;
	}
}
