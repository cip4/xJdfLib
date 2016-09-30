package org.cip4.lib.xjdf.schema;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FieldsOfTypeNmtokenTest {

    private XsdReader xsdReader;
    private final String fieldName;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
            new Object[]{"DeviceID"},
            new Object[]{"ExternalID"},
            new Object[]{"JobID"},
            new Object[]{"JobPartID"},
            new Object[]{"ModuleID"},
            new Object[]{"NextQueueEntryID"},
            new Object[]{"PersonalID"},
            new Object[]{"PipeID"},
            new Object[]{"PrevQueueEntryID"},
            new Object[]{"ProductionPathID"},
            new Object[]{"ProjectID"},
            new Object[]{"QueueEntryID"},
            new Object[]{"RelatedJobID"},
            new Object[]{"RelatedJobPartID"},
            new Object[]{"SenderID"},
            new Object[]{"Unit"}
        );
    }

    public FieldsOfTypeNmtokenTest(final String fieldName) {
        this.fieldName = fieldName;
    }

    @Before
    public void setUp() throws Exception {
        xsdReader = new XsdReader();
    }

    @Test
    public void allFieldsOfWithNameJobPartIDShouldHaveTypeNMTOKEN() throws Exception {
        NodeList elements = xsdReader.evaluateNodeList(String.format("//xs:attribute[@name='%s']", fieldName));

        for (int i = 0; i < elements.getLength(); i++) {
            Node elementNode = elements.item(i);

            assertEquals(
                String.format("All attributes in XJDF with a name '%s' SHALL be have type NMTOKEN.", fieldName),
                "NMTOKEN",
                elementNode.getAttributes().getNamedItem("type").getNodeValue()
            );
        }
    }
}
