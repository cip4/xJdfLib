
package org.cip4.lib.xjdf.schema.jdf;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="IncludeOCG" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="OCGName" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "OCGControl")
public class OCGControl
    implements Serializable
{

    @XmlAttribute(name = "IncludeOCG")
    protected Boolean includeOCG;
    @XmlAttribute(name = "OCGName")
    protected String ocgName;

    /**
     * Gets the value of the includeOCG property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIncludeOCG() {
        return includeOCG;
    }

    /**
     * Sets the value of the includeOCG property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeOCG(Boolean value) {
        this.includeOCG = value;
    }

    /**
     * Gets the value of the ocgName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOCGName() {
        return ocgName;
    }

    /**
     * Sets the value of the ocgName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOCGName(String value) {
        this.ocgName = value;
    }

}
