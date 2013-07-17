
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductionSubPath complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductionSubPath">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ProductionPathID" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductionSubPath")
public class ProductionSubPath
    implements Serializable
{

    @XmlAttribute(name = "ProductionPathID")
    protected String productionPathID;

    /**
     * Gets the value of the productionPathID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductionPathID() {
        return productionPathID;
    }

    /**
     * Sets the value of the productionPathID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductionPathID(String value) {
        this.productionPathID = value;
    }

}
