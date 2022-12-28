package org.cip4.lib.xjdf.type;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.net.URISyntaxException;

import static org.junit.jupiter.api.Assertions.*;

public class URITest {

    @Test
    public void marshalDestinationMissing() throws Exception {
        URI uriToBeConverted = new URI(new java.net.URI("MyUri"));
        assertEquals("MyUri", uriToBeConverted.marshal(uriToBeConverted));
    }

    @Test
    public void marshallEmptyUri() {
        final URI uri = new URI();
        assertThrows(
            NullPointerException.class,
            () -> assertNotNull(uri.marshal(uri))
        );
    }

    @Test
    public void unmarshalAbsoulteUri() throws Exception {
        final URI uri = new URI();
        final URI result = uri.unmarshal(URITest.class.getResource("../test.xjdf").toURI().toASCIIString());
        assertTrue(result.getUri().isAbsolute());
    }

    @Test
    public void unmarshalCompletedUri() throws Exception {
        final URI uri = new URI();
        final URI result = uri.unmarshal("MyUri");
        assertEquals("MyUri", result.getUri().toString());
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
    public void getUri() throws Exception {
        final java.net.URI sourceUri = new java.net.URI("MyUri");
        URI uri = new URI(sourceUri);
        assertEquals(sourceUri, uri.getUri());
    }

}