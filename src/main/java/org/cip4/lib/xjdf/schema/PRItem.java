
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
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}PRError" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="PageSet" type="{http://www.CIP4.org/JDFSchema_2_0}IntegerRangeList" />
 *       &lt;attribute name="Occurrences" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="ActionRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "prErrors"
})
@XmlRootElement(name = "PRItem")
public class PRItem
    implements Serializable
{

    @XmlElement(name = "PRError")
    protected List<PRError> prErrors;
    @XmlAttribute(name = "PageSet")
    protected Integer pageSet;
    @XmlAttribute(name = "Occurrences")
    protected Integer occurrences;
    @XmlAttribute(name = "ActionRef")
    @XmlIDREF
    protected Object actionRef;

    /**
     * Gets the value of the prErrors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prErrors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPRErrors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRError }
     * 
     * 
     */
    public List<PRError> getPRErrors() {
        if (prErrors == null) {
            prErrors = new ArrayList<PRError>();
        }
        return this.prErrors;
    }

    /**
     * Gets the value of the pageSet property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageSet() {
        return pageSet;
    }

    /**
     * Sets the value of the pageSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageSet(Integer value) {
        this.pageSet = value;
    }

    /**
     * Gets the value of the occurrences property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOccurrences() {
        return occurrences;
    }

    /**
     * Sets the value of the occurrences property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOccurrences(Integer value) {
        this.occurrences = value;
    }

    /**
     * Gets the value of the actionRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getActionRef() {
        return actionRef;
    }

    /**
     * Sets the value of the actionRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setActionRef(Object value) {
        this.actionRef = value;
    }

}
