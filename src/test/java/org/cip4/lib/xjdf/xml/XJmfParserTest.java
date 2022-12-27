package org.cip4.lib.xjdf.xml;

import org.cip4.lib.xjdf.exception.XJdfParseException;
import org.cip4.lib.xjdf.schema.Header;
import org.cip4.lib.xjdf.schema.XJMF;
import org.cip4.lib.xjdf.type.DateTime;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.io.ByteArrayOutputStream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit test case for XJmfParser.
 */
public class XJmfParserTest {

    @Test
    public void parseXJmf_ByteArray() throws Exception {
        // arrange
        final XJMF xjmf = new XJMF().withHeader(
            new Header().withDeviceID("MyDevice").withID("ID").withTime(new DateTime("2017-03-27T21:31:54Z"))
        );

        // act
        // assert
        assertThrows(
            XJdfParseException.class,
            new Executable() {
                @Override
                public void execute() throws Throwable {
                    new XJmfParser().parseXJmf(xjmf);
                }
            }
        );
    }

    @Test
    public void parseXJmf_OutputStream() throws Exception {
        // arrange
        final XJMF xjmf = new XJMF().withHeader(
            new Header().withDeviceID("MyDevice").withID("ID").withTime(new DateTime("2017-03-27T21:31:54Z"))
        );

        // act
        final ByteArrayOutputStream bos = new ByteArrayOutputStream();


        // assert
        assertThrows(
            XJdfParseException.class,
            new Executable() {
                @Override
                public void execute() throws Throwable {
                    new XJmfParser().parseXJmf(xjmf, bos);
                }
            }
        );
    }

    @Test
    public void parseXJmf_ByteArray_SkipValidation() throws Exception {
        // arrange
        XJMF xjmf = new XJMF().withHeader(
                new Header().withDeviceID("MyDevice").withID("ID").withTime(new DateTime("2017-03-27T21:31:54Z"))
        );

        // act
        byte[] actual = new XJmfParser().parseXJmf(xjmf, true);

        // assert
        String jmf = new String(actual);
        assertTrue(jmf.contains("Time=\"2017-03-27T21:31:54Z\""), "Cannot find time.");
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
        new XJmfParser().parseXJmf(xjmf, bos,true);
        byte[] actual = bos.toByteArray();

        // assert
        String jmf = new String(actual);
        assertTrue(jmf.contains("Time=\"2017-03-27T21:31:54Z\""), "Cannot find time.");
        assertTrue(jmf.contains("DeviceID=\"MyDevice\""), "Cannot find DeviceId.");
        assertTrue(jmf.contains("ID=\"ID\""), "Cannot find ID.");
    }
}