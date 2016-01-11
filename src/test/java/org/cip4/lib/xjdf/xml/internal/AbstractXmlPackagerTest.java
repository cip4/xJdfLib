package org.cip4.lib.xjdf.xml.internal;

import org.apache.commons.io.IOUtils;
import org.cip4.lib.xjdf.xml.XJdfNavigator;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
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
	}

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
}