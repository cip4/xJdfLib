package org.cip4.lib.xjdf.comparator;

import java.util.Comparator;

import org.apache.commons.lang3.StringUtils;
import org.cip4.lib.xjdf.schema.ResourceSet;

/**
 * Comparator of elements derived from ResourceSet elements.
 *
 * @author s.meissner
 * @author m.hartmann
 */
public class ResourceSetComparator implements Comparator<ResourceSet> {

    /**
     * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
     */
    @Override
    public final int compare(final ResourceSet o1, final ResourceSet o2) {
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
