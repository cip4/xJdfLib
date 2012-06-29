
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PreflightReportRulePool complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PreflightReportRulePool">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}PRRuleAttr" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}PRRule" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="MaxOccurrences" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreflightReportRulePool", propOrder = {
    "prRules",
    "prRuleAttrs"
})
public class PreflightReportRulePool
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "PRRule")
    protected List<PRRule> prRules;
    @XmlElement(name = "PRRuleAttr")
    protected List<PRRuleAttr> prRuleAttrs;
    @XmlAttribute(name = "MaxOccurrences")
    protected Integer maxOccurrences;

    /**
     * Gets the value of the prRules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prRules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPRRules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRRule }
     * 
     * 
     */
    public List<PRRule> getPRRules() {
        if (prRules == null) {
            prRules = new ArrayList<PRRule>();
        }
        return this.prRules;
    }

    /**
     * Gets the value of the prRuleAttrs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prRuleAttrs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPRRuleAttrs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRRuleAttr }
     * 
     * 
     */
    public List<PRRuleAttr> getPRRuleAttrs() {
        if (prRuleAttrs == null) {
            prRuleAttrs = new ArrayList<PRRuleAttr>();
        }
        return this.prRuleAttrs;
    }

    /**
     * Gets the value of the maxOccurrences property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxOccurrences() {
        return maxOccurrences;
    }

    /**
     * Sets the value of the maxOccurrences property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxOccurrences(Integer value) {
        this.maxOccurrences = value;
    }

}
