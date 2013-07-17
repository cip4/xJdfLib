
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="TabOffset" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="TabsPerBank" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="TabExtensionDistance" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="TabSetCollationOrder" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="TabEdge" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TabWidth" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "TabDimensions")
public class TabDimensions
    implements Serializable
{

    @XmlAttribute(name = "TabOffset")
    protected Double tabOffset;
    @XmlAttribute(name = "TabsPerBank")
    protected Integer tabsPerBank;
    @XmlAttribute(name = "TabExtensionDistance")
    protected Double tabExtensionDistance;
    @XmlAttribute(name = "TabSetCollationOrder")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String tabSetCollationOrder;
    @XmlAttribute(name = "TabEdge")
    @XmlSchemaType(name = "anySimpleType")
    protected String tabEdge;
    @XmlAttribute(name = "TabWidth")
    protected Double tabWidth;

    /**
     * Gets the value of the tabOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTabOffset() {
        return tabOffset;
    }

    /**
     * Sets the value of the tabOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTabOffset(Double value) {
        this.tabOffset = value;
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
     * Gets the value of the tabSetCollationOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTabSetCollationOrder() {
        return tabSetCollationOrder;
    }

    /**
     * Sets the value of the tabSetCollationOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTabSetCollationOrder(String value) {
        this.tabSetCollationOrder = value;
    }

    /**
     * Gets the value of the tabEdge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTabEdge() {
        return tabEdge;
    }

    /**
     * Sets the value of the tabEdge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTabEdge(String value) {
        this.tabEdge = value;
    }

    /**
     * Gets the value of the tabWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTabWidth() {
        return tabWidth;
    }

    /**
     * Sets the value of the tabWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTabWidth(Double value) {
        this.tabWidth = value;
    }

}
