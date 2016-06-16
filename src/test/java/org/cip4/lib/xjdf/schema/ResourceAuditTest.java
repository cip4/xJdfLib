package org.cip4.lib.xjdf.schema;

import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Node;

import java.util.Set;

import static org.junit.Assert.*;


public class ResourceAuditTest {

    private XsdReader xsdReader;

    @Before
    public void setUp() throws Exception {
        xsdReader = new XsdReader();
    }

    @Test
    public void signalResourceAndResourceAuditAreAligned() throws Exception {
        Set<Node> signalResourceProperties = xsdReader.complexTypeProperties("SignalResource");
        Set<Node> auditResourceProperties = xsdReader.complexTypeProperties("ResourceAudit");

        assertTrue(signalResourceProperties.size() > 0);
        Assert.assertNodeCollectionEquals(signalResourceProperties, auditResourceProperties);
    }



}
