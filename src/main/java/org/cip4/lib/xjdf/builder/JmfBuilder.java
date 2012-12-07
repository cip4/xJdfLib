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

import java.util.Calendar;

import org.cip4.lib.xjdf.XJdfNodeFactory;
import org.cip4.lib.xjdf.convert.DateConverter;
import org.cip4.lib.xjdf.schema.JMF;
import org.cip4.lib.xjdf.schema.Message;
import org.cip4.lib.xjdf.xml.XJdfConstants;

/**
 * Implementation of a JMF Builder.
 * @author s.meissner
 * @date 07.12.2012
 */
public class JmfBuilder extends AbstractNodeBuilder<JMF> {

	private final XJdfNodeFactory xJdfNodeFactory;

	/**
	 * Private default constructor. Class cannot being instantiated from external.
	 */
	private JmfBuilder() {

		// initialize objects
		super(XJdfNodeFactory.newInstance().createJMF());

		xJdfNodeFactory = XJdfNodeFactory.newInstance();
	}

	/**
	 * Create and return a new instance of JmfBuilder which already contains values some attributes.
	 * @param senderID ID of Sender.
	 * @return New instance of JmfBuilder which already contains values for defined attributes.
	 */
	public static JmfBuilder newInstance(String senderID) {

		// return new instance
		return newInstance(senderID, null);
	}

	/**
	 * Create and return a new instance of JmfBuilder which already contains values some attributes.
	 * @param senderID ID of Sender.
	 * @return New instance of JmfBuilder which already contains values for defined attributes.
	 */
	public static JmfBuilder newInstance(String senderID, String deviceID) {

		// new instance
		JmfBuilder jmfBuilder = new JmfBuilder();

		// preconfiguration
		jmfBuilder.getJMF().setTimeStamp(DateConverter.date2String(Calendar.getInstance()));
		jmfBuilder.getJMF().setMaxVersion(XJdfConstants.XJDF_CURRENT_VERSION);
		jmfBuilder.getJMF().setVersion(XJdfConstants.XJDF_CURRENT_VERSION);
		jmfBuilder.getJMF().setDeviceID(deviceID);
		jmfBuilder.getJMF().setSenderID(senderID);

		// return instance
		return jmfBuilder;
	}

	/**
	 * Setter for JMF Message Element.
	 * @param message The Message.
	 * @return The current JmfBuilder Message.
	 */
	public void setMessage(Message message) {

		// get parameter name
		String messageName = message.getClass().getSimpleName();

		// create message node
		Message msg = xJdfNodeFactory.createMessage();

		// QName qname = new QName(XJdfConstants.NAMESPACE_JDF20, messageName);
		// JAXBElement obj = new JAXBElement(qname, message.getClass(), null, message);
		// msg.getIntentTypes().add(obj);
		//
		// // append intent to product
		// getJMF().get

	}

	/**
	 * Setter for JMF Message Element.
	 * @param message The Message.
	 * @return The current JmfBuilder Message.
	 */
	public Message getMessage(Message message) {
		return null;

	}

	/**
	 * Getter for JMF attribute.
	 * @return the JMF Message
	 */
	protected JMF getJMF() {
		return getNode();
	}
}
