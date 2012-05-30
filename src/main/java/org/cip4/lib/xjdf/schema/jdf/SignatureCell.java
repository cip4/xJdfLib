
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
    protected List<Integer> frontPages;
    @XmlAttribute(name = "BackPages")
    protected List<Integer> backPages;
    @XmlAttribute(name = "SectionIndex")
    protected Integer sectionIndex;
    @XmlAttribute(name = "FaceCells")
    protected List<Integer> faceCells;
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the frontPages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFrontPages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getFrontPages() {
        if (frontPages == null) {
            frontPages = new ArrayList<Integer>();
        }
        return this.frontPages;
    }

    /**
     * Gets the value of the backPages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the backPages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBackPages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getBackPages() {
        if (backPages == null) {
            backPages = new ArrayList<Integer>();
        }
        return this.backPages;
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the faceCells property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFaceCells().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getFaceCells() {
        if (faceCells == null) {
            faceCells = new ArrayList<Integer>();
        }
        return this.faceCells;
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
