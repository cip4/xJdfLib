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
package org.cip4.lib.xjdf.type;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * Abstract XJdf Data Type.
 * @author stefan.meissner
 * @date 19.02.2013
 */
public abstract class AbstractXJdfType<ValueType, BoundType> extends XmlAdapter<ValueType, BoundType> {

}
