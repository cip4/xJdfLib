
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for InkZoneCalculationParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InkZoneCalculationParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;attribute name="ZoneWidth" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="ZonesY" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="FountainPositions" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="Zones" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="ZoneHeight" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="PrintableArea" type="{http://www.CIP4.org/JDFSchema_2_0}rectangle" />
 *       &lt;attribute name="DeviceRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InkZoneCalculationParams")
public class InkZoneCalculationParams
    extends ParameterType
    implements Serializable
{

    @XmlAttribute(name = "ZoneWidth")
    protected Double zoneWidth;
    @XmlAttribute(name = "ZonesY")
    protected Integer zonesY;
    @XmlAttribute(name = "FountainPositions")
    protected String fountainPositions;
    @XmlAttribute(name = "Zones")
    protected Integer zones;
    @XmlAttribute(name = "ZoneHeight")
    protected Double zoneHeight;
    @XmlAttribute(name = "PrintableArea")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.Rectangle.class)
    protected org.cip4.lib.xjdf.type.Rectangle printableArea;
    @XmlAttribute(name = "DeviceRef")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IDREF.class)
    protected org.cip4.lib.xjdf.type.IDREF deviceRef;

    /**
     * Gets the value of the zoneWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getZoneWidth() {
        return zoneWidth;
    }

    /**
     * Sets the value of the zoneWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setZoneWidth(Double value) {
        this.zoneWidth = value;
    }

    /**
     * Gets the value of the zonesY property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getZonesY() {
        return zonesY;
    }

    /**
     * Sets the value of the zonesY property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setZonesY(Integer value) {
        this.zonesY = value;
    }

    /**
     * Gets the value of the fountainPositions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFountainPositions() {
        return fountainPositions;
    }

    /**
     * Sets the value of the fountainPositions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFountainPositions(String value) {
        this.fountainPositions = value;
    }

    /**
     * Gets the value of the zones property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getZones() {
        return zones;
    }

    /**
     * Sets the value of the zones property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setZones(Integer value) {
        this.zones = value;
    }

    /**
     * Gets the value of the zoneHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getZoneHeight() {
        return zoneHeight;
    }

    /**
     * Sets the value of the zoneHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setZoneHeight(Double value) {
        this.zoneHeight = value;
    }

    /**
     * Gets the value of the printableArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.Rectangle getPrintableArea() {
        return printableArea;
    }

    /**
     * Sets the value of the printableArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintableArea(org.cip4.lib.xjdf.type.Rectangle value) {
        this.printableArea = value;
    }

    /**
     * Gets the value of the deviceRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.IDREF getDeviceRef() {
        return deviceRef;
    }

    /**
     * Sets the value of the deviceRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceRef(org.cip4.lib.xjdf.type.IDREF value) {
        this.deviceRef = value;
    }

}
