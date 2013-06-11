
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
 *       &lt;attribute name="K" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="Uncompressed" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="EncodedByteAlign" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="EndOfBlock" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="EndOfLine" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "CCITTFaxParams")
public class CCITTFaxParams
    implements Serializable
{

    @XmlAttribute(name = "K")
    protected Integer k;
    @XmlAttribute(name = "Uncompressed")
    protected Boolean uncompressed;
    @XmlAttribute(name = "EncodedByteAlign")
    protected Boolean encodedByteAlign;
    @XmlAttribute(name = "EndOfBlock")
    protected Boolean endOfBlock;
    @XmlAttribute(name = "EndOfLine")
    protected Boolean endOfLine;

    /**
     * Gets the value of the k property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getK() {
        return k;
    }

    /**
     * Sets the value of the k property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setK(Integer value) {
        this.k = value;
    }

    /**
     * Gets the value of the uncompressed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUncompressed() {
        return uncompressed;
    }

    /**
     * Sets the value of the uncompressed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUncompressed(Boolean value) {
        this.uncompressed = value;
    }

    /**
     * Gets the value of the encodedByteAlign property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEncodedByteAlign() {
        return encodedByteAlign;
    }

    /**
     * Sets the value of the encodedByteAlign property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEncodedByteAlign(Boolean value) {
        this.encodedByteAlign = value;
    }

    /**
     * Gets the value of the endOfBlock property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEndOfBlock() {
        return endOfBlock;
    }

    /**
     * Sets the value of the endOfBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEndOfBlock(Boolean value) {
        this.endOfBlock = value;
    }

    /**
     * Gets the value of the endOfLine property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEndOfLine() {
        return endOfLine;
    }

    /**
     * Sets the value of the endOfLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEndOfLine(Boolean value) {
        this.endOfLine = value;
    }

}
