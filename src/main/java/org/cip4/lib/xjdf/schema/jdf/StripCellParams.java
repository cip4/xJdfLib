
package org.cip4.lib.xjdf.schema.jdf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *       &lt;attribute name="MaskSeparation" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="CutWidthFoot" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="TrimFoot" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="FrontOverfold" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="BleedFoot" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="Spine" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="Mask" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="BleedHead" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="BleedFace" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="TrimHead" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="TrimFace" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="MillingDepth" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="CutWidthHead" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="BackOverfold" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="Creep" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="TrimSize" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="MaskBleed" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="Sides" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="BleedSpine" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "StripCellParams")
public class StripCellParams
    implements Serializable
{

    @XmlAttribute(name = "MaskSeparation")
    protected String maskSeparation;
    @XmlAttribute(name = "CutWidthFoot")
    protected Double cutWidthFoot;
    @XmlAttribute(name = "TrimFoot")
    protected Double trimFoot;
    @XmlAttribute(name = "FrontOverfold")
    protected Double frontOverfold;
    @XmlAttribute(name = "BleedFoot")
    protected Double bleedFoot;
    @XmlAttribute(name = "Spine")
    protected Double spine;
    @XmlAttribute(name = "Mask")
    @XmlSchemaType(name = "anySimpleType")
    protected String mask;
    @XmlAttribute(name = "BleedHead")
    protected Double bleedHead;
    @XmlAttribute(name = "BleedFace")
    protected Double bleedFace;
    @XmlAttribute(name = "TrimHead")
    protected Double trimHead;
    @XmlAttribute(name = "TrimFace")
    protected Double trimFace;
    @XmlAttribute(name = "MillingDepth")
    protected Double millingDepth;
    @XmlAttribute(name = "CutWidthHead")
    protected Double cutWidthHead;
    @XmlAttribute(name = "BackOverfold")
    protected Double backOverfold;
    @XmlAttribute(name = "Creep")
    protected List<Double> creeps;
    @XmlAttribute(name = "TrimSize")
    protected List<Double> trimSizes;
    @XmlAttribute(name = "MaskBleed")
    protected Double maskBleed;
    @XmlAttribute(name = "Sides")
    @XmlSchemaType(name = "anySimpleType")
    protected String sides;
    @XmlAttribute(name = "BleedSpine")
    protected Double bleedSpine;

    /**
     * Gets the value of the maskSeparation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaskSeparation() {
        return maskSeparation;
    }

    /**
     * Sets the value of the maskSeparation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaskSeparation(String value) {
        this.maskSeparation = value;
    }

    /**
     * Gets the value of the cutWidthFoot property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCutWidthFoot() {
        return cutWidthFoot;
    }

    /**
     * Sets the value of the cutWidthFoot property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCutWidthFoot(Double value) {
        this.cutWidthFoot = value;
    }

    /**
     * Gets the value of the trimFoot property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTrimFoot() {
        return trimFoot;
    }

    /**
     * Sets the value of the trimFoot property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTrimFoot(Double value) {
        this.trimFoot = value;
    }

    /**
     * Gets the value of the frontOverfold property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFrontOverfold() {
        return frontOverfold;
    }

    /**
     * Sets the value of the frontOverfold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFrontOverfold(Double value) {
        this.frontOverfold = value;
    }

    /**
     * Gets the value of the bleedFoot property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBleedFoot() {
        return bleedFoot;
    }

    /**
     * Sets the value of the bleedFoot property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBleedFoot(Double value) {
        this.bleedFoot = value;
    }

    /**
     * Gets the value of the spine property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSpine() {
        return spine;
    }

    /**
     * Sets the value of the spine property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSpine(Double value) {
        this.spine = value;
    }

    /**
     * Gets the value of the mask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMask() {
        return mask;
    }

    /**
     * Sets the value of the mask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMask(String value) {
        this.mask = value;
    }

    /**
     * Gets the value of the bleedHead property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBleedHead() {
        return bleedHead;
    }

    /**
     * Sets the value of the bleedHead property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBleedHead(Double value) {
        this.bleedHead = value;
    }

    /**
     * Gets the value of the bleedFace property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBleedFace() {
        return bleedFace;
    }

    /**
     * Sets the value of the bleedFace property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBleedFace(Double value) {
        this.bleedFace = value;
    }

    /**
     * Gets the value of the trimHead property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTrimHead() {
        return trimHead;
    }

    /**
     * Sets the value of the trimHead property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTrimHead(Double value) {
        this.trimHead = value;
    }

    /**
     * Gets the value of the trimFace property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTrimFace() {
        return trimFace;
    }

    /**
     * Sets the value of the trimFace property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTrimFace(Double value) {
        this.trimFace = value;
    }

    /**
     * Gets the value of the millingDepth property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMillingDepth() {
        return millingDepth;
    }

    /**
     * Sets the value of the millingDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMillingDepth(Double value) {
        this.millingDepth = value;
    }

    /**
     * Gets the value of the cutWidthHead property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCutWidthHead() {
        return cutWidthHead;
    }

    /**
     * Sets the value of the cutWidthHead property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCutWidthHead(Double value) {
        this.cutWidthHead = value;
    }

    /**
     * Gets the value of the backOverfold property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBackOverfold() {
        return backOverfold;
    }

    /**
     * Sets the value of the backOverfold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBackOverfold(Double value) {
        this.backOverfold = value;
    }

    /**
     * Gets the value of the creeps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creeps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreeps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getCreeps() {
        if (creeps == null) {
            creeps = new ArrayList<Double>();
        }
        return this.creeps;
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
     * Gets the value of the maskBleed property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaskBleed() {
        return maskBleed;
    }

    /**
     * Sets the value of the maskBleed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaskBleed(Double value) {
        this.maskBleed = value;
    }

    /**
     * Gets the value of the sides property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSides() {
        return sides;
    }

    /**
     * Sets the value of the sides property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSides(String value) {
        this.sides = value;
    }

    /**
     * Gets the value of the bleedSpine property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBleedSpine() {
        return bleedSpine;
    }

    /**
     * Sets the value of the bleedSpine property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBleedSpine(Double value) {
        this.bleedSpine = value;
    }

}
