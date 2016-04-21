package org.cip4.lib.xjdf.type;

import org.junit.Test;

import java.net.URISyntaxException;

import static org.junit.Assert.*;

public class URITest {

    @Test
    public void marshalNullParam() throws Exception {
        URI uri = new URI();
        assertNull(uri.marshal(null));
    }

    @Test
    public void marshalDestinationMissing() throws Exception {
        URI uri = new URI();
        URI uriToBeConverted = new URI(new java.net.URI("MyUri"));
        assertEquals("MyUri", uri.marshal(uriToBeConverted));
    }

    @Test
    public void marshalDestinationExists() throws Exception {
        URI uri = new URI();
        URI uriToBeConverted = new URI(new java.net.URI("MyUri"), "Destination");
        assertEquals("Destination", uri.marshal(uriToBeConverted));
    }

    @Test(expected = NullPointerException.class)
    public void marshallEmptyUri() throws Exception {
        URI uri = new URI();
        assertNotNull(uri.marshal(new URI()));
    }

    @Test
    public void unmarshalAbsoulteUri() throws Exception {
        URI uri = new URI();
        final URI result = uri.unmarshal(URITest.class.getResource("../test.xjdf").toURI().toASCIIString());
        assertTrue(result.getSourceUri().isAbsolute());
    }

    @Test
    public void unmarshalUri() throws Exception {
        URI uri = new URI();
        final URI result = uri.unmarshal("MyUri");
        assertFalse(result.getSourceUri().isAbsolute());
        assertEquals("MyUri", result.getDestinationPath());
    }

    @Test(expected = URISyntaxException.class)
    public void unmarshallFails() throws Exception {
        URI uri = new URI();
        uri.unmarshal("[]");
    }

    @Test
    public void getSourceUri() throws Exception {
        final java.net.URI sourceUri = new java.net.URI("MyUri");
        URI uri = new URI(sourceUri);
        assertEquals(sourceUri, uri.getSourceUri());
    }

    @Test
    public void getDestinationPath() throws Exception {
        final String destination = "Destination";
        URI uri = new URI(new java.net.URI("MyUri"), destination);
        assertEquals(destination, uri.getDestinationPath());
    }
}