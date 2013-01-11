
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
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
 *       &lt;attribute name="TagNumber" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="BinaryValue" type="{http://www.CIP4.org/JDFSchema_2_0}hexBinary" />
 *       &lt;attribute name="NumberValue" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="TagType" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="StringValue" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="IntegerValue" type="{http://www.CIP4.org/JDFSchema_2_0}IntegerList" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "TIFFtag")
public class TIFFtag
    implements Serializable
{

    @XmlAttribute(name = "TagNumber")
    protected Integer tagNumber;
    @XmlAttribute(name = "BinaryValue")
    protected String binaryValue;
    @XmlAttribute(name = "NumberValue")
    protected String numberValue;
    @XmlAttribute(name = "TagType")
    protected Integer tagType;
    @XmlAttribute(name = "StringValue")
    protected String stringValue;
    @XmlAttribute(name = "IntegerValue")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IntegerList.class)
    protected org.cip4.lib.xjdf.type.IntegerList integerValue;

    /**
     * Gets the value of the tagNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTagNumber() {
        return tagNumber;
    }

    /**
     * Sets the value of the tagNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTagNumber(Integer value) {
        this.tagNumber = value;
    }

    /**
     * Gets the value of the binaryValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinaryValue() {
        return binaryValue;
    }

    /**
     * Sets the value of the binaryValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinaryValue(String value) {
        this.binaryValue = value;
    }

    /**
     * Gets the value of the numberValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberValue() {
        return numberValue;
    }

    /**
     * Sets the value of the numberValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberValue(String value) {
        this.numberValue = value;
    }

    /**
     * Gets the value of the tagType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTagType() {
        return tagType;
    }

    /**
     * Sets the value of the tagType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTagType(Integer value) {
        this.tagType = value;
    }

    /**
     * Gets the value of the stringValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringValue() {
        return stringValue;
    }

    /**
     * Sets the value of the stringValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringValue(String value) {
        this.stringValue = value;
    }

    /**
     * Gets the value of the integerValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.IntegerList getIntegerValue() {
        return integerValue;
    }

    /**
     * Sets the value of the integerValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntegerValue(org.cip4.lib.xjdf.type.IntegerList value) {
        this.integerValue = value;
    }

}
