package org.cip4.lib.xjdf.builder;

import org.cip4.lib.xjdf.XJdfNodeFactory;
import org.cip4.lib.xjdf.schema.*;
import org.cip4.lib.xjdf.type.DateTime;
import org.cip4.lib.xjdf.type.URI;
import org.cip4.lib.xjdf.xml.XJdfParser;
import org.cip4.lib.xjdf.xml.internal.JAXBContextFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit test case for XJdfBuilder.
 */
public class XJdfBuilderTest extends AbstractBuilderTest<XJDF> {

    private final String RES_XJDF_GANGJOB = "/org/cip4/lib/xjdf/GangJob.xjdf";

    private final String RES_XJDF_RUNLIST = "/org/cip4/lib/xjdf/builder/runlist.xjdf";

    private XJdfBuilder xJdfBuilder;

    @BeforeEach
    public void setUp() throws Exception {
        xJdfBuilder = new XJdfBuilder();

        JAXBContextFactory.init();
    }

    @AfterEach
    public void tearDown() {
        xJdfBuilder = null;
    }

    @Test
    public void testAddGeneralIDParams() throws Exception {
        // arrange
        final String ID_USAGE = UUID.randomUUID().toString();
        final String ID_VALUE = UUID.randomUUID().toString();

        // act
        GeneralID generalId = new GeneralID().withIDUsage(ID_USAGE).withIDValue(ID_VALUE);
        xJdfBuilder.addGeneralID(generalId);

        // assert
        byte[] bytes = marshalResult(xJdfBuilder);

        String actualIDUsage = getXPathValue(bytes, "/xjdf:XJDF/xjdf:GeneralID/@IDUsage");
        assertEquals(ID_USAGE, actualIDUsage, "IDUsage in GeneralID is wrong.");

        String actualIDValue = getXPathValue(bytes, "/xjdf:XJDF/xjdf:GeneralID/@IDValue");
        assertEquals(ID_VALUE, actualIDValue, "IDValue in GeneralID is wrong.");

    }

    /**
     * Add Multiple GeneralID Resource to XJDF document.
     */
    @Test
    public void testAddGeneralIDParamsMultiple() throws Exception {
        // arrange
        final String ID_USAGE_1 = UUID.randomUUID().toString();
        final String ID_VALUE_1 = UUID.randomUUID().toString();

        final String ID_USAGE_2 = UUID.randomUUID().toString();
        final String ID_VALUE_2 = UUID.randomUUID().toString();

        final String ID_VALUE_3 = "";

        // act
        xJdfBuilder.addGeneralID(new GeneralID().withIDUsage(ID_USAGE_1).withIDValue(ID_VALUE_1));
        xJdfBuilder.addGeneralID(new GeneralID().withIDUsage(ID_USAGE_2).withIDValue(ID_VALUE_2));

        // assert
        byte[] bytes = marshalResult(xJdfBuilder);

        String actualIDUsage_1 = getXPathValue(bytes, "/xjdf:XJDF/xjdf:GeneralID[1]/@IDUsage");
        assertEquals(ID_USAGE_1, actualIDUsage_1, "IDUsage in GeneralID is wrong.");

        String actualIDValue_1 = getXPathValue(bytes, "/xjdf:XJDF/xjdf:GeneralID[1]/@IDValue");
        assertEquals(ID_VALUE_1, actualIDValue_1, "IDValue in GeneralID is wrong.");

        String actualIDUsage_2 = getXPathValue(bytes, "/xjdf:XJDF/xjdf:GeneralID[2]/@IDUsage");
        assertEquals(ID_USAGE_2, actualIDUsage_2, "IDUsage in GeneralID is wrong.");

        String actualIDValue_2 = getXPathValue(bytes, "/xjdf:XJDF/xjdf:GeneralID[2]/@IDValue");
        assertEquals(ID_VALUE_2, actualIDValue_2, "IDValue in GeneralID is wrong.");

        String actualIDValue_3 = getXPathValue(bytes, "/xjdf:XJDF/xjdf:GeneralID[3]/@IDValue");
        assertEquals(ID_VALUE_3, actualIDValue_3, "IDValue in GeneralID is wrong.");

    }

    /**
     * Add Resource "Product" to XJDF document.
     */
    @Test
    public void testAddProductSimple() throws Exception {
        // arrange
        Product product = new Product();
        product.setAmount(1000);

        // act
        xJdfBuilder.addProduct(product);

        // assert
        marshalResult(xJdfBuilder);
    }

