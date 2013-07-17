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
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.cip4.lib.xjdf.XJdfNodeFactory;
import org.cip4.lib.xjdf.schema.Audit;
import org.cip4.lib.xjdf.schema.AuditPool;
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
	 * Default constructor.
	 */
	public XJdfBuilder() {

		this(null, null, null, null);
	}

	/**
	 * Custom Constructor. Creates a new instance of XJdfBuilder which already contains values for attributes Category (='Web2Print') and JobID.
	 * @param jobID Value of attribute JobID.
	 */
	public XJdfBuilder(String jobID) {

		// return new instance
		this(jobID, null, null, null);
	}

	/**
	 * Custom Constructor. Creates a new instance of XJdfBuilder which already contains values for attributes Category, JobID.
	 * @param jobID Value of attribute JobID.
	 * @param category Value of attribute Category.
	 */
	public XJdfBuilder(String jobID, String category) {

		// return new instance
		this(jobID, category, null, null);
	}

	/**
	 * Custom Constructor. Creates a new instance of XJdfBuilder which already contains values for attributes Category, JobID, DescriptiveName.
	 * @param jobID Value of attribute JobID.
	 * @param category Value of attribute Category.
	 * @param descriptiveName Value of attribute DescriptiveName.
	 */
	public XJdfBuilder(String jobID, String category, String descriptiveName) {

		// return new instance
		this(jobID, category, descriptiveName, null);
	}

	/**
	 * Custom Constructor. Creates a new instance of XJdfBuilder which already contains values for attributes Category, JobID, DescriptiveName and RelatedJobID.
	 * @param jobID Value of attribute JobID.
	 * @param category Value of attribute Category.
	 * @param descriptiveName Value of attribute DescriptiveName.
	 * @param relatedJobID Value of attribute RelatedJobID.
	 * @return New instance of XJDFBuilder which already contains values for defined attributes.
	 */
	public XJdfBuilder(String jobID, String category, String descriptiveName, String relatedJobID) {

		// initialize objects
		super(new XJdfNodeFactory().createXJDF());
		mapParameterSets = new HashMap<String, ParameterSet>(20);
		xJdfNodeFactory = new XJdfNodeFactory();

		// preconfiguration
		getXJdf().setJobID(jobID);
		getXJdf().setCategory(category);
		getXJdf().setDescriptiveName(descriptiveName);
		getXJdf().setRelatedJobID(relatedJobID);

		// default values
		getXJdf().setVersion(XJdfConstants.XJDF_CURRENT_VERSION);
		getXJdf().setID(IDGeneratorUtil.generateID("XJDF"));
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
	public void addComment(String comment) {

		Comment obj = xJdfNodeFactory.createComment(comment);
		getNode().getComment().add(obj);
	}

	/**
	 * Append Audit node to XJDF Document.
	 * @param audit Audit object to append.
	 */
	public void addAudit(Audit audit) {

		if (audit == null)
			return;

		// get audit name
		String paramName = audit.getClass().getSimpleName();

		// create audit element
		QName qname = new QName(XJdfConstants.NAMESPACE_JDF20, paramName);
		JAXBElement obj = new JAXBElement(qname, audit.getClass(), null, audit);

		// if necessary, create AuditPool
		if (getXJdf().getAuditPool() == null) {
			AuditPool auditPool = xJdfNodeFactory.createAuditPool();
			getXJdf().setAuditPool(auditPool);
		}

		// append Audit object
		getXJdf().getAuditPool().getAudit().add(obj);
	}

	/**
	 * Append GeneralID node to XJDF Document.
	 * @param generalId GeneralID object to append.
	 * @return The current XJdfBuilder instance.
	 */
	public void addGeneralID(GeneralID generalId) {

		if (generalId == null)
			return;

		// append GeneralID object
		getXJdf().getGeneralID().add(generalId);
	}

	/**
	 * Append Product node to xJdf Document.
	 * @param product Product object to append.
	 * @return The current XJdfBuilder instance.
	 */
	public void addProduct(Product product) {

		if (product == null)
			return;

		// if necessary, create new ProductList object
		if (getXJdf().getProductList() == null) {
			getXJdf().setProductList(xJdfNodeFactory.createProductList());
		}

		// add product
		getXJdf().getProductList().getProduct().add(product);
	}

	/**
	 * Append Parameter node to xJdf Document.
	 * @param parameterType Parameter object to append.
	 * @return The current XJdfBuilder instance.
	 */
	public void addParameter(ParameterType parameterType) {

		// call default implementation
		addParameter(parameterType, null);
	}

	/**
	 * Append Parameter List to xJdf Document.
	 * @param parameter Parameter object to append.
	 * @return The current XJdfBuilder instance.
	 */
	public void addParameter(List<ParameterType> parameterTypes) {

		// add all parameters
		for (ParameterType parameter : parameterTypes) {
			addParameter(parameter, null);
		}
	}

	/**
	 * Append Parameter node to xJdf Document.
	 * @param parameterType Parameter object to append.
	 * @param part Partitioning definitions.
	 */
	public void addParameter(ParameterType parameterType, Part part) {

		if (parameterType == null)
			return;

		// create parameter
		Parameter parameter = xJdfNodeFactory.createParameter(parameterType, part);

		// add parameter
		addParameter(parameter);

	}

	/**
	 * Append Parameter node to xJdf Document.
	 * @param parameter Parameter node to append to.
	 */
	public void addParameter(Parameter parameter) {

		String paramName = parameter.getParameterType().getName().getLocalPart();

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
		parameterSet.getParameter().add(parameter);
	}
}
