
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Component complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Component">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ResourceType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Disjointing" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Bundle" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Assembly" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Location" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Contact" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="AssemblyIDs" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKENS" />
 *       &lt;attribute name="Overfold" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="ComponentType">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.CIP4.org/JDFSchema_2_0}EnumComponentType" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="SpineThickness" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="OverfoldSide" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="SheetPart" type="{http://www.CIP4.org/JDFSchema_2_0}rectangle" />
 *       &lt;attribute name="Dimensions" type="{http://www.CIP4.org/JDFSchema_2_0}shape" />
 *       &lt;attribute name="PageListIndex" type="{http://www.CIP4.org/JDFSchema_2_0}IntegerRangeList" />
 *       &lt;attribute name="SurfaceCount" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="CartonTopFlaps" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="MaxHeat" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="ReaderPageCount" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="MediaRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="PageListRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="IdentificationFieldRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="LayoutRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Component", propOrder = {
    "contacts",
    "locations",
    "assemblies",
    "bundles",
    "disjointings"
})
public class Component
    extends ResourceType
    implements Serializable
{

    @XmlElement(name = "Contact")
    protected List<Contact> contacts;
    @XmlElement(name = "Location")
    protected List<Location> locations;
    @XmlElement(name = "Assembly")
    protected List<Assembly> assemblies;
    @XmlElement(name = "Bundle")
    protected List<Bundle> bundles;
    @XmlElement(name = "Disjointing")
    protected List<Disjointing> disjointings;
    @XmlAttribute(name = "AssemblyIDs")
    protected List<String> assemblyIDs;
    @XmlAttribute(name = "Overfold")
    protected Double overfold;
    @XmlAttribute(name = "ComponentType")
    protected List<EnumComponentType> componentTypes;
    @XmlAttribute(name = "SpineThickness")
    protected Double spineThickness;
    @XmlAttribute(name = "OverfoldSide")
    @XmlSchemaType(name = "anySimpleType")
    protected String overfoldSide;
    @XmlAttribute(name = "SheetPart")
    protected Double sheetPart;
    @XmlAttribute(name = "Dimensions")
    protected List<Double> dimensions;
    @XmlAttribute(name = "PageListIndex")
    protected Integer pageListIndex;
    @XmlAttribute(name = "SurfaceCount")
    protected Integer surfaceCount;
    @XmlAttribute(name = "CartonTopFlaps")
    protected List<Double> cartonTopFlaps;
    @XmlAttribute(name = "MaxHeat")
    protected Double maxHeat;
    @XmlAttribute(name = "ReaderPageCount")
    protected Integer readerPageCount;
    @XmlAttribute(name = "MediaRef")
    @XmlIDREF
    protected Object mediaRef;
    @XmlAttribute(name = "PageListRef")
    @XmlIDREF
    protected Object pageListRef;
    @XmlAttribute(name = "IdentificationFieldRef")
    @XmlIDREF
    protected Object identificationFieldRef;
    @XmlAttribute(name = "LayoutRef")
    @XmlIDREF
    protected Object layoutRef;

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
     * Gets the value of the assemblies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assemblies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssemblies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Assembly }
     * 
     * 
     */
    public List<Assembly> getAssemblies() {
        if (assemblies == null) {
            assemblies = new ArrayList<Assembly>();
        }
        return this.assemblies;
    }

    /**
     * Gets the value of the bundles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bundles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBundles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Bundle }
     * 
     * 
     */
    public List<Bundle> getBundles() {
        if (bundles == null) {
            bundles = new ArrayList<Bundle>();
        }
        return this.bundles;
    }

    /**
     * Gets the value of the disjointings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disjointings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisjointings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Disjointing }
     * 
     * 
     */
    public List<Disjointing> getDisjointings() {
        if (disjointings == null) {
            disjointings = new ArrayList<Disjointing>();
        }
        return this.disjointings;
    }

    /**
     * Gets the value of the assemblyIDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assemblyIDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssemblyIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAssemblyIDs() {
        if (assemblyIDs == null) {
            assemblyIDs = new ArrayList<String>();
        }
        return this.assemblyIDs;
    }

    /**
     * Gets the value of the overfold property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOverfold() {
        return overfold;
    }

    /**
     * Sets the value of the overfold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOverfold(Double value) {
        this.overfold = value;
    }

    /**
     * Gets the value of the componentTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the componentTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponentTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnumComponentType }
     * 
     * 
     */
    public List<EnumComponentType> getComponentTypes() {
        if (componentTypes == null) {
            componentTypes = new ArrayList<EnumComponentType>();
        }
        return this.componentTypes;
    }

    /**
     * Gets the value of the spineThickness property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSpineThickness() {
        return spineThickness;
    }

    /**
     * Sets the value of the spineThickness property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSpineThickness(Double value) {
        this.spineThickness = value;
    }

    /**
     * Gets the value of the overfoldSide property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverfoldSide() {
        return overfoldSide;
    }

    /**
     * Sets the value of the overfoldSide property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverfoldSide(String value) {
        this.overfoldSide = value;
    }

    /**
     * Gets the value of the sheetPart property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSheetPart() {
        return sheetPart;
    }

    /**
     * Sets the value of the sheetPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSheetPart(Double value) {
        this.sheetPart = value;
    }

    /**
     * Gets the value of the dimensions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dimensions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDimensions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getDimensions() {
        if (dimensions == null) {
            dimensions = new ArrayList<Double>();
        }
        return this.dimensions;
    }

    /**
     * Gets the value of the pageListIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageListIndex() {
        return pageListIndex;
    }

    /**
     * Sets the value of the pageListIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageListIndex(Integer value) {
        this.pageListIndex = value;
    }

    /**
     * Gets the value of the surfaceCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSurfaceCount() {
        return surfaceCount;
    }

    /**
     * Sets the value of the surfaceCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSurfaceCount(Integer value) {
        this.surfaceCount = value;
    }

    /**
     * Gets the value of the cartonTopFlaps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cartonTopFlaps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCartonTopFlaps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getCartonTopFlaps() {
        if (cartonTopFlaps == null) {
            cartonTopFlaps = new ArrayList<Double>();
        }
        return this.cartonTopFlaps;
    }

    /**
     * Gets the value of the maxHeat property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxHeat() {
        return maxHeat;
    }

    /**
     * Sets the value of the maxHeat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxHeat(Double value) {
        this.maxHeat = value;
    }

    /**
     * Gets the value of the readerPageCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReaderPageCount() {
        return readerPageCount;
    }

    /**
     * Sets the value of the readerPageCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReaderPageCount(Integer value) {
        this.readerPageCount = value;
    }

    /**
     * Gets the value of the mediaRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMediaRef() {
        return mediaRef;
    }

    /**
     * Sets the value of the mediaRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMediaRef(Object value) {
        this.mediaRef = value;
    }

    /**
     * Gets the value of the pageListRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPageListRef() {
        return pageListRef;
    }

    /**
     * Sets the value of the pageListRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPageListRef(Object value) {
        this.pageListRef = value;
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

    /**
     * Gets the value of the layoutRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLayoutRef() {
        return layoutRef;
    }

    /**
     * Sets the value of the layoutRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLayoutRef(Object value) {
        this.layoutRef = value;
    }

}
