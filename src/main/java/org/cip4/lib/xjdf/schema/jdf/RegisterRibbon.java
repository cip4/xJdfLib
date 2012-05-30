
package org.cip4.lib.xjdf.schema.jdf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for RegisterRibbon complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegisterRibbon">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ResourceType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Location" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Contact" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="RibbonColorDetails" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="VisibleLength" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="LengthOverall" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="RibbonColor" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="RibbonEnd" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="Material" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="IdentificationFieldRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisterRibbon", propOrder = {
    "contacts",
    "locations"
})
public class RegisterRibbon
    extends ResourceType
    implements Serializable
{

    @XmlElement(name = "Contact")
    protected List<Contact> contacts;
    @XmlElement(name = "Location")
    protected List<Location> locations;
    @XmlAttribute(name = "RibbonColorDetails")
    protected String ribbonColorDetails;
    @XmlAttribute(name = "VisibleLength")
    protected Double visibleLength;
    @XmlAttribute(name = "LengthOverall")
    protected Double lengthOverall;
    @XmlAttribute(name = "RibbonColor")
    protected String ribbonColor;
    @XmlAttribute(name = "RibbonEnd")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String ribbonEnd;
    @XmlAttribute(name = "Material")
    protected String material;
    @XmlAttribute(name = "IdentificationFieldRef")
    @XmlIDREF
    protected Object identificationFieldRef;

    /**
     * Gets the value of the contacts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contacts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContacts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contact }
     * 
     * 
     */
    public List<Contact> getContacts() {
        if (contacts == null) {
            contacts = new ArrayList<Contact>();
        }
        return this.contacts;
    }

    /**
     * Gets the value of the locations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Location }
     * 
     * 
     */
    public List<Location> getLocations() {
        if (locations == null) {
            locations = new ArrayList<Location>();
        }
        return this.locations;
    }

    /**
     * Gets the value of the ribbonColorDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRibbonColorDetails() {
        return ribbonColorDetails;
    }

    /**
     * Sets the value of the ribbonColorDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRibbonColorDetails(String value) {
        this.ribbonColorDetails = value;
    }

    /**
     * Gets the value of the visibleLength property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVisibleLength() {
        return visibleLength;
    }

    /**
     * Sets the value of the visibleLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVisibleLength(Double value) {
        this.visibleLength = value;
    }

    /**
     * Gets the value of the lengthOverall property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLengthOverall() {
        return lengthOverall;
    }

    /**
     * Sets the value of the lengthOverall property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLengthOverall(Double value) {
        this.lengthOverall = value;
    }

    /**
     * Gets the value of the ribbonColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRibbonColor() {
        return ribbonColor;
    }

    /**
     * Sets the value of the ribbonColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRibbonColor(String value) {
        this.ribbonColor = value;
    }

    /**
     * Gets the value of the ribbonEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRibbonEnd() {
        return ribbonEnd;
    }

    /**
     * Sets the value of the ribbonEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRibbonEnd(String value) {
        this.ribbonEnd = value;
    }

    /**
     * Gets the value of the material property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Sets the value of the material property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterial(String value) {
        this.material = value;
    }

    /**
     * Gets the value of the identificationFieldRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getIdentificationFieldRef() {
        return identificationFieldRef;
    }

    /**
     * Sets the value of the identificationFieldRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setIdentificationFieldRef(Object value) {
        this.identificationFieldRef = value;
    }

}
