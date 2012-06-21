
package org.cip4.lib.xjdf.schema.jdf;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConventionalPrintingParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConventionalPrintingParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;attribute name="WorkStyle" type="{http://www.CIP4.org/JDFSchema_2_0}EnumWorkStyle" />
 *       &lt;attribute name="ModuleDrying" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="MediaLocation" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="NonPrintableMarginLeft" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="Speed" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="DirectProof" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="NonPrintableMarginTop" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="NonPrintableMarginRight" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="Drying" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="SheetLay" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PrintingTechnology" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PerfectingModule" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="FountainSolution" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PrintingType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NonPrintableMarginBottom" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="FirstSurface" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Powder" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="ApprovalParamsRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConventionalPrintingParams")
public class ConventionalPrintingParams
    extends ParameterType
    implements Serializable
{

    @XmlAttribute(name = "WorkStyle")
    protected EnumWorkStyle workStyle;
    @XmlAttribute(name = "ModuleDrying")
    @XmlSchemaType(name = "anySimpleType")
    protected String moduleDrying;
    @XmlAttribute(name = "MediaLocation")
    protected String mediaLocation;
    @XmlAttribute(name = "NonPrintableMarginLeft")
    protected Double nonPrintableMarginLeft;
    @XmlAttribute(name = "Speed")
    protected Double speed;
    @XmlAttribute(name = "DirectProof")
    protected Boolean directProof;
    @XmlAttribute(name = "NonPrintableMarginTop")
    protected Double nonPrintableMarginTop;
    @XmlAttribute(name = "NonPrintableMarginRight")
    protected Double nonPrintableMarginRight;
    @XmlAttribute(name = "Drying")
    @XmlSchemaType(name = "anySimpleType")
    protected String drying;
    @XmlAttribute(name = "SheetLay")
    @XmlSchemaType(name = "anySimpleType")
    protected String sheetLay;
    @XmlAttribute(name = "PrintingTechnology")
    @XmlSchemaType(name = "anySimpleType")
    protected String printingTechnology;
    @XmlAttribute(name = "PerfectingModule")
    protected Integer perfectingModule;
    @XmlAttribute(name = "FountainSolution")
    @XmlSchemaType(name = "anySimpleType")
    protected String fountainSolution;
    @XmlAttribute(name = "PrintingType")
    @XmlSchemaType(name = "anySimpleType")
    protected String printingType;
    @XmlAttribute(name = "NonPrintableMarginBottom")
    protected Double nonPrintableMarginBottom;
    @XmlAttribute(name = "FirstSurface")
    @XmlSchemaType(name = "anySimpleType")
    protected String firstSurface;
    @XmlAttribute(name = "Powder")
    protected Double powder;
    @XmlAttribute(name = "ApprovalParamsRef")
    @XmlIDREF
    protected Object approvalParamsRef;

    /**
     * Gets the value of the workStyle property.
     * 
     * @return
     *     possible object is
     *     {@link EnumWorkStyle }
     *     
     */
    public EnumWorkStyle getWorkStyle() {
        return workStyle;
    }

    /**
     * Sets the value of the workStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumWorkStyle }
     *     
     */
    public void setWorkStyle(EnumWorkStyle value) {
        this.workStyle = value;
    }

    /**
     * Gets the value of the moduleDrying property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModuleDrying() {
        return moduleDrying;
    }

    /**
     * Sets the value of the moduleDrying property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModuleDrying(String value) {
        this.moduleDrying = value;
    }

    /**
     * Gets the value of the mediaLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaLocation() {
        return mediaLocation;
    }

    /**
     * Sets the value of the mediaLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaLocation(String value) {
        this.mediaLocation = value;
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
     * Gets the value of the speed property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSpeed() {
        return speed;
    }

    /**
     * Sets the value of the speed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSpeed(Double value) {
        this.speed = value;
    }

    /**
     * Gets the value of the directProof property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDirectProof() {
        return directProof;
    }

    /**
     * Sets the value of the directProof property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDirectProof(Boolean value) {
        this.directProof = value;
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
     * Gets the value of the drying property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrying() {
        return drying;
    }

    /**
     * Sets the value of the drying property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrying(String value) {
        this.drying = value;
    }

    /**
     * Gets the value of the sheetLay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSheetLay() {
        return sheetLay;
    }

    /**
     * Sets the value of the sheetLay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSheetLay(String value) {
        this.sheetLay = value;
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
     * Gets the value of the perfectingModule property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPerfectingModule() {
        return perfectingModule;
    }

    /**
     * Sets the value of the perfectingModule property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPerfectingModule(Integer value) {
        this.perfectingModule = value;
    }

    /**
     * Gets the value of the fountainSolution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFountainSolution() {
        return fountainSolution;
    }

    /**
     * Sets the value of the fountainSolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFountainSolution(String value) {
        this.fountainSolution = value;
    }

    /**
     * Gets the value of the printingType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintingType() {
        return printingType;
    }

    /**
     * Sets the value of the printingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintingType(String value) {
        this.printingType = value;
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
     * Gets the value of the firstSurface property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstSurface() {
        return firstSurface;
    }

    /**
     * Sets the value of the firstSurface property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstSurface(String value) {
        this.firstSurface = value;
    }

    /**
     * Gets the value of the powder property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPowder() {
        return powder;
    }

    /**
     * Sets the value of the powder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPowder(Double value) {
        this.powder = value;
    }

    /**
     * Gets the value of the approvalParamsRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getApprovalParamsRef() {
        return approvalParamsRef;
    }

    /**
     * Sets the value of the approvalParamsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setApprovalParamsRef(Object value) {
        this.approvalParamsRef = value;
    }

}
