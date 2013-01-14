
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
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ModulePool" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}TestPool" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ActionPool" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Persistent" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="ChannelMode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="GenericAttributes" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKENS" />
 *       &lt;attribute name="Acknowledge" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="URLSchemes" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKENS" />
 *       &lt;attribute name="JMFRole" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Query" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="Type" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="Signal" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="Registration" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="Command" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "modulePool",
    "testPool",
    "actionPool"
})
@XmlRootElement(name = "MessageService")
public class MessageService
    implements Serializable
{

    @XmlElement(name = "ModulePool")
    protected List<ModulePool> modulePool;
    @XmlElement(name = "TestPool")
    protected List<TestPool> testPool;
    @XmlElement(name = "ActionPool")
    protected List<ActionPool> actionPool;
    @XmlAttribute(name = "Persistent")
    protected Boolean persistent;
    @XmlAttribute(name = "ChannelMode")
    @XmlSchemaType(name = "anySimpleType")
    protected String channelMode;
    @XmlAttribute(name = "GenericAttributes")
    protected List<String> genericAttributes;
    @XmlAttribute(name = "Acknowledge")
    protected Boolean acknowledge;
    @XmlAttribute(name = "URLSchemes")
    protected List<String> urlSchemes;
    @XmlAttribute(name = "JMFRole")
    @XmlSchemaType(name = "anySimpleType")
    protected String jmfRole;
    @XmlAttribute(name = "Query")
    protected Boolean query;
    @XmlAttribute(name = "Type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;
    @XmlAttribute(name = "Signal")
    protected Boolean signal;
    @XmlAttribute(name = "Registration")
    protected Boolean registration;
    @XmlAttribute(name = "Command")
    protected Boolean command;

    /**
     * Gets the value of the modulePool property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modulePool property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModulePool().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModulePool }
     * 
     * 
     */
    public List<ModulePool> getModulePool() {
        if (modulePool == null) {
            modulePool = new ArrayList<ModulePool>();
        }
        return this.modulePool;
    }

    /**
     * Gets the value of the testPool property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testPool property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestPool().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestPool }
     * 
     * 
     */
    public List<TestPool> getTestPool() {
        if (testPool == null) {
            testPool = new ArrayList<TestPool>();
        }
        return this.testPool;
    }

    /**
     * Gets the value of the actionPool property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actionPool property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActionPool().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActionPool }
     * 
     * 
     */
    public List<ActionPool> getActionPool() {
        if (actionPool == null) {
            actionPool = new ArrayList<ActionPool>();
        }
        return this.actionPool;
    }

    /**
     * Gets the value of the persistent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPersistent() {
        return persistent;
    }

    /**
     * Sets the value of the persistent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPersistent(Boolean value) {
        this.persistent = value;
    }

    /**
     * Gets the value of the channelMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelMode() {
        return channelMode;
    }

    /**
     * Sets the value of the channelMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelMode(String value) {
        this.channelMode = value;
    }

    /**
     * Gets the value of the genericAttributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericAttributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getGenericAttributes() {
        if (genericAttributes == null) {
            genericAttributes = new ArrayList<String>();
        }
        return this.genericAttributes;
    }

    /**
     * Gets the value of the acknowledge property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcknowledge() {
        return acknowledge;
    }

    /**
     * Sets the value of the acknowledge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcknowledge(Boolean value) {
        this.acknowledge = value;
    }

    /**
     * Gets the value of the urlSchemes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the urlSchemes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getURLSchemes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getURLSchemes() {
        if (urlSchemes == null) {
            urlSchemes = new ArrayList<String>();
        }
        return this.urlSchemes;
    }

    /**
     * Gets the value of the jmfRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJMFRole() {
        return jmfRole;
    }

    /**
     * Sets the value of the jmfRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJMFRole(String value) {
        this.jmfRole = value;
    }

    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQuery(Boolean value) {
        this.query = value;
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
     * Gets the value of the signal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSignal() {
        return signal;
    }

    /**
     * Sets the value of the signal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSignal(Boolean value) {
        this.signal = value;
    }

    /**
     * Gets the value of the registration property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRegistration() {
        return registration;
    }

    /**
     * Sets the value of the registration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRegistration(Boolean value) {
        this.registration = value;
    }

    /**
     * Gets the value of the command property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCommand() {
        return command;
    }

    /**
     * Sets the value of the command property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCommand(Boolean value) {
        this.command = value;
    }

}
