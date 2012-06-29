
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
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Notification" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ResourceAudit" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Modified" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Created" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}PhaseTime" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ProcessRun" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Deleted" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
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
    "deleteds",
    "processRuns",
    "phaseTimes",
    "createds",
    "modifieds",
    "resourceAudits",
    "notifications"
})
@XmlRootElement(name = "AuditPool")
public class AuditPool
    implements Serializable
{

    @XmlElement(name = "Deleted")
    protected List<Deleted> deleteds;
    @XmlElement(name = "ProcessRun")
    protected List<ProcessRun> processRuns;
    @XmlElement(name = "PhaseTime")
    protected List<PhaseTime> phaseTimes;
    @XmlElement(name = "Created")
    protected List<Created> createds;
    @XmlElement(name = "Modified")
    protected List<Modified> modifieds;
    @XmlElement(name = "ResourceAudit")
    protected List<ResourceAudit> resourceAudits;
    @XmlElement(name = "Notification")
    protected List<Notification> notifications;

    /**
     * Gets the value of the deleteds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deleteds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeleteds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Deleted }
     * 
     * 
     */
    public List<Deleted> getDeleteds() {
        if (deleteds == null) {
            deleteds = new ArrayList<Deleted>();
        }
        return this.deleteds;
    }

    /**
     * Gets the value of the processRuns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processRuns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessRuns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcessRun }
     * 
     * 
     */
    public List<ProcessRun> getProcessRuns() {
        if (processRuns == null) {
            processRuns = new ArrayList<ProcessRun>();
        }
        return this.processRuns;
    }

    /**
     * Gets the value of the phaseTimes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phaseTimes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhaseTimes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhaseTime }
     * 
     * 
     */
    public List<PhaseTime> getPhaseTimes() {
        if (phaseTimes == null) {
            phaseTimes = new ArrayList<PhaseTime>();
        }
        return this.phaseTimes;
    }

    /**
     * Gets the value of the createds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the createds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreateds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Created }
     * 
     * 
     */
    public List<Created> getCreateds() {
        if (createds == null) {
            createds = new ArrayList<Created>();
        }
        return this.createds;
    }

    /**
     * Gets the value of the modifieds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modifieds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModifieds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Modified }
     * 
     * 
     */
    public List<Modified> getModifieds() {
        if (modifieds == null) {
            modifieds = new ArrayList<Modified>();
        }
        return this.modifieds;
    }

    /**
     * Gets the value of the resourceAudits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceAudits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceAudits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceAudit }
     * 
     * 
     */
    public List<ResourceAudit> getResourceAudits() {
        if (resourceAudits == null) {
            resourceAudits = new ArrayList<ResourceAudit>();
        }
        return this.resourceAudits;
    }

    /**
     * Gets the value of the notifications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notifications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotifications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Notification }
     * 
     * 
     */
    public List<Notification> getNotifications() {
        if (notifications == null) {
            notifications = new ArrayList<Notification>();
        }
        return this.notifications;
    }

}
