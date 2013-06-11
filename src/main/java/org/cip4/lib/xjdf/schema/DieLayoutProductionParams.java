
package org.cip4.lib.xjdf.schema;

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
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Contact" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}RepeatDesc" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ConvertingConfig" maxOccurs="unbounded" minOccurs="0"/>
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
    "contact",
    "repeatDesc",
    "convertingConfig"
})
public class DieLayoutProductionParams
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "Contact")
    protected List<Contact> contact;
    @XmlElement(name = "RepeatDesc")
    protected List<RepeatDesc> repeatDesc;
    @XmlElement(name = "ConvertingConfig")
    protected List<ConvertingConfig> convertingConfig;
    @XmlAttribute(name = "Position")
    @XmlSchemaType(name = "anySimpleType")
    protected String position;
    @XmlAttribute(name = "Estimate")
    protected Boolean estimate;

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
     * Gets the value of the repeatDesc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the repeatDesc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRepeatDesc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RepeatDesc }
     * 
     * 
     */
    public List<RepeatDesc> getRepeatDesc() {
        if (repeatDesc == null) {
            repeatDesc = new ArrayList<RepeatDesc>();
        }
        return this.repeatDesc;
    }

    /**
     * Gets the value of the convertingConfig property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the convertingConfig property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConvertingConfig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConvertingConfig }
     * 
     * 
     */
    public List<ConvertingConfig> getConvertingConfig() {
        if (convertingConfig == null) {
            convertingConfig = new ArrayList<ConvertingConfig>();
        }
        return this.convertingConfig;
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
    public Boolean isEstimate() {
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
