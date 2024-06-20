package org.cip4.lib.xjdf;

import org.cip4.lib.xjdf.exception.XJdfDocumentException;
import org.cip4.lib.xjdf.exception.XJmfMessageException;
import org.cip4.lib.xjdf.schema.CommandSubmitQueueEntry;
import org.cip4.lib.xjdf.schema.Header;
import org.cip4.lib.xjdf.schema.Message;
import org.cip4.lib.xjdf.schema.QueryKnownDevices;
import org.cip4.lib.xjdf.schema.QueryKnownMessages;
import org.cip4.lib.xjdf.schema.QueryKnownSubscriptions;
import org.cip4.lib.xjdf.schema.QueueSubmissionParams;
import org.cip4.lib.xjdf.schema.Version;
import org.cip4.lib.xjdf.type.URI;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.parallel.ExecutionMode.SAME_THREAD;

@Execution(SAME_THREAD)
class XJmfMessageTest {

    @BeforeAll
    static void initTests() {
        XJdfConstants.AGENT_NAME = "MY_AGENT";
        XJdfConstants.AGENT_VERSION = "MY_AGENT_VERSION";
        XJdfConstants.DEVICE_ID = "MY_DEVICE";
    }

    @Test
    void createXJmf_1() throws Exception {

        // arrange
        QueryKnownMessages queryKnownMessages = new QueryKnownMessages();

        // act
        XJmfMessage xJmfMessage = new XJmfMessage();
        xJmfMessage.addMessage(queryKnownMessages);

        // assert
        byte[] result = xJmfMessage.toXml();
        System.out.println(new String(result));
        Assertions.assertEquals(Version.V2_2, xJmfMessage.getXJmf().getVersion());

        Header xjmfHeader = xJmfMessage.getXJmf().getHeader();
        Assertions.assertEquals("MY_AGENT", xjmfHeader.getAgentName());
        Assertions.assertEquals("MY_AGENT_VERSION", xjmfHeader.getAgentVersion());
        Assertions.assertEquals("MY_DEVICE", xjmfHeader.getDeviceID());

        Header messageHeader = xJmfMessage.getXJmf().getMessages().get(0).getHeader();
        Assertions.assertEquals("MY_AGENT", messageHeader.getAgentName());
        Assertions.assertEquals("MY_AGENT_VERSION", messageHeader.getAgentVersion());
        Assertions.assertEquals("MY_DEVICE", messageHeader.getDeviceID());

        Assertions.assertEquals(queryKnownMessages, xJmfMessage.getXJmf().getMessages().get(0));
    }

    @Test
    void createXJmf_2() throws Exception {

        // arrange

        // act
        XJmfMessage xJmfMessage = new XJmfMessage();
        xJmfMessage.addMessage(new QueryKnownMessages());
        xJmfMessage.addMessage(new QueryKnownDevices());
        xJmfMessage.addMessage(new QueryKnownSubscriptions());

        // assert
        byte[] result = xJmfMessage.toXml();
        System.out.println(new String(result));

        Header xjmfHeader = xJmfMessage.getXJmf().getHeader();
        Assertions.assertEquals("MY_AGENT", xjmfHeader.getAgentName());
        Assertions.assertEquals("MY_AGENT_VERSION", xjmfHeader.getAgentVersion());
        Assertions.assertEquals("MY_DEVICE", xjmfHeader.getDeviceID());

        Assertions.assertEquals(3, xJmfMessage.getXJmf().getMessages().size());

        Header messageHeader_0 = xJmfMessage.getXJmf().getMessages().get(0).getHeader();
        Assertions.assertEquals("MY_AGENT", messageHeader_0.getAgentName());
        Assertions.assertEquals("MY_AGENT_VERSION", messageHeader_0.getAgentVersion());
        Assertions.assertEquals("MY_DEVICE", messageHeader_0.getDeviceID());

        Header messageHeader_1 = xJmfMessage.getXJmf().getMessages().get(0).getHeader();
        Assertions.assertEquals("MY_AGENT", messageHeader_1.getAgentName());
        Assertions.assertEquals("MY_AGENT_VERSION", messageHeader_1.getAgentVersion());
        Assertions.assertEquals("MY_DEVICE", messageHeader_1.getDeviceID());

        Header messageHeader_2 = xJmfMessage.getXJmf().getMessages().get(0).getHeader();
        Assertions.assertEquals("MY_AGENT", messageHeader_2.getAgentName());
        Assertions.assertEquals("MY_AGENT_VERSION", messageHeader_2.getAgentVersion());
        Assertions.assertEquals("MY_DEVICE", messageHeader_2.getDeviceID());
    }

    @Test
    void readXJmf_1() throws Exception {

        // arrange
        byte[] xjmf = loadFile("CommandSubmitQueueEntry.xjmf");

        // act
        XJmfMessage xJmfMessage = new XJmfMessage(xjmf);
        List<Message> messages = xJmfMessage.getMessages();

        // assert
        Assertions.assertEquals(1, messages.size());
        Assertions.assertTrue(messages.get(0) instanceof CommandSubmitQueueEntry);

        CommandSubmitQueueEntry commandSubmitQueueEntry = (CommandSubmitQueueEntry) messages.get(0);
        Assertions.assertEquals("preview.xjdf", commandSubmitQueueEntry.getQueueSubmissionParams().getURL().toString());
    }

