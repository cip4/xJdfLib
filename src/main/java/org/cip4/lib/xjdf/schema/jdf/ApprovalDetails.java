
package org.cip4.lib.xjdf.schema.jdf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
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
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Contact" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="ApprovalState" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ApprovalStateDetails" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="FileSpecRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "contacts"
})
@XmlRootElement(name = "ApprovalDetails")
public class ApprovalDetails
    implements Serializable
{

    @XmlElement(name = "Contact")
    protected List<Contact> contacts;
    @XmlAttribute(name = "ApprovalState")
    @XmlSchemaType(name = "anySimpleType")
    protected String approvalState;
    @XmlAttribute(name = "ApprovalStateDetails")
    protected String approvalStateDetails;
    @XmlAttribute(name = "FileSpecRef")
    @XmlIDREF
    protected Object fileSpecRef;

    /**
     * Gets the value of the contacts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contacts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContacts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contact }
     * 
     * 
     */
    public List<Contact> getContacts() {
        if (contacts == null) {
            contacts = new ArrayList<Contact>();
        }
        return this.contacts;
    }

    /**
     * Gets the value of the approvalState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovalState() {
        return approvalState;
    }

    /**
     * Sets the value of the approvalState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovalState(String value) {
        this.approvalState = value;
    }

    /**
     * Gets the value of the approvalStateDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovalStateDetails() {
        return approvalStateDetails;
    }

    /**
     * Sets the value of the approvalStateDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovalStateDetails(String value) {
        this.approvalStateDetails = value;
    }

    /**
     * Gets the value of the fileSpecRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFileSpecRef() {
        return fileSpecRef;
    }

    /**
     * Sets the value of the fileSpecRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFileSpecRef(Object value) {
        this.fileSpecRef = value;
    }

}
