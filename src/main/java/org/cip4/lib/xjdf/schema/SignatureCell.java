
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
 *       &lt;attribute name="StationName" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="BottleAxis" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="FrontPages" type="{http://www.CIP4.org/JDFSchema_2_0}IntegerList" />
 *       &lt;attribute name="BackPages" type="{http://www.CIP4.org/JDFSchema_2_0}IntegerList" />
 *       &lt;attribute name="SectionIndex" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="FaceCells" type="{http://www.CIP4.org/JDFSchema_2_0}IntegerList" />
 *       &lt;attribute name="BottleAngle" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
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
@XmlRootElement(name = "SignatureCell")
public class SignatureCell
    implements Serializable
{

    @XmlAttribute(name = "StationName")
    protected String stationName;
    @XmlAttribute(name = "BottleAxis")
    @XmlSchemaType(name = "anySimpleType")
    protected String bottleAxis;
    @XmlAttribute(name = "FrontPages")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IntegerList.class)
    protected org.cip4.lib.xjdf.type.IntegerList frontPages;
    @XmlAttribute(name = "BackPages")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IntegerList.class)
    protected org.cip4.lib.xjdf.type.IntegerList backPages;
    @XmlAttribute(name = "SectionIndex")
    protected Integer sectionIndex;
    @XmlAttribute(name = "FaceCells")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IntegerList.class)
    protected org.cip4.lib.xjdf.type.IntegerList faceCells;
    @XmlAttribute(name = "BottleAngle")
    protected Double bottleAngle;
    @XmlAttribute(name = "Orientation")
    protected EnumOrientation orientation;

    /**
     * Gets the value of the stationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationName() {
        return stationName;
    }

    /**
     * Sets the value of the stationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationName(String value) {
        this.stationName = value;
    }

    /**
     * Gets the value of the bottleAxis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBottleAxis() {
        return bottleAxis;
    }

    /**
     * Sets the value of the bottleAxis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBottleAxis(String value) {
        this.bottleAxis = value;
    }

    /**
     * Gets the value of the frontPages property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.IntegerList getFrontPages() {
        return frontPages;
    }

    /**
     * Sets the value of the frontPages property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrontPages(org.cip4.lib.xjdf.type.IntegerList value) {
        this.frontPages = value;
    }

    /**
     * Gets the value of the backPages property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.IntegerList getBackPages() {
        return backPages;
    }

    /**
     * Sets the value of the backPages property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackPages(org.cip4.lib.xjdf.type.IntegerList value) {
        this.backPages = value;
    }

    /**
     * Gets the value of the sectionIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSectionIndex() {
        return sectionIndex;
    }

    /**
     * Sets the value of the sectionIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSectionIndex(Integer value) {
        this.sectionIndex = value;
    }

    /**
     * Gets the value of the faceCells property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.IntegerList getFaceCells() {
        return faceCells;
    }

    /**
     * Sets the value of the faceCells property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaceCells(org.cip4.lib.xjdf.type.IntegerList value) {
        this.faceCells = value;
    }

    /**
     * Gets the value of the bottleAngle property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBottleAngle() {
        return bottleAngle;
    }

    /**
     * Sets the value of the bottleAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBottleAngle(Double value) {
        this.bottleAngle = value;
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
