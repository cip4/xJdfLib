/**
 * All rights reserved by
 * 
 * flyeralarm GmbH
 * Alfred-Nobel-Straße 18
 * 97080 Würzburg
 *
 * Email: info@flyeralarm.com
 * Website: http://www.flyeralarm.com
 */
package org.cip4.lib.xjdf.util;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * JUnit test for IDGenerator
 * @author s.meissner
 * @date 09.01.2013
 */
public class IDGeneratorUtilTest {

	/**
	 * Setup unit test.
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Tear down unit test.
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
		System.out.println(result);
		Assert.assertTrue("ID is wrong.", result.startsWith(prefix));
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
		System.out.println(result);
		Assert.assertTrue("ID is wrong.", result.startsWith("PRE_"));
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
		System.out.println(result);
		Assert.assertTrue("ID is wrong.", result.startsWith("XJDF_"));
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.util.IDGeneratorUtil#generateID(java.lang.String)}.
	 */
	@Test
	public void testGenerateID4_PREFIX() {

		// arrange

		// act
		for (int i = 0; i < 1000; i++) {
			String result = IDGeneratorUtil.generateID("");
			System.out.print(result + "; ");
		}

		for (int i = 0; i < 1000; i++) {
			String result = IDGeneratorUtil.generateID("abc");
			System.out.print(result + "; ");
		}

		// assert
	}
}
