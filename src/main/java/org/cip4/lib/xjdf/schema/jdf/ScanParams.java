
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
 * <p>Java class for ScanParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScanParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;attribute name="Magnification" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="OutputResolution" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="BitDepth" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="Mounting" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="InputBox" type="{http://www.CIP4.org/JDFSchema_2_0}rectangle" />
 *       &lt;attribute name="DCTQuality" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="MountID" type="{http://www.CIP4.org/JDFSchema_2_0}shortString" />
 *       &lt;attribute name="SplitDocuments" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="OutputColorSpace" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CompressionFilter" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="OutputSize" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="FileSpecRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScanParams")
public class ScanParams
    extends ParameterType
    implements Serializable
{

    @XmlAttribute(name = "Magnification")
    protected List<Double> magnifications;
    @XmlAttribute(name = "OutputResolution")
    protected List<Double> outputResolutions;
    @XmlAttribute(name = "BitDepth")
    protected Integer bitDepth;
    @XmlAttribute(name = "Mounting")
    @XmlSchemaType(name = "anySimpleType")
    protected String mounting;
    @XmlAttribute(name = "InputBox")
    protected Double inputBox;
    @XmlAttribute(name = "DCTQuality")
    protected Double dctQuality;
    @XmlAttribute(name = "MountID")
    protected String mountID;
    @XmlAttribute(name = "SplitDocuments")
    protected Integer splitDocuments;
    @XmlAttribute(name = "OutputColorSpace")
    @XmlSchemaType(name = "anySimpleType")
    protected String outputColorSpace;
    @XmlAttribute(name = "CompressionFilter")
    @XmlSchemaType(name = "anySimpleType")
    protected String compressionFilter;
    @XmlAttribute(name = "OutputSize")
    protected List<Double> outputSizes;
    @XmlAttribute(name = "FileSpecRef")
    @XmlIDREF
    protected Object fileSpecRef;

    /**
     * Gets the value of the magnifications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the magnifications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMagnifications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getMagnifications() {
        if (magnifications == null) {
            magnifications = new ArrayList<Double>();
        }
        return this.magnifications;
    }

    /**
     * Gets the value of the outputResolutions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outputResolutions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputResolutions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getOutputResolutions() {
        if (outputResolutions == null) {
            outputResolutions = new ArrayList<Double>();
        }
        return this.outputResolutions;
    }

    /**
     * Gets the value of the bitDepth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBitDepth() {
        return bitDepth;
    }

    /**
     * Sets the value of the bitDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBitDepth(Integer value) {
        this.bitDepth = value;
    }

    /**
     * Gets the value of the mounting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMounting() {
        return mounting;
    }

    /**
     * Sets the value of the mounting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMounting(String value) {
        this.mounting = value;
    }

    /**
     * Gets the value of the inputBox property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getInputBox() {
        return inputBox;
    }

    /**
     * Sets the value of the inputBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setInputBox(Double value) {
        this.inputBox = value;
    }

    /**
     * Gets the value of the dctQuality property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDCTQuality() {
        return dctQuality;
    }

    /**
     * Sets the value of the dctQuality property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDCTQuality(Double value) {
        this.dctQuality = value;
    }

    /**
     * Gets the value of the mountID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMountID() {
        return mountID;
    }

    /**
     * Sets the value of the mountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMountID(String value) {
        this.mountID = value;
    }

    /**
     * Gets the value of the splitDocuments property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSplitDocuments() {
        return splitDocuments;
    }

    /**
     * Sets the value of the splitDocuments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSplitDocuments(Integer value) {
        this.splitDocuments = value;
    }

    /**
     * Gets the value of the outputColorSpace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputColorSpace() {
        return outputColorSpace;
    }

    /**
     * Sets the value of the outputColorSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputColorSpace(String value) {
        this.outputColorSpace = value;
    }

    /**
     * Gets the value of the compressionFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompressionFilter() {
        return compressionFilter;
    }

    /**
     * Sets the value of the compressionFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompressionFilter(String value) {
        this.compressionFilter = value;
    }

    /**
     * Gets the value of the outputSizes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outputSizes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputSizes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getOutputSizes() {
        if (outputSizes == null) {
            outputSizes = new ArrayList<Double>();
        }
        return this.outputSizes;
    }

    /**
     * Gets the value of the fileSpecRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFileSpecRef() {
        return fileSpecRef;
    }

    /**
     * Sets the value of the fileSpecRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFileSpecRef(Object value) {
        this.fileSpecRef = value;
    }

}
