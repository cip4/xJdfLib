package org.cip4.lib.xjdf;

import org.cip4.lib.xjdf.partition.PartitionManager;
import org.cip4.lib.xjdf.schema.*;
import org.cip4.lib.xjdf.xml.XJdfConstants;
import org.cip4.lib.xjdf.xml.XJdfPackager;
import org.cip4.lib.xjdf.xml.XJdfParser;
import org.cip4.lib.xjdf.xml.internal.AbstractXmlPackager;
import org.cip4.lib.xjdf.xml.internal.PackagerException;
import org.jetbrains.annotations.NotNull;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import javax.xml.namespace.QName;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.*;

/**
 * XJDF Document is designed to be the main class when dealing with XJDF documents.
 * Most of the logic covered by the XJDF library is covered by this class.
 */
public class XJdfDocument {

    private final XJDF xjdf;

    private boolean validation = true;

    /**
     * Custom Constructor. Accepting the fundamentals of an XJDF Document for initializing
     */
    public XJdfDocument(String jobId, String[] types) {
        this.xjdf = new XJDF();
        this.xjdf.setJobID(jobId);
        this.xjdf.getTypes().addAll(Arrays.asList(types));
    }

    /**
     * Custom Constructor. Accepting an XJDF byte array for initializing
     */
    public XJdfDocument(byte[] bytes) throws JAXBException {
        this.xjdf = new XJdfParser().parseStream(new ByteArrayInputStream(bytes));
    }

    /**
     * Custom Constructor. Accepting an XJDF Node for initializing
     */
    public XJdfDocument(XJDF xjdf) {
        this.xjdf = xjdf;
    }

    /**
     * Returns the documents XJDF root node.
     * @return The XJDF node.
     */
    public XJDF getXJdf() {
        return xjdf;
    }

    /**
     * Returns true in case the XJDF Document should be validated before writing.
     * @return True in case the XJDF Document should be validated before writing
     */
    public boolean isValidation() {
        return validation;
    }

    /**
     * Set true if the document should become validated before writing.
     * @param validation True in case for validation, otherwise false.
     */
    public void setValidation(final boolean validation) {
        this.validation = validation;
    }

    /**
     * Returns the current XJDF Node as String
     * @return The XJDF Node as String.
     */
    public String toXml() throws JAXBException, IOException {
        return new String(new XJdfParser(false).parseXJdf(this.xjdf, !validation));
    }

    /**
     * Returns an XJDF Zip Package containing the document and all assets.
     * @return The XJDF Zip Pacakge.
     */
    public byte[] getXJdfPackage() throws PackagerException {
        return getXJdfPackage(AbstractXmlPackager.CompressionLevel.DEFAULT_COMPRESSION);
    }

    /**
     * Returns an XJDF Zip Package containing the document and all assets.
     * @param compressionLevel The compression level of the XJDF ZIP Package.
     * @return The XJDF Zip Package as byte array.
     */
    public byte[] getXJdfPackage(AbstractXmlPackager.CompressionLevel compressionLevel) throws PackagerException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        XJdfPackager xJdfPackager = new XJdfPackager(bos);
        xJdfPackager.setValidation(validation);
        xJdfPackager.setCompressionLevel(compressionLevel);
        xJdfPackager.packageXjdf(this.xjdf);

        return bos.toByteArray();
    }

    /**
     * Append a Audit to the XJDF Document.
     *
     * @param audit The audit to be attended append.
     */
    public void addAudit(Audit audit) {

        // create audit pool if necessary
        if(this.xjdf.getAuditPool() == null) {
            this.xjdf.setAuditPool(new AuditPool());
        }

        // add audit
        this.xjdf.getAuditPool().getAudits().add(audit);
    }

    public ResourceSet addResourceSet(@NotNull SpecificResource specificResource, ResourceSet.Usage usage) {

        // prepare specific resource
        String paramName = specificResource.getClass().getSimpleName();
        QName qname = new QName(XJdfConstants.NAMESPACE_JDF20, paramName);
        JAXBElement<SpecificResource> specificResourceJaxB = new JAXBElement(qname, SpecificResource.class, null, specificResource);

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

    public ResourceSet addResourceSet(@NotNull SpecificResource specificResource, ResourceSet.Usage usage, Part part)
        throws IOException {
        if(part == null) {
            return addResourceSet(specificResource, usage);
        }

        Map<Part, SpecificResource> map = new HashMap<>();
        map.put(part, specificResource);
        return addResourceSet(map, usage);
    }

    public ResourceSet addResourceSet(Map<Part, ? extends SpecificResource> map, ResourceSet.Usage usage)
        throws IOException {
        if(map.size() == 0) {
            throw new IOException("The resource map requries at leaset one entry.");
        }

        // create resource set
        ResourceSet resourceSet = new ResourceSet();
        resourceSet.setUsage(usage);

        for(Part part: map.keySet()) {
            String paramName = map.get(part).getClass().getSimpleName();
            QName qname = new QName(XJdfConstants.NAMESPACE_JDF20, paramName);
            JAXBElement<SpecificResource> specificResourceJaxB = new JAXBElement(qname, SpecificResource.class, null, map.get(part));

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
     * @param part The given Partition Keys used to identify a particular Resource
     *
     * @return The first Resource identified using partition keys.
     * @throws IllegalAccessException Is thrown in case the partition isn't accessible in Part class.
     */
    public Resource getResourceByPart(Class<? extends SpecificResource> resourceType, Part part) throws IllegalAccessException {
        List<ResourceSet> resourceSets = this.xjdf.getResourceSet();
        Resource result = null;

        for(int i = 0; i < resourceSets.size() && result == null; i ++) {
            ResourceSet resourceSet = resourceSets.get(i);

            if(resourceType.getSimpleName().equals(resourceSet.getName())) {
                result = PartitionManager.getResourceByPart(resourceSet, part);
            }
        }

        return result;
    }

    /**
     * Identifies and returns the first matching resource within the XJDF Document.
     *
     * @param resourceType The class of the specific resource.
     *
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
     * @param part The given Partition Keys used to identify a particular Resource
     *
     * @return The first specific resource identified using partition keys.
     * @throws IllegalAccessException Is thrown in case the partition isn't accessible in Part class.
     */
    public <T extends SpecificResource> T getSpecificResourceByPart(Class<T> resourceType, Part part) throws IllegalAccessException {
        Resource resource = getResourceByPart(resourceType, part);

        return (T) resource.getSpecificResource().getValue();
    }

    /**
     * Identifies and returns the first matching specific resource within the XJDF Document.
     *
     * @param resourceType The class of the specific resource.
     *
     * @return The first specific resource identified using partition keys.
     * @throws IllegalAccessException Is thrown in case the partition isn't accessible in Part class.
     */
    public <T extends SpecificResource> T getSpecificResourceByPart(Class<T> resourceType) throws IllegalAccessException {
        return getSpecificResourceByPart(resourceType, null);
    }
}
