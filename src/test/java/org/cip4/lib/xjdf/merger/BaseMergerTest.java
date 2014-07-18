package org.cip4.lib.xjdf.merger;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BaseMergerTest {

    private class Mutable {
        int value = 0;
        boolean mergeable = true;

        private Mutable(final int value) {
            this.value = value;
        }

        public Mutable setMergeable(final boolean mergeable) {
            this.mergeable = mergeable;
            return this;
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Mutable mutable = (Mutable) o;

            if (value != mutable.value) return false;

            return true;
        }

        @Override
        public int hashCode() {
            return value;
        }
    }

    private class MockClass extends BaseMerger<Mutable> {
        @Override
        void merge(final Mutable baseObject, final Mutable mergeObject) throws MergeConflictException {
            baseObject.value = mergeObject.value;
        }

        @Override
        boolean isMergeable(final Object baseObject, final Object mergeObject) {
            return super.isMergeable(baseObject, mergeObject)
                && ((baseObject instanceof Mutable
                && ((Mutable) baseObject).mergeable
                && ((Mutable) mergeObject).mergeable)
                || !(baseObject instanceof Mutable));
        }
    }

    @Test
    public void testIsMergeableDifferentClasses() throws Exception {
        BaseMerger<Mutable> merger = new MockClass();
        assertFalse(merger.isMergeable(1, 2d));
    }

    @Test
    public void testIsMergeableIdenticalClasses() throws Exception {
        BaseMerger<Mutable> merger = new MockClass();
        assertTrue(merger.isMergeable(1, 2));
    }

    @Test
    public void testMerge1() throws Exception {
        BaseMerger<Mutable> merger = new MockClass();
        List<Mutable> baseList = new ArrayList<>();
        baseList.add(new Mutable(1).setMergeable(false));
        baseList.add(new Mutable(2));
        List<Mutable> mergeList = new ArrayList<>();
        mergeList.add(new Mutable(3));
        merger.merge(baseList, mergeList);
        assertEquals(2, baseList.size());
        assertEquals(new Mutable(1), baseList.get(0));
        assertEquals(new Mutable(3), baseList.get(1));
    }

    @Test
    public void testMergeWithoutMatch() throws Exception {
        BaseMerger<Mutable> merger = new MockClass();
        List<Mutable> baseList = new ArrayList<>();
        merger.merge(baseList, new Mutable(2));
        assertEquals(1, baseList.size());
        assertEquals(new Mutable(2), baseList.get(0));
    }

    @Test
    public void testMergeWithOneMatch() throws Exception {
        BaseMerger<Mutable> merger = new MockClass();
        List<Mutable> baseList = new ArrayList<>();
        baseList.add(new Mutable(1));
        merger.merge(baseList, new Mutable(2));
        assertEquals(1, baseList.size());
        assertEquals(new Mutable(2), baseList.get(0));
    }

    @Test
    public void testMergeWithMultipleMatches() throws Exception {
        BaseMerger<Mutable> merger = new MockClass();
        List<Mutable> baseList = new ArrayList<>();
        baseList.add(new Mutable(1));
        baseList.add(new Mutable(3));
        merger.merge(baseList, new Mutable(2));
        assertEquals(2, baseList.size());
        assertEquals(new Mutable(2), baseList.get(0));
        assertEquals(new Mutable(3), baseList.get(1));
    }
}