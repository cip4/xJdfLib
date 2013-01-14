
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
 * <p>Java class for Color complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Color">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}TransferCurve" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}PrintConditionColor" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}DeviceNColor" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Lab" type="{http://www.CIP4.org/JDFSchema_2_0}LabColor" />
 *       &lt;attribute name="RawName" type="{http://www.CIP4.org/JDFSchema_2_0}hexBinary" />
 *       &lt;attribute name="NeutralDensity" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="MappingSelection" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ColorDetails" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="Name" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="Gray" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="Density" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="CMYK" type="{http://www.CIP4.org/JDFSchema_2_0}CMYKColor" />
 *       &lt;attribute name="ColorBookPrefix" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="ActualColorName" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="ColorBook" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="ColorBookEntry" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="ColorBookSuffix" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="ColorType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ColorName" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="MediaType" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="sRGB" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="ColorMeasurementConditionsRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="FileSpecRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Color", propOrder = {
    "transferCurve",
    "printConditionColor",
    "deviceNColor"
})
public class Color
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "TransferCurve")
    protected List<TransferCurve> transferCurve;
    @XmlElement(name = "PrintConditionColor")
    protected List<PrintConditionColor> printConditionColor;
    @XmlElement(name = "DeviceNColor")
    protected List<DeviceNColor> deviceNColor;
    @XmlAttribute(name = "Lab")
    protected List<Double> lab;
    @XmlAttribute(name = "RawName")
    protected String rawName;
    @XmlAttribute(name = "NeutralDensity")
    protected Double neutralDensity;
    @XmlAttribute(name = "MappingSelection")
    @XmlSchemaType(name = "anySimpleType")
    protected String mappingSelection;
    @XmlAttribute(name = "ColorDetails")
    protected String colorDetails;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Gray")
    protected Double gray;
    @XmlAttribute(name = "Density")
    protected Double density;
    @XmlAttribute(name = "CMYK")
    protected List<Double> cmyk;
    @XmlAttribute(name = "ColorBookPrefix")
    protected String colorBookPrefix;
    @XmlAttribute(name = "ActualColorName")
    protected String actualColorName;
    @XmlAttribute(name = "ColorBook")
    protected String colorBook;
    @XmlAttribute(name = "ColorBookEntry")
    protected String colorBookEntry;
    @XmlAttribute(name = "ColorBookSuffix")
    protected String colorBookSuffix;
    @XmlAttribute(name = "ColorType")
    @XmlSchemaType(name = "anySimpleType")
    protected String colorType;
    @XmlAttribute(name = "ColorName")
    protected String colorName;
    @XmlAttribute(name = "MediaType")
    protected String mediaType;
    @XmlAttribute(name = "sRGB")
    protected String srgb;
    @XmlAttribute(name = "ColorMeasurementConditionsRef")
    @XmlIDREF
    protected Object colorMeasurementConditionsRef;
    @XmlAttribute(name = "FileSpecRef")
    @XmlIDREF
    protected Object fileSpecRef;

    /**
     * Gets the value of the transferCurve property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transferCurve property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransferCurve().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransferCurve }
     * 
     * 
     */
    public List<TransferCurve> getTransferCurve() {
        if (transferCurve == null) {
            transferCurve = new ArrayList<TransferCurve>();
        }
        return this.transferCurve;
    }

    /**
     * Gets the value of the printConditionColor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the printConditionColor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrintConditionColor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrintConditionColor }
     * 
     * 
     */
    public List<PrintConditionColor> getPrintConditionColor() {
        if (printConditionColor == null) {
            printConditionColor = new ArrayList<PrintConditionColor>();
        }
        return this.printConditionColor;
    }

    /**
     * Gets the value of the deviceNColor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deviceNColor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeviceNColor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceNColor }
     * 
     * 
     */
    public List<DeviceNColor> getDeviceNColor() {
        if (deviceNColor == null) {
            deviceNColor = new ArrayList<DeviceNColor>();
        }
        return this.deviceNColor;
    }

    /**
     * Gets the value of the lab property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lab property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLab().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getLab() {
        if (lab == null) {
            lab = new ArrayList<Double>();
        }
        return this.lab;
    }

    /**
     * Gets the value of the rawName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRawName() {
        return rawName;
    }

    /**
     * Sets the value of the rawName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRawName(String value) {
        this.rawName = value;
    }

    /**
     * Gets the value of the neutralDensity property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNeutralDensity() {
        return neutralDensity;
    }

    /**
     * Sets the value of the neutralDensity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNeutralDensity(Double value) {
        this.neutralDensity = value;
    }

    /**
     * Gets the value of the mappingSelection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMappingSelection() {
        return mappingSelection;
    }

    /**
     * Sets the value of the mappingSelection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMappingSelection(String value) {
        this.mappingSelection = value;
    }

    /**
     * Gets the value of the colorDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorDetails() {
        return colorDetails;
    }

    /**
     * Sets the value of the colorDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorDetails(String value) {
        this.colorDetails = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the gray property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGray() {
        return gray;
    }

    /**
     * Sets the value of the gray property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGray(Double value) {
        this.gray = value;
    }

    /**
     * Gets the value of the density property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDensity() {
        return density;
    }

    /**
     * Sets the value of the density property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDensity(Double value) {
        this.density = value;
    }

    /**
     * Gets the value of the cmyk property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cmyk property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCMYK().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getCMYK() {
        if (cmyk == null) {
            cmyk = new ArrayList<Double>();
        }
        return this.cmyk;
    }

    /**
     * Gets the value of the colorBookPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorBookPrefix() {
        return colorBookPrefix;
    }

    /**
     * Sets the value of the colorBookPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorBookPrefix(String value) {
        this.colorBookPrefix = value;
    }

    /**
     * Gets the value of the actualColorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualColorName() {
        return actualColorName;
    }

    /**
     * Sets the value of the actualColorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualColorName(String value) {
        this.actualColorName = value;
    }

    /**
     * Gets the value of the colorBook property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorBook() {
        return colorBook;
    }

    /**
     * Sets the value of the colorBook property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorBook(String value) {
        this.colorBook = value;
    }

    /**
     * Gets the value of the colorBookEntry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorBookEntry() {
        return colorBookEntry;
    }

    /**
     * Sets the value of the colorBookEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorBookEntry(String value) {
        this.colorBookEntry = value;
    }

    /**
     * Gets the value of the colorBookSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorBookSuffix() {
        return colorBookSuffix;
    }

    /**
     * Sets the value of the colorBookSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorBookSuffix(String value) {
        this.colorBookSuffix = value;
    }

    /**
     * Gets the value of the colorType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorType() {
        return colorType;
    }

    /**
     * Sets the value of the colorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorType(String value) {
        this.colorType = value;
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
     * Gets the value of the srgb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSRGB() {
        return srgb;
    }

    /**
     * Sets the value of the srgb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSRGB(String value) {
        this.srgb = value;
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

    /**
     * Gets the value of the fileSpecRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFileSpecRef() {
        return fileSpecRef;
    }

    /**
     * Sets the value of the fileSpecRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFileSpecRef(Object value) {
        this.fileSpecRef = value;
    }

}
