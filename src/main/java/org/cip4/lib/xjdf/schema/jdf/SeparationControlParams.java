
package org.cip4.lib.xjdf.schema.jdf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SeparationControlParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeparationControlParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}TransferFunctionControl" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="AutomatedOverPrintParamsRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeparationControlParams", propOrder = {
    "transferFunctionControls"
})
public class SeparationControlParams
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "TransferFunctionControl")
    protected List<TransferFunctionControl> transferFunctionControls;
    @XmlAttribute(name = "AutomatedOverPrintParamsRef")
    @XmlIDREF
    protected Object automatedOverPrintParamsRef;

    /**
     * Gets the value of the transferFunctionControls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transferFunctionControls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransferFunctionControls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransferFunctionControl }
     * 
     * 
     */
    public List<TransferFunctionControl> getTransferFunctionControls() {
        if (transferFunctionControls == null) {
            transferFunctionControls = new ArrayList<TransferFunctionControl>();
        }
        return this.transferFunctionControls;
    }

    /**
     * Gets the value of the automatedOverPrintParamsRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAutomatedOverPrintParamsRef() {
        return automatedOverPrintParamsRef;
    }

    /**
     * Sets the value of the automatedOverPrintParamsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAutomatedOverPrintParamsRef(Object value) {
        this.automatedOverPrintParamsRef = value;
    }

}
