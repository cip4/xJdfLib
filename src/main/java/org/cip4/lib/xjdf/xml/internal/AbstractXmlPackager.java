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

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
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

	private final URI rootUri;

	private final Map<File, URI> fileMap;

	private final XmlNavigator xPathNav;

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
	 * Custom constructor. Accepting an XJDF Path for initializing.
	 *
	 * @param xmlPath Path to XJDF Document.
	 * @throws Exception
	 */
	public AbstractXmlPackager(String xmlPath) throws Exception {

		// load XJDF
		InputStream is = new FileInputStream(xmlPath);
		byte[] bytes = IOUtils.toByteArray(is);
		is.close();

		// extract root path
		String rootPath = FilenameUtils.getFullPath(xmlPath);

		// init instance varialbes
		this.xPathNav = new XmlNavigator(bytes);
		this.compressionLevel = CompressionLevel.DEFAULT_COMPRESSION;
		this.fileMap = new HashMap<>();
		this.xmlDoc = bytes;
		this.rootUri = new File(rootPath).toURI();
	}

	/**
	 * Custom constructor. Accepting an XML Document for initializing.
	 *
	 * @param xmlDoc XML Document for parsing and packaging.
	 * @param rootPath Root path of the files.
	 * @throws Exception
	 */
	public AbstractXmlPackager(byte[] xmlDoc, String rootPath) throws Exception {

		// new navigator
		this.xPathNav = new XmlNavigator(xmlDoc);

		// init instance variables
		this.compressionLevel = CompressionLevel.DEFAULT_COMPRESSION;
		this.fileMap = new HashMap<>();
		this.xmlDoc = xmlDoc;
		if (null != rootPath) {
			this.rootUri = new File(rootPath).toURI();
		} else {
			this.rootUri = null;
		}
	}

	/**
	 * Getter for xmlDoc attribute.
	 * @return the xmlDoc
	 */
	protected byte[] getXmlDoc() {
		return xmlDoc;
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
		for (File key : fileMap.keySet()) {
			InputStream fis = fileMap.get(key).toURL().openStream();

			zout.putNextEntry(new ZipEntry(key.getPath().replace("\\", "/")));
			IOUtils.copy(fis, zout);
			fis.close();
		}

		// flush
		zout.finish();
	}

	/**
	 * Check all attributes, defined by an xpath expression, for file URLs and update and register in fileMap.
	 *
	 * @param xPathAttribute XPath expression which defins a set of Attributes in XJDF Document.
	 * @throws PackagerException if files can not be read from the xJdf.
	 */
	protected void registerFiles(String xPathAttribute, String targetDir) throws PackagerException {

		// iterate over all attributes
		NodeList nodeList;
		try {
			nodeList = xPathNav.evaluateNodeList(xPathAttribute);
		} catch (XPathExpressionException e) {
			throw new PackagerException("NodeList could not be retrieved from xJdf.", e);
		}

		for (int i = 0; i < nodeList.getLength(); i++) {
			Node node = nodeList.item(i);

			String filePath = node.getTextContent();
			File targetFile = registerFile(filePath, targetDir);
			// update filename
			node.setNodeValue(FilenameUtils.separatorsToUnix(targetFile.getPath()));
		}
	}

	protected File registerFile(final String srcPath, final String targetDir) throws PackagerException {
		URI srcUri;

		try {
			srcUri = new URI(srcPath);
		} catch (URISyntaxException e) {
			srcUri = null;
		}

		if (srcUri == null || !srcUri.isAbsolute()) {
			File file = new File(srcPath);
			if (!file.isAbsolute()) {
				if (rootUri == null) {
					throw new PackagerException(
						String.format(
							"Can not resolve relative path '%s' because no rootPath was provided.",
							srcPath
						)
					);
				}

				file = new File(rootUri.resolve(FilenameUtils.separatorsToUnix(file.getPath())));
			}
			srcUri = file.toURI();
		}

		// register for packaging
		File targetFile = new File(FilenameUtils.concat(targetDir, FilenameUtils.getName(srcUri.getPath())));
		fileMap.put(targetFile, srcUri);
		return targetFile;
	}
}
