
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
 * <p>Java class for DeviceMark complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceMark">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;attribute name="Anchor" type="{http://www.CIP4.org/JDFSchema_2_0}EnumAnchor" />
 *       &lt;attribute name="MarkOrientation" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="HorizontalFitPolicy" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Font" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="VerticalFitPolicy" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="FontSize" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="BarcodeReproParamsRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceMark")
public class DeviceMark
    extends ParameterType
    implements Serializable
{

    @XmlAttribute(name = "Anchor")
    protected EnumAnchor anchor;
    @XmlAttribute(name = "MarkOrientation")
    @XmlSchemaType(name = "anySimpleType")
    protected String markOrientation;
    @XmlAttribute(name = "HorizontalFitPolicy")
    @XmlSchemaType(name = "anySimpleType")
    protected String horizontalFitPolicy;
    @XmlAttribute(name = "Font")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String font;
    @XmlAttribute(name = "VerticalFitPolicy")
    @XmlSchemaType(name = "anySimpleType")
    protected String verticalFitPolicy;
    @XmlAttribute(name = "FontSize")
    protected Double fontSize;
    @XmlAttribute(name = "BarcodeReproParamsRef")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IDREF.class)
    protected org.cip4.lib.xjdf.type.IDREF barcodeReproParamsRef;

    /**
     * Gets the value of the anchor property.
     * 
     * @return
     *     possible object is
     *     {@link EnumAnchor }
     *     
     */
    public EnumAnchor getAnchor() {
        return anchor;
    }

    /**
     * Sets the value of the anchor property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumAnchor }
     *     
     */
    public void setAnchor(EnumAnchor value) {
        this.anchor = value;
    }

    /**
     * Gets the value of the markOrientation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkOrientation() {
        return markOrientation;
    }

    /**
     * Sets the value of the markOrientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkOrientation(String value) {
        this.markOrientation = value;
    }

    /**
     * Gets the value of the horizontalFitPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHorizontalFitPolicy() {
        return horizontalFitPolicy;
    }

    /**
     * Sets the value of the horizontalFitPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHorizontalFitPolicy(String value) {
        this.horizontalFitPolicy = value;
    }

    /**
     * Gets the value of the font property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFont() {
        return font;
    }

    /**
     * Sets the value of the font property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFont(String value) {
        this.font = value;
    }

    /**
     * Gets the value of the verticalFitPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerticalFitPolicy() {
        return verticalFitPolicy;
    }

    /**
     * Sets the value of the verticalFitPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerticalFitPolicy(String value) {
        this.verticalFitPolicy = value;
    }

    /**
     * Gets the value of the fontSize property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFontSize() {
        return fontSize;
    }

    /**
     * Sets the value of the fontSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFontSize(Double value) {
        this.fontSize = value;
    }

    /**
     * Gets the value of the barcodeReproParamsRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.IDREF getBarcodeReproParamsRef() {
        return barcodeReproParamsRef;
    }

    /**
     * Sets the value of the barcodeReproParamsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarcodeReproParamsRef(org.cip4.lib.xjdf.type.IDREF value) {
        this.barcodeReproParamsRef = value;
    }

}
