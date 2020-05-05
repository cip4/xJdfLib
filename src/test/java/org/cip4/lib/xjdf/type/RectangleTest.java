package org.cip4.lib.xjdf.type;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * JUnit test case for XJDF Type Rectangle
 * @author stefan.meissner
 * @author michel.hartmann
 */
public class RectangleTest {

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

	@Test
	public void testNewInstanceDoubleDoubleDoubleDouble() {

		// arrange

		// act
		Rectangle r = new Rectangle(1f, 0f, 3.14f, 21631.3f);

		// assert
		assertEquals(1f, r.getLlx(), 0.01, "Llx is wrong.");
		assertEquals(0f, r.getLly(), 0.01, "Lly is wrong.");
		assertEquals(3.14f, r.getUrx(), 0.01, "Urx is wrong.");
		assertEquals(21631.3f, r.getUry(), 0.01, "Ury is wrong.");
	}

	@Test
	public void testNewInstanceXYPair() {

		// arrange
		XYPair ll = new XYPair(1,2);
		XYPair ur = new XYPair(3,4);

		// act
		Rectangle r = new Rectangle(ll, ur);

		// assert
		assertEquals(1f, r.getLlx(), 0.01, "Llx is wrong.");
		assertEquals(2f, r.getLly(), 0.01, "Lly is wrong.");
		assertEquals(3f, r.getUrx(), 0.01, "Urx is wrong.");
		assertEquals(4f, r.getUry(), 0.01, "Ury is wrong.");
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.type.Rectangle#toString()}.
	 */
	@Test
	public void testToString() {

		// arrange / act
		String result = new Rectangle(1f, 0f, 3.14f, 21631.3f).toString();

		// assert
		assertEquals("1.000 0.000 3.140 21631.301", result, "Result is wrong.");
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.type.Rectangle#marshal(org.cip4.lib.xjdf.type.Rectangle)}.
	 */
	@Test
	public void testMarshalRectangle() {

		// arrange
		Rectangle r = new Rectangle(1f, 0f, 3.14f, 21631.3f);

		// act
		String result = new Rectangle().marshal(r);

		// assert
		assertEquals("1.000 0.000 3.140 21631.301", result, "Result is wrong.");
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.type.Rectangle#unmarshal(java.lang.String)}.
	 */
	@Test
	public void testUnmarshalString() {

		// arrange
		final String value = "1 0 3.14 21631.3";

		// act
		Rectangle r = new Rectangle().unmarshal(value);

		// assert
		assertEquals(1f, r.getLlx(), 0.01, "Llx is wrong.");
		assertEquals(0f, r.getLly(), 0.01, "Lly is wrong.");
		assertEquals(3.14f, r.getUrx(), 0.01, "Urx is wrong.");
		assertEquals(21631.3f, r.getUry(), 0.01, "Ury is wrong.");
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

    @Test
    public void testWidth() {
		Rectangle r = new Rectangle(1,2,4,8);
		assertEquals(3, r.getWidth(), 0.001, "Width is wrong.");
	}

	@Test
	public void testHeight() {
		Rectangle r = new Rectangle(1,2,4,8);
		assertEquals(6, r.getHeight(), 0.001, "Height is wrong.");
	}

	@Test
	public void testSize() {
		Rectangle r = new Rectangle(1,2,4,8);
		assertEquals(new XYPair(3,6), r.getSize(),  "Size is wrong.");
	}

	@Test
	public void testLowerLeft() {
		Rectangle r = new Rectangle(1,2,4,8);
		assertEquals(new XYPair(1,2), r.getLowerLeft(),  "Size is wrong.");
	}

	@Test
	public void testUpperRight() {
		Rectangle r = new Rectangle(1,2,4,8);
		assertEquals(new XYPair(4,8), r.getUpperRight(),  "Size is wrong.");
	}
}
