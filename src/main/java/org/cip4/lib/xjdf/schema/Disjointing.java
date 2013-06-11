
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
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}InsertSheet" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="OffsetAmount" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="OffsetDirection" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Offset" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="Number" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="IdentificationFieldRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "insertSheet"
})
@XmlRootElement(name = "Disjointing")
public class Disjointing
    implements Serializable
{

    @XmlElement(name = "InsertSheet")
    protected List<InsertSheet> insertSheet;
    @XmlAttribute(name = "OffsetAmount")
    protected Integer offsetAmount;
    @XmlAttribute(name = "OffsetDirection")
    @XmlSchemaType(name = "anySimpleType")
    protected String offsetDirection;
    @XmlAttribute(name = "Offset")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.XYPair.class)
    protected org.cip4.lib.xjdf.type.XYPair offset;
    @XmlAttribute(name = "Number")
    protected Integer number;
    @XmlAttribute(name = "IdentificationFieldRef")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IDREF.class)
    protected org.cip4.lib.xjdf.type.IDREF identificationFieldRef;

    /**
     * Gets the value of the insertSheet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the insertSheet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInsertSheet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InsertSheet }
     * 
     * 
     */
    public List<InsertSheet> getInsertSheet() {
        if (insertSheet == null) {
            insertSheet = new ArrayList<InsertSheet>();
        }
        return this.insertSheet;
    }

    /**
     * Gets the value of the offsetAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOffsetAmount() {
        return offsetAmount;
    }

    /**
     * Sets the value of the offsetAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOffsetAmount(Integer value) {
        this.offsetAmount = value;
    }

    /**
     * Gets the value of the offsetDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffsetDirection() {
        return offsetDirection;
    }

    /**
     * Sets the value of the offsetDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffsetDirection(String value) {
        this.offsetDirection = value;
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
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumber(Integer value) {
        this.number = value;
    }

    /**
     * Gets the value of the identificationFieldRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.IDREF getIdentificationFieldRef() {
        return identificationFieldRef;
    }

    /**
     * Sets the value of the identificationFieldRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificationFieldRef(org.cip4.lib.xjdf.type.IDREF value) {
        this.identificationFieldRef = value;
    }

}
