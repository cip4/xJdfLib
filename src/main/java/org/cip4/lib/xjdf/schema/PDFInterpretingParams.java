
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
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}OCGControl" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="OCGProcess" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="OCGDefault" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="EmitPDFBG" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="OCGIntent" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="EmitPDFHalftones" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="EmitPDFUCR" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="PrintPDFAnnotations" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="PrintTrapAnnotations" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="TransparencyRenderingQuality" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="HonorPDFOverprint" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="EmitPDFTransfers" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="ICCColorAsDeviceColor" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="OCGZoom" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="ReferenceXObjParamsRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ocgControl"
})
@XmlRootElement(name = "PDFInterpretingParams")
public class PDFInterpretingParams
    implements Serializable
{

    @XmlElement(name = "OCGControl")
    protected List<OCGControl> ocgControl;
    @XmlAttribute(name = "OCGProcess")
    @XmlSchemaType(name = "anySimpleType")
    protected String ocgProcess;
    @XmlAttribute(name = "OCGDefault")
    @XmlSchemaType(name = "anySimpleType")
    protected String ocgDefault;
    @XmlAttribute(name = "EmitPDFBG")
    protected Boolean emitPDFBG;
    @XmlAttribute(name = "OCGIntent")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String ocgIntent;
    @XmlAttribute(name = "EmitPDFHalftones")
    protected Boolean emitPDFHalftones;
    @XmlAttribute(name = "EmitPDFUCR")
    protected Boolean emitPDFUCR;
    @XmlAttribute(name = "PrintPDFAnnotations")
    protected Boolean printPDFAnnotations;
    @XmlAttribute(name = "PrintTrapAnnotations")
    protected Boolean printTrapAnnotations;
    @XmlAttribute(name = "TransparencyRenderingQuality")
    protected Double transparencyRenderingQuality;
    @XmlAttribute(name = "HonorPDFOverprint")
    protected Boolean honorPDFOverprint;
    @XmlAttribute(name = "EmitPDFTransfers")
    protected Boolean emitPDFTransfers;
    @XmlAttribute(name = "ICCColorAsDeviceColor")
    protected Boolean iccColorAsDeviceColor;
    @XmlAttribute(name = "OCGZoom")
    protected Double ocgZoom;
    @XmlAttribute(name = "ReferenceXObjParamsRef")
    @XmlIDREF
    protected Object referenceXObjParamsRef;

    /**
     * Gets the value of the ocgControl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ocgControl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOCGControl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OCGControl }
     * 
     * 
     */
    public List<OCGControl> getOCGControl() {
        if (ocgControl == null) {
            ocgControl = new ArrayList<OCGControl>();
        }
        return this.ocgControl;
    }

    /**
     * Gets the value of the ocgProcess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOCGProcess() {
        return ocgProcess;
    }

    /**
     * Sets the value of the ocgProcess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOCGProcess(String value) {
        this.ocgProcess = value;
    }

    /**
     * Gets the value of the ocgDefault property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOCGDefault() {
        return ocgDefault;
    }

    /**
     * Sets the value of the ocgDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOCGDefault(String value) {
        this.ocgDefault = value;
    }

    /**
     * Gets the value of the emitPDFBG property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmitPDFBG() {
        return emitPDFBG;
    }

    /**
     * Sets the value of the emitPDFBG property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmitPDFBG(Boolean value) {
        this.emitPDFBG = value;
    }

    /**
     * Gets the value of the ocgIntent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOCGIntent() {
        return ocgIntent;
    }

    /**
     * Sets the value of the ocgIntent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOCGIntent(String value) {
        this.ocgIntent = value;
    }

    /**
     * Gets the value of the emitPDFHalftones property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmitPDFHalftones() {
        return emitPDFHalftones;
    }

    /**
     * Sets the value of the emitPDFHalftones property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmitPDFHalftones(Boolean value) {
        this.emitPDFHalftones = value;
    }

    /**
     * Gets the value of the emitPDFUCR property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmitPDFUCR() {
        return emitPDFUCR;
    }

    /**
     * Sets the value of the emitPDFUCR property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmitPDFUCR(Boolean value) {
        this.emitPDFUCR = value;
    }

    /**
     * Gets the value of the printPDFAnnotations property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrintPDFAnnotations() {
        return printPDFAnnotations;
    }

    /**
     * Sets the value of the printPDFAnnotations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrintPDFAnnotations(Boolean value) {
        this.printPDFAnnotations = value;
    }

    /**
     * Gets the value of the printTrapAnnotations property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrintTrapAnnotations() {
        return printTrapAnnotations;
    }

    /**
     * Sets the value of the printTrapAnnotations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrintTrapAnnotations(Boolean value) {
        this.printTrapAnnotations = value;
    }

    /**
     * Gets the value of the transparencyRenderingQuality property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTransparencyRenderingQuality() {
        return transparencyRenderingQuality;
    }

    /**
     * Sets the value of the transparencyRenderingQuality property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTransparencyRenderingQuality(Double value) {
        this.transparencyRenderingQuality = value;
    }

    /**
     * Gets the value of the honorPDFOverprint property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHonorPDFOverprint() {
        return honorPDFOverprint;
    }

    /**
     * Sets the value of the honorPDFOverprint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHonorPDFOverprint(Boolean value) {
        this.honorPDFOverprint = value;
    }

    /**
     * Gets the value of the emitPDFTransfers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmitPDFTransfers() {
        return emitPDFTransfers;
    }

    /**
     * Sets the value of the emitPDFTransfers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmitPDFTransfers(Boolean value) {
        this.emitPDFTransfers = value;
    }

    /**
     * Gets the value of the iccColorAsDeviceColor property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isICCColorAsDeviceColor() {
        return iccColorAsDeviceColor;
    }

    /**
     * Sets the value of the iccColorAsDeviceColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setICCColorAsDeviceColor(Boolean value) {
        this.iccColorAsDeviceColor = value;
    }

    /**
     * Gets the value of the ocgZoom property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOCGZoom() {
        return ocgZoom;
    }

    /**
     * Sets the value of the ocgZoom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOCGZoom(Double value) {
        this.ocgZoom = value;
    }

    /**
     * Gets the value of the referenceXObjParamsRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getReferenceXObjParamsRef() {
        return referenceXObjParamsRef;
    }

    /**
     * Sets the value of the referenceXObjParamsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setReferenceXObjParamsRef(Object value) {
        this.referenceXObjParamsRef = value;
    }

}
