package org.cip4.lib.xjdf.builder;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

import org.cip4.lib.xjdf.XJdfNodeFactory;
import org.cip4.lib.xjdf.comparator.ResourceSetComparator;
import org.cip4.lib.xjdf.schema.Comment;
import org.cip4.lib.xjdf.schema.GeneralID;
import org.cip4.lib.xjdf.schema.Part;
import org.cip4.lib.xjdf.schema.Product;
import org.cip4.lib.xjdf.schema.Resource;
import org.cip4.lib.xjdf.schema.ResourceSet;
import org.cip4.lib.xjdf.schema.ResourceType;
import org.cip4.lib.xjdf.schema.XJDF;
import org.cip4.lib.xjdf.util.Resources;
import org.cip4.lib.xjdf.xml.XJdfConstants;

/**
 * Implementation of a XJdf builder class.
 */
public class XJdfBuilder extends AbstractNodeBuilder<XJDF> {

    /**
     * Factory for creating xjdf nodes.
     */
    private final XJdfNodeFactory xJdfNodeFactory;

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
        resourceSets = new Resources(getNode().getResourceSet());
        xJdfNodeFactory = new XJdfNodeFactory();

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
        xJdfNodeFactory = new XJdfNodeFactory();

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
        Comment obj = xJdfNodeFactory.createComment(comment);
        getNode().getComment().add(obj);
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
     * Append Resource node to xJdf Document.
     *
     * @param resourceType Resource object to append.
     */
    public final void addResource(final ResourceType resourceType) {
        addResource(resourceType, null, null);
    }

    /**
     * Append Resource node to xJdf Document.
     *
     * @param resourceType Resource object to append.
     * @param processUsage ProcessUsage of resource.
     */
    public final void addResource(final ResourceType resourceType, final String processUsage) {
        addResource(resourceType, null, processUsage);
    }

    /**
     * Append Resource list to xJdf Document.
     *
     * @param resourceTypes Resource objects to append.
     */
    public final void addResource(final List<ResourceType> resourceTypes) {
        addResource(resourceTypes, null);
    }

    /**
     * Append Resource List to xJdf Document.
     *
     * @param resourceTypes Resource objects to append.
     * @param processUsage ProcessUsage of resource.
     */
    public final void addResource(final List<ResourceType> resourceTypes, final String processUsage) {
        for (ResourceType resourceType : resourceTypes) {
            addResource(resourceType, null, processUsage);
        }
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
