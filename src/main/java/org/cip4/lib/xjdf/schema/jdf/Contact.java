
package org.cip4.lib.xjdf.schema.jdf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Contact complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Contact">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Person" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Company" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ComChannel" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Address" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="ContactTypeDetails" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="ContactTypes" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKENS" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contact", propOrder = {
    "addresses",
    "comChannels",
    "companies",
    "persons"
})
public class Contact
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "Address")
    protected List<Address> addresses;
    @XmlElement(name = "ComChannel")
    protected List<ComChannel> comChannels;
    @XmlElement(name = "Company")
    protected List<Company> companies;
    @XmlElement(name = "Person")
    protected List<Person> persons;
    @XmlAttribute(name = "ContactTypeDetails")
    protected String contactTypeDetails;
    @XmlAttribute(name = "ContactTypes")
    protected List<String> contactTypes;

    /**
     * Gets the value of the addresses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addresses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddresses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Address }
     * 
     * 
     */
    public List<Address> getAddresses() {
        if (addresses == null) {
            addresses = new ArrayList<Address>();
        }
        return this.addresses;
    }

    /**
     * Gets the value of the comChannels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comChannels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComChannels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComChannel }
     * 
     * 
     */
    public List<ComChannel> getComChannels() {
        if (comChannels == null) {
            comChannels = new ArrayList<ComChannel>();
        }
        return this.comChannels;
    }

    /**
     * Gets the value of the companies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the companies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompanies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Company }
     * 
     * 
     */
    public List<Company> getCompanies() {
        if (companies == null) {
            companies = new ArrayList<Company>();
        }
        return this.companies;
    }

    /**
     * Gets the value of the persons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the persons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Person }
     * 
     * 
     */
    public List<Person> getPersons() {
        if (persons == null) {
            persons = new ArrayList<Person>();
        }
        return this.persons;
    }

    /**
     * Gets the value of the contactTypeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactTypeDetails() {
        return contactTypeDetails;
    }

    /**
     * Sets the value of the contactTypeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactTypeDetails(String value) {
        this.contactTypeDetails = value;
    }

    /**
     * Gets the value of the contactTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getContactTypes() {
        if (contactTypes == null) {
            contactTypes = new ArrayList<String>();
        }
        return this.contactTypes;
    }

}
