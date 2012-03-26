
package org.cip4.lib.xjdf.schema.jdf;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WrappingParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WrappingParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;attribute name="WrappingKind" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WrappingParams")
public class WrappingParams
    extends ParameterType
    implements Serializable
{

    @XmlAttribute(name = "WrappingKind")
    @XmlSchemaType(name = "anySimpleType")
    protected String wrappingKind;

    /**
     * Gets the value of the wrappingKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWrappingKind() {
        return wrappingKind;
    }

    /**
     * Sets the value of the wrappingKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWrappingKind(String value) {
        this.wrappingKind = value;
    }

}
