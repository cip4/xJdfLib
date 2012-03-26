
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
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}otherwise" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}when" maxOccurs="unbounded" minOccurs="0"/>
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
    "whens",
    "otherwises"
})
@XmlRootElement(name = "choice")
public class Choice
    implements Serializable
{

    @XmlElement(name = "when")
    protected List<When> whens;
    @XmlElement(name = "otherwise")
    protected List<Otherwise> otherwises;

    /**
     * Gets the value of the whens property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the whens property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWhens().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link When }
     * 
     * 
     */
    public List<When> getWhens() {
        if (whens == null) {
            whens = new ArrayList<When>();
        }
        return this.whens;
    }

    /**
     * Gets the value of the otherwises property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherwises property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherwises().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Otherwise }
     * 
     * 
     */
    public List<Otherwise> getOtherwises() {
        if (otherwises == null) {
            otherwises = new ArrayList<Otherwise>();
        }
        return this.otherwises;
    }

}
