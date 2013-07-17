
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for DensityMeasuringField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DensityMeasuringField">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;attribute name="ToleranceDotGain" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="Setup" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="Density" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="DotGain" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="Percentage" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="ToleranceCyan" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="ToleranceMagenta" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="ToleranceBlack" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="ToleranceYellow" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="Screen" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="Center" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="Diameter" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="ColorMeasurementConditionsRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DensityMeasuringField")
public class DensityMeasuringField
    extends ParameterType
    implements Serializable
{

    @XmlAttribute(name = "ToleranceDotGain")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.XYPair.class)
    protected org.cip4.lib.xjdf.type.XYPair toleranceDotGain;
    @XmlAttribute(name = "Setup")
    protected String setup;
    @XmlAttribute(name = "Density")
    protected String density;
    @XmlAttribute(name = "DotGain")
    protected Double dotGain;
    @XmlAttribute(name = "Percentage")
    protected Double percentage;
    @XmlAttribute(name = "ToleranceCyan")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.XYPair.class)
    protected org.cip4.lib.xjdf.type.XYPair toleranceCyan;
    @XmlAttribute(name = "ToleranceMagenta")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.XYPair.class)
    protected org.cip4.lib.xjdf.type.XYPair toleranceMagenta;
    @XmlAttribute(name = "ToleranceBlack")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.XYPair.class)
    protected org.cip4.lib.xjdf.type.XYPair toleranceBlack;
    @XmlAttribute(name = "ToleranceYellow")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.XYPair.class)
    protected org.cip4.lib.xjdf.type.XYPair toleranceYellow;
    @XmlAttribute(name = "Screen")
    protected String screen;
    @XmlAttribute(name = "Center")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.XYPair.class)
    protected org.cip4.lib.xjdf.type.XYPair center;
    @XmlAttribute(name = "Diameter")
    protected Double diameter;
    @XmlAttribute(name = "ColorMeasurementConditionsRef")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IDREF.class)
    protected org.cip4.lib.xjdf.type.IDREF colorMeasurementConditionsRef;

    /**
     * Gets the value of the toleranceDotGain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.XYPair getToleranceDotGain() {
        return toleranceDotGain;
    }

    /**
     * Sets the value of the toleranceDotGain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToleranceDotGain(org.cip4.lib.xjdf.type.XYPair value) {
        this.toleranceDotGain = value;
    }

    /**
     * Gets the value of the setup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSetup() {
        return setup;
    }

    /**
     * Sets the value of the setup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSetup(String value) {
        this.setup = value;
    }

    /**
     * Gets the value of the density property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDensity() {
        return density;
    }

    /**
     * Sets the value of the density property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDensity(String value) {
        this.density = value;
    }

    /**
     * Gets the value of the dotGain property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDotGain() {
        return dotGain;
    }

    /**
     * Sets the value of the dotGain property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDotGain(Double value) {
        this.dotGain = value;
    }

    /**
     * Gets the value of the percentage property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPercentage() {
        return percentage;
    }

    /**
     * Sets the value of the percentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPercentage(Double value) {
        this.percentage = value;
    }

    /**
     * Gets the value of the toleranceCyan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.XYPair getToleranceCyan() {
        return toleranceCyan;
    }

    /**
     * Sets the value of the toleranceCyan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToleranceCyan(org.cip4.lib.xjdf.type.XYPair value) {
        this.toleranceCyan = value;
    }

    /**
     * Gets the value of the toleranceMagenta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.XYPair getToleranceMagenta() {
        return toleranceMagenta;
    }

    /**
     * Sets the value of the toleranceMagenta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToleranceMagenta(org.cip4.lib.xjdf.type.XYPair value) {
        this.toleranceMagenta = value;
    }

    /**
     * Gets the value of the toleranceBlack property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.XYPair getToleranceBlack() {
        return toleranceBlack;
    }

    /**
     * Sets the value of the toleranceBlack property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToleranceBlack(org.cip4.lib.xjdf.type.XYPair value) {
        this.toleranceBlack = value;
    }

    /**
     * Gets the value of the toleranceYellow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.XYPair getToleranceYellow() {
        return toleranceYellow;
    }

    /**
     * Sets the value of the toleranceYellow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToleranceYellow(org.cip4.lib.xjdf.type.XYPair value) {
        this.toleranceYellow = value;
    }

    /**
     * Gets the value of the screen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScreen() {
        return screen;
    }

    /**
     * Sets the value of the screen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScreen(String value) {
        this.screen = value;
    }

    /**
     * Gets the value of the center property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.XYPair getCenter() {
        return center;
    }

    /**
     * Sets the value of the center property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCenter(org.cip4.lib.xjdf.type.XYPair value) {
        this.center = value;
    }

    /**
     * Gets the value of the diameter property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDiameter() {
        return diameter;
    }

    /**
     * Sets the value of the diameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDiameter(Double value) {
        this.diameter = value;
    }

    /**
     * Gets the value of the colorMeasurementConditionsRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.IDREF getColorMeasurementConditionsRef() {
        return colorMeasurementConditionsRef;
    }

    /**
     * Sets the value of the colorMeasurementConditionsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorMeasurementConditionsRef(org.cip4.lib.xjdf.type.IDREF value) {
        this.colorMeasurementConditionsRef = value;
    }

}
