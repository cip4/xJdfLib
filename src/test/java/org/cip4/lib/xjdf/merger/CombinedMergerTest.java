package org.cip4.lib.xjdf.merger;

import org.cip4.lib.xjdf.schema.ObjectFactory;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class CombinedMergerTest {

    @Test
    public void testMerge() throws Exception {
        BaseMerger<Object> wrappedMerger = mock(BaseMerger.class);
        when(wrappedMerger.isMergeable(any(), any())).thenReturn(true);

        List<BaseMerger<? extends Object>> mergers = new ArrayList<>(1);
        mergers.add(wrappedMerger);
        CombinedMerger<Object> combinedMerger = new CombinedMerger<>(mergers);

        combinedMerger.merge(1, 1);
        verify(wrappedMerger).merge(1,1);
    }

    @Test
    public void testIsMergeableNoMatchingMerger() throws Exception {
        CombinedMerger<Object> merger = new CombinedMerger(new ArrayList<>());
        assertFalse(merger.isMergeable(1, 1));
    }

    @Test
    public void testIsMergeable() throws Exception {
        BaseMerger<Object> wrappedMerger = mock(BaseMerger.class);
        when(wrappedMerger.isMergeable(any(), any())).thenReturn(true);
        List<BaseMerger<? extends Object>> mergers = new ArrayList<>(1);
        mergers.add(wrappedMerger);
        CombinedMerger<Object> combinedMerger = new CombinedMerger<>(mergers);

        assertTrue(combinedMerger.isMergeable(1, 1));
    }

    @Test
    public void testGetMatchingMerger() throws Exception {
        BaseMerger<Object> wrappedMerger1 = mock(BaseMerger.class);
        when(wrappedMerger1.isMergeable(any(), any())).thenReturn(false);
        BaseMerger<Object> wrappedMerger2 = mock(BaseMerger.class);
        when(wrappedMerger2.isMergeable(any(), any())).thenReturn(true);

        List<BaseMerger<? extends Object>> mergers = new ArrayList<>(2);
        mergers.add(wrappedMerger1);
        mergers.add(wrappedMerger2);
        CombinedMerger<Object> combinedMerger = new CombinedMerger<>(mergers);
        assertSame(wrappedMerger2, combinedMerger.getMatchingMerger(1, 1));
    }

    @Test
    public void testGetMatchingMergerNoMatch() throws Exception {
        BaseMerger<Object> wrappedMerger1 = mock(BaseMerger.class);
        when(wrappedMerger1.isMergeable(any(), any())).thenReturn(false);

        List<BaseMerger<? extends Object>> mergers = new ArrayList<>(1);
        mergers.add(wrappedMerger1);
        CombinedMerger<Object> combinedMerger = new CombinedMerger<>(mergers);
        assertNull(combinedMerger.getMatchingMerger(1, 1));
    }
}