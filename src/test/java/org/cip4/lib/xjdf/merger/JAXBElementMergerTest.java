package org.cip4.lib.xjdf.merger;

import org.junit.jupiter.api.Test;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class JAXBElementMergerTest {

    @Test
    public void testMerge() throws Exception {
        BaseMerger<Integer> wrappedMerger = mock(BaseMerger.class);
        when(wrappedMerger.isMergeable(any(), any())).thenReturn(true);

        JAXBElementMerger<Integer> jaxbMerger = new JAXBElementMerger<>(wrappedMerger);
        JAXBElement<Integer> wrappedOne = new JAXBElement<>(new QName("i"), Integer.class, 1);
        jaxbMerger.merge(wrappedOne, wrappedOne);

        verify(wrappedMerger).merge(1, 1);
    }

    @Test
    public void testIsMergeable() throws Exception {
        BaseMerger<Integer> wrappedMerger = mock(BaseMerger.class);
        when(wrappedMerger.isMergeable(any(), any())).thenReturn(false);

        JAXBElementMerger<Integer> jaxbMerger = new JAXBElementMerger<>(wrappedMerger);
        JAXBElement<Integer> wrappedOne = new JAXBElement<>(new QName("i"), Integer.class, 1);
        assertFalse(jaxbMerger.isMergeable(wrappedOne, wrappedOne));

        verify(wrappedMerger).isMergeable(1, 1);
    }

    @Test
    public void testIsMergeableWithDifferentClass() throws Exception {
        BaseMerger<Integer> wrappedMerger = mock(BaseMerger.class);
        when(wrappedMerger.isMergeable(any(), any())).thenReturn(true);

        JAXBElementMerger<Integer> jaxbMerger = new JAXBElementMerger<>(wrappedMerger);
        assertFalse(jaxbMerger.isMergeable(1, 1));
    }

}