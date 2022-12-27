package org.cip4.lib.xjdf;

import org.cip4.lib.xjdf.exception.XJdfParseException;
import org.cip4.lib.xjdf.partition.PartitionManager;
import org.cip4.lib.xjdf.schema.*;
import org.cip4.lib.xjdf.xml.XJdfConstants;
import org.cip4.lib.xjdf.xml.XJdfParser;
import org.jetbrains.annotations.NotNull;

import jakarta.xml.bind.JAXBElement;

import javax.xml.namespace.QName;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.*;

/**
 * XJDF Document is the main object when dealing with XJDF documents.
 * Most of the logic covered by the XJDF library is covered by this class.
 */
public class XJdfDocument {

    private final boolean DEFAULT_SKIP_VALIDATION = false;

    private final XJDF xjdf;

    /**
     * Default constructor. <br>
     * Creates an empty XJDF Document.
     */
    public XJdfDocument() {
        this(new XJDF());
    }

    /**
     * Custom Constructor. <br>
     * Accepting the required attributes of an XJDF Document for initializing.
     *
     * @param jobId The documents JobID.
     * @param types The documents types.
     */
    public XJdfDocument(String jobId, String... types) {
        this(new XJDF()
            .withJobID(jobId)
            .withTypes(types)
        );
    }

    /**
     * Custom Constructor. <br>
     * Accepting an XJDF Document as byte array for initializing.
     *
     * @param bytes The XJDF Document as byte array.
     */
    public XJdfDocument(byte[] bytes) throws XJdfParseException {
        this.xjdf = new XJdfParser().parseStream(new ByteArrayInputStream(bytes));
    }

    /**
     * Custom Constructor. <br>
     * Accepting an XJDF root node for initializing.
     *
     * @param xjdf The XJDF root node.
     */
    public XJdfDocument(XJDF xjdf) {
        this.xjdf = xjdf;
    }

    /**
     * Returns the XJDF Documents XJDF root node.
     *
     * @return The XJDF root node.
     */
    public XJDF getXJdf() {
        return xjdf;
    }

    /**
     * Returns the current XJDF Document as XML byte array.
     *
     * @return The XJDF Document as XML byte array.
     */
    public byte[] toXml() throws XJdfParseException, IOException {
        return new XJdfParser(false).parseXJdf(this.xjdf, DEFAULT_SKIP_VALIDATION);
    }

    /**
     * Append Audit elements to the XJDF Document.
     *
     * @param audits The audits to be appended.
     */
    public void addAudits(Audit... audits) {

        // create audit pool if no present
        if (xjdf.getAuditPool() == null) {
            xjdf.setAuditPool(new AuditPool());
        }

        // add audits
        xjdf.getAuditPool().withAudits(audits);
    }

    /**
     * Append Product elements to the XJDF Document.
     *
     * @param products The products to be appended.
     */
    public void addProduct(Product... products) {

        // create audit pool if no present
        if (xjdf.getProductList() == null) {
            xjdf.setProductList(new ProductList());
        }

        // add audits
        xjdf.getProductList().withProduct(products);
    }

    /**
     * Add a specific resource to the XJDF Document.
     *
     * @param specificResource The specific resource to be added.
     * @param usage            The resource's usage.
     * @return The appropriate ResourceSet element for further processing.
     */
    public ResourceSet addResourceSet(@NotNull SpecificResource specificResource, ResourceSet.Usage usage) {

        // prepare specific resource
        String paramName = specificResource.getClass().getSimpleName();
        QName qname = new QName(XJdfConstants.NAMESPACE_JDF20, paramName);
        JAXBElement<SpecificResource> specificResourceJaxB = new JAXBElement(
            qname,
            SpecificResource.class,
            null,
            specificResource
        );

        // create resource
        Resource resource = new Resource();
        resource.setSpecificResource(specificResourceJaxB);

        // create resource set
        ResourceSet resourceSet = new ResourceSet();
        resourceSet.getResource().add(resource);
        resourceSet.setName(paramName);
        resourceSet.setUsage(usage);

        // add resource set to XJDF and return the object
        this.xjdf.getResourceSet().add(resourceSet);
        return resourceSet;
    }

