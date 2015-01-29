package org.cip4.lib.xjdf.xml.internal;

import org.apache.commons.io.FileUtils;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.Assert.*;

public class AbstractXmlUnpackagerTest {

    private final String PACKAGE = AbstractXmlUnpackagerTest.class.getResource("../package.zip").getFile();
    private final String INDEX_FILE = "index.xml";
    private final String INDEX_CONTENT = "<?xml version=\"1.0\"?>";
    private final String RESOURCE_FILE = "foo.txt";
    private final String RESOURCE_CONTENT = "bar";

    @Rule
    public TemporaryFolder targetDir = new TemporaryFolder();

    private class ConcreteXmlUnpackager extends AbstractXmlUnpackager {

        /**
         * Custom constructor. Accepting a package path for initializing.
         *
         * @param pathPackage Path of the package.
         *
         * @throws IOException Is thrown in case an IOExcetion occurs.
         */
        public ConcreteXmlUnpackager(final String pathPackage) throws IOException {
            super(pathPackage);
        }

        @Override
        protected String[] getMasterExtension() {
            return new String[]{"xml"};
        }
    }

    @Test
    public void unpackageZipTempNoArg() throws Exception {
        AbstractXmlUnpackager unpackager = new ConcreteXmlUnpackager(PACKAGE);
        String index = unpackager.unpackageZipTemp();
        Path indexPath = Paths.get(index);
        try {
            assertTrue(Files.exists(indexPath));
            assertTrue(Files.exists(indexPath.getParent().resolve(RESOURCE_FILE)));
            assertTrue(indexPath.endsWith(INDEX_FILE));
            assertTrue(indexPath.getParent().getFileName().toString().startsWith("cip4_"));
        } finally {
            deleteDirectory(indexPath.getParent());
        }
    }

    @Test
    public void unpackageZipTemp() throws Exception {
        AbstractXmlUnpackager unpackager = new ConcreteXmlUnpackager(PACKAGE);
        String index = unpackager.unpackageZipTemp("foo");
        Path indexPath = Paths.get(index);
        try {
            assertTrue(Files.exists(indexPath));
            assertTrue(Files.exists(indexPath.getParent().resolve(RESOURCE_FILE)));
            assertTrue(indexPath.endsWith(INDEX_FILE));
            assertTrue(indexPath.getParent().getFileName().toString().startsWith("foo_"));
        } finally {
            deleteDirectory(indexPath.getParent());
        }
    }

    @Test
    public void unpackageZip() throws Exception {
        AbstractXmlUnpackager unpackager = new ConcreteXmlUnpackager(PACKAGE);
        String index = unpackager.unpackageZip(targetDir.getRoot().toString());
        Path indexPath = Paths.get(index);
        assertTrue(Files.exists(indexPath));
        assertTrue(Files.exists(indexPath.getParent().resolve(RESOURCE_FILE)));
        assertTrue(indexPath.endsWith(INDEX_FILE));
        assertEquals(targetDir.getRoot().toPath(), indexPath.getParent());
    }

    @Test
    public void unpackageZipMultipleTimes() throws Exception {

        AbstractXmlUnpackager unpackager = new ConcreteXmlUnpackager(PACKAGE);
        File target1 = targetDir.newFolder();
        unpackager.unpackageZip(target1.toString());

        File target2 = targetDir.newFolder();
        String index = unpackager.unpackageZip(target2.toString());

        Path indexPath = Paths.get(index);
        assertTrue(Files.exists(indexPath));
        assertTrue(Files.exists(indexPath.getParent().resolve(RESOURCE_FILE)));
        assertTrue(indexPath.endsWith(INDEX_FILE));
        assertEquals(target2.toPath(), indexPath.getParent());
    }

    @Test
    public void findMasterDocumentPath() throws Exception {
        AbstractXmlUnpackager unpackager = new ConcreteXmlUnpackager(PACKAGE);
        assertEquals(INDEX_FILE, unpackager.findMasterDocumentPath());
    }

    @Test
    public void findMasterDocument() throws Exception {
        AbstractXmlUnpackager unpackager = new ConcreteXmlUnpackager(PACKAGE);
        assertEquals(INDEX_CONTENT, new String(unpackager.findMasterDocument()));
    }

    @Test
    public void extractFile() throws Exception {
        AbstractXmlUnpackager unpackager = new ConcreteXmlUnpackager(PACKAGE);
        assertEquals(RESOURCE_CONTENT, new String(unpackager.extractFile(RESOURCE_FILE)));
    }

    @Test
    public void extractFileMultipleTimes() throws Exception {
        AbstractXmlUnpackager unpackager = new ConcreteXmlUnpackager(PACKAGE);
        assertEquals(RESOURCE_CONTENT, new String(unpackager.extractFile(RESOURCE_FILE)));
        assertEquals(RESOURCE_CONTENT, new String(unpackager.extractFile(RESOURCE_FILE)));
    }

    @Test
    public void getMasterExtension() throws Exception {
        AbstractXmlUnpackager unpackager = new ConcreteXmlUnpackager(PACKAGE);
        assertArrayEquals(new String[]{"xml"}, unpackager.getMasterExtension());
    }

    private void deleteDirectory(final Path directory) throws IOException {
        FileUtils.deleteDirectory(directory.toFile());
    }
}