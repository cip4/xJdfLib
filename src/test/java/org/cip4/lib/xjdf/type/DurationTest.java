package org.cip4.lib.xjdf.type;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit test case for XJDF Type Duration.
 * @author s.meissner
 */
public class DurationTest {

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
		assertEquals("P1Y2M3DT4H5M6S", actual, "Duration value is wrong.");
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
		assertEquals("P2DT12H", actual, "Duration value is wrong.");
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
		assertEquals("P4D", actual, "Duration value is wrong.");
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
		assertEquals("T4H", actual, "Duration value is wrong.");
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
		assertEquals(1, actual.getYear(), "Year is wrong.");
		assertEquals(2, actual.getMonth(), "Month is wrong.");
		assertEquals(3, actual.getDay(), "Day is wrong.");
		assertEquals(4, actual.getHour(), "Hour is wrong.");
		assertEquals(5, actual.getMinute(), "Minute is wrong.");
		assertEquals(6, actual.getSecond(), "Second is wrong.");
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
		assertEquals(0, actual.getYear(), "Year is wrong.");
		assertEquals(0, actual.getMonth(), "Month is wrong.");
		assertEquals(2, actual.getDay(), "Day is wrong.");
		assertEquals(12, actual.getHour(), "Hour is wrong.");
		assertEquals(0, actual.getMinute(), "Minute is wrong.");
		assertEquals(0, actual.getSecond(), "Second is wrong.");
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
		assertEquals(0, actual.getYear(), "Year is wrong.");
		assertEquals(0, actual.getMonth(), "Month is wrong.");
		assertEquals(4, actual.getDay(), "Day is wrong.");
		assertEquals(0, actual.getHour(), "Hour is wrong.");
		assertEquals(0, actual.getMinute(), "Minute is wrong.");
		assertEquals(0, actual.getSecond(), "Second is wrong.");
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
		assertEquals(0, actual.getYear(), "Year is wrong.");
		assertEquals(0, actual.getMonth(), "Month is wrong.");
		assertEquals(0, actual.getDay(), "Day is wrong.");
		assertEquals(4, actual.getHour(), "Hour is wrong.");
		assertEquals(0, actual.getMinute(), "Minute is wrong.");
		assertEquals(0, actual.getSecond(), "Second is wrong.");
	}
}
