
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for CIELABMeasuringField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CIELABMeasuringField">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;attribute name="Percentages" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="ScreenRuling" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="ScreenShape" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="Center" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="Diameter" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="CIELab" type="{http://www.CIP4.org/JDFSchema_2_0}LabColor" />
 *       &lt;attribute name="Tolerance" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="ColorMeasurementConditionsRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CIELABMeasuringField")
public class CIELABMeasuringField
    extends ParameterType
    implements Serializable
{

    @XmlAttribute(name = "Percentages")
    protected String percentages;
    @XmlAttribute(name = "ScreenRuling")
    protected String screenRuling;
    @XmlAttribute(name = "ScreenShape")
    protected String screenShape;
    @XmlAttribute(name = "Center")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.XYPair.class)
    protected org.cip4.lib.xjdf.type.XYPair center;
    @XmlAttribute(name = "Diameter")
    protected Double diameter;
    @XmlAttribute(name = "CIELab")
    protected List<Double> cieLab;
    @XmlAttribute(name = "Tolerance")
    protected Double tolerance;
    @XmlAttribute(name = "ColorMeasurementConditionsRef")
    @XmlIDREF
    protected Object colorMeasurementConditionsRef;

    /**
     * Gets the value of the percentages property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPercentages() {
        return percentages;
    }

    /**
     * Sets the value of the percentages property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPercentages(String value) {
        this.percentages = value;
    }

    /**
     * Gets the value of the screenRuling property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScreenRuling() {
        return screenRuling;
    }

    /**
     * Sets the value of the screenRuling property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScreenRuling(String value) {
        this.screenRuling = value;
    }

    /**
     * Gets the value of the screenShape property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScreenShape() {
        return screenShape;
    }

    /**
     * Sets the value of the screenShape property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScreenShape(String value) {
        this.screenShape = value;
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
     * Gets the value of the cieLab property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cieLab property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCIELab().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getCIELab() {
        if (cieLab == null) {
            cieLab = new ArrayList<Double>();
        }
        return this.cieLab;
    }

    /**
     * Gets the value of the tolerance property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTolerance() {
        return tolerance;
    }

    /**
     * Sets the value of the tolerance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTolerance(Double value) {
        this.tolerance = value;
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
