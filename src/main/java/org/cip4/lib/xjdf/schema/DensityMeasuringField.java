
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;


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
    protected List<Double> toleranceDotGains;
    @XmlAttribute(name = "Setup")
    protected String setup;
    @XmlAttribute(name = "Density")
    protected String density;
    @XmlAttribute(name = "DotGain")
    protected Double dotGain;
    @XmlAttribute(name = "Percentage")
    protected Double percentage;
    @XmlAttribute(name = "ToleranceCyan")
    protected List<Double> toleranceCyen;
    @XmlAttribute(name = "ToleranceMagenta")
    protected List<Double> toleranceMagentas;
    @XmlAttribute(name = "ToleranceBlack")
    protected List<Double> toleranceBlacks;
    @XmlAttribute(name = "ToleranceYellow")
    protected List<Double> toleranceYellows;
    @XmlAttribute(name = "Screen")
    protected String screen;
    @XmlAttribute(name = "Center")
    protected List<Double> centers;
    @XmlAttribute(name = "Diameter")
    protected Double diameter;
    @XmlAttribute(name = "ColorMeasurementConditionsRef")
    @XmlIDREF
    protected Object colorMeasurementConditionsRef;

    /**
     * Gets the value of the toleranceDotGains property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the toleranceDotGains property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getToleranceDotGains().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getToleranceDotGains() {
        if (toleranceDotGains == null) {
            toleranceDotGains = new ArrayList<Double>();
        }
        return this.toleranceDotGains;
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
     * Gets the value of the toleranceCyen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the toleranceCyen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getToleranceCyen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getToleranceCyen() {
        if (toleranceCyen == null) {
            toleranceCyen = new ArrayList<Double>();
        }
        return this.toleranceCyen;
    }

    /**
     * Gets the value of the toleranceMagentas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the toleranceMagentas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getToleranceMagentas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getToleranceMagentas() {
        if (toleranceMagentas == null) {
            toleranceMagentas = new ArrayList<Double>();
        }
        return this.toleranceMagentas;
    }

    /**
     * Gets the value of the toleranceBlacks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the toleranceBlacks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getToleranceBlacks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getToleranceBlacks() {
        if (toleranceBlacks == null) {
            toleranceBlacks = new ArrayList<Double>();
        }
        return this.toleranceBlacks;
    }

    /**
     * Gets the value of the toleranceYellows property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the toleranceYellows property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getToleranceYellows().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getToleranceYellows() {
        if (toleranceYellows == null) {
            toleranceYellows = new ArrayList<Double>();
        }
        return this.toleranceYellows;
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
     * Gets the value of the centers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the centers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCenters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getCenters() {
        if (centers == null) {
            centers = new ArrayList<Double>();
        }
        return this.centers;
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
     *     {@link Object }
     *     
     */
    public Object getColorMeasurementConditionsRef() {
        return colorMeasurementConditionsRef;
    }

    /**
     * Sets the value of the colorMeasurementConditionsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setColorMeasurementConditionsRef(Object value) {
        this.colorMeasurementConditionsRef = value;
    }

}
