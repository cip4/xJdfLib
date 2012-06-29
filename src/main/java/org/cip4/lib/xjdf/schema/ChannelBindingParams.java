
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChannelBindingParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChannelBindingParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;attribute name="ClampSize" type="{http://www.CIP4.org/JDFSchema_2_0}shape" />
 *       &lt;attribute name="ClampColor" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="ClampSystem" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="ClampColorDetails" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="ClampD" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChannelBindingParams")
public class ChannelBindingParams
    extends ParameterType
    implements Serializable
{

    @XmlAttribute(name = "ClampSize")
    protected List<Double> clampSizes;
    @XmlAttribute(name = "ClampColor")
    protected String clampColor;
    @XmlAttribute(name = "ClampSystem")
    protected Boolean clampSystem;
    @XmlAttribute(name = "ClampColorDetails")
    protected String clampColorDetails;
    @XmlAttribute(name = "ClampD")
    protected Double clampD;

    /**
     * Gets the value of the clampSizes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clampSizes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClampSizes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getClampSizes() {
        if (clampSizes == null) {
            clampSizes = new ArrayList<Double>();
        }
        return this.clampSizes;
    }

    /**
     * Gets the value of the clampColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClampColor() {
        return clampColor;
    }

    /**
     * Sets the value of the clampColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClampColor(String value) {
        this.clampColor = value;
    }

    /**
     * Gets the value of the clampSystem property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClampSystem() {
        return clampSystem;
    }

    /**
     * Sets the value of the clampSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClampSystem(Boolean value) {
        this.clampSystem = value;
    }

    /**
     * Gets the value of the clampColorDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClampColorDetails() {
        return clampColorDetails;
    }

    /**
     * Sets the value of the clampColorDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClampColorDetails(String value) {
        this.clampColorDetails = value;
    }

    /**
     * Gets the value of the clampD property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getClampD() {
        return clampD;
    }

    /**
     * Sets the value of the clampD property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setClampD(Double value) {
        this.clampD = value;
    }

}
