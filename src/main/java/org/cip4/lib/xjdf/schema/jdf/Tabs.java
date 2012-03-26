
package org.cip4.lib.xjdf.schema.jdf;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="TabCount" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="TabsPerBank" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="TabBanks" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="TabExtensionDistance" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="TabBodyCopy" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="TabExtensionMylar" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="TabMylarColor" type="{http://www.CIP4.org/JDFSchema_2_0}EnumNamedColor" />
 *       &lt;attribute name="TabMylarColorDetails" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="TabBindMylar" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="TabBrand" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Tabs")
public class Tabs
    implements Serializable
{

    @XmlAttribute(name = "TabCount")
    protected Integer tabCount;
    @XmlAttribute(name = "TabsPerBank")
    protected Integer tabsPerBank;
    @XmlAttribute(name = "TabBanks")
    protected Integer tabBanks;
    @XmlAttribute(name = "TabExtensionDistance")
    protected Double tabExtensionDistance;
    @XmlAttribute(name = "TabBodyCopy")
    protected Boolean tabBodyCopy;
    @XmlAttribute(name = "TabExtensionMylar")
    protected Boolean tabExtensionMylar;
    @XmlAttribute(name = "TabMylarColor")
    protected EnumNamedColor tabMylarColor;
    @XmlAttribute(name = "TabMylarColorDetails")
    protected String tabMylarColorDetails;
    @XmlAttribute(name = "TabBindMylar")
    protected Boolean tabBindMylar;
    @XmlAttribute(name = "TabBrand")
    protected String tabBrand;

    /**
     * Gets the value of the tabCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTabCount() {
        return tabCount;
    }

    /**
     * Sets the value of the tabCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTabCount(Integer value) {
        this.tabCount = value;
    }

    /**
     * Gets the value of the tabsPerBank property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTabsPerBank() {
        return tabsPerBank;
    }

    /**
     * Sets the value of the tabsPerBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTabsPerBank(Integer value) {
        this.tabsPerBank = value;
    }

    /**
     * Gets the value of the tabBanks property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTabBanks() {
        return tabBanks;
    }

    /**
     * Sets the value of the tabBanks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTabBanks(Integer value) {
        this.tabBanks = value;
    }

    /**
     * Gets the value of the tabExtensionDistance property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTabExtensionDistance() {
        return tabExtensionDistance;
    }

    /**
     * Sets the value of the tabExtensionDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTabExtensionDistance(Double value) {
        this.tabExtensionDistance = value;
    }

    /**
     * Gets the value of the tabBodyCopy property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getTabBodyCopy() {
        return tabBodyCopy;
    }

    /**
     * Sets the value of the tabBodyCopy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTabBodyCopy(Boolean value) {
        this.tabBodyCopy = value;
    }

    /**
     * Gets the value of the tabExtensionMylar property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getTabExtensionMylar() {
        return tabExtensionMylar;
    }

    /**
     * Sets the value of the tabExtensionMylar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTabExtensionMylar(Boolean value) {
        this.tabExtensionMylar = value;
    }

    /**
     * Gets the value of the tabMylarColor property.
     * 
     * @return
     *     possible object is
     *     {@link EnumNamedColor }
     *     
     */
    public EnumNamedColor getTabMylarColor() {
        return tabMylarColor;
    }

    /**
     * Sets the value of the tabMylarColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumNamedColor }
     *     
     */
    public void setTabMylarColor(EnumNamedColor value) {
        this.tabMylarColor = value;
    }

    /**
     * Gets the value of the tabMylarColorDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTabMylarColorDetails() {
        return tabMylarColorDetails;
    }

    /**
     * Sets the value of the tabMylarColorDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTabMylarColorDetails(String value) {
        this.tabMylarColorDetails = value;
    }

    /**
     * Gets the value of the tabBindMylar property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getTabBindMylar() {
        return tabBindMylar;
    }

    /**
     * Sets the value of the tabBindMylar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTabBindMylar(Boolean value) {
        this.tabBindMylar = value;
    }

    /**
     * Gets the value of the tabBrand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTabBrand() {
        return tabBrand;
    }

    /**
     * Sets the value of the tabBrand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTabBrand(String value) {
        this.tabBrand = value;
    }

}