    /**
     * Add a specific resource to the XJDF Document.
     *
     * @param specificResource The specific resource to be added.
     * @param usage            The resource's usage.
     * @param part             The partitioning of the resource.
     * @return The appropriate ResourceSet element for further processing.
     */
    public ResourceSet addResourceSet(@NotNull SpecificResource specificResource, ResourceSet.Usage usage, Part part)
        throws IOException {
        if (part == null) {
            return addResourceSet(specificResource, usage);
        }

        Map<Part, SpecificResource> map = new HashMap<>();
        map.put(part, specificResource);
        return addResourceSet(map, usage);
    }

    /**
     * Add a map of specific resources to the XJDF Document.
     *
     * @param map       Partitioned specific resources as map.
     * @param usage            The resource's usage.
     * @return The appropriate ResourceSet element for further processing.
     */
    public ResourceSet addResourceSet(Map<Part, ? extends SpecificResource> map, ResourceSet.Usage usage)
        throws IOException {
        if (map.size() == 0) {
            throw new IOException("The resource map requries at leaset one entry.");
        }

        // create resource set
        ResourceSet resourceSet = new ResourceSet();
        resourceSet.setUsage(usage);

        for (Part part : map.keySet()) {
            String paramName = map.get(part).getClass().getSimpleName();
            QName qname = new QName(XJdfConstants.NAMESPACE_JDF20, paramName);
            JAXBElement<SpecificResource> specificResourceJaxB = new JAXBElement(
                qname,
                SpecificResource.class,
                null,
                map.get(part)
            );

            Resource resource = new Resource();
            resource.getPart().add(part);
            resource.setSpecificResource(specificResourceJaxB);

            resourceSet.getResource().add(resource);
            resourceSet.setName(paramName);
        }

        // add resource set to XJDF and return the object
        this.xjdf.getResourceSet().add(resourceSet);
        return resourceSet;
    }

    /**
     * Identifies and returns the first resource within the XJDF Document using partition keys.
     *
     * @param resourceType The class of the specific resource.
     * @param part         The given Partition Keys used to identify a particular Resource
     * @return The first Resource identified using partition keys.
     * @throws IllegalAccessException Is thrown in case the partition isn't accessible in Part class.
     */
    public Resource getResourceByPart(Class<? extends SpecificResource> resourceType, Part part)
        throws IllegalAccessException {
        List<ResourceSet> resourceSets = this.xjdf.getResourceSet();
        Resource result = null;

        for (int i = 0; i < resourceSets.size() && result == null; i++) {
            ResourceSet resourceSet = resourceSets.get(i);

            if (resourceType.getSimpleName().equals(resourceSet.getName())) {
                result = PartitionManager.getResourceByPart(resourceSet, part);
            }
        }

        return result;
    }

    /**
     * Identifies and returns the first matching resource within the XJDF Document.
     *
     * @param resourceType The class of the specific resource.
     * @return The first Resource identified.
     * @throws IllegalAccessException Is thrown in case the partition isn't accessible in Part class.
     */
    public Resource getResourceByPart(Class<? extends SpecificResource> resourceType) throws IllegalAccessException {
        return getResourceByPart(resourceType, null);
    }

    /**
     * Identifies and returns the first matching specific resource within the XJDF Document using partition keys.
     *
     * @param resourceType The type of the specific resource.
     * @param part         The given Partition Keys used to identify a particular Resource
     * @return The first specific resource identified using partition keys.
     * @throws IllegalAccessException Is thrown in case the partition isn't accessible in Part class.
     */
    public <T extends SpecificResource> T getSpecificResourceByPart(Class<T> resourceType, Part part)
        throws IllegalAccessException {
        Resource resource = getResourceByPart(resourceType, part);

        return (T) resource.getSpecificResource().getValue();
    }

    /**
     * Identifies and returns the first matching specific resource within the XJDF Document.
     *
     * @param resourceType The class of the specific resource.
     * @return The first specific resource identified using partition keys.
     * @throws IllegalAccessException Is thrown in case the partition isn't accessible in Part class.
     */
    public <T extends SpecificResource> T getSpecificResourceByPart(Class<T> resourceType)
        throws IllegalAccessException {
        return getSpecificResourceByPart(resourceType, null);
    }
}
