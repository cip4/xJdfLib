package org.cip4.lib.xjdf.xml.internal;

import org.cip4.lib.xjdf.XJdfNodeFactory;
import org.cip4.lib.xjdf.builder.XJdfBuilder;
import org.cip4.lib.xjdf.schema.FileSpec;
import org.cip4.lib.xjdf.schema.Preview;
import org.cip4.lib.xjdf.schema.XJDF;
import org.cip4.lib.xjdf.type.URI;
import org.cip4.lib.xjdf.xml.XJdfConstants;
import org.cip4.lib.xjdf.xml.XJdfParser;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.OutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.zip.ZipInputStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class AbstractXmlPackagerTest {

    private class MinimalXmlPackager extends AbstractXmlPackager {
        MinimalXmlPackager(final OutputStream out) throws Exception {
            super(out);
        }

        @Override
        protected byte[] parseDocument(final Object document) throws Exception {
            return new XJdfParser().parseXJdf((XJDF) document);
        }
    }

    @Test
    public void packageXmlWritesDocumentFirst() throws Exception {
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final AbstractXmlPackager packager = new MinimalXmlPackager(out);

        final XJdfNodeFactory xJdfNodeFactory = new XJdfNodeFactory();
        final java.net.URI sourceUri = AbstractXmlPackagerTest.class.getResource("../../test.pdf").toURI();
        final Path preview = Paths.get("preview" + File.separator + "datei.pdf");
        final Path fileSpec = Paths.get("filespec" + File.separator + "datei.pdf");
        XJdfBuilder builder = new XJdfBuilder();
        builder.addParameter(
            xJdfNodeFactory.createRunList(
                new URI(
                    sourceUri,
                    fileSpec
                )
            )
        );
        builder.addParameter(
            xJdfNodeFactory.createPreview(
                new URI(
                    sourceUri,
                    preview
                )
            )
        );
        final XJDF xjdf = builder.build();

        xjdf.setCommentURL(new URI(sourceUri, null));
        packager.packageXml(xjdf, "document.xml");

        final ZipInputStream zin = new ZipInputStream(new ByteArrayInputStream(out.toByteArray()));
        assertEquals("document.xml", zin.getNextEntry().getName());
        assertEquals(preview, Paths.get(zin.getNextEntry().getName()));
        assertEquals(fileSpec, Paths.get(zin.getNextEntry().getName()));
        assertNull(zin.getNextEntry());
    }

    @Test
    public void packageXmlWritesAssets() throws Exception {
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final AbstractXmlPackager packager = new MinimalXmlPackager(out);

        final XJdfNodeFactory xJdfNodeFactory = new XJdfNodeFactory();
        final java.net.URI sourceUri = AbstractXmlPackagerTest.class.getResource("../../test.pdf").toURI();
        final Path preview = Paths.get("preview" + File.separator + "datei.pdf");
        final Path fileSpec = Paths.get("filespec" + File.separator + "datei.pdf");
        final Path doc = Paths.get("doc" + File.separator + "datei.pdf");
        XJdfBuilder builder = new XJdfBuilder();
        builder.addParameter(
            xJdfNodeFactory.createRunList(
                new URI(
                    sourceUri,
                    fileSpec
                )
            )
        );
        builder.addParameter(
            xJdfNodeFactory.createPreview(
                new URI(
                    sourceUri,
                    preview
                )
            )
        );
        final XJDF xjdf = builder.build();
        xjdf.setCommentURL(new URI(sourceUri, doc));
        packager.packageXml(xjdf, "document.xml");

        final ZipInputStream zin = new ZipInputStream(new ByteArrayInputStream(out.toByteArray()));
        assertEquals("document.xml", zin.getNextEntry().getName());
        assertEquals(preview, Paths.get(zin.getNextEntry().getName()));
        assertEquals(fileSpec, Paths.get(zin.getNextEntry().getName()));
        assertEquals(doc, Paths.get(zin.getNextEntry().getName()));
    }

    @Test
    public void collectReferencesExtractedValueExists() throws Exception {
        final java.net.URI sourceUri = AbstractXmlPackagerTest.class.getResource("../../test.pdf").toURI();
        final Path preview = Paths.get("preview" + File.separator + "datei.pdf");
        XJdfBuilder builder = new XJdfBuilder();
        builder.addParameter(
            new XJdfNodeFactory().createPreview(
                new URI(
                    sourceUri,
                    preview
                )
            )
        );
        AbstractXmlPackager packager = new MinimalXmlPackager(new ByteArrayOutputStream());

        final JAXBNavigator<XJDF> jaxbNavigator = new JAXBNavigator<>(builder.build());
        jaxbNavigator.addNamespace("xjdf", XJdfConstants.NAMESPACE_JDF20);
        assertEquals(
            1,
            packager.collectReferences(
                new AbstractXmlPackager.URIExtractor<Preview>() {
                    @Override
                    public URI extract(final Preview previewParam) {
                        return previewParam.getURL();
                    }

                },
                new Object[]{jaxbNavigator.evaluateNode("//xjdf:Preview")}
            ).size()
        );
    }

    @Test
    public void collectReferencesExtractedValueIsNull() throws Exception {
        AbstractXmlPackager packager = new MinimalXmlPackager(new ByteArrayOutputStream());
        XJdfBuilder builder = new XJdfBuilder();
        assertTrue(packager.collectReferences(
                new AbstractXmlPackager.URIExtractor<XJDF>() {
                    @Override
                    public URI extract(final XJDF xjdf) {
                        return xjdf.getCommentURL();
                    }

                },
                new Object[]{builder.build()}
            ).isEmpty()
        );
    }

    @Test
    public void extract() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        AbstractXmlPackager packager = new MinimalXmlPackager(out);
        XJdfBuilder builder = new XJdfBuilder();
        XJdfNodeFactory factory = new XJdfNodeFactory();
        builder.addParameter(factory.createRunList(new URI(new java.net.URI("MyUri"))));
        final JAXBNavigator<XJDF> jaxbNavigator = new JAXBNavigator<>(builder.build());
        jaxbNavigator.addNamespace("xjdf", XJdfConstants.NAMESPACE_JDF20);
        final Collection uriCollection = packager.collectReferences(
            new AbstractXmlPackager.URIExtractor<FileSpec>() {
                @Override
                public URI extract(final FileSpec fileSpec) {
                    return fileSpec.getURL();
                }
            },
            new Object[]{jaxbNavigator.evaluateNode("//xjdf:FileSpec")}
        );
        assertEquals(1, uriCollection.size());
    }
}