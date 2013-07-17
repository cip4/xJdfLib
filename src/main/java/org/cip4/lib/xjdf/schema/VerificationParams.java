
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VerificationParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VerificationParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;attribute name="InsertError" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="FieldRange" type="{http://www.CIP4.org/JDFSchema_2_0}IntegerRangeList" />
 *       &lt;attribute name="InsertOK" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="Tolerance" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerificationParams")
public class VerificationParams
    extends ParameterType
    implements Serializable
{

    @XmlAttribute(name = "InsertError")
    protected String insertError;
    @XmlAttribute(name = "FieldRange")
    protected Integer fieldRange;
    @XmlAttribute(name = "InsertOK")
    protected String insertOK;
    @XmlAttribute(name = "Tolerance")
    protected Double tolerance;

    /**
     * Gets the value of the insertError property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsertError() {
        return insertError;
    }

    /**
     * Sets the value of the insertError property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsertError(String value) {
        this.insertError = value;
    }

    /**
     * Gets the value of the fieldRange property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFieldRange() {
        return fieldRange;
    }

    /**
     * Sets the value of the fieldRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFieldRange(Integer value) {
        this.fieldRange = value;
    }

    /**
     * Gets the value of the insertOK property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsertOK() {
        return insertOK;
    }

    /**
     * Sets the value of the insertOK property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsertOK(String value) {
        this.insertOK = value;
    }

    /**
     * Gets the value of the tolerance property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTolerance() {
        return tolerance;
    }

    /**
     * Sets the value of the tolerance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTolerance(Double value) {
        this.tolerance = value;
    }

}
