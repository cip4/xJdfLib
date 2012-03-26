
package org.cip4.lib.xjdf.schema.jdf;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
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
 *       &lt;attribute name="Colorant" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="TrapColorScaling" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="StepLimit" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ColorantZoneDetails")
public class ColorantZoneDetails
    implements Serializable
{

    @XmlAttribute(name = "Colorant")
    protected String colorant;
    @XmlAttribute(name = "TrapColorScaling")
    protected Double trapColorScaling;
    @XmlAttribute(name = "StepLimit")
    protected Double stepLimit;

    /**
     * Gets the value of the colorant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorant() {
        return colorant;
    }

    /**
     * Sets the value of the colorant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorant(String value) {
        this.colorant = value;
    }

    /**
     * Gets the value of the trapColorScaling property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTrapColorScaling() {
        return trapColorScaling;
    }

    /**
     * Sets the value of the trapColorScaling property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTrapColorScaling(Double value) {
        this.trapColorScaling = value;
    }

    /**
     * Gets the value of the stepLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStepLimit() {
        return stepLimit;
    }

    /**
     * Sets the value of the stepLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStepLimit(Double value) {
        this.stepLimit = value;
    }

}
