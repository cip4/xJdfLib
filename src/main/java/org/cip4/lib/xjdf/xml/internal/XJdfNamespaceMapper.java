package org.cip4.lib.xjdf.xml.internal;

import org.cip4.lib.xjdf.xml.XJdfConstants;

import com.sun.xml.bind.marshaller.NamespacePrefixMapper;

/**
 * XJDF Namespace Prefix Mapper for organizing namespace prefixes.
 * @author s.meissner
 */
public class XJdfNamespaceMapper extends NamespacePrefixMapper {

	private final String nsDefaultNamespace;

	/**
	 * Default constructor.
	 */
	public XJdfNamespaceMapper() {
		nsDefaultNamespace = null;
	}

	/**
	 * Custom constructor. <br>
	 * Accepting a String object as place holder for default namespace. This place holder later can be replaced by empty string.
	 */
	public XJdfNamespaceMapper(String nsDefaultNamespace) {
		this.nsDefaultNamespace = nsDefaultNamespace;
	}

	/**
	 * @see com.sun.xml.bind.marshaller.NamespacePrefixMapper#getPreferredPrefix(java.lang.String, java.lang.String, boolean)
	 */
	@Override
	public String getPreferredPrefix(String namespaceUri, String suggestion, boolean requirePrefix) {

		String result;

		if (namespaceUri.equals(XJdfConstants.NAMESPACE_JDF20)) {
			result = "xjdf";
		} else {
			// other namespace
			result = suggestion;
		}

		// return result
		return result;
	}

}
