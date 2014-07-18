package org.cip4.lib.xjdf.merger;

import java.util.List;

/**
 * Class for combining multiple mergers into a single merger.
 * Every merge will be performed by the first merger able to perform the merge.
 *
 * @param <T> Type of objects that can be merged.
 */
class CombinedMerger<T> extends BaseMerger<T> {

    /**
     * List of mergers to utilize.
     */
    private final List<BaseMerger<? extends T>> mergers;

    /**
     * Constructor.
     *
     * @param mergers List of merges to utilize.
     */
    CombinedMerger(final List<BaseMerger<? extends T>> mergers) {
        this.mergers = mergers;
    }

    @SuppressWarnings("unchecked")
    @Override
    void merge(final T baseObject, final T mergeObject) throws MergeConflictException {
        BaseMerger<? extends T> merger = getMatchingMerger(baseObject, mergeObject);
        ((BaseMerger<T>) merger).merge(baseObject, mergeObject);
    }

    @Override
    boolean isMergeable(final Object baseObject, final Object mergeObject) {
        return null != getMatchingMerger(baseObject, mergeObject);
    }

    /**
     * Find the first merger that is able to merge mergeObject into baseObject.
     *
     * @param baseObject Object to merge into.
     * @param mergeObject Object that will be merged.
     *
     * @return first matching merger, or null if no merger can perform the merge.
     */
    BaseMerger<? extends T> getMatchingMerger(final Object baseObject, final Object mergeObject) {
        for (BaseMerger<? extends T> merger : mergers) {
            if (merger.isMergeable(baseObject, mergeObject)) {
                return merger;
            }
        }
        return null;
    }

}
