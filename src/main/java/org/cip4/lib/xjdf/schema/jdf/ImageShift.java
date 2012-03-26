
package org.cip4.lib.xjdf.schema.jdf;

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
    protected List<Double> shiftBacks;
    @XmlAttribute(name = "ShiftFront")
    protected List<Double> shiftFronts;
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
     * Gets the value of the shiftBacks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shiftBacks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShiftBacks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getShiftBacks() {
        if (shiftBacks == null) {
            shiftBacks = new ArrayList<Double>();
        }
        return this.shiftBacks;
    }

    /**
     * Gets the value of the shiftFronts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shiftFronts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShiftFronts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getShiftFronts() {
        if (shiftFronts == null) {
            shiftFronts = new ArrayList<Double>();
        }
        return this.shiftFronts;
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
