package org.cip4.lib.xjdf.schema;

import org.cip4.lib.xjdf.xml.internal.NamespaceManager;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import java.io.InputStream;

import static org.junit.Assert.*;

public class GeneralDesignTest {

    private XsdReader xsdReader;

    @Before
    public void setUp() throws Exception {
        xsdReader = new XsdReader();
    }


    @Test
    public void allFieldsOfTypeIDMustBeNamedID() throws Exception {
        NodeList elements = xsdReader.evaluate("//xs:attribute[@type='ID']");

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
        NodeList elements = xsdReader.evaluate("//xs:attribute[@name='ExternalID']");

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
    public void allFieldsOfWithNameDeviceIDShouldHaveTypeNMTOKEN() throws Exception {
        NodeList elements = xsdReader.evaluate("//xs:attribute[@name='DeviceID']");

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
