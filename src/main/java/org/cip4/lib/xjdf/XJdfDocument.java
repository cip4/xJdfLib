package org.cip4.lib.xjdf;

import org.cip4.lib.xjdf.schema.*;

import java.util.HashMap;
import java.util.Map;

/**
 * XJDF Document class.
 */
public class XJdfDocument {

    private final XJDF xjdf;

    /**
     * Default Constructor.
     */
    public XJdfDocument(String jobId) {
        this.xjdf = new XJDF();
        this.xjdf.setJobID(jobId);
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

    public ResourceSet addResource(SpecificResource specificResource) {
        Map mapq21w = new HashMap()

        return null;
    }

    public ResourceSet addResource(Map<Part, SpecificResource> specificResources) {
        return null;
    }
}
