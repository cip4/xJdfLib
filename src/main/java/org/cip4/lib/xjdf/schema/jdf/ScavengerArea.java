
package org.cip4.lib.xjdf.schema.jdf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScavengerArea complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScavengerArea">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;attribute name="Rotation" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="Size" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="Center" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="SeparationNames" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKENS" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScavengerArea")
public class ScavengerArea
    extends ParameterType
    implements Serializable
{

    @XmlAttribute(name = "Rotation")
    protected Double rotation;
    @XmlAttribute(name = "Size")
    protected List<Double> sizes;
    @XmlAttribute(name = "Center")
    protected List<Double> centers;
    @XmlAttribute(name = "SeparationNames")
    protected List<String> separationNames;

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
