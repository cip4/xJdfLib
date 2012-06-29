
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for FileSpec complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FileSpec">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Container" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Disposition" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}FileAlias" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="DocumentNaturalLang" type="{http://www.CIP4.org/JDFSchema_2_0}language" />
 *       &lt;attribute name="Compression" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="ResourceUsage" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="URL" type="{http://www.CIP4.org/JDFSchema_2_0}URL" />
 *       &lt;attribute name="FileVersion" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="Password" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="MimeType" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="AppOS" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="Encoding" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="SearchDepth" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="CheckSum" type="{http://www.CIP4.org/JDFSchema_2_0}hexBinary" />
 *       &lt;attribute name="Application" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="UID" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="FileFormat" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="RequestQuality" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="FileTemplate" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="FileSize" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="MimeTypeVersion" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="AppVersion" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="UserFileName" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="PageOrder" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="FileTargetDeviceModel" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="OSVersion" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="OverwritePolicy" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileSpec", propOrder = {
    "fileAlias",
    "dispositions",
    "containers"
})
public class FileSpec
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "FileAlias")
    protected List<FileAlias> fileAlias;
    @XmlElement(name = "Disposition")
    protected List<Disposition> dispositions;
    @XmlElement(name = "Container")
    protected List<Container> containers;
    @XmlAttribute(name = "DocumentNaturalLang")
    protected String documentNaturalLang;
    @XmlAttribute(name = "Compression")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String compression;
    @XmlAttribute(name = "ResourceUsage")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String resourceUsage;
    @XmlAttribute(name = "URL")
    protected String url;
    @XmlAttribute(name = "FileVersion")
    protected String fileVersion;
    @XmlAttribute(name = "Password")
    protected String password;
    @XmlAttribute(name = "MimeType")
    protected String mimeType;
    @XmlAttribute(name = "AppOS")
    protected String appOS;
    @XmlAttribute(name = "Encoding")
    protected String encoding;
    @XmlAttribute(name = "SearchDepth")
    protected Integer searchDepth;
    @XmlAttribute(name = "CheckSum")
    protected String checkSum;
    @XmlAttribute(name = "Application")
    protected String application;
    @XmlAttribute(name = "UID")
    protected String uid;
    @XmlAttribute(name = "FileFormat")
    protected String fileFormat;
    @XmlAttribute(name = "RequestQuality")
    protected Double requestQuality;
    @XmlAttribute(name = "FileTemplate")
    protected String fileTemplate;
    @XmlAttribute(name = "FileSize")
    protected Integer fileSize;
    @XmlAttribute(name = "MimeTypeVersion")
    protected String mimeTypeVersion;
    @XmlAttribute(name = "AppVersion")
    protected String appVersion;
    @XmlAttribute(name = "UserFileName")
    protected String userFileName;
    @XmlAttribute(name = "PageOrder")
    @XmlSchemaType(name = "anySimpleType")
    protected String pageOrder;
    @XmlAttribute(name = "FileTargetDeviceModel")
    protected String fileTargetDeviceModel;
    @XmlAttribute(name = "OSVersion")
    protected String osVersion;
    @XmlAttribute(name = "OverwritePolicy")
    @XmlSchemaType(name = "anySimpleType")
    protected String overwritePolicy;

    /**
     * Gets the value of the fileAlias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileAlias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileAlias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FileAlias }
     * 
     * 
     */
    public List<FileAlias> getFileAlias() {
        if (fileAlias == null) {
            fileAlias = new ArrayList<FileAlias>();
        }
        return this.fileAlias;
    }

    /**
     * Gets the value of the dispositions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dispositions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDispositions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Disposition }
     * 
     * 
     */
    public List<Disposition> getDispositions() {
        if (dispositions == null) {
            dispositions = new ArrayList<Disposition>();
        }
        return this.dispositions;
    }

    /**
     * Gets the value of the containers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the containers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContainers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Container }
     * 
     * 
     */
    public List<Container> getContainers() {
        if (containers == null) {
            containers = new ArrayList<Container>();
        }
        return this.containers;
    }

    /**
     * Gets the value of the documentNaturalLang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentNaturalLang() {
        return documentNaturalLang;
    }

    /**
     * Sets the value of the documentNaturalLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentNaturalLang(String value) {
        this.documentNaturalLang = value;
    }

    /**
     * Gets the value of the compression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompression() {
        return compression;
    }

    /**
     * Sets the value of the compression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompression(String value) {
        this.compression = value;
    }

    /**
     * Gets the value of the resourceUsage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceUsage() {
        return resourceUsage;
    }

    /**
     * Sets the value of the resourceUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceUsage(String value) {
        this.resourceUsage = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the fileVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileVersion() {
        return fileVersion;
    }

    /**
     * Sets the value of the fileVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileVersion(String value) {
        this.fileVersion = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the mimeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMimeType() {
        return mimeType;
    }

    /**
     * Sets the value of the mimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMimeType(String value) {
        this.mimeType = value;
    }

    /**
     * Gets the value of the appOS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppOS() {
        return appOS;
    }

    /**
     * Sets the value of the appOS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppOS(String value) {
        this.appOS = value;
    }

    /**
     * Gets the value of the encoding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncoding() {
        return encoding;
    }

    /**
     * Sets the value of the encoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncoding(String value) {
        this.encoding = value;
    }

    /**
     * Gets the value of the searchDepth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSearchDepth() {
        return searchDepth;
    }

    /**
     * Sets the value of the searchDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSearchDepth(Integer value) {
        this.searchDepth = value;
    }

    /**
     * Gets the value of the checkSum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckSum() {
        return checkSum;
    }

    /**
     * Sets the value of the checkSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckSum(String value) {
        this.checkSum = value;
    }

    /**
     * Gets the value of the application property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplication() {
        return application;
    }

    /**
     * Sets the value of the application property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplication(String value) {
        this.application = value;
    }

    /**
     * Gets the value of the uid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUID() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUID(String value) {
        this.uid = value;
    }

    /**
     * Gets the value of the fileFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileFormat() {
        return fileFormat;
    }

    /**
     * Sets the value of the fileFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileFormat(String value) {
        this.fileFormat = value;
    }

    /**
     * Gets the value of the requestQuality property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRequestQuality() {
        return requestQuality;
    }

    /**
     * Sets the value of the requestQuality property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRequestQuality(Double value) {
        this.requestQuality = value;
    }

    /**
     * Gets the value of the fileTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileTemplate() {
        return fileTemplate;
    }

    /**
     * Sets the value of the fileTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileTemplate(String value) {
        this.fileTemplate = value;
    }

    /**
     * Gets the value of the fileSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFileSize() {
        return fileSize;
    }

    /**
     * Sets the value of the fileSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFileSize(Integer value) {
        this.fileSize = value;
    }

    /**
     * Gets the value of the mimeTypeVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMimeTypeVersion() {
        return mimeTypeVersion;
    }

    /**
     * Sets the value of the mimeTypeVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMimeTypeVersion(String value) {
        this.mimeTypeVersion = value;
    }

    /**
     * Gets the value of the appVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppVersion() {
        return appVersion;
    }

    /**
     * Sets the value of the appVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppVersion(String value) {
        this.appVersion = value;
    }

    /**
     * Gets the value of the userFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserFileName() {
        return userFileName;
    }

    /**
     * Sets the value of the userFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserFileName(String value) {
        this.userFileName = value;
    }

    /**
     * Gets the value of the pageOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageOrder() {
        return pageOrder;
    }

    /**
     * Sets the value of the pageOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageOrder(String value) {
        this.pageOrder = value;
    }

    /**
     * Gets the value of the fileTargetDeviceModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileTargetDeviceModel() {
        return fileTargetDeviceModel;
    }

    /**
     * Sets the value of the fileTargetDeviceModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileTargetDeviceModel(String value) {
        this.fileTargetDeviceModel = value;
    }

    /**
     * Gets the value of the osVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOSVersion() {
        return osVersion;
    }

    /**
     * Sets the value of the osVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOSVersion(String value) {
        this.osVersion = value;
    }

    /**
     * Gets the value of the overwritePolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverwritePolicy() {
        return overwritePolicy;
    }

    /**
     * Sets the value of the overwritePolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverwritePolicy(String value) {
        this.overwritePolicy = value;
    }

}
