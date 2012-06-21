
package org.cip4.lib.xjdf.schema.jdf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ObjectResolution" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}TrapRegion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
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
    "trapRegions",
    "objectResolutions"
})
public class TrappingDetails
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "TrapRegion")
    protected List<TrapRegion> trapRegions;
    @XmlElement(name = "ObjectResolution")
    protected List<ObjectResolution> objectResolutions;
    @XmlAttribute(name = "DefaultTrapping")
    protected Boolean defaultTrapping;
    @XmlAttribute(name = "TrappingParamsRef")
    @XmlIDREF
    protected Object trappingParamsRef;
    @XmlAttribute(name = "TrappingOrder")
    protected List<String> trappingOrders;

    /**
     * Gets the value of the trapRegions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trapRegions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrapRegions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrapRegion }
     * 
     * 
     */
    public List<TrapRegion> getTrapRegions() {
        if (trapRegions == null) {
            trapRegions = new ArrayList<TrapRegion>();
        }
        return this.trapRegions;
    }

    /**
     * Gets the value of the objectResolutions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectResolutions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectResolutions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectResolution }
     * 
     * 
     */
    public List<ObjectResolution> getObjectResolutions() {
        if (objectResolutions == null) {
            objectResolutions = new ArrayList<ObjectResolution>();
        }
        return this.objectResolutions;
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
     *     {@link Object }
     *     
     */
    public Object getTrappingParamsRef() {
        return trappingParamsRef;
    }

    /**
     * Sets the value of the trappingParamsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTrappingParamsRef(Object value) {
        this.trappingParamsRef = value;
    }

    /**
     * Gets the value of the trappingOrders property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trappingOrders property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrappingOrders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTrappingOrders() {
        if (trappingOrders == null) {
            trappingOrders = new ArrayList<String>();
        }
        return this.trappingOrders;
    }

}
