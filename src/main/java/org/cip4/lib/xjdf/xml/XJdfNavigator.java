/**
 * All rights reserved by
 * 
 * flyeralarm GmbH
 * Alfred-Nobel-Straße 18
 * 97080 Würzburg
 *
 * info@flyeralarm.com
 * http://www.flyeralarm.com
 */
package org.cip4.lib.xjdf.xml;

import java.io.InputStream;

import org.cip4.lib.xjdf.xml.internal.XPathNavigatorBase;

/**
 * Navigator class which simplify XPath handling using XJdf Documents.
 * @author s.meissner
 * @date 06.03.2012
 */
public class XJdfNavigator extends XPathNavigatorBase {

	/**
	 * XPath to attribute 'JobID' in XJDF Document.
	 */
	public static final String JOB_ID = "/XJDF/@JobID";

	/**
	 * XPath to attribute 'Category' in XJDF Document.
	 */
	public static final String CATEGORY = "/XJDF/@Category";

	/**
	 * XPath to attribute 'IDValue' of GeneralID 'CatalogID' in XJDF Document.
	 */
	public static final String GENERAL_CATALOG_ID = "/XJDF/GeneralID[@IDUsage='CatalogID']/@IDValue";

	/**
	 * XPath to attribute 'IDValue' of GeneralID 'LineID' in XJDF Document.
	 */
	public static final String GENERAL_LINE_ID = "/XJDF/GeneralID[@IDUsage='LineID']/@IDValue";

	/**
	 * XPath to attribute 'URL' of a single RunList/FileSpec definition in XJDF Document.
	 */
	public static final String FILE_SPEC_URL = "/XJDF/ParameterSet[@Name='RunList']/Parameter/RunList/FileSpec/@URL";

	/**
	 * XPath to attribute 'MinApprovals' of ApprovalParams Node in XJDF Document.
	 */
	public static final String MIN_APPROVALS = "/XJDF/ParameterSet[@Name='ApprovalParams']/Parameter/ApprovalParams/@MinApprovals";

	/**
	 * XPath to attribute 'CustomerID' of CustomerInfo Node in XJDF Document.
	 */
	public static final String CUSTOMER_ID = "/XJDF/ParameterSet[@Name='CustomerInfo']/Parameter/CustomerInfo/@CustomerID";

	/**
	 * XPath to attribute 'Amount' of Product Node in XJDF Document.
	 */
	public static final String AMOUNT = "/XJDF/ProductList/Product/@Amount";

	/**
	 * XPath to attribute 'MediaQuality' of MediaIntent Node in XJDF Document.
	 */
	public static final String MEDIA_QUALITY = "/XJDF/ProductList/Product/Intent[@Name='MediaIntent']/MediaIntent/@MediaQuality";

	/**
	 * XPath to attribute 'FinishedDimensions' of LayoutIntent Node in XJDF Document.
	 */
	public static final String LAYOUT_FINISHED_DIMENSIONS = "/XJDF/ProductList/Product/Intent[@Name='LayoutIntent']/LayoutIntent/@FinishedDimensions";

	/**
	 * XPath to attribute 'Dimensions' of LayoutIntent Node in XJDF Document.
	 */
	public static final String LAYOUT_DIMENSIONS = "/XJDF/ProductList/Product/Intent[@Name='LayoutIntent']/LayoutIntent/@Dimensions";

	/**
	 * XPath to attribute 'PrintProcess' of ProductionIntent Node in XJDF Document.
	 */
	public static final String PRODUCTION_PRINT_PROCESS = "/XJDF/ProductList/Product/Intent[@Name='ProductionIntent']/ProductionIntent/@PrintProcess";

	/**
	 * XPath to attribute 'FoldingCatalog' of FoldingIntent Node in XJDF Document.
	 */
	public static final String FOLDING_CATALOG = "/XJDF/ProductList/Product/Intent[@Name='FoldingIntent']/FoldingIntent/@FoldingCatalog";

	/**
	 * XPath to attribute 'NumColors' of ColorIntent Node in XJDF Document.
	 */
	public static final String COLOR_NUM_COLORS = "/XJDF/ProductList/Product/Intent[@Name='ColorIntent']/ColorIntent/@NumColors";

	/**
	 * Custom constructor. Accepting a XJdf InputStream for initializing.
	 * @param xJdfStream The XJDF Input Stream.
	 */
	public XJdfNavigator(InputStream xJdfStream) throws Exception {
		super(xJdfStream);
	}

	/**
	 * Custom constructor. Accepting a XJdf InputStream for initializing.
	 * @param xJdfBytes The XJDF as byte array.
	 * @throws Exception
	 */
	public XJdfNavigator(byte[] xJdfBytes) throws Exception {
		super(xJdfBytes);
	}

	/**
	 * Returns the XJDF Document as Byte Array.
	 * @return XJDF Document as Byte Array.
	 */
	public byte[] getXJdfBytes() throws Exception {
		return super.getXmlBytes();
	}

	/**
	 * Retruns the XJDF Document as Stream.
	 * @return XJDF Document as Stream.
	 * @throws Exception Is thrown in case an exception occurs.
	 */
	public InputStream getXJdfStream() throws Exception {
		return super.getXmlStream();
	}

}
