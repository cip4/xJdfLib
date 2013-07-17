
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmbossingIntent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmbossingIntent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}IntentType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}EmbossingItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmbossingIntent", propOrder = {
    "embossingItem"
})
public class EmbossingIntent
    extends IntentType
    implements Serializable
{

    @XmlElement(name = "EmbossingItem")
    protected List<EmbossingItem> embossingItem;

    /**
     * Gets the value of the embossingItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the embossingItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmbossingItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmbossingItem }
     * 
     * 
     */
    public List<EmbossingItem> getEmbossingItem() {
        if (embossingItem == null) {
            embossingItem = new ArrayList<EmbossingItem>();
        }
        return this.embossingItem;
    }

}
