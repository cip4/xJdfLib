package org.cip4.lib.xjdf;

import org.cip4.lib.xjdf.schema.*;
import org.cip4.lib.xjdf.xml.XJdfConstants;
import org.jetbrains.annotations.NotNull;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * XJDF Document class.
 */
public class XJdfDocument {

    private final XJDF xjdf;

    /**
     * Default Constructor.
     */
    public XJdfDocument(String jobId, String[] types) {
        this.xjdf = new XJDF();
        this.xjdf.setJobID(jobId);
        this.xjdf.getTypes().addAll(Arrays.asList(types));
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

    public ResourceSet addResource(Map<Part, ? extends SpecificResource> map, ResourceSet.Usage usage) {

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
        }

        // add resource set to XJDF and return the object
        this.xjdf.getResourceSet().add(resourceSet);
        return resourceSet;
    }
}
