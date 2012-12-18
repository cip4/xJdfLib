
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
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}RefAnchor" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="Size" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="CTM" type="{http://www.CIP4.org/JDFSchema_2_0}matrix" />
 *       &lt;attribute name="RelativeSize" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="Anchor" type="{http://www.CIP4.org/JDFSchema_2_0}EnumAnchor" />
 *       &lt;attribute name="RotationPolicy" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PageRange" type="{http://www.CIP4.org/JDFSchema_2_0}IntegerRangeList" />
 *       &lt;attribute name="SizePolicy" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PositionPolicy" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "refAnchor"
})
@XmlRootElement(name = "PositionObj")
public class PositionObj
    implements Serializable
{

    @XmlElement(name = "RefAnchor")
    protected List<RefAnchor> refAnchor;
    @XmlAttribute(name = "Size")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.XYPair.class)
    protected org.cip4.lib.xjdf.type.XYPair size;
    @XmlAttribute(name = "CTM")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.Matrix.class)
    protected org.cip4.lib.xjdf.type.Matrix ctm;
    @XmlAttribute(name = "RelativeSize")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.XYPair.class)
    protected org.cip4.lib.xjdf.type.XYPair relativeSize;
    @XmlAttribute(name = "Anchor")
    protected EnumAnchor anchor;
    @XmlAttribute(name = "RotationPolicy")
    @XmlSchemaType(name = "anySimpleType")
    protected String rotationPolicy;
    @XmlAttribute(name = "PageRange")
    protected Integer pageRange;
    @XmlAttribute(name = "SizePolicy")
    @XmlSchemaType(name = "anySimpleType")
    protected String sizePolicy;
    @XmlAttribute(name = "PositionPolicy")
    @XmlSchemaType(name = "anySimpleType")
    protected String positionPolicy;

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
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.XYPair getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSize(org.cip4.lib.xjdf.type.XYPair value) {
        this.size = value;
    }

    /**
     * Gets the value of the ctm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.Matrix getCTM() {
        return ctm;
    }

    /**
     * Sets the value of the ctm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTM(org.cip4.lib.xjdf.type.Matrix value) {
        this.ctm = value;
    }

    /**
     * Gets the value of the relativeSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.XYPair getRelativeSize() {
        return relativeSize;
    }

    /**
     * Sets the value of the relativeSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelativeSize(org.cip4.lib.xjdf.type.XYPair value) {
        this.relativeSize = value;
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
     * Gets the value of the rotationPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRotationPolicy() {
        return rotationPolicy;
    }

    /**
     * Sets the value of the rotationPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRotationPolicy(String value) {
        this.rotationPolicy = value;
    }

    /**
     * Gets the value of the pageRange property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageRange() {
        return pageRange;
    }

    /**
     * Sets the value of the pageRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageRange(Integer value) {
        this.pageRange = value;
    }

    /**
     * Gets the value of the sizePolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSizePolicy() {
        return sizePolicy;
    }

    /**
     * Sets the value of the sizePolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSizePolicy(String value) {
        this.sizePolicy = value;
    }

    /**
     * Gets the value of the positionPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionPolicy() {
        return positionPolicy;
    }

    /**
     * Sets the value of the positionPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionPolicy(String value) {
        this.positionPolicy = value;
    }

}
