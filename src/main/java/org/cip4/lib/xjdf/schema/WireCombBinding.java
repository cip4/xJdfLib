
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}HoleList" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="WireCombMaterial" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="WireCombBrand" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="WireCombShape" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "holeList"
})
@XmlRootElement(name = "WireCombBinding")
public class WireCombBinding
    implements Serializable
{

    @XmlElement(name = "HoleList")
    protected List<HoleList> holeList;
    @XmlAttribute(name = "WireCombMaterial")
    @XmlSchemaType(name = "anySimpleType")
    protected String wireCombMaterial;
    @XmlAttribute(name = "WireCombBrand")
    protected String wireCombBrand;
    @XmlAttribute(name = "WireCombShape")
    @XmlSchemaType(name = "anySimpleType")
    protected String wireCombShape;

    /**
     * Gets the value of the holeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the holeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHoleList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HoleList }
     * 
     * 
     */
    public List<HoleList> getHoleList() {
        if (holeList == null) {
            holeList = new ArrayList<HoleList>();
        }
        return this.holeList;
    }

    /**
     * Gets the value of the wireCombMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWireCombMaterial() {
        return wireCombMaterial;
    }

    /**
     * Sets the value of the wireCombMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWireCombMaterial(String value) {
        this.wireCombMaterial = value;
    }

    /**
     * Gets the value of the wireCombBrand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWireCombBrand() {
        return wireCombBrand;
    }

    /**
     * Sets the value of the wireCombBrand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWireCombBrand(String value) {
        this.wireCombBrand = value;
    }

    /**
     * Gets the value of the wireCombShape property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWireCombShape() {
        return wireCombShape;
    }

    /**
     * Sets the value of the wireCombShape property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWireCombShape(String value) {
        this.wireCombShape = value;
    }

}
