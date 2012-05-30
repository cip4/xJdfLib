
package org.cip4.lib.xjdf.schema.jdf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="URLTypes">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.CIP4.org/JDFSchema_2_0}EnumURLTypes" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ControllerID" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ControllerFilter")
public class ControllerFilter
    implements Serializable
{

    @XmlAttribute(name = "URLTypes")
    protected List<EnumURLTypes> urlTypes;
    @XmlAttribute(name = "ControllerID")
    protected String controllerID;

    /**
     * Gets the value of the urlTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the urlTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getURLTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnumURLTypes }
     * 
     * 
     */
    public List<EnumURLTypes> getURLTypes() {
        if (urlTypes == null) {
            urlTypes = new ArrayList<EnumURLTypes>();
        }
        return this.urlTypes;
    }

    /**
     * Gets the value of the controllerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControllerID() {
        return controllerID;
    }

    /**
     * Sets the value of the controllerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControllerID(String value) {
        this.controllerID = value;
    }

}
