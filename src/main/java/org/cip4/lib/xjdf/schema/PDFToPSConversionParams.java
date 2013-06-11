
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for PDFToPSConversionParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PDFToPSConversionParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;attribute name="IncludeProcSets" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="IgnoreTTFontsFirst" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="IgnoreTransfers" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="IgnoreColorSeps" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="ShrinkToFit" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="SuppressRotate" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="OutputType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="UseFontAliasNames" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="IgnoreSeparableImagesOnly" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="SetPageSize" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="PSLevel" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="IncludeOtherResources" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="IgnoreOverprint" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="IncludeTrueTypeFonts" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="GeneratePageStreams" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="IncludeType1Fonts" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CenterCropBox" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="IncludeType3Fonts" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="BoundingBox" type="{http://www.CIP4.org/JDFSchema_2_0}rectangle" />
 *       &lt;attribute name="TTasT42" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="IgnoreBG" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="IgnoreHalftones" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="SuppressCenter" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="IgnoreExternStreamRef" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="Scale" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="IncludeBaseFonts" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="IncludeCIDFonts" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="IncludeEmbeddedFonts" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="IgnoreDSC" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="SetupProcsets" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="IgnoreAnnotForms" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="BinaryOK" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="IgnoreShowPage" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="IgnoreRawData" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="IgnoreUCR" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="IgnorePageRotation" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PDFToPSConversionParams")
