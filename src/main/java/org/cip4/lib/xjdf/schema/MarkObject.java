
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for MarkObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarkObject">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}PlacedObject">
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
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarkObject", propOrder = {
    "scavengerArea",
    "densityMeasuringField",
    "cielabMeasuringField",
    "colorControlStrip",
    "jobField",
    "registerMark",
    "dynamicField",
    "cutMark",
    "deviceMark",
    "refAnchor",
    "markActivation"
})
public class MarkObject
    extends PlacedObject
    implements Serializable
{

    @XmlElement(name = "ScavengerArea")
    protected List<ScavengerArea> scavengerArea;
    @XmlElement(name = "DensityMeasuringField")
    protected List<DensityMeasuringField> densityMeasuringField;
    @XmlElement(name = "CIELABMeasuringField")
    protected List<CIELABMeasuringField> cielabMeasuringField;
    @XmlElement(name = "ColorControlStrip")
    protected List<ColorControlStrip> colorControlStrip;
    @XmlElement(name = "JobField")
    protected List<JobField> jobField;
    @XmlElement(name = "RegisterMark")
    protected List<RegisterMark> registerMark;
    @XmlElement(name = "DynamicField")
    protected List<DynamicField> dynamicField;
    @XmlElement(name = "CutMark")
    protected List<CutMark> cutMark;
    @XmlElement(name = "DeviceMark")
    protected List<DeviceMark> deviceMark;
    @XmlElement(name = "RefAnchor")
    protected List<RefAnchor> refAnchor;
    @XmlElement(name = "MarkActivation")
    protected List<MarkActivation> markActivation;
    @XmlAttribute(name = "CompensationCTMTemplate")
    protected String compensationCTMTemplate;
    @XmlAttribute(name = "TrimClipPath")
    protected String trimClipPath;
    @XmlAttribute(name = "ClipBox")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.Rectangle.class)
    protected org.cip4.lib.xjdf.type.Rectangle clipBox;
    @XmlAttribute(name = "OrdID")
    protected Integer ordID;
    @XmlAttribute(name = "LogicalStackOrd")
    protected Integer logicalStackOrd;
    @XmlAttribute(name = "Anchor")
    protected EnumAnchor anchor;
    @XmlAttribute(name = "ClipBoxFormat")
    protected String clipBoxFormat;
    @XmlAttribute(name = "TrimCTM")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.Matrix.class)
    protected org.cip4.lib.xjdf.type.Matrix trimCTM;
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
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.XYPair.class)
    protected org.cip4.lib.xjdf.type.XYPair trimSize;
    @XmlAttribute(name = "HalfTonePhaseOrigin")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.XYPair.class)
    protected org.cip4.lib.xjdf.type.XYPair halfTonePhaseOrigin;
    @XmlAttribute(name = "CompensationCTMFormat")
    protected String compensationCTMFormat;
    @XmlAttribute(name = "IdentificationFieldRef")
    @XmlIDREF
    protected Object identificationFieldRef;

    /**
     * Gets the value of the scavengerArea property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scavengerArea property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScavengerArea().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScavengerArea }
     * 
     * 
     */
    public List<ScavengerArea> getScavengerArea() {
        if (scavengerArea == null) {
            scavengerArea = new ArrayList<ScavengerArea>();
        }
        return this.scavengerArea;
    }

    /**
     * Gets the value of the densityMeasuringField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the densityMeasuringField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDensityMeasuringField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DensityMeasuringField }
     * 
     * 
     */
    public List<DensityMeasuringField> getDensityMeasuringField() {
        if (densityMeasuringField == null) {
            densityMeasuringField = new ArrayList<DensityMeasuringField>();
        }
        return this.densityMeasuringField;
    }

    /**
     * Gets the value of the cielabMeasuringField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cielabMeasuringField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCIELABMeasuringField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CIELABMeasuringField }
     * 
     * 
     */
    public List<CIELABMeasuringField> getCIELABMeasuringField() {
        if (cielabMeasuringField == null) {
            cielabMeasuringField = new ArrayList<CIELABMeasuringField>();
        }
        return this.cielabMeasuringField;
    }

    /**
     * Gets the value of the colorControlStrip property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the colorControlStrip property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColorControlStrip().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ColorControlStrip }
     * 
     * 
     */
    public List<ColorControlStrip> getColorControlStrip() {
        if (colorControlStrip == null) {
            colorControlStrip = new ArrayList<ColorControlStrip>();
        }
        return this.colorControlStrip;
    }

    /**
     * Gets the value of the jobField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobField }
     * 
     * 
     */
    public List<JobField> getJobField() {
        if (jobField == null) {
            jobField = new ArrayList<JobField>();
        }
        return this.jobField;
    }

    /**
     * Gets the value of the registerMark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registerMark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegisterMark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegisterMark }
     * 
     * 
     */
    public List<RegisterMark> getRegisterMark() {
        if (registerMark == null) {
            registerMark = new ArrayList<RegisterMark>();
        }
        return this.registerMark;
    }

    /**
     * Gets the value of the dynamicField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dynamicField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDynamicField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DynamicField }
     * 
     * 
     */
    public List<DynamicField> getDynamicField() {
        if (dynamicField == null) {
            dynamicField = new ArrayList<DynamicField>();
        }
        return this.dynamicField;
    }

    /**
     * Gets the value of the cutMark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cutMark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCutMark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CutMark }
     * 
     * 
     */
    public List<CutMark> getCutMark() {
        if (cutMark == null) {
            cutMark = new ArrayList<CutMark>();
        }
        return this.cutMark;
    }

    /**
     * Gets the value of the deviceMark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deviceMark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeviceMark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceMark }
     * 
     * 
     */
    public List<DeviceMark> getDeviceMark() {
        if (deviceMark == null) {
            deviceMark = new ArrayList<DeviceMark>();
        }
        return this.deviceMark;
    }

    /**
     * Gets the value of the refAnchor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refAnchor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefAnchor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RefAnchor }
     * 
     * 
     */
    public List<RefAnchor> getRefAnchor() {
        if (refAnchor == null) {
            refAnchor = new ArrayList<RefAnchor>();
        }
        return this.refAnchor;
    }

    /**
     * Gets the value of the markActivation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the markActivation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarkActivation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarkActivation }
     * 
     * 
     */
    public List<MarkActivation> getMarkActivation() {
        if (markActivation == null) {
            markActivation = new ArrayList<MarkActivation>();
        }
        return this.markActivation;
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
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.Rectangle getClipBox() {
        return clipBox;
    }

    /**
     * Sets the value of the clipBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClipBox(org.cip4.lib.xjdf.type.Rectangle value) {
        this.clipBox = value;
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
     * Gets the value of the trimCTM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.Matrix getTrimCTM() {
        return trimCTM;
    }

    /**
     * Sets the value of the trimCTM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrimCTM(org.cip4.lib.xjdf.type.Matrix value) {
        this.trimCTM = value;
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
     * Gets the value of the trimSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.XYPair getTrimSize() {
        return trimSize;
    }

    /**
     * Sets the value of the trimSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrimSize(org.cip4.lib.xjdf.type.XYPair value) {
        this.trimSize = value;
    }

    /**
     * Gets the value of the halfTonePhaseOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.XYPair getHalfTonePhaseOrigin() {
        return halfTonePhaseOrigin;
    }

    /**
     * Sets the value of the halfTonePhaseOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHalfTonePhaseOrigin(org.cip4.lib.xjdf.type.XYPair value) {
        this.halfTonePhaseOrigin = value;
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
