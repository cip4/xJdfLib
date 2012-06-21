
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
 *       &lt;attribute name="UserDisplay" type="{http://www.CIP4.org/JDFSchema_2_0}EnumUserDisplay" />
 *       &lt;attribute name="CurrentValue" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="Editable" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "FeatureAttribute")
public class FeatureAttribute
    implements Serializable
{

    @XmlAttribute(name = "UserDisplay")
    protected EnumUserDisplay userDisplay;
    @XmlAttribute(name = "CurrentValue")
    protected String currentValue;
    @XmlAttribute(name = "Editable")
    protected Boolean editable;

    /**
     * Gets the value of the userDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link EnumUserDisplay }
     *     
     */
    public EnumUserDisplay getUserDisplay() {
        return userDisplay;
    }

    /**
     * Sets the value of the userDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumUserDisplay }
     *     
     */
    public void setUserDisplay(EnumUserDisplay value) {
        this.userDisplay = value;
    }

    /**
     * Gets the value of the currentValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentValue() {
        return currentValue;
    }

    /**
     * Sets the value of the currentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentValue(String value) {
        this.currentValue = value;
    }

    /**
     * Gets the value of the editable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEditable() {
        return editable;
    }

    /**
     * Sets the value of the editable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEditable(Boolean value) {
        this.editable = value;
    }

}
