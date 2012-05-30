
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
import javax.xml.bind.annotation.XmlType;


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
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ScavengerArea" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}DensityMeasuringField" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}CIELABMeasuringField" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ColorControlStrip" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}JobField" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}RegisterMark" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}DynamicField" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}CutMark" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}DeviceMark" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}RefAnchor" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}MarkActivation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="CompensationCTMTemplate" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="TrimClipPath" type="{http://www.CIP4.org/JDFSchema_2_0}PDFPath" />
 *       &lt;attribute name="ClipBox" type="{http://www.CIP4.org/JDFSchema_2_0}rectangle" />
 *       &lt;attribute name="CTM" type="{http://www.CIP4.org/JDFSchema_2_0}matrix" />
 *       &lt;attribute name="OrdID" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="LogicalStackOrd" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="Anchor" type="{http://www.CIP4.org/JDFSchema_2_0}EnumAnchor" />
 *       &lt;attribute name="ClipBoxFormat" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="TrimCTM" type="{http://www.CIP4.org/JDFSchema_2_0}matrix" />
 *       &lt;attribute name="LayerID" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="SourceClipPath" type="{http://www.CIP4.org/JDFSchema_2_0}PDFPath" />
 *       &lt;attribute name="ClipBoxTemplate" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="ClipPath" type="{http://www.CIP4.org/JDFSchema_2_0}PDFPath" />
 *       &lt;attribute name="ContentRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="Ord" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="TrimSize" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="HalfTonePhaseOrigin" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="CompensationCTMFormat" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
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
    "markActivations",
    "refAnchors",
    "deviceMarks",
    "cutMarks",
    "dynamicFields",
    "registerMarks",
    "jobFields",
    "colorControlStrips",
    "cielabMeasuringFields",
    "densityMeasuringFields",
    "scavengerAreas"
})
@XmlRootElement(name = "MarkObject")
public class MarkObject
    implements Serializable
{

    @XmlElement(name = "MarkActivation")
    protected List<MarkActivation> markActivations;
    @XmlElement(name = "RefAnchor")
    protected List<RefAnchor> refAnchors;
    @XmlElement(name = "DeviceMark")
    protected List<DeviceMark> deviceMarks;
    @XmlElement(name = "CutMark")
    protected List<CutMark> cutMarks;
    @XmlElement(name = "DynamicField")
    protected List<DynamicField> dynamicFields;
    @XmlElement(name = "RegisterMark")
    protected List<RegisterMark> registerMarks;
    @XmlElement(name = "JobField")
    protected List<JobField> jobFields;
    @XmlElement(name = "ColorControlStrip")
    protected List<ColorControlStrip> colorControlStrips;
    @XmlElement(name = "CIELABMeasuringField")
    protected List<CIELABMeasuringField> cielabMeasuringFields;
    @XmlElement(name = "DensityMeasuringField")
    protected List<DensityMeasuringField> densityMeasuringFields;
    @XmlElement(name = "ScavengerArea")
    protected List<ScavengerArea> scavengerAreas;
    @XmlAttribute(name = "CompensationCTMTemplate")
    protected String compensationCTMTemplate;
    @XmlAttribute(name = "TrimClipPath")
    protected String trimClipPath;
    @XmlAttribute(name = "ClipBox")
    protected Double clipBox;
    @XmlAttribute(name = "CTM")
    protected List<Double> ctms;
    @XmlAttribute(name = "OrdID")
    protected Integer ordID;
    @XmlAttribute(name = "LogicalStackOrd")
    protected Integer logicalStackOrd;
    @XmlAttribute(name = "Anchor")
    protected EnumAnchor anchor;
    @XmlAttribute(name = "ClipBoxFormat")
    protected String clipBoxFormat;
    @XmlAttribute(name = "TrimCTM")
    protected List<Double> trimCTMs;
    @XmlAttribute(name = "LayerID")
    protected Integer layerID;
    @XmlAttribute(name = "SourceClipPath")
    protected String sourceClipPath;
    @XmlAttribute(name = "ClipBoxTemplate")
    protected String clipBoxTemplate;
    @XmlAttribute(name = "ClipPath")
    protected String clipPath;
    @XmlAttribute(name = "ContentRef")
    @XmlIDREF
    protected Object contentRef;
    @XmlAttribute(name = "Ord")
    protected Integer ord;
    @XmlAttribute(name = "TrimSize")
    protected List<Double> trimSizes;
    @XmlAttribute(name = "HalfTonePhaseOrigin")
    protected List<Double> halfTonePhaseOrigins;
    @XmlAttribute(name = "CompensationCTMFormat")
    protected String compensationCTMFormat;
    @XmlAttribute(name = "IdentificationFieldRef")
    @XmlIDREF
    protected Object identificationFieldRef;

    /**
     * Gets the value of the markActivations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the markActivations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarkActivations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarkActivation }
     * 
     * 
     */
    public List<MarkActivation> getMarkActivations() {
        if (markActivations == null) {
            markActivations = new ArrayList<MarkActivation>();
        }
        return this.markActivations;
    }

    /**
     * Gets the value of the refAnchors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refAnchors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefAnchors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RefAnchor }
     * 
     * 
     */
    public List<RefAnchor> getRefAnchors() {
        if (refAnchors == null) {
            refAnchors = new ArrayList<RefAnchor>();
        }
        return this.refAnchors;
    }

    /**
     * Gets the value of the deviceMarks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deviceMarks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeviceMarks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceMark }
     * 
     * 
     */
    public List<DeviceMark> getDeviceMarks() {
        if (deviceMarks == null) {
            deviceMarks = new ArrayList<DeviceMark>();
        }
        return this.deviceMarks;
    }

    /**
     * Gets the value of the cutMarks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cutMarks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCutMarks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CutMark }
     * 
     * 
     */
    public List<CutMark> getCutMarks() {
        if (cutMarks == null) {
            cutMarks = new ArrayList<CutMark>();
        }
        return this.cutMarks;
    }

    /**
     * Gets the value of the dynamicFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dynamicFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDynamicFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DynamicField }
     * 
     * 
     */
    public List<DynamicField> getDynamicFields() {
        if (dynamicFields == null) {
            dynamicFields = new ArrayList<DynamicField>();
        }
        return this.dynamicFields;
    }

    /**
     * Gets the value of the registerMarks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registerMarks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegisterMarks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegisterMark }
     * 
     * 
     */
    public List<RegisterMark> getRegisterMarks() {
        if (registerMarks == null) {
            registerMarks = new ArrayList<RegisterMark>();
        }
        return this.registerMarks;
    }

    /**
     * Gets the value of the jobFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobField }
     * 
     * 
     */
    public List<JobField> getJobFields() {
        if (jobFields == null) {
            jobFields = new ArrayList<JobField>();
        }
        return this.jobFields;
    }

    /**
     * Gets the value of the colorControlStrips property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the colorControlStrips property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColorControlStrips().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ColorControlStrip }
     * 
     * 
     */
    public List<ColorControlStrip> getColorControlStrips() {
        if (colorControlStrips == null) {
            colorControlStrips = new ArrayList<ColorControlStrip>();
        }
        return this.colorControlStrips;
    }

    /**
     * Gets the value of the cielabMeasuringFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cielabMeasuringFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCIELABMeasuringFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CIELABMeasuringField }
     * 
     * 
     */
    public List<CIELABMeasuringField> getCIELABMeasuringFields() {
        if (cielabMeasuringFields == null) {
            cielabMeasuringFields = new ArrayList<CIELABMeasuringField>();
        }
        return this.cielabMeasuringFields;
    }

    /**
     * Gets the value of the densityMeasuringFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the densityMeasuringFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDensityMeasuringFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DensityMeasuringField }
     * 
     * 
     */
    public List<DensityMeasuringField> getDensityMeasuringFields() {
        if (densityMeasuringFields == null) {
            densityMeasuringFields = new ArrayList<DensityMeasuringField>();
        }
        return this.densityMeasuringFields;
    }

    /**
     * Gets the value of the scavengerAreas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scavengerAreas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScavengerAreas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScavengerArea }
     * 
     * 
     */
    public List<ScavengerArea> getScavengerAreas() {
        if (scavengerAreas == null) {
            scavengerAreas = new ArrayList<ScavengerArea>();
        }
        return this.scavengerAreas;
    }

    /**
     * Gets the value of the compensationCTMTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompensationCTMTemplate() {
        return compensationCTMTemplate;
    }

    /**
     * Sets the value of the compensationCTMTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompensationCTMTemplate(String value) {
        this.compensationCTMTemplate = value;
    }

    /**
     * Gets the value of the trimClipPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrimClipPath() {
        return trimClipPath;
    }

    /**
     * Sets the value of the trimClipPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrimClipPath(String value) {
        this.trimClipPath = value;
    }

    /**
     * Gets the value of the clipBox property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getClipBox() {
        return clipBox;
    }

    /**
     * Sets the value of the clipBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setClipBox(Double value) {
        this.clipBox = value;
    }

    /**
     * Gets the value of the ctms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ctms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCTMS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getCTMS() {
        if (ctms == null) {
            ctms = new ArrayList<Double>();
        }
        return this.ctms;
    }

    /**
     * Gets the value of the ordID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrdID() {
        return ordID;
    }

    /**
     * Sets the value of the ordID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrdID(Integer value) {
        this.ordID = value;
    }

    /**
     * Gets the value of the logicalStackOrd property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLogicalStackOrd() {
        return logicalStackOrd;
    }

    /**
     * Sets the value of the logicalStackOrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLogicalStackOrd(Integer value) {
        this.logicalStackOrd = value;
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
     * Gets the value of the clipBoxFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClipBoxFormat() {
        return clipBoxFormat;
    }

    /**
     * Sets the value of the clipBoxFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClipBoxFormat(String value) {
        this.clipBoxFormat = value;
    }

    /**
     * Gets the value of the trimCTMs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trimCTMs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrimCTMs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getTrimCTMs() {
        if (trimCTMs == null) {
            trimCTMs = new ArrayList<Double>();
        }
        return this.trimCTMs;
    }

    /**
     * Gets the value of the layerID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLayerID() {
        return layerID;
    }

    /**
     * Sets the value of the layerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLayerID(Integer value) {
        this.layerID = value;
    }

    /**
     * Gets the value of the sourceClipPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceClipPath() {
        return sourceClipPath;
    }

    /**
     * Sets the value of the sourceClipPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceClipPath(String value) {
        this.sourceClipPath = value;
    }

    /**
     * Gets the value of the clipBoxTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClipBoxTemplate() {
        return clipBoxTemplate;
    }

    /**
     * Sets the value of the clipBoxTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClipBoxTemplate(String value) {
        this.clipBoxTemplate = value;
    }

    /**
     * Gets the value of the clipPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClipPath() {
        return clipPath;
    }

    /**
     * Sets the value of the clipPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClipPath(String value) {
        this.clipPath = value;
    }

    /**
     * Gets the value of the contentRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getContentRef() {
        return contentRef;
    }

    /**
     * Sets the value of the contentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setContentRef(Object value) {
        this.contentRef = value;
    }

    /**
     * Gets the value of the ord property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrd() {
        return ord;
    }

    /**
     * Sets the value of the ord property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrd(Integer value) {
        this.ord = value;
    }

    /**
     * Gets the value of the trimSizes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trimSizes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrimSizes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getTrimSizes() {
        if (trimSizes == null) {
            trimSizes = new ArrayList<Double>();
        }
        return this.trimSizes;
    }

    /**
     * Gets the value of the halfTonePhaseOrigins property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the halfTonePhaseOrigins property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHalfTonePhaseOrigins().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getHalfTonePhaseOrigins() {
        if (halfTonePhaseOrigins == null) {
            halfTonePhaseOrigins = new ArrayList<Double>();
        }
        return this.halfTonePhaseOrigins;
    }

    /**
     * Gets the value of the compensationCTMFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompensationCTMFormat() {
        return compensationCTMFormat;
    }

    /**
     * Sets the value of the compensationCTMFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompensationCTMFormat(String value) {
        this.compensationCTMFormat = value;
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
