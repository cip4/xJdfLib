
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlID;
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
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Location" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Contact" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ResourceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Part" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}GeneralID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Comment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="AmountProduced" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="Locked" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="PipeURL" type="{http://www.CIP4.org/JDFSchema_2_0}URL" />
 *       &lt;attribute name="Class" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PartIDKeys">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.CIP4.org/JDFSchema_2_0}EnumPartIDKeys" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="PipeProtocol" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="Status" type="{http://www.CIP4.org/JDFSchema_2_0}EnumResStatus" />
 *       &lt;attribute name="ResourceWeight" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="GrossWeight" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="PipeID" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="LotControl" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Amount" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="AgentName" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="AgentVersion" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="AmountRequired" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="ID" use="required" type="{http://www.CIP4.org/JDFSchema_2_0}ID" />
 *       &lt;attribute name="AlternateBrand" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="Manufacturer" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="Unit" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="PartUsage" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="BatchID" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="ProductID" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="Author" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="PipePartIDKeys">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.CIP4.org/JDFSchema_2_0}EnumPartIDKeys" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Brand" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="QualityControlResultRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="SourceResourceRefs" type="{http://www.CIP4.org/JDFSchema_2_0}IDREFS" />
 *       &lt;attribute name="IdentificationFieldRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="AmountGood" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="AmountWaste" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="DescriptiveName" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "location",
    "contact",
    "resourceType",
    "part",
    "generalID",
    "comment"
})
@XmlRootElement(name = "Resource")
public class Resource
    implements Serializable
{

    @XmlElement(name = "Location")
    protected List<Location> location;
    @XmlElement(name = "Contact")
    protected List<Contact> contact;
    @XmlElementRef(name = "ResourceType", namespace = "http://www.CIP4.org/JDFSchema_2_0", type = JAXBElement.class)
    protected List<JAXBElement<? extends ResourceType>> resourceType;
    @XmlElement(name = "Part")
    protected List<Part> part;
    @XmlElement(name = "GeneralID")
    protected List<GeneralID> generalID;
    @XmlElement(name = "Comment")
    protected List<Comment> comment;
    @XmlAttribute(name = "AmountProduced")
    protected Double amountProduced;
    @XmlAttribute(name = "Locked")
    protected Boolean locked;
    @XmlAttribute(name = "PipeURL")
    protected String pipeURL;
    @XmlAttribute(name = "Class")
    @XmlSchemaType(name = "anySimpleType")
    protected String clazz;
    @XmlAttribute(name = "PartIDKeys")
    protected List<EnumPartIDKeys> partIDKeys;
    @XmlAttribute(name = "PipeProtocol")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String pipeProtocol;
    @XmlAttribute(name = "Status")
    protected EnumResStatus status;
    @XmlAttribute(name = "ResourceWeight")
    protected Double resourceWeight;
    @XmlAttribute(name = "GrossWeight")
    protected Double grossWeight;
    @XmlAttribute(name = "PipeID")
    protected String pipeID;
    @XmlAttribute(name = "LotControl")
    @XmlSchemaType(name = "anySimpleType")
    protected String lotControl;
    @XmlAttribute(name = "Amount")
    protected Double amount;
    @XmlAttribute(name = "AgentName")
    protected String agentName;
    @XmlAttribute(name = "AgentVersion")
    protected String agentVersion;
    @XmlAttribute(name = "AmountRequired")
    protected Double amountRequired;
    @XmlAttribute(name = "ID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "AlternateBrand")
    protected String alternateBrand;
    @XmlAttribute(name = "Manufacturer")
    protected String manufacturer;
    @XmlAttribute(name = "Unit")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String unit;
    @XmlAttribute(name = "PartUsage")
    @XmlSchemaType(name = "anySimpleType")
    protected String partUsage;
    @XmlAttribute(name = "BatchID")
    protected String batchID;
    @XmlAttribute(name = "ProductID")
    protected String productID;
    @XmlAttribute(name = "Author")
    protected String author;
    @XmlAttribute(name = "PipePartIDKeys")
    protected List<EnumPartIDKeys> pipePartIDKeys;
    @XmlAttribute(name = "Brand")
    protected String brand;
    @XmlAttribute(name = "QualityControlResultRef")
    @XmlIDREF
    protected Object qualityControlResultRef;
    @XmlAttribute(name = "SourceResourceRefs")
    @XmlIDREF
    protected List<Object> sourceResourceRefs;
    @XmlAttribute(name = "IdentificationFieldRef")
    @XmlIDREF
    protected Object identificationFieldRef;
    @XmlAttribute(name = "AmountGood")
    protected Double amountGood;
    @XmlAttribute(name = "AmountWaste")
    protected Double amountWaste;
    @XmlAttribute(name = "DescriptiveName")
    protected String descriptiveName;

    /**
     * Gets the value of the location property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the location property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Location }
     * 
     * 
     */
    public List<Location> getLocation() {
        if (location == null) {
            location = new ArrayList<Location>();
        }
        return this.location;
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
     * Gets the value of the resourceType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link ResourceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RollStand }{@code >}
     * {@link JAXBElement }{@code <}{@link Ink }{@code >}
     * {@link JAXBElement }{@code <}{@link UsageCounter }{@code >}
     * {@link JAXBElement }{@code <}{@link Media }{@code >}
     * {@link JAXBElement }{@code <}{@link Bundle }{@code >}
     * {@link JAXBElement }{@code <}{@link DigitalMedia }{@code >}
     * {@link JAXBElement }{@code <}{@link Employee }{@code >}
     * {@link JAXBElement }{@code <}{@link RegisterRibbon }{@code >}
     * {@link JAXBElement }{@code <}{@link Pallet }{@code >}
     * {@link JAXBElement }{@code <}{@link ExposedMedia }{@code >}
     * {@link JAXBElement }{@code <}{@link Tool }{@code >}
     * {@link JAXBElement }{@code <}{@link Component }{@code >}
     * {@link JAXBElement }{@code <}{@link PlaceHolderResource }{@code >}
     * {@link JAXBElement }{@code <}{@link Strap }{@code >}
     * {@link JAXBElement }{@code <}{@link MiscConsumable }{@code >}
     * {@link JAXBElement }{@code <}{@link Device }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends ResourceType>> getResourceType() {
        if (resourceType == null) {
            resourceType = new ArrayList<JAXBElement<? extends ResourceType>>();
        }
        return this.resourceType;
    }

    /**
     * Gets the value of the part property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the part property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Part }
     * 
     * 
     */
    public List<Part> getPart() {
        if (part == null) {
            part = new ArrayList<Part>();
        }
        return this.part;
    }

    /**
     * Gets the value of the generalID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generalID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeneralID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeneralID }
     * 
     * 
     */
    public List<GeneralID> getGeneralID() {
        if (generalID == null) {
            generalID = new ArrayList<GeneralID>();
        }
        return this.generalID;
    }

    /**
     * Gets the value of the comment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Comment }
     * 
     * 
     */
    public List<Comment> getComment() {
        if (comment == null) {
            comment = new ArrayList<Comment>();
        }
        return this.comment;
    }

    /**
     * Gets the value of the amountProduced property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAmountProduced() {
        return amountProduced;
    }

    /**
     * Sets the value of the amountProduced property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAmountProduced(Double value) {
        this.amountProduced = value;
    }

    /**
     * Gets the value of the locked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocked() {
        return locked;
    }

    /**
     * Sets the value of the locked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocked(Boolean value) {
        this.locked = value;
    }

    /**
     * Gets the value of the pipeURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPipeURL() {
        return pipeURL;
    }

    /**
     * Sets the value of the pipeURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPipeURL(String value) {
        this.pipeURL = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the partIDKeys property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partIDKeys property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartIDKeys().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnumPartIDKeys }
     * 
     * 
     */
    public List<EnumPartIDKeys> getPartIDKeys() {
        if (partIDKeys == null) {
            partIDKeys = new ArrayList<EnumPartIDKeys>();
        }
        return this.partIDKeys;
    }

    /**
     * Gets the value of the pipeProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPipeProtocol() {
        return pipeProtocol;
    }

    /**
     * Sets the value of the pipeProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPipeProtocol(String value) {
        this.pipeProtocol = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link EnumResStatus }
     *     
     */
    public EnumResStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumResStatus }
     *     
     */
    public void setStatus(EnumResStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the resourceWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getResourceWeight() {
        return resourceWeight;
    }

    /**
     * Sets the value of the resourceWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setResourceWeight(Double value) {
        this.resourceWeight = value;
    }

    /**
     * Gets the value of the grossWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGrossWeight() {
        return grossWeight;
    }

    /**
     * Sets the value of the grossWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGrossWeight(Double value) {
        this.grossWeight = value;
    }

    /**
     * Gets the value of the pipeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPipeID() {
        return pipeID;
    }

    /**
     * Sets the value of the pipeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPipeID(String value) {
        this.pipeID = value;
    }

    /**
     * Gets the value of the lotControl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLotControl() {
        return lotControl;
    }

    /**
     * Sets the value of the lotControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLotControl(String value) {
        this.lotControl = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAmount(Double value) {
        this.amount = value;
    }

    /**
     * Gets the value of the agentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentName() {
        return agentName;
    }

    /**
     * Sets the value of the agentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentName(String value) {
        this.agentName = value;
    }

    /**
     * Gets the value of the agentVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentVersion() {
        return agentVersion;
    }

    /**
     * Sets the value of the agentVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentVersion(String value) {
        this.agentVersion = value;
    }

    /**
     * Gets the value of the amountRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAmountRequired() {
        return amountRequired;
    }

    /**
     * Sets the value of the amountRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAmountRequired(Double value) {
        this.amountRequired = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the alternateBrand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateBrand() {
        return alternateBrand;
    }

    /**
     * Sets the value of the alternateBrand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateBrand(String value) {
        this.alternateBrand = value;
    }

    /**
     * Gets the value of the manufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the value of the manufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturer(String value) {
        this.manufacturer = value;
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
     * Gets the value of the partUsage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartUsage() {
        return partUsage;
    }

    /**
     * Sets the value of the partUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartUsage(String value) {
        this.partUsage = value;
    }

    /**
     * Gets the value of the batchID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchID() {
        return batchID;
    }

    /**
     * Sets the value of the batchID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchID(String value) {
        this.batchID = value;
    }

    /**
     * Gets the value of the productID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductID() {
        return productID;
    }

    /**
     * Sets the value of the productID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductID(String value) {
        this.productID = value;
    }

    /**
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthor(String value) {
        this.author = value;
    }

    /**
     * Gets the value of the pipePartIDKeys property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pipePartIDKeys property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPipePartIDKeys().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnumPartIDKeys }
     * 
     * 
     */
    public List<EnumPartIDKeys> getPipePartIDKeys() {
        if (pipePartIDKeys == null) {
            pipePartIDKeys = new ArrayList<EnumPartIDKeys>();
        }
        return this.pipePartIDKeys;
    }

    /**
     * Gets the value of the brand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Sets the value of the brand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrand(String value) {
        this.brand = value;
    }

    /**
     * Gets the value of the qualityControlResultRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getQualityControlResultRef() {
        return qualityControlResultRef;
    }

    /**
     * Sets the value of the qualityControlResultRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setQualityControlResultRef(Object value) {
        this.qualityControlResultRef = value;
    }

    /**
     * Gets the value of the sourceResourceRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceResourceRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceResourceRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getSourceResourceRefs() {
        if (sourceResourceRefs == null) {
            sourceResourceRefs = new ArrayList<Object>();
        }
        return this.sourceResourceRefs;
    }

    /**
     * Gets the value of the identificationFieldRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getIdentificationFieldRef() {
        return identificationFieldRef;
    }

    /**
     * Sets the value of the identificationFieldRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setIdentificationFieldRef(Object value) {
        this.identificationFieldRef = value;
    }

    /**
     * Gets the value of the amountGood property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAmountGood() {
        return amountGood;
    }

    /**
     * Sets the value of the amountGood property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAmountGood(Double value) {
        this.amountGood = value;
    }

    /**
     * Gets the value of the amountWaste property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAmountWaste() {
        return amountWaste;
    }

    /**
     * Sets the value of the amountWaste property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAmountWaste(Double value) {
        this.amountWaste = value;
    }

    /**
     * Gets the value of the descriptiveName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptiveName() {
        return descriptiveName;
    }

    /**
     * Sets the value of the descriptiveName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptiveName(String value) {
        this.descriptiveName = value;
    }

}
