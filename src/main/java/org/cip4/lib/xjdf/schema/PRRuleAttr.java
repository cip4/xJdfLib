
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="GroupBy" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKENS" />
 *       &lt;attribute name="LogErrors" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="ReportAttr" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKENS" />
 *       &lt;attribute name="MaxPerGroup" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="MaxGroups" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "PRRuleAttr")
public class PRRuleAttr
    implements Serializable
{

    @XmlAttribute(name = "GroupBy")
    protected List<String> groupBy;
    @XmlAttribute(name = "LogErrors")
    protected Integer logErrors;
    @XmlAttribute(name = "ReportAttr")
    protected List<String> reportAttr;
    @XmlAttribute(name = "MaxPerGroup")
    protected Integer maxPerGroup;
    @XmlAttribute(name = "MaxGroups")
    protected Integer maxGroups;

    /**
     * Gets the value of the groupBy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupBy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupBy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getGroupBy() {
        if (groupBy == null) {
            groupBy = new ArrayList<String>();
        }
        return this.groupBy;
    }

    /**
     * Gets the value of the logErrors property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLogErrors() {
        return logErrors;
    }

    /**
     * Sets the value of the logErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLogErrors(Integer value) {
        this.logErrors = value;
    }

    /**
     * Gets the value of the reportAttr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reportAttr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReportAttr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getReportAttr() {
        if (reportAttr == null) {
            reportAttr = new ArrayList<String>();
        }
        return this.reportAttr;
    }

    /**
     * Gets the value of the maxPerGroup property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxPerGroup() {
        return maxPerGroup;
    }

    /**
     * Sets the value of the maxPerGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxPerGroup(Integer value) {
        this.maxPerGroup = value;
    }

    /**
     * Gets the value of the maxGroups property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxGroups() {
        return maxGroups;
    }

    /**
     * Sets the value of the maxGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxGroups(Integer value) {
        this.maxGroups = value;
    }

}
