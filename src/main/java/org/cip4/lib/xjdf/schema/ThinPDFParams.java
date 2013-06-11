
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
 *       &lt;attribute name="SidelineImages" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="FilePerPage" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="SidelineFonts" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="SidelineEPS" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ThinPDFParams")
public class ThinPDFParams
    implements Serializable
{

    @XmlAttribute(name = "SidelineImages")
    protected Boolean sidelineImages;
    @XmlAttribute(name = "FilePerPage")
    protected Boolean filePerPage;
    @XmlAttribute(name = "SidelineFonts")
    protected Boolean sidelineFonts;
    @XmlAttribute(name = "SidelineEPS")
    protected Boolean sidelineEPS;

    /**
     * Gets the value of the sidelineImages property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSidelineImages() {
        return sidelineImages;
    }

    /**
     * Sets the value of the sidelineImages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSidelineImages(Boolean value) {
        this.sidelineImages = value;
    }

    /**
     * Gets the value of the filePerPage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFilePerPage() {
        return filePerPage;
    }

    /**
     * Sets the value of the filePerPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFilePerPage(Boolean value) {
        this.filePerPage = value;
    }

    /**
     * Gets the value of the sidelineFonts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSidelineFonts() {
        return sidelineFonts;
    }

    /**
     * Sets the value of the sidelineFonts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSidelineFonts(Boolean value) {
        this.sidelineFonts = value;
    }

    /**
     * Gets the value of the sidelineEPS property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSidelineEPS() {
        return sidelineEPS;
    }

    /**
     * Sets the value of the sidelineEPS property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSidelineEPS(Boolean value) {
        this.sidelineEPS = value;
    }

}
