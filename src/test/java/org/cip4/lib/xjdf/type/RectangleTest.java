package org.cip4.lib.xjdf.type;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * JUnit test case for XJDF Type Rectangle
 * @author stefan.meissner
 * @author michel.hartmann
 */
public class RectangleTest {

	/**
	 * Test method for {@link Rectangle#Rectangle()}}.
	 */
	@Test
	public void testNewInstance() {

		// arrange

		// act
		Rectangle r = new Rectangle();

		// assert
		assertEquals(0d, r.getLlx(), 0.01, "Llx is wrong.");
		assertEquals(0d, r.getLly(), 0.01, "Lly is wrong.");
		assertEquals(0d, r.getUrx(), 0.01, "Urx is wrong.");
		assertEquals(0d, r.getUry(), 0.01, "Ury is wrong.");
	}

	/**
	 * Test method for {@link Rectangle#Rectangle(String)}.
	 */
	@Test
	public void testNewInstanceString() {

		// arrange
		final String value = "1 0 3.14 21631.3";

		// act
		Rectangle r = new Rectangle(value);

		// assert
		assertEquals(1d, r.getLlx(), 0.01, "Llx is wrong.");
		assertEquals(0d, r.getLly(), 0.01, "Lly is wrong.");
		assertEquals(3.14d, r.getUrx(), 0.01, "Urx is wrong.");
		assertEquals(21631.3d, r.getUry(), 0.01, "Ury is wrong.");
	}

	/**
	 * Test method for {@link Rectangle#Rectangle(double, double, double, double)}}.
	 */
	@Test
	public void testNewInstanceDoubleDoubleDoubleDouble() {

		// arrange

		// act
		Rectangle r = new Rectangle(1d, 0d, 3.14d, 21631.3d);

		// assert
		assertEquals(1d, r.getLlx(), 0.01, "Llx is wrong.");
		assertEquals(0d, r.getLly(), 0.01, "Lly is wrong.");
		assertEquals(3.14d, r.getUrx(), 0.01, "Urx is wrong.");
		assertEquals(21631.3d, r.getUry(), 0.01, "Ury is wrong.");
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.type.Rectangle#toString()}.
	 * @throws Exception
	 */
	@Test
	public void testToString() {

		// arrange / act
		String result = new Rectangle(1d, 0d, 3.14d, 21631.3d).toString();

		// assert
		assertEquals("1.0 0.0 3.14 21631.3", result, "Result is wrong.");
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.type.Rectangle#marshal(org.cip4.lib.xjdf.type.Rectangle)}.
	 * @throws Exception
	 */
	@Test
	public void testMarshalRectangle() {

		// arrange
		Rectangle r = new Rectangle(1d, 0d, 3.14d, 21631.3d);

		// act
		String result = new Rectangle().marshal(r);

		// assert
		assertEquals("1.0 0.0 3.14 21631.3", result, "Result is wrong.");
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.type.Rectangle#unmarshal(java.lang.String)}.
	 * @throws Exception
	 */
	@Test
	public void testUnmarshalString() {

		// arrange
		final String value = "1 0 3.14 21631.3";

		// act
		Rectangle r = new Rectangle().unmarshal(value);

		// assert
		assertEquals(1d, r.getLlx(), 0.01, "Llx is wrong.");
		assertEquals(0d, r.getLly(), 0.01, "Lly is wrong.");
		assertEquals(3.14d, r.getUrx(), 0.01, "Urx is wrong.");
		assertEquals(21631.3d, r.getUry(), 0.01, "Ury is wrong.");
	}

    @Test
    public void testEqualsSame() {
        Rectangle r = new Rectangle(1,2,3,4);
        assertEquals(r, r);
    }

    @Test
    public void testEqualsNull() {
        Rectangle r = new Rectangle(1,2,3,4);
        assertNotEquals(null, r);
    }

    @Test
    public void testEquals() {
        Rectangle r = new Rectangle(1,2,3,4);
        assertEquals(new Rectangle(1,2,3,4), r);
    }

    @Test
    public void testHashCodeMatch() {
        Rectangle r = new Rectangle(1,2,3,4);
        assertEquals(new Rectangle(1,2,3,4).hashCode(), r.hashCode());
    }

    @Test
    public void testHashCodeMissmatch() {
        Rectangle r = new Rectangle(1,2,3,4);
        assertNotEquals(new Rectangle(0,2,3,4).hashCode(), r.hashCode());
    }
}
