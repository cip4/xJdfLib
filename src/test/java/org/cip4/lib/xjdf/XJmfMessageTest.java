package org.cip4.lib.xjdf;

import org.cip4.lib.xjdf.schema.Header;
import org.cip4.lib.xjdf.schema.QueryKnownDevices;
import org.cip4.lib.xjdf.schema.QueryKnownMessages;
import org.cip4.lib.xjdf.schema.QueryKnownSubscriptions;
import org.cip4.lib.xjdf.xml.XJdfConstants;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;

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

}