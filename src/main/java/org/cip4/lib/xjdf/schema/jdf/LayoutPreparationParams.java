
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
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}FitPolicy" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}InsertSheet" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}PageCell" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}JobField" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}DeviceMark" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ImageShift" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
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
    "imageShifts",
    "deviceMarks",
    "jobFields",
    "pageCells",
    "insertSheets",
    "fitPolicies"
})
public class LayoutPreparationParams
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "ImageShift")
    protected List<ImageShift> imageShifts;
    @XmlElement(name = "DeviceMark")
    protected List<DeviceMark> deviceMarks;
    @XmlElement(name = "JobField")
    protected List<JobField> jobFields;
    @XmlElement(name = "PageCell")
    protected List<PageCell> pageCells;
    @XmlElement(name = "InsertSheet")
    protected List<InsertSheet> insertSheets;
    @XmlElement(name = "FitPolicy")
    protected List<FitPolicy> fitPolicies;
    @XmlAttribute(name = "FinishingOrder")
    @XmlSchemaType(name = "anySimpleType")
    protected String finishingOrder;
    @XmlAttribute(name = "ImplicitGutterMinimumLimit")
    protected List<Double> implicitGutterMinimumLimits;
    @XmlAttribute(name = "GutterMinimumLimit")
    protected List<Double> gutterMinimumLimits;
    @XmlAttribute(name = "HorizontalCreep")
    protected List<Integer> horizontalCreeps;
    @XmlAttribute(name = "PresentationDirection")
    protected String presentationDirection;
    @XmlAttribute(name = "Rotate")
    @XmlSchemaType(name = "anySimpleType")
    protected String rotate;
    @XmlAttribute(name = "ImplicitGutter")
    protected List<Double> implicitGutters;
    @XmlAttribute(name = "StackDepth")
    protected Integer stackDepth;
    @XmlAttribute(name = "NumberUp")
    protected List<Double> numberUps;
    @XmlAttribute(name = "Gutter")
    protected List<Double> gutters;
    @XmlAttribute(name = "StepRepeat")
    protected String stepRepeat;
    @XmlAttribute(name = "StepDocs")
    protected List<Double> stepDocs;
    @XmlAttribute(name = "BindingEdge")
    @XmlSchemaType(name = "anySimpleType")
    protected String bindingEdge;
    @XmlAttribute(name = "FoldCatalogOrientation")
    @XmlSchemaType(name = "anySimpleType")
    protected String foldCatalogOrientation;
    @XmlAttribute(name = "FoldCatalog")
    protected String foldCatalog;
    @XmlAttribute(name = "BackMarkList")
    protected List<String> backMarkLists;
    @XmlAttribute(name = "SurfaceContentsBox")
    protected Double surfaceContentsBox;
    @XmlAttribute(name = "PageOrder")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String pageOrder;
    @XmlAttribute(name = "FrontMarkList")
    protected List<String> frontMarkLists;
    @XmlAttribute(name = "VerticalCreep")
    protected List<Integer> verticalCreeps;
    @XmlAttribute(name = "CreepValue")
    protected List<Double> creepValues;
    @XmlAttribute(name = "Sides")
    @XmlSchemaType(name = "anySimpleType")
    protected String sides;
    @XmlAttribute(name = "PageDistributionScheme")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String pageDistributionScheme;
    @XmlAttribute(name = "MediaRef")
    @XmlIDREF
    protected Object mediaRef;
    @XmlAttribute(name = "ExternalImpositionTemplateRef")
    @XmlIDREF
    protected Object externalImpositionTemplateRef;

    /**
     * Gets the value of the imageShifts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imageShifts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImageShifts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImageShift }
     * 
     * 
     */
    public List<ImageShift> getImageShifts() {
        if (imageShifts == null) {
            imageShifts = new ArrayList<ImageShift>();
        }
        return this.imageShifts;
    }

    /**
     * Gets the value of the deviceMarks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deviceMarks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeviceMarks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceMark }
     * 
     * 
     */
    public List<DeviceMark> getDeviceMarks() {
        if (deviceMarks == null) {
            deviceMarks = new ArrayList<DeviceMark>();
        }
        return this.deviceMarks;
    }

    /**
     * Gets the value of the jobFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobField }
     * 
     * 
     */
    public List<JobField> getJobFields() {
        if (jobFields == null) {
            jobFields = new ArrayList<JobField>();
        }
        return this.jobFields;
    }

    /**
     * Gets the value of the pageCells property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pageCells property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPageCells().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PageCell }
     * 
     * 
     */
    public List<PageCell> getPageCells() {
        if (pageCells == null) {
            pageCells = new ArrayList<PageCell>();
        }
        return this.pageCells;
    }

    /**
     * Gets the value of the insertSheets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the insertSheets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInsertSheets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InsertSheet }
     * 
     * 
     */
    public List<InsertSheet> getInsertSheets() {
        if (insertSheets == null) {
            insertSheets = new ArrayList<InsertSheet>();
        }
        return this.insertSheets;
    }

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
     * Gets the value of the implicitGutterMinimumLimits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the implicitGutterMinimumLimits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImplicitGutterMinimumLimits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getImplicitGutterMinimumLimits() {
        if (implicitGutterMinimumLimits == null) {
            implicitGutterMinimumLimits = new ArrayList<Double>();
        }
        return this.implicitGutterMinimumLimits;
    }

    /**
     * Gets the value of the gutterMinimumLimits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gutterMinimumLimits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGutterMinimumLimits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getGutterMinimumLimits() {
        if (gutterMinimumLimits == null) {
            gutterMinimumLimits = new ArrayList<Double>();
        }
        return this.gutterMinimumLimits;
    }

    /**
     * Gets the value of the horizontalCreeps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the horizontalCreeps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHorizontalCreeps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getHorizontalCreeps() {
        if (horizontalCreeps == null) {
            horizontalCreeps = new ArrayList<Integer>();
        }
        return this.horizontalCreeps;
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
     * Gets the value of the implicitGutters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the implicitGutters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImplicitGutters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getImplicitGutters() {
        if (implicitGutters == null) {
            implicitGutters = new ArrayList<Double>();
        }
        return this.implicitGutters;
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
     * Gets the value of the numberUps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numberUps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumberUps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getNumberUps() {
        if (numberUps == null) {
            numberUps = new ArrayList<Double>();
        }
        return this.numberUps;
    }

    /**
     * Gets the value of the gutters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gutters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGutters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getGutters() {
        if (gutters == null) {
            gutters = new ArrayList<Double>();
        }
        return this.gutters;
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stepDocs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStepDocs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getStepDocs() {
        if (stepDocs == null) {
            stepDocs = new ArrayList<Double>();
        }
        return this.stepDocs;
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
     * Gets the value of the backMarkLists property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the backMarkLists property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBackMarkLists().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBackMarkLists() {
        if (backMarkLists == null) {
            backMarkLists = new ArrayList<String>();
        }
        return this.backMarkLists;
    }

    /**
     * Gets the value of the surfaceContentsBox property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSurfaceContentsBox() {
        return surfaceContentsBox;
    }

    /**
     * Sets the value of the surfaceContentsBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSurfaceContentsBox(Double value) {
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
     * Gets the value of the frontMarkLists property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the frontMarkLists property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFrontMarkLists().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFrontMarkLists() {
        if (frontMarkLists == null) {
            frontMarkLists = new ArrayList<String>();
        }
        return this.frontMarkLists;
    }

    /**
     * Gets the value of the verticalCreeps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the verticalCreeps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVerticalCreeps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getVerticalCreeps() {
        if (verticalCreeps == null) {
            verticalCreeps = new ArrayList<Integer>();
        }
        return this.verticalCreeps;
    }

    /**
     * Gets the value of the creepValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creepValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreepValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getCreepValues() {
        if (creepValues == null) {
            creepValues = new ArrayList<Double>();
        }
        return this.creepValues;
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
     * Gets the value of the externalImpositionTemplateRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExternalImpositionTemplateRef() {
        return externalImpositionTemplateRef;
    }

    /**
     * Sets the value of the externalImpositionTemplateRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExternalImpositionTemplateRef(Object value) {
        this.externalImpositionTemplateRef = value;
    }

}
