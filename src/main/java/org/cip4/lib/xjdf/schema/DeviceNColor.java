
package org.cip4.lib.xjdf.schema;

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
 *       &lt;attribute name="N" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="ColorList" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="Name" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "DeviceNColor")
public class DeviceNColor
    implements Serializable
{

    @XmlAttribute(name = "N")
    protected Integer n;
    @XmlAttribute(name = "ColorList")
    protected String colorList;
    @XmlAttribute(name = "Name")
    protected String name;

    /**
     * Gets the value of the n property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getN() {
        return n;
    }

    /**
     * Sets the value of the n property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setN(Integer value) {
        this.n = value;
    }

    /**
     * Gets the value of the colorList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorList() {
        return colorList;
    }

    /**
     * Sets the value of the colorList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorList(String value) {
        this.colorList = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
