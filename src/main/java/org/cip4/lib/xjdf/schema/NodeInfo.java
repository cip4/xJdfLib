
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
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for NodeInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodeInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Employee" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}NotificationFilter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}MISDetails" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="DueLevel" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="LastStart" type="{http://www.CIP4.org/JDFSchema_2_0}dateTime" />
 *       &lt;attribute name="FirstEnd" type="{http://www.CIP4.org/JDFSchema_2_0}dateTime" />
 *       &lt;attribute name="TotalDuration" type="{http://www.CIP4.org/JDFSchema_2_0}duration" />
 *       &lt;attribute name="NodeStatus" type="{http://www.CIP4.org/JDFSchema_2_0}EnumNodeStatus" />
 *       &lt;attribute name="SetupDuration" type="{http://www.CIP4.org/JDFSchema_2_0}duration" />
 *       &lt;attribute name="JobPriority" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="WorkStepID" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="NaturalLang" type="{http://www.CIP4.org/JDFSchema_2_0}language" />
 *       &lt;attribute name="CleanupDuration" type="{http://www.CIP4.org/JDFSchema_2_0}duration" />
 *       &lt;attribute name="FirstStart" type="{http://www.CIP4.org/JDFSchema_2_0}dateTime" />
 *       &lt;attribute name="Start" type="{http://www.CIP4.org/JDFSchema_2_0}dateTime" />
 *       &lt;attribute name="End" type="{http://www.CIP4.org/JDFSchema_2_0}dateTime" />
 *       &lt;attribute name="NodeStatusDetails" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="LastEnd" type="{http://www.CIP4.org/JDFSchema_2_0}dateTime" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NodeInfo", propOrder = {
    "employee",
    "notificationFilter",
    "misDetails"
})
public class NodeInfo
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "Employee")
    protected List<Employee> employee;
    @XmlElement(name = "NotificationFilter")
    protected List<NotificationFilter> notificationFilter;
    @XmlElement(name = "MISDetails")
    protected List<MISDetails> misDetails;
    @XmlAttribute(name = "DueLevel")
    @XmlSchemaType(name = "anySimpleType")
    protected String dueLevel;
    @XmlAttribute(name = "LastStart")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.DateTime.class)
    protected org.cip4.lib.xjdf.type.DateTime lastStart;
    @XmlAttribute(name = "FirstEnd")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.DateTime.class)
    protected org.cip4.lib.xjdf.type.DateTime firstEnd;
    @XmlAttribute(name = "TotalDuration")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.Duration.class)
    protected org.cip4.lib.xjdf.type.Duration totalDuration;
    @XmlAttribute(name = "NodeStatus")
    protected EnumNodeStatus nodeStatus;
    @XmlAttribute(name = "SetupDuration")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.Duration.class)
    protected org.cip4.lib.xjdf.type.Duration setupDuration;
    @XmlAttribute(name = "JobPriority")
    protected Integer jobPriority;
    @XmlAttribute(name = "WorkStepID")
    protected String workStepID;
    @XmlAttribute(name = "NaturalLang")
    protected String naturalLang;
    @XmlAttribute(name = "CleanupDuration")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.Duration.class)
    protected org.cip4.lib.xjdf.type.Duration cleanupDuration;
    @XmlAttribute(name = "FirstStart")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.DateTime.class)
    protected org.cip4.lib.xjdf.type.DateTime firstStart;
    @XmlAttribute(name = "Start")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.DateTime.class)
    protected org.cip4.lib.xjdf.type.DateTime start;
    @XmlAttribute(name = "End")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.DateTime.class)
    protected org.cip4.lib.xjdf.type.DateTime end;
    @XmlAttribute(name = "NodeStatusDetails")
    protected String nodeStatusDetails;
    @XmlAttribute(name = "LastEnd")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.DateTime.class)
    protected org.cip4.lib.xjdf.type.DateTime lastEnd;

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
     * Gets the value of the notificationFilter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notificationFilter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotificationFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotificationFilter }
     * 
     * 
     */
    public List<NotificationFilter> getNotificationFilter() {
        if (notificationFilter == null) {
            notificationFilter = new ArrayList<NotificationFilter>();
        }
        return this.notificationFilter;
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
     * Gets the value of the dueLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDueLevel() {
        return dueLevel;
    }

    /**
     * Sets the value of the dueLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDueLevel(String value) {
        this.dueLevel = value;
    }

    /**
     * Gets the value of the lastStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.DateTime getLastStart() {
        return lastStart;
    }

    /**
     * Sets the value of the lastStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastStart(org.cip4.lib.xjdf.type.DateTime value) {
        this.lastStart = value;
    }

    /**
     * Gets the value of the firstEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.DateTime getFirstEnd() {
        return firstEnd;
    }

    /**
     * Sets the value of the firstEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstEnd(org.cip4.lib.xjdf.type.DateTime value) {
        this.firstEnd = value;
    }

    /**
     * Gets the value of the totalDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.Duration getTotalDuration() {
        return totalDuration;
    }

    /**
     * Sets the value of the totalDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalDuration(org.cip4.lib.xjdf.type.Duration value) {
        this.totalDuration = value;
    }

    /**
     * Gets the value of the nodeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link EnumNodeStatus }
     *     
     */
    public EnumNodeStatus getNodeStatus() {
        return nodeStatus;
    }

    /**
     * Sets the value of the nodeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumNodeStatus }
     *     
     */
    public void setNodeStatus(EnumNodeStatus value) {
        this.nodeStatus = value;
    }

    /**
     * Gets the value of the setupDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.Duration getSetupDuration() {
        return setupDuration;
    }

    /**
     * Sets the value of the setupDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSetupDuration(org.cip4.lib.xjdf.type.Duration value) {
        this.setupDuration = value;
    }

    /**
     * Gets the value of the jobPriority property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getJobPriority() {
        return jobPriority;
    }

    /**
     * Sets the value of the jobPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setJobPriority(Integer value) {
        this.jobPriority = value;
    }

    /**
     * Gets the value of the workStepID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkStepID() {
        return workStepID;
    }

    /**
     * Sets the value of the workStepID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkStepID(String value) {
        this.workStepID = value;
    }

    /**
     * Gets the value of the naturalLang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaturalLang() {
        return naturalLang;
    }

    /**
     * Sets the value of the naturalLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaturalLang(String value) {
        this.naturalLang = value;
    }

    /**
     * Gets the value of the cleanupDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.Duration getCleanupDuration() {
        return cleanupDuration;
    }

    /**
     * Sets the value of the cleanupDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCleanupDuration(org.cip4.lib.xjdf.type.Duration value) {
        this.cleanupDuration = value;
    }

    /**
     * Gets the value of the firstStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.DateTime getFirstStart() {
        return firstStart;
    }

    /**
     * Sets the value of the firstStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstStart(org.cip4.lib.xjdf.type.DateTime value) {
        this.firstStart = value;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.DateTime getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStart(org.cip4.lib.xjdf.type.DateTime value) {
        this.start = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.DateTime getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnd(org.cip4.lib.xjdf.type.DateTime value) {
        this.end = value;
    }

    /**
     * Gets the value of the nodeStatusDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeStatusDetails() {
        return nodeStatusDetails;
    }

    /**
     * Sets the value of the nodeStatusDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeStatusDetails(String value) {
        this.nodeStatusDetails = value;
    }

    /**
     * Gets the value of the lastEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.DateTime getLastEnd() {
        return lastEnd;
    }

    /**
     * Sets the value of the lastEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastEnd(org.cip4.lib.xjdf.type.DateTime value) {
        this.lastEnd = value;
    }

}
