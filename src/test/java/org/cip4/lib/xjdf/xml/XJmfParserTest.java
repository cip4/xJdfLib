package org.cip4.lib.xjdf.xml;

import org.apache.commons.io.IOUtils;
import org.cip4.lib.xjdf.schema.Header;
import org.cip4.lib.xjdf.schema.QueryNotification;
import org.cip4.lib.xjdf.schema.XJMF;
import org.cip4.lib.xjdf.type.DateTime;
import org.junit.Test;

import javax.xml.bind.ValidationException;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URI;

import static org.junit.Assert.*;

/**
 * JUnit test case for XJmfParser.
 */
public class XJmfParserTest {

    @Test(expected = ValidationException.class)
    public void parseXJmf_ByteArray() throws Exception {
        // arrange
        XJMF xjmf = new XJMF().withHeader(
            new Header().withDeviceID("MyDevice").withID("ID").withTime(new DateTime("2017-03-27T21:31:54Z"))
        );

        // act
        new XJmfParser().parseXJmf(xjmf);

        // assert
        // expect exception
    }

    @Test(expected = ValidationException.class)
    public void parseXJmf_OutputStream() throws Exception {
        // arrange
        XJMF xjmf = new XJMF().withHeader(
            new Header().withDeviceID("MyDevice").withID("ID").withTime(new DateTime("2017-03-27T21:31:54Z"))
        );

        // act
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        new XJmfParser().parseXJmf(xjmf, bos);

        // assert
        // expect exception
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
        assertTrue("Cannot find time.", jmf.contains("Time=\"2017-03-27T21:31:54Z\""));
        assertTrue("Cannot find DeviceId.", jmf.contains("DeviceID=\"MyDevice\""));
        assertTrue("Cannot find ID.", jmf.contains("ID=\"ID\""));
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
        assertTrue("Cannot find time.", jmf.contains("Time=\"2017-03-27T21:31:54Z\""));
        assertTrue("Cannot find DeviceId.", jmf.contains("DeviceID=\"MyDevice\""));
        assertTrue("Cannot find ID.", jmf.contains("ID=\"ID\""));
    }
}