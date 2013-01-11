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

import static org.junit.Assert.fail;
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
	 * Test method for {@link org.cip4.lib.xjdf.type.Duration#Duration()}.
	 */
	@Test
	public void testDuration() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.type.Duration#Duration(int)}.
	 */
	@Test
	public void testDurationInt() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.type.Duration#Duration(int, int)}.
	 */
	@Test
	public void testDurationIntInt() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.type.Duration#Duration(java.lang.String)}.
	 */
	@Test
	public void testDurationString() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.type.Duration#Duration(int, int, int, int, int, int)}.
	 */
	@Test
	public void testDurationIntIntIntIntIntInt() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.type.Duration#unmarshal(java.lang.String)}.
	 */
	@Test
	public void testUnmarshalString() {
		fail("Not yet implemented");
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
	 * Test method for {@link org.cip4.lib.xjdf.type.Duration#toString()}.
	 */
	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

}
