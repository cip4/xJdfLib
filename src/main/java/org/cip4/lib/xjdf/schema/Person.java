
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Person complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Person">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ComChannel" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Address" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="JobTitle" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="NamePrefix" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="AdditionalNames" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="Languages" type="{http://www.CIP4.org/JDFSchema_2_0}languages" />
 *       &lt;attribute name="FamilyName" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="FirstName" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="NameSuffix" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Person", propOrder = {
    "comChannel",
    "address"
})
public class Person
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "ComChannel")
    protected List<ComChannel> comChannel;
    @XmlElement(name = "Address")
    protected List<Address> address;
    @XmlAttribute(name = "JobTitle")
    protected String jobTitle;
    @XmlAttribute(name = "NamePrefix")
    protected String namePrefix;
    @XmlAttribute(name = "AdditionalNames")
    protected String additionalNames;
    @XmlAttribute(name = "Languages")
    protected List<String> languages;
    @XmlAttribute(name = "FamilyName")
    protected String familyName;
    @XmlAttribute(name = "FirstName")
    protected String firstName;
    @XmlAttribute(name = "NameSuffix")
    protected String nameSuffix;

    /**
     * Gets the value of the comChannel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comChannel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComChannel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComChannel }
     * 
     * 
     */
    public List<ComChannel> getComChannel() {
        if (comChannel == null) {
            comChannel = new ArrayList<ComChannel>();
        }
        return this.comChannel;
    }

    /**
     * Gets the value of the address property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Address }
     * 
     * 
     */
    public List<Address> getAddress() {
        if (address == null) {
            address = new ArrayList<Address>();
        }
        return this.address;
    }

    /**
     * Gets the value of the jobTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Sets the value of the jobTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobTitle(String value) {
        this.jobTitle = value;
    }

    /**
     * Gets the value of the namePrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamePrefix() {
        return namePrefix;
    }

    /**
     * Sets the value of the namePrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamePrefix(String value) {
        this.namePrefix = value;
    }

    /**
     * Gets the value of the additionalNames property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalNames() {
        return additionalNames;
    }

    /**
     * Sets the value of the additionalNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalNames(String value) {
        this.additionalNames = value;
    }

    /**
     * Gets the value of the languages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the languages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLanguages() {
        if (languages == null) {
            languages = new ArrayList<String>();
        }
        return this.languages;
    }

    /**
     * Gets the value of the familyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilyName() {
        return familyName;
    }

    /**
     * Sets the value of the familyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilyName(String value) {
        this.familyName = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the nameSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameSuffix() {
        return nameSuffix;
    }

    /**
     * Sets the value of the nameSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameSuffix(String value) {
        this.nameSuffix = value;
    }

}
