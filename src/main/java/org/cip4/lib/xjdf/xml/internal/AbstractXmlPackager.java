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
package org.cip4.lib.xjdf.xml.internal;

import java.io.ByteArrayInputStream;
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
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * Packaging logic for XML Documents. Package an XML with all references in a ZIP Package.
 * @author stefan.meissner
 * @date 27.01.2013
 */
public abstract class AbstractXmlPackager {

	private CompressionLevel compressionLevel;

	private final Map<String, File> fileMap;

	private final XPathNavigatorBase xPathNav;

	private final byte[] xmlDoc;

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
	 * Custom constructor. Accepting an XML Document for initializing.
	 * @param obj XML Document for parsing and packaging.
	 * @param docName The Main Documents name.
	 * @throws Exception
	 */
	public AbstractXmlPackager(byte[] xmlDoc) throws Exception {

		// new navigator
		InputStream isXml = new ByteArrayInputStream(xmlDoc);
		this.xPathNav = new XPathNavigatorBase(isXml);

		// init instance variables
		compressionLevel = CompressionLevel.DEFAULT_COMPRESSION;
		this.fileMap = new HashMap<String, File>();
		this.xmlDoc = xmlDoc;
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
	 * @param os Target OutputStream where XJdfDocument is being packaged.
	 * @throws Exception
	 */
	protected void packageXml(OutputStream os, String docName) throws Exception {

		// create zip
		ZipOutputStream zout = new ZipOutputStream(os);
		zout.setLevel(compressionLevel.getLevel());

		// put XML to archive
		ZipEntry zipEntryXml = new ZipEntry(docName);
		zout.putNextEntry(zipEntryXml);

		InputStream isXJdf = xPathNav.getXmlStream();
		IOUtils.copy(isXJdf, zout);
		isXJdf.close();

		// put all files to archive
		for (String key : fileMap.keySet()) {
			FileInputStream fis = new FileInputStream(fileMap.get(key));

			ZipEntry zipEntryFile = new ZipEntry(key);
			zout.putNextEntry(zipEntryFile);
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
	protected void registerFiles(String xPathAttribute, String targetDir) throws XPathExpressionException {

		// iterate over all attributes
		NodeList nodeList = xPathNav.executeXPath(xPathAttribute);

		for (int i = 0; i < nodeList.getLength(); i++) {

			Node node = nodeList.item(i);

			// check url
			File file = new File(node.getTextContent());

			if (file.isFile()) {

				// update filename
				String fileName = FilenameUtils.concat(targetDir, file.getName());
				fileName = FilenameUtils.separatorsToUnix(fileName);
				node.setNodeValue(fileName);

				// register
				fileMap.put(fileName, file);
			}
		}
	}

}
