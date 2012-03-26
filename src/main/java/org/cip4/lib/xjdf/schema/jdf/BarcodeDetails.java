
package org.cip4.lib.xjdf.schema.jdf;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
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
 *       &lt;attribute name="BarcodeVersion" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="XCells" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="ErrorCorrectionLevel" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="YCells" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "BarcodeDetails")
public class BarcodeDetails
    implements Serializable
{

    @XmlAttribute(name = "BarcodeVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String barcodeVersion;
    @XmlAttribute(name = "XCells")
    protected Integer xCells;
    @XmlAttribute(name = "ErrorCorrectionLevel")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String errorCorrectionLevel;
    @XmlAttribute(name = "YCells")
    protected Integer yCells;

    /**
     * Gets the value of the barcodeVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarcodeVersion() {
        return barcodeVersion;
    }

    /**
     * Sets the value of the barcodeVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarcodeVersion(String value) {
        this.barcodeVersion = value;
    }

    /**
     * Gets the value of the xCells property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getXCells() {
        return xCells;
    }

    /**
     * Sets the value of the xCells property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setXCells(Integer value) {
        this.xCells = value;
    }

    /**
     * Gets the value of the errorCorrectionLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCorrectionLevel() {
        return errorCorrectionLevel;
    }

    /**
     * Sets the value of the errorCorrectionLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCorrectionLevel(String value) {
        this.errorCorrectionLevel = value;
    }

    /**
     * Gets the value of the yCells property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getYCells() {
        return yCells;
    }

    /**
     * Sets the value of the yCells property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setYCells(Integer value) {
        this.yCells = value;
    }

}