    @Test
    public void addAudit() throws Exception {

        // arrange
        Header header = new Header();
        header.setAgentName("MyAgent");

        AuditCreated auditCreated = new AuditCreated();
        auditCreated.setHeader(header);

        // act
        xJdfBuilder.addAudit(auditCreated);

        // assert
        assertEquals("MyAgent", xJdfBuilder.getXJdf().getAuditPool().getAudits().get(0).getHeader().getAgentName());
    }

    /**
     * Add Resource "RunList" to XJDF document.
     */
    @Test
    public void testAddResourceRunList() throws Exception {

        // arrange
        final String URL = "http://www.example.org/w2p/Cover.pdf";

        FileSpec fileSpec = new FileSpec();
        fileSpec.setURL(new URI(new java.net.URI(URL)));

        RunList runList = new RunList();
        runList.setFileSpec(fileSpec);

        Part partCover = new Part();
        partCover.setRun("Cover");

        Part partContent = new Part();
        partContent.setRun("Content");

        // act
        xJdfBuilder.addResource(runList, partCover);

        // assert
        byte[] bytes = marshalResult(xJdfBuilder);

        String actualName = getXPathValue(bytes, "/xjdf:XJDF/xjdf:ResourceSet/@Name");
        assertEquals("RunList", actualName, "Name in ResourceSet is wrong.");

        String actualPartRun = getXPathValue(bytes, "/xjdf:XJDF/xjdf:ResourceSet/xjdf:Resource/xjdf:Part/@Run");
        assertEquals("Cover", actualPartRun, "RunTag in RunList is wrong.");

        String actualUrl = getXPathValue(
            bytes,
            "/xjdf:XJDF/xjdf:ResourceSet/xjdf:Resource/xjdf:RunList/xjdf:FileSpec/@URL"
        );
        assertEquals(URL, actualUrl, "RunTag in RunList is wrong.");
    }

    /**
     * Add Multiple Resource o XJDF document.
     */
    @Test
    public void testAddResourceMultiple() throws Exception {

        // arrange
        final String urlContent = "http://www.example.org/w2p/Content.pdf";
        final String urlCover = "http://www.example.org/w2p/Cover.pdf";


        new RunList().withFileSpec(
                new FileSpec().withURL(new URI(new java.net.URI(urlCover)))
        );

        RunList runListCover = new RunList().withFileSpec(
                new FileSpec().withURL(new URI(new java.net.URI(urlCover)))
        );

        RunList runListContent = new RunList().withFileSpec(
                new FileSpec().withURL(new URI(new java.net.URI(urlContent)))
        );

        Part partCover = new Part();
        partCover.setRun("Cover");

        Part partContent = new Part();
        partContent.setRun("Content");

        NodeInfo nodeInfo = new NodeInfo();
        nodeInfo.setEnd(new DateTime());

        // act
        xJdfBuilder.addResource(runListCover, partCover);
        xJdfBuilder.addResource(nodeInfo);
        xJdfBuilder.addResource(runListContent, partContent);

        // assert
        byte[] bytes = marshalResult(xJdfBuilder);

        assertEquals(
            "NodeInfo",
            getXPathValue(bytes, "/xjdf:XJDF/xjdf:ResourceSet[1]/@Name"),
            "ResourceSet for NodeInfo must be first ResourceSet since it is lexicographically smaller than RunList."
        );

        assertEquals(
            "RunList",
            getXPathValue(bytes, "/xjdf:XJDF/xjdf:ResourceSet[2]/@Name"),
            "ResourceSet for RunList must be second ResourceSet."
        );

        assertEquals(
            urlCover,
            getXPathValue(bytes, "/xjdf:XJDF/xjdf:ResourceSet[2]/xjdf:Resource[1]//xjdf:FileSpec/@URL"),
            "RunList for Cover must be first entry since it was added first."
        );

        assertEquals(
            urlContent,
            getXPathValue(bytes, "/xjdf:XJDF/xjdf:ResourceSet[2]/xjdf:Resource[2]//xjdf:FileSpec/@URL"),
            "RunList for Content must be second entry since it was added after cover."
        );
    }

