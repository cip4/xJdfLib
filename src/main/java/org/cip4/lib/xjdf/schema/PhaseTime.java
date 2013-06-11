
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for PhaseTime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhaseTime">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}Audit">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Part" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ModulePhase" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}MISDetails" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="StatusDetails" type="{http://www.CIP4.org/JDFSchema_2_0}shortString" />
 *       &lt;attribute name="Status" type="{http://www.CIP4.org/JDFSchema_2_0}EnumNodeStatus" />
 *       &lt;attribute name="Start" type="{http://www.CIP4.org/JDFSchema_2_0}dateTime" />
 *       &lt;attribute name="End" type="{http://www.CIP4.org/JDFSchema_2_0}dateTime" />
 *       &lt;attribute name="DeviceRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhaseTime", propOrder = {
    "part",
    "modulePhase",
    "misDetails"
})
public class PhaseTime
    extends Audit
    implements Serializable
{

    @XmlElement(name = "Part")
    protected List<Part> part;
    @XmlElement(name = "ModulePhase")
    protected List<ModulePhase> modulePhase;
    @XmlElement(name = "MISDetails")
    protected List<MISDetails> misDetails;
    @XmlAttribute(name = "StatusDetails")
    protected String statusDetails;
    @XmlAttribute(name = "Status")
    protected EnumNodeStatus status;
    @XmlAttribute(name = "Start")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.DateTime.class)
    protected org.cip4.lib.xjdf.type.DateTime start;
    @XmlAttribute(name = "End")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.DateTime.class)
    protected org.cip4.lib.xjdf.type.DateTime end;
    @XmlAttribute(name = "DeviceRef")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IDREF.class)
    protected org.cip4.lib.xjdf.type.IDREF deviceRef;

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
     * Gets the value of the modulePhase property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modulePhase property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModulePhase().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModulePhase }
     * 
     * 
     */
    public List<ModulePhase> getModulePhase() {
        if (modulePhase == null) {
            modulePhase = new ArrayList<ModulePhase>();
        }
        return this.modulePhase;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link EnumNodeStatus }
     *     
     */
    public EnumNodeStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumNodeStatus }
     *     
     */
    public void setStatus(EnumNodeStatus value) {
        this.status = value;
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
     * Gets the value of the deviceRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.IDREF getDeviceRef() {
        return deviceRef;
    }

    /**
     * Sets the value of the deviceRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceRef(org.cip4.lib.xjdf.type.IDREF value) {
        this.deviceRef = value;
    }

}
