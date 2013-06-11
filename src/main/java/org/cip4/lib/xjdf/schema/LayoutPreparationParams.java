
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for LayoutPreparationParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LayoutPreparationParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}FitPolicy" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}InsertSheet" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}PageCell" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}JobField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}DeviceMark" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ImageShift" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="FinishingOrder" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ImplicitGutterMinimumLimit" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="GutterMinimumLimit" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="HorizontalCreep" type="{http://www.CIP4.org/JDFSchema_2_0}IntegerList" />
 *       &lt;attribute name="PresentationDirection" type="{http://www.CIP4.org/JDFSchema_2_0}Any" />
 *       &lt;attribute name="Rotate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ImplicitGutter" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="StackDepth" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="NumberUp" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="Gutter" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="StepRepeat" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="StepDocs" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="BindingEdge" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="FoldCatalogOrientation" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="FoldCatalog" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="BackMarkList" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKENS" />
 *       &lt;attribute name="SurfaceContentsBox" type="{http://www.CIP4.org/JDFSchema_2_0}rectangle" />
 *       &lt;attribute name="PageOrder" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="FrontMarkList" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKENS" />
 *       &lt;attribute name="VerticalCreep" type="{http://www.CIP4.org/JDFSchema_2_0}IntegerList" />
 *       &lt;attribute name="CreepValue" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="Sides" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PageDistributionScheme" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="MediaRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="ExternalImpositionTemplateRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LayoutPreparationParams", propOrder = {
    "fitPolicy",
    "insertSheet",
    "pageCell",
    "jobField",
    "deviceMark",
    "imageShift"
})
public class LayoutPreparationParams
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "FitPolicy")
    protected List<FitPolicy> fitPolicy;
    @XmlElement(name = "InsertSheet")
    protected List<InsertSheet> insertSheet;
    @XmlElement(name = "PageCell")
    protected List<PageCell> pageCell;
    @XmlElement(name = "JobField")
    protected List<JobField> jobField;
    @XmlElement(name = "DeviceMark")
    protected List<DeviceMark> deviceMark;
    @XmlElement(name = "ImageShift")
    protected List<ImageShift> imageShift;
    @XmlAttribute(name = "FinishingOrder")
    @XmlSchemaType(name = "anySimpleType")
    protected String finishingOrder;
    @XmlAttribute(name = "ImplicitGutterMinimumLimit")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.XYPair.class)
    protected org.cip4.lib.xjdf.type.XYPair implicitGutterMinimumLimit;
    @XmlAttribute(name = "GutterMinimumLimit")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.XYPair.class)
    protected org.cip4.lib.xjdf.type.XYPair gutterMinimumLimit;
    @XmlAttribute(name = "HorizontalCreep")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IntegerList.class)
    protected org.cip4.lib.xjdf.type.IntegerList horizontalCreep;
    @XmlAttribute(name = "PresentationDirection")
    protected String presentationDirection;
    @XmlAttribute(name = "Rotate")
    @XmlSchemaType(name = "anySimpleType")
    protected String rotate;
    @XmlAttribute(name = "ImplicitGutter")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.XYPair.class)
    protected org.cip4.lib.xjdf.type.XYPair implicitGutter;
    @XmlAttribute(name = "StackDepth")
    protected Integer stackDepth;
    @XmlAttribute(name = "NumberUp")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.XYPair.class)
    protected org.cip4.lib.xjdf.type.XYPair numberUp;
    @XmlAttribute(name = "Gutter")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.XYPair.class)
    protected org.cip4.lib.xjdf.type.XYPair gutter;
    @XmlAttribute(name = "StepRepeat")
    protected String stepRepeat;
    @XmlAttribute(name = "StepDocs")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.XYPair.class)
    protected org.cip4.lib.xjdf.type.XYPair stepDocs;
    @XmlAttribute(name = "BindingEdge")
    @XmlSchemaType(name = "anySimpleType")
    protected String bindingEdge;
    @XmlAttribute(name = "FoldCatalogOrientation")
    @XmlSchemaType(name = "anySimpleType")
    protected String foldCatalogOrientation;
    @XmlAttribute(name = "FoldCatalog")
    protected String foldCatalog;
    @XmlAttribute(name = "BackMarkList")
    protected List<String> backMarkList;
    @XmlAttribute(name = "SurfaceContentsBox")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.Rectangle.class)
    protected org.cip4.lib.xjdf.type.Rectangle surfaceContentsBox;
    @XmlAttribute(name = "PageOrder")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String pageOrder;
    @XmlAttribute(name = "FrontMarkList")
    protected List<String> frontMarkList;
    @XmlAttribute(name = "VerticalCreep")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IntegerList.class)
    protected org.cip4.lib.xjdf.type.IntegerList verticalCreep;
    @XmlAttribute(name = "CreepValue")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.XYPair.class)
    protected org.cip4.lib.xjdf.type.XYPair creepValue;
    @XmlAttribute(name = "Sides")
    @XmlSchemaType(name = "anySimpleType")
    protected String sides;
    @XmlAttribute(name = "PageDistributionScheme")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String pageDistributionScheme;
    @XmlAttribute(name = "MediaRef")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IDREF.class)
    protected org.cip4.lib.xjdf.type.IDREF mediaRef;
    @XmlAttribute(name = "ExternalImpositionTemplateRef")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IDREF.class)
    protected org.cip4.lib.xjdf.type.IDREF externalImpositionTemplateRef;

    /**
     * Gets the value of the fitPolicy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fitPolicy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFitPolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FitPolicy }
     * 
     * 
     */
    public List<FitPolicy> getFitPolicy() {
        if (fitPolicy == null) {
            fitPolicy = new ArrayList<FitPolicy>();
        }
        return this.fitPolicy;
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
     * Gets the value of the pageCell property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pageCell property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPageCell().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PageCell }
     * 
     * 
     */
    public List<PageCell> getPageCell() {
        if (pageCell == null) {
            pageCell = new ArrayList<PageCell>();
        }
        return this.pageCell;
    }

    /**
     * Gets the value of the jobField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobField }
     * 
     * 
     */
    public List<JobField> getJobField() {
        if (jobField == null) {
            jobField = new ArrayList<JobField>();
        }
        return this.jobField;
    }

    /**
     * Gets the value of the deviceMark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deviceMark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeviceMark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceMark }
     * 
     * 
     */
    public List<DeviceMark> getDeviceMark() {
        if (deviceMark == null) {
            deviceMark = new ArrayList<DeviceMark>();
        }
        return this.deviceMark;
    }

    /**
     * Gets the value of the imageShift property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imageShift property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImageShift().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImageShift }
     * 
     * 
     */
    public List<ImageShift> getImageShift() {
        if (imageShift == null) {
            imageShift = new ArrayList<ImageShift>();
        }
        return this.imageShift;
    }

    /**
     * Gets the value of the finishingOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinishingOrder() {
        return finishingOrder;
    }

    /**
     * Sets the value of the finishingOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinishingOrder(String value) {
        this.finishingOrder = value;
    }

    /**
     * Gets the value of the implicitGutterMinimumLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.XYPair getImplicitGutterMinimumLimit() {
        return implicitGutterMinimumLimit;
    }

    /**
     * Sets the value of the implicitGutterMinimumLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImplicitGutterMinimumLimit(org.cip4.lib.xjdf.type.XYPair value) {
        this.implicitGutterMinimumLimit = value;
    }

    /**
     * Gets the value of the gutterMinimumLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.XYPair getGutterMinimumLimit() {
        return gutterMinimumLimit;
    }

    /**
     * Sets the value of the gutterMinimumLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGutterMinimumLimit(org.cip4.lib.xjdf.type.XYPair value) {
        this.gutterMinimumLimit = value;
    }

    /**
     * Gets the value of the horizontalCreep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.IntegerList getHorizontalCreep() {
        return horizontalCreep;
    }

    /**
     * Sets the value of the horizontalCreep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHorizontalCreep(org.cip4.lib.xjdf.type.IntegerList value) {
        this.horizontalCreep = value;
    }

    /**
     * Gets the value of the presentationDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresentationDirection() {
        return presentationDirection;
    }

    /**
     * Sets the value of the presentationDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresentationDirection(String value) {
        this.presentationDirection = value;
    }

    /**
     * Gets the value of the rotate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRotate() {
        return rotate;
    }

    /**
     * Sets the value of the rotate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRotate(String value) {
        this.rotate = value;
    }

    /**
     * Gets the value of the implicitGutter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.XYPair getImplicitGutter() {
        return implicitGutter;
    }

    /**
     * Sets the value of the implicitGutter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImplicitGutter(org.cip4.lib.xjdf.type.XYPair value) {
        this.implicitGutter = value;
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
     * Gets the value of the numberUp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.XYPair getNumberUp() {
        return numberUp;
    }

    /**
     * Sets the value of the numberUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberUp(org.cip4.lib.xjdf.type.XYPair value) {
        this.numberUp = value;
    }

    /**
     * Gets the value of the gutter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.XYPair getGutter() {
        return gutter;
    }

    /**
     * Sets the value of the gutter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGutter(org.cip4.lib.xjdf.type.XYPair value) {
        this.gutter = value;
    }

    /**
     * Gets the value of the stepRepeat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStepRepeat() {
        return stepRepeat;
    }

    /**
     * Sets the value of the stepRepeat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStepRepeat(String value) {
        this.stepRepeat = value;
    }

    /**
     * Gets the value of the stepDocs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.XYPair getStepDocs() {
        return stepDocs;
    }

    /**
     * Sets the value of the stepDocs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStepDocs(org.cip4.lib.xjdf.type.XYPair value) {
        this.stepDocs = value;
    }

    /**
     * Gets the value of the bindingEdge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBindingEdge() {
        return bindingEdge;
    }

    /**
     * Sets the value of the bindingEdge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBindingEdge(String value) {
        this.bindingEdge = value;
    }

    /**
     * Gets the value of the foldCatalogOrientation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoldCatalogOrientation() {
        return foldCatalogOrientation;
    }

    /**
     * Sets the value of the foldCatalogOrientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoldCatalogOrientation(String value) {
        this.foldCatalogOrientation = value;
    }

    /**
     * Gets the value of the foldCatalog property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoldCatalog() {
        return foldCatalog;
    }

    /**
     * Sets the value of the foldCatalog property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoldCatalog(String value) {
        this.foldCatalog = value;
    }

    /**
     * Gets the value of the backMarkList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the backMarkList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBackMarkList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBackMarkList() {
        if (backMarkList == null) {
            backMarkList = new ArrayList<String>();
        }
        return this.backMarkList;
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
     * Gets the value of the pageOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageOrder() {
        return pageOrder;
    }

    /**
     * Sets the value of the pageOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageOrder(String value) {
        this.pageOrder = value;
    }

    /**
     * Gets the value of the frontMarkList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the frontMarkList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFrontMarkList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFrontMarkList() {
        if (frontMarkList == null) {
            frontMarkList = new ArrayList<String>();
        }
        return this.frontMarkList;
    }

    /**
     * Gets the value of the verticalCreep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.IntegerList getVerticalCreep() {
        return verticalCreep;
    }

    /**
     * Sets the value of the verticalCreep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerticalCreep(org.cip4.lib.xjdf.type.IntegerList value) {
        this.verticalCreep = value;
    }

    /**
     * Gets the value of the creepValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.XYPair getCreepValue() {
        return creepValue;
    }

    /**
     * Sets the value of the creepValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreepValue(org.cip4.lib.xjdf.type.XYPair value) {
        this.creepValue = value;
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
     * Gets the value of the pageDistributionScheme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageDistributionScheme() {
        return pageDistributionScheme;
    }

    /**
     * Sets the value of the pageDistributionScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageDistributionScheme(String value) {
        this.pageDistributionScheme = value;
    }

    /**
     * Gets the value of the mediaRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.IDREF getMediaRef() {
        return mediaRef;
    }

    /**
     * Sets the value of the mediaRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaRef(org.cip4.lib.xjdf.type.IDREF value) {
        this.mediaRef = value;
    }

    /**
     * Gets the value of the externalImpositionTemplateRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.IDREF getExternalImpositionTemplateRef() {
        return externalImpositionTemplateRef;
    }

    /**
     * Sets the value of the externalImpositionTemplateRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalImpositionTemplateRef(org.cip4.lib.xjdf.type.IDREF value) {
        this.externalImpositionTemplateRef = value;
    }

}
