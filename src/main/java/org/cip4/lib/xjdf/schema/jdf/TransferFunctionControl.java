
package org.cip4.lib.xjdf.schema.jdf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferFunctionControl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransferFunctionControl">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}TransferCurvePool" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="TransferFunctionSource" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferFunctionControl", propOrder = {
    "transferCurvePools"
})
public class TransferFunctionControl
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "TransferCurvePool")
    protected List<TransferCurvePool> transferCurvePools;
    @XmlAttribute(name = "TransferFunctionSource")
    @XmlSchemaType(name = "anySimpleType")
    protected String transferFunctionSource;

    /**
     * Gets the value of the transferCurvePools property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transferCurvePools property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransferCurvePools().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransferCurvePool }
     * 
     * 
     */
    public List<TransferCurvePool> getTransferCurvePools() {
        if (transferCurvePools == null) {
            transferCurvePools = new ArrayList<TransferCurvePool>();
        }
        return this.transferCurvePools;
    }

    /**
     * Gets the value of the transferFunctionSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferFunctionSource() {
        return transferFunctionSource;
    }

    /**
     * Sets the value of the transferFunctionSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferFunctionSource(String value) {
        this.transferFunctionSource = value;
    }

}
