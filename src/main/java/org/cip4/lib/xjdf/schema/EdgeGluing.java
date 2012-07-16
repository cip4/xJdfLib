
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="EdgeGlue" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "EdgeGluing")
public class EdgeGluing
    implements Serializable
{

    @XmlAttribute(name = "EdgeGlue")
    @XmlSchemaType(name = "anySimpleType")
    protected String edgeGlue;

    /**
     * Gets the value of the edgeGlue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEdgeGlue() {
        return edgeGlue;
    }

    /**
     * Sets the value of the edgeGlue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEdgeGlue(String value) {
        this.edgeGlue = value;
    }

}