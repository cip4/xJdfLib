
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BundlingParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BundlingParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;attribute name="LengthJDF" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="Copies" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BundlingParams")
public class BundlingParams
    extends ParameterType
    implements Serializable
{

    @XmlAttribute(name = "LengthJDF")
    protected Double lengthJDF;
    @XmlAttribute(name = "Copies")
    protected Integer copies;

    /**
     * Gets the value of the lengthJDF property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLengthJDF() {
        return lengthJDF;
    }

    /**
     * Sets the value of the lengthJDF property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLengthJDF(Double value) {
        this.lengthJDF = value;
    }

    /**
     * Gets the value of the copies property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCopies() {
        return copies;
    }

    /**
     * Sets the value of the copies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCopies(Integer value) {
        this.copies = value;
    }

}
