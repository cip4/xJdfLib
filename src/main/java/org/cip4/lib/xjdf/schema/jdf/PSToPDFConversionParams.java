
package org.cip4.lib.xjdf.schema.jdf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PSToPDFConversionParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PSToPDFConversionParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;attribute name="DetectBlend" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="CompressPages" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="PDFVersion" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="DefaultRenderingIntent" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Binding" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="InitialResolution" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="Optimize" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="AutoRotatePages" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="InitialPageSize" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="ASCII85EncodePages" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="DoThumbnails" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="OverPrintMode" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="ThinPDFParamsRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="AdvancedParamsRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="PDFXParamsRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PSToPDFConversionParams")
public class PSToPDFConversionParams
    extends ParameterType
    implements Serializable
{

    @XmlAttribute(name = "DetectBlend")
    protected Boolean detectBlend;
    @XmlAttribute(name = "CompressPages")
    protected Boolean compressPages;
    @XmlAttribute(name = "PDFVersion")
    protected Double pdfVersion;
    @XmlAttribute(name = "DefaultRenderingIntent")
    @XmlSchemaType(name = "anySimpleType")
    protected String defaultRenderingIntent;
    @XmlAttribute(name = "Binding")
    @XmlSchemaType(name = "anySimpleType")
    protected String binding;
    @XmlAttribute(name = "InitialResolution")
    protected List<Double> initialResolutions;
    @XmlAttribute(name = "Optimize")
    protected Boolean optimize;
    @XmlAttribute(name = "AutoRotatePages")
    @XmlSchemaType(name = "anySimpleType")
    protected String autoRotatePages;
    @XmlAttribute(name = "InitialPageSize")
    protected List<Double> initialPageSizes;
    @XmlAttribute(name = "ASCII85EncodePages")
    protected Boolean ascii85EncodePages;
    @XmlAttribute(name = "DoThumbnails")
    protected Boolean doThumbnails;
    @XmlAttribute(name = "OverPrintMode")
    protected Integer overPrintMode;
    @XmlAttribute(name = "ThinPDFParamsRef")
    @XmlIDREF
    protected Object thinPDFParamsRef;
    @XmlAttribute(name = "AdvancedParamsRef")
    @XmlIDREF
    protected Object advancedParamsRef;
    @XmlAttribute(name = "PDFXParamsRef")
    @XmlIDREF
    protected Object pdfxParamsRef;

    /**
     * Gets the value of the detectBlend property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDetectBlend() {
        return detectBlend;
    }

    /**
     * Sets the value of the detectBlend property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDetectBlend(Boolean value) {
        this.detectBlend = value;
    }

    /**
     * Gets the value of the compressPages property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCompressPages() {
        return compressPages;
    }

    /**
     * Sets the value of the compressPages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCompressPages(Boolean value) {
        this.compressPages = value;
    }

    /**
     * Gets the value of the pdfVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPDFVersion() {
        return pdfVersion;
    }

    /**
     * Sets the value of the pdfVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPDFVersion(Double value) {
        this.pdfVersion = value;
    }

    /**
     * Gets the value of the defaultRenderingIntent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultRenderingIntent() {
        return defaultRenderingIntent;
    }

    /**
     * Sets the value of the defaultRenderingIntent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultRenderingIntent(String value) {
        this.defaultRenderingIntent = value;
    }

    /**
     * Gets the value of the binding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinding() {
        return binding;
    }

    /**
     * Sets the value of the binding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinding(String value) {
        this.binding = value;
    }

    /**
     * Gets the value of the initialResolutions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the initialResolutions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInitialResolutions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getInitialResolutions() {
        if (initialResolutions == null) {
            initialResolutions = new ArrayList<Double>();
        }
        return this.initialResolutions;
    }

    /**
     * Gets the value of the optimize property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOptimize() {
        return optimize;
    }

    /**
     * Sets the value of the optimize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOptimize(Boolean value) {
        this.optimize = value;
    }

    /**
     * Gets the value of the autoRotatePages property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoRotatePages() {
        return autoRotatePages;
    }

    /**
     * Sets the value of the autoRotatePages property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoRotatePages(String value) {
        this.autoRotatePages = value;
    }

    /**
     * Gets the value of the initialPageSizes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the initialPageSizes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInitialPageSizes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getInitialPageSizes() {
        if (initialPageSizes == null) {
            initialPageSizes = new ArrayList<Double>();
        }
        return this.initialPageSizes;
    }

    /**
     * Gets the value of the ascii85EncodePages property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isASCII85EncodePages() {
        return ascii85EncodePages;
    }

    /**
     * Sets the value of the ascii85EncodePages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setASCII85EncodePages(Boolean value) {
        this.ascii85EncodePages = value;
    }

    /**
     * Gets the value of the doThumbnails property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDoThumbnails() {
        return doThumbnails;
    }

    /**
     * Sets the value of the doThumbnails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDoThumbnails(Boolean value) {
        this.doThumbnails = value;
    }

    /**
     * Gets the value of the overPrintMode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOverPrintMode() {
        return overPrintMode;
    }

    /**
     * Sets the value of the overPrintMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOverPrintMode(Integer value) {
        this.overPrintMode = value;
    }

    /**
     * Gets the value of the thinPDFParamsRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getThinPDFParamsRef() {
        return thinPDFParamsRef;
    }

    /**
     * Sets the value of the thinPDFParamsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setThinPDFParamsRef(Object value) {
        this.thinPDFParamsRef = value;
    }

    /**
     * Gets the value of the advancedParamsRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAdvancedParamsRef() {
        return advancedParamsRef;
    }

    /**
     * Sets the value of the advancedParamsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAdvancedParamsRef(Object value) {
        this.advancedParamsRef = value;
    }

    /**
     * Gets the value of the pdfxParamsRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPDFXParamsRef() {
        return pdfxParamsRef;
    }

    /**
     * Sets the value of the pdfxParamsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPDFXParamsRef(Object value) {
        this.pdfxParamsRef = value;
    }

}
