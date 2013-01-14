
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
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}BoxArgument" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}BoxToBoxDifference" maxOccurs="unbounded" minOccurs="0"/>
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
    "boxArgument",
    "boxToBoxDifference"
})
@XmlRootElement(name = "PreflightArgument")
public class PreflightArgument
    implements Serializable
{

    @XmlElement(name = "BoxArgument")
    protected List<BoxArgument> boxArgument;
    @XmlElement(name = "BoxToBoxDifference")
    protected List<BoxToBoxDifference> boxToBoxDifference;

    /**
     * Gets the value of the boxArgument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the boxArgument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoxArgument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BoxArgument }
     * 
     * 
     */
    public List<BoxArgument> getBoxArgument() {
        if (boxArgument == null) {
            boxArgument = new ArrayList<BoxArgument>();
        }
        return this.boxArgument;
    }

    /**
     * Gets the value of the boxToBoxDifference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the boxToBoxDifference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoxToBoxDifference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BoxToBoxDifference }
     * 
     * 
     */
    public List<BoxToBoxDifference> getBoxToBoxDifference() {
        if (boxToBoxDifference == null) {
            boxToBoxDifference = new ArrayList<BoxToBoxDifference>();
        }
        return this.boxToBoxDifference;
    }

}
