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
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.Deflater;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.xml.xpath.XPathExpressionException;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.cip4.lib.xjdf.schema.XJDF;
import org.cip4.lib.xjdf.util.IDGeneratorUtil;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * Packaging logic for XJDF Documents. Package an XJDF with all references in a ZIP Package.
 * @author s.meissner
 * @date 26.01.2013
 */
public class XJdfPackager {

	private final Map<String, String> fileMap;

	private final XJdfNavigator xJdfNavigator;

	private final String jobId;

	private CompressionLevel compressionLevel;

	/**
	 * ZIP Compression Level
	 * @author stefan.meissner
	 * @date 26.01.2013
	 */
	public enum CompressionLevel {

		BEST_SPEED(Deflater.BEST_SPEED),
		BEST_COMPRESSION(Deflater.BEST_COMPRESSION),
		DEFAULT_COMPRESSION(Deflater.DEFAULT_COMPRESSION),
		NO_COMPRESSION(Deflater.NO_COMPRESSION);

		private final int level;

		CompressionLevel(int level) {
			this.level = level;
		}

		public int getLevel() {
			return level;
		}
	}

	/**
	 * Custom constructor. Accepting an XJDF Document for initializing.
	 * @param xjdf
	 * @throws Exception
	 */
	public XJdfPackager(XJDF xjdf) throws Exception {

		// create jobId
		String jobId;

		if (xjdf.getJobID() == null || xjdf.getJobID().equals("")) {
			jobId = IDGeneratorUtil.generateID("XJDF");
		} else {
			jobId = xjdf.getJobID();
		}

		// parse xJdf
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		XJdfParser parser = new XJdfParser();
		parser.parseXJdf(xjdf, bos, true);
		bos.close();

		// init instance variables
		this.jobId = jobId;
		this.xJdfNavigator = new XJdfNavigator(new ByteArrayInputStream(bos.toByteArray()));
		this.fileMap = new HashMap<String, String>();
		this.compressionLevel = CompressionLevel.DEFAULT_COMPRESSION;
	}

	/**
	 * Getter for compressionLevel attribute.
	 * @return the compressionLevel
	 */
	public CompressionLevel getCompressionLevel() {
		return compressionLevel;
	}

	/**
	 * Setter for compressionLevel attribute.
	 * @param compressionLevel the compressionLevel to set
	 */
	public void setCompressionLevel(CompressionLevel compressionLevel) {
		this.compressionLevel = compressionLevel;
	}

	/**
	 * Packages an XJDF Document to a zipped binary output stream.
	 * @param xJdf XJDF Document for parsing and packaging.
	 * @param os Target OutputStream where XJdfDocument is being packaged.
	 * @throws Exception
	 */
	public void packageXJdf(OutputStream os) throws Exception {

		// register files
		registerFiles("//FileSpec/@URL", "artwork");

		// create zip
		ZipOutputStream zout = new ZipOutputStream(os);
		zout.setLevel(compressionLevel.getLevel());

		// put XJDF to archive
		ZipEntry zeXJdf = new ZipEntry(jobId + ".xjdf");
		zout.putNextEntry(zeXJdf);

		InputStream isXJdf = xJdfNavigator.getXmlStream();
		IOUtils.copy(isXJdf, zout);
		isXJdf.close();

		// put all files to archive
		for (String key : fileMap.keySet()) {
			FileInputStream fis = new FileInputStream(fileMap.get(key));

			ZipEntry zeFile = new ZipEntry(key);
			zout.putNextEntry(zeFile);
			IOUtils.copy(fis, zout);
			fis.close();
		}

		// flush
		zout.finish();
	}

	/**
	 * Check all attributes, defined by an xpath expression, for file URLs and update and register in fileMap.
	 * @param xPathAttribute XPath expression which defins a set of Attributes in XJDF Document.
	 * @throws XPathExpressionException
	 */
	private void registerFiles(String xPathAttribute, String targetDir) throws XPathExpressionException {

		// iterate over all attributes
		NodeList nodeList = xJdfNavigator.executeXPath(xPathAttribute);

		for (int i = 0; i < nodeList.getLength(); i++) {

			Node node = nodeList.item(i);

			// check url
			File file = new File(node.getTextContent());

			if (file.isFile()) {

				// update filename
				String fileName = FilenameUtils.concat(targetDir, file.getName());
				node.setNodeValue(fileName);

				// register
				fileMap.put(fileName, file.getAbsolutePath());
			}
		}
	}
}
