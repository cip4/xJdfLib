
package org.cip4.lib.xjdf.schema;

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
 *       &lt;attribute name="PageListIndex" type="{http://www.CIP4.org/JDFSchema_2_0}IntegerRangeList" />
 *       &lt;attribute name="BroadsheetNumber" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="PagePlacementName" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="LogicalPrinterSection" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "PageAssignedList")
public class PageAssignedList
    implements Serializable
{

    @XmlAttribute(name = "PageListIndex")
    protected Integer pageListIndex;
    @XmlAttribute(name = "BroadsheetNumber")
    protected Integer broadsheetNumber;
    @XmlAttribute(name = "PagePlacementName")
    protected String pagePlacementName;
    @XmlAttribute(name = "LogicalPrinterSection")
    protected String logicalPrinterSection;

    /**
     * Gets the value of the pageListIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageListIndex() {
        return pageListIndex;
    }

    /**
     * Sets the value of the pageListIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageListIndex(Integer value) {
        this.pageListIndex = value;
    }

    /**
     * Gets the value of the broadsheetNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBroadsheetNumber() {
        return broadsheetNumber;
    }

    /**
     * Sets the value of the broadsheetNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBroadsheetNumber(Integer value) {
        this.broadsheetNumber = value;
    }

    /**
     * Gets the value of the pagePlacementName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPagePlacementName() {
        return pagePlacementName;
    }

    /**
     * Sets the value of the pagePlacementName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPagePlacementName(String value) {
        this.pagePlacementName = value;
    }

    /**
     * Gets the value of the logicalPrinterSection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogicalPrinterSection() {
        return logicalPrinterSection;
    }

    /**
     * Sets the value of the logicalPrinterSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogicalPrinterSection(String value) {
        this.logicalPrinterSection = value;
    }

}
