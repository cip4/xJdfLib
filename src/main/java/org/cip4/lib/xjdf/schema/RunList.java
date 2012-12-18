
package org.cip4.lib.xjdf.schema;

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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for RunList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RunList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}MetadataMap" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}InsertSheet" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Disposition" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ByteMap" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}FileSpec" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}InterpretedPDLData" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Dependencies" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="Directory" type="{http://www.CIP4.org/JDFSchema_2_0}URL" />
 *       &lt;attribute name="Sets" type="{http://www.CIP4.org/JDFSchema_2_0}IntegerRangeList" />
 *       &lt;attribute name="SetCopies" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="SheetSides" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="LogicalPage" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="NPage" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="IgnoreContext" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKENS" />
 *       &lt;attribute name="Sorted" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="Docs" type="{http://www.CIP4.org/JDFSchema_2_0}IntegerRangeList" />
 *       &lt;attribute name="EndOfSet" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="PageListIndex" type="{http://www.CIP4.org/JDFSchema_2_0}IntegerRangeList" />
 *       &lt;attribute name="Pages" type="{http://www.CIP4.org/JDFSchema_2_0}IntegerRangeList" />
 *       &lt;attribute name="PageCopies" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="FirstPage" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="SkipPage" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="DocNames" type="{http://www.CIP4.org/JDFSchema_2_0}NameRangeList" />
 *       &lt;attribute name="RunTag" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="EndOfBundleItem" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="IsPage" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="SetNames" type="{http://www.CIP4.org/JDFSchema_2_0}NameRangeList" />
 *       &lt;attribute name="EndOfDocument" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="PageNames" type="{http://www.CIP4.org/JDFSchema_2_0}NameRangeList" />
 *       &lt;attribute name="PageListRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="IsBlank" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="IgnorePDLCopies" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="SetLevel" type="{http://www.CIP4.org/JDFSchema_2_0}XPath" />
 *       &lt;attribute name="SourceTrimBox" type="{http://www.CIP4.org/JDFSchema_2_0}rectangle" />
 *       &lt;attribute name="SourceMediaBox" type="{http://www.CIP4.org/JDFSchema_2_0}rectangle" />
 *       &lt;attribute name="ContentDataRefs" type="{http://www.CIP4.org/JDFSchema_2_0}IDREFS" />
 *       &lt;attribute name="IgnorePDLImposition" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="ElementType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ClipPath" type="{http://www.CIP4.org/JDFSchema_2_0}PDFPath" />
 *       &lt;attribute name="HasBleeds" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="SourceClipBox" type="{http://www.CIP4.org/JDFSchema_2_0}rectangle" />
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
@XmlType(name = "RunList", propOrder = {
    "metadataMap",
    "insertSheet",
    "disposition",
    "byteMap",
    "fileSpec",
    "interpretedPDLData",
    "dependencies"
})
public class RunList
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "MetadataMap")
    protected MetadataMap metadataMap;
    @XmlElement(name = "InsertSheet")
    protected InsertSheet insertSheet;
    @XmlElement(name = "Disposition")
    protected Disposition disposition;
    @XmlElement(name = "ByteMap")
    protected ByteMap byteMap;
    @XmlElement(name = "FileSpec")
    protected FileSpec fileSpec;
    @XmlElement(name = "InterpretedPDLData")
    protected InterpretedPDLData interpretedPDLData;
    @XmlElement(name = "Dependencies")
    protected Dependencies dependencies;
    @XmlAttribute(name = "Directory")
    protected String directory;
    @XmlAttribute(name = "Sets")
    protected Integer sets;
    @XmlAttribute(name = "SetCopies")
    protected Integer setCopies;
    @XmlAttribute(name = "SheetSides")
    @XmlSchemaType(name = "anySimpleType")
    protected String sheetSides;
    @XmlAttribute(name = "LogicalPage")
    protected Integer logicalPage;
    @XmlAttribute(name = "NPage")
    protected Integer nPage;
    @XmlAttribute(name = "IgnoreContext")
    protected List<String> ignoreContext;
    @XmlAttribute(name = "Sorted")
    protected Boolean sorted;
    @XmlAttribute(name = "Docs")
    protected Integer docs;
    @XmlAttribute(name = "EndOfSet")
    protected Boolean endOfSet;
    @XmlAttribute(name = "PageListIndex")
    protected Integer pageListIndex;
    @XmlAttribute(name = "Pages")
    protected Integer pages;
    @XmlAttribute(name = "PageCopies")
    protected Integer pageCopies;
    @XmlAttribute(name = "FirstPage")
    protected Integer firstPage;
    @XmlAttribute(name = "SkipPage")
    protected Integer skipPage;
    @XmlAttribute(name = "DocNames")
    protected String docNames;
    @XmlAttribute(name = "RunTag")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String runTag;
    @XmlAttribute(name = "EndOfBundleItem")
    protected Boolean endOfBundleItem;
    @XmlAttribute(name = "IsPage")
    protected Boolean isPage;
    @XmlAttribute(name = "SetNames")
    protected String setNames;
    @XmlAttribute(name = "EndOfDocument")
    protected Boolean endOfDocument;
    @XmlAttribute(name = "PageNames")
    protected String pageNames;
    @XmlAttribute(name = "PageListRef")
    @XmlIDREF
    protected Object pageListRef;
    @XmlAttribute(name = "IsBlank")
    protected Boolean isBlank;
    @XmlAttribute(name = "IgnorePDLCopies")
    protected Boolean ignorePDLCopies;
    @XmlAttribute(name = "SetLevel")
    protected String setLevel;
    @XmlAttribute(name = "SourceTrimBox")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.Rectangle.class)
    protected org.cip4.lib.xjdf.type.Rectangle sourceTrimBox;
    @XmlAttribute(name = "SourceMediaBox")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.Rectangle.class)
    protected org.cip4.lib.xjdf.type.Rectangle sourceMediaBox;
    @XmlAttribute(name = "ContentDataRefs")
    @XmlIDREF
    protected List<Object> contentDataRefs;
    @XmlAttribute(name = "IgnorePDLImposition")
    protected Boolean ignorePDLImposition;
    @XmlAttribute(name = "ElementType")
    @XmlSchemaType(name = "anySimpleType")
    protected String elementType;
    @XmlAttribute(name = "ClipPath")
    protected String clipPath;
    @XmlAttribute(name = "HasBleeds")
    protected Boolean hasBleeds;
    @XmlAttribute(name = "SourceClipBox")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.Rectangle.class)
    protected org.cip4.lib.xjdf.type.Rectangle sourceClipBox;
    @XmlAttribute(name = "IsTrapped")
    protected Boolean isTrapped;
    @XmlAttribute(name = "IsPrintable")
    protected Boolean isPrintable;
    @XmlAttribute(name = "SourceBleedBox")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.Rectangle.class)
    protected org.cip4.lib.xjdf.type.Rectangle sourceBleedBox;
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
     * Gets the value of the metadataMap property.
     * 
     * @return
     *     possible object is
     *     {@link MetadataMap }
     *     
     */
    public MetadataMap getMetadataMap() {
        return metadataMap;
    }

    /**
     * Sets the value of the metadataMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataMap }
     *     
     */
    public void setMetadataMap(MetadataMap value) {
        this.metadataMap = value;
    }

    /**
     * Gets the value of the insertSheet property.
     * 
     * @return
     *     possible object is
     *     {@link InsertSheet }
     *     
     */
    public InsertSheet getInsertSheet() {
        return insertSheet;
    }

    /**
     * Sets the value of the insertSheet property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsertSheet }
     *     
     */
    public void setInsertSheet(InsertSheet value) {
        this.insertSheet = value;
    }

    /**
     * Gets the value of the disposition property.
     * 
     * @return
     *     possible object is
     *     {@link Disposition }
     *     
     */
    public Disposition getDisposition() {
        return disposition;
    }

    /**
     * Sets the value of the disposition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Disposition }
     *     
     */
    public void setDisposition(Disposition value) {
        this.disposition = value;
    }

    /**
     * Gets the value of the byteMap property.
     * 
     * @return
     *     possible object is
     *     {@link ByteMap }
     *     
     */
    public ByteMap getByteMap() {
        return byteMap;
    }

    /**
     * Sets the value of the byteMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link ByteMap }
     *     
     */
    public void setByteMap(ByteMap value) {
        this.byteMap = value;
    }

    /**
     * Gets the value of the fileSpec property.
     * 
     * @return
     *     possible object is
     *     {@link FileSpec }
     *     
     */
    public FileSpec getFileSpec() {
        return fileSpec;
    }

    /**
     * Sets the value of the fileSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileSpec }
     *     
     */
    public void setFileSpec(FileSpec value) {
        this.fileSpec = value;
    }

    /**
     * Gets the value of the interpretedPDLData property.
     * 
     * @return
     *     possible object is
     *     {@link InterpretedPDLData }
     *     
     */
    public InterpretedPDLData getInterpretedPDLData() {
        return interpretedPDLData;
    }

    /**
     * Sets the value of the interpretedPDLData property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterpretedPDLData }
     *     
     */
    public void setInterpretedPDLData(InterpretedPDLData value) {
        this.interpretedPDLData = value;
    }

    /**
     * Gets the value of the dependencies property.
     * 
     * @return
     *     possible object is
     *     {@link Dependencies }
     *     
     */
    public Dependencies getDependencies() {
        return dependencies;
    }

    /**
     * Sets the value of the dependencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dependencies }
     *     
     */
    public void setDependencies(Dependencies value) {
        this.dependencies = value;
    }

    /**
     * Gets the value of the directory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectory() {
        return directory;
    }

    /**
     * Sets the value of the directory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectory(String value) {
        this.directory = value;
    }

    /**
     * Gets the value of the sets property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSets() {
        return sets;
    }

    /**
     * Sets the value of the sets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSets(Integer value) {
        this.sets = value;
    }

    /**
     * Gets the value of the setCopies property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSetCopies() {
        return setCopies;
    }

    /**
     * Sets the value of the setCopies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSetCopies(Integer value) {
        this.setCopies = value;
    }

    /**
     * Gets the value of the sheetSides property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSheetSides() {
        return sheetSides;
    }

    /**
     * Sets the value of the sheetSides property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSheetSides(String value) {
        this.sheetSides = value;
    }

    /**
     * Gets the value of the logicalPage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLogicalPage() {
        return logicalPage;
    }

    /**
     * Sets the value of the logicalPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLogicalPage(Integer value) {
        this.logicalPage = value;
    }

    /**
     * Gets the value of the nPage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNPage() {
        return nPage;
    }

    /**
     * Sets the value of the nPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNPage(Integer value) {
        this.nPage = value;
    }

    /**
     * Gets the value of the ignoreContext property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ignoreContext property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIgnoreContext().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIgnoreContext() {
        if (ignoreContext == null) {
            ignoreContext = new ArrayList<String>();
        }
        return this.ignoreContext;
    }

    /**
     * Gets the value of the sorted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSorted() {
        return sorted;
    }

    /**
     * Sets the value of the sorted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSorted(Boolean value) {
        this.sorted = value;
    }

    /**
     * Gets the value of the docs property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDocs() {
        return docs;
    }

    /**
     * Sets the value of the docs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDocs(Integer value) {
        this.docs = value;
    }

    /**
     * Gets the value of the endOfSet property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEndOfSet() {
        return endOfSet;
    }

    /**
     * Sets the value of the endOfSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEndOfSet(Boolean value) {
        this.endOfSet = value;
    }

    /**
     * Gets the value of the pageListIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageListIndex() {
        return pageListIndex;
    }

    /**
     * Sets the value of the pageListIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageListIndex(Integer value) {
        this.pageListIndex = value;
    }

    /**
     * Gets the value of the pages property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPages() {
        return pages;
    }

    /**
     * Sets the value of the pages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPages(Integer value) {
        this.pages = value;
    }

    /**
     * Gets the value of the pageCopies property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageCopies() {
        return pageCopies;
    }

    /**
     * Sets the value of the pageCopies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageCopies(Integer value) {
        this.pageCopies = value;
    }

    /**
     * Gets the value of the firstPage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFirstPage() {
        return firstPage;
    }

    /**
     * Sets the value of the firstPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFirstPage(Integer value) {
        this.firstPage = value;
    }

    /**
     * Gets the value of the skipPage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSkipPage() {
        return skipPage;
    }

    /**
     * Sets the value of the skipPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSkipPage(Integer value) {
        this.skipPage = value;
    }

    /**
     * Gets the value of the docNames property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocNames() {
        return docNames;
    }

    /**
     * Sets the value of the docNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocNames(String value) {
        this.docNames = value;
    }

    /**
     * Gets the value of the runTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRunTag() {
        return runTag;
    }

    /**
     * Sets the value of the runTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRunTag(String value) {
        this.runTag = value;
    }

    /**
     * Gets the value of the endOfBundleItem property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEndOfBundleItem() {
        return endOfBundleItem;
    }

    /**
     * Sets the value of the endOfBundleItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEndOfBundleItem(Boolean value) {
        this.endOfBundleItem = value;
    }

    /**
     * Gets the value of the isPage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPage() {
        return isPage;
    }

    /**
     * Sets the value of the isPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPage(Boolean value) {
        this.isPage = value;
    }

    /**
     * Gets the value of the setNames property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSetNames() {
        return setNames;
    }

    /**
     * Sets the value of the setNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSetNames(String value) {
        this.setNames = value;
    }

    /**
     * Gets the value of the endOfDocument property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEndOfDocument() {
        return endOfDocument;
    }

    /**
     * Sets the value of the endOfDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEndOfDocument(Boolean value) {
        this.endOfDocument = value;
    }

    /**
     * Gets the value of the pageNames property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageNames() {
        return pageNames;
    }

    /**
     * Sets the value of the pageNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageNames(String value) {
        this.pageNames = value;
    }

    /**
     * Gets the value of the pageListRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPageListRef() {
        return pageListRef;
    }

    /**
     * Sets the value of the pageListRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPageListRef(Object value) {
        this.pageListRef = value;
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
     * Gets the value of the ignorePDLCopies property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnorePDLCopies() {
        return ignorePDLCopies;
    }

    /**
     * Sets the value of the ignorePDLCopies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnorePDLCopies(Boolean value) {
        this.ignorePDLCopies = value;
    }

    /**
     * Gets the value of the setLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSetLevel() {
        return setLevel;
    }

    /**
     * Sets the value of the setLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSetLevel(String value) {
        this.setLevel = value;
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
     * Gets the value of the sourceMediaBox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.Rectangle getSourceMediaBox() {
        return sourceMediaBox;
    }

    /**
     * Sets the value of the sourceMediaBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceMediaBox(org.cip4.lib.xjdf.type.Rectangle value) {
        this.sourceMediaBox = value;
    }

    /**
     * Gets the value of the contentDataRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contentDataRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContentDataRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getContentDataRefs() {
        if (contentDataRefs == null) {
            contentDataRefs = new ArrayList<Object>();
        }
        return this.contentDataRefs;
    }

    /**
     * Gets the value of the ignorePDLImposition property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnorePDLImposition() {
        return ignorePDLImposition;
    }

    /**
     * Sets the value of the ignorePDLImposition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnorePDLImposition(Boolean value) {
        this.ignorePDLImposition = value;
    }

    /**
     * Gets the value of the elementType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElementType() {
        return elementType;
    }

    /**
     * Sets the value of the elementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElementType(String value) {
        this.elementType = value;
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
