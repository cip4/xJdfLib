package org.cip4.lib.xjdf.xml.internal;

import org.cip4.lib.xjdf.exception.XJdfValidationException;
import org.cip4.lib.xjdf.schema.*;
import org.cip4.lib.xjdf.type.DateTime;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit test case for XJdfValidator.
 */
public class XJdfValidatorTest {

    private XJdfValidator xJdfValidator;

    @BeforeEach
    public void setUp() {
        xJdfValidator = new XJdfValidator();
    }

    @AfterEach
    public void tearDown() {
        xJdfValidator = null;
    }

    @Test
    public void validate_invalid_semantic_1() throws Exception {

        // arrange
        byte[] xjdf = loadFile("validator-invalid_semantic-1.xjdf");

        // act / assert
        xJdfValidator.validateSyntax(xjdf);

        assertThrows(
            XJdfValidationException.class,
            () -> xJdfValidator.validateSemantic(xjdf)
        );
    }

    @Test
    public void validate_invalid_syntax_1() throws Exception {

        // arrange
        byte[] xjdf = loadFile("validator-invalid_syntax-1.xjdf");

        // act / assert
        assertThrows(
            XJdfValidationException.class,
            () -> xJdfValidator.validateSyntax(xjdf)
        );

        assertThrows(
            XJdfValidationException.class,
            () -> xJdfValidator.validateSemantic(xjdf)
        );
    }

    @Test
    public void validate_valid_1() throws Exception {

        // arrange
        byte[] xjdf = loadFile("validator-valid.xjdf");

        // act / assert (no exception)
        xJdfValidator.validateSyntax(xjdf);

        xJdfValidator.validateSemantic(xjdf);

        xJdfValidator.validate(xjdf);
    }

    @Test
    public void validate_foreign_namespace_1() throws Exception {

        // arrange
        byte[] xjdf = loadFile("validator_foreign-namespace.xjdf");

        // act / assert (no exception)
        xJdfValidator.validateSyntax(xjdf);

        xJdfValidator.validateSemantic(xjdf);

        xJdfValidator.validate(xjdf);
    }

    @Test
    public void validate_test() throws Exception {

        // arrange
        byte[] xjdf = loadFile("validator-test.xjdf");

        // act / assert (no exception)
        xJdfValidator.validateSyntax(xjdf);

        assertThrows(
            XJdfValidationException.class,
            () -> xJdfValidator.validateSemantic(xjdf)
        );

        assertThrows(
            XJdfValidationException.class,
            () -> xJdfValidator.validate(xjdf)
        );
    }

    /**
     * Helper method to load a file.
     * @param filename The files name.
     * @return The file as byte array.
     */
    private byte[] loadFile(String filename) throws IOException {
        return XJdfValidatorTest.class.getResourceAsStream("/org/cip4/lib/xjdf/xml/" + filename).readAllBytes();
    }

    @Test
    public void integrationInvalid() throws Exception {

        // arrange
        XJDF xjdf = new XJDF().withGeneralID(
            new GeneralID()
        );

        byte[] bytes = new XJdfParser<XJDF>().writeXml(xjdf);


        // act / assert
        xJdfValidator.validateSyntax(bytes);

        assertThrows(
            XJdfValidationException.class,
            () -> xJdfValidator.validateSemantic(bytes)
        );

        assertThrows(
            XJdfValidationException.class,
            () -> xJdfValidator.validate(bytes)
        );
    }

    @Test
    public void testParseXJdfInvalid() throws Exception {

        // arrange
        final String VALUE = UUID.randomUUID().toString();

        XJDF xjdf = new XJDF().withGeneralID(new GeneralID().withIDUsage("CatalobID").withIDValue(VALUE));
        byte[] bytes = new XJdfParser<XJDF>().writeXml(xjdf);

        // act
        assertThrows(
            XJdfValidationException.class,
            () -> xJdfValidator.validate(bytes)
        );
    }

    @Test
    public void parseXjdfValidatesDocument() throws Exception {

        XJDF xjdf = new XJDF().withTypes(Collections.EMPTY_LIST);
        byte[] bytes = new XJdfParser<XJDF>().writeXml(xjdf);

        assertThrows(
            XJdfValidationException.class,
            () -> xJdfValidator.validate(bytes)
        );
    }

    private XJDF getInvalidXjdfDocument() {
        // xjdf is invalid, because empty list of types is not allowed.
        return new XJDF().withTypes(Collections.EMPTY_LIST);
    }

    @Test
    public void parseXJmf_ByteArray() throws Exception {
        // arrange
        final XJMF xjmf = new XJMF().withHeader(
            new Header().withDeviceID("MyDevice").withID("ID").withTime(new DateTime("2017-03-27T21:31:54Z"))
        );

        byte[] bytes = new XJdfParser<XJMF>().writeXml(xjmf);

        // act
        // assert
        assertThrows(
            XJdfValidationException.class,
            () -> xJdfValidator.validate(bytes)
        );
    }

    @Test
    public void parseXJmf_OutputStream() throws Exception {
        // arrange
        final XJMF xjmf = new XJMF().withHeader(
            new Header().withDeviceID("MyDevice").withID("ID").withTime(new DateTime("2017-03-27T21:31:54Z"))
        );

        byte[] bytes = new XJdfParser<XJMF>().writeXml(xjmf);

        // act
        final ByteArrayOutputStream bos = new ByteArrayOutputStream();


        // assert
        assertThrows(
            XJdfValidationException.class,
            () -> xJdfValidator.validate(bytes)
        );
    }
}
