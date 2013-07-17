
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ColorMeasurementConditions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ColorMeasurementConditions">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;attribute name="Illumination" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="WhiteBase" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="DensityStandard" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Observer" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="InkState" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="SampleBacking" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Instrumentation" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="MeasurementFilter" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ColorMeasurementConditions")
public class ColorMeasurementConditions
    extends ParameterType
    implements Serializable
{

    @XmlAttribute(name = "Illumination")
    @XmlSchemaType(name = "anySimpleType")
    protected String illumination;
    @XmlAttribute(name = "WhiteBase")
    @XmlSchemaType(name = "anySimpleType")
    protected String whiteBase;
    @XmlAttribute(name = "DensityStandard")
    @XmlSchemaType(name = "anySimpleType")
    protected String densityStandard;
    @XmlAttribute(name = "Observer")
    protected Integer observer;
    @XmlAttribute(name = "InkState")
    @XmlSchemaType(name = "anySimpleType")
    protected String inkState;
    @XmlAttribute(name = "SampleBacking")
    @XmlSchemaType(name = "anySimpleType")
    protected String sampleBacking;
    @XmlAttribute(name = "Instrumentation")
    protected String instrumentation;
    @XmlAttribute(name = "MeasurementFilter")
    @XmlSchemaType(name = "anySimpleType")
    protected String measurementFilter;

    /**
     * Gets the value of the illumination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIllumination() {
        return illumination;
    }

    /**
     * Sets the value of the illumination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIllumination(String value) {
        this.illumination = value;
    }

    /**
     * Gets the value of the whiteBase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhiteBase() {
        return whiteBase;
    }

    /**
     * Sets the value of the whiteBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhiteBase(String value) {
        this.whiteBase = value;
    }

    /**
     * Gets the value of the densityStandard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDensityStandard() {
        return densityStandard;
    }

    /**
     * Sets the value of the densityStandard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDensityStandard(String value) {
        this.densityStandard = value;
    }

    /**
     * Gets the value of the observer property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getObserver() {
        return observer;
    }

    /**
     * Sets the value of the observer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setObserver(Integer value) {
        this.observer = value;
    }

    /**
     * Gets the value of the inkState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInkState() {
        return inkState;
    }

    /**
     * Sets the value of the inkState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInkState(String value) {
        this.inkState = value;
    }

    /**
     * Gets the value of the sampleBacking property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSampleBacking() {
        return sampleBacking;
    }

    /**
     * Sets the value of the sampleBacking property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSampleBacking(String value) {
        this.sampleBacking = value;
    }

    /**
     * Gets the value of the instrumentation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrumentation() {
        return instrumentation;
    }

    /**
     * Sets the value of the instrumentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstrumentation(String value) {
        this.instrumentation = value;
    }

    /**
     * Gets the value of the measurementFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasurementFilter() {
        return measurementFilter;
    }

    /**
     * Sets the value of the measurementFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasurementFilter(String value) {
        this.measurementFilter = value;
    }

}
