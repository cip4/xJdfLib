
package org.cip4.lib.xjdf.schema.jdf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PageList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PageList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}PageData" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Assembly" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="IsBlank" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="JobID" type="{http://www.CIP4.org/JDFSchema_2_0}shortString" />
 *       &lt;attribute name="PageLabelSuffix" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="SourceTrimBox" type="{http://www.CIP4.org/JDFSchema_2_0}rectangle" />
 *       &lt;attribute name="AssemblyIDs" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKENS" />
 *       &lt;attribute name="HasBleeds" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="SourceClipBox" type="{http://www.CIP4.org/JDFSchema_2_0}rectangle" />
 *       &lt;attribute name="PageLabelPrefix" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="IsTrapped" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="IsPrintable" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="SourceBleedBox" type="{http://www.CIP4.org/JDFSchema_2_0}rectangle" />
 *       &lt;attribute name="ElementColorParamsRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="ContentListRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="ImageCompressionParamsRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="ColorRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="ScreeningParamsRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="SeparationNames" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKENS" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PageList", propOrder = {
    "assemblies",
    "pageDatas"
})
public class PageList
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "Assembly")
    protected List<Assembly> assemblies;
    @XmlElement(name = "PageData")
    protected List<PageData> pageDatas;
    @XmlAttribute(name = "IsBlank")
    protected Boolean isBlank;
    @XmlAttribute(name = "JobID")
    protected String jobID;
    @XmlAttribute(name = "PageLabelSuffix")
    protected String pageLabelSuffix;
    @XmlAttribute(name = "SourceTrimBox")
    protected Double sourceTrimBox;
    @XmlAttribute(name = "AssemblyIDs")
    protected List<String> assemblyIDs;
    @XmlAttribute(name = "HasBleeds")
    protected Boolean hasBleeds;
    @XmlAttribute(name = "SourceClipBox")
    protected Double sourceClipBox;
    @XmlAttribute(name = "PageLabelPrefix")
    protected String pageLabelPrefix;
    @XmlAttribute(name = "IsTrapped")
    protected Boolean isTrapped;
    @XmlAttribute(name = "IsPrintable")
    protected Boolean isPrintable;
    @XmlAttribute(name = "SourceBleedBox")
    protected Double sourceBleedBox;
    @XmlAttribute(name = "ElementColorParamsRef")
    @XmlIDREF
    protected Object elementColorParamsRef;
    @XmlAttribute(name = "ContentListRef")
    @XmlIDREF
    protected Object contentListRef;
    @XmlAttribute(name = "ImageCompressionParamsRef")
    @XmlIDREF
    protected Object imageCompressionParamsRef;
    @XmlAttribute(name = "ColorRef")
    @XmlIDREF
    protected Object colorRef;
    @XmlAttribute(name = "ScreeningParamsRef")
    @XmlIDREF
    protected Object screeningParamsRef;
    @XmlAttribute(name = "SeparationNames")
    protected List<String> separationNames;

    /**
     * Gets the value of the assemblies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assemblies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssemblies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Assembly }
     * 
     * 
     */
    public List<Assembly> getAssemblies() {
        if (assemblies == null) {
            assemblies = new ArrayList<Assembly>();
        }
        return this.assemblies;
    }

    /**
     * Gets the value of the pageDatas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pageDatas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPageDatas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PageData }
     * 
     * 
     */
    public List<PageData> getPageDatas() {
        if (pageDatas == null) {
            pageDatas = new ArrayList<PageData>();
        }
        return this.pageDatas;
    }

    /**
     * Gets the value of the isBlank property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsBlank() {
        return isBlank;
    }

    /**
     * Sets the value of the isBlank property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsBlank(Boolean value) {
        this.isBlank = value;
    }

    /**
     * Gets the value of the jobID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobID() {
        return jobID;
    }

    /**
     * Sets the value of the jobID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobID(String value) {
        this.jobID = value;
    }

    /**
     * Gets the value of the pageLabelSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageLabelSuffix() {
        return pageLabelSuffix;
    }

    /**
     * Sets the value of the pageLabelSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageLabelSuffix(String value) {
        this.pageLabelSuffix = value;
    }

    /**
     * Gets the value of the sourceTrimBox property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSourceTrimBox() {
        return sourceTrimBox;
    }

    /**
     * Sets the value of the sourceTrimBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSourceTrimBox(Double value) {
        this.sourceTrimBox = value;
    }

    /**
     * Gets the value of the assemblyIDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assemblyIDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssemblyIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAssemblyIDs() {
        if (assemblyIDs == null) {
            assemblyIDs = new ArrayList<String>();
        }
        return this.assemblyIDs;
    }

    /**
     * Gets the value of the hasBleeds property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasBleeds() {
        return hasBleeds;
    }

    /**
     * Sets the value of the hasBleeds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasBleeds(Boolean value) {
        this.hasBleeds = value;
    }

    /**
     * Gets the value of the sourceClipBox property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSourceClipBox() {
        return sourceClipBox;
    }

    /**
     * Sets the value of the sourceClipBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSourceClipBox(Double value) {
        this.sourceClipBox = value;
    }

    /**
     * Gets the value of the pageLabelPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageLabelPrefix() {
        return pageLabelPrefix;
    }

    /**
     * Sets the value of the pageLabelPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageLabelPrefix(String value) {
        this.pageLabelPrefix = value;
    }

    /**
     * Gets the value of the isTrapped property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTrapped() {
        return isTrapped;
    }

    /**
     * Sets the value of the isTrapped property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTrapped(Boolean value) {
        this.isTrapped = value;
    }

    /**
     * Gets the value of the isPrintable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPrintable() {
        return isPrintable;
    }

    /**
     * Sets the value of the isPrintable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPrintable(Boolean value) {
        this.isPrintable = value;
    }

    /**
     * Gets the value of the sourceBleedBox property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSourceBleedBox() {
        return sourceBleedBox;
    }

    /**
     * Sets the value of the sourceBleedBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSourceBleedBox(Double value) {
        this.sourceBleedBox = value;
    }

    /**
     * Gets the value of the elementColorParamsRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getElementColorParamsRef() {
        return elementColorParamsRef;
    }

    /**
     * Sets the value of the elementColorParamsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setElementColorParamsRef(Object value) {
        this.elementColorParamsRef = value;
    }

    /**
     * Gets the value of the contentListRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getContentListRef() {
        return contentListRef;
    }

    /**
     * Sets the value of the contentListRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setContentListRef(Object value) {
        this.contentListRef = value;
    }

    /**
     * Gets the value of the imageCompressionParamsRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getImageCompressionParamsRef() {
        return imageCompressionParamsRef;
    }

    /**
     * Sets the value of the imageCompressionParamsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setImageCompressionParamsRef(Object value) {
        this.imageCompressionParamsRef = value;
    }

    /**
     * Gets the value of the colorRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getColorRef() {
        return colorRef;
    }

    /**
     * Sets the value of the colorRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setColorRef(Object value) {
        this.colorRef = value;
    }

    /**
     * Gets the value of the screeningParamsRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getScreeningParamsRef() {
        return screeningParamsRef;
    }

    /**
     * Sets the value of the screeningParamsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setScreeningParamsRef(Object value) {
        this.screeningParamsRef = value;
    }

    /**
     * Gets the value of the separationNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the separationNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeparationNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSeparationNames() {
        if (separationNames == null) {
            separationNames = new ArrayList<String>();
        }
        return this.separationNames;
    }

}
