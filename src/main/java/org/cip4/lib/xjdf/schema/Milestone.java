
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
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
 *       &lt;attribute name="TypeAmount" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="MilestoneType" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Milestone")
public class Milestone
    implements Serializable
{

    @XmlAttribute(name = "TypeAmount")
    protected Integer typeAmount;
    @XmlAttribute(name = "MilestoneType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String milestoneType;

    /**
     * Gets the value of the typeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTypeAmount() {
        return typeAmount;
    }

    /**
     * Sets the value of the typeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTypeAmount(Integer value) {
        this.typeAmount = value;
    }

    /**
     * Gets the value of the milestoneType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMilestoneType() {
        return milestoneType;
    }

    /**
     * Sets the value of the milestoneType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMilestoneType(String value) {
        this.milestoneType = value;
    }

}
