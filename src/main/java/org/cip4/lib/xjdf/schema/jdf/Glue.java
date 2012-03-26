
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
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}GlueApplication" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}GlueLine" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="WorkingDirection" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "glueLines",
    "glueApplications"
})
@XmlRootElement(name = "Glue")
public class Glue
    implements Serializable
{

    @XmlElement(name = "GlueLine")
    protected List<GlueLine> glueLines;
    @XmlElement(name = "GlueApplication")
    protected List<GlueApplication> glueApplications;
    @XmlAttribute(name = "WorkingDirection")
    @XmlSchemaType(name = "anySimpleType")
    protected String workingDirection;

    /**
     * Gets the value of the glueLines property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the glueLines property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGlueLines().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GlueLine }
     * 
     * 
     */
    public List<GlueLine> getGlueLines() {
        if (glueLines == null) {
            glueLines = new ArrayList<GlueLine>();
        }
        return this.glueLines;
    }

    /**
     * Gets the value of the glueApplications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the glueApplications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGlueApplications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GlueApplication }
     * 
     * 
     */
    public List<GlueApplication> getGlueApplications() {
        if (glueApplications == null) {
            glueApplications = new ArrayList<GlueApplication>();
        }
        return this.glueApplications;
    }

    /**
     * Gets the value of the workingDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkingDirection() {
        return workingDirection;
    }

    /**
     * Sets the value of the workingDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkingDirection(String value) {
        this.workingDirection = value;
    }

}
