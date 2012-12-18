
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}QueueFilter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="FlushPolicy" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "queueFilter"
})
@XmlRootElement(name = "FlushResourceParams")
public class FlushResourceParams
    implements Serializable
{

    @XmlElement(name = "QueueFilter")
    protected List<QueueFilter> queueFilter;
    @XmlAttribute(name = "FlushPolicy")
    @XmlSchemaType(name = "anySimpleType")
    protected String flushPolicy;

    /**
     * Gets the value of the queueFilter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queueFilter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueueFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueueFilter }
     * 
     * 
     */
    public List<QueueFilter> getQueueFilter() {
        if (queueFilter == null) {
            queueFilter = new ArrayList<QueueFilter>();
        }
        return this.queueFilter;
    }

    /**
     * Gets the value of the flushPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlushPolicy() {
        return flushPolicy;
    }

    /**
     * Sets the value of the flushPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlushPolicy(String value) {
        this.flushPolicy = value;
    }

}
