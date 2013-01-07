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
 * JUnit test case for XJDF Type Matrix.
 * @author stefan.meissner
 * @date 18.12.2012
 */
public class MatrixTest {

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
	 * Test method for {@link org.cip4.lib.xjdf.type.Matrix#newInstance()}.
	 */
	@Test
	public void testNewInstance() {

		// arrange

		// act
		Matrix r = Matrix.newInstance();

		// assert
		Assert.assertEquals("a value is wrong.", 1d, r.getA());
		Assert.assertEquals("b value is wrong.", 0d, r.getB());
		Assert.assertEquals("c value is wrong.", 0d, r.getC());
		Assert.assertEquals("d value is wrong.", 1d, r.getD());
		Assert.assertEquals("Tx value is wrong.", 0d, r.getTx());
		Assert.assertEquals("Ty value is wrong.", 0d, r.getTy());
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.type.Matrix#newInstance(java.lang.String)}.
	 */
	@Test
	public void testNewInstanceString() {

		// arrange
		final String VALUE = "1 0 0 1 3.14 21631.3";

		// act
		Matrix r = Matrix.newInstance(VALUE);

		// assert
		Assert.assertEquals("a value is wrong.", 1d, r.getA());
		Assert.assertEquals("b value is wrong.", 0d, r.getB());
		Assert.assertEquals("c value is wrong.", 0d, r.getC());
		Assert.assertEquals("d value is wrong.", 1d, r.getD());
		Assert.assertEquals("Tx value is wrong.", 3.14d, r.getTx());
		Assert.assertEquals("Ty value is wrong.", 21631.3d, r.getTy());
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.type.Matrix#newInstance(double, double, double, double, double, double)}.
	 */
	@Test
	public void testNewInstanceDoubleDoubleDoubleDoubleDoubleDouble() {

		// arrange
		final double a = 1d;
		final double b = 0d;
		final double c = 0d;
		final double d = 1d;
		final double tx = 3.14d;
		final double ty = 21631.3d;

		// act
		Matrix r = Matrix.newInstance(a, b, c, d, tx, ty);

		// assert
		Assert.assertEquals("a value is wrong.", 1d, r.getA());
		Assert.assertEquals("b value is wrong.", 0d, r.getB());
		Assert.assertEquals("c value is wrong.", 0d, r.getC());
		Assert.assertEquals("d value is wrong.", 1d, r.getD());
		Assert.assertEquals("Tx value is wrong.", 3.14d, r.getTx());
		Assert.assertEquals("Ty value is wrong.", 21631.3d, r.getTy());
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.type.Matrix#toString()}.
	 * @throws Exception
	 */
	@Test
	public void testToString() throws Exception {

		// arrange
		final double a = 1d;
		final double b = 0d;
		final double c = 0d;
		final double d = 1d;
		final double tx = 3.14d;
		final double ty = 21631.3d;

		// act
		String actual = Matrix.newInstance(a, b, c, d, tx, ty).toString();

		// assert
		Assert.assertEquals("String value is wrong.", "1.0 0.0 0.0 1.0 3.14 21631.3", actual);
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.type.Matrix#marshal(org.cip4.lib.xjdf.type.Matrix)}.
	 * @throws Exception
	 */
	@Test
	public void testMarshalMatrix() throws Exception {

		// arrange
		final double a = 1d;
		final double b = 0d;
		final double c = 0d;
		final double d = 1d;
		final double tx = 3.14d;
		final double ty = 21631.3d;

		// act
		Matrix r = Matrix.newInstance(a, b, c, d, tx, ty);
		String actual = Matrix.newInstance().marshal(r);

		// assert
		Assert.assertEquals("String value is wrong.", "1.0 0.0 0.0 1.0 3.14 21631.3", actual);
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.type.Matrix#unmarshal(java.lang.String)}.
	 * @throws Exception
	 */
	@Test
	public void testUnmarshalString() throws Exception {
		// arrange
		final String VALUE = "1 0 0 1 3.14 21631.3";

		// act
		Matrix r = Matrix.newInstance().unmarshal(VALUE);

		// assert
		Assert.assertEquals("a value is wrong.", 1d, r.getA());
		Assert.assertEquals("b value is wrong.", 0d, r.getB());
		Assert.assertEquals("c value is wrong.", 0d, r.getC());
		Assert.assertEquals("d value is wrong.", 1d, r.getD());
		Assert.assertEquals("Tx value is wrong.", 3.14d, r.getTx());
		Assert.assertEquals("Ty value is wrong.", 21631.3d, r.getTy());
	}

}
