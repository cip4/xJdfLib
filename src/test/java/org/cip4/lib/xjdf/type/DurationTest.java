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
 * JUnit test case for XJDF Type Duration.
 * @author s.meissner
 * @date 11.01.2013
 */
public class DurationTest {

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
	 * Test method for {@link org.cip4.lib.xjdf.type.Duration#marshal(org.cip4.lib.xjdf.type.Duration)}.
	 */
	@Test
	public void testMarshalDuration1() {

		// arrange
		Duration duration = new Duration(1, 2, 3, 4, 5, 6);

		// act
		String actual = new Duration().marshal(duration);

		// assert
		Assert.assertEquals("Duration value is wrong.", "P1Y2M3DT4H5M6S", actual);
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.type.Duration#marshal(org.cip4.lib.xjdf.type.Duration)}.
	 */
	@Test
	public void testMarshalDuration2() {

		// arrange
		Duration duration = new Duration(2, 12);

		// act
		String actual = new Duration().marshal(duration);

		// assert
		Assert.assertEquals("Duration value is wrong.", "P2DT12H", actual);
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.type.Duration#marshal(org.cip4.lib.xjdf.type.Duration)}.
	 */
	@Test
	public void testMarshalDuration3() {

		// arrange
		Duration duration = new Duration(4);

		// act
		String actual = new Duration().marshal(duration);

		// assert
		Assert.assertEquals("Duration value is wrong.", "P4D", actual);
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.type.Duration#marshal(org.cip4.lib.xjdf.type.Duration)}.
	 */
	@Test
	public void testMarshalDuration4() {

		// arrange
		Duration duration = new Duration(0, 4);

		// act
		String actual = new Duration().marshal(duration);

		// assert
		Assert.assertEquals("Duration value is wrong.", "T4H", actual);
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.type.Duration#unmarshal(java.lang.String)}.
	 */
	@Test
	public void testUnmarshalDuration1() {

		// arrange
		String duration = "P1Y2M3DT4H5M6S";

		// act
		Duration actual = new Duration().unmarshal(duration);

		// assert
		Assert.assertEquals("Year is wrong.", 1, actual.getYear());
		Assert.assertEquals("Month is wrong.", 2, actual.getMonth());
		Assert.assertEquals("Day is wrong.", 3, actual.getDay());
		Assert.assertEquals("Hour is wrong.", 4, actual.getHour());
		Assert.assertEquals("Minute is wrong.", 5, actual.getMinute());
		Assert.assertEquals("Second is wrong.", 6, actual.getSecond());
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.type.Duration#unmarshal(java.lang.String)}.
	 */
	@Test
	public void testUnmarshalDuration2() {

		// arrange
		String duration = "P2DT12H";

		// act
		Duration actual = new Duration().unmarshal(duration);

		// assert
		Assert.assertEquals("Year is wrong.", 0, actual.getYear());
		Assert.assertEquals("Month is wrong.", 0, actual.getMonth());
		Assert.assertEquals("Day is wrong.", 2, actual.getDay());
		Assert.assertEquals("Hour is wrong.", 12, actual.getHour());
		Assert.assertEquals("Minute is wrong.", 0, actual.getMinute());
		Assert.assertEquals("Second is wrong.", 0, actual.getSecond());
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.type.Duration#unmarshal(java.lang.String)}.
	 */
	@Test
	public void testUnmarshalDuration3() {

		// arrange
		String duration = "P4D";

		// act
		Duration actual = new Duration().unmarshal(duration);

		// assert
		Assert.assertEquals("Year is wrong.", 0, actual.getYear());
		Assert.assertEquals("Month is wrong.", 0, actual.getMonth());
		Assert.assertEquals("Day is wrong.", 4, actual.getDay());
		Assert.assertEquals("Hour is wrong.", 0, actual.getHour());
		Assert.assertEquals("Minute is wrong.", 0, actual.getMinute());
		Assert.assertEquals("Second is wrong.", 0, actual.getSecond());
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.type.Duration#unmarshal(java.lang.String)}.
	 */
	@Test
	public void testUnmarshalDuration4() {

		// arrange
		String duration = "T4H";

		// act
		Duration actual = new Duration().unmarshal(duration);

		// assert
		Assert.assertEquals("Year is wrong.", 0, actual.getYear());
		Assert.assertEquals("Month is wrong.", 0, actual.getMonth());
		Assert.assertEquals("Day is wrong.", 0, actual.getDay());
		Assert.assertEquals("Hour is wrong.", 4, actual.getHour());
		Assert.assertEquals("Minute is wrong.", 0, actual.getMinute());
		Assert.assertEquals("Second is wrong.", 0, actual.getSecond());
	}
}
