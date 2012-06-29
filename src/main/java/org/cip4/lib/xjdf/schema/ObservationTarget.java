
package org.cip4.lib.xjdf.schema;

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
 *       &lt;attribute name="ObservationPath" type="{http://www.CIP4.org/JDFSchema_2_0}XPath" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ObservationTarget")
public class ObservationTarget
    implements Serializable
{

    @XmlAttribute(name = "ObservationPath")
    protected String observationPath;

    /**
     * Gets the value of the observationPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservationPath() {
        return observationPath;
    }

    /**
     * Sets the value of the observationPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservationPath(String value) {
        this.observationPath = value;
    }

}
