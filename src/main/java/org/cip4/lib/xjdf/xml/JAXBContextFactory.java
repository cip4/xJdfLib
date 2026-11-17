package org.cip4.lib.xjdf.xml;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;

import org.cip4.lib.xjdf.exception.XJdfInitException;
import org.cip4.lib.xjdf.schema.XJDF;

/**
 * Creates and caches the shared JAXB context.
 *
 * <p>
 * The context is created lazily on first use and reused afterwards. {@link #init()} may be called eagerly at
 * application start to surface initialization problems early.
 * </p>
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
    public static void init() {
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
    public static JAXBContext getInstance() {

        // if necessary initialize
        if (jaxbContext == null) {
            init();
        }

        // return JAXBContext instance
        return jaxbContext;
    }
}
