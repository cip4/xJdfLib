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
 */
public abstract class AbstractXJdfType<ValueType, BoundType> extends XmlAdapter<ValueType, BoundType> {

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public abstract String toString();

	/**
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((toString() == null) ? 0 : toString().hashCode());
		return result;
	}

	/**
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractXJdfType other = (AbstractXJdfType) obj;
		if (toString() == null) {
			if (other.toString() != null)
				return false;
		} else if (!toString().equals(other.toString()))
			return false;
		return true;
	}

}
