
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
 *       &lt;attribute name="Step" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="StartValue" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="ColorNameDetails" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="YPosition" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="Orientation" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="XPosition" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="ColorName" type="{http://www.CIP4.org/JDFSchema_2_0}EnumNamedColor" />
 *       &lt;attribute name="SeparationNames" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKENS" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "NumberItem")
public class NumberItem
    implements Serializable
{

    @XmlAttribute(name = "Step")
    protected Integer step;
    @XmlAttribute(name = "StartValue")
    protected String startValue;
    @XmlAttribute(name = "ColorNameDetails")
    protected String colorNameDetails;
    @XmlAttribute(name = "YPosition")
    protected Double yPosition;
    @XmlAttribute(name = "Orientation")
    protected Double orientation;
    @XmlAttribute(name = "XPosition")
    protected Double xPosition;
    @XmlAttribute(name = "ColorName")
    protected EnumNamedColor colorName;
    @XmlAttribute(name = "SeparationNames")
    protected List<String> separationNames;

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

    /**
     * Gets the value of the colorNameDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorNameDetails() {
        return colorNameDetails;
    }

    /**
     * Sets the value of the colorNameDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorNameDetails(String value) {
        this.colorNameDetails = value;
    }

    /**
     * Gets the value of the yPosition property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getYPosition() {
        return yPosition;
    }

    /**
     * Sets the value of the yPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setYPosition(Double value) {
        this.yPosition = value;
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
     * Gets the value of the colorName property.
     * 
     * @return
     *     possible object is
     *     {@link EnumNamedColor }
     *     
     */
    public EnumNamedColor getColorName() {
        return colorName;
    }

    /**
     * Sets the value of the colorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumNamedColor }
     *     
     */
    public void setColorName(EnumNamedColor value) {
        this.colorName = value;
    }

    /**
     * Gets the value of the separationNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the separationNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeparationNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSeparationNames() {
        if (separationNames == null) {
            separationNames = new ArrayList<String>();
        }
        return this.separationNames;
    }

}
