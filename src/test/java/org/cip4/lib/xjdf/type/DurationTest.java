package org.cip4.lib.xjdf.type;

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
		assertEquals("PT4H", actual, "Duration value is wrong.");
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

	@Test
	public void testMarshalZeroDuration() {
		assertEquals("PT0S", new Duration().toString(), "Zero duration is wrong.");
		assertEquals("PT0S", new Duration("PT0S").toString(), "Zero duration is wrong.");
	}

	@Test
	public void testMarshalNegativeDuration() {
		assertEquals("-P1D", new Duration("-P1D").toString(), "Negative duration is wrong.");
	}

	@Test
	public void testUnmarshalFractionalSeconds() {
		final Duration actual = new Duration("PT1.5S");

		assertEquals(1, actual.getSecond(), "Second is wrong.");
		assertEquals(0, actual.getFractionalSecond().compareTo(new java.math.BigDecimal("0.5")),
			"Fractional second is wrong.");
		assertEquals("PT1.5S", actual.toString(), "Duration value is wrong.");
	}

	@Test
	public void testUnmarshalLegacyTimeOnly() {
		assertEquals("PT4H", new Duration("T4H").toString(), "Legacy expression is wrong.");
	}

	@Test
	public void testRoundTrip() {
		final String[] expressions = {
			"P1Y2M3DT4H5M6S", "P2DT12H", "P4D", "PT4H", "PT0S", "-P1D", "PT1.5S", "P1Y"
		};

		for (String expression : expressions) {
			assertEquals(expression, new Duration(expression).toString(), "Round trip failed for " + expression);
		}
	}

	@Test
	public void testInvalidExpressions() {
		assertThrows(IllegalArgumentException.class, () -> new Duration(""));
		assertThrows(IllegalArgumentException.class, () -> new Duration("P"));
		assertThrows(IllegalArgumentException.class, () -> new Duration("PT"));
		assertThrows(IllegalArgumentException.class, () -> new Duration("1D"));
		assertThrows(IllegalArgumentException.class, () -> new Duration("P1X"));
	}

	@Test
	public void testToJavaDuration() {
		assertEquals(java.time.Duration.ofHours(4), new Duration("PT4H").toJavaDuration());
		assertEquals(java.time.Duration.ofMillis(1500), new Duration("PT1.5S").toJavaDuration());
		assertEquals(java.time.Duration.ofDays(-1), new Duration("-P1D").toJavaDuration());
	}

	@Test
	public void testToPeriod() {
		assertEquals(java.time.Period.of(1, 2, 3), new Duration("P1Y2M3D").toPeriod());
		assertEquals(java.time.Period.ofDays(-1), new Duration("-P1D").toPeriod());
	}
}
