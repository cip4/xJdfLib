
package org.cip4.lib.xjdf.schema.jdf;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BendingParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BendingParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;attribute name="Bend" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="PunchType" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="Punch" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BendingParams")
public class BendingParams
    extends ParameterType
    implements Serializable
{

    @XmlAttribute(name = "Bend")
    protected Boolean bend;
    @XmlAttribute(name = "PunchType")
    protected String punchType;
    @XmlAttribute(name = "Punch")
    protected Boolean punch;

    /**
     * Gets the value of the bend property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBend() {
        return bend;
    }

    /**
     * Sets the value of the bend property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBend(Boolean value) {
        this.bend = value;
    }

    /**
     * Gets the value of the punchType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPunchType() {
        return punchType;
    }

    /**
     * Sets the value of the punchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPunchType(String value) {
        this.punchType = value;
    }

    /**
     * Gets the value of the punch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPunch() {
        return punch;
    }

    /**
     * Sets the value of the punch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPunch(Boolean value) {
        this.punch = value;
    }

}
