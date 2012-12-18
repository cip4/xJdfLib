
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}RegisterRibbon" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="TightBacking" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="HeadBandColor" type="{http://www.CIP4.org/JDFSchema_2_0}EnumNamedColor" />
 *       &lt;attribute name="HeadBandColorDetails" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="Thickness" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="JapanBind" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="SpineLevelling" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="SpineSanding" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="Jacket" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="SpineFiberRoughing" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="CoverStyle" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="HeadBands" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="SpineNotching" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="SpineBrushing" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="EndSheets" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="StripMaterial" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="BlockThreadSewing" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="JacketFoldingWidth" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="SpineGlue" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="SpineShredding" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="SpineMilling" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "registerRibbon"
})
@XmlRootElement(name = "HardCoverBinding")
public class HardCoverBinding
    implements Serializable
{

    @XmlElement(name = "RegisterRibbon")
    protected List<RegisterRibbon> registerRibbon;
    @XmlAttribute(name = "TightBacking")
    @XmlSchemaType(name = "anySimpleType")
    protected String tightBacking;
    @XmlAttribute(name = "HeadBandColor")
    protected EnumNamedColor headBandColor;
    @XmlAttribute(name = "HeadBandColorDetails")
    protected String headBandColorDetails;
    @XmlAttribute(name = "Thickness")
    protected Double thickness;
    @XmlAttribute(name = "JapanBind")
    protected Boolean japanBind;
    @XmlAttribute(name = "SpineLevelling")
    protected Boolean spineLevelling;
    @XmlAttribute(name = "SpineSanding")
    protected Boolean spineSanding;
    @XmlAttribute(name = "Jacket")
    @XmlSchemaType(name = "anySimpleType")
    protected String jacket;
    @XmlAttribute(name = "SpineFiberRoughing")
    protected Boolean spineFiberRoughing;
    @XmlAttribute(name = "CoverStyle")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String coverStyle;
    @XmlAttribute(name = "HeadBands")
    protected Boolean headBands;
    @XmlAttribute(name = "SpineNotching")
    protected Boolean spineNotching;
    @XmlAttribute(name = "SpineBrushing")
    protected Boolean spineBrushing;
    @XmlAttribute(name = "EndSheets")
    protected Boolean endSheets;
    @XmlAttribute(name = "StripMaterial")
    @XmlSchemaType(name = "anySimpleType")
    protected String stripMaterial;
    @XmlAttribute(name = "BlockThreadSewing")
    protected Boolean blockThreadSewing;
    @XmlAttribute(name = "JacketFoldingWidth")
    protected Double jacketFoldingWidth;
    @XmlAttribute(name = "SpineGlue")
    @XmlSchemaType(name = "anySimpleType")
    protected String spineGlue;
    @XmlAttribute(name = "SpineShredding")
    protected Boolean spineShredding;
    @XmlAttribute(name = "SpineMilling")
    protected Boolean spineMilling;

    /**
     * Gets the value of the registerRibbon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registerRibbon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegisterRibbon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegisterRibbon }
     * 
     * 
     */
    public List<RegisterRibbon> getRegisterRibbon() {
        if (registerRibbon == null) {
            registerRibbon = new ArrayList<RegisterRibbon>();
        }
        return this.registerRibbon;
    }

    /**
     * Gets the value of the tightBacking property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTightBacking() {
        return tightBacking;
    }

    /**
     * Sets the value of the tightBacking property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTightBacking(String value) {
        this.tightBacking = value;
    }

    /**
     * Gets the value of the headBandColor property.
     * 
     * @return
     *     possible object is
     *     {@link EnumNamedColor }
     *     
     */
    public EnumNamedColor getHeadBandColor() {
        return headBandColor;
    }

    /**
     * Sets the value of the headBandColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumNamedColor }
     *     
     */
    public void setHeadBandColor(EnumNamedColor value) {
        this.headBandColor = value;
    }

    /**
     * Gets the value of the headBandColorDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeadBandColorDetails() {
        return headBandColorDetails;
    }

    /**
     * Sets the value of the headBandColorDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeadBandColorDetails(String value) {
        this.headBandColorDetails = value;
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
     * Gets the value of the japanBind property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isJapanBind() {
        return japanBind;
    }

    /**
     * Sets the value of the japanBind property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setJapanBind(Boolean value) {
        this.japanBind = value;
    }

    /**
     * Gets the value of the spineLevelling property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSpineLevelling() {
        return spineLevelling;
    }

    /**
     * Sets the value of the spineLevelling property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSpineLevelling(Boolean value) {
        this.spineLevelling = value;
    }

    /**
     * Gets the value of the spineSanding property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSpineSanding() {
        return spineSanding;
    }

    /**
     * Sets the value of the spineSanding property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSpineSanding(Boolean value) {
        this.spineSanding = value;
    }

    /**
     * Gets the value of the jacket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJacket() {
        return jacket;
    }

    /**
     * Sets the value of the jacket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJacket(String value) {
        this.jacket = value;
    }

    /**
     * Gets the value of the spineFiberRoughing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSpineFiberRoughing() {
        return spineFiberRoughing;
    }

    /**
     * Sets the value of the spineFiberRoughing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSpineFiberRoughing(Boolean value) {
        this.spineFiberRoughing = value;
    }

    /**
     * Gets the value of the coverStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoverStyle() {
        return coverStyle;
    }

    /**
     * Sets the value of the coverStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverStyle(String value) {
        this.coverStyle = value;
    }

    /**
     * Gets the value of the headBands property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHeadBands() {
        return headBands;
    }

    /**
     * Sets the value of the headBands property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHeadBands(Boolean value) {
        this.headBands = value;
    }

    /**
     * Gets the value of the spineNotching property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSpineNotching() {
        return spineNotching;
    }

    /**
     * Sets the value of the spineNotching property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSpineNotching(Boolean value) {
        this.spineNotching = value;
    }

    /**
     * Gets the value of the spineBrushing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSpineBrushing() {
        return spineBrushing;
    }

    /**
     * Sets the value of the spineBrushing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSpineBrushing(Boolean value) {
        this.spineBrushing = value;
    }

    /**
     * Gets the value of the endSheets property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEndSheets() {
        return endSheets;
    }

    /**
     * Sets the value of the endSheets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEndSheets(Boolean value) {
        this.endSheets = value;
    }

    /**
     * Gets the value of the stripMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStripMaterial() {
        return stripMaterial;
    }

    /**
     * Sets the value of the stripMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStripMaterial(String value) {
        this.stripMaterial = value;
    }

    /**
     * Gets the value of the blockThreadSewing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBlockThreadSewing() {
        return blockThreadSewing;
    }

    /**
     * Sets the value of the blockThreadSewing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBlockThreadSewing(Boolean value) {
        this.blockThreadSewing = value;
    }

    /**
     * Gets the value of the jacketFoldingWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getJacketFoldingWidth() {
        return jacketFoldingWidth;
    }

    /**
     * Sets the value of the jacketFoldingWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setJacketFoldingWidth(Double value) {
        this.jacketFoldingWidth = value;
    }

    /**
     * Gets the value of the spineGlue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpineGlue() {
        return spineGlue;
    }

    /**
     * Sets the value of the spineGlue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpineGlue(String value) {
        this.spineGlue = value;
    }

    /**
     * Gets the value of the spineShredding property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSpineShredding() {
        return spineShredding;
    }

    /**
     * Sets the value of the spineShredding property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSpineShredding(Boolean value) {
        this.spineShredding = value;
    }

    /**
     * Gets the value of the spineMilling property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSpineMilling() {
        return spineMilling;
    }

    /**
     * Sets the value of the spineMilling property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSpineMilling(Boolean value) {
        this.spineMilling = value;
    }

}
