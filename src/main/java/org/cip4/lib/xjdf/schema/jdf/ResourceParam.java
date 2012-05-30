
package org.cip4.lib.xjdf.schema.jdf;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *       &lt;attribute name="DefaultJDF" type="{http://www.CIP4.org/JDFSchema_2_0}URL" />
 *       &lt;attribute name="DefaultPriority" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="DefaultID" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ResourceParam")
public class ResourceParam
    implements Serializable
{

    @XmlAttribute(name = "DefaultJDF")
    protected String defaultJDF;
    @XmlAttribute(name = "DefaultPriority")
    @XmlSchemaType(name = "anySimpleType")
    protected String defaultPriority;
    @XmlAttribute(name = "DefaultID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String defaultID;

    /**
     * Gets the value of the defaultJDF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultJDF() {
        return defaultJDF;
    }

    /**
     * Sets the value of the defaultJDF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultJDF(String value) {
        this.defaultJDF = value;
    }

    /**
     * Gets the value of the defaultPriority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultPriority() {
        return defaultPriority;
    }

    /**
     * Sets the value of the defaultPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultPriority(String value) {
        this.defaultPriority = value;
    }

    /**
     * Gets the value of the defaultID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultID() {
        return defaultID;
    }

    /**
     * Sets the value of the defaultID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultID(String value) {
        this.defaultID = value;
    }

}
