package org.cip4.lib.xjdf;

import jakarta.xml.bind.JAXBException;
import org.apache.commons.lang3.NotImplementedException;
import org.cip4.lib.xjdf.exception.XJdfParseException;
import org.cip4.lib.xjdf.schema.Message;
import org.cip4.lib.xjdf.schema.XJMF;
import org.cip4.lib.xjdf.xml.XJmfParser;
import org.jetbrains.annotations.NotNull;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * XJMF Message is designed to be the main class when dealing with XJMF messages.
 */
public class XJmfMessage {

    private final XJMF xjmf;

    private boolean validation = false;

    /**
     * Default constructor. <br>
     * Creates an empty XJMF Message.
     */
    public XJmfMessage() throws JAXBException {
        this.xjmf = new XJMF();
    }

    /**
     * Custom Constructor. <br>
     * Accepting an XJMF Message as byte array for initializing.
     *
     * @param bytes The XJMF Message as byte array.
     */
    public XJmfMessage(byte[] bytes) throws XJdfParseException {
        this.xjmf = new XJmfParser().parseStream(new ByteArrayInputStream(bytes));
    }

    /**
     * Custom Constructor. <br>
     * Accepting an XJMF root node for initializing.
     *
     * @param xjmf The XJMF root node.
     */
    public XJmfMessage(XJMF xjmf) {
        this.xjmf = xjmf;
    }

    public void send() {
        throw new NotImplementedException("Send needs to be implemented.");
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
    public String toXml() throws XJdfParseException, IOException {
        return new String(new XJmfParser(false).parseXJmf(this.xjmf, !validation));
    }

    /**
     * An XJMF Message builder class.
     */
    public static class Builder {

        private final XJMF xjmf;

        /**
         * Default constructor.
         */
        public Builder() {
            this.xjmf = new XJMF();
        }

        public Builder withMessage() {
            return this;
        }

        /**
         * Build XJMF Message object.
         * @return The XJMF Message object
         */
        public XJmfMessage build() {
            return new XJmfMessage(xjmf);
        }
    }
}
