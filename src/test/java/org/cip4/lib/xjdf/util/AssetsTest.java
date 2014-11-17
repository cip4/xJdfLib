package org.cip4.lib.xjdf.util;

import org.cip4.lib.xjdf.schema.Parameter;
import org.cip4.lib.xjdf.schema.ParameterSet;
import org.cip4.lib.xjdf.schema.ParameterType;
import org.cip4.lib.xjdf.schema.Part;
import org.cip4.lib.xjdf.schema.SetType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AssetsTest {

    private class SimpleAssets extends Assets<ParameterSet, Parameter, ParameterType> {
        /**
         * Constructor.
         *
         * @param assetSets List of sets of assets to operate on.
         */
        public SimpleAssets(@NotNull final List<SetType> assetSets) {
            super(assetSets);
        }

        @NotNull
        @Override
        <V extends ParameterType> Parameter createAsset(
            @NotNull final V assetType, @Nullable final Part partition
        ) {
            return getNodeFactory().createParameter(assetType, partition);
        }

        @Override
        String getAssetName(@NotNull final Parameter asset) {
            return asset.getClass().getSimpleName();
        }

        @NotNull
        @Override
        ParameterSet createSet() {
            return new ParameterSet();
        }

        @Override
        void addAssets(@NotNull final ParameterSet assetSet, @NotNull final Parameter asset) {
            assetSet.getParameter().add(asset);
        }
    }

    @Test
    public void testAddAsset() throws Exception {
        List<SetType> assetSets = new ArrayList<>();
        Assets<ParameterSet, Parameter, ParameterType> assets = new SimpleAssets(assetSets);
        Parameter parameter = Mockito.mock(Parameter.class);
        assets.addAsset(parameter, "Testing");
        assertEquals(1, assetSets.size());
        assertEquals(parameter.getClass().getSimpleName(), assetSets.get(0).getName());
        assertEquals("Testing", assetSets.get(0).getProcessUsage());
        SetType setType = assetSets.get(0);
        assertTrue(setType instanceof ParameterSet);
        ParameterSet parameterSet = (ParameterSet) setType;
        assertEquals(1, parameterSet.getParameter().size());
        assertEquals(parameter, parameterSet.getParameter().get(0));
    }

    @Test
    public void testAddAssetWithCorrespondingSetPresent() throws Exception {
        Parameter parameter = Mockito.mock(Parameter.class);
        List<SetType> assetSets = new ArrayList<>();
        ParameterSet set = new ParameterSet().withProcessUsage("Testing").withName(parameter.getClass().getSimpleName());
        assertEquals(0, set.getParameter().size());
        assetSets.add(set);
        Assets<ParameterSet, Parameter, ParameterType> assets = new SimpleAssets(assetSets);

        assets.addAsset(parameter, "Testing");
        assertEquals(1, assetSets.size());
        assertSame(set, assetSets.get(0));

        ParameterSet parameterSet = (ParameterSet) assetSets.get(0);
        assertEquals(1, parameterSet.getParameter().size());
        assertEquals(parameter, parameterSet.getParameter().get(0));
    }

    @Test
    public void testFindAssetSetNoMatchingName() throws Exception {
        List<SetType> assetSets = new ArrayList<>();
        SetType set = Mockito.mock(ParameterSet.class);
        Mockito.when(set.getName()).thenReturn("Asset1");
        Mockito.when(set.getProcessUsage()).thenReturn("ProcessUsage");
        assetSets.add(set);

        Assets<ParameterSet, Parameter, ParameterType> assets = new SimpleAssets(assetSets);

        assertNull(assets.findAssetSet("Asset2", "ProcessUsage"));
    }

    @Test
    public void testFindAssetSetNoMatchingProcessUsage() throws Exception {
        List<SetType> assetSets = new ArrayList<>();
        SetType set = Mockito.mock(SetType.class);
        Mockito.when(set.getName()).thenReturn("Asset");
        Mockito.when(set.getProcessUsage()).thenReturn("ProcessUsage1");
        assetSets.add(set);

        Assets<ParameterSet, Parameter, ParameterType> assets = new SimpleAssets(assetSets);

        assertNull(assets.findAssetSet("Asset", "ProcessUsage2"));
    }

    @Test
    public void testFindAssetSet() throws Exception {
        List<SetType> assetSets = new ArrayList<>();
        SetType set1 = Mockito.mock(SetType.class);
        Mockito.when(set1.getName()).thenReturn("Asset1");
        Mockito.when(set1.getProcessUsage()).thenReturn("ProcessUsage1");
        assetSets.add(set1);

        Assets<ParameterSet, Parameter, ParameterType> assets = new SimpleAssets(assetSets);

        assertSame(set1, assets.findAssetSet("Asset1", "ProcessUsage1"));
    }

    @Test
    public void testFindAssetSetRespectsProcessUsage() throws Exception {
        List<SetType> assetSets = new ArrayList<>();

        SetType set = Mockito.mock(SetType.class);
        Mockito.when(set.getName()).thenReturn("Asset");
        Mockito.when(set.getProcessUsage()).thenReturn("ProcessUsage2");
        assetSets.add(set);

        Assets<ParameterSet, Parameter, ParameterType> assets = new SimpleAssets(assetSets);

        assertSame(set, assets.findAssetSet("Asset", "ProcessUsage2"));
    }

    @Test
    public void testFindAssetSetRespectsName() throws Exception {
        List<SetType> assetSets = new ArrayList<>();

        SetType set = Mockito.mock(SetType.class);
        Mockito.when(set.getName()).thenReturn("Asset2");
        Mockito.when(set.getProcessUsage()).thenReturn("ProcessUsage1");
        assetSets.add(set);

        Assets<ParameterSet, Parameter, ParameterType> assets = new SimpleAssets(assetSets);

        assertSame(set, assets.findAssetSet("Asset2", "ProcessUsage1"));
    }

    @Test
    public void testFindAssetSetRespectsOrder() throws Exception {
        List<SetType> assetSets = new ArrayList<>();
        SetType set1 = Mockito.mock(SetType.class);
        Mockito.when(set1.getName()).thenReturn("Asset");
        Mockito.when(set1.getProcessUsage()).thenReturn("ProcessUsage");
        assetSets.add(set1);

        SetType set2 = Mockito.mock(SetType.class);
        Mockito.when(set2.getName()).thenReturn("Asset");
        Mockito.when(set2.getProcessUsage()).thenReturn("ProcessUsage");
        assetSets.add(set2);

        Assets<ParameterSet, Parameter, ParameterType> assets = new SimpleAssets(assetSets);

        assertSame(set1, assets.findAssetSet("Asset", "ProcessUsage"));
        assertNotSame(set2, assets.findAssetSet("Asset", "ProcessUsage"));
    }

    @Test
    public void testAddAssetSetLexicographic1() throws Exception {
        List<SetType> assetSets = new ArrayList<>();
        Assets<ParameterSet, Parameter, ParameterType> assets = new SimpleAssets(assetSets);

        ParameterSet a = new ParameterSet().withName("A");
        ParameterSet b = new ParameterSet().withName("B");
        assets.addAssetSet(b);
        assets.addAssetSet(a);

        assertEquals(a, assetSets.get(0));
        assertEquals(b, assetSets.get(1));
    }

    @Test
    public void testAddAssetSetLexicographic2() throws Exception {
        List<SetType> assetSets = new ArrayList<>();
        Assets<ParameterSet, Parameter, ParameterType> assets = new SimpleAssets(assetSets);

        ParameterSet a = new ParameterSet().withName("A");
        ParameterSet b = new ParameterSet().withName("B");
        assets.addAssetSet(a);
        assets.addAssetSet(b);

        assertEquals(a, assetSets.get(0));
        assertEquals(b, assetSets.get(1));
    }

    @Test
    public void testAddAssetSetSameName() throws Exception {
        List<SetType> assetSets = new ArrayList<>();
        Assets<ParameterSet, Parameter, ParameterType> assets = new SimpleAssets(assetSets);

        ParameterSet a1 = new ParameterSet().withName("A");
        ParameterSet a2 = new ParameterSet().withName("A");
        assets.addAssetSet(a1);
        assets.addAssetSet(a2);

        assertEquals(a1, assetSets.get(0));
        assertEquals(a2, assetSets.get(1));
    }

    @Test
    public void addAsset() throws Exception {
        List<SetType> assetSets = new ArrayList<>();
        Assets<ParameterSet, Parameter, ParameterType> assets = new SimpleAssets(assetSets);

        ParameterType assetType = Mockito.mock(ParameterType.class);
        Part part = Mockito.mock(Part.class);
        String processUsage = "Testing";

        assets.addAsset(assetType, part, processUsage);

        assertEquals(1, assetSets.size());
        ParameterSet assetSet = (ParameterSet) assetSets.get(0);
        assertSame(processUsage, assetSet.getProcessUsage());
        assertEquals(1, assetSet.getParameter().size());
        Parameter parameter = assetSet.getParameter().get(0);
        assertSame(part, parameter.getPart().get(0));
        assertSame(assetType, parameter.getParameterType().getValue());
    }
}