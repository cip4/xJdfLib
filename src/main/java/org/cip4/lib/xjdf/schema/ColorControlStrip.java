
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ColorControlStrip complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ColorControlStrip">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}DensityMeasuringField" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}CIELABMeasuringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="Rotation" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="Size" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="Center" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="StripType" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="SeparationNames" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKENS" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ColorControlStrip", propOrder = {
    "cielabMeasuringFields",
    "densityMeasuringFields"
})
public class ColorControlStrip
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "CIELABMeasuringField")
    protected List<CIELABMeasuringField> cielabMeasuringFields;
    @XmlElement(name = "DensityMeasuringField")
    protected List<DensityMeasuringField> densityMeasuringFields;
    @XmlAttribute(name = "Rotation")
    protected Double rotation;
    @XmlAttribute(name = "Size")
    protected List<Double> sizes;
    @XmlAttribute(name = "Center")
    protected List<Double> centers;
    @XmlAttribute(name = "StripType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String stripType;
    @XmlAttribute(name = "SeparationNames")
    protected List<String> separationNames;

    /**
     * Gets the value of the cielabMeasuringFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cielabMeasuringFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCIELABMeasuringFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CIELABMeasuringField }
     * 
     * 
     */
    public List<CIELABMeasuringField> getCIELABMeasuringFields() {
        if (cielabMeasuringFields == null) {
            cielabMeasuringFields = new ArrayList<CIELABMeasuringField>();
        }
        return this.cielabMeasuringFields;
    }

    /**
     * Gets the value of the densityMeasuringFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the densityMeasuringFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDensityMeasuringFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DensityMeasuringField }
     * 
     * 
     */
    public List<DensityMeasuringField> getDensityMeasuringFields() {
        if (densityMeasuringFields == null) {
            densityMeasuringFields = new ArrayList<DensityMeasuringField>();
        }
        return this.densityMeasuringFields;
    }

    /**
     * Gets the value of the rotation property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRotation() {
        return rotation;
    }

    /**
     * Sets the value of the rotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRotation(Double value) {
        this.rotation = value;
    }

    /**
     * Gets the value of the sizes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sizes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSizes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getSizes() {
        if (sizes == null) {
            sizes = new ArrayList<Double>();
        }
        return this.sizes;
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
     * Gets the value of the stripType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStripType() {
        return stripType;
    }

    /**
     * Sets the value of the stripType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStripType(String value) {
        this.stripType = value;
    }

    /**
     * Gets the value of the separationNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the separationNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeparationNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSeparationNames() {
        if (separationNames == null) {
            separationNames = new ArrayList<String>();
        }
        return this.separationNames;
    }

}
