
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
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}CollatingItem" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Feeder" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
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
    "feeders",
    "collatingItems"
})
public class FeedingParams
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "Feeder")
    protected List<Feeder> feeders;
    @XmlElement(name = "CollatingItem")
    protected List<CollatingItem> collatingItems;

    /**
     * Gets the value of the feeders property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feeders property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeeders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Feeder }
     * 
     * 
     */
    public List<Feeder> getFeeders() {
        if (feeders == null) {
            feeders = new ArrayList<Feeder>();
        }
        return this.feeders;
    }

    /**
     * Gets the value of the collatingItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collatingItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollatingItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollatingItem }
     * 
     * 
     */
    public List<CollatingItem> getCollatingItems() {
        if (collatingItems == null) {
            collatingItems = new ArrayList<CollatingItem>();
        }
        return this.collatingItems;
    }

}
