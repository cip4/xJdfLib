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
package org.cip4.lib.xjdf.type;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * JUnit Test case for IntegerList object.
 * @author s.meissner
 * @date 10.01.2013
 */
public class IntegerListTest {

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
	 * Test method for {@link org.cip4.lib.xjdf.type.IntegerList#newInstance(java.lang.String)}.
	 */
	@Test
	public void testNewInstanceString() {

		// arrange
		final String VALUE = "1 2 3 4";

		// act
		IntegerList r = new IntegerList(VALUE);

		// assert
		Assert.assertEquals("Number of Items is wrong.", 4, r.getList().size());
		Assert.assertEquals("Integer Value is wrong.", new Integer(3), r.getList().get(2));
		Assert.assertEquals("Integer Value is wrong.", new Integer(4), r.getList().get(3));
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.type.IntegerList#newInstance(Integer...)}.
	 */
	@Test
	public void testNewInstanceIntegerArray() {

		// arrange

		// act
		IntegerList r = new IntegerList(6, 7, 8, 9, 10, 11, 12);

		// assert
		Assert.assertEquals("Number of Items is wrong.", 7, r.getList().size());
		Assert.assertEquals("Integer Value is wrong.", new Integer(8), r.getList().get(2));
		Assert.assertEquals("Integer Value is wrong.", new Integer(9), r.getList().get(3));
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.type.Marshall}.
	 */
	@Test
	public void testMarshal() {

		// arrange
		IntegerList r = new IntegerList(6, 7, 8, 9, 10, 11, 12);

		// act
		String result = new IntegerList().marshal(r);

		// assert
		Assert.assertEquals("Number of Items is wrong.", "6 7 8 9 10 11 12", result);
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.type.Unmarshall}.
	 * @throws Exception
	 */
	@Test
	public void testUnmarshal() throws Exception {

		// arrange
		final String VALUE = "1 2 3 4";

		// act
		IntegerList r = (IntegerList) new IntegerList().unmarshal(VALUE);

		// assert
		Assert.assertEquals("Number of Items is wrong.", 4, r.getList().size());
		Assert.assertEquals("Integer Value is wrong.", new Integer(3), r.getList().get(2));
		Assert.assertEquals("Integer Value is wrong.", new Integer(4), r.getList().get(3));

	}
}