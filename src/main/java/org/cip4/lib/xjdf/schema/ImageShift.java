
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="PositionX" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ShiftBack" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="ShiftFront" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="PositionY" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ImageShift")
public class ImageShift
    implements Serializable
{

    @XmlAttribute(name = "PositionX")
    @XmlSchemaType(name = "anySimpleType")
    protected String positionX;
    @XmlAttribute(name = "ShiftBack")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.XYPair.class)
    protected org.cip4.lib.xjdf.type.XYPair shiftBack;
    @XmlAttribute(name = "ShiftFront")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.XYPair.class)
    protected org.cip4.lib.xjdf.type.XYPair shiftFront;
    @XmlAttribute(name = "PositionY")
    @XmlSchemaType(name = "anySimpleType")
    protected String positionY;

    /**
     * Gets the value of the positionX property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionX() {
        return positionX;
    }

    /**
     * Sets the value of the positionX property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionX(String value) {
        this.positionX = value;
    }

    /**
     * Gets the value of the shiftBack property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.XYPair getShiftBack() {
        return shiftBack;
    }

    /**
     * Sets the value of the shiftBack property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShiftBack(org.cip4.lib.xjdf.type.XYPair value) {
        this.shiftBack = value;
    }

    /**
     * Gets the value of the shiftFront property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.XYPair getShiftFront() {
        return shiftFront;
    }

    /**
     * Sets the value of the shiftFront property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShiftFront(org.cip4.lib.xjdf.type.XYPair value) {
        this.shiftFront = value;
    }

    /**
     * Gets the value of the positionY property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionY() {
        return positionY;
    }

    /**
     * Sets the value of the positionY property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionY(String value) {
        this.positionY = value;
    }

}
