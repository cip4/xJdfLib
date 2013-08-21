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
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;

/**
 * Unpackaging logic for packages.
 * @author s.meissner
 * @date 12.08.2013
 */
public class AbstractXmlUnpackager {

	private final String pathPackage;

	private final List<String> lstFilename;

	/**
	 * Custom constructor. Accepting a package path for initializing.
	 * @param pathPackage Path of the package.
	 * @throws IOException Is thrown in case an IOExcetion occurs.
	 */
	public AbstractXmlUnpackager(String pathPackage) throws IOException {

		// init package
		this.pathPackage = pathPackage;

		// load file list
		lstFilename = new ArrayList<String>(15);

		ZipInputStream packageStream = new ZipInputStream(new FileInputStream(pathPackage));
		ZipEntry entry = packageStream.getNextEntry();

		while (entry != null) {
			lstFilename.add(entry.getName());
			entry = packageStream.getNextEntry();
		}

		packageStream.close();
	}

	/**
	 * Unpackages a ZIP Package.
	 * @param pathPgk Path to ZIP Package.
	 * @return Root directory of package.
	 * @throws IOException
	 */
	protected String unpackageZip() throws IOException {

		// create temp root dir
		String tempDir = FileUtils.getTempDirectoryPath();
		String rootName = String.format("cip4_unpackage_%s", System.currentTimeMillis());
		String targetDir = FilenameUtils.concat(tempDir, rootName);

		// unpackge and return root dir
		return unpackageZip(targetDir);
	}

	/**
	 * Unpackages a ZIP Package.
	 * @param pathPgk Path to ZIP Package.
	 * @param targetDir Target destionation.
	 * @return Root directory of package.
	 * @throws IOException
	 */
	protected String unpackageZip(String targetDir) throws IOException {

		// unpackage
		ZipInputStream zis = new ZipInputStream(new FileInputStream(pathPackage));
		ZipEntry entry = zis.getNextEntry();

		while (entry != null) {
			String targetPath = FilenameUtils.concat(targetDir, entry.getName());
			File targetFile = new File(targetPath);

			File td = new File(FilenameUtils.getFullPath(targetPath));
			td.mkdirs();

			FileOutputStream fos = new FileOutputStream(targetFile);
			IOUtils.copy(zis, fos);
			fos.close();

			entry = zis.getNextEntry();
		}

		zis.closeEntry();
		zis.close();

		// return root directory
		return targetDir;
	}

	/**
	 * Find the master document in package file.
	 * @param extension Filename extension of the master file.
	 * @return The master document as byte array.
	 * @throws IOException Is thrown in case an IOExcetion occurs.
	 */
	protected byte[] findMasterDocument(String extension) throws IOException {

		// find master document by extension (first match)
		String masterPath = null;

		for (int i = 0; i < lstFilename.size() && masterPath == null; i++) {

			// name pointer
			String p = lstFilename.get(i);

			// check
			if (FilenameUtils.getExtension(p).equals(extension)) {
				masterPath = p;
			}
		}

		// get return value
		byte[] bytes = null;

		if (!StringUtils.isEmpty(masterPath)) {
			bytes = extractFile(masterPath);
		}

		// extract file
		return bytes;
	}

	/**
	 * Extracts a file from Package.
	 * @param relativePath The relative path of the file which should be extracted.
	 * @return File as byte array.
	 * @throws IOException
	 */
	public byte[] extractFile(String relativePath) throws IOException {

		// normalize user input
		String searchPath = FilenameUtils.normalize(relativePath, true);

		// read file
		ZipInputStream packageStream = new ZipInputStream(new FileInputStream(pathPackage));
		ZipEntry entry = packageStream.getNextEntry();

		byte[] bytes = null;

		while (entry != null && bytes == null) {

			if (entry.getName().equals(searchPath)) {
				bytes = IOUtils.toByteArray(packageStream);
			}

			entry = packageStream.getNextEntry();

		}

		packageStream.close();

		// extract file
		return bytes;

	}
}
