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

import java.io.IOException;
import java.io.InputStream;

import org.cip4.lib.xjdf.xml.internal.AbstractXmlValidator;

/**
 * Validation of XJDF Documents based on XJDF schema file.
 * @author s.meissner
 * @date 11.04.2012
 */
public class XJdfValidator extends AbstractXmlValidator<XJdfValidator> {

	/**
	 * Custom constructor. Accepting a XJDF Stream for initializing.
	 */
	public XJdfValidator(InputStream xJdfStream) throws IOException {
		super(XJdfConstants.RES_JDF20_XSD, xJdfStream);
	}

}
