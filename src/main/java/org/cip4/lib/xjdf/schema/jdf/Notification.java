
package org.cip4.lib.xjdf.schema.jdf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Part" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}CostCenter" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}CounterReset" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Milestone" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}FCNKey" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Error" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Employee" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}SystemTimeSet" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Event" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Barcode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="CombinedProcessIndex" type="{http://www.CIP4.org/JDFSchema_2_0}IntegerList" />
 *       &lt;attribute name="ID" type="{http://www.CIP4.org/JDFSchema_2_0}ID" />
 *       &lt;attribute name="JobID" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="JobPartID" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="Class" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="refID" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="TimeStamp" type="{http://www.CIP4.org/JDFSchema_2_0}dateTime" />
 *       &lt;attribute name="ModuleType" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="QueueEntryID" type="{http://www.CIP4.org/JDFSchema_2_0}shortString" />
 *       &lt;attribute name="ModuleID" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="Type" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="ModuleIndex" type="{http://www.CIP4.org/JDFSchema_2_0}IntegerRangeList" />
 *       &lt;attribute name="AgentName" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="AgentVersion" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "barcodes",
    "events",
    "systemTimeSets",
    "employees",
    "errors",
    "fcnKeies",
    "milestones",
    "counterResets",
    "costCenters",
    "parts"
})
@XmlRootElement(name = "Notification")
public class Notification
    implements Serializable
{

    @XmlElement(name = "Barcode")
    protected List<Barcode> barcodes;
    @XmlElement(name = "Event")
    protected List<Event> events;
    @XmlElement(name = "SystemTimeSet")
    protected List<SystemTimeSet> systemTimeSets;
    @XmlElement(name = "Employee")
    protected List<Employee> employees;
    @XmlElement(name = "Error")
    protected List<Error> errors;
    @XmlElement(name = "FCNKey")
    protected List<FCNKey> fcnKeies;
    @XmlElement(name = "Milestone")
    protected List<Milestone> milestones;
    @XmlElement(name = "CounterReset")
    protected List<CounterReset> counterResets;
    @XmlElement(name = "CostCenter")
    protected List<CostCenter> costCenters;
    @XmlElement(name = "Part")
    protected List<Part> parts;
    @XmlAttribute(name = "CombinedProcessIndex")
    protected List<Integer> combinedProcessIndices;
    @XmlAttribute(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "JobID")
    protected String jobID;
    @XmlAttribute(name = "JobPartID")
    protected String jobPartID;
    @XmlAttribute(name = "Class")
    @XmlSchemaType(name = "anySimpleType")
    protected String clazz;
    @XmlAttribute
    @XmlIDREF
    protected Object refID;
    @XmlAttribute(name = "TimeStamp")
    protected String timeStamp;
    @XmlAttribute(name = "ModuleType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String moduleType;
    @XmlAttribute(name = "QueueEntryID")
    protected String queueEntryID;
    @XmlAttribute(name = "ModuleID")
    protected String moduleID;
    @XmlAttribute(name = "Type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;
    @XmlAttribute(name = "ModuleIndex")
    protected Integer moduleIndex;
    @XmlAttribute(name = "AgentName")
    protected String agentName;
    @XmlAttribute(name = "AgentVersion")
    protected String agentVersion;

    /**
     * Gets the value of the barcodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the barcodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBarcodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Barcode }
     * 
     * 
     */
    public List<Barcode> getBarcodes() {
        if (barcodes == null) {
            barcodes = new ArrayList<Barcode>();
        }
        return this.barcodes;
    }

    /**
     * Gets the value of the events property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the events property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Event }
     * 
     * 
     */
    public List<Event> getEvents() {
        if (events == null) {
            events = new ArrayList<Event>();
        }
        return this.events;
    }

    /**
     * Gets the value of the systemTimeSets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the systemTimeSets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSystemTimeSets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SystemTimeSet }
     * 
     * 
     */
    public List<SystemTimeSet> getSystemTimeSets() {
        if (systemTimeSets == null) {
            systemTimeSets = new ArrayList<SystemTimeSet>();
        }
        return this.systemTimeSets;
    }

    /**
     * Gets the value of the employees property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the employees property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmployees().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Employee }
     * 
     * 
     */
    public List<Employee> getEmployees() {
        if (employees == null) {
            employees = new ArrayList<Employee>();
        }
        return this.employees;
    }

    /**
     * Gets the value of the errors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Error }
     * 
     * 
     */
    public List<Error> getErrors() {
        if (errors == null) {
            errors = new ArrayList<Error>();
        }
        return this.errors;
    }

    /**
     * Gets the value of the fcnKeies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fcnKeies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFCNKeies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FCNKey }
     * 
     * 
     */
    public List<FCNKey> getFCNKeies() {
        if (fcnKeies == null) {
            fcnKeies = new ArrayList<FCNKey>();
        }
        return this.fcnKeies;
    }

    /**
     * Gets the value of the milestones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the milestones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMilestones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Milestone }
     * 
     * 
     */
    public List<Milestone> getMilestones() {
        if (milestones == null) {
            milestones = new ArrayList<Milestone>();
        }
        return this.milestones;
    }

    /**
     * Gets the value of the counterResets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the counterResets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCounterResets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CounterReset }
     * 
     * 
     */
    public List<CounterReset> getCounterResets() {
        if (counterResets == null) {
            counterResets = new ArrayList<CounterReset>();
        }
        return this.counterResets;
    }

    /**
     * Gets the value of the costCenters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the costCenters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCostCenters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CostCenter }
     * 
     * 
     */
    public List<CostCenter> getCostCenters() {
        if (costCenters == null) {
            costCenters = new ArrayList<CostCenter>();
        }
        return this.costCenters;
    }

    /**
     * Gets the value of the parts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Part }
     * 
     * 
     */
    public List<Part> getParts() {
        if (parts == null) {
            parts = new ArrayList<Part>();
        }
        return this.parts;
    }

    /**
     * Gets the value of the combinedProcessIndices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the combinedProcessIndices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCombinedProcessIndices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getCombinedProcessIndices() {
        if (combinedProcessIndices == null) {
            combinedProcessIndices = new ArrayList<Integer>();
        }
        return this.combinedProcessIndices;
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
     * Gets the value of the refID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRefID() {
        return refID;
    }

    /**
     * Sets the value of the refID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRefID(Object value) {
        this.refID = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeStamp(String value) {
        this.timeStamp = value;
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
     * Gets the value of the queueEntryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueueEntryID() {
        return queueEntryID;
    }

    /**
     * Sets the value of the queueEntryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueueEntryID(String value) {
        this.queueEntryID = value;
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

}
