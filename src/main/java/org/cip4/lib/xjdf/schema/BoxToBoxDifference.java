
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="ToBox" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="FromBox" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "BoxToBoxDifference")
public class BoxToBoxDifference
    implements Serializable
{

    @XmlAttribute(name = "ToBox")
    @XmlSchemaType(name = "anySimpleType")
    protected String toBox;
    @XmlAttribute(name = "FromBox")
    @XmlSchemaType(name = "anySimpleType")
    protected String fromBox;

    /**
     * Gets the value of the toBox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToBox() {
        return toBox;
    }

    /**
     * Sets the value of the toBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToBox(String value) {
        this.toBox = value;
    }

    /**
     * Gets the value of the fromBox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromBox() {
        return fromBox;
    }

    /**
     * Sets the value of the fromBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromBox(String value) {
        this.fromBox = value;
    }

}
