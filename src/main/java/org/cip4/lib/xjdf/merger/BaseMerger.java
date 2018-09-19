package org.cip4.lib.xjdf.merger;

import java.util.Collection;

/**
 * Base class for merging all kind of nodes in a xjdf document.
 * This class should be extended in order to implement a merger for a specific type of node.
 *
 * @param <T> Type of node that will be merged.
 */
abstract class BaseMerger<T> {

    /**
     * Merge two nodes with each other.
     * All information in mergeObject will be written to baseObject.
     * The merger will try to add the information in mergeObject to baseObject.
     * If the information can not be added the value in baseObject will be overwrite by the value in mergeObject.
     *
     * @param baseObject Object to merge into.
     * @param mergeObject Object that will be merged.
     *
     * @throws MergeConflictException if merging fails.
     */
    abstract void merge(final T baseObject, final T mergeObject) throws MergeConflictException;

    /**
     * Test if two objects can be merged into each other.
     *
     * @param baseObject Object to merge into.
     * @param mergeObject Object that will be merged.
     *
     * @return true if mergeObject can be merged into baseObject
     */
    boolean isMergeable(final Object baseObject, final Object mergeObject) {
        return baseObject.getClass().isAssignableFrom(mergeObject.getClass())
            && mergeObject.getClass().isAssignableFrom(baseObject.getClass());
    }

    /**
     * Merge a collection of objects into another collection of objects.
     * For every entry in mergeObjects this method will try to find a matching entry in baseObjects.
     * If no object in baseObjects is suitable for merging, the entry from mergeObjects will be added to baseObjects.
     * If one or more suitable candidates are found the entry from mergeObjects will be merged with the first candidate.
     *
     * @param baseObjects Collection of objects to merge into.
     * @param mergeObjects Collection of objects that will be merged.
     *
     * @throws MergeConflictException if merging fails.
     */
    void merge(final Collection<T> baseObjects, final Collection<T> mergeObjects) throws MergeConflictException {
        for (T mergeObject : mergeObjects) {
            merge(baseObjects, mergeObject);
        }
    }

    /**
     * Merge a object into a collection of objects.
     * This method will search an entry in baseObjects allowing mergeObject to be merged into.
     * If one or more candidates are found, mergeObject will be merged into the first candidate.
     * If no candidate is found, mergeObject will be added to baseObjects.
     *
     * @param baseObjects Collection of objects to merge into.
     * @param mergeObject Object that will be merged.
     *
     * @throws MergeConflictException if merging with the first candidate fails.
     */
    void merge(final Collection<T> baseObjects, final T mergeObject) throws MergeConflictException {
        for (T baseObject : baseObjects) {
            if (isMergeable(baseObject, mergeObject)) {
                merge(baseObject, mergeObject);
                return;
            }
        }
        baseObjects.add(mergeObject);
    }

}
