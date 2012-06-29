
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Device complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Device">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ResourceType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Module" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}DeviceCap" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}CostCenter" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}IconList" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="Directory" type="{http://www.CIP4.org/JDFSchema_2_0}URL" />
 *       &lt;attribute name="ModelName" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="ICSVersions" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKENS" />
 *       &lt;attribute name="JDFErrorURL" type="{http://www.CIP4.org/JDFSchema_2_0}URL" />
 *       &lt;attribute name="JMFSenderID" type="{http://www.CIP4.org/JDFSchema_2_0}shortString" />
 *       &lt;attribute name="ModelURL" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="JDFVersions" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="ModelNumber" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="KnownLocalizations" type="{http://www.CIP4.org/JDFSchema_2_0}languages" />
 *       &lt;attribute name="JDFInputURL" type="{http://www.CIP4.org/JDFSchema_2_0}URL" />
 *       &lt;attribute name="DeviceID" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="JMFURL" type="{http://www.CIP4.org/JDFSchema_2_0}URL" />
 *       &lt;attribute name="ManufacturerURL" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="JDFOutputURL" type="{http://www.CIP4.org/JDFSchema_2_0}URL" />
 *       &lt;attribute name="SecureJMFURL" type="{http://www.CIP4.org/JDFSchema_2_0}URL" />
 *       &lt;attribute name="UPC" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="PresentationURL" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="SerialNumber" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="ModelDescription" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="DeviceType" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Device", propOrder = {
    "iconLists",
    "costCenters",
    "deviceCaps",
    "modules"
})
public class Device
    extends ResourceType
    implements Serializable
{

    @XmlElement(name = "IconList")
    protected List<IconList> iconLists;
    @XmlElement(name = "CostCenter")
    protected List<CostCenter> costCenters;
    @XmlElement(name = "DeviceCap")
    protected List<DeviceCap> deviceCaps;
    @XmlElement(name = "Module")
    protected List<Module> modules;
    @XmlAttribute(name = "Directory")
    protected String directory;
    @XmlAttribute(name = "ModelName")
    protected String modelName;
    @XmlAttribute(name = "ICSVersions")
    protected List<String> icsVersions;
    @XmlAttribute(name = "JDFErrorURL")
    protected String jdfErrorURL;
    @XmlAttribute(name = "JMFSenderID")
    protected String jmfSenderID;
    @XmlAttribute(name = "ModelURL")
    protected String modelURL;
    @XmlAttribute(name = "JDFVersions")
    protected String jdfVersions;
    @XmlAttribute(name = "ModelNumber")
    protected String modelNumber;
    @XmlAttribute(name = "KnownLocalizations")
    protected List<String> knownLocalizations;
    @XmlAttribute(name = "JDFInputURL")
    protected String jdfInputURL;
    @XmlAttribute(name = "DeviceID")
    protected String deviceID;
    @XmlAttribute(name = "JMFURL")
    protected String jmfurl;
    @XmlAttribute(name = "ManufacturerURL")
    protected String manufacturerURL;
    @XmlAttribute(name = "JDFOutputURL")
    protected String jdfOutputURL;
    @XmlAttribute(name = "SecureJMFURL")
    protected String secureJMFURL;
    @XmlAttribute(name = "UPC")
    protected String upc;
    @XmlAttribute(name = "PresentationURL")
    protected String presentationURL;
    @XmlAttribute(name = "SerialNumber")
    protected String serialNumber;
    @XmlAttribute(name = "ModelDescription")
    protected String modelDescription;
    @XmlAttribute(name = "DeviceType")
    protected String deviceType;

    /**
     * Gets the value of the iconLists property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the iconLists property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIconLists().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IconList }
     * 
     * 
     */
    public List<IconList> getIconLists() {
        if (iconLists == null) {
            iconLists = new ArrayList<IconList>();
        }
        return this.iconLists;
    }

    /**
     * Gets the value of the costCenters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the costCenters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCostCenters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CostCenter }
     * 
     * 
     */
    public List<CostCenter> getCostCenters() {
        if (costCenters == null) {
            costCenters = new ArrayList<CostCenter>();
        }
        return this.costCenters;
    }

    /**
     * Gets the value of the deviceCaps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deviceCaps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeviceCaps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceCap }
     * 
     * 
     */
    public List<DeviceCap> getDeviceCaps() {
        if (deviceCaps == null) {
            deviceCaps = new ArrayList<DeviceCap>();
        }
        return this.deviceCaps;
    }

    /**
     * Gets the value of the modules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Module }
     * 
     * 
     */
    public List<Module> getModules() {
        if (modules == null) {
            modules = new ArrayList<Module>();
        }
        return this.modules;
    }

    /**
     * Gets the value of the directory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectory() {
        return directory;
    }

    /**
     * Sets the value of the directory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectory(String value) {
        this.directory = value;
    }

    /**
     * Gets the value of the modelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * Sets the value of the modelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelName(String value) {
        this.modelName = value;
    }

    /**
     * Gets the value of the icsVersions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the icsVersions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getICSVersions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getICSVersions() {
        if (icsVersions == null) {
            icsVersions = new ArrayList<String>();
        }
        return this.icsVersions;
    }

    /**
     * Gets the value of the jdfErrorURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJDFErrorURL() {
        return jdfErrorURL;
    }

    /**
     * Sets the value of the jdfErrorURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJDFErrorURL(String value) {
        this.jdfErrorURL = value;
    }

    /**
     * Gets the value of the jmfSenderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJMFSenderID() {
        return jmfSenderID;
    }

    /**
     * Sets the value of the jmfSenderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJMFSenderID(String value) {
        this.jmfSenderID = value;
    }

    /**
     * Gets the value of the modelURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelURL() {
        return modelURL;
    }

    /**
     * Sets the value of the modelURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelURL(String value) {
        this.modelURL = value;
    }

    /**
     * Gets the value of the jdfVersions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJDFVersions() {
        return jdfVersions;
    }

    /**
     * Sets the value of the jdfVersions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJDFVersions(String value) {
        this.jdfVersions = value;
    }

    /**
     * Gets the value of the modelNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelNumber() {
        return modelNumber;
    }

    /**
     * Sets the value of the modelNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelNumber(String value) {
        this.modelNumber = value;
    }

    /**
     * Gets the value of the knownLocalizations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the knownLocalizations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKnownLocalizations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getKnownLocalizations() {
        if (knownLocalizations == null) {
            knownLocalizations = new ArrayList<String>();
        }
        return this.knownLocalizations;
    }

    /**
     * Gets the value of the jdfInputURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJDFInputURL() {
        return jdfInputURL;
    }

    /**
     * Sets the value of the jdfInputURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJDFInputURL(String value) {
        this.jdfInputURL = value;
    }

    /**
     * Gets the value of the deviceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceID() {
        return deviceID;
    }

    /**
     * Sets the value of the deviceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceID(String value) {
        this.deviceID = value;
    }

    /**
     * Gets the value of the jmfurl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJMFURL() {
        return jmfurl;
    }

    /**
     * Sets the value of the jmfurl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJMFURL(String value) {
        this.jmfurl = value;
    }

    /**
     * Gets the value of the manufacturerURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturerURL() {
        return manufacturerURL;
    }

    /**
     * Sets the value of the manufacturerURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturerURL(String value) {
        this.manufacturerURL = value;
    }

    /**
     * Gets the value of the jdfOutputURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJDFOutputURL() {
        return jdfOutputURL;
    }

    /**
     * Sets the value of the jdfOutputURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJDFOutputURL(String value) {
        this.jdfOutputURL = value;
    }

    /**
     * Gets the value of the secureJMFURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecureJMFURL() {
        return secureJMFURL;
    }

    /**
     * Sets the value of the secureJMFURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecureJMFURL(String value) {
        this.secureJMFURL = value;
    }

    /**
     * Gets the value of the upc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPC() {
        return upc;
    }

    /**
     * Sets the value of the upc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPC(String value) {
        this.upc = value;
    }

    /**
     * Gets the value of the presentationURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresentationURL() {
        return presentationURL;
    }

    /**
     * Sets the value of the presentationURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresentationURL(String value) {
        this.presentationURL = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the modelDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelDescription() {
        return modelDescription;
    }

    /**
     * Sets the value of the modelDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelDescription(String value) {
        this.modelDescription = value;
    }

    /**
     * Gets the value of the deviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * Sets the value of the deviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceType(String value) {
        this.deviceType = value;
    }

}
