
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InkZoneProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InkZoneProfile">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;attribute name="ZoneWidth" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="ZoneHeight" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="ZoneSettingsX" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="ZoneSettingsY" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InkZoneProfile")
public class InkZoneProfile
    extends ParameterType
    implements Serializable
{

    @XmlAttribute(name = "ZoneWidth")
    protected Double zoneWidth;
    @XmlAttribute(name = "ZoneHeight")
    protected Double zoneHeight;
    @XmlAttribute(name = "ZoneSettingsX")
    protected String zoneSettingsX;
    @XmlAttribute(name = "ZoneSettingsY")
    protected String zoneSettingsY;

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
     * Gets the value of the zoneSettingsX property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZoneSettingsX() {
        return zoneSettingsX;
    }

    /**
     * Sets the value of the zoneSettingsX property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZoneSettingsX(String value) {
        this.zoneSettingsX = value;
    }

    /**
     * Gets the value of the zoneSettingsY property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZoneSettingsY() {
        return zoneSettingsY;
    }

    /**
     * Sets the value of the zoneSettingsY property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZoneSettingsY(String value) {
        this.zoneSettingsY = value;
    }

}
