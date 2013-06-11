
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for Ink complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Ink">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ResourceType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Location" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Contact" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Family" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="SpecificYield" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="InkName" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="SpecialInk" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="ColorName" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="IdentificationFieldRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ink", propOrder = {
    "location",
    "contact"
})
public class Ink
    extends ResourceType
    implements Serializable
{

    @XmlElement(name = "Location")
    protected List<Location> location;
    @XmlElement(name = "Contact")
    protected List<Contact> contact;
    @XmlAttribute(name = "Family")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String family;
    @XmlAttribute(name = "SpecificYield")
    protected Double specificYield;
    @XmlAttribute(name = "InkName")
    protected String inkName;
    @XmlAttribute(name = "SpecialInk")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String specialInk;
    @XmlAttribute(name = "ColorName")
    protected String colorName;
    @XmlAttribute(name = "IdentificationFieldRef")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IDREF.class)
    protected org.cip4.lib.xjdf.type.IDREF identificationFieldRef;

    /**
     * Gets the value of the location property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the location property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Location }
     * 
     * 
     */
    public List<Location> getLocation() {
        if (location == null) {
            location = new ArrayList<Location>();
        }
        return this.location;
    }

    /**
     * Gets the value of the contact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contact }
     * 
     * 
     */
    public List<Contact> getContact() {
        if (contact == null) {
            contact = new ArrayList<Contact>();
        }
        return this.contact;
    }

    /**
     * Gets the value of the family property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamily() {
        return family;
    }

    /**
     * Sets the value of the family property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamily(String value) {
        this.family = value;
    }

    /**
     * Gets the value of the specificYield property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSpecificYield() {
        return specificYield;
    }

    /**
     * Sets the value of the specificYield property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSpecificYield(Double value) {
        this.specificYield = value;
    }

    /**
     * Gets the value of the inkName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInkName() {
        return inkName;
    }

    /**
     * Sets the value of the inkName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInkName(String value) {
        this.inkName = value;
    }

    /**
     * Gets the value of the specialInk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialInk() {
        return specialInk;
    }

    /**
     * Sets the value of the specialInk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialInk(String value) {
        this.specialInk = value;
    }

    /**
     * Gets the value of the colorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorName() {
        return colorName;
    }

    /**
     * Sets the value of the colorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorName(String value) {
        this.colorName = value;
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
