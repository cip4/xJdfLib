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
package org.cip4.lib.xjdf;

import javax.xml.bind.JAXBException;

import org.cip4.lib.xjdf.xml.XJdfConstants;
import org.cip4.lib.xjdf.xml.internal.JAXBContextFactory;

/**
 * Factory class for globa library functionality.
 * @author stefan.meissner
 * @date 23.04.2012
 */
public class XJdfFactory {

	/**
	 * Initialize the xJdf Library.
	 * @throws JAXBException
	 */
	public static void init() throws JAXBException {

		// load JAXB framework
		JAXBContextFactory.init();

		// init constants
		@SuppressWarnings("unused")
		String tmp = XJdfConstants.NAMESPACE_JDF20;
	}
}
