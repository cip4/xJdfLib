package org.cip4.lib.xjdf.builder;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.cip4.lib.xjdf.XJdfNodeFactory;
import org.cip4.lib.xjdf.comparator.SetTypeComparator;
import org.cip4.lib.xjdf.schema.Audit;
import org.cip4.lib.xjdf.schema.AuditPool;
import org.cip4.lib.xjdf.schema.Comment;
import org.cip4.lib.xjdf.schema.GeneralID;
import org.cip4.lib.xjdf.schema.Parameter;
import org.cip4.lib.xjdf.schema.ParameterSet;
import org.cip4.lib.xjdf.schema.ParameterType;
import org.cip4.lib.xjdf.schema.Part;
import org.cip4.lib.xjdf.schema.Product;
import org.cip4.lib.xjdf.schema.Resource;
import org.cip4.lib.xjdf.schema.ResourceSet;
import org.cip4.lib.xjdf.schema.ResourceType;
import org.cip4.lib.xjdf.schema.XJDF;
import org.cip4.lib.xjdf.util.IDGeneratorUtil;
import org.cip4.lib.xjdf.util.SetTypeWrapper;
import org.cip4.lib.xjdf.util.Parameters;
import org.cip4.lib.xjdf.util.Resources;
import org.cip4.lib.xjdf.xml.XJdfConstants;

/**
 * Implementation of a XJdf builder class.
 *
 * @author s.meissner
 * @author m.hartmann
 */
public class XJdfBuilder extends AbstractNodeBuilder<XJDF> {

    /**
     * Factory for creating xjdf nodes.
     */
    private final XJdfNodeFactory xJdfNodeFactory;

    /**
     * Accessor for parameters.
     */
    private final Parameters parameterSets;

    /**
     * Accessor for resources.
     */
    private final Resources resourceSets;

    /**
     * Default constructor.
     */
    public XJdfBuilder() {
        this(null, null, null, null);
    }

    /**
     * Custom Constructor. Creates a new instance of XJdfBuilder which already contains values for attributes Category
     * (='Web2Print') and JobID.
     *
     * @param jobID Value of attribute JobID.
     */
    public XJdfBuilder(final String jobID) {
        this(jobID, null, null, null);
    }

    /**
     * Custom Constructor. Creates a new instance of XJdfBuilder which already contains values for attributes Category,
     * JobID.
     *
     * @param jobID Value of attribute JobID.
     * @param category Value of attribute Category.
     */
    public XJdfBuilder(final String jobID, final String category) {
        this(jobID, category, null, null);
    }

    /**
     * Custom Constructor. Creates a new instance of XJdfBuilder which already contains values for attributes Category,
     * JobID, DescriptiveName.
     *
     * @param jobID Value of attribute JobID.
     * @param category Value of attribute Category.
     * @param descriptiveName Value of attribute DescriptiveName.
     */
    public XJdfBuilder(final String jobID, final String category, final String descriptiveName) {
        this(jobID, category, descriptiveName, null);
    }

