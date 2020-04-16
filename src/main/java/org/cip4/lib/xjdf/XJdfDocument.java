package org.cip4.lib.xjdf;

import org.cip4.lib.xjdf.partition.PartitionManager;
import org.cip4.lib.xjdf.schema.*;
import org.cip4.lib.xjdf.xml.XJdfConstants;
import org.cip4.lib.xjdf.xml.XJdfParser;
import org.jetbrains.annotations.NotNull;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;
import java.io.ByteArrayInputStream;
import java.util.*;

/**
 * XJDF Document is designed to be the main class when dealing with XJDF documents.
 * Most of the logic covered by the XJDF library is covered by this class.
 */
public class XJdfDocument {

    private final XJDF xjdf;

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
    public XJDF getXjdf() {
        return xjdf;
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

    public ResourceSet addResourceSet(@NotNull SpecificResource specificResource, ResourceSet.Usage usage, Part part) {
        if(part == null) {
            return addResourceSet(specificResource, usage);
        }

        Map<Part, SpecificResource> map = new HashMap<>();
        map.put(part, specificResource);
        return addResourceSet(map, usage);
    }

    public ResourceSet addResourceSet(Map<Part, ? extends SpecificResource> map, ResourceSet.Usage usage) {

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
     * @param resourceClazz The class of the specific resource.
     * @param part The given Partition Keys used to identify a particular Resource
     *
     * @return The first Resource identified using partition keys.
     * @throws IllegalAccessException Is thrown in case the partition isn't accessible in Part class.
     */
    public Resource getResourceByPart(Class<? extends SpecificResource> resourceClazz, Part part) throws IllegalAccessException {
        List<ResourceSet> resourceSets = this.xjdf.getResourceSet();
        Resource result = null;

        for(int i = 0; i < resourceSets.size() && result == null; i ++) {
            ResourceSet resourceSet = resourceSets.get(i);

            if(resourceClazz.getSimpleName().equals(resourceSet.getName())) {
                result = PartitionManager.getResourceByPart(resourceSet, part);
            }
        }

        return result;
    }

    /**
     * Identifies and returns the first specific resource within the XJDF Document using partition keys.
     *
     * @param resourceClazz The class of the specific resource.
     * @param part The given Partition Keys used to identify a particular Resource
     *
     * @return The first specific resource identified using partition keys.
     * @throws IllegalAccessException Is thrown in case the partition isn't accessible in Part class.
     */
    public <T extends SpecificResource> T getSpecificResourceByPart(Class<T> resourceClazz, Part part) throws IllegalAccessException {
        Resource resource = getResourceByPart(resourceClazz, part);

        return (T) resource.getSpecificResource().getValue();
    }
}
