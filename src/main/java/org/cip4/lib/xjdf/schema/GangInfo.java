
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
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
 *       &lt;attribute name="GangName" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "GangInfo")
public class GangInfo
    implements Serializable
{

    @XmlAttribute(name = "GangName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String gangName;

    /**
     * Gets the value of the gangName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGangName() {
        return gangName;
    }

    /**
     * Sets the value of the gangName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGangName(String value) {
        this.gangName = value;
    }

}
