
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for TrappingDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrappingDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ObjectResolution" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}TrapRegion" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="DefaultTrapping" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="TrappingParamsRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="TrappingOrder" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKENS" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrappingDetails", propOrder = {
    "objectResolution",
    "trapRegion"
})
public class TrappingDetails
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "ObjectResolution")
    protected List<ObjectResolution> objectResolution;
    @XmlElement(name = "TrapRegion")
    protected List<TrapRegion> trapRegion;
    @XmlAttribute(name = "DefaultTrapping")
    protected Boolean defaultTrapping;
    @XmlAttribute(name = "TrappingParamsRef")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IDREF.class)
    protected org.cip4.lib.xjdf.type.IDREF trappingParamsRef;
    @XmlAttribute(name = "TrappingOrder")
    protected List<String> trappingOrder;

    /**
     * Gets the value of the objectResolution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectResolution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectResolution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectResolution }
     * 
     * 
     */
    public List<ObjectResolution> getObjectResolution() {
        if (objectResolution == null) {
            objectResolution = new ArrayList<ObjectResolution>();
        }
        return this.objectResolution;
    }

    /**
     * Gets the value of the trapRegion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trapRegion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrapRegion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrapRegion }
     * 
     * 
     */
    public List<TrapRegion> getTrapRegion() {
        if (trapRegion == null) {
            trapRegion = new ArrayList<TrapRegion>();
        }
        return this.trapRegion;
    }

    /**
     * Gets the value of the defaultTrapping property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultTrapping() {
        return defaultTrapping;
    }

    /**
     * Sets the value of the defaultTrapping property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultTrapping(Boolean value) {
        this.defaultTrapping = value;
    }

    /**
     * Gets the value of the trappingParamsRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.IDREF getTrappingParamsRef() {
        return trappingParamsRef;
    }

    /**
     * Sets the value of the trappingParamsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrappingParamsRef(org.cip4.lib.xjdf.type.IDREF value) {
        this.trappingParamsRef = value;
    }

    /**
     * Gets the value of the trappingOrder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trappingOrder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrappingOrder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTrappingOrder() {
        if (trappingOrder == null) {
            trappingOrder = new ArrayList<String>();
        }
        return this.trappingOrder;
    }

}
