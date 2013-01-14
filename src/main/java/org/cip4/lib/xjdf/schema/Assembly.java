
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for Assembly complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Assembly">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}PageAssignedList" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}AssemblySection" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="JobID" type="{http://www.CIP4.org/JDFSchema_2_0}shortString" />
 *       &lt;attribute name="PhysicalSection" type="{http://www.CIP4.org/JDFSchema_2_0}IntegerList" />
 *       &lt;attribute name="AssemblyIDs" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKENS" />
 *       &lt;attribute name="BindingSide" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="JogSide" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Order" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PageListRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Assembly", propOrder = {
    "pageAssignedList",
    "assemblySection"
})
public class Assembly
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "PageAssignedList")
    protected List<PageAssignedList> pageAssignedList;
    @XmlElement(name = "AssemblySection")
    protected List<AssemblySection> assemblySection;
    @XmlAttribute(name = "JobID")
    protected String jobID;
    @XmlAttribute(name = "PhysicalSection")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IntegerList.class)
    protected org.cip4.lib.xjdf.type.IntegerList physicalSection;
    @XmlAttribute(name = "AssemblyIDs")
    protected List<String> assemblyIDs;
    @XmlAttribute(name = "BindingSide")
    @XmlSchemaType(name = "anySimpleType")
    protected String bindingSide;
    @XmlAttribute(name = "JogSide")
    @XmlSchemaType(name = "anySimpleType")
    protected String jogSide;
    @XmlAttribute(name = "Order")
    @XmlSchemaType(name = "anySimpleType")
    protected String order;
    @XmlAttribute(name = "PageListRef")
    @XmlIDREF
    protected Object pageListRef;

    /**
     * Gets the value of the pageAssignedList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pageAssignedList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPageAssignedList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PageAssignedList }
     * 
     * 
     */
    public List<PageAssignedList> getPageAssignedList() {
        if (pageAssignedList == null) {
            pageAssignedList = new ArrayList<PageAssignedList>();
        }
        return this.pageAssignedList;
    }

    /**
     * Gets the value of the assemblySection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assemblySection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssemblySection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssemblySection }
     * 
     * 
     */
    public List<AssemblySection> getAssemblySection() {
        if (assemblySection == null) {
            assemblySection = new ArrayList<AssemblySection>();
        }
        return this.assemblySection;
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
     * Gets the value of the physicalSection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.IntegerList getPhysicalSection() {
        return physicalSection;
    }

    /**
     * Sets the value of the physicalSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysicalSection(org.cip4.lib.xjdf.type.IntegerList value) {
        this.physicalSection = value;
    }

    /**
     * Gets the value of the assemblyIDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assemblyIDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssemblyIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAssemblyIDs() {
        if (assemblyIDs == null) {
            assemblyIDs = new ArrayList<String>();
        }
        return this.assemblyIDs;
    }

    /**
     * Gets the value of the bindingSide property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBindingSide() {
        return bindingSide;
    }

    /**
     * Sets the value of the bindingSide property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBindingSide(String value) {
        this.bindingSide = value;
    }

    /**
     * Gets the value of the jogSide property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJogSide() {
        return jogSide;
    }

    /**
     * Sets the value of the jogSide property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJogSide(String value) {
        this.jogSide = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrder(String value) {
        this.order = value;
    }

    /**
     * Gets the value of the pageListRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPageListRef() {
        return pageListRef;
    }

    /**
     * Sets the value of the pageListRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPageListRef(Object value) {
        this.pageListRef = value;
    }

}
