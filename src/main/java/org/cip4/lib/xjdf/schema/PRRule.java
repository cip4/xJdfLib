
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
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}PRRuleAttr" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="ActionRefs" type="{http://www.CIP4.org/JDFSchema_2_0}IDREFS" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "prRuleAttrs"
})
@XmlRootElement(name = "PRRule")
public class PRRule
    implements Serializable
{

    @XmlElement(name = "PRRuleAttr")
    protected List<PRRuleAttr> prRuleAttrs;
    @XmlAttribute(name = "ActionRefs")
    @XmlIDREF
    protected List<Object> actionRefs;

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
     * Gets the value of the actionRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actionRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActionRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getActionRefs() {
        if (actionRefs == null) {
            actionRefs = new ArrayList<Object>();
        }
        return this.actionRefs;
    }

}
