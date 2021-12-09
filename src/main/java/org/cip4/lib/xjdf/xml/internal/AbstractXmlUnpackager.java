package org.cip4.lib.xjdf.xml.internal;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipInputStream;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;

/**
 * Unpackaging logic for packages.
 *
 * @author s.meissner
 * @author michel hartmann
 */
public abstract class AbstractXmlUnpackager {

    private final String pathPackage;

    private final List<String> lstFilename;

    /**
     * Custom constructor. Accepting a package path for initializing.
     *
     * @param pathPackage Path of the package.
     *
     * @throws IOException Is thrown in case an IOExcetion occurs.
     */
    public AbstractXmlUnpackager(String pathPackage) throws IOException {

        // init package
        this.pathPackage = pathPackage;

        // load file list
        lstFilename = new ArrayList<>();

        try (
            FileInputStream fileInputStream = new FileInputStream(pathPackage);
            ZipInputStream packageStream = new ZipInputStream(fileInputStream)
        ) {
            ZipEntry entry = packageStream.getNextEntry();

            while (entry != null) {
                lstFilename.add(entry.getName());
                entry = packageStream.getNextEntry();
            }
        }
    }

    /**
     * Unpackages a ZIP Package to a temporarily directory..
     *
     * @return Path to master file.
     */
    protected String unpackageZipTemp() throws IOException {

        return unpackageZipTemp("cip4");
    }

    /**
     * Unpackages a ZIP Package to a temporarily directory.
     *
     * @param appName Application name.
     *
     * @return Path to master file.
     */
    protected String unpackageZipTemp(String appName) throws IOException {

        // create temp root dir
        String tempDir = FileUtils.getTempDirectoryPath();
        String rootName = String.format("%s_unpackage_%s", appName, System.currentTimeMillis());
        String targetDir = FilenameUtils.concat(tempDir, rootName);

        // unpackge and return root dir
        return unpackageZip(targetDir);
    }

    /**
     * Unpackages a ZIP Package.
     *
     * @param targetDir Target destionation.
     *
     * @return Path to master file.
     */
    protected String unpackageZip(String targetDir) throws IOException {
        Path targetPath = Paths.get(targetDir).normalize();
        // unpackage
        try (ZipInputStream zis = new ZipInputStream(new FileInputStream(pathPackage))) {
            ZipEntry entry = zis.getNextEntry();

            while (entry != null) {
                Path targetFile = targetPath.resolve(entry.getName());
                if (!targetFile.normalize().startsWith(targetPath)) {
                    throw new ZipException("Bad zip entry");
                }

                Files.createDirectories(targetFile.getParent());

                if (!entry.isDirectory()) {
                    Files.copy(zis, targetFile);
                }

                entry = zis.getNextEntry();
            }
            zis.closeEntry();
        }

        // create absolute master path
        String relativePath = findMasterDocumentPath();
        relativePath = FilenameUtils.normalize(relativePath);

        targetDir = FilenameUtils.normalize(targetDir);

        // return root directory
        return FilenameUtils.concat(targetDir, relativePath);
    }

    /**
     * Find the master document path in package file.
     *
     * @return The master document as byte array.
     */
    protected String findMasterDocumentPath() {

        // find master document by extension (first match)
        String masterPath = null;

        for (int i = 0; i < lstFilename.size() && masterPath == null; i++) {

            // name pointer
            String p = lstFilename.get(i);

            // check
            for (int n = 0; n < getMasterExtension().length && masterPath == null; n++) {
                if (FilenameUtils.getExtension(p).equals(getMasterExtension()[n])) {
                    masterPath = p;
                }
            }
        }

        // extract file
        return masterPath;
    }

    /**
     * Find the master document in package file.
     *
     * @return The master document as byte array.
     * @throws IOException Is thrown in case an IOExcetion occurs.
     */
    protected byte[] findMasterDocument() throws IOException {

        byte[] bytes = null;

        // find master document by extension
        String masterPath = findMasterDocumentPath();

        if (!StringUtils.isEmpty(masterPath)) {
            bytes = extractFile(masterPath);
        }

        // return file as byte array
        return bytes;
    }

    /**
     * Extracts a file from Package.
     *
     * @param relativePath The relative path of the file which should be extracted.
     *
     * @return File as byte array.
     */
    public byte[] extractFile(String relativePath) throws IOException {

        // normalize user input
        String searchPath = FilenameUtils.normalize(relativePath, true);

        // read file
        byte[] bytes = null;
        try (
            FileInputStream fileStream = new FileInputStream(pathPackage);
            ZipInputStream packageStream = new ZipInputStream(fileStream)
        ) {
            ZipEntry entry = packageStream.getNextEntry();

            while (entry != null && bytes == null) {
                if (entry.getName().equals(searchPath)) {
                    bytes = IOUtils.toByteArray(packageStream);
                }
                entry = packageStream.getNextEntry();
            }
        }

        // extract file
        return bytes;
    }

    /**
     * Defines the file extension of the master file.
     *
     * @return Array of master file extensions.
     */
    protected abstract String[] getMasterExtension();
}
