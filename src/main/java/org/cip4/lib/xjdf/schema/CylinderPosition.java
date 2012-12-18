
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="PlatePosition" type="{http://www.CIP4.org/JDFSchema_2_0}XYPairRangeList" />
 *       &lt;attribute name="PlateUsage" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PlateType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="DeviceModuleIndex" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "CylinderPosition")
public class CylinderPosition
    implements Serializable
{

    @XmlAttribute(name = "PlatePosition")
    protected List<Double> platePosition;
    @XmlAttribute(name = "PlateUsage")
    @XmlSchemaType(name = "anySimpleType")
    protected String plateUsage;
    @XmlAttribute(name = "PlateType")
    @XmlSchemaType(name = "anySimpleType")
    protected String plateType;
    @XmlAttribute(name = "DeviceModuleIndex")
    protected Integer deviceModuleIndex;

    /**
     * Gets the value of the platePosition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the platePosition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlatePosition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getPlatePosition() {
        if (platePosition == null) {
            platePosition = new ArrayList<Double>();
        }
        return this.platePosition;
    }

    /**
     * Gets the value of the plateUsage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlateUsage() {
        return plateUsage;
    }

    /**
     * Sets the value of the plateUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlateUsage(String value) {
        this.plateUsage = value;
    }

    /**
     * Gets the value of the plateType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlateType() {
        return plateType;
    }

    /**
     * Sets the value of the plateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlateType(String value) {
        this.plateType = value;
    }

    /**
     * Gets the value of the deviceModuleIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDeviceModuleIndex() {
        return deviceModuleIndex;
    }

    /**
     * Sets the value of the deviceModuleIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDeviceModuleIndex(Integer value) {
        this.deviceModuleIndex = value;
    }

}
