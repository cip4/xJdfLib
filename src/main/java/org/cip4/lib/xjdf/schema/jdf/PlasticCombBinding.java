
package org.cip4.lib.xjdf.schema.jdf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}HoleList" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="CombBrand" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="PlasticCombType" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "holeLists"
})
@XmlRootElement(name = "PlasticCombBinding")
public class PlasticCombBinding
    implements Serializable
{

    @XmlElement(name = "HoleList")
    protected List<HoleList> holeLists;
    @XmlAttribute(name = "CombBrand")
    protected String combBrand;
    @XmlAttribute(name = "PlasticCombType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String plasticCombType;

    /**
     * Gets the value of the holeLists property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the holeLists property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHoleLists().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HoleList }
     * 
     * 
     */
    public List<HoleList> getHoleLists() {
        if (holeLists == null) {
            holeLists = new ArrayList<HoleList>();
        }
        return this.holeLists;
    }

    /**
     * Gets the value of the combBrand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCombBrand() {
        return combBrand;
    }

    /**
     * Sets the value of the combBrand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCombBrand(String value) {
        this.combBrand = value;
    }

    /**
     * Gets the value of the plasticCombType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlasticCombType() {
        return plasticCombType;
    }

    /**
     * Sets the value of the plasticCombType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlasticCombType(String value) {
        this.plasticCombType = value;
    }

}
