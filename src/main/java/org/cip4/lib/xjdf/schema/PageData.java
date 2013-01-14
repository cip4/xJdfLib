
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}PageElement" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="IsBlank" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="JobID" type="{http://www.CIP4.org/JDFSchema_2_0}shortString" />
 *       &lt;attribute name="PageLabelSuffix" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="FoldOutPages" type="{http://www.CIP4.org/JDFSchema_2_0}IntegerList" />
 *       &lt;attribute name="SourceTrimBox" type="{http://www.CIP4.org/JDFSchema_2_0}rectangle" />
 *       &lt;attribute name="CatalogDetails" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="PageLabel" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="PageStatus" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="AssemblyIDs" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKENS" />
 *       &lt;attribute name="CatalogID" type="{http://www.CIP4.org/JDFSchema_2_0}shortString" />
 *       &lt;attribute name="HasBleeds" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="PageFormat" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="SourceClipBox" type="{http://www.CIP4.org/JDFSchema_2_0}rectangle" />
 *       &lt;attribute name="PageIndex" type="{http://www.CIP4.org/JDFSchema_2_0}IntegerRangeList" />
 *       &lt;attribute name="PageLabelPrefix" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="IsTrapped" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="IsPrintable" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="ProductID" type="{http://www.CIP4.org/JDFSchema_2_0}shortString" />
 *       &lt;attribute name="SourceBleedBox" type="{http://www.CIP4.org/JDFSchema_2_0}rectangle" />
 *       &lt;attribute name="ElementColorParamsRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="ImageCompressionParamsRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="ScreeningParamsRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="SeparationNames" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKENS" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pageElement"
})
@XmlRootElement(name = "PageData")
public class PageData
    implements Serializable
{

    @XmlElement(name = "PageElement")
    protected List<PageElement> pageElement;
    @XmlAttribute(name = "IsBlank")
    protected Boolean isBlank;
    @XmlAttribute(name = "JobID")
    protected String jobID;
    @XmlAttribute(name = "PageLabelSuffix")
    protected String pageLabelSuffix;
    @XmlAttribute(name = "FoldOutPages")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IntegerList.class)
    protected org.cip4.lib.xjdf.type.IntegerList foldOutPages;
    @XmlAttribute(name = "SourceTrimBox")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.Rectangle.class)
    protected org.cip4.lib.xjdf.type.Rectangle sourceTrimBox;
    @XmlAttribute(name = "CatalogDetails")
    protected String catalogDetails;
    @XmlAttribute(name = "PageLabel")
    protected String pageLabel;
    @XmlAttribute(name = "PageStatus")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String pageStatus;
    @XmlAttribute(name = "AssemblyIDs")
    protected List<String> assemblyIDs;
    @XmlAttribute(name = "CatalogID")
    protected String catalogID;
    @XmlAttribute(name = "HasBleeds")
    protected Boolean hasBleeds;
    @XmlAttribute(name = "PageFormat")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String pageFormat;
    @XmlAttribute(name = "SourceClipBox")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.Rectangle.class)
    protected org.cip4.lib.xjdf.type.Rectangle sourceClipBox;
    @XmlAttribute(name = "PageIndex")
    protected Integer pageIndex;
    @XmlAttribute(name = "PageLabelPrefix")
    protected String pageLabelPrefix;
    @XmlAttribute(name = "IsTrapped")
    protected Boolean isTrapped;
    @XmlAttribute(name = "IsPrintable")
    protected Boolean isPrintable;
    @XmlAttribute(name = "ProductID")
    protected String productID;
    @XmlAttribute(name = "SourceBleedBox")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.Rectangle.class)
    protected org.cip4.lib.xjdf.type.Rectangle sourceBleedBox;
    @XmlAttribute(name = "ElementColorParamsRef")
    @XmlIDREF
    protected Object elementColorParamsRef;
    @XmlAttribute(name = "ImageCompressionParamsRef")
    @XmlIDREF
    protected Object imageCompressionParamsRef;
    @XmlAttribute(name = "ScreeningParamsRef")
    @XmlIDREF
    protected Object screeningParamsRef;
    @XmlAttribute(name = "SeparationNames")
    protected List<String> separationNames;

    /**
     * Gets the value of the pageElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pageElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPageElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PageElement }
     * 
     * 
     */
    public List<PageElement> getPageElement() {
        if (pageElement == null) {
            pageElement = new ArrayList<PageElement>();
        }
        return this.pageElement;
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
     * Gets the value of the foldOutPages property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.IntegerList getFoldOutPages() {
        return foldOutPages;
    }

    /**
     * Sets the value of the foldOutPages property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoldOutPages(org.cip4.lib.xjdf.type.IntegerList value) {
        this.foldOutPages = value;
    }

    /**
     * Gets the value of the sourceTrimBox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.Rectangle getSourceTrimBox() {
        return sourceTrimBox;
    }

    /**
     * Sets the value of the sourceTrimBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceTrimBox(org.cip4.lib.xjdf.type.Rectangle value) {
        this.sourceTrimBox = value;
    }

    /**
     * Gets the value of the catalogDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogDetails() {
        return catalogDetails;
    }

    /**
     * Sets the value of the catalogDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogDetails(String value) {
        this.catalogDetails = value;
    }

    /**
     * Gets the value of the pageLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageLabel() {
        return pageLabel;
    }

    /**
     * Sets the value of the pageLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageLabel(String value) {
        this.pageLabel = value;
    }

    /**
     * Gets the value of the pageStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageStatus() {
        return pageStatus;
    }

    /**
     * Sets the value of the pageStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageStatus(String value) {
        this.pageStatus = value;
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
     * Gets the value of the catalogID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogID() {
        return catalogID;
    }

    /**
     * Sets the value of the catalogID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogID(String value) {
        this.catalogID = value;
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
     * Gets the value of the pageFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageFormat() {
        return pageFormat;
    }

    /**
     * Sets the value of the pageFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageFormat(String value) {
        this.pageFormat = value;
    }

    /**
     * Gets the value of the sourceClipBox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.Rectangle getSourceClipBox() {
        return sourceClipBox;
    }

    /**
     * Sets the value of the sourceClipBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceClipBox(org.cip4.lib.xjdf.type.Rectangle value) {
        this.sourceClipBox = value;
    }

    /**
     * Gets the value of the pageIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageIndex() {
        return pageIndex;
    }

    /**
     * Sets the value of the pageIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageIndex(Integer value) {
        this.pageIndex = value;
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
     * Gets the value of the productID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductID() {
        return productID;
    }

    /**
     * Sets the value of the productID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductID(String value) {
        this.productID = value;
    }

    /**
     * Gets the value of the sourceBleedBox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.Rectangle getSourceBleedBox() {
        return sourceBleedBox;
    }

    /**
     * Sets the value of the sourceBleedBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceBleedBox(org.cip4.lib.xjdf.type.Rectangle value) {
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
