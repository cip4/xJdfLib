package org.cip4.lib.xjdf;

import jakarta.xml.bind.JAXBException;
import org.cip4.lib.xjdf.schema.CommandReturnQueueEntry;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class XJmfMessageTest {

    @Test
    void createXJmf() throws JAXBException, IOException {

        // arrange
        XJmfMessage xJmfMessage = new XJmfMessage();

        // act
        xJmfMessage.addMessage(new CommandReturnQueueEntry());

        // assert
        String result = xJmfMessage.toXml();
        System.out.println(result);

    }
}