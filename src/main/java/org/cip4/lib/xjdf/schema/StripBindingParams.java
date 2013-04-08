
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for StripBindingParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StripBindingParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;attribute name="LengthJDF" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="StripColorDetails" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="StripColor" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="HoleMakingParamsRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StripBindingParams")
public class StripBindingParams
    extends ParameterType
    implements Serializable
{

    @XmlAttribute(name = "LengthJDF")
    protected Double lengthJDF;
    @XmlAttribute(name = "StripColorDetails")
    protected String stripColorDetails;
    @XmlAttribute(name = "StripColor")
    protected String stripColor;
    @XmlAttribute(name = "HoleMakingParamsRef")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IDREF.class)
    protected org.cip4.lib.xjdf.type.IDREF holeMakingParamsRef;

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
     * Gets the value of the stripColorDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStripColorDetails() {
        return stripColorDetails;
    }

    /**
     * Sets the value of the stripColorDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStripColorDetails(String value) {
        this.stripColorDetails = value;
    }

    /**
     * Gets the value of the stripColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStripColor() {
        return stripColor;
    }

    /**
     * Sets the value of the stripColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStripColor(String value) {
        this.stripColor = value;
    }

    /**
     * Gets the value of the holeMakingParamsRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.IDREF getHoleMakingParamsRef() {
        return holeMakingParamsRef;
    }

    /**
     * Sets the value of the holeMakingParamsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoleMakingParamsRef(org.cip4.lib.xjdf.type.IDREF value) {
        this.holeMakingParamsRef = value;
    }

}
