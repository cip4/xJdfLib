
package org.cip4.lib.xjdf.schema.jdf;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StrappingParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StrappingParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;attribute name="StrappingType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="StrapPositions" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StrappingParams")
public class StrappingParams
    extends ParameterType
    implements Serializable
{

    @XmlAttribute(name = "StrappingType")
    @XmlSchemaType(name = "anySimpleType")
    protected String strappingType;
    @XmlAttribute(name = "StrapPositions")
    protected String strapPositions;

    /**
     * Gets the value of the strappingType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrappingType() {
        return strappingType;
    }

    /**
     * Sets the value of the strappingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrappingType(String value) {
        this.strappingType = value;
    }

    /**
     * Gets the value of the strapPositions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrapPositions() {
        return strapPositions;
    }

    /**
     * Sets the value of the strapPositions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrapPositions(String value) {
        this.strapPositions = value;
    }

}
