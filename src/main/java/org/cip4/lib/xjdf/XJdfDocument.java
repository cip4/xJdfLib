package org.cip4.lib.xjdf;

import org.cip4.lib.xjdf.exception.XJdfInitException;
import org.cip4.lib.xjdf.exception.XJdfParseException;
import org.cip4.lib.xjdf.exception.XJdfValidationException;
import org.cip4.lib.xjdf.partition.PartitionManager;
import org.cip4.lib.xjdf.schema.*;
import org.cip4.lib.xjdf.util.Headers;
import org.cip4.lib.xjdf.xml.XJdfConstants;
import org.cip4.lib.xjdf.xml.XJdfParser;
import org.cip4.lib.xjdf.xml.XJdfValidator;
import org.jetbrains.annotations.NotNull;

import jakarta.xml.bind.JAXBElement;

import javax.xml.namespace.QName;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * This class provides functionality all about XJDF Documents.
 */
public class XJdfDocument {

    private final XJdfParser<XJDF> xjdfParser;

    private final XJdfValidator xJdfValidator;

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
        this(new XJdfParser<XJDF>().readXml(bytes));
    }

    /**
     * Custom Constructor. <br>
     * Accepting an XJDF root node for initializing.
     *
     * @param xjdf The XJDF root node.
     */
    public XJdfDocument(XJDF xjdf) {

        // set instance variables
        this.xjdf = xjdf;
        this.xjdfParser = new XJdfParser<>();
        this.xJdfValidator = new XJdfValidator();

        // set preferred values (if not yet set)
        if(xjdf.getVersion() == null) {
            xjdf.setVersion(XJdfConstants.XJDF_CURRENT_VERSION);
        }

        if(xjdf.getAuditPool() == null) {
            xjdf.setAuditPool(new AuditPool()
                .withAudits(new AuditCreated()
                    .withHeader(Headers.createDefaultHeader()))
            );
        }
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
    public byte[] toXml() throws XJdfParseException, XJdfValidationException {
        return toXml(true);
    }

    /**
     * Returns the current XJDF Document as XML byte array.
     *
     * @param validate 'false' in case validation should be skipped.
     * @return The XJDF Document as XML byte array.
     */
    public byte[] toXml(boolean validate) throws XJdfParseException, XJdfValidationException {

        // write xml
        final byte[] xml = xjdfParser.writeXml(this.xjdf);

        // validate
        if(validate) {
            xJdfValidator.validate(xml);
        }

        // return result
        return xml;
    }

    /**
     * Add a general id to the XJDF Document.
     * @param generalID The GeneralID to be added.
     */
    public void addGeneralID(GeneralID generalID) {
        addGeneralIDs(generalID);
    }

    /**
     * Add multiple general ids to the XJDF Document.
     * @param generalIDs The GeneralIDs to be added.
     */
    public void addGeneralIDs(GeneralID... generalIDs) {
        xjdf.getGeneralID().addAll(Arrays.asList(generalIDs));
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
     * Returns the AuditCreated's header element of the XJDF Document.
     * @return The AuditCreated header element.
     */
    public Header getAuditCreated() {

        // create audit pool if no present
        if (xjdf.getAuditPool() != null) {
            for(Audit audit: xjdf.getAuditPool().getAudits()) {
                if(audit instanceof AuditCreated) {
                    AuditCreated auditCreated = (AuditCreated) audit;
                    return auditCreated.getHeader();
                }
            }
        }

        // return null if not present
        return null;
    }

    /**
     * Append final products to the XJDF Document.
     *
     * @param finalProducts The final products to be appended.
     */
    public void addFinalProduct(FinalProduct... finalProducts) {

        // create product list if noy present
        if (xjdf.getProductList() == null) {
            xjdf.setProductList(new ProductList());
        }

        // add product parts
        for(FinalProduct finalProduct: finalProducts) {
            xjdf.getProductList().withProduct(finalProduct.getProductParts());
        }
    }

    /**
     * Returns a list of all final products contained by the XJDF Document.
     * @return List of final products.
     */
    public List<FinalProduct> getFinalProducts() {
        List<FinalProduct> finalProducts = new ArrayList<>();

        if(xjdf.getProductList() != null) {
            List<Product> productParts = xjdf.getProductList().getProduct();

            for (Product product : productParts) {
                if(product.isIsRoot()) {
                    finalProducts.add(new FinalProduct(product, productParts));
                }
            }
        }

        return finalProducts;
    }

    /**
     * Add a specific resource to the XJDF Document.
     *
     * @param specificResource The specific resource to be added.
     * @param usage            The resource's usage.
     * @param parts             The partitioning of the resource.
     * @return The appropriate ResourceSet element for further processing.
     */
    public ResourceSet addResourceSet(@NotNull SpecificResource specificResource, ResourceSet.Usage usage, Part... parts) {
        Map<Part[], SpecificResource> map = new HashMap<>();
        map.put(parts, specificResource);
        return addResourceSet(map, usage);
    }

    /**
     * Add a map of specific resources to the XJDF Document.
     *
     * @param map       Partitioned specific resources as map.
     * @param usage            The resource's usage.
     * @return The appropriate ResourceSet element for further processing.
     */
    public ResourceSet addResourceSet(Map<Part[], ? extends SpecificResource> map, ResourceSet.Usage usage) {
        if (map.size() == 0) {
            throw new IllegalArgumentException("The resource map requries at leaset one entry.");
        }

        // create resource set
        ResourceSet resourceSet = new ResourceSet();
        resourceSet.setUsage(usage);

        for (Part[] parts : map.keySet()) {
            String paramName = map.get(parts).getClass().getSimpleName();
            QName qname = new QName(XJdfConstants.NAMESPACE_JDF20, paramName);
            JAXBElement<SpecificResource> specificResourceJaxB = new JAXBElement(
                qname,
                SpecificResource.class,
                null,
                map.get(parts)
            );

            Resource resource = new Resource();

            for(Part part: parts) {
                resource.getPart().add(part);
            }
            resource.setSpecificResource(specificResourceJaxB);

            resourceSet.getResource().add(resource);
            resourceSet.setName(paramName);
        }

        // add resource set to XJDF and return the object
        this.xjdf.getResourceSet().add(resourceSet);
        return resourceSet;
    }

    /**
     * Returns the generic resources of a resource set for a given specific resource.
     * @param resourceType the specific resource.
     * @return List of resources of the resource set.
     */
    public List<Resource> getResourcesByPartKeys(Class<? extends SpecificResource> resourceType, String... partKeys) {
        List<ResourceSet> resourceSets = this.xjdf.getResourceSet();
        List<Resource> result = null;

        for (int i = 0; i < resourceSets.size() && result == null; i++) {
            ResourceSet resourceSet = resourceSets.get(i);

            if (resourceType.getSimpleName().equals(resourceSet.getName())) {
                result = PartitionManager.getResourcesByPartKeys(resourceSet, partKeys);
            }
        }

        return result;
    }

    /**
     * Returns the generic resources of a resource set for a given specific resource.
     * @param resourceType the specific resource.
     * @return List of resources of the resource set.
     */
    public <T extends SpecificResource> List<T> getSpecificResourcesByPartKeys(Class<T> resourceType, String... partKeys) {
        List<Resource> resources = getResourcesByPartKeys(resourceType, partKeys);

        if(resources == null) {
            return null;
        }

        return resources.stream()
                .map(resource -> (T) resource.getSpecificResource().getValue())
                .collect(Collectors.toList());
    }

    /**
     * Identifies and returns the first resource within the XJDF Document using partition keys.
     *
     * @param resourceType The class of the specific resource.
     * @param part         The given Partition Keys used to identify a particular Resource
     * @return The first Resource identified using partition keys.
     */
    public Resource getResourceByPart(Class<? extends SpecificResource> resourceType, Part part) {
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
     */
    public Resource getResourceByPart(Class<? extends SpecificResource> resourceType) {
        return getResourceByPart(resourceType, null);
    }

    /**
     * Identifies and returns the first matching specific resource within the XJDF Document using partition keys.
     *
     * @param resourceType The type of the specific resource.
     * @param part         The given Partition Keys used to identify a particular Resource
     * @return The first specific resource identified using partition keys.
     */
    public <T extends SpecificResource> T getSpecificResourceByPart(Class<T> resourceType, Part part) {
        Resource resource = getResourceByPart(resourceType, part);

        return resource == null ? null : (T) resource.getSpecificResource().getValue();
    }

    /**
     * Identifies and returns the first matching specific resource within the XJDF Document.
     *
     * @param resourceType The class of the specific resource.
     * @return The first specific resource identified using partition keys.
     */
    public <T extends SpecificResource> T getSpecificResourceByPart(Class<T> resourceType) {
        return getSpecificResourceByPart(resourceType, null);
    }

    @Override
    public String toString() {
        try {
            return new String(toXml(false));
        } catch (Exception e) {
            return "Error creating an XML preview.";
        }
    }
}
