package org.cip4.lib.xjdf;

import javax.xml.bind.JAXBException;

import org.cip4.lib.xjdf.xml.XJdfConstants;
import org.cip4.lib.xjdf.xml.internal.JAXBContextFactory;

/**
 * Factory class for global library initialization. :-)
 * @author stefan.meissner
 */
public class XJdfFactory implements Runnable {

	/**
	 * Private custom constructor.
	 */
	private XJdfFactory(boolean initAsync) {

		// init
		if (initAsync) {

			// synchronous call
			new Thread(this).start();

		} else {

			// synchronous call
			run();
		}

	}

	/**
	 * Initialize the xJdf Library.
	 */
	public static void init() throws JAXBException {

		// init JAXB
		initXJdf();

		// init constants
		initXJdfConstants();
	}

	/**
	 * Initialize the JAXB framework.
	 */
	public static void initXJdf() throws JAXBException {

		// init JAXB framework
		JAXBContextFactory.init();
	}

	/**
	 * Initialize XJDF Constants.
	 */
	public static void initXJdfConstants() {
		// init constants
		@SuppressWarnings("unused")
		String tmp;
		tmp = XJdfConstants.NAMESPACE_JDF20;
		tmp = XJdfConstants.XJDF_LIB_VERSION;
		tmp = XJdfConstants.XJDF_LIB_BUILD_DATE;

		byte[] bytes = XJdfConstants.XJDF_XSD_BYTES;
	}

	/**
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {

		// init JAXB
		try {
			initXJdf();
		} catch (JAXBException e) {
			throw new AssertionError(e);
		}

		// init XJDF Constants
		XJdfFactory.initXJdfConstants();

		// init PrintTalk Constants
		initXJdfConstants();
	}
}
