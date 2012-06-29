
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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for Media complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Media">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ResourceType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}MediaLayers" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Location" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Contact" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}HoleList" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}TabDimensions" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="GrainDirection" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="FrontGlossValue" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="StockType" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="Dimension" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="FrontCoatings" type="{http://www.CIP4.org/JDFSchema_2_0}EnumCoatings" />
 *       &lt;attribute name="SleeveInterlock" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="CIEWhiteness" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="RollDiameter" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="ShrinkIndex" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="Grade" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="OpacityLevel" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="InsideLoss" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="Thickness" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="MediaQuality" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="CIETint" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="ImagableSide" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PrePrinted" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="WrapperWeight" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="PlateTechnology" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="MediaUnit" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="BackCoatingDetail" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="BackCoatings" type="{http://www.CIP4.org/JDFSchema_2_0}EnumCoatings" />
 *       &lt;attribute name="FrontCoatingDetail" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="Flute" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="Polarity" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="MediaSetCount" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="MediaColorName" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="MediaColorNameDetails" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="Opacity" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="OuterCoreDiameter" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="Brightness" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="PrintingTechnology" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="MediaTypeDetails" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="BackGlossValue" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="RecycledPercentage" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="CoreWeight" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="Weight" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="LabColorValue" type="{http://www.CIP4.org/JDFSchema_2_0}LabColor" />
 *       &lt;attribute name="Texture" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="FluteDirection" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="HoleType">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.CIP4.org/JDFSchema_2_0}EnumHoleType" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="MediaType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="OutsideGain" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="ReliefThickness" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="IdentificationFieldRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="ColorRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="ColorMeasurementConditionsRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Media", propOrder = {
    "tabDimensions",
    "holeLists",
    "contacts",
    "locations",
    "mediaLayers"
})
public class Media
    extends ResourceType
    implements Serializable
{

    @XmlElement(name = "TabDimensions")
    protected List<TabDimensions> tabDimensions;
    @XmlElement(name = "HoleList")
    protected List<HoleList> holeLists;
    @XmlElement(name = "Contact")
    protected List<Contact> contacts;
    @XmlElement(name = "Location")
    protected List<Location> locations;
    @XmlElement(name = "MediaLayers")
    protected List<MediaLayers> mediaLayers;
    @XmlAttribute(name = "GrainDirection")
    @XmlSchemaType(name = "anySimpleType")
    protected String grainDirection;
    @XmlAttribute(name = "FrontGlossValue")
    protected Double frontGlossValue;
    @XmlAttribute(name = "StockType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String stockType;
    @XmlAttribute(name = "Dimension")
    protected List<Double> dimensions;
    @XmlAttribute(name = "FrontCoatings")
    protected EnumCoatings frontCoatings;
    @XmlAttribute(name = "SleeveInterlock")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String sleeveInterlock;
    @XmlAttribute(name = "CIEWhiteness")
    protected Double cieWhiteness;
    @XmlAttribute(name = "RollDiameter")
    protected Double rollDiameter;
    @XmlAttribute(name = "ShrinkIndex")
    protected List<Double> shrinkIndices;
    @XmlAttribute(name = "Grade")
    protected Integer grade;
    @XmlAttribute(name = "OpacityLevel")
    protected Double opacityLevel;
    @XmlAttribute(name = "InsideLoss")
    protected Double insideLoss;
    @XmlAttribute(name = "Thickness")
    protected Double thickness;
    @XmlAttribute(name = "MediaQuality")
    protected String mediaQuality;
    @XmlAttribute(name = "CIETint")
    protected Double cieTint;
    @XmlAttribute(name = "ImagableSide")
    @XmlSchemaType(name = "anySimpleType")
    protected String imagableSide;
    @XmlAttribute(name = "PrePrinted")
    protected Boolean prePrinted;
    @XmlAttribute(name = "WrapperWeight")
    protected Double wrapperWeight;
    @XmlAttribute(name = "PlateTechnology")
    @XmlSchemaType(name = "anySimpleType")
    protected String plateTechnology;
    @XmlAttribute(name = "MediaUnit")
    @XmlSchemaType(name = "anySimpleType")
    protected String mediaUnit;
    @XmlAttribute(name = "BackCoatingDetail")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String backCoatingDetail;
    @XmlAttribute(name = "BackCoatings")
    protected EnumCoatings backCoatings;
    @XmlAttribute(name = "FrontCoatingDetail")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String frontCoatingDetail;
    @XmlAttribute(name = "Flute")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String flute;
    @XmlAttribute(name = "Polarity")
    @XmlSchemaType(name = "anySimpleType")
    protected String polarity;
    @XmlAttribute(name = "MediaSetCount")
    protected Integer mediaSetCount;
    @XmlAttribute(name = "MediaColorName")
    protected String mediaColorName;
    @XmlAttribute(name = "MediaColorNameDetails")
    protected String mediaColorNameDetails;
    @XmlAttribute(name = "Opacity")
    @XmlSchemaType(name = "anySimpleType")
    protected String opacity;
    @XmlAttribute(name = "OuterCoreDiameter")
    protected Double outerCoreDiameter;
    @XmlAttribute(name = "Brightness")
    protected Double brightness;
    @XmlAttribute(name = "PrintingTechnology")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String printingTechnology;
    @XmlAttribute(name = "MediaTypeDetails")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String mediaTypeDetails;
    @XmlAttribute(name = "BackGlossValue")
    protected Double backGlossValue;
    @XmlAttribute(name = "RecycledPercentage")
    protected Double recycledPercentage;
    @XmlAttribute(name = "CoreWeight")
    protected Double coreWeight;
    @XmlAttribute(name = "Weight")
    protected Double weight;
    @XmlAttribute(name = "LabColorValue")
    protected List<Double> labColorValues;
    @XmlAttribute(name = "Texture")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String texture;
    @XmlAttribute(name = "FluteDirection")
    @XmlSchemaType(name = "anySimpleType")
    protected String fluteDirection;
    @XmlAttribute(name = "HoleType")
    protected List<EnumHoleType> holeTypes;
    @XmlAttribute(name = "MediaType")
    @XmlSchemaType(name = "anySimpleType")
    protected String mediaType;
    @XmlAttribute(name = "OutsideGain")
    protected Double outsideGain;
    @XmlAttribute(name = "ReliefThickness")
    protected Double reliefThickness;
    @XmlAttribute(name = "IdentificationFieldRef")
    @XmlIDREF
    protected Object identificationFieldRef;
    @XmlAttribute(name = "ColorRef")
    @XmlIDREF
    protected Object colorRef;
    @XmlAttribute(name = "ColorMeasurementConditionsRef")
    @XmlIDREF
    protected Object colorMeasurementConditionsRef;

    /**
     * Gets the value of the tabDimensions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tabDimensions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTabDimensions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TabDimensions }
     * 
     * 
     */
    public List<TabDimensions> getTabDimensions() {
        if (tabDimensions == null) {
            tabDimensions = new ArrayList<TabDimensions>();
        }
        return this.tabDimensions;
    }

    /**
     * Gets the value of the holeLists property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the holeLists property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHoleLists().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HoleList }
     * 
     * 
     */
    public List<HoleList> getHoleLists() {
        if (holeLists == null) {
            holeLists = new ArrayList<HoleList>();
        }
        return this.holeLists;
    }

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
     * Gets the value of the mediaLayers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mediaLayers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMediaLayers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MediaLayers }
     * 
     * 
     */
    public List<MediaLayers> getMediaLayers() {
        if (mediaLayers == null) {
            mediaLayers = new ArrayList<MediaLayers>();
        }
        return this.mediaLayers;
    }

    /**
     * Gets the value of the grainDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrainDirection() {
        return grainDirection;
    }

    /**
     * Sets the value of the grainDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrainDirection(String value) {
        this.grainDirection = value;
    }

    /**
     * Gets the value of the frontGlossValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFrontGlossValue() {
        return frontGlossValue;
    }

    /**
     * Sets the value of the frontGlossValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFrontGlossValue(Double value) {
        this.frontGlossValue = value;
    }

    /**
     * Gets the value of the stockType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStockType() {
        return stockType;
    }

    /**
     * Sets the value of the stockType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStockType(String value) {
        this.stockType = value;
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
     * Gets the value of the frontCoatings property.
     * 
     * @return
     *     possible object is
     *     {@link EnumCoatings }
     *     
     */
    public EnumCoatings getFrontCoatings() {
        return frontCoatings;
    }

    /**
     * Sets the value of the frontCoatings property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumCoatings }
     *     
     */
    public void setFrontCoatings(EnumCoatings value) {
        this.frontCoatings = value;
    }

    /**
     * Gets the value of the sleeveInterlock property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSleeveInterlock() {
        return sleeveInterlock;
    }

    /**
     * Sets the value of the sleeveInterlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSleeveInterlock(String value) {
        this.sleeveInterlock = value;
    }

    /**
     * Gets the value of the cieWhiteness property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCIEWhiteness() {
        return cieWhiteness;
    }

    /**
     * Sets the value of the cieWhiteness property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCIEWhiteness(Double value) {
        this.cieWhiteness = value;
    }

    /**
     * Gets the value of the rollDiameter property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRollDiameter() {
        return rollDiameter;
    }

    /**
     * Sets the value of the rollDiameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRollDiameter(Double value) {
        this.rollDiameter = value;
    }

    /**
     * Gets the value of the shrinkIndices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shrinkIndices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShrinkIndices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getShrinkIndices() {
        if (shrinkIndices == null) {
            shrinkIndices = new ArrayList<Double>();
        }
        return this.shrinkIndices;
    }

    /**
     * Gets the value of the grade property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGrade() {
        return grade;
    }

    /**
     * Sets the value of the grade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGrade(Integer value) {
        this.grade = value;
    }

    /**
     * Gets the value of the opacityLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOpacityLevel() {
        return opacityLevel;
    }

    /**
     * Sets the value of the opacityLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOpacityLevel(Double value) {
        this.opacityLevel = value;
    }

    /**
     * Gets the value of the insideLoss property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getInsideLoss() {
        return insideLoss;
    }

    /**
     * Sets the value of the insideLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setInsideLoss(Double value) {
        this.insideLoss = value;
    }

    /**
     * Gets the value of the thickness property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getThickness() {
        return thickness;
    }

    /**
     * Sets the value of the thickness property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setThickness(Double value) {
        this.thickness = value;
    }

    /**
     * Gets the value of the mediaQuality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaQuality() {
        return mediaQuality;
    }

    /**
     * Sets the value of the mediaQuality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaQuality(String value) {
        this.mediaQuality = value;
    }

    /**
     * Gets the value of the cieTint property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCIETint() {
        return cieTint;
    }

    /**
     * Sets the value of the cieTint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCIETint(Double value) {
        this.cieTint = value;
    }

    /**
     * Gets the value of the imagableSide property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImagableSide() {
        return imagableSide;
    }

    /**
     * Sets the value of the imagableSide property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImagableSide(String value) {
        this.imagableSide = value;
    }

    /**
     * Gets the value of the prePrinted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrePrinted() {
        return prePrinted;
    }

    /**
     * Sets the value of the prePrinted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrePrinted(Boolean value) {
        this.prePrinted = value;
    }

    /**
     * Gets the value of the wrapperWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWrapperWeight() {
        return wrapperWeight;
    }

    /**
     * Sets the value of the wrapperWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWrapperWeight(Double value) {
        this.wrapperWeight = value;
    }

    /**
     * Gets the value of the plateTechnology property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlateTechnology() {
        return plateTechnology;
    }

    /**
     * Sets the value of the plateTechnology property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlateTechnology(String value) {
        this.plateTechnology = value;
    }

    /**
     * Gets the value of the mediaUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaUnit() {
        return mediaUnit;
    }

    /**
     * Sets the value of the mediaUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaUnit(String value) {
        this.mediaUnit = value;
    }

    /**
     * Gets the value of the backCoatingDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackCoatingDetail() {
        return backCoatingDetail;
    }

    /**
     * Sets the value of the backCoatingDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackCoatingDetail(String value) {
        this.backCoatingDetail = value;
    }

    /**
     * Gets the value of the backCoatings property.
     * 
     * @return
     *     possible object is
     *     {@link EnumCoatings }
     *     
     */
    public EnumCoatings getBackCoatings() {
        return backCoatings;
    }

    /**
     * Sets the value of the backCoatings property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumCoatings }
     *     
     */
    public void setBackCoatings(EnumCoatings value) {
        this.backCoatings = value;
    }

    /**
     * Gets the value of the frontCoatingDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrontCoatingDetail() {
        return frontCoatingDetail;
    }

    /**
     * Sets the value of the frontCoatingDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrontCoatingDetail(String value) {
        this.frontCoatingDetail = value;
    }

    /**
     * Gets the value of the flute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlute() {
        return flute;
    }

    /**
     * Sets the value of the flute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlute(String value) {
        this.flute = value;
    }

    /**
     * Gets the value of the polarity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolarity() {
        return polarity;
    }

    /**
     * Sets the value of the polarity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolarity(String value) {
        this.polarity = value;
    }

    /**
     * Gets the value of the mediaSetCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMediaSetCount() {
        return mediaSetCount;
    }

    /**
     * Sets the value of the mediaSetCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMediaSetCount(Integer value) {
        this.mediaSetCount = value;
    }

    /**
     * Gets the value of the mediaColorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaColorName() {
        return mediaColorName;
    }

    /**
     * Sets the value of the mediaColorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaColorName(String value) {
        this.mediaColorName = value;
    }

    /**
     * Gets the value of the mediaColorNameDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaColorNameDetails() {
        return mediaColorNameDetails;
    }

    /**
     * Sets the value of the mediaColorNameDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaColorNameDetails(String value) {
        this.mediaColorNameDetails = value;
    }

    /**
     * Gets the value of the opacity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpacity() {
        return opacity;
    }

    /**
     * Sets the value of the opacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpacity(String value) {
        this.opacity = value;
    }

    /**
     * Gets the value of the outerCoreDiameter property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOuterCoreDiameter() {
        return outerCoreDiameter;
    }

    /**
     * Sets the value of the outerCoreDiameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOuterCoreDiameter(Double value) {
        this.outerCoreDiameter = value;
    }

    /**
     * Gets the value of the brightness property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBrightness() {
        return brightness;
    }

    /**
     * Sets the value of the brightness property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBrightness(Double value) {
        this.brightness = value;
    }

    /**
     * Gets the value of the printingTechnology property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintingTechnology() {
        return printingTechnology;
    }

    /**
     * Sets the value of the printingTechnology property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintingTechnology(String value) {
        this.printingTechnology = value;
    }

    /**
     * Gets the value of the mediaTypeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaTypeDetails() {
        return mediaTypeDetails;
    }

    /**
     * Sets the value of the mediaTypeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaTypeDetails(String value) {
        this.mediaTypeDetails = value;
    }

    /**
     * Gets the value of the backGlossValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBackGlossValue() {
        return backGlossValue;
    }

    /**
     * Sets the value of the backGlossValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBackGlossValue(Double value) {
        this.backGlossValue = value;
    }

    /**
     * Gets the value of the recycledPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRecycledPercentage() {
        return recycledPercentage;
    }

    /**
     * Sets the value of the recycledPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRecycledPercentage(Double value) {
        this.recycledPercentage = value;
    }

    /**
     * Gets the value of the coreWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCoreWeight() {
        return coreWeight;
    }

    /**
     * Sets the value of the coreWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCoreWeight(Double value) {
        this.coreWeight = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWeight(Double value) {
        this.weight = value;
    }

    /**
     * Gets the value of the labColorValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the labColorValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLabColorValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getLabColorValues() {
        if (labColorValues == null) {
            labColorValues = new ArrayList<Double>();
        }
        return this.labColorValues;
    }

    /**
     * Gets the value of the texture property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTexture() {
        return texture;
    }

    /**
     * Sets the value of the texture property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTexture(String value) {
        this.texture = value;
    }

    /**
     * Gets the value of the fluteDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFluteDirection() {
        return fluteDirection;
    }

    /**
     * Sets the value of the fluteDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFluteDirection(String value) {
        this.fluteDirection = value;
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

    /**
     * Gets the value of the mediaType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaType() {
        return mediaType;
    }

    /**
     * Sets the value of the mediaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaType(String value) {
        this.mediaType = value;
    }

    /**
     * Gets the value of the outsideGain property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOutsideGain() {
        return outsideGain;
    }

    /**
     * Sets the value of the outsideGain property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOutsideGain(Double value) {
        this.outsideGain = value;
    }

    /**
     * Gets the value of the reliefThickness property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getReliefThickness() {
        return reliefThickness;
    }

    /**
     * Sets the value of the reliefThickness property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setReliefThickness(Double value) {
        this.reliefThickness = value;
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
     * Gets the value of the colorRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getColorRef() {
        return colorRef;
    }

    /**
     * Sets the value of the colorRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setColorRef(Object value) {
        this.colorRef = value;
    }

    /**
     * Gets the value of the colorMeasurementConditionsRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getColorMeasurementConditionsRef() {
        return colorMeasurementConditionsRef;
    }

    /**
     * Sets the value of the colorMeasurementConditionsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setColorMeasurementConditionsRef(Object value) {
        this.colorMeasurementConditionsRef = value;
    }

}
