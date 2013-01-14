
package org.cip4.lib.xjdf.schema;

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
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Contact" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ApprovalRole" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ApprovalRoleDetails" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "contact"
})
@XmlRootElement(name = "ApprovalPerson")
public class ApprovalPerson
    implements Serializable
{

    @XmlElement(name = "Contact")
    protected List<Contact> contact;
    @XmlAttribute(name = "ApprovalRole")
    @XmlSchemaType(name = "anySimpleType")
    protected String approvalRole;
    @XmlAttribute(name = "ApprovalRoleDetails")
    protected String approvalRoleDetails;

    /**
     * Gets the value of the contact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contact }
     * 
     * 
     */
    public List<Contact> getContact() {
        if (contact == null) {
            contact = new ArrayList<Contact>();
        }
        return this.contact;
    }

    /**
     * Gets the value of the approvalRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovalRole() {
        return approvalRole;
    }

    /**
     * Sets the value of the approvalRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovalRole(String value) {
        this.approvalRole = value;
    }

    /**
     * Gets the value of the approvalRoleDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovalRoleDetails() {
        return approvalRoleDetails;
    }

    /**
     * Sets the value of the approvalRoleDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovalRoleDetails(String value) {
        this.approvalRoleDetails = value;
    }

}
