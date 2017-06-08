package org.cip4.lib.xjdf.schema;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.w3c.dom.Node;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class SignalAlignedToAuditTest {

    private XsdReader xsdReader;
    private List<String> signalOnlyAttributes = Arrays.asList("ChannelMode");

    @Before
    public void setUp() throws Exception {
        xsdReader = new XsdReader();
    }

    @Test
    public void signalNotificationAndAuditNotificationAreAligned() throws Exception {
        Collection<Node> signalProperties = removeSignalOnlyAttributes(
            xsdReader.complexTypeProperties("SignalNotification")
        );
        Collection<Node> auditProperties = xsdReader.complexTypeProperties("AuditNotification");

        assertTrue(signalProperties.size() > 0);
        Assert.assertNodeCollectionEquals(signalProperties, auditProperties);
    }

    @Test
    @Ignore("XJDF-1020")
    public void signalResourceAndAuditResourceAreAligned() throws Exception {
        Collection<Node> signalResourceProperties = removeSignalOnlyAttributes(
            xsdReader.complexTypeProperties("SignalResource")
        );
        Collection<Node> auditResourceProperties = xsdReader.complexTypeProperties("AuditResource");

        assertTrue(signalResourceProperties.size() > 0);
        Assert.assertNodeCollectionEquals(signalResourceProperties, auditResourceProperties);
    }

    @Test
    public void signalStatusAndAuditStatusAreAligned() throws Exception {
        Collection<Node> signalResourceProperties = removeSignalOnlyAttributes(
            xsdReader.complexTypeProperties("SignalStatus")
        );
        Collection<Node> auditResourceProperties = xsdReader.complexTypeProperties("AuditStatus");

        assertTrue(signalResourceProperties.size() > 0);
        Assert.assertNodeCollectionEquals(signalResourceProperties, auditResourceProperties);
    }

    private Collection<Node> removeSignalOnlyAttributes(Collection<Node> nodes) {
        for (Iterator<Node> iterator = nodes.iterator(); iterator.hasNext(); ) {
            Node node = iterator.next();
            if (node.getLocalName().equals("attribute") &&
                signalOnlyAttributes.contains(node.getAttributes().getNamedItem("name").getNodeValue())) {
                iterator.remove();
            }
        }
        return nodes;
    }

}
