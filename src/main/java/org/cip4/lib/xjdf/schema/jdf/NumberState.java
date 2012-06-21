
package org.cip4.lib.xjdf.schema.jdf;

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
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ValueLoc" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Loc" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="UserDisplay" type="{http://www.CIP4.org/JDFSchema_2_0}EnumUserDisplay" />
 *       &lt;attribute name="HasDefault" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="Required" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="Editable" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="PresentValueMod" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="MaxOccurs" type="{http://www.CIP4.org/JDFSchema_2_0}unbounded" />
 *       &lt;attribute name="CurrentValue" type="{http://www.CIP4.org/JDFSchema_2_0}NumberList" />
 *       &lt;attribute name="PresentValueList" type="{http://www.CIP4.org/JDFSchema_2_0}NumberRangeList" />
 *       &lt;attribute name="ID" type="{http://www.CIP4.org/JDFSchema_2_0}ID" />
 *       &lt;attribute name="AllowedValueList" type="{http://www.CIP4.org/JDFSchema_2_0}NumberRangeList" />
 *       &lt;attribute name="DevNS" type="{http://www.CIP4.org/JDFSchema_2_0}URI" />
 *       &lt;attribute name="Availability" type="{http://www.CIP4.org/JDFSchema_2_0}EnumAvailability" />
 *       &lt;attribute name="ListType" type="{http://www.CIP4.org/JDFSchema_2_0}EnumListType" />
 *       &lt;attribute name="MinOccurs" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="AllowedValueMod" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="UnitType" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="ModuleRefs" type="{http://www.CIP4.org/JDFSchema_2_0}IDREFS" />
 *       &lt;attribute name="MacroRefs" type="{http://www.CIP4.org/JDFSchema_2_0}IDREFS" />
 *       &lt;attribute name="ActionRefs" type="{http://www.CIP4.org/JDFSchema_2_0}IDREFS" />
 *       &lt;attribute name="DependentMacroRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="DefaultValue" type="{http://www.CIP4.org/JDFSchema_2_0}NumberList" />
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
    "locs",
    "valueLocs"
})
@XmlRootElement(name = "NumberState")
public class NumberState
    implements Serializable
{

    @XmlElement(name = "Loc")
    protected List<Loc> locs;
    @XmlElement(name = "ValueLoc")
    protected List<ValueLoc> valueLocs;
    @XmlAttribute(name = "UserDisplay")
    protected EnumUserDisplay userDisplay;
    @XmlAttribute(name = "HasDefault")
    protected Boolean hasDefault;
    @XmlAttribute(name = "Required")
    protected Boolean required;
    @XmlAttribute(name = "Editable")
    protected Boolean editable;
    @XmlAttribute(name = "PresentValueMod")
    protected List<Double> presentValueMods;
    @XmlAttribute(name = "MaxOccurs")
    protected String maxOccurs;
    @XmlAttribute(name = "CurrentValue")
    protected List<Double> currentValues;
    @XmlAttribute(name = "PresentValueList")
    protected List<Double> presentValueLists;
    @XmlAttribute(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "AllowedValueList")
    protected List<Double> allowedValueLists;
    @XmlAttribute(name = "DevNS")
    protected String devNS;
    @XmlAttribute(name = "Availability")
    protected EnumAvailability availability;
    @XmlAttribute(name = "ListType")
    protected EnumListType listType;
    @XmlAttribute(name = "MinOccurs")
    protected Integer minOccurs;
    @XmlAttribute(name = "AllowedValueMod")
    protected List<Double> allowedValueMods;
    @XmlAttribute(name = "UnitType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String unitType;
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
    @XmlIDREF
    protected Object dependentMacroRef;
    @XmlAttribute(name = "DefaultValue")
    protected List<Double> defaultValues;
    @XmlAttribute(name = "XPath", required = true)
    protected String xPath;
    @XmlAttribute(name = "XPathRoot")
    protected String xPathRoot;
    @XmlAttribute(name = "DescriptiveName")
    protected String descriptiveName;

    /**
     * Gets the value of the locs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Loc }
     * 
     * 
     */
    public List<Loc> getLocs() {
        if (locs == null) {
            locs = new ArrayList<Loc>();
        }
        return this.locs;
    }

    /**
     * Gets the value of the valueLocs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valueLocs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValueLocs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValueLoc }
     * 
     * 
     */
    public List<ValueLoc> getValueLocs() {
        if (valueLocs == null) {
            valueLocs = new ArrayList<ValueLoc>();
        }
        return this.valueLocs;
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
     * Gets the value of the presentValueMods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the presentValueMods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPresentValueMods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getPresentValueMods() {
        if (presentValueMods == null) {
            presentValueMods = new ArrayList<Double>();
        }
        return this.presentValueMods;
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
     * Gets the value of the currentValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currentValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrentValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getCurrentValues() {
        if (currentValues == null) {
            currentValues = new ArrayList<Double>();
        }
        return this.currentValues;
    }

    /**
     * Gets the value of the presentValueLists property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the presentValueLists property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPresentValueLists().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getPresentValueLists() {
        if (presentValueLists == null) {
            presentValueLists = new ArrayList<Double>();
        }
        return this.presentValueLists;
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
     * Gets the value of the allowedValueLists property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowedValueLists property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowedValueLists().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getAllowedValueLists() {
        if (allowedValueLists == null) {
            allowedValueLists = new ArrayList<Double>();
        }
        return this.allowedValueLists;
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
     * Gets the value of the allowedValueMods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowedValueMods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowedValueMods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getAllowedValueMods() {
        if (allowedValueMods == null) {
            allowedValueMods = new ArrayList<Double>();
        }
        return this.allowedValueMods;
    }

    /**
     * Gets the value of the unitType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitType() {
        return unitType;
    }

    /**
     * Sets the value of the unitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitType(String value) {
        this.unitType = value;
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
     *     {@link Object }
     *     
     */
    public Object getDependentMacroRef() {
        return dependentMacroRef;
    }

    /**
     * Sets the value of the dependentMacroRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDependentMacroRef(Object value) {
        this.dependentMacroRef = value;
    }

    /**
     * Gets the value of the defaultValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the defaultValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDefaultValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getDefaultValues() {
        if (defaultValues == null) {
            defaultValues = new ArrayList<Double>();
        }
        return this.defaultValues;
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
