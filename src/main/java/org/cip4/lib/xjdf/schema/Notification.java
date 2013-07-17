
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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for Notification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Notification">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}Audit">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Part" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}CostCenter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}CounterReset" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Milestone" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}FCNKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Error" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}SystemTimeSet" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Event" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Barcode" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="CombinedProcessIndex" type="{http://www.CIP4.org/JDFSchema_2_0}IntegerList" />
 *       &lt;attribute name="JobID" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="JobPartID" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="Class" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ModuleType" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="ModuleID" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="Type" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="ModuleIndex" type="{http://www.CIP4.org/JDFSchema_2_0}IntegerRangeList" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Notification", propOrder = {
    "part",
    "costCenter",
    "counterReset",
    "milestone",
    "fcnKey",
    "error",
    "systemTimeSet",
    "event",
    "barcode"
})
public class Notification
    extends Audit
    implements Serializable
{

    @XmlElement(name = "Part")
    protected List<Part> part;
    @XmlElement(name = "CostCenter")
    protected List<CostCenter> costCenter;
    @XmlElement(name = "CounterReset")
    protected List<CounterReset> counterReset;
    @XmlElement(name = "Milestone")
    protected List<Milestone> milestone;
    @XmlElement(name = "FCNKey")
    protected List<FCNKey> fcnKey;
    @XmlElement(name = "Error")
    protected List<Error> error;
    @XmlElement(name = "SystemTimeSet")
    protected List<SystemTimeSet> systemTimeSet;
    @XmlElement(name = "Event")
    protected List<Event> event;
    @XmlElement(name = "Barcode")
    protected List<Barcode> barcode;
    @XmlAttribute(name = "CombinedProcessIndex")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IntegerList.class)
    protected org.cip4.lib.xjdf.type.IntegerList combinedProcessIndex;
    @XmlAttribute(name = "JobID")
    protected String jobID;
    @XmlAttribute(name = "JobPartID")
    protected String jobPartID;
    @XmlAttribute(name = "Class")
    @XmlSchemaType(name = "anySimpleType")
    protected String clazz;
    @XmlAttribute(name = "ModuleType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String moduleType;
    @XmlAttribute(name = "ModuleID")
    protected String moduleID;
    @XmlAttribute(name = "Type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;
    @XmlAttribute(name = "ModuleIndex")
    protected Integer moduleIndex;

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
     * Gets the value of the counterReset property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the counterReset property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCounterReset().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CounterReset }
     * 
     * 
     */
    public List<CounterReset> getCounterReset() {
        if (counterReset == null) {
            counterReset = new ArrayList<CounterReset>();
        }
        return this.counterReset;
    }

    /**
     * Gets the value of the milestone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the milestone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMilestone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Milestone }
     * 
     * 
     */
    public List<Milestone> getMilestone() {
        if (milestone == null) {
            milestone = new ArrayList<Milestone>();
        }
        return this.milestone;
    }

    /**
     * Gets the value of the fcnKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fcnKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFCNKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FCNKey }
     * 
     * 
     */
    public List<FCNKey> getFCNKey() {
        if (fcnKey == null) {
            fcnKey = new ArrayList<FCNKey>();
        }
        return this.fcnKey;
    }

    /**
     * Gets the value of the error property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the error property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Error }
     * 
     * 
     */
    public List<Error> getError() {
        if (error == null) {
            error = new ArrayList<Error>();
        }
        return this.error;
    }

    /**
     * Gets the value of the systemTimeSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the systemTimeSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSystemTimeSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SystemTimeSet }
     * 
     * 
     */
    public List<SystemTimeSet> getSystemTimeSet() {
        if (systemTimeSet == null) {
            systemTimeSet = new ArrayList<SystemTimeSet>();
        }
        return this.systemTimeSet;
    }

    /**
     * Gets the value of the event property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the event property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Event }
     * 
     * 
     */
    public List<Event> getEvent() {
        if (event == null) {
            event = new ArrayList<Event>();
        }
        return this.event;
    }

    /**
     * Gets the value of the barcode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the barcode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBarcode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Barcode }
     * 
     * 
     */
    public List<Barcode> getBarcode() {
        if (barcode == null) {
            barcode = new ArrayList<Barcode>();
        }
        return this.barcode;
    }

    /**
     * Gets the value of the combinedProcessIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.IntegerList getCombinedProcessIndex() {
        return combinedProcessIndex;
    }

    /**
     * Sets the value of the combinedProcessIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCombinedProcessIndex(org.cip4.lib.xjdf.type.IntegerList value) {
        this.combinedProcessIndex = value;
    }

    /**
     * Gets the value of the jobID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobID() {
        return jobID;
    }

    /**
     * Sets the value of the jobID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobID(String value) {
        this.jobID = value;
    }

    /**
     * Gets the value of the jobPartID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobPartID() {
        return jobPartID;
    }

    /**
     * Sets the value of the jobPartID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobPartID(String value) {
        this.jobPartID = value;
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
     * Gets the value of the moduleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModuleType() {
        return moduleType;
    }

    /**
     * Sets the value of the moduleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModuleType(String value) {
        this.moduleType = value;
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
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

}
