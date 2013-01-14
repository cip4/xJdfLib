
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeedingParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeedingParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}CollatingItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Feeder" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeedingParams", propOrder = {
    "collatingItem",
    "feeder"
})
public class FeedingParams
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "CollatingItem")
    protected List<CollatingItem> collatingItem;
    @XmlElement(name = "Feeder")
    protected List<Feeder> feeder;

    /**
     * Gets the value of the collatingItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collatingItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollatingItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollatingItem }
     * 
     * 
     */
    public List<CollatingItem> getCollatingItem() {
        if (collatingItem == null) {
            collatingItem = new ArrayList<CollatingItem>();
        }
        return this.collatingItem;
    }

    /**
     * Gets the value of the feeder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feeder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeeder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Feeder }
     * 
     * 
     */
    public List<Feeder> getFeeder() {
        if (feeder == null) {
            feeder = new ArrayList<Feeder>();
        }
        return this.feeder;
    }

}
