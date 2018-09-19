package org.cip4.lib.xjdf.xml;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit test case for XmlConstants class.
 * @author s.meissner
 */
public class XJdfConstantsTest {

	private static final String RES_JDF20_XSD = "/JDF20.xsd";

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
		assertEquals(expectedNs, actualNs, "Namespace JDF20 is wrong.");
	}

	/**
	 * JUnit test
	 */
	@Test
	public void testLoadLibraryVersion() {

		// arrange

		// act
		String val = XJdfConstants.XJDF_LIB_VERSION;

		// assert
		// assertEquals("", val, "XJDF library version is wrong.");
	}
}
