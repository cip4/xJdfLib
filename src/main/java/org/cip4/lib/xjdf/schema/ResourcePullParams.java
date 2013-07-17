
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
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Disposition" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}MISDetails" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ReturnURL" type="{http://www.CIP4.org/JDFSchema_2_0}URL" />
 *       &lt;attribute name="WatchURL" type="{http://www.CIP4.org/JDFSchema_2_0}URL" />
 *       &lt;attribute name="PrevQueueEntryID" type="{http://www.CIP4.org/JDFSchema_2_0}shortString" />
 *       &lt;attribute name="JobID" type="{http://www.CIP4.org/JDFSchema_2_0}shortString" />
 *       &lt;attribute name="NextQueueEntryID" type="{http://www.CIP4.org/JDFSchema_2_0}shortString" />
 *       &lt;attribute name="Priority" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="QueueEntryID" type="{http://www.CIP4.org/JDFSchema_2_0}shortString" />
 *       &lt;attribute name="RepeatPolicy" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ResourceID" type="{http://www.CIP4.org/JDFSchema_2_0}shortString" />
 *       &lt;attribute name="Amount" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="Hold" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
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
    "disposition",
    "misDetails"
})
@XmlRootElement(name = "ResourcePullParams")
public class ResourcePullParams
    implements Serializable
{

    @XmlElement(name = "Part")
    protected List<Part> part;
    @XmlElement(name = "Disposition")
    protected List<Disposition> disposition;
    @XmlElement(name = "MISDetails")
    protected List<MISDetails> misDetails;
    @XmlAttribute(name = "ReturnURL")
    protected String returnURL;
    @XmlAttribute(name = "WatchURL")
    protected String watchURL;
    @XmlAttribute(name = "PrevQueueEntryID")
    protected String prevQueueEntryID;
    @XmlAttribute(name = "JobID")
    protected String jobID;
    @XmlAttribute(name = "NextQueueEntryID")
    protected String nextQueueEntryID;
    @XmlAttribute(name = "Priority")
    protected Integer priority;
    @XmlAttribute(name = "QueueEntryID")
    protected String queueEntryID;
    @XmlAttribute(name = "RepeatPolicy")
    @XmlSchemaType(name = "anySimpleType")
    protected String repeatPolicy;
    @XmlAttribute(name = "ResourceID")
    protected String resourceID;
    @XmlAttribute(name = "Amount")
    protected Double amount;
    @XmlAttribute(name = "Hold")
    protected Boolean hold;

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
     * Gets the value of the disposition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disposition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisposition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Disposition }
     * 
     * 
     */
    public List<Disposition> getDisposition() {
        if (disposition == null) {
            disposition = new ArrayList<Disposition>();
        }
        return this.disposition;
    }

    /**
     * Gets the value of the misDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the misDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMISDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MISDetails }
     * 
     * 
     */
    public List<MISDetails> getMISDetails() {
        if (misDetails == null) {
            misDetails = new ArrayList<MISDetails>();
        }
        return this.misDetails;
    }

    /**
     * Gets the value of the returnURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnURL() {
        return returnURL;
    }

    /**
     * Sets the value of the returnURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnURL(String value) {
        this.returnURL = value;
    }

    /**
     * Gets the value of the watchURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWatchURL() {
        return watchURL;
    }

    /**
     * Sets the value of the watchURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWatchURL(String value) {
        this.watchURL = value;
    }

    /**
     * Gets the value of the prevQueueEntryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrevQueueEntryID() {
        return prevQueueEntryID;
    }

    /**
     * Sets the value of the prevQueueEntryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrevQueueEntryID(String value) {
        this.prevQueueEntryID = value;
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
     * Gets the value of the nextQueueEntryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextQueueEntryID() {
        return nextQueueEntryID;
    }

    /**
     * Sets the value of the nextQueueEntryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextQueueEntryID(String value) {
        this.nextQueueEntryID = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPriority(Integer value) {
        this.priority = value;
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
     * Gets the value of the repeatPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepeatPolicy() {
        return repeatPolicy;
    }

    /**
     * Sets the value of the repeatPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepeatPolicy(String value) {
        this.repeatPolicy = value;
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
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAmount(Double value) {
        this.amount = value;
    }

    /**
     * Gets the value of the hold property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHold() {
        return hold;
    }

    /**
     * Sets the value of the hold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHold(Boolean value) {
        this.hold = value;
    }

}
