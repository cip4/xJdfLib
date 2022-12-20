package org.cip4.lib.xjdf.xml.internal;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class JAXBContextFactoryTest {

    @Test
    public void initIsIdempotent() throws JAXBException {
        JAXBContextFactory.init();
        JAXBContext context1 = JAXBContextFactory.getInstance();
        JAXBContextFactory.init();
        JAXBContext context2 = JAXBContextFactory.getInstance();
        assertSame(context1, context2);
    }

}