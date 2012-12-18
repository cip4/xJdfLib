
package org.cip4.lib.xjdf.schema;

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
 * <p>Java class for BlockPreparationParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BlockPreparationParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}RegisterRibbon" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="Rounding" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="Backing" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="TightBacking" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BlockPreparationParams", propOrder = {
    "registerRibbon"
})
public class BlockPreparationParams
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "RegisterRibbon")
    protected List<RegisterRibbon> registerRibbon;
    @XmlAttribute(name = "Rounding")
    protected Double rounding;
    @XmlAttribute(name = "Backing")
    protected Double backing;
    @XmlAttribute(name = "TightBacking")
    @XmlSchemaType(name = "anySimpleType")
    protected String tightBacking;

    /**
     * Gets the value of the registerRibbon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registerRibbon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegisterRibbon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegisterRibbon }
     * 
     * 
     */
    public List<RegisterRibbon> getRegisterRibbon() {
        if (registerRibbon == null) {
            registerRibbon = new ArrayList<RegisterRibbon>();
        }
        return this.registerRibbon;
    }

    /**
     * Gets the value of the rounding property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRounding() {
        return rounding;
    }

    /**
     * Sets the value of the rounding property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRounding(Double value) {
        this.rounding = value;
    }

    /**
     * Gets the value of the backing property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBacking() {
        return backing;
    }

    /**
     * Sets the value of the backing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBacking(Double value) {
        this.backing = value;
    }

    /**
     * Gets the value of the tightBacking property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTightBacking() {
        return tightBacking;
    }

    /**
     * Sets the value of the tightBacking property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTightBacking(String value) {
        this.tightBacking = value;
    }

}
