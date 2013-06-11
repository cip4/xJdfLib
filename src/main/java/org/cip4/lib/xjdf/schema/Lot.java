
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
 *       &lt;attribute name="LotID" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="ActualAmount" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="Consumption" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Amount" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Lot")
public class Lot
    implements Serializable
{

    @XmlAttribute(name = "LotID")
    protected String lotID;
    @XmlAttribute(name = "ActualAmount")
    protected Double actualAmount;
    @XmlAttribute(name = "Consumption")
    @XmlSchemaType(name = "anySimpleType")
    protected String consumption;
    @XmlAttribute(name = "Amount")
    protected Double amount;

    /**
     * Gets the value of the lotID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLotID() {
        return lotID;
    }

    /**
     * Sets the value of the lotID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLotID(String value) {
        this.lotID = value;
    }

    /**
     * Gets the value of the actualAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getActualAmount() {
        return actualAmount;
    }

    /**
     * Sets the value of the actualAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setActualAmount(Double value) {
        this.actualAmount = value;
    }

    /**
     * Gets the value of the consumption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumption() {
        return consumption;
    }

    /**
     * Sets the value of the consumption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumption(String value) {
        this.consumption = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAmount(Double value) {
        this.amount = value;
    }

}
