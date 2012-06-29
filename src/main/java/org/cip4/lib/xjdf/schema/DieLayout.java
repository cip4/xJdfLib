
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DieLayout complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DieLayout">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}RuleLength" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Station" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="Waste" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="DieSide" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="MediaSide" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Rotated" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="MediaRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="DeviceRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="FileSpecRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DieLayout", propOrder = {
    "stations",
    "ruleLengths"
})
public class DieLayout
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "Station")
    protected List<Station> stations;
    @XmlElement(name = "RuleLength")
    protected List<RuleLength> ruleLengths;
    @XmlAttribute(name = "Waste")
    protected Double waste;
    @XmlAttribute(name = "DieSide")
    @XmlSchemaType(name = "anySimpleType")
    protected String dieSide;
    @XmlAttribute(name = "MediaSide")
    @XmlSchemaType(name = "anySimpleType")
    protected String mediaSide;
    @XmlAttribute(name = "Rotated")
    protected Boolean rotated;
    @XmlAttribute(name = "MediaRef")
    @XmlIDREF
    protected Object mediaRef;
    @XmlAttribute(name = "DeviceRef")
    @XmlIDREF
    protected Object deviceRef;
    @XmlAttribute(name = "FileSpecRef")
    @XmlIDREF
    protected Object fileSpecRef;

    /**
     * Gets the value of the stations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Station }
     * 
     * 
     */
    public List<Station> getStations() {
        if (stations == null) {
            stations = new ArrayList<Station>();
        }
        return this.stations;
    }

    /**
     * Gets the value of the ruleLengths property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ruleLengths property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRuleLengths().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RuleLength }
     * 
     * 
     */
    public List<RuleLength> getRuleLengths() {
        if (ruleLengths == null) {
            ruleLengths = new ArrayList<RuleLength>();
        }
        return this.ruleLengths;
    }

    /**
     * Gets the value of the waste property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWaste() {
        return waste;
    }

    /**
     * Sets the value of the waste property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWaste(Double value) {
        this.waste = value;
    }

    /**
     * Gets the value of the dieSide property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDieSide() {
        return dieSide;
    }

    /**
     * Sets the value of the dieSide property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDieSide(String value) {
        this.dieSide = value;
    }

    /**
     * Gets the value of the mediaSide property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaSide() {
        return mediaSide;
    }

    /**
     * Sets the value of the mediaSide property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaSide(String value) {
        this.mediaSide = value;
    }

    /**
     * Gets the value of the rotated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRotated() {
        return rotated;
    }

    /**
     * Sets the value of the rotated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRotated(Boolean value) {
        this.rotated = value;
    }

    /**
     * Gets the value of the mediaRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMediaRef() {
        return mediaRef;
    }

    /**
     * Sets the value of the mediaRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMediaRef(Object value) {
        this.mediaRef = value;
    }

    /**
     * Gets the value of the deviceRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDeviceRef() {
        return deviceRef;
    }

    /**
     * Sets the value of the deviceRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDeviceRef(Object value) {
        this.deviceRef = value;
    }

    /**
     * Gets the value of the fileSpecRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFileSpecRef() {
        return fileSpecRef;
    }

    /**
     * Sets the value of the fileSpecRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFileSpecRef(Object value) {
        this.fileSpecRef = value;
    }

}
