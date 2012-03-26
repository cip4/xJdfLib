
package org.cip4.lib.xjdf.schema.jdf;

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
 * <p>Java class for HeadBandApplicationParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HeadBandApplicationParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}GlueLine" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="BottomColor" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="BottomColorDetails" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="TopColor" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="TopBrand" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="Width" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="StripMaterial" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="BottomLength" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="TopColorDetails" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="BottomBrand" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="TopLength" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeadBandApplicationParams", propOrder = {
    "glueLines"
})
public class HeadBandApplicationParams
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "GlueLine")
    protected List<GlueLine> glueLines;
    @XmlAttribute(name = "BottomColor")
    protected String bottomColor;
    @XmlAttribute(name = "BottomColorDetails")
    protected String bottomColorDetails;
    @XmlAttribute(name = "TopColor")
    protected String topColor;
    @XmlAttribute(name = "TopBrand")
    protected String topBrand;
    @XmlAttribute(name = "Width")
    protected Double width;
    @XmlAttribute(name = "StripMaterial")
    @XmlSchemaType(name = "anySimpleType")
    protected String stripMaterial;
    @XmlAttribute(name = "BottomLength")
    protected Double bottomLength;
    @XmlAttribute(name = "TopColorDetails")
    protected String topColorDetails;
    @XmlAttribute(name = "BottomBrand")
    protected String bottomBrand;
    @XmlAttribute(name = "TopLength")
    protected Double topLength;

    /**
     * Gets the value of the glueLines property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the glueLines property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGlueLines().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GlueLine }
     * 
     * 
     */
    public List<GlueLine> getGlueLines() {
        if (glueLines == null) {
            glueLines = new ArrayList<GlueLine>();
        }
        return this.glueLines;
    }

    /**
     * Gets the value of the bottomColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBottomColor() {
        return bottomColor;
    }

    /**
     * Sets the value of the bottomColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBottomColor(String value) {
        this.bottomColor = value;
    }

    /**
     * Gets the value of the bottomColorDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBottomColorDetails() {
        return bottomColorDetails;
    }

    /**
     * Sets the value of the bottomColorDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBottomColorDetails(String value) {
        this.bottomColorDetails = value;
    }

    /**
     * Gets the value of the topColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopColor() {
        return topColor;
    }

    /**
     * Sets the value of the topColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopColor(String value) {
        this.topColor = value;
    }

    /**
     * Gets the value of the topBrand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopBrand() {
        return topBrand;
    }

    /**
     * Sets the value of the topBrand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopBrand(String value) {
        this.topBrand = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWidth(Double value) {
        this.width = value;
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
     * Gets the value of the bottomLength property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBottomLength() {
        return bottomLength;
    }

    /**
     * Sets the value of the bottomLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBottomLength(Double value) {
        this.bottomLength = value;
    }

    /**
     * Gets the value of the topColorDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopColorDetails() {
        return topColorDetails;
    }

    /**
     * Sets the value of the topColorDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopColorDetails(String value) {
        this.topColorDetails = value;
    }

    /**
     * Gets the value of the bottomBrand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBottomBrand() {
        return bottomBrand;
    }

    /**
     * Sets the value of the bottomBrand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBottomBrand(String value) {
        this.bottomBrand = value;
    }

    /**
     * Gets the value of the topLength property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTopLength() {
        return topLength;
    }

    /**
     * Sets the value of the topLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTopLength(Double value) {
        this.topLength = value;
    }

}
