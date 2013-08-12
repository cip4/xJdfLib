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
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;

/**
 * Unpackaging logic for packages.
 * @author s.meissner
 * @date 12.08.2013
 */
public class AbstractXmlUnpackager {

	/**
	 * Default Default constructor.
	 */
	public AbstractXmlUnpackager() {

	}

	/**
	 * Unpackages a ZIP Package.
	 * @param pathPgk Path to ZIP Package.
	 * @return Root directory of package.
	 * @throws IOException
	 */
	protected String unpackageZip(String pathPgk) throws IOException {

		// create temp root dir
		String tempDir = FileUtils.getTempDirectoryPath();
		String rootName = String.format("cip4_unpackage_%s", System.currentTimeMillis());
		String targetDir = FilenameUtils.concat(tempDir, rootName);

		// unpackge and return root dir
		return unpackageZip(pathPgk, targetDir);
	}

	/**
	 * Unpackages a ZIP Package.
	 * @param pathPgk Path to ZIP Package.
	 * @param targetDir Target destionation.
	 * @return Root directory of package.
	 * @throws IOException
	 */
	protected String unpackageZip(String pathPgk, String targetDir) throws IOException {

		// unpackage
		ZipInputStream zis = new ZipInputStream(new FileInputStream(pathPgk));
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
}
