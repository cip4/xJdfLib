
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
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}BindList" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ThreadSealing" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Tabs" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}EdgeGluing" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}SoftCoverBinding" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}HardCoverBinding" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Tape" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}SideSewing" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}PlasticCombBinding" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}WireCombBinding" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}CoilBinding" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}SideStitching" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}RingBinding" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ChannelBinding" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ThreadSewing" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}SaddleStitching" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}StripBinding" maxOccurs="unbounded" minOccurs="0"/>
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
    "bindList",
    "threadSealing",
    "tabs",
    "edgeGluing",
    "softCoverBinding",
    "hardCoverBinding",
    "tape",
    "sideSewing",
    "plasticCombBinding",
    "wireCombBinding",
    "coilBinding",
    "sideStitching",
    "ringBinding",
    "channelBinding",
    "threadSewing",
    "saddleStitching",
    "stripBinding"
})
public class BindingIntent
    extends IntentType
    implements Serializable
{

    @XmlElement(name = "BindList")
    protected List<Object> bindList;
    @XmlElement(name = "ThreadSealing")
    protected List<Object> threadSealing;
    @XmlElement(name = "Tabs")
    protected List<Tabs> tabs;
    @XmlElement(name = "EdgeGluing")
    protected List<EdgeGluing> edgeGluing;
    @XmlElement(name = "SoftCoverBinding")
    protected List<SoftCoverBinding> softCoverBinding;
    @XmlElement(name = "HardCoverBinding")
    protected List<HardCoverBinding> hardCoverBinding;
    @XmlElement(name = "Tape")
    protected List<Object> tape;
    @XmlElement(name = "SideSewing")
    protected List<Object> sideSewing;
    @XmlElement(name = "PlasticCombBinding")
    protected List<PlasticCombBinding> plasticCombBinding;
    @XmlElement(name = "WireCombBinding")
    protected List<WireCombBinding> wireCombBinding;
    @XmlElement(name = "CoilBinding")
    protected List<CoilBinding> coilBinding;
    @XmlElement(name = "SideStitching")
    protected List<SideStitching> sideStitching;
    @XmlElement(name = "RingBinding")
    protected List<RingBinding> ringBinding;
    @XmlElement(name = "ChannelBinding")
    protected List<ChannelBinding> channelBinding;
    @XmlElement(name = "ThreadSewing")
    protected List<ThreadSewing> threadSewing;
    @XmlElement(name = "SaddleStitching")
    protected List<SaddleStitching> saddleStitching;
    @XmlElement(name = "StripBinding")
    protected List<StripBinding> stripBinding;
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
     * Gets the value of the bindList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bindList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBindList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getBindList() {
        if (bindList == null) {
            bindList = new ArrayList<Object>();
        }
        return this.bindList;
    }

    /**
     * Gets the value of the threadSealing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the threadSealing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThreadSealing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getThreadSealing() {
        if (threadSealing == null) {
            threadSealing = new ArrayList<Object>();
        }
        return this.threadSealing;
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
     * Gets the value of the edgeGluing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the edgeGluing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEdgeGluing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EdgeGluing }
     * 
     * 
     */
    public List<EdgeGluing> getEdgeGluing() {
        if (edgeGluing == null) {
            edgeGluing = new ArrayList<EdgeGluing>();
        }
        return this.edgeGluing;
    }

    /**
     * Gets the value of the softCoverBinding property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the softCoverBinding property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSoftCoverBinding().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SoftCoverBinding }
     * 
     * 
     */
    public List<SoftCoverBinding> getSoftCoverBinding() {
        if (softCoverBinding == null) {
            softCoverBinding = new ArrayList<SoftCoverBinding>();
        }
        return this.softCoverBinding;
    }

    /**
     * Gets the value of the hardCoverBinding property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hardCoverBinding property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHardCoverBinding().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HardCoverBinding }
     * 
     * 
     */
    public List<HardCoverBinding> getHardCoverBinding() {
        if (hardCoverBinding == null) {
            hardCoverBinding = new ArrayList<HardCoverBinding>();
        }
        return this.hardCoverBinding;
    }

    /**
     * Gets the value of the tape property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tape property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTape().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getTape() {
        if (tape == null) {
            tape = new ArrayList<Object>();
        }
        return this.tape;
    }

    /**
     * Gets the value of the sideSewing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sideSewing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSideSewing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getSideSewing() {
        if (sideSewing == null) {
            sideSewing = new ArrayList<Object>();
        }
        return this.sideSewing;
    }

    /**
     * Gets the value of the plasticCombBinding property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the plasticCombBinding property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlasticCombBinding().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlasticCombBinding }
     * 
     * 
     */
    public List<PlasticCombBinding> getPlasticCombBinding() {
        if (plasticCombBinding == null) {
            plasticCombBinding = new ArrayList<PlasticCombBinding>();
        }
        return this.plasticCombBinding;
    }

    /**
     * Gets the value of the wireCombBinding property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wireCombBinding property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWireCombBinding().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WireCombBinding }
     * 
     * 
     */
    public List<WireCombBinding> getWireCombBinding() {
        if (wireCombBinding == null) {
            wireCombBinding = new ArrayList<WireCombBinding>();
        }
        return this.wireCombBinding;
    }

    /**
     * Gets the value of the coilBinding property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coilBinding property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoilBinding().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoilBinding }
     * 
     * 
     */
    public List<CoilBinding> getCoilBinding() {
        if (coilBinding == null) {
            coilBinding = new ArrayList<CoilBinding>();
        }
        return this.coilBinding;
    }

    /**
     * Gets the value of the sideStitching property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sideStitching property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSideStitching().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SideStitching }
     * 
     * 
     */
    public List<SideStitching> getSideStitching() {
        if (sideStitching == null) {
            sideStitching = new ArrayList<SideStitching>();
        }
        return this.sideStitching;
    }

    /**
     * Gets the value of the ringBinding property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ringBinding property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRingBinding().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RingBinding }
     * 
     * 
     */
    public List<RingBinding> getRingBinding() {
        if (ringBinding == null) {
            ringBinding = new ArrayList<RingBinding>();
        }
        return this.ringBinding;
    }

    /**
     * Gets the value of the channelBinding property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the channelBinding property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChannelBinding().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChannelBinding }
     * 
     * 
     */
    public List<ChannelBinding> getChannelBinding() {
        if (channelBinding == null) {
            channelBinding = new ArrayList<ChannelBinding>();
        }
        return this.channelBinding;
    }

    /**
     * Gets the value of the threadSewing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the threadSewing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThreadSewing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ThreadSewing }
     * 
     * 
     */
    public List<ThreadSewing> getThreadSewing() {
        if (threadSewing == null) {
            threadSewing = new ArrayList<ThreadSewing>();
        }
        return this.threadSewing;
    }

    /**
     * Gets the value of the saddleStitching property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the saddleStitching property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSaddleStitching().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SaddleStitching }
     * 
     * 
     */
    public List<SaddleStitching> getSaddleStitching() {
        if (saddleStitching == null) {
            saddleStitching = new ArrayList<SaddleStitching>();
        }
        return this.saddleStitching;
    }

    /**
     * Gets the value of the stripBinding property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stripBinding property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStripBinding().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StripBinding }
     * 
     * 
     */
    public List<StripBinding> getStripBinding() {
        if (stripBinding == null) {
            stripBinding = new ArrayList<StripBinding>();
        }
        return this.stripBinding;
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
