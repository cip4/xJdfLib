
package org.cip4.lib.xjdf.schema.jdf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
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
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}DigitalMedia" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Contact" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
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
    "contacts",
    "digitalMedias"
})
@XmlRootElement(name = "ArtDelivery")
public class ArtDelivery
    implements Serializable
{

    @XmlElement(name = "Contact")
    protected List<Contact> contacts;
    @XmlElement(name = "DigitalMedia")
    protected List<DigitalMedia> digitalMedias;
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
    @XmlIDREF
    protected Object toolRef;
    @XmlAttribute(name = "ScanParamsRef")
    @XmlIDREF
    protected Object scanParamsRef;
    @XmlAttribute(name = "ExposedMediaRef")
    @XmlIDREF
    protected Object exposedMediaRef;
    @XmlAttribute(name = "RunListRef")
    @XmlIDREF
    protected Object runListRef;
    @XmlAttribute(name = "ComponentRef")
    @XmlIDREF
    protected Object componentRef;
    @XmlAttribute(name = "ReturnMethod")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String returnMethod;
    @XmlAttribute(name = "Method")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String method;
    @XmlAttribute(name = "ArtDeliveryDate")
    protected String artDeliveryDate;
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
    protected String artDeliveryDuration;

    /**
     * Gets the value of the contacts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contacts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContacts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contact }
     * 
     * 
     */
    public List<Contact> getContacts() {
        if (contacts == null) {
            contacts = new ArrayList<Contact>();
        }
        return this.contacts;
    }

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
     * Gets the value of the hasBleeds property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getHasBleeds() {
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
    public Boolean getIsTrapped() {
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
     * Gets the value of the scanParamsRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getScanParamsRef() {
        return scanParamsRef;
    }

    /**
     * Sets the value of the scanParamsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setScanParamsRef(Object value) {
        this.scanParamsRef = value;
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
     * Gets the value of the runListRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRunListRef() {
        return runListRef;
    }

    /**
     * Sets the value of the runListRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRunListRef(Object value) {
        this.runListRef = value;
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
    public String getArtDeliveryDate() {
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
    public void setArtDeliveryDate(String value) {
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
    public String getArtDeliveryDuration() {
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
    public void setArtDeliveryDuration(String value) {
        this.artDeliveryDuration = value;
    }

}
