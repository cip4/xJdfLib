
package org.cip4.lib.xjdf.schema.jdf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}PreflightInstanceDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="Identifier" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="PageRefs" type="{http://www.CIP4.org/JDFSchema_2_0}IntegerRangeList" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "preflightInstanceDetails"
})
@XmlRootElement(name = "PreflightInstance")
public class PreflightInstance
    implements Serializable
{

    @XmlElement(name = "PreflightInstanceDetail")
    protected List<PreflightInstanceDetail> preflightInstanceDetails;
    @XmlAttribute(name = "Identifier")
    protected String identifier;
    @XmlAttribute(name = "PageRefs")
    protected Integer pageRefs;

    /**
     * Gets the value of the preflightInstanceDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preflightInstanceDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreflightInstanceDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PreflightInstanceDetail }
     * 
     * 
     */
    public List<PreflightInstanceDetail> getPreflightInstanceDetails() {
        if (preflightInstanceDetails == null) {
            preflightInstanceDetails = new ArrayList<PreflightInstanceDetail>();
        }
        return this.preflightInstanceDetails;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the pageRefs property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageRefs() {
        return pageRefs;
    }

    /**
     * Sets the value of the pageRefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageRefs(Integer value) {
        this.pageRefs = value;
    }

}
