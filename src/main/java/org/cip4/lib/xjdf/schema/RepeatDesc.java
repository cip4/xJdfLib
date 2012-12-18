
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *       &lt;attribute name="OrdereQuantity" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="UseBleeds" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="GutterY2" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="AllowedRotate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="GutterX2" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="LayoutStyle" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKENS" />
 *       &lt;attribute name="GutterX" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="GutterY" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "RepeatDesc")
public class RepeatDesc
    implements Serializable
{

    @XmlAttribute(name = "OrdereQuantity")
    protected Integer ordereQuantity;
    @XmlAttribute(name = "UseBleeds")
    protected Boolean useBleeds;
    @XmlAttribute(name = "GutterY2")
    protected Double gutterY2;
    @XmlAttribute(name = "AllowedRotate")
    @XmlSchemaType(name = "anySimpleType")
    protected String allowedRotate;
    @XmlAttribute(name = "GutterX2")
    protected Double gutterX2;
    @XmlAttribute(name = "LayoutStyle")
    protected List<String> layoutStyle;
    @XmlAttribute(name = "GutterX")
    protected Double gutterX;
    @XmlAttribute(name = "GutterY")
    protected Double gutterY;

    /**
     * Gets the value of the ordereQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrdereQuantity() {
        return ordereQuantity;
    }

    /**
     * Sets the value of the ordereQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrdereQuantity(Integer value) {
        this.ordereQuantity = value;
    }

    /**
     * Gets the value of the useBleeds property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseBleeds() {
        return useBleeds;
    }

    /**
     * Sets the value of the useBleeds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseBleeds(Boolean value) {
        this.useBleeds = value;
    }

    /**
     * Gets the value of the gutterY2 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGutterY2() {
        return gutterY2;
    }

    /**
     * Sets the value of the gutterY2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGutterY2(Double value) {
        this.gutterY2 = value;
    }

    /**
     * Gets the value of the allowedRotate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowedRotate() {
        return allowedRotate;
    }

    /**
     * Sets the value of the allowedRotate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowedRotate(String value) {
        this.allowedRotate = value;
    }

    /**
     * Gets the value of the gutterX2 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGutterX2() {
        return gutterX2;
    }

    /**
     * Sets the value of the gutterX2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGutterX2(Double value) {
        this.gutterX2 = value;
    }

    /**
     * Gets the value of the layoutStyle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the layoutStyle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLayoutStyle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLayoutStyle() {
        if (layoutStyle == null) {
            layoutStyle = new ArrayList<String>();
        }
        return this.layoutStyle;
    }

    /**
     * Gets the value of the gutterX property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGutterX() {
        return gutterX;
    }

    /**
     * Sets the value of the gutterX property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGutterX(Double value) {
        this.gutterX = value;
    }

    /**
     * Gets the value of the gutterY property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGutterY() {
        return gutterY;
    }

    /**
     * Sets the value of the gutterY property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGutterY(Double value) {
        this.gutterY = value;
    }

}
