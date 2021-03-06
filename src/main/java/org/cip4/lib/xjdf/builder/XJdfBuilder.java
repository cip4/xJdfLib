package org.cip4.lib.xjdf.builder;

import java.util.Collections;
import java.util.List;

import org.cip4.lib.xjdf.comparator.ResourceSetComparator;
import org.cip4.lib.xjdf.schema.Audit;
import org.cip4.lib.xjdf.schema.AuditPool;
import org.cip4.lib.xjdf.schema.Comment;
import org.cip4.lib.xjdf.schema.GeneralID;
import org.cip4.lib.xjdf.schema.Part;
import org.cip4.lib.xjdf.schema.Product;
import org.cip4.lib.xjdf.schema.ProductList;
import org.cip4.lib.xjdf.schema.Resource;
import org.cip4.lib.xjdf.schema.ResourceSet;
import org.cip4.lib.xjdf.schema.SpecificResource;
import org.cip4.lib.xjdf.schema.XJDF;
import org.cip4.lib.xjdf.util.Resources;
import org.cip4.lib.xjdf.xml.XJdfConstants;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

/**
 * Implementation of a XJdf builder class.
 */
public class XJdfBuilder extends AbstractNodeBuilder<XJDF> {

    /**
     * Accessor for resources.
     */
    private final Resources resourceSets;

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
        super(new XJDF());
        resourceSets = new Resources(getNode().getResourceSet());

        // preconfiguration
        getXJdf().setJobID(jobID);
        getXJdf().setCategory(category);
        getXJdf().setDescriptiveName(descriptiveName);
        getXJdf().setRelatedJobID(relatedJobID);
    }

    /**
     * Custom Constructor. Creates a new instance of XJdfBuilder based on a existing XJDF Document.
     *
     * @param xjdf XJDF Document for modify.
     */
    public XJdfBuilder(final XJDF xjdf) {
        super(xjdf);
        resourceSets = new Resources(getNode().getResourceSet());

        Collections.sort(getNode().getResourceSet(), new ResourceSetComparator());
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
        getNode().getComment().add(new Comment().withValue(comment));
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
            getXJdf().setProductList(new ProductList());
        }

        // add product
        getXJdf().getProductList().getProduct().add(product);
    }

    /**
     * Append a Audit to the XJDF Document.
     *
     * @param audit The audit to be attended append.
     */
    public final void addAudit(Audit audit) {

        // create audit pool if necessary
        if(getXJdf().getAuditPool() == null) {
            getXJdf().setAuditPool(new AuditPool());
        }

        // add audit
        getXJdf().getAuditPool().getAudits().add(audit);
    }

    /**
     * Append Resource node to xJdf Document.
     *
     * @param specificResource Resource object to append.
     */
    public final void addResource(final SpecificResource specificResource) {
        addResource(specificResource, null, null);
    }

    /**
     * Append Resource node to xJdf Document.
     *
     * @param specificResource Resource object to append.
     * @param processUsage ProcessUsage of resource.
     */
    public final void addResource(final SpecificResource specificResource, final String processUsage) {
        addResource(specificResource, null, processUsage);
    }

    /**
     * Append Resource list to xJdf Document.
     *
     * @param specificResources Resource objects to append.
     */
    public final void addResource(final List<SpecificResource> specificResources) {
        addResource(specificResources, null);
    }

    /**
     * Append Resource List to xJdf Document.
     *
     * @param specificResources Resource objects to append.
     * @param processUsage ProcessUsage of resource.
     */
    public final void addResource(final List<SpecificResource> specificResources, final String processUsage) {
        for (SpecificResource specificResource : specificResources) {
            addResource(specificResource, null, processUsage);
        }
    }

    /**
     * Append Resource node to xJdf Document.
     *
     * @param specificResource Resource object to append.
     * @param part Partitioning definitions.
     *
     * @return Resource that was added.
     */
    public final Resource addResource(final SpecificResource specificResource, final Part part) {
        return addResource(specificResource, part, null);
    }

    /**
     * Append Resource node to xJdf Document.
     *
     * @param specificResource Resource object to append.
     * @param part Partitioning definitions.
     * @param processUsage ProcessUsage of resource.
     *
     * @return Resource that was added.
     */
    public final Resource addResource(
        final SpecificResource specificResource, final Part part, final String processUsage
    ) {
        if (specificResource == null) {
            throw new IllegalArgumentException("Resource may not be null.");
        }

        String paramName = specificResource.getClass().getSimpleName();
        QName qname = new QName(XJdfConstants.NAMESPACE_JDF20, paramName);
        JAXBElement<SpecificResource> obj = new JAXBElement(qname, SpecificResource.class, null, specificResource);

        Resource resource = new Resource();
        resource.setSpecificResource(obj);
        resource.getPart().add(part);

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
        resourceSets.addResource(resource, processUsage);
    }

    /**
     * Add a resourceSet to the underlying xjdf.
     * TODO: Merge added sets with matching existing sets.
     *
     * @param resourceSet ResourceSet to add to the xjdf.
     */
    public final void addResourceSet(final ResourceSet resourceSet) {
        resourceSets.addResourceSet(resourceSet);
    }
}
