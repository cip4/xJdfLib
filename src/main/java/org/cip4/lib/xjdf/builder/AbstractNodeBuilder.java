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
package org.cip4.lib.xjdf.builder;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.cip4.lib.xjdf.xml.internal.JAXBContextFactory;
import org.w3c.dom.Node;

/**
 * Abstract Builder implementation where all builders are derived from.
 * @author s.meissner
 * @date 05.03.2012
 */
public abstract class AbstractNodeBuilder<T> {

	private final T node;

	/**
	 * Default constructor.
	 */
	protected AbstractNodeBuilder(T node) {
		// initialize node
		this.node = node;
	}
	
	/**
	 * Custom constructor. Accepting a Node object for initializing. !! THIS NODE MUST BE NAMESPACE AWARE !!
	 * @param node Namespace aware node object.
	 * @throws JAXBException Is thrown in case an exception.
	 */
	protected AbstractNodeBuilder(Node node, Class<T> typeParameterClass) throws JAXBException {

		Unmarshaller u = JAXBContextFactory.getInstance().createUnmarshaller();
		JAXBElement<T> element = u.unmarshal(node, typeParameterClass);
		T obj = element.getValue();
		this.node = obj;
	}

	/**
	 * Getter for node attribute.
	 * @return the node
	 */
	protected T getNode() {
		return node;
	}

	/**
	 * Build and return the Node.
	 * @return Node as DOM tree.
	 */
	public final T build() {
		return node;
	}
}
