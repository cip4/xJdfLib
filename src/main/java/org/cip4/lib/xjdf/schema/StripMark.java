
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
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
 *       &lt;sequence>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Position" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}RefAnchor" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}JobField" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="MarkContext" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="AbsoluteHeight" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="MarkName" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="ID" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="Anchor" type="{http://www.CIP4.org/JDFSchema_2_0}EnumAnchor" />
 *       &lt;attribute name="RelativeHeight" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="Ord" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="VerticalFitPolicy" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="MarkSide" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="AbsoluteWidth" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="RelativeWidth" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="HorizontalFitPolicy" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Offset" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="Orientation" type="{http://www.CIP4.org/JDFSchema_2_0}EnumOrientation" />
 *       &lt;attribute name="StripMarkDetails" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "position",
    "refAnchor",
    "jobField"
})
@XmlRootElement(name = "StripMark")
public class StripMark
    implements Serializable
{

    @XmlElement(name = "Position")
    protected List<Position> position;
    @XmlElement(name = "RefAnchor")
    protected List<RefAnchor> refAnchor;
    @XmlElement(name = "JobField")
    protected List<JobField> jobField;
    @XmlAttribute(name = "MarkContext")
    @XmlSchemaType(name = "anySimpleType")
    protected String markContext;
    @XmlAttribute(name = "AbsoluteHeight")
    protected Double absoluteHeight;
    @XmlAttribute(name = "MarkName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String markName;
    @XmlAttribute(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String id;
    @XmlAttribute(name = "Anchor")
    protected EnumAnchor anchor;
    @XmlAttribute(name = "RelativeHeight")
    protected Double relativeHeight;
    @XmlAttribute(name = "Ord")
    protected Integer ord;
    @XmlAttribute(name = "VerticalFitPolicy")
    @XmlSchemaType(name = "anySimpleType")
    protected String verticalFitPolicy;
    @XmlAttribute(name = "MarkSide")
    @XmlSchemaType(name = "anySimpleType")
    protected String markSide;
    @XmlAttribute(name = "AbsoluteWidth")
    protected Double absoluteWidth;
    @XmlAttribute(name = "RelativeWidth")
    protected Double relativeWidth;
    @XmlAttribute(name = "HorizontalFitPolicy")
    @XmlSchemaType(name = "anySimpleType")
    protected String horizontalFitPolicy;
    @XmlAttribute(name = "Offset")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.XYPair.class)
    protected org.cip4.lib.xjdf.type.XYPair offset;
    @XmlAttribute(name = "Orientation")
    protected EnumOrientation orientation;
    @XmlAttribute(name = "StripMarkDetails")
    protected String stripMarkDetails;

    /**
     * Gets the value of the position property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the position property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPosition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Position }
     * 
     * 
     */
    public List<Position> getPosition() {
        if (position == null) {
            position = new ArrayList<Position>();
        }
        return this.position;
    }

    /**
     * Gets the value of the refAnchor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refAnchor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefAnchor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RefAnchor }
     * 
     * 
     */
    public List<RefAnchor> getRefAnchor() {
        if (refAnchor == null) {
            refAnchor = new ArrayList<RefAnchor>();
        }
        return this.refAnchor;
    }

    /**
     * Gets the value of the jobField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobField }
     * 
     * 
     */
    public List<JobField> getJobField() {
        if (jobField == null) {
            jobField = new ArrayList<JobField>();
        }
        return this.jobField;
    }

    /**
     * Gets the value of the markContext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkContext() {
        return markContext;
    }

    /**
     * Sets the value of the markContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkContext(String value) {
        this.markContext = value;
    }

    /**
     * Gets the value of the absoluteHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAbsoluteHeight() {
        return absoluteHeight;
    }

    /**
     * Sets the value of the absoluteHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAbsoluteHeight(Double value) {
        this.absoluteHeight = value;
    }

    /**
     * Gets the value of the markName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkName() {
        return markName;
    }

    /**
     * Sets the value of the markName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkName(String value) {
        this.markName = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

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
     * Gets the value of the relativeHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRelativeHeight() {
        return relativeHeight;
    }

    /**
     * Sets the value of the relativeHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRelativeHeight(Double value) {
        this.relativeHeight = value;
    }

    /**
     * Gets the value of the ord property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrd() {
        return ord;
    }

    /**
     * Sets the value of the ord property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrd(Integer value) {
        this.ord = value;
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
     * Gets the value of the markSide property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkSide() {
        return markSide;
    }

    /**
     * Sets the value of the markSide property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkSide(String value) {
        this.markSide = value;
    }

    /**
     * Gets the value of the absoluteWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAbsoluteWidth() {
        return absoluteWidth;
    }

    /**
     * Sets the value of the absoluteWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAbsoluteWidth(Double value) {
        this.absoluteWidth = value;
    }

    /**
     * Gets the value of the relativeWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRelativeWidth() {
        return relativeWidth;
    }

    /**
     * Sets the value of the relativeWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRelativeWidth(Double value) {
        this.relativeWidth = value;
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
     * Gets the value of the offset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.XYPair getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffset(org.cip4.lib.xjdf.type.XYPair value) {
        this.offset = value;
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

    /**
     * Gets the value of the stripMarkDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStripMarkDetails() {
        return stripMarkDetails;
    }

    /**
     * Sets the value of the stripMarkDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStripMarkDetails(String value) {
        this.stripMarkDetails = value;
    }

}
