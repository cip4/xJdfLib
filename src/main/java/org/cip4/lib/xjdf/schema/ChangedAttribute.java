
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="OldValue" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="AttributeName" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="NewValue" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="ElementType" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="ElementID" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ChangedAttribute")
public class ChangedAttribute
    implements Serializable
{

    @XmlAttribute(name = "OldValue")
    protected String oldValue;
    @XmlAttribute(name = "AttributeName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String attributeName;
    @XmlAttribute(name = "NewValue")
    protected String newValue;
    @XmlAttribute(name = "ElementType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String elementType;
    @XmlAttribute(name = "ElementID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String elementID;

    /**
     * Gets the value of the oldValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldValue() {
        return oldValue;
    }

    /**
     * Sets the value of the oldValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldValue(String value) {
        this.oldValue = value;
    }

    /**
     * Gets the value of the attributeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeName() {
        return attributeName;
    }

    /**
     * Sets the value of the attributeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeName(String value) {
        this.attributeName = value;
    }

    /**
     * Gets the value of the newValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewValue() {
        return newValue;
    }

    /**
     * Sets the value of the newValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewValue(String value) {
        this.newValue = value;
    }

    /**
     * Gets the value of the elementType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElementType() {
        return elementType;
    }

    /**
     * Sets the value of the elementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElementType(String value) {
        this.elementType = value;
    }

    /**
     * Gets the value of the elementID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElementID() {
        return elementID;
    }

    /**
     * Sets the value of the elementID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElementID(String value) {
        this.elementID = value;
    }

}
