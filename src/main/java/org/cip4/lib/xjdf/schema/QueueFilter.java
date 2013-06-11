
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Part" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}QueueEntryDef" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="OlderThan" type="{http://www.CIP4.org/JDFSchema_2_0}dateTime" />
 *       &lt;attribute name="UpgradeGranularity" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="MaxEntries" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="JobPartID" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="JobID" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="PreviewUsages">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.CIP4.org/JDFSchema_2_0}EnumPreviewUsages" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="NewerThan" type="{http://www.CIP4.org/JDFSchema_2_0}dateTime" />
 *       &lt;attribute name="GangNames" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKENS" />
 *       &lt;attribute name="QueueEntryDetails" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="StatusList">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.CIP4.org/JDFSchema_2_0}EnumStatusList" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="DeviceRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "part",
    "queueEntryDef"
})
@XmlRootElement(name = "QueueFilter")
public class QueueFilter
    implements Serializable
{

    @XmlElement(name = "Part")
    protected List<Part> part;
    @XmlElement(name = "QueueEntryDef")
    protected List<QueueEntryDef> queueEntryDef;
    @XmlAttribute(name = "OlderThan")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.DateTime.class)
    protected org.cip4.lib.xjdf.type.DateTime olderThan;
    @XmlAttribute(name = "UpgradeGranularity")
    @XmlSchemaType(name = "anySimpleType")
    protected String upgradeGranularity;
    @XmlAttribute(name = "MaxEntries")
    protected Integer maxEntries;
    @XmlAttribute(name = "JobPartID")
    protected String jobPartID;
    @XmlAttribute(name = "JobID")
    protected String jobID;
    @XmlAttribute(name = "PreviewUsages")
    protected List<String> previewUsages;
    @XmlAttribute(name = "NewerThan")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.DateTime.class)
    protected org.cip4.lib.xjdf.type.DateTime newerThan;
    @XmlAttribute(name = "GangNames")
    protected List<String> gangNames;
    @XmlAttribute(name = "QueueEntryDetails")
    @XmlSchemaType(name = "anySimpleType")
    protected String queueEntryDetails;
    @XmlAttribute(name = "StatusList")
    protected List<EnumStatusList> statusList;
    @XmlAttribute(name = "DeviceRef")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IDREF.class)
    protected org.cip4.lib.xjdf.type.IDREF deviceRef;

    /**
     * Gets the value of the part property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the part property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Part }
     * 
     * 
     */
    public List<Part> getPart() {
        if (part == null) {
            part = new ArrayList<Part>();
        }
        return this.part;
    }

    /**
     * Gets the value of the queueEntryDef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queueEntryDef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueueEntryDef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueueEntryDef }
     * 
     * 
     */
    public List<QueueEntryDef> getQueueEntryDef() {
        if (queueEntryDef == null) {
            queueEntryDef = new ArrayList<QueueEntryDef>();
        }
        return this.queueEntryDef;
    }

    /**
     * Gets the value of the olderThan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.DateTime getOlderThan() {
        return olderThan;
    }

    /**
     * Sets the value of the olderThan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOlderThan(org.cip4.lib.xjdf.type.DateTime value) {
        this.olderThan = value;
    }

    /**
     * Gets the value of the upgradeGranularity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpgradeGranularity() {
        return upgradeGranularity;
    }

    /**
     * Sets the value of the upgradeGranularity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpgradeGranularity(String value) {
        this.upgradeGranularity = value;
    }

    /**
     * Gets the value of the maxEntries property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxEntries() {
        return maxEntries;
    }

    /**
     * Sets the value of the maxEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxEntries(Integer value) {
        this.maxEntries = value;
    }

    /**
     * Gets the value of the jobPartID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobPartID() {
        return jobPartID;
    }

    /**
     * Sets the value of the jobPartID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobPartID(String value) {
        this.jobPartID = value;
    }

    /**
     * Gets the value of the jobID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobID() {
        return jobID;
    }

    /**
     * Sets the value of the jobID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobID(String value) {
        this.jobID = value;
    }

    /**
     * Gets the value of the previewUsages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the previewUsages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreviewUsages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPreviewUsages() {
        if (previewUsages == null) {
            previewUsages = new ArrayList<String>();
        }
        return this.previewUsages;
    }

    /**
     * Gets the value of the newerThan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.DateTime getNewerThan() {
        return newerThan;
    }

    /**
     * Sets the value of the newerThan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewerThan(org.cip4.lib.xjdf.type.DateTime value) {
        this.newerThan = value;
    }

    /**
     * Gets the value of the gangNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gangNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGangNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getGangNames() {
        if (gangNames == null) {
            gangNames = new ArrayList<String>();
        }
        return this.gangNames;
    }

    /**
     * Gets the value of the queueEntryDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueueEntryDetails() {
        return queueEntryDetails;
    }

    /**
     * Sets the value of the queueEntryDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueueEntryDetails(String value) {
        this.queueEntryDetails = value;
    }

    /**
     * Gets the value of the statusList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statusList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatusList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnumStatusList }
     * 
     * 
     */
    public List<EnumStatusList> getStatusList() {
        if (statusList == null) {
            statusList = new ArrayList<EnumStatusList>();
        }
        return this.statusList;
    }

    /**
     * Gets the value of the deviceRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.IDREF getDeviceRef() {
        return deviceRef;
    }

    /**
     * Sets the value of the deviceRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceRef(org.cip4.lib.xjdf.type.IDREF value) {
        this.deviceRef = value;
    }

}
