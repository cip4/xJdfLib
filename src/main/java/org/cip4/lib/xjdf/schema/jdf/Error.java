
package org.cip4.lib.xjdf.schema.jdf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ErrorData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="ErrorID" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="Resend" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ReturnCode" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "errorDatas"
})
@XmlRootElement(name = "Error")
public class Error
    implements Serializable
{

    @XmlElement(name = "ErrorData")
    protected List<ErrorData> errorDatas;
    @XmlAttribute(name = "ErrorID")
    protected String errorID;
    @XmlAttribute(name = "Resend")
    @XmlSchemaType(name = "anySimpleType")
    protected String resend;
    @XmlAttribute(name = "ReturnCode")
    protected Integer returnCode;

    /**
     * Gets the value of the errorDatas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorDatas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorDatas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorData }
     * 
     * 
     */
    public List<ErrorData> getErrorDatas() {
        if (errorDatas == null) {
            errorDatas = new ArrayList<ErrorData>();
        }
        return this.errorDatas;
    }

    /**
     * Gets the value of the errorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorID() {
        return errorID;
    }

    /**
     * Sets the value of the errorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorID(String value) {
        this.errorID = value;
    }

    /**
     * Gets the value of the resend property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResend() {
        return resend;
    }

    /**
     * Sets the value of the resend property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResend(String value) {
        this.resend = value;
    }

    /**
     * Gets the value of the returnCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReturnCode() {
        return returnCode;
    }

    /**
     * Sets the value of the returnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReturnCode(Integer value) {
        this.returnCode = value;
    }

}
