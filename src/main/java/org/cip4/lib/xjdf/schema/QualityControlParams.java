
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QualityControlParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QualityControlParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;attribute name="SampleInterval" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="TimeInterval" type="{http://www.CIP4.org/JDFSchema_2_0}duration" />
 *       &lt;attribute name="BindingQualityParamsRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QualityControlParams")
public class QualityControlParams
    extends ParameterType
    implements Serializable
{

    @XmlAttribute(name = "SampleInterval")
    protected Integer sampleInterval;
    @XmlAttribute(name = "TimeInterval")
    protected String timeInterval;
    @XmlAttribute(name = "BindingQualityParamsRef")
    @XmlIDREF
    protected Object bindingQualityParamsRef;

    /**
     * Gets the value of the sampleInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSampleInterval() {
        return sampleInterval;
    }

    /**
     * Sets the value of the sampleInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSampleInterval(Integer value) {
        this.sampleInterval = value;
    }

    /**
     * Gets the value of the timeInterval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeInterval() {
        return timeInterval;
    }

    /**
     * Sets the value of the timeInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeInterval(String value) {
        this.timeInterval = value;
    }

    /**
     * Gets the value of the bindingQualityParamsRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBindingQualityParamsRef() {
        return bindingQualityParamsRef;
    }

    /**
     * Sets the value of the bindingQualityParamsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBindingQualityParamsRef(Object value) {
        this.bindingQualityParamsRef = value;
    }

}
