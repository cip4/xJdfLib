
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
 *       &lt;attribute name="Path" type="{http://www.CIP4.org/JDFSchema_2_0}XPath" />
 *       &lt;attribute name="FixExpression" type="{http://www.CIP4.org/JDFSchema_2_0}Any" />
 *       &lt;attribute name="ErrorURL" type="{http://www.CIP4.org/JDFSchema_2_0}URI" />
 *       &lt;attribute name="ErrorType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ErrorData")
public class ErrorData
    implements Serializable
{

    @XmlAttribute(name = "Path")
    protected String path;
    @XmlAttribute(name = "FixExpression")
    protected String fixExpression;
    @XmlAttribute(name = "ErrorURL")
    protected String errorURL;
    @XmlAttribute(name = "ErrorType")
    @XmlSchemaType(name = "anySimpleType")
    protected String errorType;

    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPath(String value) {
        this.path = value;
    }

    /**
     * Gets the value of the fixExpression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFixExpression() {
        return fixExpression;
    }

    /**
     * Sets the value of the fixExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFixExpression(String value) {
        this.fixExpression = value;
    }

    /**
     * Gets the value of the errorURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorURL() {
        return errorURL;
    }

    /**
     * Sets the value of the errorURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorURL(String value) {
        this.errorURL = value;
    }

    /**
     * Gets the value of the errorType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorType() {
        return errorType;
    }

    /**
     * Sets the value of the errorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorType(String value) {
        this.errorType = value;
    }

}
