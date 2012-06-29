
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}RegisterRibbon" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Pallet" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Strap" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Ink" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Bundle" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}RollStand" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}DigitalMedia" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="TotalAmount" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="TrackingID" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="TotalWeight" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="Unit" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="ActualAmount" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="TotalVolume" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="TotalDimensions" type="{http://www.CIP4.org/JDFSchema_2_0}shape" />
 *       &lt;attribute name="Amount" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="ActualTotalAmount" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="MediaRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="ToolRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="ExposedMediaRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="ComponentRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "digitalMedias",
    "rollStands",
    "bundles",
    "inks",
    "straps",
    "pallets",
    "registerRibbons"
})
@XmlRootElement(name = "DropItem")
public class DropItem
    implements Serializable
{

    @XmlElement(name = "DigitalMedia")
    protected List<DigitalMedia> digitalMedias;
    @XmlElement(name = "RollStand")
    protected List<RollStand> rollStands;
    @XmlElement(name = "Bundle")
    protected List<Bundle> bundles;
    @XmlElement(name = "Ink")
    protected List<Ink> inks;
    @XmlElement(name = "Strap")
    protected List<Strap> straps;
    @XmlElement(name = "Pallet")
    protected List<Pallet> pallets;
    @XmlElement(name = "RegisterRibbon")
    protected List<RegisterRibbon> registerRibbons;
    @XmlAttribute(name = "TotalAmount")
    protected Integer totalAmount;
    @XmlAttribute(name = "TrackingID")
    protected String trackingID;
    @XmlAttribute(name = "TotalWeight")
    protected Double totalWeight;
    @XmlAttribute(name = "Unit")
    protected String unit;
    @XmlAttribute(name = "ActualAmount")
    protected Integer actualAmount;
    @XmlAttribute(name = "TotalVolume")
    protected Double totalVolume;
    @XmlAttribute(name = "TotalDimensions")
    protected List<Double> totalDimensions;
    @XmlAttribute(name = "Amount")
    protected Integer amount;
    @XmlAttribute(name = "ActualTotalAmount")
    protected Integer actualTotalAmount;
    @XmlAttribute(name = "MediaRef")
    @XmlIDREF
    protected Object mediaRef;
    @XmlAttribute(name = "ToolRef")
    @XmlIDREF
    protected Object toolRef;
    @XmlAttribute(name = "ExposedMediaRef")
    @XmlIDREF
    protected Object exposedMediaRef;
    @XmlAttribute(name = "ComponentRef")
    @XmlIDREF
    protected Object componentRef;

    /**
     * Gets the value of the digitalMedias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the digitalMedias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDigitalMedias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DigitalMedia }
     * 
     * 
     */
    public List<DigitalMedia> getDigitalMedias() {
        if (digitalMedias == null) {
            digitalMedias = new ArrayList<DigitalMedia>();
        }
        return this.digitalMedias;
    }

    /**
     * Gets the value of the rollStands property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rollStands property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRollStands().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RollStand }
     * 
     * 
     */
    public List<RollStand> getRollStands() {
        if (rollStands == null) {
            rollStands = new ArrayList<RollStand>();
        }
        return this.rollStands;
    }

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
     * Gets the value of the inks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ink }
     * 
     * 
     */
    public List<Ink> getInks() {
        if (inks == null) {
            inks = new ArrayList<Ink>();
        }
        return this.inks;
    }

    /**
     * Gets the value of the straps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the straps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStraps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Strap }
     * 
     * 
     */
    public List<Strap> getStraps() {
        if (straps == null) {
            straps = new ArrayList<Strap>();
        }
        return this.straps;
    }

    /**
     * Gets the value of the pallets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pallets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPallets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Pallet }
     * 
     * 
     */
    public List<Pallet> getPallets() {
        if (pallets == null) {
            pallets = new ArrayList<Pallet>();
        }
        return this.pallets;
    }

    /**
     * Gets the value of the registerRibbons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registerRibbons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegisterRibbons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegisterRibbon }
     * 
     * 
     */
    public List<RegisterRibbon> getRegisterRibbons() {
        if (registerRibbons == null) {
            registerRibbons = new ArrayList<RegisterRibbon>();
        }
        return this.registerRibbons;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalAmount(Integer value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the trackingID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingID() {
        return trackingID;
    }

    /**
     * Sets the value of the trackingID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingID(String value) {
        this.trackingID = value;
    }

    /**
     * Gets the value of the totalWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalWeight() {
        return totalWeight;
    }

    /**
     * Sets the value of the totalWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalWeight(Double value) {
        this.totalWeight = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    /**
     * Gets the value of the actualAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getActualAmount() {
        return actualAmount;
    }

    /**
     * Sets the value of the actualAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setActualAmount(Integer value) {
        this.actualAmount = value;
    }

    /**
     * Gets the value of the totalVolume property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalVolume() {
        return totalVolume;
    }

    /**
     * Sets the value of the totalVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalVolume(Double value) {
        this.totalVolume = value;
    }

    /**
     * Gets the value of the totalDimensions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the totalDimensions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTotalDimensions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getTotalDimensions() {
        if (totalDimensions == null) {
            totalDimensions = new ArrayList<Double>();
        }
        return this.totalDimensions;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAmount(Integer value) {
        this.amount = value;
    }

    /**
     * Gets the value of the actualTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getActualTotalAmount() {
        return actualTotalAmount;
    }

    /**
     * Sets the value of the actualTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setActualTotalAmount(Integer value) {
        this.actualTotalAmount = value;
    }

    /**
     * Gets the value of the mediaRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMediaRef() {
        return mediaRef;
    }

    /**
     * Sets the value of the mediaRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMediaRef(Object value) {
        this.mediaRef = value;
    }

    /**
     * Gets the value of the toolRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getToolRef() {
        return toolRef;
    }

    /**
     * Sets the value of the toolRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setToolRef(Object value) {
        this.toolRef = value;
    }

    /**
     * Gets the value of the exposedMediaRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExposedMediaRef() {
        return exposedMediaRef;
    }

    /**
     * Sets the value of the exposedMediaRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExposedMediaRef(Object value) {
        this.exposedMediaRef = value;
    }

    /**
     * Gets the value of the componentRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getComponentRef() {
        return componentRef;
    }

    /**
     * Sets the value of the componentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setComponentRef(Object value) {
        this.componentRef = value;
    }

}
