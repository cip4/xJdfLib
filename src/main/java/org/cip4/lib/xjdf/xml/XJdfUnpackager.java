package org.cip4.lib.xjdf.xml;

import java.io.IOException;

import org.cip4.lib.xjdf.XJdfDocument;
import org.cip4.lib.xjdf.xml.internal.AbstractXmlUnpackager;

/**
 * Unpackaging logic for XJDF Packages.
 *
 * @author s.meissner
 */
public class XJdfUnpackager extends AbstractXmlUnpackager {

    /**
     * Custom constructor. Accepting a XJDF Package Path for initializing.
     *
     * @param pathPackage Path to XJDF Package.
     */
    public XJdfUnpackager(String pathPackage) throws IOException {
        super(pathPackage);
    }

    /**
     * Returns the XJDF Document covered by the XJDFNavigator.
     *
     * @return XJDF Document coverd by the XJDFNavigator.
     */
    public XJdfDocument getXJdfDocument() throws Exception {

        // find XJDF master document
        byte[] bytes = super.findMasterDocument();

        // return as navigator
        return new XJdfDocument(bytes);
    }

    /**
     * Unpackage an XJDF Package to a temporary directory.
     *
     * @return The path of the master document.
     */
    public String unpackageXJdfTemp(String appName) throws IOException {

        // call super method
        return super.unpackageZipTemp(appName);
    }

    /**
     * Unpackage an XJDF Package to a temporary directory.
     *
     * @return The path of the master document.
     */
    public String unpackageXJdfTemp() throws IOException {

        // call super method
        return super.unpackageZipTemp();
    }

    /**
     * Unpackage an XJDF Package to a target directory.
     *
     * @param targetDir Target directory for unpackaging.
     *
     * @return The path of the master document.
     */
    public String unpackageXJdf(String targetDir) throws IOException {

        // call super method
        return super.unpackageZip(targetDir);
    }

    /**
     * @see org.cip4.lib.xjdf.xml.internal.AbstractXmlUnpackager#getMasterExtension()
     */
    @Override
    protected String[] getMasterExtension() {
        return new String[]{"xjdf"};
    }
}