    /**
     * Add Multiple Resource o XJDF document.
     */
    @Test
    public void testAddResourceList() throws Exception {

        // arrange
        final String urlCover = "http://www.example.org/w2p/Cover.pdf";
        final String urlContent_1 = "http://www.example.org/w2p/Content_1.pdf";
        final String urlContent_2 = "http://www.example.org/w2p/Content_2.pdf";

        List<SpecificResource> runLists = new ArrayList<>();

        runLists.add(new RunList().withFileSpec(
                new FileSpec().withURL(new URI(new java.net.URI(urlCover)))
        ));
        runLists.add(new RunList().withFileSpec(
                new FileSpec().withURL(new URI(new java.net.URI(urlContent_1)))
        ));
        runLists.add(new RunList().withFileSpec(
                new FileSpec().withURL(new URI(new java.net.URI(urlContent_2)))
        ));

        // act
        xJdfBuilder.addResource(runLists);

        // assert
        String actual;

        byte[] bytes = marshalResult(xJdfBuilder);

        actual = getXPathValue(bytes, "count(/xjdf:XJDF/xjdf:ResourceSet)");
        assertEquals("1", actual, "Number of ResourceSet nodes is wrong.");

        actual = getXPathValue(bytes, "count(/xjdf:XJDF/xjdf:ResourceSet/xjdf:Resource)");
        assertEquals("3", actual, "Number of RunList parameters is wrong.");

        actual = getXPathValue(bytes, "/xjdf:XJDF/xjdf:ResourceSet/@ProcessUsage");
        assertEquals("", actual, "Value Process Usage is wrong.");

        actual = getXPathValue(bytes, "/xjdf:XJDF/xjdf:ResourceSet/@Name");
        assertEquals("RunList", actual, "Attribute Name in ResourceSet is wrong.");

        actual = getXPathValue(
            bytes,
            "/xjdf:XJDF/xjdf:ResourceSet[@Name='RunList']/xjdf:Resource[1]/xjdf:RunList/xjdf:FileSpec/@URL"
        );
        assertEquals(urlCover, actual, "Attribute FileSpec URL is wrong.");

        actual = getXPathValue(
            bytes,
            "/xjdf:XJDF/xjdf:ResourceSet[@Name='RunList']/xjdf:Resource[2]/xjdf:RunList/xjdf:FileSpec/@URL"
        );
        assertEquals(urlContent_1, actual, "Attribute FileSpec URL is wrong.");

        actual = getXPathValue(
            bytes,
            "/xjdf:XJDF/xjdf:ResourceSet[@Name='RunList']/xjdf:Resource[3]/xjdf:RunList/xjdf:FileSpec/@URL"
        );
        assertEquals(urlContent_2, actual, "Attribute FileSpec URL is wrong.");
    }

    /**
     * Add Multiple Resource o XJDF document.
     */
    @Test
    public void testAddResourceListProcessUsage() throws Exception {

        // arrange
        final String urlCover = "http://www.example.org/w2p/Cover.pdf";
        final String urlContent_1 = "http://www.example.org/w2p/Content_1.pdf";
        final String urlContent_2 = "http://www.example.org/w2p/Content_2.pdf";
        String processUsage_1 = "PROCESS_USAGE_1";
        String processUsage_2 = "PROCESS_USAGE_2";

        List<SpecificResource> runList_1 = new ArrayList<>();
        runList_1.add(new RunList().withFileSpec(
                new FileSpec().withURL(new URI(new java.net.URI(urlCover)))
        ));

        List<SpecificResource> runList_2 = new ArrayList<>();
        runList_2.add(new RunList().withFileSpec(
                new FileSpec().withURL(new URI(new java.net.URI(urlContent_1)))
        ));
        runList_2.add(new RunList().withFileSpec(
                new FileSpec().withURL(new URI(new java.net.URI(urlContent_2)))
        ));

        // act
        xJdfBuilder.addResource(runList_1, processUsage_1);
        xJdfBuilder.addResource(runList_2, processUsage_2);

        // assert
        String actual;

        byte[] bytes = marshalResult(xJdfBuilder);

        actual = getXPathValue(bytes, "count(/xjdf:XJDF/xjdf:ResourceSet)");
        assertEquals("2", actual, "Number of ResourceSet nodes is wrong.");

        actual = getXPathValue(bytes, "count(/xjdf:XJDF/xjdf:ResourceSet[1]/xjdf:Resource)");
        assertEquals("1", actual, "Number of RunList parameters is wrong.");

        actual = getXPathValue(bytes, "count(/xjdf:XJDF/xjdf:ResourceSet[2]/xjdf:Resource)");
        assertEquals("2", actual, "Number of RunList parameters is wrong.");

        actual = getXPathValue(bytes, "/xjdf:XJDF/xjdf:ResourceSet[1]/@ProcessUsage");
        assertEquals(processUsage_1, actual, "Value Process Usage is wrong.");

        actual = getXPathValue(bytes, "/xjdf:XJDF/xjdf:ResourceSet[2]/@ProcessUsage");
        assertEquals(processUsage_2, actual, "Value Process Usage is wrong.");
    }

