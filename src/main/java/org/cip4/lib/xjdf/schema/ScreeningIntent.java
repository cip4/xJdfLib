
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScreeningIntent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScreeningIntent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}IntentType">
 *       &lt;attribute name="DotSize" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="ScreeningType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Frequency" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="FrequencySelection" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScreeningIntent")
public class ScreeningIntent
    extends IntentType
    implements Serializable
{

    @XmlAttribute(name = "DotSize")
    protected Double dotSize;
    @XmlAttribute(name = "ScreeningType")
    @XmlSchemaType(name = "anySimpleType")
    protected String screeningType;
    @XmlAttribute(name = "Frequency")
    protected Double frequency;
    @XmlAttribute(name = "FrequencySelection")
    @XmlSchemaType(name = "anySimpleType")
    protected String frequencySelection;

    /**
     * Gets the value of the dotSize property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDotSize() {
        return dotSize;
    }

    /**
     * Sets the value of the dotSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDotSize(Double value) {
        this.dotSize = value;
    }

    /**
     * Gets the value of the screeningType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScreeningType() {
        return screeningType;
    }

    /**
     * Sets the value of the screeningType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScreeningType(String value) {
        this.screeningType = value;
    }

    /**
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFrequency(Double value) {
        this.frequency = value;
    }

    /**
     * Gets the value of the frequencySelection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequencySelection() {
        return frequencySelection;
    }

    /**
     * Sets the value of the frequencySelection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequencySelection(String value) {
        this.frequencySelection = value;
    }

}
