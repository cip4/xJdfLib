
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ShapeDef" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="StationName" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="StationAmount" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="AssemblyIDs" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKENS" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "shapeDef"
})
@XmlRootElement(name = "Station")
public class Station
    implements Serializable
{

    @XmlElement(name = "ShapeDef")
    protected List<ShapeDef> shapeDef;
    @XmlAttribute(name = "StationName")
    protected String stationName;
    @XmlAttribute(name = "StationAmount")
    protected Integer stationAmount;
    @XmlAttribute(name = "AssemblyIDs")
    protected List<String> assemblyIDs;

    /**
     * Gets the value of the shapeDef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shapeDef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShapeDef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShapeDef }
     * 
     * 
     */
    public List<ShapeDef> getShapeDef() {
        if (shapeDef == null) {
            shapeDef = new ArrayList<ShapeDef>();
        }
        return this.shapeDef;
    }

    /**
     * Gets the value of the stationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationName() {
        return stationName;
    }

    /**
     * Sets the value of the stationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationName(String value) {
        this.stationName = value;
    }

    /**
     * Gets the value of the stationAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStationAmount() {
        return stationAmount;
    }

    /**
     * Sets the value of the stationAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStationAmount(Integer value) {
        this.stationAmount = value;
    }

    /**
     * Gets the value of the assemblyIDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assemblyIDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssemblyIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAssemblyIDs() {
        if (assemblyIDs == null) {
            assemblyIDs = new ArrayList<String>();
        }
        return this.assemblyIDs;
    }

}
