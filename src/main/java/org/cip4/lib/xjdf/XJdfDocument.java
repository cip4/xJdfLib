package org.cip4.lib.xjdf;

import org.apache.commons.lang3.StringUtils;
import org.cip4.lib.xjdf.exception.XJdfDocumentException;
import org.cip4.lib.xjdf.exception.XJdfParseException;
import org.cip4.lib.xjdf.exception.XJdfValidationException;
import org.cip4.lib.xjdf.schema.*;
import org.cip4.lib.xjdf.type.DateTime;
import org.cip4.lib.xjdf.type.IntegerList;
import org.cip4.lib.xjdf.util.Headers;
import org.cip4.lib.xjdf.util.Partitions;
import org.cip4.lib.xjdf.xml.XJdfParser;
import org.cip4.lib.xjdf.xml.XJdfValidator;
import org.jetbrains.annotations.NotNull;

import jakarta.xml.bind.JAXBElement;

import javax.xml.namespace.QName;
import java.text.ParseException;
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
        if (xjdf.getVersion() == null) {
            xjdf.setVersion(XJdfConstants.XJDF_CURRENT_VERSION);
        }

        // create audit created (if not yet created)
        if (xjdf.getAuditPool() == null) {
            xjdf.setAuditPool(new AuditPool()
                    .withAudits(new AuditCreated()
                            .withHeader(Headers.createDefaultHeader()))
            );
        }
    }

    /**
     * Sets the documents descriptive name.
     *
     * @param descriptiveName The human-readable job description.
     */
    public void setDescriptiveName(String descriptiveName) {
        getXJdf().setDescriptiveName(descriptiveName);
    }

    /**
     * Getter of the descriptive name.
     *
     * @return Returns the human-readable job description.
     */
    public String getDescriptiveName() {
        return getXJdf().getDescriptiveName();
    }

    /**
     * Sets the documents job id.
     *
     * @param jobID The document's job id.
     */
    public void setJobID(String jobID) {
        getXJdf().setJobID(jobID);
    }

    /**
     * Getter of the job id.
     *
     * @return The job id.
     */
    public String getJobID() {
        return getXJdf().getJobID();
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
        if (validate) {
            xJdfValidator.validate(xml);
        }

        // return result
        return xml;
    }

    @Override
    public String toString() {
        try {
            return new String(toXml(false));
        } catch (Exception e) {
            return "Error creating an XML preview.";
        }
    }

    /**
     * Returns the combined process (types) specified in the XJDF Document.
     *
     * @return The combined process specified in this document.
     */
    public List<String> getCombinedProcess() {
        return Collections.unmodifiableList(this.xjdf.getTypes());
    }

    /**
     * Returns the combined-process-index of a given process name.
     *
     * @return The combined process index as integer.
     */
    public int getCombinedProcessIndex(String processName) throws XJdfDocumentException {

        // check input
        if (StringUtils.isEmpty(processName))
            throw new IllegalArgumentException("ProcessName cannot be null or empty.");

        // find matching process names
        List<String> matchingProcessNames = getCombinedProcess().stream()
                .filter(entry -> StringUtils.equalsIgnoreCase(entry, processName))
                .collect(Collectors.toList());

        // throw exception in case process name is ambiguous
        if (matchingProcessNames.size() > 1) {
            throw new XJdfDocumentException("ProcessName '" + processName + "' is not unique.");
        } else if (matchingProcessNames.size() == 0) {
            throw new XJdfDocumentException("ProcessName '" + processName + "' has not been found.");
        }

        // return
        return getCombinedProcess().indexOf(matchingProcessNames.get(0));
    }

    /**
     * Add a general id to the XJDF Document.
     *
     * @param generalID The GeneralID to be added.
     */
    public void addGeneralID(GeneralID generalID) {
        addGeneralIDs(generalID);
    }

    /**
     * Add a general id to the XJDF Document.
     *
     * @param idUsage The IDUsage value.
     * @param idValue The IDValue value.
     */
    public void addGeneralID(String idUsage, String idValue) {
        addGeneralIDs(
                new GeneralID()
                        .withIDUsage(idUsage)
                        .withIDValue(idValue)
        );
    }

    /**
     * Add a general id to the XJDF Document.
     *
     * @param idUsage The IDUsage value.
     * @param idValue The IDValue value.
     */
    public void addGeneralID(String idUsage, Object idValue) {
        addGeneralID(idUsage, idValue.toString());
    }

    /**
     * Add multiple general ids to the XJDF Document.
     *
     * @param generalIDs The GeneralIDs to be added.
     */
    public void addGeneralIDs(GeneralID... generalIDs) {

        // add ids
        xjdf.getGeneralID().addAll(Arrays.asList(generalIDs));

        // sort
        xjdf.getGeneralID().sort(Comparator.comparing(GeneralID::getIDUsage));
    }

    /**
     * Return GeneralID object by IDUsage value.
     *
     * @param idUsage The IDUsage value.
     * @return The GeneralID object.
     */
    public GeneralID getGeneralID(String idUsage) {

        // filter general ids by idusage
        List<GeneralID> generalIDs = xjdf.getGeneralID().stream()
                .filter(generalID -> Objects.equals(generalID.getIDUsage(), idUsage))
                .collect(Collectors.toList());

        // validate result
        if (generalIDs.size() > 1) {
            throw new IllegalArgumentException("IDUsage '" + idUsage + "' is not unique.");
        }

        // return result
        return generalIDs.size() == 0 ? null : generalIDs.get(0);
    }

    /**
     * Return the typed value of a GeneralID.
     *
     * @param idUsage The IDUsage value.
     * @param type    The target type of the IDValue value.
     * @return The typed value.
     */
    public <T> T getGeneralID(String idUsage, Class<T> type) throws ParseException {

        // get general id
        GeneralID generalID = getGeneralID(idUsage);

        if (generalID == null) {
            return null;
        }

        // parse value
        T value;

        if (String.class == type) {
            value = (T) generalID.getIDValue();
        } else if (Float.class == type) {
            value = (T) Float.valueOf(generalID.getIDValue());
        } else if (Double.class == type) {
            value = (T) Double.valueOf(generalID.getIDValue());
        } else if (Integer.class == type) {
            value = (T) Integer.valueOf(generalID.getIDValue());
        } else if (Boolean.class == type) {
            value = (T) Boolean.valueOf(generalID.getIDValue());
        } else if (DateTime.class == type) {
            value = (T) new DateTime(generalID.getIDValue());
        } else {
            throw new UnsupportedOperationException("Type '" + type.toString() + " is not supported.");
        }

        // return parsed value
        return value;
    }

    /**
     * Remove a GeneralID object by IDUsage.
     *
     * @param idUsage The generalId object's idUsage value.
     * @return true in case the document had contained such a GeneralID.
     */
    public boolean removeGeneralID(String idUsage) {
        return removeGeneralID(
                getGeneralID(idUsage)
        );
    }

    /**
     * Remove a GeneralID object.
     *
     * @param generalID The generalId object to be removed.
     * @return true in case the document had contained such a GeneralID.
     */
    public boolean removeGeneralID(GeneralID generalID) {
        return xjdf.getGeneralID().remove(generalID);
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
     *
     * @return The AuditCreated header element.
     */
    public Header getAuditCreated() {

        // create audit pool if no present
        if (xjdf.getAuditPool() != null) {
            for (Audit audit : xjdf.getAuditPool().getAudits()) {
                if (audit instanceof AuditCreated) {
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
        if (finalProducts == null) return;

        // create product list if noy present
        if (xjdf.getProductList() == null) {
            xjdf.setProductList(new ProductList());
        }

        // add product parts
        for (FinalProduct finalProduct : finalProducts) {
            xjdf.getProductList().withProduct(finalProduct.getProductParts());
        }
    }

    /**
     * Returns a list of all final products contained by the XJDF Document.
     *
     * @return List of final products.
     */
    public List<FinalProduct> getFinalProducts() {
        List<FinalProduct> finalProducts = new ArrayList<>();

        if (xjdf.getProductList() != null) {
            List<Product> productParts = xjdf.getProductList().getProduct();

            for (Product product : productParts) {
                if (product.isIsRoot()) {
                    finalProducts.add(new FinalProduct(product, productParts));
                }
            }
        }

        return finalProducts;
    }

    /**
     * Returns a final products identifierd by its product id.
     *
     * @return The final product if exists. Otherwise null.
     */
    public FinalProduct getFinalProduct(String id) {
        return id == null
                ? null
                : getFinalProducts().stream()
                .filter(finalProduct -> Objects.equals(finalProduct.getId(), id))
                .findFirst()
                .orElse(null);
    }

    /**
     * Add resource set to the xjdf document.
     *
     * @param resourceType The type of the resource set.
     * @param usage        The usgae of the resource set.
     * @return The newly created resource set element.
     */
    public ResourceSet addResourceSet(@NotNull Class<? extends SpecificResource> resourceType, ResourceSet.Usage usage) {
        return addResourceSet(resourceType, usage, null, (IntegerList) null);
    }

    /**
     * Add resource set to the xjdf document.
     *
     * @param resourceType The type of the resource set.
     * @param usage        The usgae of the resource set.
     * @param processUsage The process usage of the resource set
     * @return The newly created resource set element.
     */
    public ResourceSet addResourceSet(@NotNull Class<? extends SpecificResource> resourceType, ResourceSet.Usage usage, String processUsage) {
        return addResourceSet(resourceType, usage, processUsage, (IntegerList) null);
    }

    /**
     * Add resource set to the xjdf document.
     *
     * @param resourceType The type of the resource set.
     * @param usage        The usgae of the resource set.
     * @return The newly created resource set element.
     */
    public ResourceSet addResourceSet(@NotNull Class<? extends SpecificResource> resourceType, ResourceSet.Usage usage, String processUsage, String processName) throws XJdfDocumentException {
        return addResourceSet(resourceType, usage, processUsage, new IntegerList(getCombinedProcessIndex(processName)));
    }

    /**
     * Add resource set to the xjdf document.
     *
     * @param resourceType           The type of the resource set.
     * @param usage                  The usgae of the resource set.
     * @param processUsage           The process usage of the resource set
     * @param combinedProcessIndices The combined-process-index list.
     * @return The newly created resource set element.
     */
    public ResourceSet addResourceSet(@NotNull Class<? extends SpecificResource> resourceType, ResourceSet.Usage usage, String processUsage, IntegerList combinedProcessIndices) {

        // create resource set element
        ResourceSet resourceSet = new ResourceSet();
        resourceSet.setUsage(usage);
        resourceSet.setProcessUsage(processUsage);
        resourceSet.setCombinedProcessIndex(combinedProcessIndices);
        resourceSet.setName(resourceType.getSimpleName());

        // add to document
        addResourceSet(resourceSet);

        // return resource set
        return resourceSet;
    }

    /**
     * Add resource set to the xjdf document.
     *
     * @param resourceSet The resource set to be added.
     */
    public void addResourceSet(ResourceSet resourceSet) {

        if(resourceSet == null) {
            return;
        }

        // add to document
        xjdf.getResourceSet().add(resourceSet);

        // sort resource sets
        Comparator<ResourceSet> usageComparator = (rs1, rs2) -> StringUtils.compare(
                rs1.getUsage() == null ? null : rs1.getUsage().name(),
                rs2.getUsage() == null ? null : rs2.getUsage().name()
        );

        Comparator<ResourceSet> combinedProcessIndexComparator = (rs1, rs2) -> StringUtils.compare(
                rs1.getCombinedProcessIndex() == null ? null : rs1.getCombinedProcessIndex().toString(),
                rs2.getCombinedProcessIndex() == null ? null : rs2.getCombinedProcessIndex().toString()
        );

        xjdf.getResourceSet().sort(Comparator.comparing(ResourceSet::getName)
                .thenComparing(usageComparator)
                .thenComparing(combinedProcessIndexComparator)
        );
    }

    /**
     * Remove a resource set from xjdf document.
     *
     * @param resourceType The resource type of the resource set
     * @return true if this list contained the specified element
     */
    public boolean removeResourceSet(Class<? extends SpecificResource> resourceType) throws XJdfDocumentException {
        return removeResourceSet(
                getResourceSet(resourceType)
        );
    }

    /**
     * Remove a resource set from xjdf document.
     *
     * @param resourceType The resource type of the resource set
     * @param usage        The usage of the resource set
     * @param processUsage The process usage of the resource set
     * @param processName  The process name of the resource set
     * @return true if this list contained the specified element
     */
    public boolean removeResourceSet(Class<? extends SpecificResource> resourceType, ResourceSet.Usage usage, String processUsage, String processName) throws XJdfDocumentException {
        return removeResourceSet(
                getResourceSet(resourceType, usage, processUsage, processName)
        );
    }

    /**
     * Remove a resource set from xjdf document.
     *
     * @param resourceType           The resource type of the resource set
     * @param usage                  The usage of the resource set
     * @param processUsage           The process usage of the resource set
     * @param combinedProcessIndices The combined process indexes of the resource set
     * @return true if this list contained the specified element
     */
    public boolean removeResourceSet(Class<? extends SpecificResource> resourceType, ResourceSet.Usage usage, String processUsage, IntegerList combinedProcessIndices) throws XJdfDocumentException {
        return removeResourceSet(
                getResourceSet(resourceType, usage, processUsage, combinedProcessIndices)
        );
    }

    /**
     * Remove a resource set from xjdf document.
     *
     * @param resourceSet The resource set to be removed.
     * @return true if this list contained the specified element
     */
    public boolean removeResourceSet(ResourceSet resourceSet) {
        return this.xjdf.getResourceSet().remove(resourceSet);
    }

    /**
     * Add a specific resource to a given resource set.
     *
     * @param resourceSet      The given resource set.
     * @param specificResource The specific resource to be added.
     * @return The resource object.
     * @throws XJdfDocumentException Thrown in case of validation issues.
     */
    public Resource addSpecificResource(ResourceSet resourceSet, SpecificResource specificResource) throws XJdfDocumentException {
        return addSpecificResource(resourceSet, specificResource, List.of());
    }

    /**
     * Add a specific resource to a given resource set.
     *
     * @param resourceSet      The given resource set.
     * @param specificResource The specific resource to be added.
     * @param part             A single part tag.
     * @return The resource object.
     * @throws XJdfDocumentException Thrown in case of validation issues.
     */
    public Resource addSpecificResource(ResourceSet resourceSet, SpecificResource specificResource, Part part) throws XJdfDocumentException {
        return addSpecificResource(resourceSet, specificResource, List.of(part));
    }

    /**
     * Add a specific resource to a given resource set.
     *
     * @param resourceSet      The given resource set.
     * @param specificResource The specific resource to be added.
     * @param parts            Partitioning of the specific resource.
     * @return The resource object.
     */
    public Resource addSpecificResource(ResourceSet resourceSet, SpecificResource specificResource, List<Part> parts) {

        // resource type validation
        if (!Objects.equals(resourceSet.getName(), specificResource.getClass().getSimpleName())) {
            throw new IllegalArgumentException("Resource type does not match ResourceSet type.");
        }

        // create resource element and add specific one
        String paramName = specificResource.getClass().getSimpleName();
        QName qname = new QName(XJdfConstants.NAMESPACE_JDF20, paramName);
        JAXBElement<SpecificResource> specificResourceJaxB = new JAXBElement(
                qname,
                SpecificResource.class,
                null,
                specificResource
        );

        Resource resource = new Resource();

        for (Part part : parts) {
            resource.getPart().add(part);
        }

        resource.setSpecificResource(specificResourceJaxB);

        // add and return resource
        return addResource(resourceSet, resource);
    }

    /**
     * Add a resource to a given resource set.
     * @param resourceSet The given resource set.
     * @param resource The resource to be added.
     * @return The resource.
     */
    public Resource addResource(ResourceSet resourceSet, Resource resource) {

        // resource type validation
        if (!Objects.equals(resourceSet.getName(), resource.getSpecificResource().getValue().getClass().getSimpleName())) {
            throw new IllegalArgumentException("Resource type does not match ResourceSet type.");
        }

        // add resource
        resourceSet.getResource().add(resource);

        // return resource
        return resource;
    }

    /**
     * Returns the resource set of a specific resource.
     *
     * @param resourceType The resource type of the specific resource
     * @return The resource set matching the parameters.
     */
    public ResourceSet getResourceSet(Class<? extends SpecificResource> resourceType) throws XJdfDocumentException {
        return getResourceSet(resourceType, null, null, (IntegerList) null);
    }

    /**
     * Returns the resource set of a specific resource.
     *
     * @param resourceType The resource type of the resource set
     * @param usage        The usage of the resource set
     * @return The resource set matching the parameters.
     */
    public ResourceSet getResourceSet(Class<? extends SpecificResource> resourceType, ResourceSet.Usage usage) throws XJdfDocumentException {
        return getResourceSet(resourceType, usage, null, (IntegerList) null);
    }

    /**
     * Returns the resource set of a specific resource.
     *
     * @param resourceType The resource type of the resource set
     * @param usage        The usage of the resource set
     * @param processUsage The process usage of the resource set
     * @return The resource set matching the parameters.
     */
    public ResourceSet getResourceSet(Class<? extends SpecificResource> resourceType, ResourceSet.Usage usage, String processUsage) throws XJdfDocumentException {
        return getResourceSet(resourceType, usage, processUsage, (IntegerList) null);
    }

    /**
     * Returns the resource set of a specific resource.
     *
     * @param resourceType The resource type of the resource set
     * @param usage        The usage of the resource set
     * @param processUsage The process usage of the resource set
     * @param processName  The linked process name (via CombinedProcessIndex).
     * @return The resource set matching the parameters.
     */
    public ResourceSet getResourceSet(Class<? extends SpecificResource> resourceType, ResourceSet.Usage usage, String processUsage, String processName) throws XJdfDocumentException {
        return getResourceSet(resourceType, usage, processUsage, new IntegerList(getCombinedProcessIndex(processName)));
    }

    /**
     * Returns the matching resource set.
     *
     * @param resourceType           The resource type of the resource set
     * @param usage                  The usage of the resource set
     * @param processUsage           The process usage of the resource set
     * @param combinedProcessIndices The combined process indexes of the resource set
     * @return The matching resource set
     * @throws XJdfDocumentException Thrown in case the resource set cannot be identified uniquely
     */
    public ResourceSet getResourceSet(Class<? extends SpecificResource> resourceType, ResourceSet.Usage usage, String processUsage, IntegerList combinedProcessIndices) throws XJdfDocumentException {

        // find resource set
        List<ResourceSet> resourceSets = this.xjdf.getResourceSet().stream()
                .filter(resourceSet -> Objects.equals(resourceSet.getName(), resourceType.getSimpleName()))
                .filter(resourceSet -> usage == null || Objects.equals(resourceSet.getUsage(), usage))
                .filter(resourceSet -> Objects.equals(resourceSet.getProcessUsage(), processUsage))
                .filter(resourceSet -> combinedProcessIndices == null || Objects.equals(resourceSet.getCombinedProcessIndex(), combinedProcessIndices))
                .collect(Collectors.toList());

        // ambiguity check
        if (resourceSets.size() > 1) {
            throw new XJdfDocumentException("ResourceSet '" + resourceType.getSimpleName() + "' is ambiguous.");
        }

        // return result
        return resourceSets.size() == 0 ? null : resourceSets.get(0);
    }


    /**
     * Return the list of parts for a given resource set.
     *
     * @param resourceType The resource type of the resource set
     * @return List of part elements in the resource set.
     */
    public List<Part> getParts(Class<? extends SpecificResource> resourceType) throws XJdfDocumentException {
        return getParts(getResourceSet(resourceType, null, null, (IntegerList) null));
    }

    /**
     * Return the list of parts for a given resource set.
     *
     * @param resourceType The resource type of the resource set
     * @param usage        The usage of the resource set
     * @return List of part elements in the resource set.
     */
    public List<Part> getParts(Class<? extends SpecificResource> resourceType, ResourceSet.Usage usage) throws XJdfDocumentException {
        return getParts(getResourceSet(resourceType, usage, null, (IntegerList) null));
    }

    /**
     * Return the list of parts for a given resource set.
     *
     * @param resourceType The resource type of the resource set
     * @param usage        The usage of the resource set
     * @param processUsage The process usage of the resource set
     * @param processName  The combined process indexes of the resource set
     * @return List of part elements in the resource set.
     */
    public List<Part> getParts(Class<? extends SpecificResource> resourceType, ResourceSet.Usage usage, String processUsage, String processName) throws XJdfDocumentException {
        return getParts(getResourceSet(resourceType, usage, processUsage, new IntegerList(getCombinedProcessIndex(processName))));
    }

    /**
     * Return the list of parts for a given resource set.
     *
     * @param resourceSet The resource set to be analyzed.
     * @return List of part elements in the resource set.
     */
    public List<Part> getParts(ResourceSet resourceSet) {
        List<Part> parts = new ArrayList<>();

        resourceSet.getResource().forEach(resource -> {
            if (resource.getPart().size() == 0) {
                parts.add(null);
            } else {
                parts.addAll(resource.getPart());
            }
        });

        return parts;
    }

    /**
     * Returns the generic resources of a resource set for a given specific resource by part keys.
     *
     * @param resourceType the specific resource.
     * @param part         The given Partition Keys used to identify a particular Resource
     * @return List of resources of the resource set matching the part keys.
     */
    public List<Resource> getResources(Class<? extends SpecificResource> resourceType, Part part) throws XJdfDocumentException {
        ResourceSet resourceSet = getResourceSet(resourceType);
        return getResources(resourceSet, part);
    }

    /**
     * Returns the generic resources of a given resource set by part keys.
     *
     * @param resourceSet the given resource set.
     * @param part         The given Partition Keys used to identify a particular Resource
     * @return List of resources of the resource set matching the part keys.
     */
    public List<Resource> getResources(ResourceSet resourceSet, Part part) {
        List<Resource> result = null;

        if (resourceSet != null) {
            result = Partitions.getResourcesByPart(resourceSet, part);
        }

        return result;
    }

    /**
     * Identifies and returns the first matching specific resource within a resource set using partition keys.
     *
     * @param resourceType The class of the specific resource.
     * @param part         The given Partition Keys used to identify a particular Resource
     * @return The first Resource identified using partition keys.
     */
    public Resource getResource(Class<? extends SpecificResource> resourceType, Part part) throws XJdfDocumentException {
        ResourceSet resourceSet = getResourceSet(resourceType);
        return getResource(resourceSet, part);
    }

    /**
     * Identifies and returns the first matching specific resource within a resource set using partition keys.
     *
     * @param resourceSet The given resource set
     * @param part        The given Partition Keys used to identify a particular Resource
     * @return The first Resource identified using partition keys within a given resource set.
     */
    public Resource getResource(ResourceSet resourceSet, Part part) {
        Resource result = null;

        if (resourceSet != null) {
            result = Partitions.getResourceByPart(resourceSet, part);
        }

        return result;
    }

    /**
     * Returns a resource found by params.
     *
     * @param resourceType The resource type of the resource set
     * @return The resource object.
     */
    public Resource getResource(Class<? extends SpecificResource> resourceType) throws XJdfDocumentException {
        return getResource(resourceType, null, null, (IntegerList) null);
    }

    /**
     * Returns a resource found by params.
     *
     * @param resourceType The resource type of the resource set
     * @param usage        The usage of the resource set
     * @return The resource object.
     */
    public Resource getResource(Class<? extends SpecificResource> resourceType, ResourceSet.Usage usage) throws XJdfDocumentException {
        return getResource(resourceType, usage, null, (IntegerList) null);
    }

    /**
     * Returns a resource found by params.
     *
     * @param resourceType The resource type of the resource set
     * @param usage        The usage of the resource set
     * @param processUsage The process usage of the resource set
     * @param processName  The combined process indexes of the resource set
     * @return The resource object.
     */
    public Resource getResource(Class<? extends SpecificResource> resourceType, ResourceSet.Usage usage, String processUsage, String processName) throws XJdfDocumentException {
        return getResource(resourceType, usage, processUsage, new IntegerList(getCombinedProcessIndex(processName)));
    }

    /**
     * Returns a resource found by params.
     *
     * @param resourceType           The resource type of the resource set
     * @param usage                  The usage of the resource set
     * @param processUsage           The process usage of the resource set
     * @param combinedProcessIndices The combined process indexes of the resource set
     * @return The resource object.
     */
    public Resource getResource(Class<? extends SpecificResource> resourceType, ResourceSet.Usage usage, String processUsage, IntegerList combinedProcessIndices) throws XJdfDocumentException {

        // find resource set
        ResourceSet resourceSet = getResourceSet(resourceType, usage, processUsage, combinedProcessIndices);

        if (resourceSet == null) {
            return null;
        }

        // ambiguity check
        if (resourceSet.getResource().size() > 1) {
            throw new XJdfDocumentException("Resource '" + resourceType.getSimpleName() + "' is ambiguous.");
        }

        // return result
        return resourceSet.getResource().size() == 0 ? null : resourceSet.getResource().get(0);
    }

    /**
     * Returns a resource found by its unique identifier (ID or ExternalID).
     *
     * @param id The resource's unique identifier (ID or ExternalID).
     * @return The resource object.
     */
    public Resource getResource(String id) {
        List<Resource> matchingResources = new ArrayList<>();

        // find matching resources
        this.xjdf.getResourceSet().forEach(resourceSet -> resourceSet.getResource()
                .forEach(resource -> {
                    if (Objects.equals(resource.getID(), id) || Objects.equals(resource.getExternalID(), id)) {
                        matchingResources.add(resource);
                    }
                })
        );

        // validate result
        if (matchingResources.size() > 1) {
            throw new IllegalArgumentException("Multiple matching resources has been found. ID must be unique within the XJDF Document.");
        }

        // return result
        return matchingResources.size() == 1 ? matchingResources.get(0) : null;
    }

    /**
     * Remove resource from a given resource set by part.
     *
     * @param resourceSet The resource set
     * @param part        The partitioning of the resource to be deleted.
     * @return true in case the resource set contained such an elements
     */
    public boolean removeResource(ResourceSet resourceSet, Part part) {
        Resource resource = getResource(resourceSet, part);
        return resourceSet.getResource().remove(resource);
    }

    /**
     * Returns the specific resources of a resource set for given partition keys
     *
     * @param resourceType the specific resource.
     * @param part     The given partition
     * @return List of resources of the resource set.
     */
    public <T extends SpecificResource> List<T> getSpecificResources(Class<T> resourceType, Part part) throws XJdfDocumentException {
        ResourceSet resourceSet = getResourceSet(resourceType);
        return getSpecificResources(resourceSet, part);
    }

    /**
     * Returns the specific resources of a resource set for given partition keys
     *
     * @param resourceSet the resource set.
     * @param part    The given partition
     * @return List of resources of the resource set.
     */
    public <T extends SpecificResource> List<T> getSpecificResources(ResourceSet resourceSet, Part part) {
        List<Resource> resources = getResources(resourceSet, part);

        if (resources == null) {
            return null;
        }

        return resources.stream()
                .map(resource -> (T) resource.getSpecificResource().getValue())
                .collect(Collectors.toList());
    }

    /**
     * Identifies and returns the first matching specific resource within a resource set using partition keys.
     *
     * @param resourceType The type of the specific resource.
     * @param part         The given Partition Keys used to identify a particular Resource
     * @return The first specific resource identified using partition keys.
     */
    public <T extends SpecificResource> T getSpecificResource(Class<T> resourceType, Part part) throws XJdfDocumentException {
        ResourceSet resourceSet = getResourceSet(resourceType);
        return getSpecificResource(resourceSet, part);

    }

    /**
     * Identifies and returns the first matching specific resource within a resource set using partition keys.
     *
     * @param resourceSet The resource set.
     * @param part        The given Partition Keys used to identify a particular Resource
     * @return The first specific resource identified using partition keys.
     */
    public <T extends SpecificResource> T getSpecificResource(ResourceSet resourceSet, Part part) throws XJdfDocumentException {
        Resource resource = getResource(resourceSet, part);

        return resource == null ? null : (T) resource.getSpecificResource().getValue();
    }

    /**
     * Returns a specific resource found by id.
     *
     * @param resourceId The resource's unique identifier.
     * @return The specific resource object.
     */
    public <T extends SpecificResource> T getSpecificResource(String resourceId) {
        Resource resource = getResource(resourceId);
        return resource == null ? null : (T) resource.getSpecificResource().getValue();
    }

    /**
     * Identifies and returns the first matching specific resource within the given resource set.
     *
     * @param resourceType The class of the specific resource.
     * @return The first specific resource identified using partition keys.
     */
    public <T extends SpecificResource> T getSpecificResource(Class<T> resourceType) throws XJdfDocumentException {
        return getSpecificResource(resourceType, null, null, (IntegerList) null);
    }

    /**
     * Returns a specific resource found by params.
     *
     * @param resourceType The resource type of the resource set
     * @param usage        The usage of the resource set
     * @return The specific resource object.
     */
    public <T extends SpecificResource> T getSpecificResource(Class<T> resourceType, ResourceSet.Usage usage) throws XJdfDocumentException {
        return getSpecificResource(resourceType, usage, null, (IntegerList) null);
    }

    /**
     * Returns a specific resource found by params.
     *
     * @param resourceType The resource type of the resource set
     * @param usage        The usage of the resource set
     * @param processUsage The process usage of the resource set
     * @param processName  The combined process indexes of the resource set
     * @return The specific resource object.
     */
    public <T extends SpecificResource> T getSpecificResource(Class<T> resourceType, ResourceSet.Usage usage, String processUsage, String processName) throws XJdfDocumentException {
        return getSpecificResource(resourceType, usage, processUsage, new IntegerList(getCombinedProcessIndex(processName)));
    }

    /**
     * Returns a specific resource found by params.
     *
     * @param resourceType           The resource type of the resource set
     * @param usage                  The usage of the resource set
     * @param processUsage           The process usage of the resource set
     * @param combinedProcessIndices The combined process indexes of the resource set
     * @return The specific resource object.
     */
    public <T extends SpecificResource> T getSpecificResource(Class<T> resourceType, ResourceSet.Usage usage, String processUsage, IntegerList combinedProcessIndices) throws XJdfDocumentException {
        Resource resource = getResource(resourceType, usage, processUsage, combinedProcessIndices);
        return resource == null ? null : (T) resource.getSpecificResource().getValue();
    }

    /**
     * Returns the PartAmount of the first matching specific resource within a resource set using partition keys.
     *
     * @param resourceSet The given resource set
     * @param part        The given Partition Keys used to identify a particular Resource
     * @return The PartAmount of the first Resource identified using partition keys within a given resource set.
     */
    public PartAmount getPartAmount(ResourceSet resourceSet, Part part) throws XJdfDocumentException {
        Resource resource = getResource(resourceSet, part);
        return getPartAmount(resource);
    }

    /**
     * Returns the PartAmount of the first matching specific resource within a resource set using partition keys.
     *
     * @param resourceType The class of the specific resource.
     * @param part         The given Partition Keys used to identify a particular Resource
     * @return The first Resource identified using partition keys.
     */
    public PartAmount getPartAmount(Class<? extends SpecificResource> resourceType, Part part) throws XJdfDocumentException {
        Resource resource = getResource(resourceType, part);
        return getPartAmount(resource);
    }

    /**
     * Returns the PartAmount of the resource found by params .
     *
     * @param resourceType The resource type of the resource set
     * @return The PartAmount of the identified resource.
     */
    public PartAmount getPartAmount(Class<? extends SpecificResource> resourceType) throws XJdfDocumentException {
        return getPartAmount(resourceType, null, null, (IntegerList) null);
    }

    /**
     * Returns the PartAmount of the resource found by params .
     *
     * @param resourceType The resource type of the resource set
     * @param usage        The usage of the resource set
     * @return The PartAmount of the identified resource.
     */
    public PartAmount getPartAmount(Class<? extends SpecificResource> resourceType, ResourceSet.Usage usage) throws XJdfDocumentException {
        return getPartAmount(resourceType, usage, null, (IntegerList) null);
    }

    /**
     * Returns the PartAmount of the resource found by params .
     *
     * @param resourceType The resource type of the resource set
     * @param usage        The usage of the resource set
     * @param processUsage The process usage of the resource set
     * @param processName  The combined process indexes of the resource set
     * @return The PartAmount of the identified resource.
     */
    public PartAmount getPartAmount(Class<? extends SpecificResource> resourceType, ResourceSet.Usage usage, String processUsage, String processName) throws XJdfDocumentException {
        return getPartAmount(resourceType, usage, processUsage, new IntegerList(getCombinedProcessIndex(processName)));
    }

    /**
     * Returns the PartAmount of the resource found by params .
     *
     * @param resourceType           The resource type of the resource set
     * @param usage                  The usage of the resource set
     * @param processUsage           The process usage of the resource set
     * @param combinedProcessIndices The combined process indexes of the resource set
     * @return The first Resource identified using partition keys.
     */
    public PartAmount getPartAmount(Class<? extends SpecificResource> resourceType, ResourceSet.Usage usage, String processUsage, IntegerList combinedProcessIndices) throws XJdfDocumentException {
        Resource resource = getResource(resourceType, usage, processUsage, combinedProcessIndices);
        return getPartAmount(resource);
    }

    /**
     * Returns the PartAmount of a resource found by id.
     *
     * @param resourceId The resource's unique identifier.
     * @return The PartAmount object of the identified resource object.
     */
    public PartAmount getPartAmount(String resourceId) throws XJdfDocumentException {
        Resource resource = getResource(resourceId);
        return getPartAmount(resource);
    }

    /**
     * Returns the PartAmount of a given resource.
     *
     * @param resource The resource object to be analyzed.
     * @return The PartAmount object if present.
     * @throws XJdfDocumentException In case multiple PartAmount element exist.
     */
    public PartAmount getPartAmount(Resource resource) throws XJdfDocumentException {

        // return null if there is no amount pool present.
        if (resource.getAmountPool() == null) {
            return null;
        }

        // ensure 0 or 1 results
        if (resource.getAmountPool().getPartAmount().size() > 1) {
            throw new XJdfDocumentException("PartAmount in selected resource is ambiguous.");
        }

        // return result
        return resource.getAmountPool().getPartAmount().size() == 1
                ? resource.getAmountPool().getPartAmount().get(0)
                : null;
    }
}
