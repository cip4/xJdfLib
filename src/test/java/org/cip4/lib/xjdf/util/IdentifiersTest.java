package org.cip4.lib.xjdf.util;

import static org.junit.jupiter.api.Assertions.*;

import org.cip4.lib.xjdf.XJdfConstants;
import org.cip4.lib.xjdf.XJdfDocument;
import org.cip4.lib.xjdf.exception.XJdfValidationException;
import org.cip4.lib.xjdf.schema.Component;
import org.cip4.lib.xjdf.schema.Resource;
import org.cip4.lib.xjdf.schema.ResourceSet;
import org.junit.jupiter.api.Test;

/**
 * JUnit test for IDGenerator
 *
 * @author s.meissner
 * @author m.hartmann
 */
public class IdentifiersTest {

    /**
     * Test method for {@link Identifiers#generate(java.lang.String)}.
     */
    @Test
    public void testGenerateID1_PREFIX() {

        // arrange
        final String prefix = "ID";

        // act
        String result = Identifiers.generate(prefix);

        // assert
        assertTrue(result.startsWith(prefix), "ID is wrong.");
    }

    /**
     * Test method for {@link Identifiers#generate(java.lang.String)}.
     */
    @Test
    public void testGenerateID2_PREFIX() {

        // arrange

        // act
        String result = Identifiers.generate("pre");

        // assert
        assertTrue(result.startsWith("PRE_"), "ID is wrong.");
    }

    /**
     * Test method for {@link Identifiers#generate(java.lang.String)}.
     */
    @Test
    public void testGenerateID3_PREFIX() {

        // arrange

        // act
        String result = Identifiers.generate("");

        // assert
        assertTrue(result.startsWith("ID_"), "ID is wrong.");
    }

    @Test
    public void printAFew() {
        for(int i = 0; i < 20; i ++) {
            System.out.println(Identifiers.generate("COMP"));
        }
    }

    /**
     * Test method for {@link Identifiers#generate(java.lang.String)}.
     */
    @Test
    public void testGenerateID4_PREFIX() {

        // arrange
        final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        int[] array = new int[CHARACTERS.length()];

        // act
        for (int i = 0; i < 4000; i++) {
            String result = Identifiers.generate("");

            String id = result.split("_")[1];

            for (int n = 0; n < id.length(); n++) {
                int m = CHARACTERS.indexOf(id.charAt(n));
                array[m]++;
            }
        }

        for (int i = 0; i < 4000; i++) {
            String result = Identifiers.generate("abc");

            String id = result.split("_")[1];

            for (int n = 0; n < id.length(); n++) {
                int m = CHARACTERS.indexOf(id.charAt(n));
                array[m]++;
            }
        }

        // assert
        for (int i = 0; i < array.length; i++) {
            assertFalse(array[i] == 0, "Character '" + CHARACTERS.charAt(i) + "' isn't used.");
        }
    }

    @Test
    public void testUniquenessOfIds() throws Exception {

        // arrange
        XJdfConstants.DEVICE_ID = "DEVICE_ID";
        XJdfConstants.AGENT_NAME = "AGENT_NAME";
        XJdfConstants.AGENT_VERSION = "AGENT_VERSION";

        XJdfDocument xJdfDocument = new XJdfDocument("JOB_ID", "Product");
        ResourceSet resourceSet = xJdfDocument.addResourceSet(Component.class, ResourceSet.Usage.INPUT);

        Resource res_1 = xJdfDocument.addSpecificResource(resourceSet, new Component());
        res_1.setID("ID_1");

        Resource res_2 = xJdfDocument.addSpecificResource(resourceSet, new Component());
        res_2.setID("ID_1");

        // act
        Throwable t = assertThrows(XJdfValidationException.class, xJdfDocument::toXml);

        // assert
        String expectedMessage = "Validation of the document's semantic failed due to following error messages: " + System.lineSeparator() +
                "ERROR in XJDF Doc at line 13, column 29: cvc-id.2: There are multiple occurrences of ID value 'ID_1'." + System.lineSeparator() +
                "ERROR in XJDF Doc at line 13, column 29: cvc-attribute.3: The value 'ID_1' of attribute 'ID' on element 'Resource' is not valid with respect to its type, 'ID'.";

        assertEquals(expectedMessage, t.getMessage(), "Error message is wrong.");

    }

}
