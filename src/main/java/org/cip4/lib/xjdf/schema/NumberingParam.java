
package org.cip4.lib.xjdf.schema;

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
 *       &lt;attribute name="XPosition" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="Orientation" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="YPosition" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="Step" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="StartValue" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "NumberingParam")
public class NumberingParam
    implements Serializable
{

    @XmlAttribute(name = "XPosition")
    protected Double xPosition;
    @XmlAttribute(name = "Orientation")
    protected Double orientation;
    @XmlAttribute(name = "YPosition")
    protected String yPosition;
    @XmlAttribute(name = "Step")
    protected Integer step;
    @XmlAttribute(name = "StartValue")
    protected String startValue;

    /**
     * Gets the value of the xPosition property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getXPosition() {
        return xPosition;
    }

    /**
     * Sets the value of the xPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setXPosition(Double value) {
        this.xPosition = value;
    }

    /**
     * Gets the value of the orientation property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOrientation() {
        return orientation;
    }

    /**
     * Sets the value of the orientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOrientation(Double value) {
        this.orientation = value;
    }

    /**
     * Gets the value of the yPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYPosition() {
        return yPosition;
    }

    /**
     * Sets the value of the yPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYPosition(String value) {
        this.yPosition = value;
    }

    /**
     * Gets the value of the step property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStep() {
        return step;
    }

    /**
     * Sets the value of the step property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStep(Integer value) {
        this.step = value;
    }

    /**
     * Gets the value of the startValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartValue() {
        return startValue;
    }

    /**
     * Sets the value of the startValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartValue(String value) {
        this.startValue = value;
    }

}
