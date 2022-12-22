package org.cip4.lib.xjdf;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import org.cip4.lib.xjdf.schema.CommandSubmitQueueEntry;
import org.cip4.lib.xjdf.schema.Header;
import org.cip4.lib.xjdf.schema.Message;
import org.cip4.lib.xjdf.schema.XJMF;
import org.cip4.lib.xjdf.type.DateTime;
import org.cip4.lib.xjdf.xml.XJdfConstants;
import org.cip4.lib.xjdf.xml.XJmfParser;
import org.jetbrains.annotations.NotNull;

import javax.xml.namespace.QName;
import java.io.IOException;

/**
 * XJMF Message is designed to be the main class when dealing with XJMF messages.
 */
public class XJmfMessage {

    private final XJMF xjmf;

    private boolean validation = false;

    /**
     * Default constructor
     */
    public XJmfMessage() throws JAXBException {
        this.xjmf = new XJMF();
    }

    public void addMessage(@NotNull Message message) {


//        Message specificMessage = new CommandSubmitQueueEntry();
//
//        String paramName = specificMessage.getClass().getSimpleName();
//        QName qname = new QName(XJdfConstants.NAMESPACE_JDF20, paramName);
//        JAXBElement<Message> specificMessageJaxB = new JAXBElement<>(qname, Message.class, null, specificMessage);

//        String paramName = message.getClass().getSimpleName();
//        QName qname = new QName(XJdfConstants.NAMESPACE_JDF20, paramName);
//        JAXBElement<Message> messageJaxB = new JAXBElement<>(qname, Message.class, null, message);


        this.xjmf.getMessages().add(message);

    }

    /**
     * Returns the current XJMF Message as String
     * @return The XJMF Message as String.
     */
    public String toXml() throws JAXBException, IOException {
        return new String(new XJmfParser(false).parseXJmf(this.xjmf, !validation));
    }
}
