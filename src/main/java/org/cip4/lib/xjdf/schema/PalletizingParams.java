
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for PalletizingParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PalletizingParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Bundle" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="MaxWeight" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="Pattern" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="MaxHeight" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="OverhangOffset" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="Overhang" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="LayerAmount" type="{http://www.CIP4.org/JDFSchema_2_0}IntegerList" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PalletizingParams", propOrder = {
    "bundle"
})
public class PalletizingParams
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "Bundle")
    protected List<Bundle> bundle;
    @XmlAttribute(name = "MaxWeight")
    protected Double maxWeight;
    @XmlAttribute(name = "Pattern")
    protected String pattern;
    @XmlAttribute(name = "MaxHeight")
    protected Double maxHeight;
    @XmlAttribute(name = "OverhangOffset")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.XYPair.class)
    protected org.cip4.lib.xjdf.type.XYPair overhangOffset;
    @XmlAttribute(name = "Overhang")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.XYPair.class)
    protected org.cip4.lib.xjdf.type.XYPair overhang;
    @XmlAttribute(name = "LayerAmount")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IntegerList.class)
    protected org.cip4.lib.xjdf.type.IntegerList layerAmount;

    /**
     * Gets the value of the bundle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bundle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBundle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Bundle }
     * 
     * 
     */
    public List<Bundle> getBundle() {
        if (bundle == null) {
            bundle = new ArrayList<Bundle>();
        }
        return this.bundle;
    }

    /**
     * Gets the value of the maxWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxWeight() {
        return maxWeight;
    }

    /**
     * Sets the value of the maxWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxWeight(Double value) {
        this.maxWeight = value;
    }

    /**
     * Gets the value of the pattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPattern() {
        return pattern;
    }

    /**
     * Sets the value of the pattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPattern(String value) {
        this.pattern = value;
    }

    /**
     * Gets the value of the maxHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxHeight() {
        return maxHeight;
    }

    /**
     * Sets the value of the maxHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxHeight(Double value) {
        this.maxHeight = value;
    }

    /**
     * Gets the value of the overhangOffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.XYPair getOverhangOffset() {
        return overhangOffset;
    }

    /**
     * Sets the value of the overhangOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverhangOffset(org.cip4.lib.xjdf.type.XYPair value) {
        this.overhangOffset = value;
    }

    /**
     * Gets the value of the overhang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.XYPair getOverhang() {
        return overhang;
    }

    /**
     * Sets the value of the overhang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverhang(org.cip4.lib.xjdf.type.XYPair value) {
        this.overhang = value;
    }

    /**
     * Gets the value of the layerAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.IntegerList getLayerAmount() {
        return layerAmount;
    }

    /**
     * Sets the value of the layerAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLayerAmount(org.cip4.lib.xjdf.type.IntegerList value) {
        this.layerAmount = value;
    }

}
