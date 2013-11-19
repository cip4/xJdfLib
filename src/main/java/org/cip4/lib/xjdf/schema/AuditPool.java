
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Audit" maxOccurs="unbounded" minOccurs="0"/>
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
    "audit"
})
@XmlRootElement(name = "AuditPool")
public class AuditPool
    implements Serializable
{

    @XmlElementRef(name = "Audit", namespace = "http://www.CIP4.org/JDFSchema_2_0", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends Audit>> audit;

    /**
     * Gets the value of the audit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Audit }{@code >}
     * {@link JAXBElement }{@code <}{@link ResourceAudit }{@code >}
     * {@link JAXBElement }{@code <}{@link Deleted }{@code >}
     * {@link JAXBElement }{@code <}{@link ProcessRun }{@code >}
     * {@link JAXBElement }{@code <}{@link Notification }{@code >}
     * {@link JAXBElement }{@code <}{@link Modified }{@code >}
     * {@link JAXBElement }{@code <}{@link Created }{@code >}
     * {@link JAXBElement }{@code <}{@link PhaseTime }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends Audit>> getAudit() {
        if (audit == null) {
            audit = new ArrayList<JAXBElement<? extends Audit>>();
        }
        return this.audit;
    }

}
