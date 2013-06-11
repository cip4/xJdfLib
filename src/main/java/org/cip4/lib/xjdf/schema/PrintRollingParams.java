
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrintRollingParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrintRollingParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;attribute name="MaxDiameter" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="Copies" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrintRollingParams")
public class PrintRollingParams
    extends ParameterType
    implements Serializable
{

    @XmlAttribute(name = "MaxDiameter")
    protected Double maxDiameter;
    @XmlAttribute(name = "Copies")
    protected Integer copies;

    /**
     * Gets the value of the maxDiameter property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxDiameter() {
        return maxDiameter;
    }

    /**
     * Sets the value of the maxDiameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxDiameter(Double value) {
        this.maxDiameter = value;
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
