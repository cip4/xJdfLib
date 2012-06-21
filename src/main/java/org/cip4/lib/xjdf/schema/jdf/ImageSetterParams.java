
package org.cip4.lib.xjdf.schema.jdf;

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
 * <p>Java class for ImageSetterParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImageSetterParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}FitPolicy" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="TransferCurve" type="{http://www.CIP4.org/JDFSchema_2_0}TransferFunction" />
 *       &lt;attribute name="Polarity" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CenterAcross" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CutMedia" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="NonPrintableMarginLeft" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="NonPrintableMarginTop" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="MirrorAround" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NonPrintableMarginRight" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="AdvanceDistance" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="Resolution" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="ManualFeed" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="RollCut" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="SourceWorkStyle" type="{http://www.CIP4.org/JDFSchema_2_0}EnumWorkStyle" />
 *       &lt;attribute name="NonPrintableMarginBottom" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="Sides" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="BurnOutArea" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="MediaRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageSetterParams", propOrder = {
    "fitPolicies"
})
public class ImageSetterParams
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "FitPolicy")
    protected List<FitPolicy> fitPolicies;
    @XmlAttribute(name = "TransferCurve")
    protected List<Double> transferCurves;
    @XmlAttribute(name = "Polarity")
    @XmlSchemaType(name = "anySimpleType")
    protected String polarity;
    @XmlAttribute(name = "CenterAcross")
    @XmlSchemaType(name = "anySimpleType")
    protected String centerAcross;
    @XmlAttribute(name = "CutMedia")
    protected Boolean cutMedia;
    @XmlAttribute(name = "NonPrintableMarginLeft")
    protected Double nonPrintableMarginLeft;
    @XmlAttribute(name = "NonPrintableMarginTop")
    protected Double nonPrintableMarginTop;
    @XmlAttribute(name = "MirrorAround")
    @XmlSchemaType(name = "anySimpleType")
    protected String mirrorAround;
    @XmlAttribute(name = "NonPrintableMarginRight")
    protected Double nonPrintableMarginRight;
    @XmlAttribute(name = "AdvanceDistance")
    protected Double advanceDistance;
    @XmlAttribute(name = "Resolution")
    protected List<Double> resolutions;
    @XmlAttribute(name = "ManualFeed")
    protected Boolean manualFeed;
    @XmlAttribute(name = "RollCut")
    protected Double rollCut;
    @XmlAttribute(name = "SourceWorkStyle")
    protected EnumWorkStyle sourceWorkStyle;
    @XmlAttribute(name = "NonPrintableMarginBottom")
    protected Double nonPrintableMarginBottom;
    @XmlAttribute(name = "Sides")
    @XmlSchemaType(name = "anySimpleType")
    protected String sides;
    @XmlAttribute(name = "BurnOutArea")
    protected List<Double> burnOutAreas;
    @XmlAttribute(name = "MediaRef")
    @XmlIDREF
    protected Object mediaRef;

    /**
     * Gets the value of the fitPolicies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fitPolicies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFitPolicies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FitPolicy }
     * 
     * 
     */
    public List<FitPolicy> getFitPolicies() {
        if (fitPolicies == null) {
            fitPolicies = new ArrayList<FitPolicy>();
        }
        return this.fitPolicies;
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
     * {@link Double }
     * 
     * 
     */
    public List<Double> getTransferCurves() {
        if (transferCurves == null) {
            transferCurves = new ArrayList<Double>();
        }
        return this.transferCurves;
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
     * Gets the value of the centerAcross property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCenterAcross() {
        return centerAcross;
    }

    /**
     * Sets the value of the centerAcross property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCenterAcross(String value) {
        this.centerAcross = value;
    }

    /**
     * Gets the value of the cutMedia property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCutMedia() {
        return cutMedia;
    }

    /**
     * Sets the value of the cutMedia property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCutMedia(Boolean value) {
        this.cutMedia = value;
    }

    /**
     * Gets the value of the nonPrintableMarginLeft property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNonPrintableMarginLeft() {
        return nonPrintableMarginLeft;
    }

    /**
     * Sets the value of the nonPrintableMarginLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNonPrintableMarginLeft(Double value) {
        this.nonPrintableMarginLeft = value;
    }

    /**
     * Gets the value of the nonPrintableMarginTop property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNonPrintableMarginTop() {
        return nonPrintableMarginTop;
    }

    /**
     * Sets the value of the nonPrintableMarginTop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNonPrintableMarginTop(Double value) {
        this.nonPrintableMarginTop = value;
    }

    /**
     * Gets the value of the mirrorAround property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMirrorAround() {
        return mirrorAround;
    }

    /**
     * Sets the value of the mirrorAround property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMirrorAround(String value) {
        this.mirrorAround = value;
    }

    /**
     * Gets the value of the nonPrintableMarginRight property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNonPrintableMarginRight() {
        return nonPrintableMarginRight;
    }

    /**
     * Sets the value of the nonPrintableMarginRight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNonPrintableMarginRight(Double value) {
        this.nonPrintableMarginRight = value;
    }

    /**
     * Gets the value of the advanceDistance property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAdvanceDistance() {
        return advanceDistance;
    }

    /**
     * Sets the value of the advanceDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAdvanceDistance(Double value) {
        this.advanceDistance = value;
    }

    /**
     * Gets the value of the resolutions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resolutions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResolutions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getResolutions() {
        if (resolutions == null) {
            resolutions = new ArrayList<Double>();
        }
        return this.resolutions;
    }

    /**
     * Gets the value of the manualFeed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isManualFeed() {
        return manualFeed;
    }

    /**
     * Sets the value of the manualFeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setManualFeed(Boolean value) {
        this.manualFeed = value;
    }

    /**
     * Gets the value of the rollCut property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRollCut() {
        return rollCut;
    }

    /**
     * Sets the value of the rollCut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRollCut(Double value) {
        this.rollCut = value;
    }

    /**
     * Gets the value of the sourceWorkStyle property.
     * 
     * @return
     *     possible object is
     *     {@link EnumWorkStyle }
     *     
     */
    public EnumWorkStyle getSourceWorkStyle() {
        return sourceWorkStyle;
    }

    /**
     * Sets the value of the sourceWorkStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumWorkStyle }
     *     
     */
    public void setSourceWorkStyle(EnumWorkStyle value) {
        this.sourceWorkStyle = value;
    }

    /**
     * Gets the value of the nonPrintableMarginBottom property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNonPrintableMarginBottom() {
        return nonPrintableMarginBottom;
    }

    /**
     * Sets the value of the nonPrintableMarginBottom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNonPrintableMarginBottom(Double value) {
        this.nonPrintableMarginBottom = value;
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
     * Gets the value of the burnOutAreas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the burnOutAreas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBurnOutAreas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getBurnOutAreas() {
        if (burnOutAreas == null) {
            burnOutAreas = new ArrayList<Double>();
        }
        return this.burnOutAreas;
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

}
