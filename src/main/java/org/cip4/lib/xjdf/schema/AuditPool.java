
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Notification" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ResourceAudit" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Modified" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Created" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}PhaseTime" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ProcessRun" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Deleted" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "notification",
    "resourceAudit",
    "modified",
    "created",
    "phaseTime",
    "processRun",
    "deleted"
})
@XmlRootElement(name = "AuditPool")
public class AuditPool
    implements Serializable
{

    @XmlElement(name = "Notification")
    protected List<Notification> notification;
    @XmlElement(name = "ResourceAudit")
    protected List<ResourceAudit> resourceAudit;
    @XmlElement(name = "Modified")
    protected List<Modified> modified;
    @XmlElement(name = "Created")
    protected List<Created> created;
    @XmlElement(name = "PhaseTime")
    protected List<PhaseTime> phaseTime;
    @XmlElement(name = "ProcessRun")
    protected List<ProcessRun> processRun;
    @XmlElement(name = "Deleted")
    protected List<Deleted> deleted;

    /**
     * Gets the value of the notification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Notification }
     * 
     * 
     */
    public List<Notification> getNotification() {
        if (notification == null) {
            notification = new ArrayList<Notification>();
        }
        return this.notification;
    }

    /**
     * Gets the value of the resourceAudit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceAudit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceAudit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceAudit }
     * 
     * 
     */
    public List<ResourceAudit> getResourceAudit() {
        if (resourceAudit == null) {
            resourceAudit = new ArrayList<ResourceAudit>();
        }
        return this.resourceAudit;
    }

    /**
     * Gets the value of the modified property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modified property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModified().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Modified }
     * 
     * 
     */
    public List<Modified> getModified() {
        if (modified == null) {
            modified = new ArrayList<Modified>();
        }
        return this.modified;
    }

    /**
     * Gets the value of the created property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the created property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreated().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Created }
     * 
     * 
     */
    public List<Created> getCreated() {
        if (created == null) {
            created = new ArrayList<Created>();
        }
        return this.created;
    }

    /**
     * Gets the value of the phaseTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phaseTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhaseTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhaseTime }
     * 
     * 
     */
    public List<PhaseTime> getPhaseTime() {
        if (phaseTime == null) {
            phaseTime = new ArrayList<PhaseTime>();
        }
        return this.phaseTime;
    }

    /**
     * Gets the value of the processRun property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processRun property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessRun().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcessRun }
     * 
     * 
     */
    public List<ProcessRun> getProcessRun() {
        if (processRun == null) {
            processRun = new ArrayList<ProcessRun>();
        }
        return this.processRun;
    }

    /**
     * Gets the value of the deleted property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deleted property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeleted().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Deleted }
     * 
     * 
     */
    public List<Deleted> getDeleted() {
        if (deleted == null) {
            deleted = new ArrayList<Deleted>();
        }
        return this.deleted;
    }

}
