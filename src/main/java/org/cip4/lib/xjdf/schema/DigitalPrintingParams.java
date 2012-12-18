
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
 * <p>Java class for DigitalPrintingParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DigitalPrintingParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Disjointing" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="NonPrintableMarginLeft" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="NonPrintableMarginTop" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="NonPrintableMarginRight" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="DirectProofAmount" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="SheetLay" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ManualFeed" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="Collate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PageDelivery" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="OutputBin" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="PrintingType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NonPrintableMarginBottom" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="Sides" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="MediaRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="ApprovalParamsRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="ComponentRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DigitalPrintingParams", propOrder = {
    "disjointing"
})
public class DigitalPrintingParams
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "Disjointing")
    protected List<Disjointing> disjointing;
    @XmlAttribute(name = "NonPrintableMarginLeft")
    protected Double nonPrintableMarginLeft;
    @XmlAttribute(name = "NonPrintableMarginTop")
    protected Double nonPrintableMarginTop;
    @XmlAttribute(name = "NonPrintableMarginRight")
    protected Double nonPrintableMarginRight;
    @XmlAttribute(name = "DirectProofAmount")
    protected Integer directProofAmount;
    @XmlAttribute(name = "SheetLay")
    @XmlSchemaType(name = "anySimpleType")
    protected String sheetLay;
    @XmlAttribute(name = "ManualFeed")
    protected Boolean manualFeed;
    @XmlAttribute(name = "Collate")
    @XmlSchemaType(name = "anySimpleType")
    protected String collate;
    @XmlAttribute(name = "PageDelivery")
    @XmlSchemaType(name = "anySimpleType")
    protected String pageDelivery;
    @XmlAttribute(name = "OutputBin")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String outputBin;
    @XmlAttribute(name = "PrintingType")
    @XmlSchemaType(name = "anySimpleType")
    protected String printingType;
    @XmlAttribute(name = "NonPrintableMarginBottom")
    protected Double nonPrintableMarginBottom;
    @XmlAttribute(name = "Sides")
    @XmlSchemaType(name = "anySimpleType")
    protected String sides;
    @XmlAttribute(name = "MediaRef")
    @XmlIDREF
    protected Object mediaRef;
    @XmlAttribute(name = "ApprovalParamsRef")
    @XmlIDREF
    protected Object approvalParamsRef;
    @XmlAttribute(name = "ComponentRef")
    @XmlIDREF
    protected Object componentRef;

    /**
     * Gets the value of the disjointing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disjointing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisjointing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Disjointing }
     * 
     * 
     */
    public List<Disjointing> getDisjointing() {
        if (disjointing == null) {
            disjointing = new ArrayList<Disjointing>();
        }
        return this.disjointing;
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
     * Gets the value of the directProofAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDirectProofAmount() {
        return directProofAmount;
    }

    /**
     * Sets the value of the directProofAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDirectProofAmount(Integer value) {
        this.directProofAmount = value;
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
     * Gets the value of the manualFeed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isManualFeed() {
        return manualFeed;
    }

    /**
     * Sets the value of the manualFeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setManualFeed(Boolean value) {
        this.manualFeed = value;
    }

    /**
     * Gets the value of the collate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollate() {
        return collate;
    }

    /**
     * Sets the value of the collate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollate(String value) {
        this.collate = value;
    }

    /**
     * Gets the value of the pageDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageDelivery() {
        return pageDelivery;
    }

    /**
     * Sets the value of the pageDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageDelivery(String value) {
        this.pageDelivery = value;
    }

    /**
     * Gets the value of the outputBin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputBin() {
        return outputBin;
    }

    /**
     * Sets the value of the outputBin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputBin(String value) {
        this.outputBin = value;
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

    /**
     * Gets the value of the componentRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getComponentRef() {
        return componentRef;
    }

    /**
     * Sets the value of the componentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setComponentRef(Object value) {
        this.componentRef = value;
    }

}
