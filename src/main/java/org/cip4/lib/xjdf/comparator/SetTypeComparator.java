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
package org.cip4.lib.xjdf.comparator;

import java.util.Comparator;

import javax.xml.bind.JAXBElement;

import org.apache.commons.lang.StringUtils;
import org.cip4.lib.xjdf.schema.SetType;

/**
 * Comparator of elements derived from SetType elements.
 * @author s.meissner
 * @date 05.09.2013
 */
public class SetTypeComparator implements Comparator<JAXBElement<? extends SetType>> {

	/**
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(JAXBElement<? extends SetType> o1, JAXBElement<? extends SetType> o2) {

		// get name attributes
		String exprOne = o1.getValue().getName();
		String exprTwo = o2.getValue().getName();

		// extend by process usage
		String usageOne = o1.getValue().getProcessUsage();
		String usageTwo = o2.getValue().getProcessUsage();

		if (!StringUtils.isEmpty(usageOne)) {
			exprOne += usageOne;
		}

		if (!StringUtils.isEmpty(usageTwo)) {
			exprTwo += usageTwo;
		}

		// compare and return
		return exprOne.compareTo(exprTwo);
	}

}
