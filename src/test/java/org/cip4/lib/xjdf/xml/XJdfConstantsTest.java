/**
 * All rights reserved by
 * 
 * flyeralarm GmbH
 * Alfred-Nobel-Straße 18
 * 97080 Würzburg
 *
 * info@flyeralarm.com
 * http://www.flyeralarm.com
 */
package org.cip4.lib.xjdf.xml;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import junit.framework.Assert;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

/**
 * JUnit test case for XmlConstants class.
 * @author s.meissner
 * @date 06.03.2012
 */
public class XJdfConstantsTest {

	private static final String RES_JDF20_XSD = "/org/cip4/lib/xjdf/xsd/JDF20.xsd";

	/**
	 * JUnit test
	 * @throws IOException
	 */
	@Test
	public void testNamespaceJdf20() throws IOException {

		// arrange
		InputStream is = XJdfConstantsTest.class.getResourceAsStream(RES_JDF20_XSD);

		ByteArrayOutputStream os = new ByteArrayOutputStream();
		IOUtils.copy(is, os);
		String doc = new String(os.toByteArray());

		int i = doc.indexOf("xmlns=\"") + 7;
		int n = doc.indexOf("\"", i);

		String expectedNs = doc.substring(i, n);

		// act
		String actualNs = XJdfConstants.NAMESPACE_JDF20;

		// assert
		Assert.assertEquals("Namespace JDF20 is wrong.", expectedNs, actualNs);
	}

	/**
	 * JUnit test
	 * @throws IOException
	 */
	@Test
	public void testLoadLibraryVersion() throws IOException {

		// arrange

		// act
		String val = XJdfConstants.XJDF_LIB_VERSION;

		// assert
		// Assert.assertEquals("XJDF library version is wrong.", "", val);
	}
}
