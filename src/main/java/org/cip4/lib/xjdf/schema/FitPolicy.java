
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FitPolicy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FitPolicy">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;attribute name="GutterPolicy" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="RotatePolicy" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="SizePolicy" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ClipOffset" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="MinGutter" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FitPolicy")
public class FitPolicy
    extends ParameterType
    implements Serializable
{

    @XmlAttribute(name = "GutterPolicy")
    @XmlSchemaType(name = "anySimpleType")
    protected String gutterPolicy;
    @XmlAttribute(name = "RotatePolicy")
    @XmlSchemaType(name = "anySimpleType")
    protected String rotatePolicy;
    @XmlAttribute(name = "SizePolicy")
    @XmlSchemaType(name = "anySimpleType")
    protected String sizePolicy;
    @XmlAttribute(name = "ClipOffset")
    protected List<Double> clipOffsets;
    @XmlAttribute(name = "MinGutter")
    protected List<Double> minGutters;

    /**
     * Gets the value of the gutterPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGutterPolicy() {
        return gutterPolicy;
    }

    /**
     * Sets the value of the gutterPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGutterPolicy(String value) {
        this.gutterPolicy = value;
    }

    /**
     * Gets the value of the rotatePolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRotatePolicy() {
        return rotatePolicy;
    }

    /**
     * Sets the value of the rotatePolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRotatePolicy(String value) {
        this.rotatePolicy = value;
    }

    /**
     * Gets the value of the sizePolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSizePolicy() {
        return sizePolicy;
    }

    /**
     * Sets the value of the sizePolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSizePolicy(String value) {
        this.sizePolicy = value;
    }

    /**
     * Gets the value of the clipOffsets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clipOffsets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClipOffsets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getClipOffsets() {
        if (clipOffsets == null) {
            clipOffsets = new ArrayList<Double>();
        }
        return this.clipOffsets;
    }

    /**
     * Gets the value of the minGutters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the minGutters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMinGutters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getMinGutters() {
        if (minGutters == null) {
            minGutters = new ArrayList<Double>();
        }
        return this.minGutters;
    }

}
