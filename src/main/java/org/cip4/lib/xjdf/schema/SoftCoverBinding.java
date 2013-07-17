
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
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
 *       &lt;attribute name="Scoring" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="GlueProcedure" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="FoldingWidthBack" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="SpineLevelling" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="SpineSanding" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="SpineFiberRoughing" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="SpineNotching" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="SpineBrushing" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="EndSheets" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="BlockThreadSewing" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="FoldingWidth" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
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
@XmlType(name = "")
@XmlRootElement(name = "SoftCoverBinding")
public class SoftCoverBinding
    implements Serializable
{

    @XmlAttribute(name = "Scoring")
    @XmlSchemaType(name = "anySimpleType")
    protected String scoring;
    @XmlAttribute(name = "GlueProcedure")
    @XmlSchemaType(name = "anySimpleType")
    protected String glueProcedure;
    @XmlAttribute(name = "FoldingWidthBack")
    protected Double foldingWidthBack;
    @XmlAttribute(name = "SpineLevelling")
    protected Boolean spineLevelling;
    @XmlAttribute(name = "SpineSanding")
    protected Boolean spineSanding;
    @XmlAttribute(name = "SpineFiberRoughing")
    protected Boolean spineFiberRoughing;
    @XmlAttribute(name = "SpineNotching")
    protected Boolean spineNotching;
    @XmlAttribute(name = "SpineBrushing")
    protected Boolean spineBrushing;
    @XmlAttribute(name = "EndSheets")
    protected Boolean endSheets;
    @XmlAttribute(name = "BlockThreadSewing")
    protected Boolean blockThreadSewing;
    @XmlAttribute(name = "FoldingWidth")
    protected Double foldingWidth;
    @XmlAttribute(name = "SpineGlue")
    @XmlSchemaType(name = "anySimpleType")
    protected String spineGlue;
    @XmlAttribute(name = "SpineShredding")
    protected Boolean spineShredding;
    @XmlAttribute(name = "SpineMilling")
    protected Boolean spineMilling;

    /**
     * Gets the value of the scoring property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoring() {
        return scoring;
    }

    /**
     * Sets the value of the scoring property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoring(String value) {
        this.scoring = value;
    }

    /**
     * Gets the value of the glueProcedure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlueProcedure() {
        return glueProcedure;
    }

    /**
     * Sets the value of the glueProcedure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlueProcedure(String value) {
        this.glueProcedure = value;
    }

    /**
     * Gets the value of the foldingWidthBack property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFoldingWidthBack() {
        return foldingWidthBack;
    }

    /**
     * Sets the value of the foldingWidthBack property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFoldingWidthBack(Double value) {
        this.foldingWidthBack = value;
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
     * Gets the value of the foldingWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFoldingWidth() {
        return foldingWidth;
    }

    /**
     * Sets the value of the foldingWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFoldingWidth(Double value) {
        this.foldingWidth = value;
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
