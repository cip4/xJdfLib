
package org.cip4.lib.xjdf.schema.jdf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StackingParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StackingParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Disjointing" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="MaxWeight" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="MaxHeight" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="StandardAmount" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="LayerCompression" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="Compensate" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="BundleDepth" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="UnderLays" type="{http://www.CIP4.org/JDFSchema_2_0}IntegerList" />
 *       &lt;attribute name="MaxAmount" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="StackCompression" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="LayerLift" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="MinAmount" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="PreStackMethod" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="LayerAmount" type="{http://www.CIP4.org/JDFSchema_2_0}IntegerList" />
 *       &lt;attribute name="PreStackAmount" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StackingParams", propOrder = {
    "disjointings"
})
public class StackingParams
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "Disjointing")
    protected List<Disjointing> disjointings;
    @XmlAttribute(name = "MaxWeight")
    protected Double maxWeight;
    @XmlAttribute(name = "MaxHeight")
    protected Integer maxHeight;
    @XmlAttribute(name = "StandardAmount")
    protected Integer standardAmount;
    @XmlAttribute(name = "LayerCompression")
    protected Boolean layerCompression;
    @XmlAttribute(name = "Compensate")
    protected Boolean compensate;
    @XmlAttribute(name = "BundleDepth")
    protected Integer bundleDepth;
    @XmlAttribute(name = "UnderLays")
    protected List<Integer> underLays;
    @XmlAttribute(name = "MaxAmount")
    protected Integer maxAmount;
    @XmlAttribute(name = "StackCompression")
    protected Boolean stackCompression;
    @XmlAttribute(name = "LayerLift")
    protected Boolean layerLift;
    @XmlAttribute(name = "MinAmount")
    protected Integer minAmount;
    @XmlAttribute(name = "PreStackMethod")
    @XmlSchemaType(name = "anySimpleType")
    protected String preStackMethod;
    @XmlAttribute(name = "LayerAmount")
    protected List<Integer> layerAmounts;
    @XmlAttribute(name = "PreStackAmount")
    protected Integer preStackAmount;

    /**
     * Gets the value of the disjointings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disjointings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisjointings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Disjointing }
     * 
     * 
     */
    public List<Disjointing> getDisjointings() {
        if (disjointings == null) {
            disjointings = new ArrayList<Disjointing>();
        }
        return this.disjointings;
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
     * Gets the value of the maxHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxHeight() {
        return maxHeight;
    }

    /**
     * Sets the value of the maxHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxHeight(Integer value) {
        this.maxHeight = value;
    }

    /**
     * Gets the value of the standardAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStandardAmount() {
        return standardAmount;
    }

    /**
     * Sets the value of the standardAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStandardAmount(Integer value) {
        this.standardAmount = value;
    }

    /**
     * Gets the value of the layerCompression property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getLayerCompression() {
        return layerCompression;
    }

    /**
     * Sets the value of the layerCompression property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLayerCompression(Boolean value) {
        this.layerCompression = value;
    }

    /**
     * Gets the value of the compensate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getCompensate() {
        return compensate;
    }

    /**
     * Sets the value of the compensate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCompensate(Boolean value) {
        this.compensate = value;
    }

    /**
     * Gets the value of the bundleDepth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBundleDepth() {
        return bundleDepth;
    }

    /**
     * Sets the value of the bundleDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBundleDepth(Integer value) {
        this.bundleDepth = value;
    }

    /**
     * Gets the value of the underLays property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the underLays property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnderLays().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getUnderLays() {
        if (underLays == null) {
            underLays = new ArrayList<Integer>();
        }
        return this.underLays;
    }

    /**
     * Gets the value of the maxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxAmount() {
        return maxAmount;
    }

    /**
     * Sets the value of the maxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxAmount(Integer value) {
        this.maxAmount = value;
    }

    /**
     * Gets the value of the stackCompression property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getStackCompression() {
        return stackCompression;
    }

    /**
     * Sets the value of the stackCompression property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStackCompression(Boolean value) {
        this.stackCompression = value;
    }

    /**
     * Gets the value of the layerLift property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getLayerLift() {
        return layerLift;
    }

    /**
     * Sets the value of the layerLift property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLayerLift(Boolean value) {
        this.layerLift = value;
    }

    /**
     * Gets the value of the minAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinAmount() {
        return minAmount;
    }

    /**
     * Sets the value of the minAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinAmount(Integer value) {
        this.minAmount = value;
    }

    /**
     * Gets the value of the preStackMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreStackMethod() {
        return preStackMethod;
    }

    /**
     * Sets the value of the preStackMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreStackMethod(String value) {
        this.preStackMethod = value;
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

    /**
     * Gets the value of the preStackAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPreStackAmount() {
        return preStackAmount;
    }

    /**
     * Sets the value of the preStackAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPreStackAmount(Integer value) {
        this.preStackAmount = value;
    }

}
