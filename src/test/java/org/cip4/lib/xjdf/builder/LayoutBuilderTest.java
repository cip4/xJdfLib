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
package org.cip4.lib.xjdf.builder;

import junit.framework.Assert;

import org.cip4.lib.xjdf.XJdfNodeFactory;
import org.cip4.lib.xjdf.schema.ContentObject;
import org.cip4.lib.xjdf.schema.Layout;
import org.cip4.lib.xjdf.schema.MarkObject;
import org.cip4.lib.xjdf.type.Matrix;
import org.cip4.lib.xjdf.type.Rectangle;
import org.cip4.lib.xjdf.type.XYPair;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * JUnit test case for Layout Builder class.
 * @author s.meissner
 * @date 19.12.2012
 */
public class LayoutBuilderTest extends AbstractBuilderTest<Layout> {

	private LayoutBuilder layoutBuilder;

	private XJdfNodeFactory xJdfNodeFactory;

	/**
	 * Set up unit test.
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		xJdfNodeFactory = xJdfNodeFactory.newInstance();
		layoutBuilder = LayoutBuilder.newInstance();
	}

	/**
	 * Tear down unit test.
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		layoutBuilder = null;
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.builder.LayoutBuilder#newInstance(org.cip4.lib.xjdf.type.Rectangle)}.
	 * @throws Exception
	 */
	@Test
	public void testNewInstanceRectangle() throws Exception {

		// arrange
		Rectangle surfaceContentsBox = new Rectangle(1, 2, 3, 4);

		// act
		layoutBuilder = LayoutBuilder.newInstance(surfaceContentsBox);

		// assert
		byte[] bytes = marsahlResultParameter(layoutBuilder);

		String actual = getXPathValue(bytes, "/xjdf:XJDF/xjdf:ParameterSet/xjdf:Parameter/xjdf:Layout/@SurfaceContentsBox");
		Assert.assertEquals("SurfaceContentsBox is wrong.", "1.0 2.0 3.0 4.0", actual);
	}

