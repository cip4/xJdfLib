package org.cip4.lib.xjdf;

import jakarta.xml.bind.JAXBElement;
import org.apache.commons.lang3.NotImplementedException;
import org.cip4.lib.xjdf.exception.XJdfInitException;
import org.cip4.lib.xjdf.exception.XJdfParseException;
import org.cip4.lib.xjdf.exception.XJdfValidationException;
import org.cip4.lib.xjdf.schema.Header;
import org.cip4.lib.xjdf.schema.Message;
import org.cip4.lib.xjdf.schema.XJMF;
import org.cip4.lib.xjdf.type.DateTime;
import org.cip4.lib.xjdf.xml.XJdfConstants;
import org.cip4.lib.xjdf.xml.XJdfParser;
import org.cip4.lib.xjdf.xml.XJdfValidator;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

/**
 * This class provides functionality all about XJMF Messages.
 */
public class XJmfMessage {

    private final XJdfParser<XJMF> xjmfParser;

    private final XJdfValidator xJdfValidator;

    private final XJMF xjmf;

    /**
     * Default constructor. <br>
     * Creates an XJMF Message initialized with default values.
     */
    public XJmfMessage() throws XJdfInitException {
        this(new XJMF()
            .withHeader(createDefaultHeader())
            .withVersion(XJdfConstants.XJDF_CURRENT_VERSION)
        );
    }

    /**
     * Custom Constructor. <br>
     * Accepting an XJMF Message as byte array for initializing.
     *
     * @param bytes The XJMF Message as byte array.
     */
    public XJmfMessage(byte[] bytes) throws XJdfInitException, XJdfParseException {
        this(new XJdfParser<XJMF>().readXml(bytes));
    }

    /**
     * Custom Constructor. <br>
     * Accepting an XJMF root node for initializing.
     *
     * @param xjmf The XJMF root node.
     */
    public XJmfMessage(XJMF xjmf) throws XJdfInitException {
        this.xjmf = xjmf;

        this.xjmfParser = new XJdfParser<>();
        this.xJdfValidator = new XJdfValidator();
    }

    /**
     * Returns the XJMF Messages XJMF root node.
     *
     * @return The XJMF root node.
     */
    public XJMF getXJmf() {
        return xjmf;
    }

    public void send() {
        throw new NotImplementedException("Send needs to be implemented.");
    }

    /**
     * Add a specific to the XJMF Message object.
     * @param message The message to be added. NOTE: If no header is present, a default one will be created.
     */
    public void addMessage(@NotNull Message message) {

        // add default header if no header is present
        if(message.getHeader() == null) {
            message.setHeader(createDefaultHeader());
        }

        // add message
        this.xjmf.getMessages().add(message);

    }

    /**
     * Return the list of all specific messages contained by this XJMF Message.
     * @return List of specific messages.
     */
    public List<Message> getMessages() {
        List<Message> messages = new ArrayList<>(getXJmf().getMessages().size());

        for(Object obj: getXJmf().getMessages()) {
            JAXBElement jaxbElement = (JAXBElement) obj;
            messages.add((Message) jaxbElement.getValue());
        }

        return messages;
    }

    /**
     * Helper method to create a default header.
     * @return The default header.
     */
    private static Header createDefaultHeader() {
        return new Header()
            .withDeviceID(XJdfConstants.DEVICE_ID)
            .withAgentName(XJdfConstants.AGENT_NAME)
            .withAgentVersion(XJdfConstants.AGENT_VERSION)
            .withTime(new DateTime());
    }

    /**
     * Returns the current XJMF Message as XML byte array.
     *
     * @return The XJDF Document as XML byte array.
     */
    public byte[] toXml() throws XJdfParseException, XJdfValidationException {
        return toXml(true);
    }

    /**
     * Returns the current XJDF Document as XML byte array.
     *
     * @param validate 'false' in case validation should be skipped.
     * @return The XJDF Document as XML byte array.
     */
    public byte[] toXml(boolean validate) throws XJdfParseException, XJdfValidationException {

        // write xml
        final byte[] xml = xjmfParser.writeXml(this.xjmf);

        // validate
        if(validate) {
            xJdfValidator.validate(xml);
        }

        // return result
        return xml;
    }
}
