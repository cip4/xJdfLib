package org.cip4.lib.xjdf.util;

import jakarta.xml.bind.JAXBException;
import org.cip4.lib.xjdf.xml.internal.JAXBContextFactory;

public class XJdfLib {

    /**
     * Helper method to initialize the library's JAXBContext.
     */
    public static void initLibrary() throws Exception {
        try {
            JAXBContextFactory.init();
        } catch (JAXBException e) {
            throw new Exception(e);
        }
    }
}
