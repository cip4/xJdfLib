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

import org.cip4.lib.xjdf.XJdfNodeFactory;
import org.cip4.lib.xjdf.schema.JMF;
import org.cip4.lib.xjdf.schema.Message;
import org.cip4.lib.xjdf.type.DateTime;
import org.cip4.lib.xjdf.xml.XJdfConstants;

/**
 * Implementation of a JMF Builder.
 * @author s.meissner
 * @date 07.12.2012
 */
public class JmfBuilder extends AbstractNodeBuilder<JMF> {

	private final XJdfNodeFactory xJdfNodeFactory;

	/**
	 * Default constructor.
	 */
	public JmfBuilder() {
		this(null);
	}

	/**
	 * Custom Constructor. Creates a new instance of JmfBuilder which already contains values some attributes.
	 * @param senderID ID of Sender.
	 */
	public JmfBuilder(String senderID) {

		// chain
		this(senderID, null);
	}

	/**
	 * Custom Constructor. Creates a new instance of JmfBuilder which already contains values some attributes.
	 * @param senderID ID of Sender.
	 * @param deviceID ID of Device.
	 */
	public JmfBuilder(String senderID, String deviceID) {

		// initialize objects
		super(new XJdfNodeFactory().createJMF());
		xJdfNodeFactory = new XJdfNodeFactory();

		// preconfiguration
		getJMF().setTimeStamp(new DateTime());
		getJMF().setMaxVersion(XJdfConstants.XJDF_CURRENT_VERSION);
		getJMF().setVersion(XJdfConstants.XJDF_CURRENT_VERSION);
		getJMF().setDeviceID(deviceID);
		getJMF().setSenderID(senderID);
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
