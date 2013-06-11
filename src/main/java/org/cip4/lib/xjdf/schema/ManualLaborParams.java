
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ManualLaborParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManualLaborParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;attribute name="LaborType" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManualLaborParams")
public class ManualLaborParams
    extends ParameterType
    implements Serializable
{

    @XmlAttribute(name = "LaborType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String laborType;

    /**
     * Gets the value of the laborType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLaborType() {
        return laborType;
    }

    /**
     * Sets the value of the laborType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLaborType(String value) {
        this.laborType = value;
    }

}
