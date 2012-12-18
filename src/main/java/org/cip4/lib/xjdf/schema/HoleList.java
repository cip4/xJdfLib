
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HoleList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HoleList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Hole" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}HoleLine" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "HoleList", propOrder = {
    "hole",
    "holeLine"
})
public class HoleList
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "Hole")
    protected List<Hole> hole;
    @XmlElement(name = "HoleLine")
    protected List<HoleLine> holeLine;

    /**
     * Gets the value of the hole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Hole }
     * 
     * 
     */
    public List<Hole> getHole() {
        if (hole == null) {
            hole = new ArrayList<Hole>();
        }
        return this.hole;
    }

    /**
     * Gets the value of the holeLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the holeLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHoleLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HoleLine }
     * 
     * 
     */
    public List<HoleLine> getHoleLine() {
        if (holeLine == null) {
            holeLine = new ArrayList<HoleLine>();
        }
        return this.holeLine;
    }

}
