
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ValueLoc" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Loc" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="UserDisplay" type="{http://www.CIP4.org/JDFSchema_2_0}EnumUserDisplay" />
 *       &lt;attribute name="HasDefault" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="Required" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="Editable" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="MaxOccurs" type="{http://www.CIP4.org/JDFSchema_2_0}unbounded" />
 *       &lt;attribute name="CurrentValue" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="PresentValueList">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.CIP4.org/JDFSchema_2_0}EnumPresentValueList" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ID" type="{http://www.CIP4.org/JDFSchema_2_0}ID" />
 *       &lt;attribute name="AllowedValueList">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.CIP4.org/JDFSchema_2_0}EnumAllowedValueList" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="DevNS" type="{http://www.CIP4.org/JDFSchema_2_0}URI" />
 *       &lt;attribute name="Availability" type="{http://www.CIP4.org/JDFSchema_2_0}EnumAvailability" />
 *       &lt;attribute name="ListType" type="{http://www.CIP4.org/JDFSchema_2_0}EnumListType" />
 *       &lt;attribute name="MinOccurs" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="ModuleRefs" type="{http://www.CIP4.org/JDFSchema_2_0}IDREFS" />
 *       &lt;attribute name="MacroRefs" type="{http://www.CIP4.org/JDFSchema_2_0}IDREFS" />
 *       &lt;attribute name="ActionRefs" type="{http://www.CIP4.org/JDFSchema_2_0}IDREFS" />
 *       &lt;attribute name="DependentMacroRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="DefaultValue" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="XPath" use="required" type="{http://www.CIP4.org/JDFSchema_2_0}XPath" />
 *       &lt;attribute name="XPathRoot" type="{http://www.CIP4.org/JDFSchema_2_0}XPath" />
 *       &lt;attribute name="DescriptiveName" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "valueLoc",
    "loc"
})
@XmlRootElement(name = "BooleanState")
public class BooleanState
    implements Serializable
{

    @XmlElement(name = "ValueLoc")
    protected List<ValueLoc> valueLoc;
    @XmlElement(name = "Loc")
    protected List<Loc> loc;
    @XmlAttribute(name = "UserDisplay")
    protected EnumUserDisplay userDisplay;
    @XmlAttribute(name = "HasDefault")
    protected Boolean hasDefault;
    @XmlAttribute(name = "Required")
    protected Boolean required;
    @XmlAttribute(name = "Editable")
    protected Boolean editable;
    @XmlAttribute(name = "MaxOccurs")
    protected String maxOccurs;
    @XmlAttribute(name = "CurrentValue")
    protected Boolean currentValue;
    @XmlAttribute(name = "PresentValueList")
    protected List<EnumPresentValueList> presentValueList;
    @XmlAttribute(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "AllowedValueList")
    protected List<EnumAllowedValueList> allowedValueList;
    @XmlAttribute(name = "DevNS")
    protected String devNS;
    @XmlAttribute(name = "Availability")
    protected EnumAvailability availability;
    @XmlAttribute(name = "ListType")
    protected EnumListType listType;
    @XmlAttribute(name = "MinOccurs")
    protected Integer minOccurs;
    @XmlAttribute(name = "ModuleRefs")
    @XmlIDREF
    protected List<Object> moduleRefs;
    @XmlAttribute(name = "MacroRefs")
    @XmlIDREF
    protected List<Object> macroRefs;
    @XmlAttribute(name = "ActionRefs")
    @XmlIDREF
    protected List<Object> actionRefs;
    @XmlAttribute(name = "DependentMacroRef")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IDREF.class)
    protected org.cip4.lib.xjdf.type.IDREF dependentMacroRef;
    @XmlAttribute(name = "DefaultValue")
    protected Boolean defaultValue;
    @XmlAttribute(name = "XPath", required = true)
    protected String xPath;
    @XmlAttribute(name = "XPathRoot")
    protected String xPathRoot;
    @XmlAttribute(name = "DescriptiveName")
    protected String descriptiveName;

    /**
     * Gets the value of the valueLoc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valueLoc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValueLoc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValueLoc }
     * 
     * 
     */
    public List<ValueLoc> getValueLoc() {
        if (valueLoc == null) {
            valueLoc = new ArrayList<ValueLoc>();
        }
        return this.valueLoc;
    }

    /**
     * Gets the value of the loc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Loc }
     * 
     * 
     */
    public List<Loc> getLoc() {
        if (loc == null) {
            loc = new ArrayList<Loc>();
        }
        return this.loc;
    }

    /**
     * Gets the value of the userDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link EnumUserDisplay }
     *     
     */
    public EnumUserDisplay getUserDisplay() {
        return userDisplay;
    }

    /**
     * Sets the value of the userDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumUserDisplay }
     *     
     */
    public void setUserDisplay(EnumUserDisplay value) {
        this.userDisplay = value;
    }

    /**
     * Gets the value of the hasDefault property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasDefault() {
        return hasDefault;
    }

    /**
     * Sets the value of the hasDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasDefault(Boolean value) {
        this.hasDefault = value;
    }

    /**
     * Gets the value of the required property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequired() {
        return required;
    }

    /**
     * Sets the value of the required property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequired(Boolean value) {
        this.required = value;
    }

    /**
     * Gets the value of the editable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEditable() {
        return editable;
    }

    /**
     * Sets the value of the editable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEditable(Boolean value) {
        this.editable = value;
    }

    /**
     * Gets the value of the maxOccurs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxOccurs() {
        return maxOccurs;
    }

    /**
     * Sets the value of the maxOccurs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxOccurs(String value) {
        this.maxOccurs = value;
    }

    /**
     * Gets the value of the currentValue property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCurrentValue() {
        return currentValue;
    }

    /**
     * Sets the value of the currentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCurrentValue(Boolean value) {
        this.currentValue = value;
    }

    /**
     * Gets the value of the presentValueList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the presentValueList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPresentValueList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnumPresentValueList }
     * 
     * 
     */
    public List<EnumPresentValueList> getPresentValueList() {
        if (presentValueList == null) {
            presentValueList = new ArrayList<EnumPresentValueList>();
        }
        return this.presentValueList;
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
     * Gets the value of the allowedValueList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowedValueList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowedValueList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnumAllowedValueList }
     * 
     * 
     */
    public List<EnumAllowedValueList> getAllowedValueList() {
        if (allowedValueList == null) {
            allowedValueList = new ArrayList<EnumAllowedValueList>();
        }
        return this.allowedValueList;
    }

    /**
     * Gets the value of the devNS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevNS() {
        return devNS;
    }

    /**
     * Sets the value of the devNS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevNS(String value) {
        this.devNS = value;
    }

    /**
     * Gets the value of the availability property.
     * 
     * @return
     *     possible object is
     *     {@link EnumAvailability }
     *     
     */
    public EnumAvailability getAvailability() {
        return availability;
    }

    /**
     * Sets the value of the availability property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumAvailability }
     *     
     */
    public void setAvailability(EnumAvailability value) {
        this.availability = value;
    }

    /**
     * Gets the value of the listType property.
     * 
     * @return
     *     possible object is
     *     {@link EnumListType }
     *     
     */
    public EnumListType getListType() {
        return listType;
    }

    /**
     * Sets the value of the listType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumListType }
     *     
     */
    public void setListType(EnumListType value) {
        this.listType = value;
    }

    /**
     * Gets the value of the minOccurs property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinOccurs() {
        return minOccurs;
    }

    /**
     * Sets the value of the minOccurs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinOccurs(Integer value) {
        this.minOccurs = value;
    }

    /**
     * Gets the value of the moduleRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the moduleRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModuleRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getModuleRefs() {
        if (moduleRefs == null) {
            moduleRefs = new ArrayList<Object>();
        }
        return this.moduleRefs;
    }

    /**
     * Gets the value of the macroRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the macroRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMacroRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getMacroRefs() {
        if (macroRefs == null) {
            macroRefs = new ArrayList<Object>();
        }
        return this.macroRefs;
    }

    /**
     * Gets the value of the actionRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actionRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActionRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getActionRefs() {
        if (actionRefs == null) {
            actionRefs = new ArrayList<Object>();
        }
        return this.actionRefs;
    }

    /**
     * Gets the value of the dependentMacroRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.IDREF getDependentMacroRef() {
        return dependentMacroRef;
    }

    /**
     * Sets the value of the dependentMacroRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDependentMacroRef(org.cip4.lib.xjdf.type.IDREF value) {
        this.dependentMacroRef = value;
    }

    /**
     * Gets the value of the defaultValue property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultValue() {
        return defaultValue;
    }

    /**
     * Sets the value of the defaultValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultValue(Boolean value) {
        this.defaultValue = value;
    }

    /**
     * Gets the value of the xPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXPath() {
        return xPath;
    }

    /**
     * Sets the value of the xPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXPath(String value) {
        this.xPath = value;
    }

    /**
     * Gets the value of the xPathRoot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXPathRoot() {
        return xPathRoot;
    }

    /**
     * Sets the value of the xPathRoot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXPathRoot(String value) {
        this.xPathRoot = value;
    }

    /**
     * Gets the value of the descriptiveName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptiveName() {
        return descriptiveName;
    }

    /**
     * Sets the value of the descriptiveName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptiveName(String value) {
        this.descriptiveName = value;
    }

}
