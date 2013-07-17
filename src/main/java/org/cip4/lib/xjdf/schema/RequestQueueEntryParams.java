
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
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Queue" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="SubmitPolicy" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="JobID" type="{http://www.CIP4.org/JDFSchema_2_0}shortString" />
 *       &lt;attribute name="JobPartID" type="{http://www.CIP4.org/JDFSchema_2_0}shortString" />
 *       &lt;attribute name="QueueURL" type="{http://www.CIP4.org/JDFSchema_2_0}URL" />
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
    "queue"
})
@XmlRootElement(name = "RequestQueueEntryParams")
public class RequestQueueEntryParams
    implements Serializable
{

    @XmlElement(name = "Part")
    protected List<Part> part;
    @XmlElement(name = "Queue")
    protected List<Queue> queue;
    @XmlAttribute(name = "SubmitPolicy")
    @XmlSchemaType(name = "anySimpleType")
    protected String submitPolicy;
    @XmlAttribute(name = "JobID")
    protected String jobID;
    @XmlAttribute(name = "JobPartID")
    protected String jobPartID;
    @XmlAttribute(name = "QueueURL")
    protected String queueURL;

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
     * Gets the value of the queue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Queue }
     * 
     * 
     */
    public List<Queue> getQueue() {
        if (queue == null) {
            queue = new ArrayList<Queue>();
        }
        return this.queue;
    }

    /**
     * Gets the value of the submitPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmitPolicy() {
        return submitPolicy;
    }

    /**
     * Sets the value of the submitPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmitPolicy(String value) {
        this.submitPolicy = value;
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
     * Gets the value of the queueURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueueURL() {
        return queueURL;
    }

    /**
     * Sets the value of the queueURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueueURL(String value) {
        this.queueURL = value;
    }

}
