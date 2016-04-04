package org.cip4.lib.xjdf.type;

import org.junit.Test;

import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

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
        URI uriToBeConverted = new URI(new java.net.URI("MyUri"), Paths.get("Destination"));
        assertEquals("Destination", uri.marshal(uriToBeConverted));
    }

    @Test(expected = NullPointerException.class)
    public void marshallEmptyUri() throws Exception {
        URI uri = new URI();
        assertNotNull(uri.marshal(new URI()));
    }

    @Test
    public void unmarshal() throws Exception {
        URI uri = new URI();
        assertNotNull(uri.unmarshal("MyParam"));
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
        assertSame(sourceUri, uri.getSourceUri());
    }

    @Test
    public void getDestinationPath() throws Exception {
        final Path destination = Paths.get("Destination");
        URI uri = new URI(new java.net.URI("MyUri"), destination);
        assertSame(destination, uri.getDestinationPath());
    }
}