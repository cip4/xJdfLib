
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
 *       &lt;attribute name="PixelDepth" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="ColorantName" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "PixelColorant")
public class PixelColorant
    implements Serializable
{

    @XmlAttribute(name = "PixelDepth")
    protected Integer pixelDepth;
    @XmlAttribute(name = "ColorantName")
    protected String colorantName;

    /**
     * Gets the value of the pixelDepth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPixelDepth() {
        return pixelDepth;
    }

    /**
     * Sets the value of the pixelDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPixelDepth(Integer value) {
        this.pixelDepth = value;
    }

    /**
     * Gets the value of the colorantName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorantName() {
        return colorantName;
    }

    /**
     * Sets the value of the colorantName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorantName(String value) {
        this.colorantName = value;
    }

}
