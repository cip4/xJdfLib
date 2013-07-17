
package org.cip4.lib.xjdf.schema;

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
 *       &lt;attribute name="IDValue" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="DataType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="IDUsage" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "GeneralID")
public class GeneralID
    implements Serializable
{

    @XmlAttribute(name = "IDValue")
    protected String idValue;
    @XmlAttribute(name = "DataType")
    @XmlSchemaType(name = "anySimpleType")
    protected String dataType;
    @XmlAttribute(name = "IDUsage")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String idUsage;

    /**
     * Gets the value of the idValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDValue() {
        return idValue;
    }

    /**
     * Sets the value of the idValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDValue(String value) {
        this.idValue = value;
    }

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataType(String value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the idUsage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDUsage() {
        return idUsage;
    }

    /**
     * Sets the value of the idUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDUsage(String value) {
        this.idUsage = value;
    }

}
