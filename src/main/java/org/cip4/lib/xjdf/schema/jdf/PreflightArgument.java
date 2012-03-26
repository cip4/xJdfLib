
package org.cip4.lib.xjdf.schema.jdf;

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
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}BoxArgument" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}BoxToBoxDifference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
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
    "boxToBoxDifferences",
    "boxArguments"
})
@XmlRootElement(name = "PreflightArgument")
public class PreflightArgument
    implements Serializable
{

    @XmlElement(name = "BoxToBoxDifference")
    protected List<BoxToBoxDifference> boxToBoxDifferences;
    @XmlElement(name = "BoxArgument")
    protected List<BoxArgument> boxArguments;

    /**
     * Gets the value of the boxToBoxDifferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the boxToBoxDifferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoxToBoxDifferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BoxToBoxDifference }
     * 
     * 
     */
    public List<BoxToBoxDifference> getBoxToBoxDifferences() {
        if (boxToBoxDifferences == null) {
            boxToBoxDifferences = new ArrayList<BoxToBoxDifference>();
        }
        return this.boxToBoxDifferences;
    }

    /**
     * Gets the value of the boxArguments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the boxArguments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoxArguments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BoxArgument }
     * 
     * 
     */
    public List<BoxArgument> getBoxArguments() {
        if (boxArguments == null) {
            boxArguments = new ArrayList<BoxArgument>();
        }
        return this.boxArguments;
    }

}
