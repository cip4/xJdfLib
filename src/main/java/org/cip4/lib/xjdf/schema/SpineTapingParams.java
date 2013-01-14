
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


/**
 * <p>Java class for SpineTapingParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpineTapingParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}GlueApplication" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="HorizontalExcess" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="TopExcess" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="HorizontalExcessBack" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="StripColorDetails" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="StripMaterial" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="StripLength" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="StripBrand" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="StripColor" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpineTapingParams", propOrder = {
    "glueApplication"
})
public class SpineTapingParams
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "GlueApplication")
    protected List<GlueApplication> glueApplication;
    @XmlAttribute(name = "HorizontalExcess")
    protected Double horizontalExcess;
    @XmlAttribute(name = "TopExcess")
    protected Double topExcess;
    @XmlAttribute(name = "HorizontalExcessBack")
    protected Double horizontalExcessBack;
    @XmlAttribute(name = "StripColorDetails")
    protected String stripColorDetails;
    @XmlAttribute(name = "StripMaterial")
    @XmlSchemaType(name = "anySimpleType")
    protected String stripMaterial;
    @XmlAttribute(name = "StripLength")
    protected Double stripLength;
    @XmlAttribute(name = "StripBrand")
    protected String stripBrand;
    @XmlAttribute(name = "StripColor")
    protected String stripColor;

    /**
     * Gets the value of the glueApplication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the glueApplication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGlueApplication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GlueApplication }
     * 
     * 
     */
    public List<GlueApplication> getGlueApplication() {
        if (glueApplication == null) {
            glueApplication = new ArrayList<GlueApplication>();
        }
        return this.glueApplication;
    }

    /**
     * Gets the value of the horizontalExcess property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHorizontalExcess() {
        return horizontalExcess;
    }

    /**
     * Sets the value of the horizontalExcess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHorizontalExcess(Double value) {
        this.horizontalExcess = value;
    }

    /**
     * Gets the value of the topExcess property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTopExcess() {
        return topExcess;
    }

    /**
     * Sets the value of the topExcess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTopExcess(Double value) {
        this.topExcess = value;
    }

    /**
     * Gets the value of the horizontalExcessBack property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHorizontalExcessBack() {
        return horizontalExcessBack;
    }

    /**
     * Sets the value of the horizontalExcessBack property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHorizontalExcessBack(Double value) {
        this.horizontalExcessBack = value;
    }

    /**
     * Gets the value of the stripColorDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStripColorDetails() {
        return stripColorDetails;
    }

    /**
     * Sets the value of the stripColorDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStripColorDetails(String value) {
        this.stripColorDetails = value;
    }

    /**
     * Gets the value of the stripMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStripMaterial() {
        return stripMaterial;
    }

    /**
     * Sets the value of the stripMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStripMaterial(String value) {
        this.stripMaterial = value;
    }

    /**
     * Gets the value of the stripLength property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStripLength() {
        return stripLength;
    }

    /**
     * Sets the value of the stripLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStripLength(Double value) {
        this.stripLength = value;
    }

    /**
     * Gets the value of the stripBrand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStripBrand() {
        return stripBrand;
    }

    /**
     * Sets the value of the stripBrand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStripBrand(String value) {
        this.stripBrand = value;
    }

    /**
     * Gets the value of the stripColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStripColor() {
        return stripColor;
    }

    /**
     * Sets the value of the stripColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStripColor(String value) {
        this.stripColor = value;
    }

}
