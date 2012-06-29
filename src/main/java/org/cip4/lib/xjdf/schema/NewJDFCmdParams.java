
package org.cip4.lib.xjdf.schema;

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
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}IDInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="JDFDetails" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "idInfos"
})
@XmlRootElement(name = "NewJDFCmdParams")
public class NewJDFCmdParams
    implements Serializable
{

    @XmlElement(name = "IDInfo")
    protected List<IDInfo> idInfos;
    @XmlAttribute(name = "JDFDetails")
    protected String jdfDetails;

    /**
     * Gets the value of the idInfos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idInfos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIDInfos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IDInfo }
     * 
     * 
     */
    public List<IDInfo> getIDInfos() {
        if (idInfos == null) {
            idInfos = new ArrayList<IDInfo>();
        }
        return this.idInfos;
    }

    /**
     * Gets the value of the jdfDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJDFDetails() {
        return jdfDetails;
    }

    /**
     * Sets the value of the jdfDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJDFDetails(String value) {
        this.jdfDetails = value;
    }

}
