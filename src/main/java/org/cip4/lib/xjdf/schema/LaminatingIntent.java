
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for LaminatingIntent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LaminatingIntent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}IntentType">
 *       &lt;attribute name="Temperature" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Thickness" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="Texture" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LaminatingIntent")
public class LaminatingIntent
    extends IntentType
    implements Serializable
{

    @XmlAttribute(name = "Temperature")
    @XmlSchemaType(name = "anySimpleType")
    protected String temperature;
    @XmlAttribute(name = "Thickness")
    protected Double thickness;
    @XmlAttribute(name = "Texture")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String texture;

    /**
     * Gets the value of the temperature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemperature() {
        return temperature;
    }

    /**
     * Sets the value of the temperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemperature(String value) {
        this.temperature = value;
    }

    /**
     * Gets the value of the thickness property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getThickness() {
        return thickness;
    }

    /**
     * Sets the value of the thickness property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setThickness(Double value) {
        this.thickness = value;
    }

    /**
     * Gets the value of the texture property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTexture() {
        return texture;
    }

    /**
     * Sets the value of the texture property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTexture(String value) {
        this.texture = value;
    }

}
