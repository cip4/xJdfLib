
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for HoleMakingIntent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HoleMakingIntent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}IntentType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}HoleList" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="HoleReferenceEdge" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Extent" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="HoleType" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HoleMakingIntent", propOrder = {
    "holeList"
})
public class HoleMakingIntent
    extends IntentType
    implements Serializable
{

    @XmlElement(name = "HoleList")
    protected List<HoleList> holeList;
    @XmlAttribute(name = "HoleReferenceEdge")
    @XmlSchemaType(name = "anySimpleType")
    protected String holeReferenceEdge;
    @XmlAttribute(name = "Extent")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.XYPair.class)
    protected org.cip4.lib.xjdf.type.XYPair extent;
    @XmlAttribute(name = "HoleType")
    protected String holeType;

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
     * Gets the value of the holeReferenceEdge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoleReferenceEdge() {
        return holeReferenceEdge;
    }

    /**
     * Sets the value of the holeReferenceEdge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoleReferenceEdge(String value) {
        this.holeReferenceEdge = value;
    }

    /**
     * Gets the value of the extent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.XYPair getExtent() {
        return extent;
    }

    /**
     * Sets the value of the extent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtent(org.cip4.lib.xjdf.type.XYPair value) {
        this.extent = value;
    }

    /**
     * Gets the value of the holeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoleType() {
        return holeType;
    }

    /**
     * Sets the value of the holeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoleType(String value) {
        this.holeType = value;
    }

}
