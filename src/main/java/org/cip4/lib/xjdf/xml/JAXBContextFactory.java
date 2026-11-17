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

    /**
     * Private constructor. This class cannot be instantiated.
     */
    private JAXBContextFactory() {
        // protection from reflection
        throw new AssertionError("Factory class cannot be instantiated.");
    }

    /**
     * Holder idiom: guarantees a thread-safe, single lazily created JAXB context.
     */
    private static class Holder {

        private static final JAXBContext JAXB_CONTEXT = createContext();

        private static JAXBContext createContext() {
            try {
                return JAXBContext.newInstance(XJDF.class);
            } catch (JAXBException e) {
                throw new XJdfInitException(e);
            }
        }
    }

    /**
     * Initialize the JAXB context.
     */
    public static void init() {
        // touch the holder, which creates the context if necessary
        Holder.JAXB_CONTEXT.getClass();
    }

    /**
     * Create and return a new Marshaller Instance.
     *
     * @return New Marshaller instance.
     */
    public static JAXBContext getInstance() {
        return Holder.JAXB_CONTEXT;
    }
}
