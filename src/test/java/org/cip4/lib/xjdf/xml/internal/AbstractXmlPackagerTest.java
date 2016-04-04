package org.cip4.lib.xjdf.xml.internal;

import org.cip4.lib.xjdf.XJdfNodeFactory;
import org.cip4.lib.xjdf.builder.XJdfBuilder;
import org.cip4.lib.xjdf.schema.FileSpec;
import org.cip4.lib.xjdf.schema.XJDF;
import org.cip4.lib.xjdf.type.URI;
import org.cip4.lib.xjdf.xml.XJdfParser;
import org.junit.Test;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.xpath.XPathConstants;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
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

        final InputStream xjdfInputStream = AbstractXmlPackagerTest.class.getResourceAsStream("../../relative.xjdf");
        packager.packageXml(new XJdfParser().parseStream(xjdfInputStream), "document.xml");

        final ZipInputStream zin = new ZipInputStream(new ByteArrayInputStream(out.toByteArray()));
        assertEquals("document.xml", zin.getNextEntry().getName());
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
        final String destination = "runList" + File.separator + "file.xjdf";
        builder.addParameter(
            factory.createRunList(
                new URI(
                    AbstractXmlPackagerTest.class.getResource("../../relative.xjdf").toURI(),
                    Paths.get(destination)
                )
            )
        );
        final JAXBNavigator<XJDF> jaxbNavigator = new JAXBNavigator<>(builder.build());
        final Collection<URI> uriCollection = packager.collectReferences(
            (NodeList) jaxbNavigator.evaluate("//xjdf:FileSpec", XPathConstants.NODESET),
            new AbstractXmlPackager.URIExtractor() {
                @Override
                public URI extract(final Node node) {
                    return ((FileSpec) jaxbNavigator.getJAXBNode(node)).getURL();
                }
            }
        );
        assertEquals(1, uriCollection.size());
    }

    @Test
    public void writeZipEntry() throws Exception {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        AbstractXmlPackager packager = new MinimalXmlPackager(outputStream);
        final byte[] buf = {};
        packager.writeZipEntry(new ZipEntry("Zippi"), new ByteArrayInputStream(buf));
        ZipInputStream zipInputStream = new ZipInputStream(new ByteArrayInputStream(outputStream.toByteArray()));
        assertEquals("Zippi", zipInputStream.getNextEntry().getName());
    }
}