
package org.cip4.lib.xjdf.schema.jdf;

import java.io.Serializable;
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
 *       &lt;attribute name="SheetHeight" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="MarginBottom" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="SheetWidth" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="MarginLeft" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="MarginTop" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="MarginRight" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="DeviceRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ConvertingConfig")
public class ConvertingConfig
    implements Serializable
{

    @XmlAttribute(name = "SheetHeight")
    protected String sheetHeight;
    @XmlAttribute(name = "MarginBottom")
    protected Double marginBottom;
    @XmlAttribute(name = "SheetWidth")
    protected String sheetWidth;
    @XmlAttribute(name = "MarginLeft")
    protected Double marginLeft;
    @XmlAttribute(name = "MarginTop")
    protected Double marginTop;
    @XmlAttribute(name = "MarginRight")
    protected Double marginRight;
    @XmlAttribute(name = "DeviceRef")
    @XmlIDREF
    protected Object deviceRef;

    /**
     * Gets the value of the sheetHeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSheetHeight() {
        return sheetHeight;
    }

    /**
     * Sets the value of the sheetHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSheetHeight(String value) {
        this.sheetHeight = value;
    }

    /**
     * Gets the value of the marginBottom property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMarginBottom() {
        return marginBottom;
    }

    /**
     * Sets the value of the marginBottom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMarginBottom(Double value) {
        this.marginBottom = value;
    }

    /**
     * Gets the value of the sheetWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSheetWidth() {
        return sheetWidth;
    }

    /**
     * Sets the value of the sheetWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSheetWidth(String value) {
        this.sheetWidth = value;
    }

    /**
     * Gets the value of the marginLeft property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMarginLeft() {
        return marginLeft;
    }

    /**
     * Sets the value of the marginLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMarginLeft(Double value) {
        this.marginLeft = value;
    }

    /**
     * Gets the value of the marginTop property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMarginTop() {
        return marginTop;
    }

    /**
     * Sets the value of the marginTop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMarginTop(Double value) {
        this.marginTop = value;
    }

    /**
     * Gets the value of the marginRight property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMarginRight() {
        return marginRight;
    }

    /**
     * Sets the value of the marginRight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMarginRight(Double value) {
        this.marginRight = value;
    }

    /**
     * Gets the value of the deviceRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDeviceRef() {
        return deviceRef;
    }

    /**
     * Sets the value of the deviceRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDeviceRef(Object value) {
        this.deviceRef = value;
    }

}
