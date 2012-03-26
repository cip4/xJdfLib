
package org.cip4.lib.xjdf.schema.jdf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DieLayoutProductionParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DieLayoutProductionParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Contact" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}RepeatDesc" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ConvertingConfig" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="Position" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Estimate" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DieLayoutProductionParams", propOrder = {
    "convertingConfigs",
    "repeatDescs",
    "contacts"
})
public class DieLayoutProductionParams
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "ConvertingConfig")
    protected List<ConvertingConfig> convertingConfigs;
    @XmlElement(name = "RepeatDesc")
    protected List<RepeatDesc> repeatDescs;
    @XmlElement(name = "Contact")
    protected List<Contact> contacts;
    @XmlAttribute(name = "Position")
    @XmlSchemaType(name = "anySimpleType")
    protected String position;
    @XmlAttribute(name = "Estimate")
    protected Boolean estimate;

    /**
     * Gets the value of the convertingConfigs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the convertingConfigs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConvertingConfigs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConvertingConfig }
     * 
     * 
     */
    public List<ConvertingConfig> getConvertingConfigs() {
        if (convertingConfigs == null) {
            convertingConfigs = new ArrayList<ConvertingConfig>();
        }
        return this.convertingConfigs;
    }

    /**
     * Gets the value of the repeatDescs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the repeatDescs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRepeatDescs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RepeatDesc }
     * 
     * 
     */
    public List<RepeatDesc> getRepeatDescs() {
        if (repeatDescs == null) {
            repeatDescs = new ArrayList<RepeatDesc>();
        }
        return this.repeatDescs;
    }

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
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosition(String value) {
        this.position = value;
    }

    /**
     * Gets the value of the estimate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getEstimate() {
        return estimate;
    }

    /**
     * Sets the value of the estimate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEstimate(Boolean value) {
        this.estimate = value;
    }

}
