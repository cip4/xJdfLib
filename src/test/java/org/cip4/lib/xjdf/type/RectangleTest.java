package org.cip4.lib.xjdf.type;

import org.junit.Assert;
import org.junit.Test;

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
		Assert.assertEquals("Llx is wrong.", 0d, r.getLlx(), 0.01);
		Assert.assertEquals("Lly is wrong.", 0d, r.getLly(), 0.01);
		Assert.assertEquals("Urx is wrong.", 0d, r.getUrx(), 0.01);
		Assert.assertEquals("Ury is wrong.", 0d, r.getUry(), 0.01);
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
		Assert.assertEquals("Llx is wrong.", 1d, r.getLlx(), 0.01);
		Assert.assertEquals("Lly is wrong.", 0d, r.getLly(), 0.01);
		Assert.assertEquals("Urx is wrong.", 3.14d, r.getUrx(), 0.01);
		Assert.assertEquals("Ury is wrong.", 21631.3d, r.getUry(), 0.01);
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
		Assert.assertEquals("Llx is wrong.", 1d, r.getLlx(), 0.01);
		Assert.assertEquals("Lly is wrong.", 0d, r.getLly(), 0.01);
		Assert.assertEquals("Urx is wrong.", 3.14d, r.getUrx(), 0.01);
		Assert.assertEquals("Ury is wrong.", 21631.3d, r.getUry(), 0.01);
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.type.Rectangle#toString()}.
	 * @throws Exception
	 */
	@Test
	public void testToString() throws Exception {

		// arrange / act
		String result = new Rectangle(1d, 0d, 3.14d, 21631.3d).toString();

		// assert
		Assert.assertEquals("Result is wrong.", "1.0 0.0 3.14 21631.3", result);
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.type.Rectangle#marshal(org.cip4.lib.xjdf.type.Rectangle)}.
	 * @throws Exception
	 */
	@Test
	public void testMarshalRectangle() throws Exception {

		// arrange
		Rectangle r = new Rectangle(1d, 0d, 3.14d, 21631.3d);

		// act
		String result = new Rectangle().marshal(r);

		// assert
		Assert.assertEquals("Result is wrong.", "1.0 0.0 3.14 21631.3", result);
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.type.Rectangle#unmarshal(java.lang.String)}.
	 * @throws Exception
	 */
	@Test
	public void testUnmarshalString() throws Exception {

		// arrange
		final String value = "1 0 3.14 21631.3";

		// act
		Rectangle r = new Rectangle().unmarshal(value);

		// assert
		Assert.assertEquals("Llx is wrong.", 1d, r.getLlx(), 0.01);
		Assert.assertEquals("Lly is wrong.", 0d, r.getLly(), 0.01);
		Assert.assertEquals("Urx is wrong.", 3.14d, r.getUrx(), 0.01);
		Assert.assertEquals("Ury is wrong.", 21631.3d, r.getUry(), 0.01);
	}

    @Test
    public void testEqualsSame() throws Exception {
        Rectangle r = new Rectangle(1,2,3,4);
        Assert.assertEquals(r, r);
    }

    @Test
    public void testEqualsNull() throws Exception {
        Rectangle r = new Rectangle(1,2,3,4);
        Assert.assertNotEquals(null, r);
    }

    @Test
    public void testEquals() throws Exception {
        Rectangle r = new Rectangle(1,2,3,4);
        Assert.assertEquals(new Rectangle(1,2,3,4), r);
    }

    @Test
    public void testHashCodeMatch() throws Exception {
        Rectangle r = new Rectangle(1,2,3,4);
        Assert.assertEquals(new Rectangle(1,2,3,4).hashCode(), r.hashCode());
    }

    @Test
    public void testHashCodeMissmatch() throws Exception {
        Rectangle r = new Rectangle(1,2,3,4);
        Assert.assertNotEquals(new Rectangle(0,2,3,4).hashCode(), r.hashCode());
    }
}