    /**
     * Test of the initializing with an XJDF Document.
     */
    @Test
    public void testXJDFConstructor() throws Exception {

        // arrange
        InputStream is = XJdfBuilderTest.class.getResourceAsStream(RES_XJDF_GANGJOB);

        final String CUSTOMER_ID = "myCustomerID";

        XJdfParser parser = new XJdfParser();
        XJDF xjdf = parser.parseStream(is);

        // act
        XJdfBuilder xJdfBuilder = new XJdfBuilder(xjdf);
        xJdfBuilder.addResource(new CustomerInfo().withCustomerID(CUSTOMER_ID));

        // assert
        int actual;

        byte[] bytes = marshalResult(xJdfBuilder);

        actual = Integer.parseInt(
            getXPathValue(
                bytes,
                "count(/xjdf:XJDF/xjdf:ResourceSet[@Name='CustomerInfo'][1]/xjdf:Resource)"
            )
        );
        assertEquals(2, actual, "Number of Resource Nodes is wrong.");
    }

    /**
     * Test of the initializing with an XJDF Document with process usage.
     */
    @Test
    public void testXJDFConstructorProcessUsage() throws Exception {

        // arrange
        InputStream is = XJdfBuilderTest.class.getResourceAsStream(RES_XJDF_RUNLIST);

        final String FILE_NAME = "myTestFile.pdf";

        XJdfParser parser = new XJdfParser();
        XJDF xjdf = parser.parseStream(is);

        // act
        XJdfBuilder xJdfBuilder = new XJdfBuilder(xjdf);
        xJdfBuilder.addResource(new RunList().withFileSpec(
                new FileSpec().withURL(new URI(new java.net.URI(FILE_NAME)))
        ), "PROCESS_USAGE_1");

        String actual;

        byte[] bytes = marshalResult(xJdfBuilder);

        actual = getXPathValue(
            bytes,
            "count(/xjdf:XJDF/xjdf:ResourceSet[@Name='RunList' and @ProcessUsage='PROCESS_USAGE_1']/xjdf:Resource)"
        );
        assertEquals("2", actual, "Number of Resource Nodes is wrong.");

        actual = getXPathValue(
            bytes,
            "/xjdf:XJDF/xjdf:ResourceSet[@Name='RunList' and @ProcessUsage='PROCESS_USAGE_1']/xjdf:Resource[2]/xjdf:RunList/xjdf:FileSpec/@URL"
        );
        assertEquals(FILE_NAME, actual, "Filename is wrong.");
    }

    /**
     * Test of the initializing with an XJDF Document with process usage.
     */
    @Test
    public void testXJDFConstructorProcessUsageNull() throws Exception {

        // arrange
        InputStream is = XJdfBuilderTest.class.getResourceAsStream(RES_XJDF_RUNLIST);

        final String FILE_NAME = "myTestFile.pdf";

        XJdfParser parser = new XJdfParser();
        XJDF xjdf = parser.parseStream(is);

        // act
        XJdfBuilder xJdfBuilder = new XJdfBuilder(xjdf);
        xJdfBuilder.addResource(new RunList().withFileSpec(
                new FileSpec().withURL(new URI(new java.net.URI(FILE_NAME)))
        ));

        String actual;

        byte[] bytes = marshalResult(xJdfBuilder);

        actual = getXPathValue(
            bytes,
            "count(/xjdf:XJDF/xjdf:ResourceSet[@Name='RunList' and @ProcessUsage='PROCESS_USAGE_1']/xjdf:Resource)"
        );
        assertEquals("1", actual, "Number of Resource Nodes is wrong.");

        actual = getXPathValue(
            bytes,
            "/xjdf:XJDF/xjdf:ResourceSet[not(@ProcessUsage)]/xjdf:Resource/xjdf:RunList/xjdf:FileSpec/@URL"
        );
        assertEquals(FILE_NAME, actual, "Filename is wrong.");
    }

    @Test
    public void testAddResourceMultiple2() throws Exception {
        Media media1 = new Media().withMediaQuality("media1");
        Media media2 = new Media().withMediaQuality("media2");
        xJdfBuilder.addResource(media1);
        xJdfBuilder.addResource(media2);

        byte[] bytes = marshalResult(xJdfBuilder);
        assertEquals(getXPathValue(bytes, "count(//xjdf:ResourceSet)"), "1");
        assertEquals(getXPathValue(bytes, "count(//xjdf:ResourceSet/xjdf:Resource)"), "2");
    }

    @Test
    public void testAddResourceMultipleWithDifferentProcessUsage() throws Exception {
        Media media1 = new Media().withMediaQuality("media1");
        Media media2 = new Media().withMediaQuality("media2");
        xJdfBuilder.addResource(media1, null, "a");
        xJdfBuilder.addResource(media2, null, "b");

        byte[] bytes = marshalResult(xJdfBuilder);
        assertEquals(getXPathValue(bytes, "count(//xjdf:ResourceSet)"), "2");
    }
}