	/**
	 * JUnit test case for all Add methods.
	 * @throws Exception
	 */
	@Test
	public void testAllAddMethods() throws Exception {

		// arrange
		final String surfaceContentsBox = "1.0 2.0 3.0 4.0";

		final String markObject_1_CTM = "1 0 0 1 0.0000 0.0000";
		final String markObject_1_ClipBox = "0.0000 0.0000 2976.3779527559 2125.9842519685";
		final String markObject_1_Ord = "8";

		final String contentObject_1_CTM = "0 -1 1 0 1731.9680314961 374.1712992126";
		final String contentObject_1_ClipBox = "1731.968503937 85.0393700787 2939.5275590551 374.1732283465";
		final String contentObject_1_Ord = "26";
		final String contentObject_1_TrimCTM = "0 -1 1 0 1734.8031496063 371.3385826772";
		final String contentObject_1_TrimSize = "813.5433070866 425.1968503937";

		final String contentObject_2_CTM = "0 -1 1 0 1731.9680314961 663.3051574803";
		final String contentObject_2_ClipBox = "1731.968503937 374.1732283465 2939.5275590551 663.3070866142";
		final String contentObject_2_Ord = "56";
		final String contentObject_2_TrimCTM = "0 -1 1 0 1734.8031496063 660.4724409449";
		final String contentObject_2_TrimSize = "283.4645669291 1201.8897637795";

		final String markObject_2_CTM = "1 0 0 1 1.0000 1.0000";
		final String markObject_2_ClipBox = "2.0000 2.0000 976.3779527559 125.9842519685";
		final String markObject_2_Ord = "5";

		MarkObject markObject_1 = xJdfNodeFactory.createMarkObject(new Matrix(markObject_1_CTM), new Rectangle(markObject_1_ClipBox), Integer.valueOf(markObject_1_Ord));
		ContentObject contentObject_1 = xJdfNodeFactory.createContentObject(new Matrix(contentObject_1_CTM), new Rectangle(contentObject_1_ClipBox), Integer.valueOf(contentObject_1_Ord), new Matrix(
				contentObject_1_TrimCTM), new XYPair(contentObject_1_TrimSize));
		ContentObject contentObject_2 = xJdfNodeFactory.createContentObject(new Matrix(contentObject_2_CTM), new Rectangle(contentObject_2_ClipBox), Integer.valueOf(contentObject_2_Ord), new Matrix(
				contentObject_2_TrimCTM), new XYPair(contentObject_2_TrimSize));
		MarkObject markObject_2 = xJdfNodeFactory.createMarkObject(new Matrix(markObject_2_CTM), new Rectangle(markObject_2_ClipBox), Integer.valueOf(markObject_2_Ord));

		// act
		layoutBuilder = LayoutBuilder.newInstance(new Rectangle(surfaceContentsBox));

		layoutBuilder.addMarkObject(markObject_1);
		layoutBuilder.addPlacedObject(contentObject_1);
		layoutBuilder.addContentObject(contentObject_2);
		layoutBuilder.addPlacedObject(markObject_2);

		// assert
		String actual;
		byte[] bytes = marsahlResultParameter(layoutBuilder);

		actual = getXPathValue(bytes, "/xjdf:XJDF/xjdf:ParameterSet[@Name='Layout']/xjdf:Parameter/xjdf:Layout/@SurfaceContentsBox");
		Assert.assertEquals("SurfaceContentsBox is wrong.", surfaceContentsBox, actual);

		actual = getXPathValue(bytes, "/xjdf:XJDF/xjdf:ParameterSet[@Name='Layout']/xjdf:Parameter/xjdf:Layout/xjdf:MarkObject[1]/@Ord");
		Assert.assertEquals("SurfaceContentsBox is wrong.", markObject_1_Ord, actual);

		actual = getXPathValue(bytes, "/xjdf:XJDF/xjdf:ParameterSet[@Name='Layout']/xjdf:Parameter/xjdf:Layout/xjdf:ContentObject[1]/@ClipBox");
		Assert.assertEquals("SurfaceContentsBox is wrong.", contentObject_1_ClipBox, actual);

		actual = getXPathValue(bytes, "/xjdf:XJDF/xjdf:ParameterSet[@Name='Layout']/xjdf:Parameter/xjdf:Layout/xjdf:ContentObject[2]/@ClipBox");
		Assert.assertEquals("SurfaceContentsBox is wrong.", contentObject_2_ClipBox, actual);

		actual = getXPathValue(bytes, "/xjdf:XJDF/xjdf:ParameterSet[@Name='Layout']/xjdf:Parameter/xjdf:Layout/xjdf:MarkObject[2]/@Ord");
		Assert.assertEquals("SurfaceContentsBox is wrong.", markObject_2_Ord, actual);
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.builder.LayoutBuilder#addPlacedObject(org.cip4.lib.xjdf.schema.PlacedObject)}.
	 * @throws Exception
	 */
	@Test
	public void testAddPlacedObject() throws Exception {

		// arrange
		final String surfaceContentsBox = "1.0 2.0 3.0 4.0";

		final String markObject_1_CTM = "1 0 0 1 0.0000 0.0000";
		final String markObject_1_ClipBox = "0.0000 0.0000 2976.3779527559 2125.9842519685";
		final String markObject_1_Ord = "8";

		final String contentObject_1_CTM = "0 -1 1 0 1731.9680314961 374.1712992126";
		final String contentObject_1_ClipBox = "1731.968503937 85.0393700787 2939.5275590551 374.1732283465";
		final String contentObject_1_Ord = "26";
		final String contentObject_1_TrimCTM = "0 -1 1 0 1734.8031496063 371.3385826772";
		final String contentObject_1_TrimSize = "813.5433070866 425.1968503937";

		final String contentObject_2_CTM = "0 -1 1 0 1731.9680314961 663.3051574803";
		final String contentObject_2_ClipBox = "1731.968503937 374.1732283465 2939.5275590551 663.3070866142";
		final String contentObject_2_Ord = "56";
		final String contentObject_2_TrimCTM = "0 -1 1 0 1734.8031496063 660.4724409449";
		final String contentObject_2_TrimSize = "283.4645669291 1201.8897637795";

		final String markObject_2_CTM = "1 0 0 1 1.0000 1.0000";
		final String markObject_2_ClipBox = "2.0000 2.0000 976.3779527559 125.9842519685";
		final String markObject_2_Ord = "5";

		MarkObject markObject_1 = xJdfNodeFactory.createMarkObject(new Matrix(markObject_1_CTM), new Rectangle(markObject_1_ClipBox), Integer.valueOf(markObject_1_Ord));
		ContentObject contentObject_1 = xJdfNodeFactory.createContentObject(new Matrix(contentObject_1_CTM), new Rectangle(contentObject_1_ClipBox), Integer.valueOf(contentObject_1_Ord), new Matrix(
				contentObject_1_TrimCTM), new XYPair(contentObject_1_TrimSize));
		ContentObject contentObject_2 = xJdfNodeFactory.createContentObject(new Matrix(contentObject_2_CTM), new Rectangle(contentObject_2_ClipBox), Integer.valueOf(contentObject_2_Ord), new Matrix(
				contentObject_2_TrimCTM), new XYPair(contentObject_2_TrimSize));
		MarkObject markObject_2 = xJdfNodeFactory.createMarkObject(new Matrix(markObject_2_CTM), new Rectangle(markObject_2_ClipBox), Integer.valueOf(markObject_2_Ord));

		// act
		layoutBuilder = LayoutBuilder.newInstance(new Rectangle(surfaceContentsBox));

		layoutBuilder.addPlacedObject(markObject_1);
		layoutBuilder.addPlacedObject(contentObject_1);
		layoutBuilder.addPlacedObject(contentObject_2);
		layoutBuilder.addPlacedObject(markObject_2);

		// assert
		String actual;
		byte[] bytes = marsahlResultParameter(layoutBuilder);

		actual = getXPathValue(bytes, "/xjdf:XJDF/xjdf:ParameterSet[@Name='Layout']/xjdf:Parameter/xjdf:Layout/@SurfaceContentsBox");
		Assert.assertEquals("SurfaceContentsBox is wrong.", surfaceContentsBox, actual);

		actual = getXPathValue(bytes, "/xjdf:XJDF/xjdf:ParameterSet[@Name='Layout']/xjdf:Parameter/xjdf:Layout/xjdf:MarkObject[1]/@Ord");
		Assert.assertEquals("SurfaceContentsBox is wrong.", markObject_1_Ord, actual);

		actual = getXPathValue(bytes, "/xjdf:XJDF/xjdf:ParameterSet[@Name='Layout']/xjdf:Parameter/xjdf:Layout/xjdf:ContentObject[1]/@ClipBox");
		Assert.assertEquals("SurfaceContentsBox is wrong.", contentObject_1_ClipBox, actual);

		actual = getXPathValue(bytes, "/xjdf:XJDF/xjdf:ParameterSet[@Name='Layout']/xjdf:Parameter/xjdf:Layout/xjdf:ContentObject[2]/@ClipBox");
		Assert.assertEquals("SurfaceContentsBox is wrong.", contentObject_2_ClipBox, actual);

		actual = getXPathValue(bytes, "/xjdf:XJDF/xjdf:ParameterSet[@Name='Layout']/xjdf:Parameter/xjdf:Layout/xjdf:MarkObject[2]/@Ord");
		Assert.assertEquals("SurfaceContentsBox is wrong.", markObject_2_Ord, actual);
	}
}
