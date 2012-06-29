
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BufferParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BufferParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;attribute name="MinimumWait" type="{http://www.CIP4.org/JDFSchema_2_0}duration" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BufferParams")
public class BufferParams
    extends ParameterType
    implements Serializable
{

    @XmlAttribute(name = "MinimumWait")
    protected String minimumWait;

    /**
     * Gets the value of the minimumWait property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinimumWait() {
        return minimumWait;
    }

    /**
     * Sets the value of the minimumWait property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinimumWait(String value) {
        this.minimumWait = value;
    }

}
