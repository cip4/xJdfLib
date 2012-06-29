
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
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ModuleCap" maxOccurs="unbounded" minOccurs="0"/>
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
    "moduleCaps"
})
@XmlRootElement(name = "ModulePool")
public class ModulePool
    implements Serializable
{

    @XmlElement(name = "ModuleCap")
    protected List<ModuleCap> moduleCaps;

    /**
     * Gets the value of the moduleCaps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the moduleCaps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModuleCaps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModuleCap }
     * 
     * 
     */
    public List<ModuleCap> getModuleCaps() {
        if (moduleCaps == null) {
            moduleCaps = new ArrayList<ModuleCap>();
        }
        return this.moduleCaps;
    }

}
