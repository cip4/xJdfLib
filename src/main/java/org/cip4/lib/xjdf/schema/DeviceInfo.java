
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
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Employee" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ModuleStatus" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}JobPhase" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="DeviceCondition" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="DeviceStatus" type="{http://www.CIP4.org/JDFSchema_2_0}EnumDeviceStatus" />
 *       &lt;attribute name="StatusDetails" type="{http://www.CIP4.org/JDFSchema_2_0}shortString" />
 *       &lt;attribute name="DeviceOperationMode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CounterUnit" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="Speed" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="IdleStartTime" type="{http://www.CIP4.org/JDFSchema_2_0}dateTime" />
 *       &lt;attribute name="HourCounter" type="{http://www.CIP4.org/JDFSchema_2_0}duration" />
 *       &lt;attribute name="PowerOnTime" type="{http://www.CIP4.org/JDFSchema_2_0}dateTime" />
 *       &lt;attribute name="TotalProductionCounter" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="ProductionCounter" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="DeviceID" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="DeviceRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "employee",
    "moduleStatus",
    "jobPhase"
})
@XmlRootElement(name = "DeviceInfo")
public class DeviceInfo
    implements Serializable
{

    @XmlElement(name = "Employee")
    protected List<Employee> employee;
    @XmlElement(name = "ModuleStatus")
    protected List<ModuleStatus> moduleStatus;
    @XmlElement(name = "JobPhase")
    protected List<JobPhase> jobPhase;
    @XmlAttribute(name = "DeviceCondition")
    @XmlSchemaType(name = "anySimpleType")
    protected String deviceCondition;
    @XmlAttribute(name = "DeviceStatus")
    protected EnumDeviceStatus deviceStatus;
    @XmlAttribute(name = "StatusDetails")
    protected String statusDetails;
    @XmlAttribute(name = "DeviceOperationMode")
    @XmlSchemaType(name = "anySimpleType")
    protected String deviceOperationMode;
    @XmlAttribute(name = "CounterUnit")
    protected String counterUnit;
    @XmlAttribute(name = "Speed")
    protected Double speed;
    @XmlAttribute(name = "IdleStartTime")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.DateTime.class)
    protected org.cip4.lib.xjdf.type.DateTime idleStartTime;
    @XmlAttribute(name = "HourCounter")
    protected String hourCounter;
    @XmlAttribute(name = "PowerOnTime")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.DateTime.class)
    protected org.cip4.lib.xjdf.type.DateTime powerOnTime;
    @XmlAttribute(name = "TotalProductionCounter")
    protected Double totalProductionCounter;
    @XmlAttribute(name = "ProductionCounter")
    protected Double productionCounter;
    @XmlAttribute(name = "DeviceID")
    protected String deviceID;
    @XmlAttribute(name = "DeviceRef")
    @XmlIDREF
    protected Object deviceRef;

    /**
     * Gets the value of the employee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the employee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmployee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Employee }
     * 
     * 
     */
    public List<Employee> getEmployee() {
        if (employee == null) {
            employee = new ArrayList<Employee>();
        }
        return this.employee;
    }

    /**
     * Gets the value of the moduleStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the moduleStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModuleStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModuleStatus }
     * 
     * 
     */
    public List<ModuleStatus> getModuleStatus() {
        if (moduleStatus == null) {
            moduleStatus = new ArrayList<ModuleStatus>();
        }
        return this.moduleStatus;
    }

    /**
     * Gets the value of the jobPhase property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobPhase property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobPhase().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobPhase }
     * 
     * 
     */
    public List<JobPhase> getJobPhase() {
        if (jobPhase == null) {
            jobPhase = new ArrayList<JobPhase>();
        }
        return this.jobPhase;
    }

    /**
     * Gets the value of the deviceCondition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceCondition() {
        return deviceCondition;
    }

    /**
     * Sets the value of the deviceCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceCondition(String value) {
        this.deviceCondition = value;
    }

    /**
     * Gets the value of the deviceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link EnumDeviceStatus }
     *     
     */
    public EnumDeviceStatus getDeviceStatus() {
        return deviceStatus;
    }

    /**
     * Sets the value of the deviceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumDeviceStatus }
     *     
     */
    public void setDeviceStatus(EnumDeviceStatus value) {
        this.deviceStatus = value;
    }

    /**
     * Gets the value of the statusDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDetails() {
        return statusDetails;
    }

    /**
     * Sets the value of the statusDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDetails(String value) {
        this.statusDetails = value;
    }

    /**
     * Gets the value of the deviceOperationMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceOperationMode() {
        return deviceOperationMode;
    }

    /**
     * Sets the value of the deviceOperationMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceOperationMode(String value) {
        this.deviceOperationMode = value;
    }

    /**
     * Gets the value of the counterUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounterUnit() {
        return counterUnit;
    }

    /**
     * Sets the value of the counterUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounterUnit(String value) {
        this.counterUnit = value;
    }

    /**
     * Gets the value of the speed property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSpeed() {
        return speed;
    }

    /**
     * Sets the value of the speed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSpeed(Double value) {
        this.speed = value;
    }

    /**
     * Gets the value of the idleStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.DateTime getIdleStartTime() {
        return idleStartTime;
    }

    /**
     * Sets the value of the idleStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdleStartTime(org.cip4.lib.xjdf.type.DateTime value) {
        this.idleStartTime = value;
    }

    /**
     * Gets the value of the hourCounter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHourCounter() {
        return hourCounter;
    }

    /**
     * Sets the value of the hourCounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHourCounter(String value) {
        this.hourCounter = value;
    }

    /**
     * Gets the value of the powerOnTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.DateTime getPowerOnTime() {
        return powerOnTime;
    }

    /**
     * Sets the value of the powerOnTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPowerOnTime(org.cip4.lib.xjdf.type.DateTime value) {
        this.powerOnTime = value;
    }

    /**
     * Gets the value of the totalProductionCounter property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalProductionCounter() {
        return totalProductionCounter;
    }

    /**
     * Sets the value of the totalProductionCounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalProductionCounter(Double value) {
        this.totalProductionCounter = value;
    }

    /**
     * Gets the value of the productionCounter property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getProductionCounter() {
        return productionCounter;
    }

    /**
     * Sets the value of the productionCounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setProductionCounter(Double value) {
        this.productionCounter = value;
    }

    /**
     * Gets the value of the deviceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceID() {
        return deviceID;
    }

    /**
     * Sets the value of the deviceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceID(String value) {
        this.deviceID = value;
    }

    /**
     * Gets the value of the deviceRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDeviceRef() {
        return deviceRef;
    }

    /**
     * Sets the value of the deviceRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDeviceRef(Object value) {
        this.deviceRef = value;
    }

}
