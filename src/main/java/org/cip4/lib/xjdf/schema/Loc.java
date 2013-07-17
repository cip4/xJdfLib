
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
 *       &lt;attribute name="HelpText" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="ShortValue" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="Value" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="Lang" type="{http://www.CIP4.org/JDFSchema_2_0}language" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Loc")
public class Loc
    implements Serializable
{

    @XmlAttribute(name = "HelpText")
    protected String helpText;
    @XmlAttribute(name = "ShortValue")
    protected String shortValue;
    @XmlAttribute(name = "Value")
    protected String value;
    @XmlAttribute(name = "Lang")
    protected String lang;

    /**
     * Gets the value of the helpText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHelpText() {
        return helpText;
    }

    /**
     * Sets the value of the helpText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHelpText(String value) {
        this.helpText = value;
    }

    /**
     * Gets the value of the shortValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortValue() {
        return shortValue;
    }

    /**
     * Sets the value of the shortValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortValue(String value) {
        this.shortValue = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

}
