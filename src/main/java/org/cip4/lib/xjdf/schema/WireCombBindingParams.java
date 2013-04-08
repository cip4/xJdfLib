
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for WireCombBindingParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WireCombBindingParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;attribute name="FlipBackCover" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="Shape" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ColorDetails" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="Color" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="Diameter" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="Thickness" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="Material" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="HoleMakingParamsRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WireCombBindingParams")
public class WireCombBindingParams
    extends ParameterType
    implements Serializable
{

    @XmlAttribute(name = "FlipBackCover")
    protected Boolean flipBackCover;
    @XmlAttribute(name = "Shape")
    @XmlSchemaType(name = "anySimpleType")
    protected String shape;
    @XmlAttribute(name = "ColorDetails")
    protected String colorDetails;
    @XmlAttribute(name = "Color")
    protected String color;
    @XmlAttribute(name = "Diameter")
    protected Double diameter;
    @XmlAttribute(name = "Thickness")
    protected Double thickness;
    @XmlAttribute(name = "Material")
    @XmlSchemaType(name = "anySimpleType")
    protected String material;
    @XmlAttribute(name = "HoleMakingParamsRef")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IDREF.class)
    protected org.cip4.lib.xjdf.type.IDREF holeMakingParamsRef;

    /**
     * Gets the value of the flipBackCover property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlipBackCover() {
        return flipBackCover;
    }

    /**
     * Sets the value of the flipBackCover property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlipBackCover(Boolean value) {
        this.flipBackCover = value;
    }

    /**
     * Gets the value of the shape property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShape() {
        return shape;
    }

    /**
     * Sets the value of the shape property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShape(String value) {
        this.shape = value;
    }

    /**
     * Gets the value of the colorDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorDetails() {
        return colorDetails;
    }

    /**
     * Sets the value of the colorDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorDetails(String value) {
        this.colorDetails = value;
    }

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Gets the value of the diameter property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDiameter() {
        return diameter;
    }

    /**
     * Sets the value of the diameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDiameter(Double value) {
        this.diameter = value;
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
     * Gets the value of the material property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Sets the value of the material property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterial(String value) {
        this.material = value;
    }

    /**
     * Gets the value of the holeMakingParamsRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.IDREF getHoleMakingParamsRef() {
        return holeMakingParamsRef;
    }

    /**
     * Sets the value of the holeMakingParamsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoleMakingParamsRef(org.cip4.lib.xjdf.type.IDREF value) {
        this.holeMakingParamsRef = value;
    }

}
