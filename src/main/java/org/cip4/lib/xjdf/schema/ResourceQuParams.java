
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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
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
 *       &lt;/sequence>
 *       &lt;attribute name="JobPartID" type="{http://www.CIP4.org/JDFSchema_2_0}shortString" />
 *       &lt;attribute name="JobID" type="{http://www.CIP4.org/JDFSchema_2_0}shortString" />
 *       &lt;attribute name="LotDetails" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Usage" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="QueueEntryID" type="{http://www.CIP4.org/JDFSchema_2_0}shortString" />
 *       &lt;attribute name="LotID" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="ResourceName" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKENS" />
 *       &lt;attribute name="Location" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="ProductID" type="{http://www.CIP4.org/JDFSchema_2_0}shortString" />
 *       &lt;attribute name="ResourceID" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="Classes">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.CIP4.org/JDFSchema_2_0}EnumClasses" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ResourceDetails" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Exact" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="ProcessUsage" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "part"
})
@XmlRootElement(name = "ResourceQuParams")
public class ResourceQuParams
    implements Serializable
{

    @XmlElement(name = "Part")
    protected List<Part> part;
    @XmlAttribute(name = "JobPartID")
    protected String jobPartID;
    @XmlAttribute(name = "JobID")
    protected String jobID;
    @XmlAttribute(name = "LotDetails")
    @XmlSchemaType(name = "anySimpleType")
    protected String lotDetails;
    @XmlAttribute(name = "Usage")
    @XmlSchemaType(name = "anySimpleType")
    protected String usage;
    @XmlAttribute(name = "QueueEntryID")
    protected String queueEntryID;
    @XmlAttribute(name = "LotID")
    protected String lotID;
    @XmlAttribute(name = "ResourceName")
    protected List<String> resourceName;
    @XmlAttribute(name = "Location")
    protected String location;
    @XmlAttribute(name = "ProductID")
    protected String productID;
    @XmlAttribute(name = "ResourceID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String resourceID;
    @XmlAttribute(name = "Classes")
    protected List<EnumClasses> classes;
    @XmlAttribute(name = "ResourceDetails")
    @XmlSchemaType(name = "anySimpleType")
    protected String resourceDetails;
    @XmlAttribute(name = "Exact")
    protected Boolean exact;
    @XmlAttribute(name = "ProcessUsage")
    protected String processUsage;

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
     * Gets the value of the lotDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLotDetails() {
        return lotDetails;
    }

    /**
     * Sets the value of the lotDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLotDetails(String value) {
        this.lotDetails = value;
    }

    /**
     * Gets the value of the usage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsage() {
        return usage;
    }

    /**
     * Sets the value of the usage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsage(String value) {
        this.usage = value;
    }

    /**
     * Gets the value of the queueEntryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueueEntryID() {
        return queueEntryID;
    }

    /**
     * Sets the value of the queueEntryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueueEntryID(String value) {
        this.queueEntryID = value;
    }

    /**
     * Gets the value of the lotID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLotID() {
        return lotID;
    }

    /**
     * Sets the value of the lotID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLotID(String value) {
        this.lotID = value;
    }

    /**
     * Gets the value of the resourceName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getResourceName() {
        if (resourceName == null) {
            resourceName = new ArrayList<String>();
        }
        return this.resourceName;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the productID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductID() {
        return productID;
    }

    /**
     * Sets the value of the productID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductID(String value) {
        this.productID = value;
    }

    /**
     * Gets the value of the resourceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceID() {
        return resourceID;
    }

    /**
     * Sets the value of the resourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceID(String value) {
        this.resourceID = value;
    }

    /**
     * Gets the value of the classes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClasses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnumClasses }
     * 
     * 
     */
    public List<EnumClasses> getClasses() {
        if (classes == null) {
            classes = new ArrayList<EnumClasses>();
        }
        return this.classes;
    }

    /**
     * Gets the value of the resourceDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceDetails() {
        return resourceDetails;
    }

    /**
     * Sets the value of the resourceDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceDetails(String value) {
        this.resourceDetails = value;
    }

    /**
     * Gets the value of the exact property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExact() {
        return exact;
    }

    /**
     * Sets the value of the exact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExact(Boolean value) {
        this.exact = value;
    }

    /**
     * Gets the value of the processUsage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessUsage() {
        return processUsage;
    }

    /**
     * Sets the value of the processUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessUsage(String value) {
        this.processUsage = value;
    }

}
