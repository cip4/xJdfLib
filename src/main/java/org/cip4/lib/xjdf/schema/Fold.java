
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Fold complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Fold">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;attribute name="To" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="From" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="RelativeTravel" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="Travel" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Fold")
public class Fold
    extends ParameterType
    implements Serializable
{

    @XmlAttribute(name = "To")
    @XmlSchemaType(name = "anySimpleType")
    protected String to;
    @XmlAttribute(name = "From")
    @XmlSchemaType(name = "anySimpleType")
    protected String from;
    @XmlAttribute(name = "RelativeTravel")
    protected Double relativeTravel;
    @XmlAttribute(name = "Travel")
    protected Double travel;

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTo(String value) {
        this.to = value;
    }

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrom(String value) {
        this.from = value;
    }

    /**
     * Gets the value of the relativeTravel property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRelativeTravel() {
        return relativeTravel;
    }

    /**
     * Sets the value of the relativeTravel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRelativeTravel(Double value) {
        this.relativeTravel = value;
    }

    /**
     * Gets the value of the travel property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTravel() {
        return travel;
    }

    /**
     * Sets the value of the travel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTravel(Double value) {
        this.travel = value;
    }

}