public class PDFToPSConversionParams
    extends ParameterType
    implements Serializable
{

    @XmlAttribute(name = "IncludeProcSets")
    @XmlSchemaType(name = "anySimpleType")
    protected String includeProcSets;
    @XmlAttribute(name = "IgnoreTTFontsFirst")
    protected Boolean ignoreTTFontsFirst;
    @XmlAttribute(name = "IgnoreTransfers")
    protected Boolean ignoreTransfers;
    @XmlAttribute(name = "IgnoreColorSeps")
    protected Boolean ignoreColorSeps;
    @XmlAttribute(name = "ShrinkToFit")
    protected Boolean shrinkToFit;
    @XmlAttribute(name = "SuppressRotate")
    protected Boolean suppressRotate;
    @XmlAttribute(name = "OutputType")
    @XmlSchemaType(name = "anySimpleType")
    protected String outputType;
    @XmlAttribute(name = "UseFontAliasNames")
    protected Boolean useFontAliasNames;
    @XmlAttribute(name = "IgnoreSeparableImagesOnly")
    protected Boolean ignoreSeparableImagesOnly;
    @XmlAttribute(name = "SetPageSize")
    protected Boolean setPageSize;
    @XmlAttribute(name = "PSLevel")
    protected Integer psLevel;
    @XmlAttribute(name = "IncludeOtherResources")
    @XmlSchemaType(name = "anySimpleType")
    protected String includeOtherResources;
    @XmlAttribute(name = "IgnoreOverprint")
    protected Boolean ignoreOverprint;
    @XmlAttribute(name = "IncludeTrueTypeFonts")
    @XmlSchemaType(name = "anySimpleType")
    protected String includeTrueTypeFonts;
    @XmlAttribute(name = "GeneratePageStreams")
    protected Boolean generatePageStreams;
    @XmlAttribute(name = "IncludeType1Fonts")
    @XmlSchemaType(name = "anySimpleType")
    protected String includeType1Fonts;
    @XmlAttribute(name = "CenterCropBox")
    protected Boolean centerCropBox;
    @XmlAttribute(name = "IncludeType3Fonts")
    @XmlSchemaType(name = "anySimpleType")
    protected String includeType3Fonts;
    @XmlAttribute(name = "BoundingBox")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.Rectangle.class)
    protected org.cip4.lib.xjdf.type.Rectangle boundingBox;
    @XmlAttribute(name = "TTasT42")
    protected Boolean tTasT42;
    @XmlAttribute(name = "IgnoreBG")
    protected Boolean ignoreBG;
    @XmlAttribute(name = "IgnoreHalftones")
    protected Boolean ignoreHalftones;
    @XmlAttribute(name = "SuppressCenter")
    protected Boolean suppressCenter;
    @XmlAttribute(name = "IgnoreExternStreamRef")
    protected Boolean ignoreExternStreamRef;
    @XmlAttribute(name = "Scale")
    protected Double scale;
    @XmlAttribute(name = "IncludeBaseFonts")
    @XmlSchemaType(name = "anySimpleType")
    protected String includeBaseFonts;
    @XmlAttribute(name = "IncludeCIDFonts")
    @XmlSchemaType(name = "anySimpleType")
    protected String includeCIDFonts;
    @XmlAttribute(name = "IncludeEmbeddedFonts")
    @XmlSchemaType(name = "anySimpleType")
    protected String includeEmbeddedFonts;
    @XmlAttribute(name = "IgnoreDSC")
    protected Boolean ignoreDSC;
    @XmlAttribute(name = "SetupProcsets")
    protected Boolean setupProcsets;
    @XmlAttribute(name = "IgnoreAnnotForms")
    protected Boolean ignoreAnnotForms;
    @XmlAttribute(name = "BinaryOK")
    protected Boolean binaryOK;
    @XmlAttribute(name = "IgnoreShowPage")
    protected Boolean ignoreShowPage;
    @XmlAttribute(name = "IgnoreRawData")
    protected Boolean ignoreRawData;
    @XmlAttribute(name = "IgnoreUCR")
    protected Boolean ignoreUCR;
    @XmlAttribute(name = "IgnorePageRotation")
    protected Boolean ignorePageRotation;

    /**
     * Gets the value of the includeProcSets property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludeProcSets() {
        return includeProcSets;
    }

    /**
     * Sets the value of the includeProcSets property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludeProcSets(String value) {
        this.includeProcSets = value;
    }

    /**
     * Gets the value of the ignoreTTFontsFirst property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreTTFontsFirst() {
        return ignoreTTFontsFirst;
    }

    /**
     * Sets the value of the ignoreTTFontsFirst property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreTTFontsFirst(Boolean value) {
        this.ignoreTTFontsFirst = value;
    }

    /**
     * Gets the value of the ignoreTransfers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreTransfers() {
        return ignoreTransfers;
    }

    /**
     * Sets the value of the ignoreTransfers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreTransfers(Boolean value) {
        this.ignoreTransfers = value;
    }

    /**
     * Gets the value of the ignoreColorSeps property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreColorSeps() {
        return ignoreColorSeps;
    }

    /**
     * Sets the value of the ignoreColorSeps property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreColorSeps(Boolean value) {
        this.ignoreColorSeps = value;
    }

    /**
     * Gets the value of the shrinkToFit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShrinkToFit() {
        return shrinkToFit;
    }

    /**
     * Sets the value of the shrinkToFit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShrinkToFit(Boolean value) {
        this.shrinkToFit = value;
    }

    /**
     * Gets the value of the suppressRotate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuppressRotate() {
        return suppressRotate;
    }

    /**
     * Sets the value of the suppressRotate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuppressRotate(Boolean value) {
        this.suppressRotate = value;
    }

    /**
     * Gets the value of the outputType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputType() {
        return outputType;
    }

    /**
     * Sets the value of the outputType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputType(String value) {
        this.outputType = value;
    }

    /**
     * Gets the value of the useFontAliasNames property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseFontAliasNames() {
        return useFontAliasNames;
    }

    /**
     * Sets the value of the useFontAliasNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseFontAliasNames(Boolean value) {
        this.useFontAliasNames = value;
    }

    /**
     * Gets the value of the ignoreSeparableImagesOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreSeparableImagesOnly() {
        return ignoreSeparableImagesOnly;
    }

    /**
     * Sets the value of the ignoreSeparableImagesOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreSeparableImagesOnly(Boolean value) {
        this.ignoreSeparableImagesOnly = value;
    }

    /**
     * Gets the value of the setPageSize property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSetPageSize() {
        return setPageSize;
    }

    /**
     * Sets the value of the setPageSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSetPageSize(Boolean value) {
        this.setPageSize = value;
    }

    /**
     * Gets the value of the psLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPSLevel() {
        return psLevel;
    }

    /**
     * Sets the value of the psLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPSLevel(Integer value) {
        this.psLevel = value;
    }

    /**
     * Gets the value of the includeOtherResources property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludeOtherResources() {
        return includeOtherResources;
    }

    /**
     * Sets the value of the includeOtherResources property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludeOtherResources(String value) {
        this.includeOtherResources = value;
    }

    /**
     * Gets the value of the ignoreOverprint property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreOverprint() {
        return ignoreOverprint;
    }

    /**
     * Sets the value of the ignoreOverprint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreOverprint(Boolean value) {
        this.ignoreOverprint = value;
    }

    /**
     * Gets the value of the includeTrueTypeFonts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludeTrueTypeFonts() {
        return includeTrueTypeFonts;
    }

    /**
     * Sets the value of the includeTrueTypeFonts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludeTrueTypeFonts(String value) {
        this.includeTrueTypeFonts = value;
    }

    /**
     * Gets the value of the generatePageStreams property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGeneratePageStreams() {
        return generatePageStreams;
    }

    /**
     * Sets the value of the generatePageStreams property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGeneratePageStreams(Boolean value) {
        this.generatePageStreams = value;
    }

    /**
     * Gets the value of the includeType1Fonts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludeType1Fonts() {
        return includeType1Fonts;
    }

    /**
     * Sets the value of the includeType1Fonts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludeType1Fonts(String value) {
        this.includeType1Fonts = value;
    }

    /**
     * Gets the value of the centerCropBox property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCenterCropBox() {
        return centerCropBox;
    }

    /**
     * Sets the value of the centerCropBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCenterCropBox(Boolean value) {
        this.centerCropBox = value;
    }

    /**
     * Gets the value of the includeType3Fonts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludeType3Fonts() {
        return includeType3Fonts;
    }

    /**
     * Sets the value of the includeType3Fonts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludeType3Fonts(String value) {
        this.includeType3Fonts = value;
    }

    /**
     * Gets the value of the boundingBox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.Rectangle getBoundingBox() {
        return boundingBox;
    }

    /**
     * Sets the value of the boundingBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoundingBox(org.cip4.lib.xjdf.type.Rectangle value) {
        this.boundingBox = value;
    }

    /**
     * Gets the value of the tTasT42 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTTasT42() {
        return tTasT42;
    }

    /**
     * Sets the value of the tTasT42 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTTasT42(Boolean value) {
        this.tTasT42 = value;
    }

    /**
     * Gets the value of the ignoreBG property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreBG() {
        return ignoreBG;
    }

    /**
     * Sets the value of the ignoreBG property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreBG(Boolean value) {
        this.ignoreBG = value;
    }

    /**
     * Gets the value of the ignoreHalftones property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreHalftones() {
        return ignoreHalftones;
    }

    /**
     * Sets the value of the ignoreHalftones property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreHalftones(Boolean value) {
        this.ignoreHalftones = value;
    }

    /**
     * Gets the value of the suppressCenter property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuppressCenter() {
        return suppressCenter;
    }

    /**
     * Sets the value of the suppressCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuppressCenter(Boolean value) {
        this.suppressCenter = value;
    }

    /**
     * Gets the value of the ignoreExternStreamRef property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreExternStreamRef() {
        return ignoreExternStreamRef;
    }

    /**
     * Sets the value of the ignoreExternStreamRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreExternStreamRef(Boolean value) {
        this.ignoreExternStreamRef = value;
    }

    /**
     * Gets the value of the scale property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getScale() {
        return scale;
    }

    /**
     * Sets the value of the scale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setScale(Double value) {
        this.scale = value;
    }

    /**
     * Gets the value of the includeBaseFonts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludeBaseFonts() {
        return includeBaseFonts;
    }

    /**
     * Sets the value of the includeBaseFonts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludeBaseFonts(String value) {
        this.includeBaseFonts = value;
    }

    /**
     * Gets the value of the includeCIDFonts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludeCIDFonts() {
        return includeCIDFonts;
    }

    /**
     * Sets the value of the includeCIDFonts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludeCIDFonts(String value) {
        this.includeCIDFonts = value;
    }

    /**
     * Gets the value of the includeEmbeddedFonts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludeEmbeddedFonts() {
        return includeEmbeddedFonts;
    }

    /**
     * Sets the value of the includeEmbeddedFonts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludeEmbeddedFonts(String value) {
        this.includeEmbeddedFonts = value;
    }

    /**
     * Gets the value of the ignoreDSC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreDSC() {
        return ignoreDSC;
    }

    /**
     * Sets the value of the ignoreDSC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreDSC(Boolean value) {
        this.ignoreDSC = value;
    }

    /**
     * Gets the value of the setupProcsets property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSetupProcsets() {
        return setupProcsets;
    }

    /**
     * Sets the value of the setupProcsets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSetupProcsets(Boolean value) {
        this.setupProcsets = value;
    }

    /**
     * Gets the value of the ignoreAnnotForms property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreAnnotForms() {
        return ignoreAnnotForms;
    }

    /**
     * Sets the value of the ignoreAnnotForms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreAnnotForms(Boolean value) {
        this.ignoreAnnotForms = value;
    }

    /**
     * Gets the value of the binaryOK property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBinaryOK() {
        return binaryOK;
    }

    /**
     * Sets the value of the binaryOK property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBinaryOK(Boolean value) {
        this.binaryOK = value;
    }

    /**
     * Gets the value of the ignoreShowPage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreShowPage() {
        return ignoreShowPage;
    }

    /**
     * Sets the value of the ignoreShowPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreShowPage(Boolean value) {
        this.ignoreShowPage = value;
    }

    /**
     * Gets the value of the ignoreRawData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreRawData() {
        return ignoreRawData;
    }

    /**
     * Sets the value of the ignoreRawData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreRawData(Boolean value) {
        this.ignoreRawData = value;
    }

    /**
     * Gets the value of the ignoreUCR property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreUCR() {
        return ignoreUCR;
    }

    /**
     * Sets the value of the ignoreUCR property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreUCR(Boolean value) {
        this.ignoreUCR = value;
    }

    /**
     * Gets the value of the ignorePageRotation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnorePageRotation() {
        return ignorePageRotation;
    }

    /**
     * Sets the value of the ignorePageRotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnorePageRotation(Boolean value) {
        this.ignorePageRotation = value;
    }

}
