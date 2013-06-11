
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
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}PreflightReportRulePool" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}PRItem" maxOccurs="unbounded" minOccurs="0"/>
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
    "preflightReportRulePool",
    "prItem"
})
public class PreflightReport
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "PreflightReportRulePool")
    protected List<PreflightReportRulePool> preflightReportRulePool;
    @XmlElement(name = "PRItem")
    protected List<PRItem> prItem;
    @XmlAttribute(name = "WarningCount")
    protected Integer warningCount;
    @XmlAttribute(name = "ErrorState")
    @XmlSchemaType(name = "anySimpleType")
    protected String errorState;
    @XmlAttribute(name = "ErrorCount")
    protected Integer errorCount;
    @XmlAttribute(name = "PreflightParamsRef")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IDREF.class)
    protected org.cip4.lib.xjdf.type.IDREF preflightParamsRef;
    @XmlAttribute(name = "RunListRef")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IDREF.class)
    protected org.cip4.lib.xjdf.type.IDREF runListRef;
    @XmlAttribute(name = "FileSpecRef")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IDREF.class)
    protected org.cip4.lib.xjdf.type.IDREF fileSpecRef;

    /**
     * Gets the value of the preflightReportRulePool property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preflightReportRulePool property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreflightReportRulePool().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PreflightReportRulePool }
     * 
     * 
     */
    public List<PreflightReportRulePool> getPreflightReportRulePool() {
        if (preflightReportRulePool == null) {
            preflightReportRulePool = new ArrayList<PreflightReportRulePool>();
        }
        return this.preflightReportRulePool;
    }

    /**
     * Gets the value of the prItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPRItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRItem }
     * 
     * 
     */
    public List<PRItem> getPRItem() {
        if (prItem == null) {
            prItem = new ArrayList<PRItem>();
        }
        return this.prItem;
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
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.IDREF getPreflightParamsRef() {
        return preflightParamsRef;
    }

    /**
     * Sets the value of the preflightParamsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreflightParamsRef(org.cip4.lib.xjdf.type.IDREF value) {
        this.preflightParamsRef = value;
    }

    /**
     * Gets the value of the runListRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.IDREF getRunListRef() {
        return runListRef;
    }

    /**
     * Sets the value of the runListRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRunListRef(org.cip4.lib.xjdf.type.IDREF value) {
        this.runListRef = value;
    }

    /**
     * Gets the value of the fileSpecRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.IDREF getFileSpecRef() {
        return fileSpecRef;
    }

    /**
     * Sets the value of the fileSpecRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileSpecRef(org.cip4.lib.xjdf.type.IDREF value) {
        this.fileSpecRef = value;
    }

}
