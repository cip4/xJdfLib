package org.cip4.lib.xjdf.comparator;

import java.util.Comparator;

import org.apache.commons.lang.StringUtils;
import org.cip4.lib.xjdf.schema.SetType;

/**
 * Comparator of elements derived from SetType elements.
 *
 * @author s.meissner
 * @author m.hartmann
 */
public class SetTypeComparator implements Comparator<SetType> {

    /**
     * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
     */
    @Override
    public final int compare(final SetType o1, final SetType o2) {
        // get name attributes
        String exprOne = o1.getName();
        String exprTwo = o2.getName();

        // extend by process usage
        String usageOne = o1.getProcessUsage();
        String usageTwo = o2.getProcessUsage();

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
