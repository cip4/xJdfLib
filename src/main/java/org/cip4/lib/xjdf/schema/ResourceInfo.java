
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
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Part" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Lot" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}MISDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}CostCenter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Resource" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Level" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CommandResult" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Status" type="{http://www.CIP4.org/JDFSchema_2_0}EnumResStatus" />
 *       &lt;attribute name="Usage" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Unit" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="ModuleID" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="ResourceName" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="Location" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="ActualAmount" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="ProductID" type="{http://www.CIP4.org/JDFSchema_2_0}shortString" />
 *       &lt;attribute name="ResourceID" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="AvailableAmount" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="LotControlled" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="Amount" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="ModuleIndex" type="{http://www.CIP4.org/JDFSchema_2_0}IntegerRangeList" />
 *       &lt;attribute name="ProcessUsage" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "part",
    "lot",
    "misDetails",
    "costCenter",
    "resource"
})
@XmlRootElement(name = "ResourceInfo")
public class ResourceInfo
    implements Serializable
{

    @XmlElement(name = "Part")
    protected List<Part> part;
    @XmlElement(name = "Lot")
    protected List<Lot> lot;
    @XmlElement(name = "MISDetails")
    protected List<MISDetails> misDetails;
    @XmlElement(name = "CostCenter")
    protected List<CostCenter> costCenter;
    @XmlElement(name = "Resource")
    protected List<Resource> resource;
    @XmlAttribute(name = "Level")
    @XmlSchemaType(name = "anySimpleType")
    protected String level;
    @XmlAttribute(name = "CommandResult")
    @XmlSchemaType(name = "anySimpleType")
    protected String commandResult;
    @XmlAttribute(name = "Status")
    protected EnumResStatus status;
    @XmlAttribute(name = "Usage")
    @XmlSchemaType(name = "anySimpleType")
    protected String usage;
    @XmlAttribute(name = "Unit")
    protected String unit;
    @XmlAttribute(name = "ModuleID")
    protected String moduleID;
    @XmlAttribute(name = "ResourceName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String resourceName;
    @XmlAttribute(name = "Location")
    protected String location;
    @XmlAttribute(name = "ActualAmount")
    protected Double actualAmount;
    @XmlAttribute(name = "ProductID")
    protected String productID;
    @XmlAttribute(name = "ResourceID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String resourceID;
    @XmlAttribute(name = "AvailableAmount")
    protected Double availableAmount;
    @XmlAttribute(name = "LotControlled")
    protected Boolean lotControlled;
    @XmlAttribute(name = "Amount")
    protected Double amount;
    @XmlAttribute(name = "ModuleIndex")
    protected Integer moduleIndex;
    @XmlAttribute(name = "ProcessUsage")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String processUsage;

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
     * Gets the value of the lot property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lot property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLot().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Lot }
     * 
     * 
     */
    public List<Lot> getLot() {
        if (lot == null) {
            lot = new ArrayList<Lot>();
        }
        return this.lot;
    }

    /**
     * Gets the value of the misDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the misDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMISDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MISDetails }
     * 
     * 
     */
    public List<MISDetails> getMISDetails() {
        if (misDetails == null) {
            misDetails = new ArrayList<MISDetails>();
        }
        return this.misDetails;
    }

    /**
     * Gets the value of the costCenter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the costCenter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCostCenter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CostCenter }
     * 
     * 
     */
    public List<CostCenter> getCostCenter() {
        if (costCenter == null) {
            costCenter = new ArrayList<CostCenter>();
        }
        return this.costCenter;
    }

    /**
     * Gets the value of the resource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Resource }
     * 
     * 
     */
    public List<Resource> getResource() {
        if (resource == null) {
            resource = new ArrayList<Resource>();
        }
        return this.resource;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevel(String value) {
        this.level = value;
    }

    /**
     * Gets the value of the commandResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommandResult() {
        return commandResult;
    }

    /**
     * Sets the value of the commandResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommandResult(String value) {
        this.commandResult = value;
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
     * Gets the value of the usage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsage() {
        return usage;
    }

    /**
     * Sets the value of the usage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsage(String value) {
        this.usage = value;
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
     * Gets the value of the moduleID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModuleID() {
        return moduleID;
    }

    /**
     * Sets the value of the moduleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModuleID(String value) {
        this.moduleID = value;
    }

    /**
     * Gets the value of the resourceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * Sets the value of the resourceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceName(String value) {
        this.resourceName = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the actualAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getActualAmount() {
        return actualAmount;
    }

    /**
     * Sets the value of the actualAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setActualAmount(Double value) {
        this.actualAmount = value;
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
     * Gets the value of the resourceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceID() {
        return resourceID;
    }

    /**
     * Sets the value of the resourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceID(String value) {
        this.resourceID = value;
    }

    /**
     * Gets the value of the availableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAvailableAmount() {
        return availableAmount;
    }

    /**
     * Sets the value of the availableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAvailableAmount(Double value) {
        this.availableAmount = value;
    }

    /**
     * Gets the value of the lotControlled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLotControlled() {
        return lotControlled;
    }

    /**
     * Sets the value of the lotControlled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLotControlled(Boolean value) {
        this.lotControlled = value;
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
     * Gets the value of the moduleIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getModuleIndex() {
        return moduleIndex;
    }

    /**
     * Sets the value of the moduleIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setModuleIndex(Integer value) {
        this.moduleIndex = value;
    }

    /**
     * Gets the value of the processUsage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessUsage() {
        return processUsage;
    }

    /**
     * Sets the value of the processUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessUsage(String value) {
        this.processUsage = value;
    }

}
