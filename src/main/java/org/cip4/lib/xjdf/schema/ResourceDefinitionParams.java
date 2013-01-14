
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
 * <p>Java class for ResourceDefinitionParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResourceDefinitionParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ResourceParam" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="DefaultPriority" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="DefaultJDF" type="{http://www.CIP4.org/JDFSchema_2_0}URL" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceDefinitionParams", propOrder = {
    "resourceParam"
})
public class ResourceDefinitionParams
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "ResourceParam")
    protected List<ResourceParam> resourceParam;
    @XmlAttribute(name = "DefaultPriority")
    @XmlSchemaType(name = "anySimpleType")
    protected String defaultPriority;
    @XmlAttribute(name = "DefaultJDF")
    protected String defaultJDF;

    /**
     * Gets the value of the resourceParam property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceParam property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceParam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceParam }
     * 
     * 
     */
    public List<ResourceParam> getResourceParam() {
        if (resourceParam == null) {
            resourceParam = new ArrayList<ResourceParam>();
        }
        return this.resourceParam;
    }

    /**
     * Gets the value of the defaultPriority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultPriority() {
        return defaultPriority;
    }

    /**
     * Sets the value of the defaultPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultPriority(String value) {
        this.defaultPriority = value;
    }

    /**
     * Gets the value of the defaultJDF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultJDF() {
        return defaultJDF;
    }

    /**
     * Sets the value of the defaultJDF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultJDF(String value) {
        this.defaultJDF = value;
    }

}
