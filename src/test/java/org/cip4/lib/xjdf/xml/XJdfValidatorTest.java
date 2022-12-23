package org.cip4.lib.xjdf.xml;

import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.ValidationException;
import org.cip4.lib.xjdf.XJdfDocument;
import org.cip4.lib.xjdf.schema.*;
import org.cip4.lib.xjdf.xml.internal.JAXBContextFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit test case for XJdfValidator.
 */
public class XJdfValidatorTest {

    private XJdfValidator xJdfValidator;

    private ObjectFactory objectFactory;

    /**
     * Default constructor.
     */
    public XJdfValidatorTest() {
        try {
            JAXBContextFactory.init();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    @BeforeEach
    public void setUp() {
        // init instance variables
        objectFactory = new ObjectFactory();
    }

    @AfterEach
    public void tearDown() {
        xJdfValidator = null;
        objectFactory = null;
    }

    @Test
    public void integrationInvalid() throws Exception {

        // arrange
        XJDF xjdf = new XJDF().withGeneralID(
            new GeneralID()
        );

        // act
        xJdfValidator = new XJdfValidator();

        assertThrows(
            ValidationException.class,
            new Executable() {
                @Override
                public void execute() throws Throwable {
                    xJdfValidator.validate(new XJdfDocument(xjdf));
                }
            }
        );
    }

    @Test
    public void integrationValid() throws Exception {

        // arrange
        XJDF xjdf = new XJDF()
            .withJobID("JOB_ID")
            .withTypes("Web2Print")
            .withGeneralID(
                new GeneralID().withIDUsage("CatalogID").withIDValue("42")
            );

        // act
        xJdfValidator = new XJdfValidator();
        xJdfValidator.validate(new XJdfDocument(xjdf));
    }

    @Test
    public void integrationAnalyzeMessagesInvalid() throws Exception {

        // arrange
        XJDF xjdf = new XJDF().withGeneralID(
            new GeneralID()
        );

        // act
        xJdfValidator = new XJdfValidator();

        assertThrows(
            ValidationException.class,
            new Executable() {
                @Override
                public void execute() throws Throwable {
                    xJdfValidator.validate(new XJdfDocument(xjdf));
                }
            }
        );
    }

    @Test
    public void isValidXjdfIsInvalid() throws IOException, JAXBException {
        // arrange
        XJdfDocument xJdfDocument = new XJdfDocument(XJdfValidatorTest.class.getResourceAsStream("/org/cip4/lib/xjdf/test.xjdf").readAllBytes());

        // act
        xJdfValidator = new XJdfValidator();

        assertThrows(
            ValidationException.class,
            new Executable() {
                @Override
                public void execute() throws Throwable {
                    xJdfValidator.validate(xJdfDocument);
                }
            }
        );
    }

    @Test
    public void foreignNamespaceInResource() throws Exception {
        InputStream is = XJdfValidatorTest.class.getResourceAsStream("../foreignNamespace.xjdf");
        xJdfValidator = new XJdfValidator();
        xJdfValidator.validate(is);
    }
}
