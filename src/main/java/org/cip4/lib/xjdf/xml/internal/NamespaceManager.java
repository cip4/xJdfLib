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
package org.cip4.lib.xjdf.xml.internal;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.xml.namespace.NamespaceContext;

/**
 * Implementation of the NamespaceContext.
 * @author s.meissner
 */
public class NamespaceManager implements NamespaceContext {

	private final Map<String, String> namespaces;

	/**
	 * Default constructor.
	 */
	public NamespaceManager() {
		// initialize namespaces
		namespaces = new HashMap<String, String>(5);
	}

	/**
	 * Append new namespace.
	 * @param prefix Prefix for namespace.
	 * @param uri URI of namespace.
	 */
	public void addNamespace(String prefix, String uri) {
		namespaces.put(prefix, uri);
	}

	/**
	 * @see javax.xml.namespace.NamespaceContext#getNamespaceURI(java.lang.String)
	 */
	@Override
	public String getNamespaceURI(String prefix) {
		// return name space
		return namespaces.get(prefix);
	}

	/**
	 * @see javax.xml.namespace.NamespaceContext#getPrefix(java.lang.String)
	 */
	@Override
	public String getPrefix(String namespaceURI) {
		// not supported
		throw new UnsupportedOperationException();
	}

	/**
	 * @see javax.xml.namespace.NamespaceContext#getPrefixes(java.lang.String)
	 */
	@Override
	public Iterator getPrefixes(String namespaceURI) {
		// not supported
		throw new UnsupportedOperationException();
	}

}
