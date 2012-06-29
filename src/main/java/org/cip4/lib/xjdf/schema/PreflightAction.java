
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
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
 *       &lt;attribute name="SetRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="SetSplitBy" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "PreflightAction")
public class PreflightAction
    implements Serializable
{

    @XmlAttribute(name = "SetRef")
    @XmlIDREF
    protected Object setRef;
    @XmlAttribute(name = "SetSplitBy")
    @XmlSchemaType(name = "anySimpleType")
    protected String setSplitBy;

    /**
     * Gets the value of the setRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSetRef() {
        return setRef;
    }

    /**
     * Sets the value of the setRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSetRef(Object value) {
        this.setRef = value;
    }

    /**
     * Gets the value of the setSplitBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSetSplitBy() {
        return setSplitBy;
    }

    /**
     * Sets the value of the setSplitBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSetSplitBy(String value) {
        this.setSplitBy = value;
    }

}
