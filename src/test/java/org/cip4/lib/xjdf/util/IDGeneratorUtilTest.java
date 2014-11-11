package org.cip4.lib.xjdf.util;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * JUnit test for IDGenerator
 *
 * @author s.meissner
 * @author m.hartmann
 */
public class IDGeneratorUtilTest {

    /**
     * Setup unit test.
     *
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
    }

    /**
     * Tear down unit test.
     *
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test method for {@link org.cip4.lib.xjdf.util.IDGeneratorUtil#generateID(java.lang.String)}.
     */
    @Test
    public void testGenerateID1_PREFIX() {

        // arrange
        final String prefix = "ID";

        // act
        String result = IDGeneratorUtil.generateID(prefix);

        // assert
        assertTrue("ID is wrong.", result.startsWith(prefix));
    }

    /**
     * Test method for {@link org.cip4.lib.xjdf.util.IDGeneratorUtil#generateID(java.lang.String)}.
     */
    @Test
    public void testGenerateID2_PREFIX() {

        // arrange

        // act
        String result = IDGeneratorUtil.generateID("pre");

        // assert
        assertTrue("ID is wrong.", result.startsWith("PRE_"));
    }

    /**
     * Test method for {@link org.cip4.lib.xjdf.util.IDGeneratorUtil#generateID(java.lang.String)}.
     */
    @Test
    public void testGenerateID3_PREFIX() {

        // arrange

        // act
        String result = IDGeneratorUtil.generateID("");

        // assert
        assertTrue("ID is wrong.", result.startsWith("ID_"));
    }

    /**
     * Test method for {@link org.cip4.lib.xjdf.util.IDGeneratorUtil#generateID(java.lang.String)}.
     */
    @Test
    public void testGenerateID4_PREFIX() {

        // arrange
        final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        int[] array = new int[CHARACTERS.length()];

        // act
        for (int i = 0; i < 4000; i++) {
            String result = IDGeneratorUtil.generateID("");

            String id = result.split("_")[1];

            for (int n = 0; n < id.length(); n++) {
                int m = CHARACTERS.indexOf(id.charAt(n));
                array[m]++;
            }
        }

        for (int i = 0; i < 4000; i++) {
            String result = IDGeneratorUtil.generateID("abc");

            String id = result.split("_")[1];

            for (int n = 0; n < id.length(); n++) {
                int m = CHARACTERS.indexOf(id.charAt(n));
                array[m]++;
            }
        }

        // assert
        for (int i = 0; i < array.length; i++) {
            assertFalse("Character '" + CHARACTERS.charAt(i) + "' isn't used.", array[i] == 0);
        }
    }

}
