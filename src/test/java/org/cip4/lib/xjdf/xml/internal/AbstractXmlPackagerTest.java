package org.cip4.lib.xjdf.xml.internal;

import org.cip4.lib.xjdf.XJdfDocument;
import org.cip4.lib.xjdf.schema.FileSpec;
import org.cip4.lib.xjdf.schema.ObjectFactory;
import org.cip4.lib.xjdf.schema.Preview;
import org.cip4.lib.xjdf.schema.Resource;
import org.cip4.lib.xjdf.schema.ResourceSet;
import org.cip4.lib.xjdf.schema.RunList;
import org.cip4.lib.xjdf.schema.XJDF;
import org.cip4.lib.xjdf.type.URI;
import org.cip4.lib.xjdf.xml.XJdfConstants;
import org.cip4.lib.xjdf.xml.XJdfParser;
import org.cip4.lib.xjdf.xml.legacy.XJdfPackager;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.zip.ZipInputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AbstractXmlPackagerTest {

    private class MinimalXmlPackager extends AbstractXmlPackager<XJDF> {
        MinimalXmlPackager(final OutputStream out) {
            super(out);
        }

        @Override
        protected byte[] parseDocument(final XJDF xjdf, final boolean validation) throws Exception {
            return new XJdfParser<XJDF>().writeXml(xjdf);
        }
    }

//    @Test
//    public void packageXmlWritesDocumentFirst() throws Exception {
//        final ByteArrayOutputStream out = new ByteArrayOutputStream();
//        final AbstractXmlPackager<XJDF> packager = new MinimalXmlPackager(out);
//
//        final java.net.URI sourceUri = AbstractXmlPackagerTest.class.getResource("../../test.pdf").toURI();
//        final String preview = "preview/datei.pdf";
//        final String fileSpec = "filespec/datei.pdf";
//
//        XJdfDocument xJdfDocument = new XJdfDocument("JobID", "Product");
//        xJdfDocument.addResourceSet(new Preview().withFileSpec(new FileSpec().withURL(new URI(sourceUri, preview))), ResourceSet.Usage.INPUT);
//        xJdfDocument.addResourceSet(new RunList().withFileSpec(new FileSpec().withURL(new URI(sourceUri, fileSpec))), ResourceSet.Usage.INPUT);
//
//        xJdfDocument.getXJdf().withCommentURL(new URI(sourceUri));
//        packager.packageXml(xJdfDocument.getXJdf(), "document.xml");
//
//        final ZipInputStream zin = new ZipInputStream(new ByteArrayInputStream(out.toByteArray()));
//        assertEquals("document.xml", zin.getNextEntry().getName());
//        assertEquals(preview, zin.getNextEntry().getName());
//        assertEquals(fileSpec, zin.getNextEntry().getName());
//        assertNull(zin.getNextEntry());
//    }

//    @Test
//    public void packageXmlWritesAssets() throws Exception {
//        final ByteArrayOutputStream out = new ByteArrayOutputStream();
//        final AbstractXmlPackager<XJDF> packager = new MinimalXmlPackager(out);
//
//        final java.net.URI sourceUri = AbstractXmlPackagerTest.class.getResource("../../test.pdf").toURI();
//        final String preview = "preview/datei.pdf";
//        final String fileSpec = "filespec/datei.pdf";
//        final String doc = "doc/datei.pdf";
//
//        XJdfDocument xJdfDocument = new XJdfDocument("Foo", "Product");
//        xJdfDocument.addResourceSet(new Preview().withFileSpec(new FileSpec().withURL(new URI(sourceUri, preview))), ResourceSet.Usage.INPUT);
//        xJdfDocument.addResourceSet(new RunList().withFileSpec(new FileSpec().withURL(new URI(sourceUri, fileSpec))), ResourceSet.Usage.INPUT);
//
//        xJdfDocument.getXJdf().withCommentURL(new URI(sourceUri, doc));
//        packager.packageXml(xJdfDocument.getXJdf(), "document.xml");
//
//        final ZipInputStream zin = new ZipInputStream(new ByteArrayInputStream(out.toByteArray()));
//        assertEquals("document.xml", zin.getNextEntry().getName());
//        String strDoc = new String(zin.readAllBytes());
//        System.out.println(strDoc);
//        assertTrue(100 < strDoc.indexOf("CommentURL=\"doc/datei.pdf\""));
//        assertTrue(315 < strDoc.indexOf("FileSpec URL=\"preview/datei.pdf\""));
//        assertTrue(535 < strDoc.indexOf("FileSpec URL=\"filespec/datei.pdf\""));
//
//        assertEquals(preview, zin.getNextEntry().getName());
//        assertEquals(fileSpec, zin.getNextEntry().getName());
//        assertEquals(doc, zin.getNextEntry().getName());
//    }

//    @Test
//    public void packageXmlWritesAssets_2() throws Exception {
//        final ByteArrayOutputStream out = new ByteArrayOutputStream();
//        final AbstractXmlPackager<XJDF> packager = new MinimalXmlPackager(out);
//
//        final String preview = "preview/datei.pdf";
//        final String fileSpec = "filespec/datei.pdf";
//        final String doc = "doc/datei.pdf";
//
//        XJdfDocument xJdfDocument = new XJdfDocument("Foo", "Product");
//        xJdfDocument.addResourceSet(new Preview().withFileSpec(new FileSpec().withURL(new URI("Content_FileSpec".getBytes(), preview))), ResourceSet.Usage.INPUT);
//        xJdfDocument.addResourceSet(new RunList().withFileSpec(new FileSpec().withURL(new URI("Content_RunList".getBytes(), fileSpec))), ResourceSet.Usage.INPUT);
//
//        xJdfDocument.getXJdf().withCommentURL(new URI("Content_CommentURL".getBytes(), doc));
//        packager.packageXml(xJdfDocument.getXJdf(), "document.xml");
//
//        final ZipInputStream zin = new ZipInputStream(new ByteArrayInputStream(out.toByteArray()));
//        assertEquals("document.xml", zin.getNextEntry().getName());
//        String strDoc = new String(zin.readAllBytes());
//        assertTrue(100 < strDoc.indexOf("CommentURL=\"doc/datei.pdf\""));
//        assertTrue(315 < strDoc.indexOf("FileSpec URL=\"preview/datei.pdf\""));
//        assertTrue(535 < strDoc.indexOf("FileSpec URL=\"filespec/datei.pdf\""));
//
//        assertEquals(preview, zin.getNextEntry().getName());
//        assertEquals("Content_FileSpec", new String(zin.readAllBytes()));
//
//        assertEquals(fileSpec, zin.getNextEntry().getName());
//        assertEquals("Content_RunList", new String(zin.readAllBytes()));
//
//        assertEquals(doc, zin.getNextEntry().getName());
//    }

//    @Test
//    public void collectReferencesExtractedValueExists() throws Exception {
//        final java.net.URI sourceUri = AbstractXmlPackagerTest.class.getResource("../../test.pdf").toURI();
//        final String preview = "preview/datei.pdf";
//
//        XJdfDocument xJdfDocument = new XJdfDocument("Foo", "Product");
//        xJdfDocument.addResourceSet(new Preview().withFileSpec(new FileSpec().withURL(new URI(sourceUri, preview))), ResourceSet.Usage.INPUT);
//
//
//        AbstractXmlPackager packager = new MinimalXmlPackager(new ByteArrayOutputStream());
//
//        final JAXBNavigator<XJDF> jaxbNavigator = new JAXBNavigator<>(xJdfDocument.getXJdf());
//        jaxbNavigator.addNamespace("xjdf", XJdfConstants.NAMESPACE_JDF20);
//        assertEquals(
//            1,
//            packager.collectReferences(
//                new AbstractXmlPackager.URIExtractor<FileSpec>() {
//                    @Override
//                    public URI extract(final FileSpec fileSpec) {
//                        return fileSpec.getURL();
//                    }
//
//                },
//                new Object[]{jaxbNavigator.evaluateNode("//xjdf:Preview/xjdf:FileSpec")}
//            ).size()
//        );
//    }

//    @Test
//    public void collectReferencesExtractedValueIsNull() {
//        AbstractXmlPackager packager = new MinimalXmlPackager(new ByteArrayOutputStream());
//        assertTrue(packager.collectReferences(
//            (AbstractXmlPackager.URIExtractor<XJDF>) XJDF::getCommentURL,
//            new Object[]{new XJDF()}
//            ).isEmpty()
//        );
//    }

//    @Test
//    public void extract() throws Exception {
//        ByteArrayOutputStream out = new ByteArrayOutputStream();
//        AbstractXmlPackager packager = new MinimalXmlPackager(out);
//
//
//        XJdfDocument xJdfDocument = new XJdfDocument("Foo", "Product");
//        xJdfDocument.addResourceSet(new RunList().withFileSpec(new FileSpec().withURL(new URI(new java.net.URI("MyUri")))), ResourceSet.Usage.INPUT);
//
//        final JAXBNavigator<XJDF> jaxbNavigator = new JAXBNavigator<>(xJdfDocument.getXJdf());
//        jaxbNavigator.addNamespace("xjdf", XJdfConstants.NAMESPACE_JDF20);
//        final Collection uriCollection = packager.collectReferences(
//            new AbstractXmlPackager.URIExtractor<FileSpec>() {
//                @Override
//                public URI extract(final FileSpec fileSpec) {
//                    return fileSpec.getURL();
//                }
//            },
//            new Object[]{jaxbNavigator.evaluateNode("//xjdf:FileSpec")}
//        );
//        assertEquals(1, uriCollection.size());
//    }

//    @Test
//    public void packageExistingArchive() throws Exception {
//        final XJDF xjdf;
//        final Path zipPath = Paths.get(AbstractXmlPackagerTest.class.getResource("../../testPackage.zip").toURI());
//        try (final FileSystem fs = FileSystems.newFileSystem(zipPath, (ClassLoader) null)) {
//            final Path xjdfDocumentPath = fs.getPath("/", "testPackage.xjdf");
//            try (final InputStream is = Files.newInputStream(xjdfDocumentPath)) {
//                xjdf = new XJdfParser().readXJdf(is);
//
//                xjdf.withResourceSet(
//                    new ResourceSet()
//                        .withName("RunList")
//                        .withResource(
//                            new Resource().withSpecificResource(new ObjectFactory().createRunList(
//                                new RunList()
//                                    .withFileSpec(
//                                        new FileSpec()
//                                            .withURL(
//                                                new URI(
//                                                    AbstractXmlPackagerTest.class.getResource("../../test.pdf")
//                                                        .toURI(),
//                                                    "artwork/another_artwork.pdf"
//                                                )
//                                            )
//                                    )))
//                            ).withID("Artwork")
//                );
//            }
//        }
//
//        final Path tmpXjdfArchive = Files.createTempFile("XJDF_", ".zip");
//        try {
//            try (final OutputStream os = Files.newOutputStream(tmpXjdfArchive)) {
//                final XJdfPackager packager = new XJdfPackager(zipPath, os);
//                packager.packageXjdf(xjdf, "testPackage.xjdf");
//            }
//
//            try (final FileSystem zipfs = FileSystems.newFileSystem(tmpXjdfArchive, (ClassLoader) null)) {
//                assertTrue(
//                    Files.isReadable(zipfs.getPath("/", "testPackage.xjdf")),
//                    "/testPackage.xjdf was not added to archive"
//                );
//                assertTrue(
//                    Files.isReadable(zipfs.getPath("/", "artwork", "testArtwork.pdf")),
//                    "/artwork/testArtwork.pdf was not added to archive"
//                );
//                assertTrue(
//                    Files.isReadable(zipfs.getPath("/", "artwork", "another_artwork.pdf")),
//                    "/artwork/another_artwork.pdf was not added to archive"
//                );
//                assertTrue(
//                    Files.isReadable(zipfs.getPath("/", "preview", "testPreview.pdf")),
//                    "/preview/testPrevierw.pdf was not added to archive"
//                );
//            }
//        } finally {
//            Files.delete(tmpXjdfArchive);
//        }
//    }

}