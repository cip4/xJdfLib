package org.cip4.lib.xjdf;

import org.cip4.lib.xjdf.schema.CommandReturnQueueEntry;
import org.junit.jupiter.api.Test;


class XJmfMessageTest {

    @Test
    void createXJmf() throws Exception {

        // arrange
        XJmfMessage xJmfMessage = new XJmfMessage();

        // act
        xJmfMessage.addMessage(new CommandReturnQueueEntry());

        // assert
        String result = xJmfMessage.toXml();
        System.out.println(result);

    }
}