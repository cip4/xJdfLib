
package org.cip4.lib.xjdf.schema.jdf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
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
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}TransferCurve" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}DeviceNColor" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="Lab" type="{http://www.CIP4.org/JDFSchema_2_0}LabColor" />
 *       &lt;attribute name="ColorBookPrefix" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="CMYK" type="{http://www.CIP4.org/JDFSchema_2_0}CMYKColor" />
 *       &lt;attribute name="NeutralDensity" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="ColorBookSuffix" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="ColorBookEntry" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="ColorBook" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="MappingSelection" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="MediaSide" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Density" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="PrintConditionName" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="sRGB" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="MediaRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="FileSpecRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "deviceNColors",
    "transferCurves"
})
@XmlRootElement(name = "PrintConditionColor")
public class PrintConditionColor
    implements Serializable
{

    @XmlElement(name = "DeviceNColor")
    protected List<DeviceNColor> deviceNColors;
    @XmlElement(name = "TransferCurve")
    protected List<TransferCurve> transferCurves;
    @XmlAttribute(name = "Lab")
    protected List<Double> labs;
    @XmlAttribute(name = "ColorBookPrefix")
    protected String colorBookPrefix;
    @XmlAttribute(name = "CMYK")
    protected List<Double> cmyks;
    @XmlAttribute(name = "NeutralDensity")
    protected Double neutralDensity;
    @XmlAttribute(name = "ColorBookSuffix")
    protected String colorBookSuffix;
    @XmlAttribute(name = "ColorBookEntry")
    protected String colorBookEntry;
    @XmlAttribute(name = "ColorBook")
    protected String colorBook;
    @XmlAttribute(name = "MappingSelection")
    @XmlSchemaType(name = "anySimpleType")
    protected String mappingSelection;
    @XmlAttribute(name = "MediaSide")
    @XmlSchemaType(name = "anySimpleType")
    protected String mediaSide;
    @XmlAttribute(name = "Density")
    protected Double density;
    @XmlAttribute(name = "PrintConditionName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String printConditionName;
    @XmlAttribute(name = "sRGB")
    protected String srgb;
    @XmlAttribute(name = "MediaRef")
    @XmlIDREF
    protected Object mediaRef;
    @XmlAttribute(name = "FileSpecRef")
    @XmlIDREF
    protected Object fileSpecRef;

    /**
     * Gets the value of the deviceNColors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deviceNColors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeviceNColors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceNColor }
     * 
     * 
     */
    public List<DeviceNColor> getDeviceNColors() {
        if (deviceNColors == null) {
            deviceNColors = new ArrayList<DeviceNColor>();
        }
        return this.deviceNColors;
    }

    /**
     * Gets the value of the transferCurves property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transferCurves property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransferCurves().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransferCurve }
     * 
     * 
     */
    public List<TransferCurve> getTransferCurves() {
        if (transferCurves == null) {
            transferCurves = new ArrayList<TransferCurve>();
        }
        return this.transferCurves;
    }

    /**
     * Gets the value of the labs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the labs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLabs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getLabs() {
        if (labs == null) {
            labs = new ArrayList<Double>();
        }
        return this.labs;
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
     * Gets the value of the cmyks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cmyks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCMYKS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getCMYKS() {
        if (cmyks == null) {
            cmyks = new ArrayList<Double>();
        }
        return this.cmyks;
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
     * Gets the value of the mediaSide property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaSide() {
        return mediaSide;
    }

    /**
     * Sets the value of the mediaSide property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaSide(String value) {
        this.mediaSide = value;
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
     * Gets the value of the printConditionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintConditionName() {
        return printConditionName;
    }

    /**
     * Sets the value of the printConditionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintConditionName(String value) {
        this.printConditionName = value;
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
