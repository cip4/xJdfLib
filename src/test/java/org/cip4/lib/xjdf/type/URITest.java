package org.cip4.lib.xjdf.type;

import org.junit.Test;

import java.net.URISyntaxException;

import static org.junit.Assert.*;

public class URITest {

    @Test
    public void marshalNullParam() throws Exception {
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

    @Test(expected = NullPointerException.class)
    public void marshallEmptyUri() throws Exception {
        final URI uri = new URI();
        assertNotNull(uri.marshal(uri));
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

    @Test(expected = URISyntaxException.class)
    public void unmarshallFails() throws Exception {
        final URI uri = new URI();
        uri.unmarshal("[]");
    }

    @Test
    public void getSourceUri() throws Exception {
        final java.net.URI sourceUri = new java.net.URI("MyUri");
        URI uri = new URI(sourceUri);
        assertEquals(sourceUri, uri.getSourceUri());
    }

    @Test
    public void getDestinationPathFromCompletedURI() throws Exception {
        final String destination = "Destination";
        URI uri = new URI(new java.net.URI("MyUri"), destination);
        uri.complete();
        assertEquals(destination, uri.getDestinationPath());
    }

    @Test
    public void complete() throws Exception {
        final String destination = "Destination";
        URI uri = new URI(new java.net.URI("MyUri"), destination);
        assertNull(uri.getDestinationPath());
        assertSame(uri, uri.complete());
        assertEquals(destination, uri.getDestinationPath());
    }
}