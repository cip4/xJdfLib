
package org.cip4.lib.xjdf.schema;

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
 * <p>Java class for HoleMakingParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HoleMakingParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}RegisterMark" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Hole" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}HoleLine" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="HoleCount" type="{http://www.CIP4.org/JDFSchema_2_0}IntegerList" />
 *       &lt;attribute name="Extent" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="Shape" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CenterReference" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Center" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="HoleType">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.CIP4.org/JDFSchema_2_0}EnumHoleType" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HoleMakingParams", propOrder = {
    "holeLines",
    "holes",
    "registerMarks"
})
public class HoleMakingParams
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "HoleLine")
    protected List<HoleLine> holeLines;
    @XmlElement(name = "Hole")
    protected List<Hole> holes;
    @XmlElement(name = "RegisterMark")
    protected List<RegisterMark> registerMarks;
    @XmlAttribute(name = "HoleCount")
    protected List<Integer> holeCounts;
    @XmlAttribute(name = "Extent")
    protected List<Double> extents;
    @XmlAttribute(name = "Shape")
    @XmlSchemaType(name = "anySimpleType")
    protected String shape;
    @XmlAttribute(name = "CenterReference")
    @XmlSchemaType(name = "anySimpleType")
    protected String centerReference;
    @XmlAttribute(name = "Center")
    protected List<Double> centers;
    @XmlAttribute(name = "HoleType")
    protected List<EnumHoleType> holeTypes;

    /**
     * Gets the value of the holeLines property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the holeLines property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHoleLines().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HoleLine }
     * 
     * 
     */
    public List<HoleLine> getHoleLines() {
        if (holeLines == null) {
            holeLines = new ArrayList<HoleLine>();
        }
        return this.holeLines;
    }

    /**
     * Gets the value of the holes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the holes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHoles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Hole }
     * 
     * 
     */
    public List<Hole> getHoles() {
        if (holes == null) {
            holes = new ArrayList<Hole>();
        }
        return this.holes;
    }

    /**
     * Gets the value of the registerMarks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registerMarks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegisterMarks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegisterMark }
     * 
     * 
     */
    public List<RegisterMark> getRegisterMarks() {
        if (registerMarks == null) {
            registerMarks = new ArrayList<RegisterMark>();
        }
        return this.registerMarks;
    }

    /**
     * Gets the value of the holeCounts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the holeCounts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHoleCounts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getHoleCounts() {
        if (holeCounts == null) {
            holeCounts = new ArrayList<Integer>();
        }
        return this.holeCounts;
    }

    /**
     * Gets the value of the extents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getExtents() {
        if (extents == null) {
            extents = new ArrayList<Double>();
        }
        return this.extents;
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
     * Gets the value of the centerReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCenterReference() {
        return centerReference;
    }

    /**
     * Sets the value of the centerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCenterReference(String value) {
        this.centerReference = value;
    }

    /**
     * Gets the value of the centers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the centers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCenters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getCenters() {
        if (centers == null) {
            centers = new ArrayList<Double>();
        }
        return this.centers;
    }

    /**
     * Gets the value of the holeTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the holeTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHoleTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnumHoleType }
     * 
     * 
     */
    public List<EnumHoleType> getHoleTypes() {
        if (holeTypes == null) {
            holeTypes = new ArrayList<EnumHoleType>();
        }
        return this.holeTypes;
    }

}
