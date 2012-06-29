
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="Until" type="{http://www.CIP4.org/JDFSchema_2_0}dateTime" />
 *       &lt;attribute name="MinDuration" type="{http://www.CIP4.org/JDFSchema_2_0}duration" />
 *       &lt;attribute name="ExtraDuration" type="{http://www.CIP4.org/JDFSchema_2_0}duration" />
 *       &lt;attribute name="Priority" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="DispositionUsage" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="DispositionAction" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Disposition")
public class Disposition
    implements Serializable
{

    @XmlAttribute(name = "Until")
    protected String until;
    @XmlAttribute(name = "MinDuration")
    protected String minDuration;
    @XmlAttribute(name = "ExtraDuration")
    protected String extraDuration;
    @XmlAttribute(name = "Priority")
    protected Integer priority;
    @XmlAttribute(name = "DispositionUsage")
    @XmlSchemaType(name = "anySimpleType")
    protected String dispositionUsage;
    @XmlAttribute(name = "DispositionAction")
    @XmlSchemaType(name = "anySimpleType")
    protected String dispositionAction;

    /**
     * Gets the value of the until property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUntil() {
        return until;
    }

    /**
     * Sets the value of the until property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUntil(String value) {
        this.until = value;
    }

    /**
     * Gets the value of the minDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinDuration() {
        return minDuration;
    }

    /**
     * Sets the value of the minDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinDuration(String value) {
        this.minDuration = value;
    }

    /**
     * Gets the value of the extraDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraDuration() {
        return extraDuration;
    }

    /**
     * Sets the value of the extraDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraDuration(String value) {
        this.extraDuration = value;
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
     * Gets the value of the dispositionUsage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDispositionUsage() {
        return dispositionUsage;
    }

    /**
     * Sets the value of the dispositionUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDispositionUsage(String value) {
        this.dispositionUsage = value;
    }

    /**
     * Gets the value of the dispositionAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDispositionAction() {
        return dispositionAction;
    }

    /**
     * Sets the value of the dispositionAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDispositionAction(String value) {
        this.dispositionAction = value;
    }

}
