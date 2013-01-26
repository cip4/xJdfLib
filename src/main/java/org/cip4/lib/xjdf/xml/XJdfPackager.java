/**
 * All rights reserved by
 * 
 * flyeralarm GmbH
 * Alfred-Nobel-Straße 18
 * 97080 Würzburg
 *
 * Email: info@flyeralarm.com
 * Website: http://www.flyeralarm.com
 */
package org.cip4.lib.xjdf.xml;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.cip4.lib.xjdf.schema.XJDF;

/**
 * Packaging logic for XJDF Documents. Package an XJDF with all references in a ZIP Package.
 * @author s.meissner
 * @date 26.01.2013
 */
public class XJdfPackager {

	/**
	 * Packages an XJDF Document to a zipped binary output stream.
	 * @param xJdf XJDF Document for parsing and packaging.
	 * @param os Target OutputStream where XJdfDocument is being packaged.
	 * @throws Exception
	 */
	public void packageXJdf(XJDF xJdf, OutputStream os) throws Exception {

		// parse xJdf
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		XJdfParser parser = new XJdfParser();
		parser.parseXJdf(xJdf, bos, true);
		bos.close();

		byte[] xJdfBytes = bos.toByteArray();

		// update paths
		XJdfNavigator nav = new XJdfNavigator(new ByteArrayInputStream(xJdfBytes));
		int cntRunList = Integer.parseInt(nav.readAttribute("count(//ParameterSet[@Name='RunList']/Parameter/RunList/FileSpec/@URL)"));

		for (int iRunList = 1; iRunList <= cntRunList; iRunList++) {

			// build xpath
			String xPath = String.format("//ParameterSet[@Name='RunList']/Parameter[%s]/RunList/FileSpec/@URL", iRunList);

			// read file path
			String fileName = nav.readAttribute(xPath);
			fileName = FilenameUtils.getName(fileName);
			nav.updateAttribute(xPath, "runlist/" + fileName);
		}

		InputStream isXJdf = nav.getXmlStream();

		// zip files
		ZipOutputStream zout = new ZipOutputStream(os);
		zout.setLevel(9);

		ZipEntry ze = new ZipEntry("file2.xjdf");
		zout.putNextEntry(ze);
		IOUtils.copy(isXJdf, zout);
		isXJdf.close();

		zout.close();

	}
}
