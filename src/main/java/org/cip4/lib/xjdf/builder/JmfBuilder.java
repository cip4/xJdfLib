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
import org.cip4.lib.xjdf.schema.XJMF;
import org.cip4.lib.xjdf.schema.Message;
import org.cip4.lib.xjdf.type.DateTime;
import org.cip4.lib.xjdf.xml.XJdfConstants;

/**
 * Implementation of a JMF Builder.
 * @author s.meissner
 */
public class JmfBuilder extends AbstractNodeBuilder<XJMF> {

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
	public JmfBuilder(final String senderID) {
		super(new XJdfNodeFactory().createXJMF());
		xJdfNodeFactory = new XJdfNodeFactory();

		getXJMF().setTimeStamp(new DateTime());
		getXJMF().setVersion(XJdfConstants.XJDF_CURRENT_VERSION);
		getXJMF().setSenderID(senderID);
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
		// getXJMF().get

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
	protected XJMF getXJMF() {
		return getNode();
	}
}
