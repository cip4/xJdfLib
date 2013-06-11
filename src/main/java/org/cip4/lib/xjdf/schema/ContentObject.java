
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ContentObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContentObject">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}PlacedObject">
 *       &lt;attribute name="CompensationCTMTemplate" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="OrdExpression" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
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
 *       &lt;attribute name="SetOrd" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="Ord" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="DocOrd" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="TrimSize" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="HalfTonePhaseOrigin" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="CompensationCTMFormat" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentObject")
public class ContentObject
    extends PlacedObject
    implements Serializable
{

    @XmlAttribute(name = "CompensationCTMTemplate")
    protected String compensationCTMTemplate;
    @XmlAttribute(name = "OrdExpression")
    protected String ordExpression;
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
    @XmlAttribute(name = "SetOrd")
    protected Integer setOrd;
    @XmlAttribute(name = "Ord")
    protected Integer ord;
    @XmlAttribute(name = "DocOrd")
    protected Integer docOrd;
    @XmlAttribute(name = "TrimSize")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.XYPair.class)
    protected org.cip4.lib.xjdf.type.XYPair trimSize;
    @XmlAttribute(name = "HalfTonePhaseOrigin")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.XYPair.class)
    protected org.cip4.lib.xjdf.type.XYPair halfTonePhaseOrigin;
    @XmlAttribute(name = "CompensationCTMFormat")
    protected String compensationCTMFormat;

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
     * Gets the value of the ordExpression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdExpression() {
        return ordExpression;
    }

    /**
     * Sets the value of the ordExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdExpression(String value) {
        this.ordExpression = value;
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
     * Gets the value of the setOrd property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSetOrd() {
        return setOrd;
    }

    /**
     * Sets the value of the setOrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSetOrd(Integer value) {
        this.setOrd = value;
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
     * Gets the value of the docOrd property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDocOrd() {
        return docOrd;
    }

    /**
     * Sets the value of the docOrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDocOrd(Integer value) {
        this.docOrd = value;
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

}
