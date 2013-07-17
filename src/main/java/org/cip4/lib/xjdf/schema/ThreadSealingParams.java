
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ThreadSealingParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThreadSealingParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;attribute name="ThreadMaterial" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ThreadLength" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="SealingTemperature" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="BlindStitch" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="ThreadPositions" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="ThreadStitchWidth" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThreadSealingParams")
public class ThreadSealingParams
    extends ParameterType
    implements Serializable
{

    @XmlAttribute(name = "ThreadMaterial")
    @XmlSchemaType(name = "anySimpleType")
    protected String threadMaterial;
    @XmlAttribute(name = "ThreadLength")
    protected Double threadLength;
    @XmlAttribute(name = "SealingTemperature")
    protected Integer sealingTemperature;
    @XmlAttribute(name = "BlindStitch")
    protected Boolean blindStitch;
    @XmlAttribute(name = "ThreadPositions")
    protected String threadPositions;
    @XmlAttribute(name = "ThreadStitchWidth")
    protected Double threadStitchWidth;

    /**
     * Gets the value of the threadMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThreadMaterial() {
        return threadMaterial;
    }

    /**
     * Sets the value of the threadMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThreadMaterial(String value) {
        this.threadMaterial = value;
    }

    /**
     * Gets the value of the threadLength property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getThreadLength() {
        return threadLength;
    }

    /**
     * Sets the value of the threadLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setThreadLength(Double value) {
        this.threadLength = value;
    }

    /**
     * Gets the value of the sealingTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSealingTemperature() {
        return sealingTemperature;
    }

    /**
     * Sets the value of the sealingTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSealingTemperature(Integer value) {
        this.sealingTemperature = value;
    }

    /**
     * Gets the value of the blindStitch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBlindStitch() {
        return blindStitch;
    }

    /**
     * Sets the value of the blindStitch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBlindStitch(Boolean value) {
        this.blindStitch = value;
    }

    /**
     * Gets the value of the threadPositions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThreadPositions() {
        return threadPositions;
    }

    /**
     * Sets the value of the threadPositions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThreadPositions(String value) {
        this.threadPositions = value;
    }

    /**
     * Gets the value of the threadStitchWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getThreadStitchWidth() {
        return threadStitchWidth;
    }

    /**
     * Sets the value of the threadStitchWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setThreadStitchWidth(Double value) {
        this.threadStitchWidth = value;
    }

}