    @Test
    void readXJmf_2() throws Exception {

        // arrange
        XJmfMessage xJmfExample = new XJmfMessage();

        xJmfExample.addMessage(new CommandSubmitQueueEntry()
            .withQueueSubmissionParams(new QueueSubmissionParams()
                .withURL(new URI("myUrl.xjdf"))));

        xJmfExample.addMessage(new QueryKnownMessages());

        xJmfExample.addMessage(new QueryKnownDevices());

        byte[] xjmf = xJmfExample.toXml();

        // act
        XJmfMessage xJmfMessage = new XJmfMessage(xjmf);
        List<Message> messages = xJmfMessage.getMessages();

        // assert
        Assertions.assertEquals(3, messages.size());
        Assertions.assertSame(messages.get(0).getClass(), CommandSubmitQueueEntry.class);
        Assertions.assertTrue(messages.get(1) instanceof QueryKnownMessages);
        Assertions.assertTrue(messages.get(2) instanceof QueryKnownDevices);
    }

    @Test
    void getMessage_0() throws Exception {

        // arrange
        XJmfMessage xJmfExample = new XJmfMessage();
        xJmfExample.addMessage(new CommandSubmitQueueEntry()
                .withQueueSubmissionParams(new QueueSubmissionParams()
                        .withURL(new URI("myUrl.xjdf"))));

        byte[] xjmf = xJmfExample.toXml();

        // act
        XJmfMessage xJmfMessage = new XJmfMessage(xjmf);
        CommandSubmitQueueEntry commandSubmitQueueEntry = xJmfMessage.getMessage(CommandSubmitQueueEntry.class);

        // assert
        assertNotNull(commandSubmitQueueEntry, "CommandSubmitQueueEntry is null");
        assertEquals("myUrl.xjdf", commandSubmitQueueEntry.getQueueSubmissionParams().getURL().toString(), "QueueSubmissionURL is wrong.");
    }

    @Test
    void getMessage_1() throws Exception {

        // arrange
        XJmfMessage xJmfExample = new XJmfMessage();
        xJmfExample.addMessage(new CommandSubmitQueueEntry()
                .withQueueSubmissionParams(new QueueSubmissionParams()
                        .withURL(new URI("myUrl.xjdf"))));
        xJmfExample.addMessage(new QueryKnownMessages());
        xJmfExample.addMessage(new QueryKnownDevices());

        byte[] xjmf = xJmfExample.toXml();

        // act
        XJmfMessage xJmfMessage = new XJmfMessage(xjmf);
        QueryKnownMessages queryKnownMessages = xJmfMessage.getMessage(QueryKnownMessages.class);

        // assert
        assertNotNull(queryKnownMessages, "QueryKnownMessages is null");
    }

    @Test
    void getMessage_2() throws Exception {

        // arrange
        XJmfMessage xJmfExample = new XJmfMessage();
        xJmfExample.addMessage(new CommandSubmitQueueEntry()
                .withQueueSubmissionParams(new QueueSubmissionParams()
                        .withURL(new URI("myUrl.xjdf"))));
        xJmfExample.addMessage(new QueryKnownMessages());
        xJmfExample.addMessage(new QueryKnownMessages());
        xJmfExample.addMessage(new QueryKnownDevices());
        xJmfExample.addMessage(new QueryKnownDevices());

        byte[] xjmf = xJmfExample.toXml();

        // act
        XJmfMessage xJmfMessage = new XJmfMessage(xjmf);
        Throwable t = assertThrows(XJmfMessageException.class, () -> xJmfMessage.getMessage(QueryKnownMessages.class));

        // assert
        assertEquals("Message 'QueryKnownMessages' is ambiguous.", t.getMessage(), "Error message is wrong");
    }

    @Test
    void getMessage_3() throws Exception {

        // arrange
        XJmfMessage xJmfExample = new XJmfMessage();
        xJmfExample.addMessage(new CommandSubmitQueueEntry()
                .withQueueSubmissionParams(new QueueSubmissionParams()
                        .withURL(new URI("myUrl.xjdf"))));

        byte[] xjmf = xJmfExample.toXml();

        // act
        XJmfMessage xJmfMessage = new XJmfMessage(xjmf);
        QueryKnownMessages queryKnownMessages = xJmfMessage.getMessage(QueryKnownMessages.class);

        // assert
        assertNull(queryKnownMessages, "QueryKnownMessages is not null");
    }

    /**
     * Helper method to load a file.
     * @param filename The files name.
     * @return The file as byte array.
     */
    private byte[] loadFile(String filename) throws IOException {
        return ZipPackageTest.class.getResourceAsStream("/org/cip4/lib/xjdf/" + filename).readAllBytes();
    }
}