
package org.cip4.lib.xjdf.schema.jdf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ConstraintValue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="AttemptFixupWarnings" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="Constraint" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="AttemptFixupErrors" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="Status" type="{http://www.CIP4.org/JDFSchema_2_0}EnumNodeStatus" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "constraintValues"
})
@XmlRootElement(name = "PreflightConstraint")
public class PreflightConstraint
    implements Serializable
{

    @XmlElement(name = "ConstraintValue")
    protected List<ConstraintValue> constraintValues;
    @XmlAttribute(name = "AttemptFixupWarnings")
    protected Boolean attemptFixupWarnings;
    @XmlAttribute(name = "Constraint")
    protected String constraint;
    @XmlAttribute(name = "AttemptFixupErrors")
    protected Boolean attemptFixupErrors;
    @XmlAttribute(name = "Status")
    protected EnumNodeStatus status;

    /**
     * Gets the value of the constraintValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the constraintValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConstraintValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConstraintValue }
     * 
     * 
     */
    public List<ConstraintValue> getConstraintValues() {
        if (constraintValues == null) {
            constraintValues = new ArrayList<ConstraintValue>();
        }
        return this.constraintValues;
    }

    /**
     * Gets the value of the attemptFixupWarnings property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAttemptFixupWarnings() {
        return attemptFixupWarnings;
    }

    /**
     * Sets the value of the attemptFixupWarnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAttemptFixupWarnings(Boolean value) {
        this.attemptFixupWarnings = value;
    }

    /**
     * Gets the value of the constraint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConstraint() {
        return constraint;
    }

    /**
     * Sets the value of the constraint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstraint(String value) {
        this.constraint = value;
    }

    /**
     * Gets the value of the attemptFixupErrors property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAttemptFixupErrors() {
        return attemptFixupErrors;
    }

    /**
     * Sets the value of the attemptFixupErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAttemptFixupErrors(Boolean value) {
        this.attemptFixupErrors = value;
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

}
