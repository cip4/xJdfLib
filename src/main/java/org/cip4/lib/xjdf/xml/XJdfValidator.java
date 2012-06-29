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
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.cip4.lib.xjdf.xml.internal.AbstractXmlValidator;

/**
 * Validation of XJDF Documents based on XJDF schema file.
 * @author s.meissner
 * @date 11.04.2012
 */
public class XJdfValidator extends AbstractXmlValidator {

	/**
	 * Custom private constructor. Accepting XML Schema for initializing.
	 */
	private XJdfValidator(byte[] xsdFile) {
		super(xsdFile);
	}

	/**
	 * Factory method for getting a new XJdfValidator instance.
	 * @return New XJdfValidator Instance
	 */
	public static XJdfValidator newInstance() {

		// load xsd file
		InputStream is = XJdfValidator.class.getResourceAsStream(XJdfConstants.RES_JDF20_XSD);

		ByteArrayOutputStream bos;

		try {

			// convert input stream to byte array
			bos = new ByteArrayOutputStream();
			IOUtils.copy(is, bos);
			bos.close();

		} catch (Exception ex) {

			// error
			ex.printStackTrace();
			throw new AssertionError(ex);
		}

		// return new instance
		return new XJdfValidator(bos.toByteArray());
	}

}
