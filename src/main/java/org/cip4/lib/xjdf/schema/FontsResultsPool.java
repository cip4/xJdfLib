
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="Locked" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="PipeURL" type="{http://www.CIP4.org/JDFSchema_2_0}URL" />
 *       &lt;attribute name="Class" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PartIDKeys">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.CIP4.org/JDFSchema_2_0}EnumPartIDKeys" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="PipeProtocol" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="PipeID" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="AgentName" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="AgentVersion" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="ProductID" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="Author" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="PipePartIDKeys">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.CIP4.org/JDFSchema_2_0}EnumPartIDKeys" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="QualityControlResultRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="SourceResourceRefs" type="{http://www.CIP4.org/JDFSchema_2_0}IDREFS" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "FontsResultsPool")
public class FontsResultsPool
    implements Serializable
{

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
    @XmlAttribute(name = "PipeID")
    protected String pipeID;
    @XmlAttribute(name = "AgentName")
    protected String agentName;
    @XmlAttribute(name = "AgentVersion")
    protected String agentVersion;
    @XmlAttribute(name = "ProductID")
    protected String productID;
    @XmlAttribute(name = "Author")
    protected String author;
    @XmlAttribute(name = "PipePartIDKeys")
    protected List<EnumPartIDKeys> pipePartIDKeys;
    @XmlAttribute(name = "QualityControlResultRef")
    @XmlIDREF
    protected Object qualityControlResultRef;
    @XmlAttribute(name = "SourceResourceRefs")
    @XmlIDREF
    protected List<Object> sourceResourceRefs;

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

}