    /**
     * Custom Constructor. Creates a new instance of XJdfBuilder which already contains values for attributes Category,
     * JobID, DescriptiveName and RelatedJobID.
     *
     * @param jobID Value of attribute JobID.
     * @param category Value of attribute Category.
     * @param descriptiveName Value of attribute DescriptiveName.
     * @param relatedJobID Value of attribute RelatedJobID.
     */
    public XJdfBuilder(
        final String jobID, final String category, final String descriptiveName, final String relatedJobID
    ) {
        // initialize objects
        super(new XJdfNodeFactory().createXJDF());
        SetTypeWrapper setTypeWrapper = new SetTypeWrapper(getNode().getSetType());
        parameterSets = new Parameters(setTypeWrapper);
        resourceSets = new Resources(setTypeWrapper);
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
     *
     * @param xjdf XJDF Document for modify.
     */
    public XJdfBuilder(final XJDF xjdf) {
        // initialize objects
        super(xjdf);
        SetTypeWrapper setTypeWrapper = new SetTypeWrapper(getNode().getSetType());
        parameterSets = new Parameters(setTypeWrapper);
        resourceSets = new Resources(setTypeWrapper);
        xJdfNodeFactory = new XJdfNodeFactory();

        // sort parameterset elements by name
        Collections.sort(setTypeWrapper, new SetTypeComparator());
    }

    /**
     * Getter for xJdf attribute.
     *
     * @return the xJdf
     */
    public XJDF getXJdf() {
        return getNode();
    }

    /**
     * Append Comment to XJDF Document.
     *
     * @param comment Comment to append to.
     */
    public final void addComment(final String comment) {
        Comment obj = xJdfNodeFactory.createComment(comment);
        getNode().getComment().add(obj);
    }

    /**
     * Append Audit node to XJDF Document.
     *
     * @param audit Audit object to append.
     */
    public final void addAudit(final Audit audit) {
        if (audit == null) {
            return;
        }

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
     *
     * @param generalId GeneralID object to append.
     */
    public final void addGeneralID(final GeneralID generalId) {
        if (generalId == null) {
            return;
        }

        // append GeneralID object
        getXJdf().getGeneralID().add(generalId);
    }

    /**
     * Append Product node to xJdf Document.
     *
     * @param product Product object to append.
     */
    public final void addProduct(final Product product) {
        if (product == null) {
            return;
        }

        // if necessary, create new ProductList object
        if (getXJdf().getProductList() == null) {
            getXJdf().setProductList(xJdfNodeFactory.createProductList());
        }

        // add product
        getXJdf().getProductList().getProduct().add(product);
    }

    /**
     * Append Parameter node to xJdf Document.
     *
     * @param parameterType Parameter object to append.
     */
    public final void addParameter(final ParameterType parameterType) {
        // call default implementation
        addParameter(parameterType, null, null);
    }

    /**
     * Append Parameter node to xJdf Document.
     *
     * @param parameterType Parameter object to append.
     * @param processUsage ProcessUsage of parameter.
     */
    public final void addParameter(final ParameterType parameterType, final String processUsage) {
        // call default implementation
        addParameter(parameterType, null, processUsage);
    }

    /**
     * Append Parameter list to xJdf Document.
     *
     * @param parameterTypes Parameter objects to append.
     */
    public final void addParameter(final List<ParameterType> parameterTypes) {
        // add all parameters
        addParameter(parameterTypes, null);
    }

    /**
     * Append Parameter List to xJdf Document.
     *
     * @param parameterTypes Parameter objects to append.
     * @param processUsage ProcessUsage of parameter.
     */
    public final void addParameter(final List<ParameterType> parameterTypes, final String processUsage) {
        // add all parameters
        for (ParameterType parameter : parameterTypes) {
            addParameter(parameter, null, processUsage);
        }
    }

    /**
     * Append Parameter node to xJdf Document.
     *
     * @param parameterType Parameter object to append.
     * @param part Partitioning definitions.
     */
    public final void addParameter(final ParameterType parameterType, final Part part) {
        // add parameter
        addParameter(parameterType, part, null);
    }

    /**
     * Append Parameter node to xJdf Document.
     *
     * @param parameterType Parameter object to append.
     * @param part Partitioning definitions.
     * @param processUsage ProcessUsage of parameter.
     */
    public void addParameter(final ParameterType parameterType, final Part part, final String processUsage) {
        if (parameterType == null) {
            return;
        }

        // create parameter
        Parameter parameter = xJdfNodeFactory.createParameter(parameterType, part);

        // add parameter
        addParameter(parameter, processUsage);
    }

    /**
     * Append Parameter node to xJdf Document.
     *
     * @param parameter Parameter node to append to.
     */
    public void addParameter(final Parameter parameter) {
        // add parameter
        addParameter(parameter, null);
    }

    /**
     * Append Parameter node to xJdf Document.
     *
     * @param parameter Parameter node to append to.
     * @param processUsage ProcessUsage of parameter.
     */
    public final void addParameter(final Parameter parameter, final String processUsage) {
        parameterSets.addAsset(parameter, processUsage);
    }

    /**
     * Add a parameterSet to the underlying xjdf.
     * TODO: Merge added sets with matching existing sets.
     *
     * @param parameterSet ParameterSet to add to the xjdf.
     */
    public final void addParameterSet(final ParameterSet parameterSet) {
        parameterSets.addAssetSet(parameterSet);
    }

    /**
     * Append Resource node to xJdf Document.
     *
     * @param resourceType Resource object to append.
     * @param part Partitioning definitions.
     *
     * @return Resource that was added.
     */
    public final Resource addResource(final ResourceType resourceType, final Part part) {
        return addResource(resourceType, part, null);
    }

    /**
     * Append Resource node to xJdf Document.
     *
     * @param resourceType Resource object to append.
     * @param part Partitioning definitions.
     * @param processUsage ProcessUsage of resource.
     *
     * @return Resource that was added.
     */
    public final Resource addResource(final ResourceType resourceType, final Part part, final String processUsage) {
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
     *
     * @param resource Resource node to append to.
     * @param processUsage ProcessUsage of resource.
     */
    public void addResource(final Resource resource, final String processUsage) {
        resourceSets.addAsset(resource, processUsage);
    }

    /**
     * Add a resourceSet to the underlying xjdf.
     * TODO: Merge added sets with matching existing sets.
     *
     * @param resourceSet ParameterSet to add to the xjdf.
     */
    public final void addResourceSet(final ResourceSet resourceSet) {
        resourceSets.addAssetSet(resourceSet);
    }
}
