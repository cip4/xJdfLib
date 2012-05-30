
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


/**
 * <p>Java class for PreflightReport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PreflightReport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}PreflightReportRulePool" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}PRItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="WarningCount" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="ErrorState" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ErrorCount" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="PreflightParamsRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="RunListRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="FileSpecRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreflightReport", propOrder = {
    "prItems",
    "preflightReportRulePools"
})
public class PreflightReport
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "PRItem")
    protected List<PRItem> prItems;
    @XmlElement(name = "PreflightReportRulePool")
    protected List<PreflightReportRulePool> preflightReportRulePools;
    @XmlAttribute(name = "WarningCount")
    protected Integer warningCount;
    @XmlAttribute(name = "ErrorState")
    @XmlSchemaType(name = "anySimpleType")
    protected String errorState;
    @XmlAttribute(name = "ErrorCount")
    protected Integer errorCount;
    @XmlAttribute(name = "PreflightParamsRef")
    @XmlIDREF
    protected Object preflightParamsRef;
    @XmlAttribute(name = "RunListRef")
    @XmlIDREF
    protected Object runListRef;
    @XmlAttribute(name = "FileSpecRef")
    @XmlIDREF
    protected Object fileSpecRef;

    /**
     * Gets the value of the prItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPRItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRItem }
     * 
     * 
     */
    public List<PRItem> getPRItems() {
        if (prItems == null) {
            prItems = new ArrayList<PRItem>();
        }
        return this.prItems;
    }

    /**
     * Gets the value of the preflightReportRulePools property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preflightReportRulePools property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreflightReportRulePools().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PreflightReportRulePool }
     * 
     * 
     */
    public List<PreflightReportRulePool> getPreflightReportRulePools() {
        if (preflightReportRulePools == null) {
            preflightReportRulePools = new ArrayList<PreflightReportRulePool>();
        }
        return this.preflightReportRulePools;
    }

    /**
     * Gets the value of the warningCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWarningCount() {
        return warningCount;
    }

    /**
     * Sets the value of the warningCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWarningCount(Integer value) {
        this.warningCount = value;
    }

    /**
     * Gets the value of the errorState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorState() {
        return errorState;
    }

    /**
     * Sets the value of the errorState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorState(String value) {
        this.errorState = value;
    }

    /**
     * Gets the value of the errorCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getErrorCount() {
        return errorCount;
    }

    /**
     * Sets the value of the errorCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setErrorCount(Integer value) {
        this.errorCount = value;
    }

    /**
     * Gets the value of the preflightParamsRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPreflightParamsRef() {
        return preflightParamsRef;
    }

    /**
     * Sets the value of the preflightParamsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPreflightParamsRef(Object value) {
        this.preflightParamsRef = value;
    }

    /**
     * Gets the value of the runListRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRunListRef() {
        return runListRef;
    }

    /**
     * Sets the value of the runListRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRunListRef(Object value) {
        this.runListRef = value;
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
