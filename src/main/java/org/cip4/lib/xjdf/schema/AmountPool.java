
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}PartAmount" maxOccurs="unbounded" minOccurs="0"/>
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
    "partAmount"
})
@XmlRootElement(name = "AmountPool")
public class AmountPool
    implements Serializable
{

    @XmlElement(name = "PartAmount")
    protected List<PartAmount> partAmount;

    /**
     * Gets the value of the partAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartAmount }
     * 
     * 
     */
    public List<PartAmount> getPartAmount() {
        if (partAmount == null) {
            partAmount = new ArrayList<PartAmount>();
        }
        return this.partAmount;
    }

}
