
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Bundle" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
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
    "bundles"
})
public class PalletizingParams
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "Bundle")
    protected List<Bundle> bundles;
    @XmlAttribute(name = "MaxWeight")
    protected Double maxWeight;
    @XmlAttribute(name = "Pattern")
    protected String pattern;
    @XmlAttribute(name = "MaxHeight")
    protected Double maxHeight;
    @XmlAttribute(name = "OverhangOffset")
    protected List<Double> overhangOffsets;
    @XmlAttribute(name = "Overhang")
    protected List<Double> overhangs;
    @XmlAttribute(name = "LayerAmount")
    protected List<Integer> layerAmounts;

    /**
     * Gets the value of the bundles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bundles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBundles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Bundle }
     * 
     * 
     */
    public List<Bundle> getBundles() {
        if (bundles == null) {
            bundles = new ArrayList<Bundle>();
        }
        return this.bundles;
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
     * Gets the value of the overhangOffsets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the overhangOffsets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOverhangOffsets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getOverhangOffsets() {
        if (overhangOffsets == null) {
            overhangOffsets = new ArrayList<Double>();
        }
        return this.overhangOffsets;
    }

    /**
     * Gets the value of the overhangs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the overhangs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOverhangs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getOverhangs() {
        if (overhangs == null) {
            overhangs = new ArrayList<Double>();
        }
        return this.overhangs;
    }

    /**
     * Gets the value of the layerAmounts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the layerAmounts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLayerAmounts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getLayerAmounts() {
        if (layerAmounts == null) {
            layerAmounts = new ArrayList<Integer>();
        }
        return this.layerAmounts;
    }

}
