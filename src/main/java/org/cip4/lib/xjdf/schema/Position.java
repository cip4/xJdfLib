
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
 *       &lt;attribute name="MarginBottom" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="MarginLeft" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="MarginRight" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="MarginTop" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="RelativeBox" type="{http://www.CIP4.org/JDFSchema_2_0}rectangle" />
 *       &lt;attribute name="AbsoluteBox" type="{http://www.CIP4.org/JDFSchema_2_0}rectangle" />
 *       &lt;attribute name="Orientation" type="{http://www.CIP4.org/JDFSchema_2_0}EnumOrientation" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Position")
public class Position
    implements Serializable
{

    @XmlAttribute(name = "MarginBottom")
    protected Double marginBottom;
    @XmlAttribute(name = "MarginLeft")
    protected Double marginLeft;
    @XmlAttribute(name = "MarginRight")
    protected Double marginRight;
    @XmlAttribute(name = "MarginTop")
    protected Double marginTop;
    @XmlAttribute(name = "RelativeBox")
    protected List<Double> relativeBoxes;
    @XmlAttribute(name = "AbsoluteBox")
    protected List<Double> absoluteBoxes;
    @XmlAttribute(name = "Orientation")
    protected EnumOrientation orientation;

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
     * Gets the value of the relativeBoxes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relativeBoxes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelativeBoxes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getRelativeBoxes() {
        if (relativeBoxes == null) {
            relativeBoxes = new ArrayList<Double>();
        }
        return this.relativeBoxes;
    }

    /**
     * Gets the value of the absoluteBoxes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the absoluteBoxes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbsoluteBoxes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getAbsoluteBoxes() {
        if (absoluteBoxes == null) {
            absoluteBoxes = new ArrayList<Double>();
        }
        return this.absoluteBoxes;
    }

    /**
     * Gets the value of the orientation property.
     * 
     * @return
     *     possible object is
     *     {@link EnumOrientation }
     *     
     */
    public EnumOrientation getOrientation() {
        return orientation;
    }

    /**
     * Sets the value of the orientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumOrientation }
     *     
     */
    public void setOrientation(EnumOrientation value) {
        this.orientation = value;
    }

}
