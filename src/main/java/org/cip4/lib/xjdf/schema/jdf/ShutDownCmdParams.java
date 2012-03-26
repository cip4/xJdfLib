
package org.cip4.lib.xjdf.schema.jdf;

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
 *       &lt;attribute name="ShutDownType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="FlushQueueParamsRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ShutDownCmdParams")
public class ShutDownCmdParams
    implements Serializable
{

    @XmlAttribute(name = "ShutDownType")
    @XmlSchemaType(name = "anySimpleType")
    protected String shutDownType;
    @XmlAttribute(name = "FlushQueueParamsRef")
    @XmlIDREF
    protected Object flushQueueParamsRef;

    /**
     * Gets the value of the shutDownType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShutDownType() {
        return shutDownType;
    }

    /**
     * Sets the value of the shutDownType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShutDownType(String value) {
        this.shutDownType = value;
    }

    /**
     * Gets the value of the flushQueueParamsRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFlushQueueParamsRef() {
        return flushQueueParamsRef;
    }

    /**
     * Sets the value of the flushQueueParamsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFlushQueueParamsRef(Object value) {
        this.flushQueueParamsRef = value;
    }

}
