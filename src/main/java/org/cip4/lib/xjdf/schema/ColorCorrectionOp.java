
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;
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
 *       &lt;attribute name="AdjustContrast" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="ObjectTags" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKENS" />
 *       &lt;attribute name="AdjustYellowBlue" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="AdjustSaturation" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="SourceObjects">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.CIP4.org/JDFSchema_2_0}EnumSourceObjects" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="AdjustHue" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="AdjustLightness" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="AdjustMagentaGreen" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="AdjustCyanRed" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="FileSpecRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ColorCorrectionOp")
public class ColorCorrectionOp
    implements Serializable
{

    @XmlAttribute(name = "AdjustContrast")
    protected Double adjustContrast;
    @XmlAttribute(name = "ObjectTags")
    protected List<String> objectTags;
    @XmlAttribute(name = "AdjustYellowBlue")
    protected Double adjustYellowBlue;
    @XmlAttribute(name = "AdjustSaturation")
    protected Double adjustSaturation;
    @XmlAttribute(name = "SourceObjects")
    protected List<EnumSourceObjects> sourceObjects;
    @XmlAttribute(name = "AdjustHue")
    protected Double adjustHue;
    @XmlAttribute(name = "AdjustLightness")
    protected Double adjustLightness;
    @XmlAttribute(name = "AdjustMagentaGreen")
    protected Double adjustMagentaGreen;
    @XmlAttribute(name = "AdjustCyanRed")
    protected Double adjustCyanRed;
    @XmlAttribute(name = "FileSpecRef")
    @XmlIDREF
    protected Object fileSpecRef;

    /**
     * Gets the value of the adjustContrast property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAdjustContrast() {
        return adjustContrast;
    }

    /**
     * Sets the value of the adjustContrast property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAdjustContrast(Double value) {
        this.adjustContrast = value;
    }

    /**
     * Gets the value of the objectTags property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectTags property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectTags().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getObjectTags() {
        if (objectTags == null) {
            objectTags = new ArrayList<String>();
        }
        return this.objectTags;
    }

    /**
     * Gets the value of the adjustYellowBlue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAdjustYellowBlue() {
        return adjustYellowBlue;
    }

    /**
     * Sets the value of the adjustYellowBlue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAdjustYellowBlue(Double value) {
        this.adjustYellowBlue = value;
    }

    /**
     * Gets the value of the adjustSaturation property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAdjustSaturation() {
        return adjustSaturation;
    }

    /**
     * Sets the value of the adjustSaturation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAdjustSaturation(Double value) {
        this.adjustSaturation = value;
    }

    /**
     * Gets the value of the sourceObjects property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceObjects property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceObjects().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnumSourceObjects }
     * 
     * 
     */
    public List<EnumSourceObjects> getSourceObjects() {
        if (sourceObjects == null) {
            sourceObjects = new ArrayList<EnumSourceObjects>();
        }
        return this.sourceObjects;
    }

    /**
     * Gets the value of the adjustHue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAdjustHue() {
        return adjustHue;
    }

    /**
     * Sets the value of the adjustHue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAdjustHue(Double value) {
        this.adjustHue = value;
    }

    /**
     * Gets the value of the adjustLightness property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAdjustLightness() {
        return adjustLightness;
    }

    /**
     * Sets the value of the adjustLightness property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAdjustLightness(Double value) {
        this.adjustLightness = value;
    }

    /**
     * Gets the value of the adjustMagentaGreen property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAdjustMagentaGreen() {
        return adjustMagentaGreen;
    }

    /**
     * Sets the value of the adjustMagentaGreen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAdjustMagentaGreen(Double value) {
        this.adjustMagentaGreen = value;
    }

    /**
     * Gets the value of the adjustCyanRed property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAdjustCyanRed() {
        return adjustCyanRed;
    }

    /**
     * Sets the value of the adjustCyanRed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAdjustCyanRed(Double value) {
        this.adjustCyanRed = value;
    }

    /**
     * Gets the value of the fileSpecRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFileSpecRef() {
        return fileSpecRef;
    }

    /**
     * Sets the value of the fileSpecRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFileSpecRef(Object value) {
        this.fileSpecRef = value;
    }

}
