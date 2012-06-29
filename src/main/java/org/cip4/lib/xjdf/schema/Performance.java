
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;
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
    protected String maxCleanup;
    @XmlAttribute(name = "MaxAmount")
    protected Double maxAmount;
    @XmlAttribute(name = "AverageCleanup")
    protected String averageCleanup;
    @XmlAttribute(name = "DevCapsRef")
    @XmlIDREF
    protected Object devCapsRef;
    @XmlAttribute(name = "MinCleanup")
    protected String minCleanup;
    @XmlAttribute(name = "AverageAmount")
    protected Double averageAmount;
    @XmlAttribute(name = "MaxSetup")
    protected String maxSetup;
    @XmlAttribute(name = "Unit")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String unit;
    @XmlAttribute(name = "MinSetup")
    protected String minSetup;
    @XmlAttribute(name = "MinAmount")
    protected Double minAmount;
    @XmlAttribute(name = "AverageSetup")
    protected String averageSetup;

    /**
     * Gets the value of the maxCleanup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxCleanup() {
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
    public void setMaxCleanup(String value) {
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
    public String getAverageCleanup() {
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
    public void setAverageCleanup(String value) {
        this.averageCleanup = value;
    }

    /**
     * Gets the value of the devCapsRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDevCapsRef() {
        return devCapsRef;
    }

    /**
     * Sets the value of the devCapsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDevCapsRef(Object value) {
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
    public String getMinCleanup() {
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
    public void setMinCleanup(String value) {
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
    public String getMaxSetup() {
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
    public void setMaxSetup(String value) {
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
    public String getMinSetup() {
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
    public void setMinSetup(String value) {
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
    public String getAverageSetup() {
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
    public void setAverageSetup(String value) {
        this.averageSetup = value;
    }

}
