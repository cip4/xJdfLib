package org.cip4.lib.xjdf.type;

import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.URISyntaxException;

import static org.junit.jupiter.api.Assertions.*;

public class URITest {

    @Test
    public void marshalNullParam() {
        final URI uri = new URI();
        assertNull(uri.marshal(null));
    }

    @Test
    public void marshalDestinationMissing() throws Exception {
        URI uriToBeConverted = new URI(new java.net.URI("MyUri"));
        assertEquals("MyUri", uriToBeConverted.marshal(uriToBeConverted));
    }

    @Test
    public void marshalDestinationExists() throws Exception {
        URI uriToBeConverted = new URI(new java.net.URI("MyUri"), "Destination").complete();
        assertEquals("Destination", uriToBeConverted.marshal(uriToBeConverted));
    }

    @Test
    public void marshallEmptyUri() {
        final URI uri = new URI();
        assertThrows(
            NullPointerException.class,
            new Executable() {
                @Override
                public void execute() {
                    assertNotNull(uri.marshal(uri));
                }
            }
        );
    }

    @Test
    public void unmarshalAbsoulteUri() throws Exception {
        final URI uri = new URI();
        final URI result = uri.unmarshal(URITest.class.getResource("../test.xjdf").toURI().toASCIIString());
        assertTrue(result.getSourceUri().isAbsolute());
    }

    @Test
    public void unmarshalCompletedUri() throws Exception {
        final URI uri = new URI();
        final URI result = uri.unmarshal("MyUri");
        result.complete();
        assertFalse(result.getSourceUri().isAbsolute());
        assertEquals("MyUri", result.getDestinationPath());
    }

    @Test
    public void unmarshallFails() {
        final URI uri = new URI();
        assertThrows(
            URISyntaxException.class,
            new Executable() {
                @Override
                public void execute() throws Throwable {
                    uri.unmarshal("[]");
                }
            }
        );
    }

    @Test
    public void getSourceUri() throws Exception {
        final java.net.URI sourceUri = new java.net.URI("MyUri");
        URI uri = new URI(sourceUri);
        assertEquals(sourceUri, uri.getSourceUri());
        assertNull(uri.getSourceInputStream());
    }

    @Test
    public void getDestinationPathFromCompletedURI() throws Exception {
        final String destination = "Destination";
        URI uri = new URI(new java.net.URI("MyUri"), destination);
        uri.complete();
        assertEquals(destination, uri.getDestinationPath());
        assertNull(uri.getSourceInputStream());
    }

    @Test
    public void complete() throws Exception {
        final String destination = "Destination";
        URI uri = new URI(new java.net.URI("MyUri"), destination);
        assertNull(uri.getDestinationPath());
        assertSame(uri, uri.complete());
        assertEquals(destination, uri.getDestinationPath());
        assertNull(uri.getSourceInputStream());
    }

    @Test
    public void getSourceInputStream_1() throws Exception {

        // arrange
        final String destination = "/dest";
        byte[] bytes = "BODY".getBytes();

        // act
        URI uri = new URI(bytes, destination);

        // assert
        byte[] result = IOUtils.toByteArray(uri.getSourceInputStream());
        assertEquals("BODY", new String(result));
    }

    @Test
    public void getSourceInputStream_2() throws Exception {

        // arrange
        final String destination = "/dest";
        InputStream is = new ByteArrayInputStream("BODY".getBytes());

        // act
        URI uri = new URI(is, destination);

        // assert
        byte[] result = IOUtils.toByteArray(uri.getSourceInputStream());
        assertEquals("BODY", new String(result));
    }
}