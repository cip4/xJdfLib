package org.cip4.lib.xjdf.schema;

import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import static org.junit.Assert.*;

public class GeneralDesignTest {

    private XsdReader xsdReader;

    @Before
    public void setUp() throws Exception {
        xsdReader = new XsdReader();
    }


    @Test
    public void allFieldsOfTypeIDMustBeNamedID() throws Exception {
        NodeList elements = xsdReader.evaluateNodeList("//xs:attribute[@type='ID']");

        for (int i = 0; i < elements.getLength(); i++) {
            Node elementNode = elements.item(i);

            // TODO: Remove once XJDF-615 is solved.
            if ("GangElementID".equals(elementNode.getAttributes().getNamedItem("name").getNodeValue())) {
                continue;
            }

            assertEquals(
                "All attributes in XJDF with a data type of ID SHALL be named ID.",
                "ID",
                elementNode.getAttributes().getNamedItem("name").getNodeValue()
            );
        }
    }

    @Test
    public void allFieldsOfWithNameExternalIDShouldHaveTypeNMTOKEN() throws Exception {
        NodeList elements = xsdReader.evaluateNodeList("//xs:attribute[@name='ExternalID']");

        for (int i = 0; i < elements.getLength(); i++) {
            Node elementNode = elements.item(i);

            assertEquals(
                "All attributes in XJDF with a name 'ExternalID' SHALL be have type NMTOKEN.",
                "NMTOKEN",
                elementNode.getAttributes().getNamedItem("type").getNodeValue()
            );
        }
    }

    @Test
    public void allFieldsOfWithNameCostCenterIDShouldHaveTypeNMTOKEN() throws Exception {
        NodeList elements = xsdReader.evaluateNodeList("//xs:attribute[@name='CostCenterID']");

        for (int i = 0; i < elements.getLength(); i++) {
            Node elementNode = elements.item(i);

            assertEquals(
                "All attributes in XJDF with a name 'CostCenterID' SHALL be have type NMTOKEN.",
                "NMTOKEN",
                elementNode.getAttributes().getNamedItem("type").getNodeValue()
            );
        }
    }

    @Test
    public void allFieldsOfWithNameDeviceIDShouldHaveTypeNMTOKEN() throws Exception {
        NodeList elements = xsdReader.evaluateNodeList("//xs:attribute[not(@type) and not(xs:simpleType)]");
        assertEquals(0, elements.getLength());
    }

    @Test
    public void allAttributesMustHaveAType() throws Exception {
        NodeList elements = xsdReader.evaluateNodeList("//xs:attribute[@name='DeviceID']");

        for (int i = 0; i < elements.getLength(); i++) {
            Node elementNode = elements.item(i);

            assertEquals(
                "All attributes in XJDF with a name 'DeviceID' SHALL be have type NMTOKEN.",
                "NMTOKEN",
                elementNode.getAttributes().getNamedItem("type").getNodeValue()
            );
        }
    }

}
