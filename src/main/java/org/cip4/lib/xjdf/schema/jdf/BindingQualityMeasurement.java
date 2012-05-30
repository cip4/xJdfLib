
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
 *       &lt;attribute name="PullOutValue" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="FlexValue" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "BindingQualityMeasurement")
public class BindingQualityMeasurement
    implements Serializable
{

    @XmlAttribute(name = "PullOutValue")
    protected Double pullOutValue;
    @XmlAttribute(name = "FlexValue")
    protected Double flexValue;

    /**
     * Gets the value of the pullOutValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPullOutValue() {
        return pullOutValue;
    }

    /**
     * Sets the value of the pullOutValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPullOutValue(Double value) {
        this.pullOutValue = value;
    }

    /**
     * Gets the value of the flexValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFlexValue() {
        return flexValue;
    }

    /**
     * Sets the value of the flexValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFlexValue(Double value) {
        this.flexValue = value;
    }

}
