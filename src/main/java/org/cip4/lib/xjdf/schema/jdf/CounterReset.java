
package org.cip4.lib.xjdf.schema.jdf;

import java.io.Serializable;
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
 *       &lt;attribute name="LastCount" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="CounterID" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "CounterReset")
public class CounterReset
    implements Serializable
{

    @XmlAttribute(name = "LastCount")
    protected Integer lastCount;
    @XmlAttribute(name = "CounterID")
    protected String counterID;

    /**
     * Gets the value of the lastCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLastCount() {
        return lastCount;
    }

    /**
     * Sets the value of the lastCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLastCount(Integer value) {
        this.lastCount = value;
    }

    /**
     * Gets the value of the counterID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounterID() {
        return counterID;
    }

    /**
     * Sets the value of the counterID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounterID(String value) {
        this.counterID = value;
    }

}
