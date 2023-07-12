package org.cip4.lib.xjdf.xml;

import org.cip4.lib.xjdf.schema.Header;
import org.cip4.lib.xjdf.schema.XJMF;
import org.cip4.lib.xjdf.type.DateTime;
import org.cip4.lib.xjdf.xml.XJdfParser;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit test case for XJmfParser.
 */
public class XJmfParser2Test {

    @Test
    public void parseXJmf_ByteArray_SkipValidation() throws Exception {
        // arrange
        XJMF xjmf = new XJMF().withHeader(
                new Header().withDeviceID("MyDevice").withID("ID").withTime(new DateTime("2017-03-27T21:31:54Z"))
        );

        // act
        byte[] actual = new XJdfParser<XJMF>().writeXml(xjmf);

        // assert
        String jmf = new String(actual);
        assertTrue(jmf.contains("Time=\"2017-03-27T21:31:54.000Z\""), "Cannot find time.");
        assertTrue(jmf.contains("DeviceID=\"MyDevice\""), "Cannot find DeviceId.");
        assertTrue(jmf.contains("ID=\"ID\""), "Cannot find ID.");
    }

    @Test
    public void parseXJmf_OutputStream_SkipValidation() throws Exception {
        // arrange
        XJMF xjmf = new XJMF().withHeader(
            new Header().withDeviceID("MyDevice").withID("ID").withTime(new DateTime("2017-03-27T21:31:54Z"))
        );

        // act
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        new XJdfParser<XJMF>().writeXml(xjmf, bos);
        byte[] actual = bos.toByteArray();

        // assert
        String jmf = new String(actual);
        assertTrue(jmf.contains("Time=\"2017-03-27T21:31:54.000Z\""), "Cannot find time.");
        assertTrue(jmf.contains("DeviceID=\"MyDevice\""), "Cannot find DeviceId.");
        assertTrue(jmf.contains("ID=\"ID\""), "Cannot find ID.");
    }
}