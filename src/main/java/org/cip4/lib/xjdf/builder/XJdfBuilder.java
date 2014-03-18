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

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.apache.commons.lang.StringUtils;
import org.cip4.lib.xjdf.XJdfNodeFactory;
import org.cip4.lib.xjdf.comparator.SetTypeComparator;
import org.cip4.lib.xjdf.schema.*;
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

	private final Map<String, ResourceSet> mapResourceSets;

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
		mapParameterSets = new HashMap<>();
		mapResourceSets = new HashMap<>();
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
	 * Custom Constructor. Creates a new instance of XJdfBuilder based on a existing XJDF Document.
	 * @param xjdf XJDF Document for modify.
	 */
	public XJdfBuilder(XJDF xjdf) {

		// initialize objects
		super(xjdf);
		mapParameterSets = new HashMap<>();
		mapResourceSets = new HashMap<>();
		xJdfNodeFactory = new XJdfNodeFactory();

		// map items
		for (JAXBElement<? extends SetType> setType : xjdf.getSetType()) {

			// parameter set
			if (setType.getValue() instanceof ParameterSet) {
				ParameterSet parameterSet = (ParameterSet) setType.getValue();

				String key = parameterSet.getName();

				if (parameterSet.getProcessUsage() != null) {
					key += "_" + parameterSet.getProcessUsage();
				}

				mapParameterSets.put(key, parameterSet);
			}
		}

		// sort parameterset elements by name
		Collections.sort(getXJdf().getSetType(), new SetTypeComparator());

	}

	/**
	 * Getter for xJdf attribute.
	 * @return the xJdf
	 */
	public XJDF getXJdf() {
		return getNode();
	}

	/**
	 * Append Comment to XJDF Document.
	 * @param comment Comment to append to.
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
	 */
	public void addParameter(ParameterType parameterType) {

		// call default implementation
		addParameter(parameterType, null, null);
	}

	/**
	 * Append Parameter node to xJdf Document.
	 * @param parameterType Parameter object to append.
	 * @param processUsage ProcessUsage of parameter.
	 */
	public void addParameter(ParameterType parameterType, String processUsage) {

		// call default implementation
		addParameter(parameterType, null, processUsage);
	}

	/**
	 * Append Parameter list to xJdf Document.
	 * @param parameterTypes Parameter objects to append.
	 */
	public void addParameter(List<ParameterType> parameterTypes) {

		// add all parameters
		addParameter(parameterTypes, null);
	}

	/**
	 * Append Parameter List to xJdf Document.
	 * @param parameterTypes Parameter objects to append.
	 * @param processUsage ProcessUsage of parameter.
	 */
	public void addParameter(List<ParameterType> parameterTypes, String processUsage) {

		// add all parameters
		for (ParameterType parameter : parameterTypes) {
			addParameter(parameter, null, processUsage);
		}
	}

	/**
	 * Append Parameter node to xJdf Document.
	 * @param parameterType Parameter object to append.
	 * @param part Partitioning definitions.
	 */
	public void addParameter(ParameterType parameterType, Part part) {

		// add parameter
		addParameter(parameterType, part, null);
	}

	/**
	 * Append Parameter node to xJdf Document.
	 * @param parameterType Parameter object to append.
	 * @param part Partitioning definitions.
	 * @param processUsage ProcessUsage of parameter.
	 */
	public void addParameter(ParameterType parameterType, Part part, String processUsage) {

		if (parameterType == null)
			return;

		// create parameter
		Parameter parameter = xJdfNodeFactory.createParameter(parameterType, part);

		// add parameter
		addParameter(parameter, processUsage);
	}

	/**
	 * Append Parameter node to xJdf Document.
	 * @param parameter Parameter node to append to.
	 */
	public void addParameter(Parameter parameter) {

		// add parameter
		addParameter(parameter, null);
	}

	/**
	 * Append Parameter node to xJdf Document.
	 * @param parameter Parameter node to append to.
	 * @param processUsage ProcessUsage of parameter.
	 */
	public void addParameter(Parameter parameter, String processUsage) {

		// get parameter name
		String paramName = parameter.getParameterType().getName().getLocalPart();

		// set key
		String key = paramName;

		if (!StringUtils.isEmpty(processUsage)) {
			key += "_" + processUsage;
		} else {
			processUsage = null;
		}

		// get ParameterSet according to parameter
		ParameterSet parameterSet;

		if (mapParameterSets.containsKey(key)) {
			// get ParameterSet object
			parameterSet = mapParameterSets.get(key);

		} else {
			// create ParameterSet object
			parameterSet = xJdfNodeFactory.createParameterSet();
			parameterSet.setName(paramName);
			parameterSet.setProcessUsage(processUsage);

			// append element to lists
			getXJdf().getSetType().add(xJdfNodeFactory.createParameterSet(parameterSet));
			mapParameterSets.put(key, parameterSet);

			// sort parameterset elements by name
			Collections.sort(getXJdf().getSetType(), new SetTypeComparator());
		}

		// append parameter to parameterSet
		parameterSet.getParameter().add(parameter);
	}

    /**
     * Append Resource node to xJdf Document.
     * @param resourceType Resource object to append.
     * @param part Partitioning definitions.
     */
    public Resource addResource(ResourceType resourceType, Part part) {
        return addResource(resourceType, part, null);
    }

    /**
     * Append Resource node to xJdf Document.
     * @param resourceType Resource object to append.
     * @param part Partitioning definitions.
     * @param processUsage ProcessUsage of resource.
     */
    public Resource addResource(ResourceType resourceType, Part part, String processUsage) {
        if (resourceType == null) {
            throw new IllegalArgumentException("Resource may not be null.");
        }

        Resource resource = xJdfNodeFactory.createResource(resourceType, part);

        resource.setID(resource.getResourceType().getName().getLocalPart() + "_" + UUID.randomUUID().toString());

        addResource(resource, processUsage);
        return resource;
    }

    /**
	 * Append Resource node to xJdf Document.
	 * @param resource Resource node to append to.
	 * @param processUsage ProcessUsage of resource.
	 */
	public void addResource(final Resource resource, String processUsage) {

		// get parameter name
		String resourceName = resource.getResourceType().getName().getLocalPart();

		// set key
		String key = resourceName;

		if (!StringUtils.isEmpty(processUsage)) {
			key += "_" + processUsage;
		} else {
			processUsage = null;
		}

		// get ResourceSet according to parameter
		ResourceSet resourceSet;

		if (mapParameterSets.containsKey(key)) {
			// get ResourceSet object
			resourceSet = mapResourceSets.get(key);
		} else {
			// create ResourceSet object
			resourceSet = xJdfNodeFactory.createResourceSet();
			resourceSet.setName(resourceName);
			resourceSet.setProcessUsage(processUsage);

			// append element to lists
			getXJdf().getSetType().add(xJdfNodeFactory.createResourceSet(resourceSet));
            mapResourceSets.put(key, resourceSet);

			// sort parameterset elements by name
			Collections.sort(getXJdf().getSetType(), new SetTypeComparator());
		}

		// append parameter to parameterSet
		resourceSet.getResource().add(resource);
	}
}
