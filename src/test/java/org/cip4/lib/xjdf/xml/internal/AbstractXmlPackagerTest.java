package org.cip4.lib.xjdf.xml.internal;

import org.cip4.lib.xjdf.XJdfNodeFactory;
import org.cip4.lib.xjdf.builder.XJdfBuilder;
import org.cip4.lib.xjdf.schema.FileSpec;
import org.cip4.lib.xjdf.schema.XJDF;
import org.cip4.lib.xjdf.type.URI;
import org.cip4.lib.xjdf.xml.XJdfConstants;
import org.junit.Test;

import javax.xml.xpath.XPathConstants;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.OutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import static org.junit.Assert.assertEquals;

/**
 * Unit-Test for AbstractXmlPackager
 */
public class AbstractXmlPackagerTest {

    private class MinimalXmlPackager extends AbstractXmlPackager {
        MinimalXmlPackager(final OutputStream out) throws Exception {
            super(out);
        }
    }

    @Test
    public void packageXmlWritesDocumentFirst() throws Exception {
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final AbstractXmlPackager packager = new MinimalXmlPackager(out);

        XJdfBuilder builder = new XJdfBuilder();
        final Path destPath = Paths.get("artwork" + File.separator + "datei.pdf");
        builder.addParameter(
            new XJdfNodeFactory().createRunList(
                new URI(
                    AbstractXmlPackagerTest.class.getResource("../../test.pdf").toURI(),
                    destPath
                )
            )
        );

        packager.packageXml(builder.build(), "document.xml");

        final ZipInputStream zin = new ZipInputStream(new ByteArrayInputStream(out.toByteArray()));
        assertEquals("document.xml", zin.getNextEntry().getName());
        assertEquals(destPath, Paths.get(zin.getNextEntry().getName()));
    }

    @Test
    public void packageXmlWritesAssets() throws Exception {
        XJdfBuilder builder = new XJdfBuilder();
        XJdfNodeFactory factory = new XJdfNodeFactory();
        final String destination = "runList" + File.separator + "file.xjdf";
        builder.addParameter(
            factory.createRunList(
                new URI(
                    AbstractXmlPackagerTest.class.getResource("../../relative.xjdf").toURI(),
                    Paths.get(destination)
                )
            )
        );

        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final AbstractXmlPackager packager = new MinimalXmlPackager(out);
        XJDF xjdf = builder.build();
        packager.packageXml(
            xjdf,
            "document.xml"
        );
        final ZipInputStream zin = new ZipInputStream(new ByteArrayInputStream(out.toByteArray()));
        assertEquals("document.xml", zin.getNextEntry().getName());
        assertEquals(destination, zin.getNextEntry().getName());
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
        final Collection<URI> uriCollection = packager.collectReferences(
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