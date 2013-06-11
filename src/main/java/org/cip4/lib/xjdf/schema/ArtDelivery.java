
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
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
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}DigitalMedia" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Contact" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="HasBleeds" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="ArtDeliveryType" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="IsTrapped" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="PreflightOutput" type="{http://www.CIP4.org/JDFSchema_2_0}URL" />
 *       &lt;attribute name="PreflightStatus" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PageList" type="{http://www.CIP4.org/JDFSchema_2_0}IntegerRangeList" />
 *       &lt;attribute name="Amount" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="ToolRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="ScanParamsRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="ExposedMediaRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="RunListRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="ComponentRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="ReturnMethod" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="Method" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="ArtDeliveryDate" type="{http://www.CIP4.org/JDFSchema_2_0}dateTime" />
 *       &lt;attribute name="Transfer" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="DeliveryCharge" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ArtHandling" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ServiceLevel" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="ArtDeliveryDuration" type="{http://www.CIP4.org/JDFSchema_2_0}duration" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "digitalMedia",
    "contact"
})
@XmlRootElement(name = "ArtDelivery")
public class ArtDelivery
    implements Serializable
{

    @XmlElement(name = "DigitalMedia")
    protected List<DigitalMedia> digitalMedia;
    @XmlElement(name = "Contact")
    protected List<Contact> contact;
    @XmlAttribute(name = "HasBleeds")
    protected Boolean hasBleeds;
    @XmlAttribute(name = "ArtDeliveryType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String artDeliveryType;
    @XmlAttribute(name = "IsTrapped")
    protected Boolean isTrapped;
    @XmlAttribute(name = "PreflightOutput")
    protected String preflightOutput;
    @XmlAttribute(name = "PreflightStatus")
    @XmlSchemaType(name = "anySimpleType")
    protected String preflightStatus;
    @XmlAttribute(name = "PageList")
    protected Integer pageList;
    @XmlAttribute(name = "Amount")
    protected Integer amount;
    @XmlAttribute(name = "ToolRef")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IDREF.class)
    protected org.cip4.lib.xjdf.type.IDREF toolRef;
    @XmlAttribute(name = "ScanParamsRef")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IDREF.class)
    protected org.cip4.lib.xjdf.type.IDREF scanParamsRef;
    @XmlAttribute(name = "ExposedMediaRef")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IDREF.class)
    protected org.cip4.lib.xjdf.type.IDREF exposedMediaRef;
    @XmlAttribute(name = "RunListRef")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IDREF.class)
    protected org.cip4.lib.xjdf.type.IDREF runListRef;
    @XmlAttribute(name = "ComponentRef")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IDREF.class)
    protected org.cip4.lib.xjdf.type.IDREF componentRef;
    @XmlAttribute(name = "ReturnMethod")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String returnMethod;
    @XmlAttribute(name = "Method")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String method;
    @XmlAttribute(name = "ArtDeliveryDate")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.DateTime.class)
    protected org.cip4.lib.xjdf.type.DateTime artDeliveryDate;
    @XmlAttribute(name = "Transfer")
    @XmlSchemaType(name = "anySimpleType")
    protected String transfer;
    @XmlAttribute(name = "DeliveryCharge")
    @XmlSchemaType(name = "anySimpleType")
    protected String deliveryCharge;
    @XmlAttribute(name = "ArtHandling")
    @XmlSchemaType(name = "anySimpleType")
    protected String artHandling;
    @XmlAttribute(name = "ServiceLevel")
    protected String serviceLevel;
    @XmlAttribute(name = "ArtDeliveryDuration")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.Duration.class)
    protected org.cip4.lib.xjdf.type.Duration artDeliveryDuration;

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
     * Gets the value of the contact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contact }
     * 
     * 
     */
    public List<Contact> getContact() {
        if (contact == null) {
            contact = new ArrayList<Contact>();
        }
        return this.contact;
    }

    /**
     * Gets the value of the hasBleeds property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasBleeds() {
        return hasBleeds;
    }

    /**
     * Sets the value of the hasBleeds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasBleeds(Boolean value) {
        this.hasBleeds = value;
    }

    /**
     * Gets the value of the artDeliveryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArtDeliveryType() {
        return artDeliveryType;
    }

    /**
     * Sets the value of the artDeliveryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArtDeliveryType(String value) {
        this.artDeliveryType = value;
    }

    /**
     * Gets the value of the isTrapped property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTrapped() {
        return isTrapped;
    }

    /**
     * Sets the value of the isTrapped property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTrapped(Boolean value) {
        this.isTrapped = value;
    }

    /**
     * Gets the value of the preflightOutput property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreflightOutput() {
        return preflightOutput;
    }

    /**
     * Sets the value of the preflightOutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreflightOutput(String value) {
        this.preflightOutput = value;
    }

    /**
     * Gets the value of the preflightStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreflightStatus() {
        return preflightStatus;
    }

    /**
     * Sets the value of the preflightStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreflightStatus(String value) {
        this.preflightStatus = value;
    }

    /**
     * Gets the value of the pageList property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageList() {
        return pageList;
    }

    /**
     * Sets the value of the pageList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageList(Integer value) {
        this.pageList = value;
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
     * Gets the value of the scanParamsRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.IDREF getScanParamsRef() {
        return scanParamsRef;
    }

    /**
     * Sets the value of the scanParamsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScanParamsRef(org.cip4.lib.xjdf.type.IDREF value) {
        this.scanParamsRef = value;
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
     * Gets the value of the runListRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.IDREF getRunListRef() {
        return runListRef;
    }

    /**
     * Sets the value of the runListRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRunListRef(org.cip4.lib.xjdf.type.IDREF value) {
        this.runListRef = value;
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

    /**
     * Gets the value of the returnMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnMethod() {
        return returnMethod;
    }

    /**
     * Sets the value of the returnMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnMethod(String value) {
        this.returnMethod = value;
    }

    /**
     * Gets the value of the method property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethod() {
        return method;
    }

    /**
     * Sets the value of the method property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethod(String value) {
        this.method = value;
    }

    /**
     * Gets the value of the artDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.DateTime getArtDeliveryDate() {
        return artDeliveryDate;
    }

    /**
     * Sets the value of the artDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArtDeliveryDate(org.cip4.lib.xjdf.type.DateTime value) {
        this.artDeliveryDate = value;
    }

    /**
     * Gets the value of the transfer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransfer() {
        return transfer;
    }

    /**
     * Sets the value of the transfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransfer(String value) {
        this.transfer = value;
    }

    /**
     * Gets the value of the deliveryCharge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryCharge() {
        return deliveryCharge;
    }

    /**
     * Sets the value of the deliveryCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryCharge(String value) {
        this.deliveryCharge = value;
    }

    /**
     * Gets the value of the artHandling property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArtHandling() {
        return artHandling;
    }

    /**
     * Sets the value of the artHandling property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArtHandling(String value) {
        this.artHandling = value;
    }

    /**
     * Gets the value of the serviceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceLevel() {
        return serviceLevel;
    }

    /**
     * Sets the value of the serviceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceLevel(String value) {
        this.serviceLevel = value;
    }

    /**
     * Gets the value of the artDeliveryDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.Duration getArtDeliveryDuration() {
        return artDeliveryDuration;
    }

    /**
     * Sets the value of the artDeliveryDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArtDeliveryDuration(org.cip4.lib.xjdf.type.Duration value) {
        this.artDeliveryDuration = value;
    }

}
