
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="Localization" type="{http://www.CIP4.org/JDFSchema_2_0}languages" />
 *       &lt;attribute name="DeviceDetails" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="DeviceRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "DeviceFilter")
public class DeviceFilter
    implements Serializable
{

    @XmlAttribute(name = "Localization")
    protected List<String> localization;
    @XmlAttribute(name = "DeviceDetails")
    @XmlSchemaType(name = "anySimpleType")
    protected String deviceDetails;
    @XmlAttribute(name = "DeviceRef")
    @XmlIDREF
    protected Object deviceRef;

    /**
     * Gets the value of the localization property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the localization property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocalization().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLocalization() {
        if (localization == null) {
            localization = new ArrayList<String>();
        }
        return this.localization;
    }

    /**
     * Gets the value of the deviceDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceDetails() {
        return deviceDetails;
    }

    /**
     * Sets the value of the deviceDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceDetails(String value) {
        this.deviceDetails = value;
    }

    /**
     * Gets the value of the deviceRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDeviceRef() {
        return deviceRef;
    }

    /**
     * Sets the value of the deviceRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDeviceRef(Object value) {
        this.deviceRef = value;
    }

}
