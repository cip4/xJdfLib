
package org.cip4.lib.xjdf.schema.jdf;

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
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Disposition" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="ReturnURL" type="{http://www.CIP4.org/JDFSchema_2_0}URL" />
 *       &lt;attribute name="WatchURL" type="{http://www.CIP4.org/JDFSchema_2_0}URL" />
 *       &lt;attribute name="PrevQueueEntryID" type="{http://www.CIP4.org/JDFSchema_2_0}shortString" />
 *       &lt;attribute name="URL" type="{http://www.CIP4.org/JDFSchema_2_0}URL" />
 *       &lt;attribute name="GangName" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="ReturnJMF" type="{http://www.CIP4.org/JDFSchema_2_0}URL" />
 *       &lt;attribute name="refID" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="NextQueueEntryID" type="{http://www.CIP4.org/JDFSchema_2_0}shortString" />
 *       &lt;attribute name="GangPolicy" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Priority" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
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
    "dispositions"
})
@XmlRootElement(name = "QueueSubmissionParams")
public class QueueSubmissionParams
    implements Serializable
{

    @XmlElement(name = "Disposition")
    protected List<Disposition> dispositions;
    @XmlAttribute(name = "ReturnURL")
    protected String returnURL;
    @XmlAttribute(name = "WatchURL")
    protected String watchURL;
    @XmlAttribute(name = "PrevQueueEntryID")
    protected String prevQueueEntryID;
    @XmlAttribute(name = "URL")
    protected String url;
    @XmlAttribute(name = "GangName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String gangName;
    @XmlAttribute(name = "ReturnJMF")
    protected String returnJMF;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refID;
    @XmlAttribute(name = "NextQueueEntryID")
    protected String nextQueueEntryID;
    @XmlAttribute(name = "GangPolicy")
    @XmlSchemaType(name = "anySimpleType")
    protected String gangPolicy;
    @XmlAttribute(name = "Priority")
    protected Integer priority;
    @XmlAttribute(name = "Hold")
    protected Boolean hold;

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
     * Gets the value of the gangName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGangName() {
        return gangName;
    }

    /**
     * Sets the value of the gangName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGangName(String value) {
        this.gangName = value;
    }

    /**
     * Gets the value of the returnJMF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnJMF() {
        return returnJMF;
    }

    /**
     * Sets the value of the returnJMF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnJMF(String value) {
        this.returnJMF = value;
    }

    /**
     * Gets the value of the refID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefID() {
        return refID;
    }

    /**
     * Sets the value of the refID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefID(String value) {
        this.refID = value;
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
     * Gets the value of the gangPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGangPolicy() {
        return gangPolicy;
    }

    /**
     * Sets the value of the gangPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGangPolicy(String value) {
        this.gangPolicy = value;
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
     * Gets the value of the hold property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getHold() {
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
