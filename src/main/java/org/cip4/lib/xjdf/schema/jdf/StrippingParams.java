
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
 * <p>Java class for StrippingParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StrippingParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Position" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}StripMark" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="WorkStyle" type="{http://www.CIP4.org/JDFSchema_2_0}EnumWorkStyle" />
 *       &lt;attribute name="JobID" type="{http://www.CIP4.org/JDFSchema_2_0}shortString" />
 *       &lt;attribute name="SectionList" type="{http://www.CIP4.org/JDFSchema_2_0}IntegerList" />
 *       &lt;attribute name="InnermostShingling" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="AssemblyIDs" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKENS" />
 *       &lt;attribute name="SheetNameFormat" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="StackDepth" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="AssemblyID" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="SheetNameTemplate" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="Automated" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="OutermostShingling" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="BinderySignatureRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="MediaRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="DeviceRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="StripCellParamsRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="ExternalImpositionTemplateRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StrippingParams", propOrder = {
    "stripMarks",
    "positions"
})
public class StrippingParams
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "StripMark")
    protected List<StripMark> stripMarks;
    @XmlElement(name = "Position")
    protected List<Position> positions;
    @XmlAttribute(name = "WorkStyle")
    protected EnumWorkStyle workStyle;
    @XmlAttribute(name = "JobID")
    protected String jobID;
    @XmlAttribute(name = "SectionList")
    protected List<Integer> sectionLists;
    @XmlAttribute(name = "InnermostShingling")
    protected Double innermostShingling;
    @XmlAttribute(name = "AssemblyIDs")
    protected List<String> assemblyIDs;
    @XmlAttribute(name = "SheetNameFormat")
    protected String sheetNameFormat;
    @XmlAttribute(name = "StackDepth")
    protected Integer stackDepth;
    @XmlAttribute(name = "AssemblyID")
    protected String assemblyID;
    @XmlAttribute(name = "SheetNameTemplate")
    protected String sheetNameTemplate;
    @XmlAttribute(name = "Automated")
    protected Boolean automated;
    @XmlAttribute(name = "OutermostShingling")
    protected Double outermostShingling;
    @XmlAttribute(name = "BinderySignatureRef")
    @XmlIDREF
    protected Object binderySignatureRef;
    @XmlAttribute(name = "MediaRef")
    @XmlIDREF
    protected Object mediaRef;
    @XmlAttribute(name = "DeviceRef")
    @XmlIDREF
    protected Object deviceRef;
    @XmlAttribute(name = "StripCellParamsRef")
    @XmlIDREF
    protected Object stripCellParamsRef;
    @XmlAttribute(name = "ExternalImpositionTemplateRef")
    @XmlIDREF
    protected Object externalImpositionTemplateRef;

    /**
     * Gets the value of the stripMarks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stripMarks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStripMarks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StripMark }
     * 
     * 
     */
    public List<StripMark> getStripMarks() {
        if (stripMarks == null) {
            stripMarks = new ArrayList<StripMark>();
        }
        return this.stripMarks;
    }

    /**
     * Gets the value of the positions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the positions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPositions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Position }
     * 
     * 
     */
    public List<Position> getPositions() {
        if (positions == null) {
            positions = new ArrayList<Position>();
        }
        return this.positions;
    }

    /**
     * Gets the value of the workStyle property.
     * 
     * @return
     *     possible object is
     *     {@link EnumWorkStyle }
     *     
     */
    public EnumWorkStyle getWorkStyle() {
        return workStyle;
    }

    /**
     * Sets the value of the workStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumWorkStyle }
     *     
     */
    public void setWorkStyle(EnumWorkStyle value) {
        this.workStyle = value;
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
     * Gets the value of the sectionLists property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sectionLists property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSectionLists().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getSectionLists() {
        if (sectionLists == null) {
            sectionLists = new ArrayList<Integer>();
        }
        return this.sectionLists;
    }

    /**
     * Gets the value of the innermostShingling property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getInnermostShingling() {
        return innermostShingling;
    }

    /**
     * Sets the value of the innermostShingling property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setInnermostShingling(Double value) {
        this.innermostShingling = value;
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
     * Gets the value of the assemblyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssemblyID() {
        return assemblyID;
    }

    /**
     * Sets the value of the assemblyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssemblyID(String value) {
        this.assemblyID = value;
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
    public Boolean getAutomated() {
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
     * Gets the value of the outermostShingling property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOutermostShingling() {
        return outermostShingling;
    }

    /**
     * Sets the value of the outermostShingling property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOutermostShingling(Double value) {
        this.outermostShingling = value;
    }

    /**
     * Gets the value of the binderySignatureRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBinderySignatureRef() {
        return binderySignatureRef;
    }

    /**
     * Sets the value of the binderySignatureRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBinderySignatureRef(Object value) {
        this.binderySignatureRef = value;
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
     * Gets the value of the deviceRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDeviceRef() {
        return deviceRef;
    }

    /**
     * Sets the value of the deviceRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDeviceRef(Object value) {
        this.deviceRef = value;
    }

    /**
     * Gets the value of the stripCellParamsRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getStripCellParamsRef() {
        return stripCellParamsRef;
    }

    /**
     * Sets the value of the stripCellParamsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setStripCellParamsRef(Object value) {
        this.stripCellParamsRef = value;
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
