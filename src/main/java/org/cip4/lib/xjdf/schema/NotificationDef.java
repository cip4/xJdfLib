
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="SignalType" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="Type" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="Classes">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.CIP4.org/JDFSchema_2_0}EnumClasses" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "NotificationDef")
public class NotificationDef
    implements Serializable
{

    @XmlAttribute(name = "SignalType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String signalType;
    @XmlAttribute(name = "Type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;
    @XmlAttribute(name = "Classes")
    protected List<EnumClasses> classes;

    /**
     * Gets the value of the signalType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignalType() {
        return signalType;
    }

    /**
     * Sets the value of the signalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignalType(String value) {
        this.signalType = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the classes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClasses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnumClasses }
     * 
     * 
     */
    public List<EnumClasses> getClasses() {
        if (classes == null) {
            classes = new ArrayList<EnumClasses>();
        }
        return this.classes;
    }

}
