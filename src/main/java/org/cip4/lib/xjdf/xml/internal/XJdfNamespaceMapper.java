package org.cip4.lib.xjdf.xml.internal;

import org.cip4.lib.xjdf.xml.XJdfConstants;
import org.glassfish.jaxb.runtime.marshaller.NamespacePrefixMapper;

/**
 * XJDF Namespace Prefix Mapper for organizing namespace prefixes.
 *
 * @author s.meissner
 */
public class XJdfNamespaceMapper extends NamespacePrefixMapper {

    private final boolean enforceNamespacePrefix;

    /**
     * Default constructor.
     */
    public XJdfNamespaceMapper(boolean enforceNamespacePrefix) {
        this.enforceNamespacePrefix = enforceNamespacePrefix;
    }


    /**
     * @see org.glassfish.jaxb.runtime.marshaller.NamespacePrefixMapper#getPreferredPrefix(java.lang.String, java.lang.String, boolean)
     */
    @Override
    public String getPreferredPrefix(String namespaceUri, String suggestion, boolean requirePrefix) {
        String result;

        if(enforceNamespacePrefix || requirePrefix) {
            if (namespaceUri.equals(XJdfConstants.NAMESPACE_JDF20)) {
                result = "xjdf";
            } else {
                // other namespace
                result = suggestion;
            }
        } else {
            result = "";
        }

        // return result
        return result;
    }

}
