
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for Layout complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Layout">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}PlacedObject" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}TransferCurvePool" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}InsertSheet" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}PageCondition" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}LayerList" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="SheetCountReset" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="OrdsConsumed" type="{http://www.CIP4.org/JDFSchema_2_0}IntegerRangeList" />
 *       &lt;attribute name="BaseOrdReset" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="SheetNameFormat" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="SurfaceContentsBox" type="{http://www.CIP4.org/JDFSchema_2_0}rectangle" />
 *       &lt;attribute name="StackDepth" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="LockOrigins" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="OrdReset" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="SheetNameTemplate" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="Automated" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="MaxCollect" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="SourceWorkStyle" type="{http://www.CIP4.org/JDFSchema_2_0}EnumWorkStyle" />
 *       &lt;attribute name="MinCollect" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="MediaRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Layout", propOrder = {
    "placedObject",
    "transferCurvePool",
    "insertSheet",
    "pageCondition",
    "layerList"
})
public class Layout
    extends ParameterType
    implements Serializable
{

    @XmlElementRef(name = "PlacedObject", namespace = "http://www.CIP4.org/JDFSchema_2_0", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends PlacedObject>> placedObject;
    @XmlElement(name = "TransferCurvePool")
    protected List<TransferCurvePool> transferCurvePool;
    @XmlElement(name = "InsertSheet")
    protected List<InsertSheet> insertSheet;
    @XmlElement(name = "PageCondition")
    protected List<PageCondition> pageCondition;
    @XmlElement(name = "LayerList")
    protected List<LayerList> layerList;
    @XmlAttribute(name = "SheetCountReset")
    @XmlSchemaType(name = "anySimpleType")
    protected String sheetCountReset;
    @XmlAttribute(name = "OrdsConsumed")
    protected Integer ordsConsumed;
    @XmlAttribute(name = "BaseOrdReset")
    @XmlSchemaType(name = "anySimpleType")
    protected String baseOrdReset;
    @XmlAttribute(name = "SheetNameFormat")
    protected String sheetNameFormat;
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
    @XmlAttribute(name = "MediaRef")
    @XmlIDREF
    protected Object mediaRef;

    /**
     * Gets the value of the placedObject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the placedObject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlacedObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link ContentObject }{@code >}
     * {@link JAXBElement }{@code <}{@link PlacedObject }{@code >}
     * {@link JAXBElement }{@code <}{@link MarkObject }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends PlacedObject>> getPlacedObject() {
        if (placedObject == null) {
            placedObject = new ArrayList<JAXBElement<? extends PlacedObject>>();
        }
        return this.placedObject;
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
