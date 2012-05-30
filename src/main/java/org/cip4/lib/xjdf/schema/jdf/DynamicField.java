
package org.cip4.lib.xjdf.schema.jdf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}DeviceMark" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="OrdExpression" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="ReplaceField" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="Ord" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="Format" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "deviceMarks"
})
@XmlRootElement(name = "DynamicField")
public class DynamicField
    implements Serializable
{

    @XmlElement(name = "DeviceMark")
    protected List<DeviceMark> deviceMarks;
    @XmlAttribute(name = "OrdExpression")
    protected String ordExpression;
    @XmlAttribute(name = "ReplaceField")
    protected String replaceField;
    @XmlAttribute(name = "Ord")
    protected Integer ord;
    @XmlAttribute(name = "Format")
    protected String format;

    /**
     * Gets the value of the deviceMarks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deviceMarks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeviceMarks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceMark }
     * 
     * 
     */
    public List<DeviceMark> getDeviceMarks() {
        if (deviceMarks == null) {
            deviceMarks = new ArrayList<DeviceMark>();
        }
        return this.deviceMarks;
    }

    /**
     * Gets the value of the ordExpression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdExpression() {
        return ordExpression;
    }

    /**
     * Sets the value of the ordExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdExpression(String value) {
        this.ordExpression = value;
    }

    /**
     * Gets the value of the replaceField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplaceField() {
        return replaceField;
    }

    /**
     * Sets the value of the replaceField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplaceField(String value) {
        this.replaceField = value;
    }

    /**
     * Gets the value of the ord property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrd() {
        return ord;
    }

    /**
     * Sets the value of the ord property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrd(Integer value) {
        this.ord = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

}
