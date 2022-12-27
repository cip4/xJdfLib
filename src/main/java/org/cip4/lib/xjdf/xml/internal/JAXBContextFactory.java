package org.cip4.lib.xjdf.xml.internal;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;

import org.cip4.lib.xjdf.exception.XJdfInitException;
import org.cip4.lib.xjdf.schema.XJDF;

/**
 * Static Factory Class which is managing a JAXB2 Marshaller instance.
 *
 * @author s.meissner
 */
public class JAXBContextFactory {

    private static JAXBContext jaxbContext;

    /**
     * Private constructor. This class cannot be instantiated.
     */
    private JAXBContextFactory() {
        // protection from reflection
        throw new AssertionError("Factory class cannot be instantiated.");
    }

    /**
     * Initialize the marshaller instance.
     */
    public static void init() throws XJdfInitException {
        if (jaxbContext == null) {
            // initialize
            try {
                jaxbContext = JAXBContext.newInstance(XJDF.class);
            } catch (JAXBException e) {
                throw new XJdfInitException(e);
            }
        }
    }

    /**
     * Create and return a new Marshaller Instance.
     *
     * @return New Marshaller instance.
     */
    public static JAXBContext getInstance() throws XJdfInitException {

        // if necessary initialize
        if (jaxbContext == null) {
            init();
        }

        // return JAXBContext instance
        return jaxbContext;
    }
}
