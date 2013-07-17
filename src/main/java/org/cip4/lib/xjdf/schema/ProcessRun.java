
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
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ProcessRun complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessRun">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}Audit">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Part" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="EndStatus" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Duration" type="{http://www.CIP4.org/JDFSchema_2_0}duration" />
 *       &lt;attribute name="SubmissionTime" type="{http://www.CIP4.org/JDFSchema_2_0}dateTime" />
 *       &lt;attribute name="ReturnTime" type="{http://www.CIP4.org/JDFSchema_2_0}dateTime" />
 *       &lt;attribute name="Start" type="{http://www.CIP4.org/JDFSchema_2_0}dateTime" />
 *       &lt;attribute name="End" type="{http://www.CIP4.org/JDFSchema_2_0}dateTime" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessRun", propOrder = {
    "part"
})
public class ProcessRun
    extends Audit
    implements Serializable
{

    @XmlElement(name = "Part")
    protected List<Part> part;
    @XmlAttribute(name = "EndStatus")
    @XmlSchemaType(name = "anySimpleType")
    protected String endStatus;
    @XmlAttribute(name = "Duration")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.Duration.class)
    protected org.cip4.lib.xjdf.type.Duration duration;
    @XmlAttribute(name = "SubmissionTime")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.DateTime.class)
    protected org.cip4.lib.xjdf.type.DateTime submissionTime;
    @XmlAttribute(name = "ReturnTime")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.DateTime.class)
    protected org.cip4.lib.xjdf.type.DateTime returnTime;
    @XmlAttribute(name = "Start")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.DateTime.class)
    protected org.cip4.lib.xjdf.type.DateTime start;
    @XmlAttribute(name = "End")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.DateTime.class)
    protected org.cip4.lib.xjdf.type.DateTime end;

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
     * Gets the value of the endStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndStatus() {
        return endStatus;
    }

    /**
     * Sets the value of the endStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndStatus(String value) {
        this.endStatus = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.Duration getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuration(org.cip4.lib.xjdf.type.Duration value) {
        this.duration = value;
    }

    /**
     * Gets the value of the submissionTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.DateTime getSubmissionTime() {
        return submissionTime;
    }

    /**
     * Sets the value of the submissionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmissionTime(org.cip4.lib.xjdf.type.DateTime value) {
        this.submissionTime = value;
    }

    /**
     * Gets the value of the returnTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.DateTime getReturnTime() {
        return returnTime;
    }

    /**
     * Sets the value of the returnTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnTime(org.cip4.lib.xjdf.type.DateTime value) {
        this.returnTime = value;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.DateTime getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStart(org.cip4.lib.xjdf.type.DateTime value) {
        this.start = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.DateTime getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnd(org.cip4.lib.xjdf.type.DateTime value) {
        this.end = value;
    }

}
