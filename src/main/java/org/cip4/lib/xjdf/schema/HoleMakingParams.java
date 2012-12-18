
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
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
    "registerMark",
    "hole",
    "holeLine"
})
public class HoleMakingParams
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "RegisterMark")
    protected List<RegisterMark> registerMark;
    @XmlElement(name = "Hole")
    protected List<Hole> hole;
    @XmlElement(name = "HoleLine")
    protected List<HoleLine> holeLine;
    @XmlAttribute(name = "HoleCount")
    protected List<Integer> holeCount;
    @XmlAttribute(name = "Extent")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.XYPair.class)
    protected org.cip4.lib.xjdf.type.XYPair extent;
    @XmlAttribute(name = "Shape")
    @XmlSchemaType(name = "anySimpleType")
    protected String shape;
    @XmlAttribute(name = "CenterReference")
    @XmlSchemaType(name = "anySimpleType")
    protected String centerReference;
    @XmlAttribute(name = "Center")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.XYPair.class)
    protected org.cip4.lib.xjdf.type.XYPair center;
    @XmlAttribute(name = "HoleType")
    protected List<EnumHoleType> holeType;

    /**
     * Gets the value of the registerMark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registerMark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegisterMark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegisterMark }
     * 
     * 
     */
    public List<RegisterMark> getRegisterMark() {
        if (registerMark == null) {
            registerMark = new ArrayList<RegisterMark>();
        }
        return this.registerMark;
    }

    /**
     * Gets the value of the hole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Hole }
     * 
     * 
     */
    public List<Hole> getHole() {
        if (hole == null) {
            hole = new ArrayList<Hole>();
        }
        return this.hole;
    }

    /**
     * Gets the value of the holeLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the holeLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHoleLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HoleLine }
     * 
     * 
     */
    public List<HoleLine> getHoleLine() {
        if (holeLine == null) {
            holeLine = new ArrayList<HoleLine>();
        }
        return this.holeLine;
    }

    /**
     * Gets the value of the holeCount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the holeCount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHoleCount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getHoleCount() {
        if (holeCount == null) {
            holeCount = new ArrayList<Integer>();
        }
        return this.holeCount;
    }

    /**
     * Gets the value of the extent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.XYPair getExtent() {
        return extent;
    }

    /**
     * Sets the value of the extent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtent(org.cip4.lib.xjdf.type.XYPair value) {
        this.extent = value;
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
     * Gets the value of the center property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.XYPair getCenter() {
        return center;
    }

    /**
     * Sets the value of the center property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCenter(org.cip4.lib.xjdf.type.XYPair value) {
        this.center = value;
    }

    /**
     * Gets the value of the holeType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the holeType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHoleType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnumHoleType }
     * 
     * 
     */
    public List<EnumHoleType> getHoleType() {
        if (holeType == null) {
            holeType = new ArrayList<EnumHoleType>();
        }
        return this.holeType;
    }

}
