
package org.cip4.lib.xjdf.schema.jdf;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BarcodeCompParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BarcodeCompParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;attribute name="CompensationValue" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="CompensationProcess" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BarcodeCompParams")
public class BarcodeCompParams
    extends ParameterType
    implements Serializable
{

    @XmlAttribute(name = "CompensationValue")
    protected Double compensationValue;
    @XmlAttribute(name = "CompensationProcess")
    @XmlSchemaType(name = "anySimpleType")
    protected String compensationProcess;

    /**
     * Gets the value of the compensationValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCompensationValue() {
        return compensationValue;
    }

    /**
     * Sets the value of the compensationValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCompensationValue(Double value) {
        this.compensationValue = value;
    }

    /**
     * Gets the value of the compensationProcess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompensationProcess() {
        return compensationProcess;
    }

    /**
     * Sets the value of the compensationProcess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompensationProcess(String value) {
        this.compensationProcess = value;
    }

}
