
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}RegisterRibbon" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Pallet" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Strap" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Ink" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Bundle" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}RollStand" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}DigitalMedia" maxOccurs="unbounded" minOccurs="0"/>
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
    "registerRibbon",
    "pallet",
    "strap",
    "ink",
    "bundle",
    "rollStand",
    "digitalMedia"
})
@XmlRootElement(name = "DropItem")
public class DropItem
    implements Serializable
{

    @XmlElement(name = "RegisterRibbon")
    protected List<RegisterRibbon> registerRibbon;
    @XmlElement(name = "Pallet")
    protected List<Pallet> pallet;
    @XmlElement(name = "Strap")
    protected List<Strap> strap;
    @XmlElement(name = "Ink")
    protected List<Ink> ink;
    @XmlElement(name = "Bundle")
    protected List<Bundle> bundle;
    @XmlElement(name = "RollStand")
    protected List<RollStand> rollStand;
    @XmlElement(name = "DigitalMedia")
    protected List<DigitalMedia> digitalMedia;
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
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.Shape.class)
    protected org.cip4.lib.xjdf.type.Shape totalDimensions;
    @XmlAttribute(name = "Amount")
    protected Integer amount;
    @XmlAttribute(name = "ActualTotalAmount")
    protected Integer actualTotalAmount;
    @XmlAttribute(name = "MediaRef")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IDREF.class)
    protected org.cip4.lib.xjdf.type.IDREF mediaRef;
    @XmlAttribute(name = "ToolRef")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IDREF.class)
    protected org.cip4.lib.xjdf.type.IDREF toolRef;
    @XmlAttribute(name = "ExposedMediaRef")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IDREF.class)
    protected org.cip4.lib.xjdf.type.IDREF exposedMediaRef;
    @XmlAttribute(name = "ComponentRef")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IDREF.class)
    protected org.cip4.lib.xjdf.type.IDREF componentRef;

    /**
     * Gets the value of the registerRibbon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registerRibbon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegisterRibbon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegisterRibbon }
     * 
     * 
     */
    public List<RegisterRibbon> getRegisterRibbon() {
        if (registerRibbon == null) {
            registerRibbon = new ArrayList<RegisterRibbon>();
        }
        return this.registerRibbon;
    }

    /**
     * Gets the value of the pallet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pallet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPallet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Pallet }
     * 
     * 
     */
    public List<Pallet> getPallet() {
        if (pallet == null) {
            pallet = new ArrayList<Pallet>();
        }
        return this.pallet;
    }

    /**
     * Gets the value of the strap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the strap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStrap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Strap }
     * 
     * 
     */
    public List<Strap> getStrap() {
        if (strap == null) {
            strap = new ArrayList<Strap>();
        }
        return this.strap;
    }

    /**
     * Gets the value of the ink property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ink property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInk().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ink }
     * 
     * 
     */
    public List<Ink> getInk() {
        if (ink == null) {
            ink = new ArrayList<Ink>();
        }
        return this.ink;
    }

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
     * Gets the value of the rollStand property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rollStand property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRollStand().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RollStand }
     * 
     * 
     */
    public List<RollStand> getRollStand() {
        if (rollStand == null) {
            rollStand = new ArrayList<RollStand>();
        }
        return this.rollStand;
    }

    /**
     * Gets the value of the digitalMedia property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the digitalMedia property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDigitalMedia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DigitalMedia }
     * 
     * 
     */
    public List<DigitalMedia> getDigitalMedia() {
        if (digitalMedia == null) {
            digitalMedia = new ArrayList<DigitalMedia>();
        }
        return this.digitalMedia;
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
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.Shape getTotalDimensions() {
        return totalDimensions;
    }

    /**
     * Sets the value of the totalDimensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalDimensions(org.cip4.lib.xjdf.type.Shape value) {
        this.totalDimensions = value;
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
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.IDREF getMediaRef() {
        return mediaRef;
    }

    /**
     * Sets the value of the mediaRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaRef(org.cip4.lib.xjdf.type.IDREF value) {
        this.mediaRef = value;
    }

    /**
     * Gets the value of the toolRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.IDREF getToolRef() {
        return toolRef;
    }

    /**
     * Sets the value of the toolRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToolRef(org.cip4.lib.xjdf.type.IDREF value) {
        this.toolRef = value;
    }

    /**
     * Gets the value of the exposedMediaRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.IDREF getExposedMediaRef() {
        return exposedMediaRef;
    }

    /**
     * Sets the value of the exposedMediaRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExposedMediaRef(org.cip4.lib.xjdf.type.IDREF value) {
        this.exposedMediaRef = value;
    }

    /**
     * Gets the value of the componentRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.IDREF getComponentRef() {
        return componentRef;
    }

    /**
     * Sets the value of the componentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponentRef(org.cip4.lib.xjdf.type.IDREF value) {
        this.componentRef = value;
    }

}
