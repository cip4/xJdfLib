
package org.cip4.lib.xjdf.schema;

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
 * <p>Java class for BindingIntent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BindingIntent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}IntentType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}BindList" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ThreadSealing" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Tabs" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}EdgeGluing" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}SoftCoverBinding" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}HardCoverBinding" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Tape" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}SideSewing" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}PlasticCombBinding" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}WireCombBinding" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}CoilBinding" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}SideStitching" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}RingBinding" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ChannelBinding" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ThreadSewing" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}SaddleStitching" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}StripBinding" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="BindingOrder" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="BindingType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="BackCoverColorDetails" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="BindingColor" type="{http://www.CIP4.org/JDFSchema_2_0}EnumNamedColor" />
 *       &lt;attribute name="BindingColorDetails" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="BindingSide" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CoverColor" type="{http://www.CIP4.org/JDFSchema_2_0}EnumNamedColor" />
 *       &lt;attribute name="BackCoverColor" type="{http://www.CIP4.org/JDFSchema_2_0}EnumNamedColor" />
 *       &lt;attribute name="BindingLength" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CoverColorDetails" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BindingIntent", propOrder = {
    "stripBindings",
    "saddleStitchings",
    "threadSewings",
    "channelBindings",
    "ringBindings",
    "sideStitchings",
    "coilBindings",
    "wireCombBindings",
    "plasticCombBindings",
    "sideSewings",
    "tapes",
    "hardCoverBindings",
    "softCoverBindings",
    "edgeGluings",
    "tabs",
    "threadSealings",
    "bindLists"
})
public class BindingIntent
    extends IntentType
    implements Serializable
{

    @XmlElement(name = "StripBinding")
    protected List<StripBinding> stripBindings;
    @XmlElement(name = "SaddleStitching")
    protected List<SaddleStitching> saddleStitchings;
    @XmlElement(name = "ThreadSewing")
    protected List<ThreadSewing> threadSewings;
    @XmlElement(name = "ChannelBinding")
    protected List<ChannelBinding> channelBindings;
    @XmlElement(name = "RingBinding")
    protected List<RingBinding> ringBindings;
    @XmlElement(name = "SideStitching")
    protected List<SideStitching> sideStitchings;
    @XmlElement(name = "CoilBinding")
    protected List<CoilBinding> coilBindings;
    @XmlElement(name = "WireCombBinding")
    protected List<WireCombBinding> wireCombBindings;
    @XmlElement(name = "PlasticCombBinding")
    protected List<PlasticCombBinding> plasticCombBindings;
    @XmlElement(name = "SideSewing")
    protected List<Object> sideSewings;
    @XmlElement(name = "Tape")
    protected List<Object> tapes;
    @XmlElement(name = "HardCoverBinding")
    protected List<HardCoverBinding> hardCoverBindings;
    @XmlElement(name = "SoftCoverBinding")
    protected List<SoftCoverBinding> softCoverBindings;
    @XmlElement(name = "EdgeGluing")
    protected List<EdgeGluing> edgeGluings;
    @XmlElement(name = "Tabs")
    protected List<Tabs> tabs;
    @XmlElement(name = "ThreadSealing")
    protected List<Object> threadSealings;
    @XmlElement(name = "BindList")
    protected List<Object> bindLists;
    @XmlAttribute(name = "BindingOrder")
    @XmlSchemaType(name = "anySimpleType")
    protected String bindingOrder;
    @XmlAttribute(name = "BindingType")
    @XmlSchemaType(name = "anySimpleType")
    protected String bindingType;
    @XmlAttribute(name = "BackCoverColorDetails")
    protected String backCoverColorDetails;
    @XmlAttribute(name = "BindingColor")
    protected EnumNamedColor bindingColor;
    @XmlAttribute(name = "BindingColorDetails")
    protected String bindingColorDetails;
    @XmlAttribute(name = "BindingSide")
    @XmlSchemaType(name = "anySimpleType")
    protected String bindingSide;
    @XmlAttribute(name = "CoverColor")
    protected EnumNamedColor coverColor;
    @XmlAttribute(name = "BackCoverColor")
    protected EnumNamedColor backCoverColor;
    @XmlAttribute(name = "BindingLength")
    @XmlSchemaType(name = "anySimpleType")
    protected String bindingLength;
    @XmlAttribute(name = "CoverColorDetails")
    protected String coverColorDetails;

    /**
     * Gets the value of the stripBindings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stripBindings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStripBindings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StripBinding }
     * 
     * 
     */
    public List<StripBinding> getStripBindings() {
        if (stripBindings == null) {
            stripBindings = new ArrayList<StripBinding>();
        }
        return this.stripBindings;
    }

    /**
     * Gets the value of the saddleStitchings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the saddleStitchings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSaddleStitchings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SaddleStitching }
     * 
     * 
     */
    public List<SaddleStitching> getSaddleStitchings() {
        if (saddleStitchings == null) {
            saddleStitchings = new ArrayList<SaddleStitching>();
        }
        return this.saddleStitchings;
    }

    /**
     * Gets the value of the threadSewings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the threadSewings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThreadSewings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ThreadSewing }
     * 
     * 
     */
    public List<ThreadSewing> getThreadSewings() {
        if (threadSewings == null) {
            threadSewings = new ArrayList<ThreadSewing>();
        }
        return this.threadSewings;
    }

    /**
     * Gets the value of the channelBindings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the channelBindings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChannelBindings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChannelBinding }
     * 
     * 
     */
    public List<ChannelBinding> getChannelBindings() {
        if (channelBindings == null) {
            channelBindings = new ArrayList<ChannelBinding>();
        }
        return this.channelBindings;
    }

    /**
     * Gets the value of the ringBindings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ringBindings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRingBindings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RingBinding }
     * 
     * 
     */
    public List<RingBinding> getRingBindings() {
        if (ringBindings == null) {
            ringBindings = new ArrayList<RingBinding>();
        }
        return this.ringBindings;
    }

    /**
     * Gets the value of the sideStitchings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sideStitchings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSideStitchings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SideStitching }
     * 
     * 
     */
    public List<SideStitching> getSideStitchings() {
        if (sideStitchings == null) {
            sideStitchings = new ArrayList<SideStitching>();
        }
        return this.sideStitchings;
    }

    /**
     * Gets the value of the coilBindings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coilBindings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoilBindings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoilBinding }
     * 
     * 
     */
    public List<CoilBinding> getCoilBindings() {
        if (coilBindings == null) {
            coilBindings = new ArrayList<CoilBinding>();
        }
        return this.coilBindings;
    }

    /**
     * Gets the value of the wireCombBindings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wireCombBindings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWireCombBindings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WireCombBinding }
     * 
     * 
     */
    public List<WireCombBinding> getWireCombBindings() {
        if (wireCombBindings == null) {
            wireCombBindings = new ArrayList<WireCombBinding>();
        }
        return this.wireCombBindings;
    }

    /**
     * Gets the value of the plasticCombBindings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the plasticCombBindings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlasticCombBindings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlasticCombBinding }
     * 
     * 
     */
    public List<PlasticCombBinding> getPlasticCombBindings() {
        if (plasticCombBindings == null) {
            plasticCombBindings = new ArrayList<PlasticCombBinding>();
        }
        return this.plasticCombBindings;
    }

    /**
     * Gets the value of the sideSewings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sideSewings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSideSewings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getSideSewings() {
        if (sideSewings == null) {
            sideSewings = new ArrayList<Object>();
        }
        return this.sideSewings;
    }

    /**
     * Gets the value of the tapes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tapes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTapes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getTapes() {
        if (tapes == null) {
            tapes = new ArrayList<Object>();
        }
        return this.tapes;
    }

    /**
     * Gets the value of the hardCoverBindings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hardCoverBindings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHardCoverBindings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HardCoverBinding }
     * 
     * 
     */
    public List<HardCoverBinding> getHardCoverBindings() {
        if (hardCoverBindings == null) {
            hardCoverBindings = new ArrayList<HardCoverBinding>();
        }
        return this.hardCoverBindings;
    }

    /**
     * Gets the value of the softCoverBindings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the softCoverBindings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSoftCoverBindings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SoftCoverBinding }
     * 
     * 
     */
    public List<SoftCoverBinding> getSoftCoverBindings() {
        if (softCoverBindings == null) {
            softCoverBindings = new ArrayList<SoftCoverBinding>();
        }
        return this.softCoverBindings;
    }

    /**
     * Gets the value of the edgeGluings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the edgeGluings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEdgeGluings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EdgeGluing }
     * 
     * 
     */
    public List<EdgeGluing> getEdgeGluings() {
        if (edgeGluings == null) {
            edgeGluings = new ArrayList<EdgeGluing>();
        }
        return this.edgeGluings;
    }

    /**
     * Gets the value of the tabs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tabs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTabs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tabs }
     * 
     * 
     */
    public List<Tabs> getTabs() {
        if (tabs == null) {
            tabs = new ArrayList<Tabs>();
        }
        return this.tabs;
    }

    /**
     * Gets the value of the threadSealings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the threadSealings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThreadSealings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getThreadSealings() {
        if (threadSealings == null) {
            threadSealings = new ArrayList<Object>();
        }
        return this.threadSealings;
    }

    /**
     * Gets the value of the bindLists property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bindLists property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBindLists().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getBindLists() {
        if (bindLists == null) {
            bindLists = new ArrayList<Object>();
        }
        return this.bindLists;
    }

    /**
     * Gets the value of the bindingOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBindingOrder() {
        return bindingOrder;
    }

    /**
     * Sets the value of the bindingOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBindingOrder(String value) {
        this.bindingOrder = value;
    }

    /**
     * Gets the value of the bindingType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBindingType() {
        return bindingType;
    }

    /**
     * Sets the value of the bindingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBindingType(String value) {
        this.bindingType = value;
    }

    /**
     * Gets the value of the backCoverColorDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackCoverColorDetails() {
        return backCoverColorDetails;
    }

    /**
     * Sets the value of the backCoverColorDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackCoverColorDetails(String value) {
        this.backCoverColorDetails = value;
    }

    /**
     * Gets the value of the bindingColor property.
     * 
     * @return
     *     possible object is
     *     {@link EnumNamedColor }
     *     
     */
    public EnumNamedColor getBindingColor() {
        return bindingColor;
    }

    /**
     * Sets the value of the bindingColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumNamedColor }
     *     
     */
    public void setBindingColor(EnumNamedColor value) {
        this.bindingColor = value;
    }

    /**
     * Gets the value of the bindingColorDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBindingColorDetails() {
        return bindingColorDetails;
    }

    /**
     * Sets the value of the bindingColorDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBindingColorDetails(String value) {
        this.bindingColorDetails = value;
    }

    /**
     * Gets the value of the bindingSide property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBindingSide() {
        return bindingSide;
    }

    /**
     * Sets the value of the bindingSide property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBindingSide(String value) {
        this.bindingSide = value;
    }

    /**
     * Gets the value of the coverColor property.
     * 
     * @return
     *     possible object is
     *     {@link EnumNamedColor }
     *     
     */
    public EnumNamedColor getCoverColor() {
        return coverColor;
    }

    /**
     * Sets the value of the coverColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumNamedColor }
     *     
     */
    public void setCoverColor(EnumNamedColor value) {
        this.coverColor = value;
    }

    /**
     * Gets the value of the backCoverColor property.
     * 
     * @return
     *     possible object is
     *     {@link EnumNamedColor }
     *     
     */
    public EnumNamedColor getBackCoverColor() {
        return backCoverColor;
    }

    /**
     * Sets the value of the backCoverColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumNamedColor }
     *     
     */
    public void setBackCoverColor(EnumNamedColor value) {
        this.backCoverColor = value;
    }

    /**
     * Gets the value of the bindingLength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBindingLength() {
        return bindingLength;
    }

    /**
     * Sets the value of the bindingLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBindingLength(String value) {
        this.bindingLength = value;
    }

    /**
     * Gets the value of the coverColorDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoverColorDetails() {
        return coverColorDetails;
    }

    /**
     * Sets the value of the coverColorDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverColorDetails(String value) {
        this.coverColorDetails = value;
    }

}
