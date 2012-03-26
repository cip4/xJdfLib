
package org.cip4.lib.xjdf.schema.jdf;

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
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}PageAssignedList" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}AssemblySection" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="JobID" type="{http://www.CIP4.org/JDFSchema_2_0}shortString" />
 *       &lt;attribute name="Order" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="AssemblyIDs" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKENS" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "assemblySections",
    "pageAssignedLists"
})
@XmlRootElement(name = "AssemblySection")
public class AssemblySection
    implements Serializable
{

    @XmlElement(name = "AssemblySection")
    protected List<AssemblySection> assemblySections;
    @XmlElement(name = "PageAssignedList")
    protected List<PageAssignedList> pageAssignedLists;
    @XmlAttribute(name = "JobID")
    protected String jobID;
    @XmlAttribute(name = "Order")
    @XmlSchemaType(name = "anySimpleType")
    protected String order;
    @XmlAttribute(name = "AssemblyIDs")
    protected List<String> assemblyIDs;

    /**
     * Gets the value of the assemblySections property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assemblySections property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssemblySections().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssemblySection }
     * 
     * 
     */
    public List<AssemblySection> getAssemblySections() {
        if (assemblySections == null) {
            assemblySections = new ArrayList<AssemblySection>();
        }
        return this.assemblySections;
    }

    /**
     * Gets the value of the pageAssignedLists property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pageAssignedLists property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPageAssignedLists().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PageAssignedList }
     * 
     * 
     */
    public List<PageAssignedList> getPageAssignedLists() {
        if (pageAssignedLists == null) {
            pageAssignedLists = new ArrayList<PageAssignedList>();
        }
        return this.pageAssignedLists;
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

}
