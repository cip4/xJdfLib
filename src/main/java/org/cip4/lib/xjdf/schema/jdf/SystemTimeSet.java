
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
 *       &lt;attribute name="OldTime" type="{http://www.CIP4.org/JDFSchema_2_0}dateTime" />
 *       &lt;attribute name="NewTime" type="{http://www.CIP4.org/JDFSchema_2_0}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "SystemTimeSet")
public class SystemTimeSet
    implements Serializable
{

    @XmlAttribute(name = "OldTime")
    protected String oldTime;
    @XmlAttribute(name = "NewTime")
    protected String newTime;

    /**
     * Gets the value of the oldTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldTime() {
        return oldTime;
    }

    /**
     * Sets the value of the oldTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldTime(String value) {
        this.oldTime = value;
    }

    /**
     * Gets the value of the newTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewTime() {
        return newTime;
    }

    /**
     * Sets the value of the newTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewTime(String value) {
        this.newTime = value;
    }

}
