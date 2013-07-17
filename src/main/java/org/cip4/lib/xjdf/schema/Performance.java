
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="MaxCleanup" type="{http://www.CIP4.org/JDFSchema_2_0}duration" />
 *       &lt;attribute name="MaxAmount" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="AverageCleanup" type="{http://www.CIP4.org/JDFSchema_2_0}duration" />
 *       &lt;attribute name="DevCapsRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="MinCleanup" type="{http://www.CIP4.org/JDFSchema_2_0}duration" />
 *       &lt;attribute name="AverageAmount" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="MaxSetup" type="{http://www.CIP4.org/JDFSchema_2_0}duration" />
 *       &lt;attribute name="Unit" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="MinSetup" type="{http://www.CIP4.org/JDFSchema_2_0}duration" />
 *       &lt;attribute name="MinAmount" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="AverageSetup" type="{http://www.CIP4.org/JDFSchema_2_0}duration" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Performance")
public class Performance
    implements Serializable
{

    @XmlAttribute(name = "MaxCleanup")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.Duration.class)
    protected org.cip4.lib.xjdf.type.Duration maxCleanup;
    @XmlAttribute(name = "MaxAmount")
    protected Double maxAmount;
    @XmlAttribute(name = "AverageCleanup")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.Duration.class)
    protected org.cip4.lib.xjdf.type.Duration averageCleanup;
    @XmlAttribute(name = "DevCapsRef")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IDREF.class)
    protected org.cip4.lib.xjdf.type.IDREF devCapsRef;
    @XmlAttribute(name = "MinCleanup")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.Duration.class)
    protected org.cip4.lib.xjdf.type.Duration minCleanup;
    @XmlAttribute(name = "AverageAmount")
    protected Double averageAmount;
    @XmlAttribute(name = "MaxSetup")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.Duration.class)
    protected org.cip4.lib.xjdf.type.Duration maxSetup;
    @XmlAttribute(name = "Unit")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String unit;
    @XmlAttribute(name = "MinSetup")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.Duration.class)
    protected org.cip4.lib.xjdf.type.Duration minSetup;
    @XmlAttribute(name = "MinAmount")
    protected Double minAmount;
    @XmlAttribute(name = "AverageSetup")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.Duration.class)
    protected org.cip4.lib.xjdf.type.Duration averageSetup;

    /**
     * Gets the value of the maxCleanup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.Duration getMaxCleanup() {
        return maxCleanup;
    }

    /**
     * Sets the value of the maxCleanup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxCleanup(org.cip4.lib.xjdf.type.Duration value) {
        this.maxCleanup = value;
    }

    /**
     * Gets the value of the maxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxAmount() {
        return maxAmount;
    }

    /**
     * Sets the value of the maxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxAmount(Double value) {
        this.maxAmount = value;
    }

    /**
     * Gets the value of the averageCleanup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.Duration getAverageCleanup() {
        return averageCleanup;
    }

    /**
     * Sets the value of the averageCleanup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAverageCleanup(org.cip4.lib.xjdf.type.Duration value) {
        this.averageCleanup = value;
    }

    /**
     * Gets the value of the devCapsRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.IDREF getDevCapsRef() {
        return devCapsRef;
    }

    /**
     * Sets the value of the devCapsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevCapsRef(org.cip4.lib.xjdf.type.IDREF value) {
        this.devCapsRef = value;
    }

    /**
     * Gets the value of the minCleanup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.Duration getMinCleanup() {
        return minCleanup;
    }

    /**
     * Sets the value of the minCleanup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinCleanup(org.cip4.lib.xjdf.type.Duration value) {
        this.minCleanup = value;
    }

    /**
     * Gets the value of the averageAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAverageAmount() {
        return averageAmount;
    }

    /**
     * Sets the value of the averageAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAverageAmount(Double value) {
        this.averageAmount = value;
    }

    /**
     * Gets the value of the maxSetup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.Duration getMaxSetup() {
        return maxSetup;
    }

    /**
     * Sets the value of the maxSetup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxSetup(org.cip4.lib.xjdf.type.Duration value) {
        this.maxSetup = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    /**
     * Gets the value of the minSetup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.Duration getMinSetup() {
        return minSetup;
    }

    /**
     * Sets the value of the minSetup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinSetup(org.cip4.lib.xjdf.type.Duration value) {
        this.minSetup = value;
    }

    /**
     * Gets the value of the minAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinAmount() {
        return minAmount;
    }

    /**
     * Sets the value of the minAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinAmount(Double value) {
        this.minAmount = value;
    }

    /**
     * Gets the value of the averageSetup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.Duration getAverageSetup() {
        return averageSetup;
    }

    /**
     * Sets the value of the averageSetup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAverageSetup(org.cip4.lib.xjdf.type.Duration value) {
        this.averageSetup = value;
    }

}
