package org.cip4.lib.xjdf.merger;

import jakarta.xml.bind.JAXBElement;

/**
 * Class for merging objects that are wrapped in an JAXBElement.
 *
 * @param <T> Wrapped data type
 */
class JAXBElementMerger<T> extends BaseMerger<JAXBElement<T>> {

    /**
     * Merger to invoke on the wrapped elements.
     */
    private final BaseMerger<T> wrappedMerger;

    /**
     * Constructor.
     *
     * @param wrappedMerger Merger to invoke on the wrapped elements.
     */
    JAXBElementMerger(final BaseMerger<T> wrappedMerger) {
        this.wrappedMerger = wrappedMerger;
    }

    @Override
    void merge(final JAXBElement<T> baseObject, final JAXBElement<T> mergeObject) throws MergeConflictException {
        wrappedMerger.merge(baseObject.getValue(), mergeObject.getValue());
    }

    @Override
    boolean isMergeable(final Object baseObject, final Object mergeObject) {
        if (baseObject instanceof JAXBElement && mergeObject instanceof JAXBElement) {
            JAXBElement<?> baseSet = (JAXBElement<?>) baseObject;
            JAXBElement<?> mergeSet = (JAXBElement<?>) mergeObject;
            return wrappedMerger.isMergeable(baseSet.getValue(), mergeSet.getValue());
        }
        return false;
    }
}
