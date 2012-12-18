
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
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ContentObject" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}TransferCurvePool" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}InsertSheet" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}PageCondition" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}LayerList" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}MarkObject" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="Locked" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="PipeURL" type="{http://www.CIP4.org/JDFSchema_2_0}URL" />
 *       &lt;attribute name="Class" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PartIDKeys">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.CIP4.org/JDFSchema_2_0}EnumPartIDKeys" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="PipeProtocol" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="SheetCountReset" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PipeID" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="OrdsConsumed" type="{http://www.CIP4.org/JDFSchema_2_0}IntegerRangeList" />
 *       &lt;attribute name="BaseOrdReset" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="SheetNameFormat" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="AgentName" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="AgentVersion" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="SurfaceContentsBox" type="{http://www.CIP4.org/JDFSchema_2_0}rectangle" />
 *       &lt;attribute name="StackDepth" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="LockOrigins" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="OrdReset" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="SheetNameTemplate" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="Automated" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="MaxCollect" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="SourceWorkStyle" type="{http://www.CIP4.org/JDFSchema_2_0}EnumWorkStyle" />
 *       &lt;attribute name="MinCollect" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="ProductID" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="Author" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="PipePartIDKeys">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.CIP4.org/JDFSchema_2_0}EnumPartIDKeys" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="MediaRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="QualityControlResultRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="SourceResourceRefs" type="{http://www.CIP4.org/JDFSchema_2_0}IDREFS" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "contentObject",
    "transferCurvePool",
    "insertSheet",
    "pageCondition",
    "layerList",
    "markObject"
})
@XmlRootElement(name = "Signature")
public class Signature
    implements Serializable
{

    @XmlElement(name = "ContentObject")
    protected List<ContentObject> contentObject;
    @XmlElement(name = "TransferCurvePool")
    protected List<TransferCurvePool> transferCurvePool;
    @XmlElement(name = "InsertSheet")
    protected List<InsertSheet> insertSheet;
    @XmlElement(name = "PageCondition")
    protected List<PageCondition> pageCondition;
    @XmlElement(name = "LayerList")
    protected List<LayerList> layerList;
    @XmlElement(name = "MarkObject")
    protected List<MarkObject> markObject;
    @XmlAttribute(name = "Locked")
    protected Boolean locked;
    @XmlAttribute(name = "PipeURL")
    protected String pipeURL;
    @XmlAttribute(name = "Class")
    @XmlSchemaType(name = "anySimpleType")
    protected String clazz;
    @XmlAttribute(name = "PartIDKeys")
    protected List<EnumPartIDKeys> partIDKeys;
    @XmlAttribute(name = "PipeProtocol")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String pipeProtocol;
    @XmlAttribute(name = "SheetCountReset")
    @XmlSchemaType(name = "anySimpleType")
    protected String sheetCountReset;
    @XmlAttribute(name = "PipeID")
    protected String pipeID;
    @XmlAttribute(name = "OrdsConsumed")
    protected Integer ordsConsumed;
    @XmlAttribute(name = "BaseOrdReset")
    @XmlSchemaType(name = "anySimpleType")
    protected String baseOrdReset;
    @XmlAttribute(name = "SheetNameFormat")
    protected String sheetNameFormat;
    @XmlAttribute(name = "AgentName")
    protected String agentName;
    @XmlAttribute(name = "AgentVersion")
    protected String agentVersion;
    @XmlAttribute(name = "SurfaceContentsBox")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.Rectangle.class)
    protected org.cip4.lib.xjdf.type.Rectangle surfaceContentsBox;
    @XmlAttribute(name = "StackDepth")
    protected Integer stackDepth;
    @XmlAttribute(name = "LockOrigins")
    protected Boolean lockOrigins;
    @XmlAttribute(name = "OrdReset")
    @XmlSchemaType(name = "anySimpleType")
    protected String ordReset;
    @XmlAttribute(name = "SheetNameTemplate")
    protected String sheetNameTemplate;
    @XmlAttribute(name = "Automated")
    protected Boolean automated;
    @XmlAttribute(name = "MaxCollect")
    protected Integer maxCollect;
    @XmlAttribute(name = "SourceWorkStyle")
    protected EnumWorkStyle sourceWorkStyle;
    @XmlAttribute(name = "MinCollect")
    protected Integer minCollect;
    @XmlAttribute(name = "ProductID")
    protected String productID;
    @XmlAttribute(name = "Author")
    protected String author;
    @XmlAttribute(name = "PipePartIDKeys")
    protected List<EnumPartIDKeys> pipePartIDKeys;
    @XmlAttribute(name = "MediaRef")
    @XmlIDREF
    protected Object mediaRef;
    @XmlAttribute(name = "QualityControlResultRef")
    @XmlIDREF
    protected Object qualityControlResultRef;
    @XmlAttribute(name = "SourceResourceRefs")
    @XmlIDREF
    protected List<Object> sourceResourceRefs;

    /**
     * Gets the value of the contentObject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contentObject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContentObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContentObject }
     * 
     * 
     */
    public List<ContentObject> getContentObject() {
        if (contentObject == null) {
            contentObject = new ArrayList<ContentObject>();
        }
        return this.contentObject;
    }

    /**
     * Gets the value of the transferCurvePool property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transferCurvePool property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransferCurvePool().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransferCurvePool }
     * 
     * 
     */
    public List<TransferCurvePool> getTransferCurvePool() {
        if (transferCurvePool == null) {
            transferCurvePool = new ArrayList<TransferCurvePool>();
        }
        return this.transferCurvePool;
    }

    /**
     * Gets the value of the insertSheet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the insertSheet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInsertSheet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InsertSheet }
     * 
     * 
     */
    public List<InsertSheet> getInsertSheet() {
        if (insertSheet == null) {
            insertSheet = new ArrayList<InsertSheet>();
        }
        return this.insertSheet;
    }

    /**
     * Gets the value of the pageCondition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pageCondition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPageCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PageCondition }
     * 
     * 
     */
    public List<PageCondition> getPageCondition() {
        if (pageCondition == null) {
            pageCondition = new ArrayList<PageCondition>();
        }
        return this.pageCondition;
    }

    /**
     * Gets the value of the layerList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the layerList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLayerList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LayerList }
     * 
     * 
     */
    public List<LayerList> getLayerList() {
        if (layerList == null) {
            layerList = new ArrayList<LayerList>();
        }
        return this.layerList;
    }

    /**
     * Gets the value of the markObject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the markObject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarkObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarkObject }
     * 
     * 
     */
    public List<MarkObject> getMarkObject() {
        if (markObject == null) {
            markObject = new ArrayList<MarkObject>();
        }
        return this.markObject;
    }

    /**
     * Gets the value of the locked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocked() {
        return locked;
    }

    /**
     * Sets the value of the locked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocked(Boolean value) {
        this.locked = value;
    }

    /**
     * Gets the value of the pipeURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPipeURL() {
        return pipeURL;
    }

    /**
     * Sets the value of the pipeURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPipeURL(String value) {
        this.pipeURL = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the partIDKeys property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partIDKeys property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartIDKeys().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnumPartIDKeys }
     * 
     * 
     */
    public List<EnumPartIDKeys> getPartIDKeys() {
        if (partIDKeys == null) {
            partIDKeys = new ArrayList<EnumPartIDKeys>();
        }
        return this.partIDKeys;
    }

    /**
     * Gets the value of the pipeProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPipeProtocol() {
        return pipeProtocol;
    }

    /**
     * Sets the value of the pipeProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPipeProtocol(String value) {
        this.pipeProtocol = value;
    }

    /**
     * Gets the value of the sheetCountReset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSheetCountReset() {
        return sheetCountReset;
    }

    /**
     * Sets the value of the sheetCountReset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSheetCountReset(String value) {
        this.sheetCountReset = value;
    }

    /**
     * Gets the value of the pipeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPipeID() {
        return pipeID;
    }

    /**
     * Sets the value of the pipeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPipeID(String value) {
        this.pipeID = value;
    }

    /**
     * Gets the value of the ordsConsumed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrdsConsumed() {
        return ordsConsumed;
    }

    /**
     * Sets the value of the ordsConsumed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrdsConsumed(Integer value) {
        this.ordsConsumed = value;
    }

    /**
     * Gets the value of the baseOrdReset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseOrdReset() {
        return baseOrdReset;
    }

    /**
     * Sets the value of the baseOrdReset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseOrdReset(String value) {
        this.baseOrdReset = value;
    }

    /**
     * Gets the value of the sheetNameFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSheetNameFormat() {
        return sheetNameFormat;
    }

    /**
     * Sets the value of the sheetNameFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSheetNameFormat(String value) {
        this.sheetNameFormat = value;
    }

    /**
     * Gets the value of the agentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentName() {
        return agentName;
    }

    /**
     * Sets the value of the agentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentName(String value) {
        this.agentName = value;
    }

    /**
     * Gets the value of the agentVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentVersion() {
        return agentVersion;
    }

    /**
     * Sets the value of the agentVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentVersion(String value) {
        this.agentVersion = value;
    }

    /**
     * Gets the value of the surfaceContentsBox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.Rectangle getSurfaceContentsBox() {
        return surfaceContentsBox;
    }

    /**
     * Sets the value of the surfaceContentsBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurfaceContentsBox(org.cip4.lib.xjdf.type.Rectangle value) {
        this.surfaceContentsBox = value;
    }

    /**
     * Gets the value of the stackDepth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStackDepth() {
        return stackDepth;
    }

    /**
     * Sets the value of the stackDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStackDepth(Integer value) {
        this.stackDepth = value;
    }

    /**
     * Gets the value of the lockOrigins property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLockOrigins() {
        return lockOrigins;
    }

    /**
     * Sets the value of the lockOrigins property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLockOrigins(Boolean value) {
        this.lockOrigins = value;
    }

    /**
     * Gets the value of the ordReset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdReset() {
        return ordReset;
    }

    /**
     * Sets the value of the ordReset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdReset(String value) {
        this.ordReset = value;
    }

    /**
     * Gets the value of the sheetNameTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSheetNameTemplate() {
        return sheetNameTemplate;
    }

    /**
     * Sets the value of the sheetNameTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSheetNameTemplate(String value) {
        this.sheetNameTemplate = value;
    }

    /**
     * Gets the value of the automated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutomated() {
        return automated;
    }

    /**
     * Sets the value of the automated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutomated(Boolean value) {
        this.automated = value;
    }

    /**
     * Gets the value of the maxCollect property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxCollect() {
        return maxCollect;
    }

    /**
     * Sets the value of the maxCollect property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxCollect(Integer value) {
        this.maxCollect = value;
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
     * Gets the value of the minCollect property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinCollect() {
        return minCollect;
    }

    /**
     * Sets the value of the minCollect property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinCollect(Integer value) {
        this.minCollect = value;
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
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthor(String value) {
        this.author = value;
    }

    /**
     * Gets the value of the pipePartIDKeys property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pipePartIDKeys property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPipePartIDKeys().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnumPartIDKeys }
     * 
     * 
     */
    public List<EnumPartIDKeys> getPipePartIDKeys() {
        if (pipePartIDKeys == null) {
            pipePartIDKeys = new ArrayList<EnumPartIDKeys>();
        }
        return this.pipePartIDKeys;
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

    /**
     * Gets the value of the qualityControlResultRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getQualityControlResultRef() {
        return qualityControlResultRef;
    }

    /**
     * Sets the value of the qualityControlResultRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setQualityControlResultRef(Object value) {
        this.qualityControlResultRef = value;
    }

    /**
     * Gets the value of the sourceResourceRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceResourceRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceResourceRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getSourceResourceRefs() {
        if (sourceResourceRefs == null) {
            sourceResourceRefs = new ArrayList<Object>();
        }
        return this.sourceResourceRefs;
    }

}
