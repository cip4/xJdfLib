package org.cip4.lib.xjdf.xml.internal;

import org.apache.commons.io.IOUtils;
import org.cip4.lib.xjdf.builder.XJdfBuilder;
import org.cip4.lib.xjdf.schema.EnumPreviewUsages;
import org.cip4.lib.xjdf.schema.FileSpec;
import org.cip4.lib.xjdf.schema.Part;
import org.cip4.lib.xjdf.schema.Preview;
import org.cip4.lib.xjdf.schema.XJDF;
import org.cip4.lib.xjdf.uri.relativizer.AbsoluteURIRelativizer;
import org.cip4.lib.xjdf.xml.XJdfNavigator;
import org.cip4.lib.xjdf.xml.XJdfParser;
import org.junit.Test;

import javax.xml.xpath.XPathExpressionException;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipInputStream;

import static org.junit.Assert.*;

/**
 * Unit-Test for AbstractXmlPackager
 */
public class AbstractXmlPackagerTest {

	private class MinimalXmlPackager extends AbstractXmlPackager {
		public MinimalXmlPackager(final OutputStream out, final boolean withoutHierarchy) throws Exception {
            super(out, withoutHierarchy);
		}

        @Override
        public void packageXml(
            final XmlNavigator nav,
            final URI rootUri
        ) throws PackagerException, XPathExpressionException {
            throw new RuntimeException("not implemented");
        }
    }

    private static final AbsoluteURIRelativizer URI_RELATIVIZER = new AbsoluteURIRelativizer();

    @Test
    public void packageXmlWritesDocumentFirst() throws Exception {
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final AbstractXmlPackager packager = new MinimalXmlPackager(out, false);

        final URI xjdfUri = AbstractXmlPackagerTest.class.getResource("../../relative.xjdf").toURI();
        final byte[] bytes = IOUtils.toByteArray(xjdfUri);
        packager.packageXml(new XJdfNavigator(bytes, true), "document.xml", xjdfUri.resolve("."));

        final ZipInputStream zin = new ZipInputStream(new ByteArrayInputStream(out.toByteArray()));
        assertEquals("document.xml", zin.getNextEntry().getName());
        assertEquals("artwork/test.pdf", zin.getNextEntry().getName());
        assertEquals("artwork/test2.pdf", zin.getNextEntry().getName());
    }

    @Test
    public void prepareForPackaging() throws Exception {
        final OutputStream out = new ByteArrayOutputStream();
        final AbstractXmlPackager packager = new MinimalXmlPackager(out, false);

        final URI xjdfUri = AbstractXmlPackagerTest.class.getResource("../../relative.xjdf").toURI();
        final byte[] bytes = IOUtils.toByteArray(xjdfUri);
        final AbstractXmlPackager.PreparedPackagingData packagingData = packager.prepareForPackaging(
            new XJdfNavigator(bytes, true)
        );

        assertEquals("XJDF_PSQ131S2", packagingData.nav.evaluateString("//xjdf:XJDF/@ID"));

        final Map<String, String> expectedFileRefs = new HashMap<>();
        expectedFileRefs.put("./test.pdf", "artwork/test.pdf");
        expectedFileRefs.put("subfolder/test2.pdf", "artwork/test2.pdf");
        expectedFileRefs.put("./layout.jdf", "docs/layout.jdf");

        assertEquals(expectedFileRefs, packagingData.fileRefs);
    }

    @Test
    public void prepareForPackagingWithSpecialCharacters() throws Exception {
        final XJdfBuilder xJdfBuilder = new XJdfBuilder("XJDF_PSQ131S2");
        xJdfBuilder
            .addParameter(
                new Preview()
                    .withURL("directory/[XJDF_PSQ131S2].pdf"),
                new Part()
                    .withProductPart("XJDF_PSQ131S2")
                    .withPreviewType(EnumPreviewUsages.IDENTIFICATION)
            );
        final XJDF xjdf = xJdfBuilder.build();

        final OutputStream out = new ByteArrayOutputStream();
        final AbstractXmlPackager packager = new MinimalXmlPackager(out, false);

        final AbstractXmlPackager.PreparedPackagingData packagingData = packager.prepareForPackaging(
            new XJdfNavigator(new XJdfParser().parseXJdf(xjdf), true)
        );

        assertEquals("XJDF_PSQ131S2", packagingData.nav.evaluateString("//xjdf:XJDF/@JobID"));

        final Map<String, String> expectedFileRefs = new HashMap<>();
        expectedFileRefs.put("directory/[XJDF_PSQ131S2].pdf", "preview/%5BXJDF_PSQ131S2%5D.pdf");

        assertEquals(expectedFileRefs, packagingData.fileRefs);
    }

    @Test
    public void prepareForPackagingSkipsHttps() throws Exception {
        final String urlUriString = "https://" +
            "confluence.cip4.org" +
            "/download/attachments/688513/XJDF-2.0-DRAFT-2015-10-16-BLD19.pdf?api=v2";
        final String fileUriString = URI_RELATIVIZER.relativize(null, Paths.get("directory/XJDF_PSQ131S2.pdf").toUri());

        final XJdfBuilder xJdfBuilder = new XJdfBuilder("XJDF_PSQ131S2");
        xJdfBuilder
            .addParameter(
                new Preview()
                    .withURL(fileUriString),
                new Part()
                    .withProductPart("XJDF_PSQ131S2")
                    .withPreviewType(EnumPreviewUsages.IDENTIFICATION)
            );
        xJdfBuilder
            .addParameter(
                new FileSpec()
                    .withURL(urlUriString),
                new Part()
                    .withProductPart("XJDF_PSQ131S2")
            );
        final XJDF xjdf = xJdfBuilder.build();

        final OutputStream out = new ByteArrayOutputStream();
        final AbstractXmlPackager packager = new MinimalXmlPackager(out, false);

        final AbstractXmlPackager.PreparedPackagingData packagingData = packager.prepareForPackaging(
            new XJdfNavigator(new XJdfParser().parseXJdf(xjdf), true)
        );

        assertEquals("preview/XJDF_PSQ131S2.pdf", packagingData.nav.evaluateString("//xjdf:XJDF//xjdf:Preview/@URL"));
        assertEquals(urlUriString, packagingData.nav.evaluateString("//xjdf:XJDF//xjdf:FileSpec/@URL"));

        final Map<String, String> expectedFileRefs = new HashMap<>();
        expectedFileRefs.put(fileUriString, "preview/XJDF_PSQ131S2.pdf");
        assertEquals(expectedFileRefs, packagingData.fileRefs);
    }
}