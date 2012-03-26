
package org.cip4.lib.xjdf.schema.jdf;

import java.io.Serializable;
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
 *       &lt;attribute name="ParentJobID" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="ParentJobPartID" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "RemoveLink")
public class RemoveLink
    implements Serializable
{

    @XmlAttribute(name = "ParentJobID")
    protected String parentJobID;
    @XmlAttribute(name = "ParentJobPartID")
    protected String parentJobPartID;

    /**
     * Gets the value of the parentJobID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentJobID() {
        return parentJobID;
    }

    /**
     * Sets the value of the parentJobID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentJobID(String value) {
        this.parentJobID = value;
    }

    /**
     * Gets the value of the parentJobPartID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentJobPartID() {
        return parentJobPartID;
    }

    /**
     * Sets the value of the parentJobPartID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentJobPartID(String value) {
        this.parentJobPartID = value;
    }

}
