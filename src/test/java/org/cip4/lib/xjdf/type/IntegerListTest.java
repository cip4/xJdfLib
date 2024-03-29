package org.cip4.lib.xjdf.type;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit Test case for IntegerList object.
 * @author s.meissner
 */
public class IntegerListTest {

	@Test
	public void testNewInstanceString() {

		// arrange
		final String VALUE = "1 2 3 4";

		// act
		IntegerList r = new IntegerList(VALUE);

		// assert
		assertEquals(4, r.getList().size(), "Number of Items is wrong.");
		assertEquals(3, r.getList().get(2), "Integer Value is wrong.");
		assertEquals(4, r.getList().get(3), "Integer Value is wrong.");
	}

	@Test
	public void testNewInstanceIntegerArray() {

		// arrange

		// act
		IntegerList r = new IntegerList(6, 7, 8, 9, 10, 11, 12);

		// assert
		assertEquals(7, r.getList().size(), "Number of Items is wrong.");
		assertEquals(8, r.getList().get(2), "Integer Value is wrong.");
		assertEquals(9, r.getList().get(3), "Integer Value is wrong.");
	}

	@Test
	public void testMarshal() {

		// arrange
		IntegerList r = new IntegerList(6, 7, 8, 9, 10, 11, 12);

		// act
		String result = new IntegerList().marshal(r);

		// assert
		assertEquals("6 7 8 9 10 11 12", result);
	}

	@Test
	public void testUnmarshal() throws Exception {

		// arrange
		final String VALUE = "1 2 3 4";

		// act
		IntegerList r = (IntegerList) new IntegerList().unmarshal(VALUE);

		// assert
		assertEquals(4, r.getList().size(), "Number of Items is wrong.");
		assertEquals(3, r.getList().get(2), "Integer Value is wrong.");
		assertEquals(4, r.getList().get(3), "Integer Value is wrong.");

	}

	@Test
	public void testEquals_1() throws Exception {

		// arrange
		IntegerList list_1 = new IntegerList(1,2,3,4);
		IntegerList list_2 = new IntegerList(1,2,3,4);

		// act
		boolean result = list_1.equals(list_2);

		// assert
		assertTrue(result, "Lists are equal.");

	}

	@Test
	public void testEquals_2() throws Exception {

		// arrange
		IntegerList list_1 = new IntegerList(1,2,3,4);
		IntegerList list_2 = new IntegerList(1,2,4,3);

		// act
		boolean result = list_1.equals(list_2);

		// assert
		assertFalse(result, "Lists are NOT equal.");

	}
}
