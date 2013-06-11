
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ByteMap complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ByteMap">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}PixelColorant" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Band" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="BandOrdering" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ElementType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Halftoned" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="Resolution" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="FrameWidth" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="Interleaved" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="FrameHeight" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="PixelSkip" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="FileSpecRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="ColorRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ByteMap", propOrder = {
    "pixelColorant",
    "band"
})
public class ByteMap
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "PixelColorant")
    protected List<PixelColorant> pixelColorant;
    @XmlElement(name = "Band")
    protected List<Band> band;
    @XmlAttribute(name = "BandOrdering")
    @XmlSchemaType(name = "anySimpleType")
    protected String bandOrdering;
    @XmlAttribute(name = "ElementType")
    @XmlSchemaType(name = "anySimpleType")
    protected String elementType;
    @XmlAttribute(name = "Halftoned")
    protected Boolean halftoned;
    @XmlAttribute(name = "Resolution")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.XYPair.class)
    protected org.cip4.lib.xjdf.type.XYPair resolution;
    @XmlAttribute(name = "FrameWidth")
    protected Integer frameWidth;
    @XmlAttribute(name = "Interleaved")
    protected Boolean interleaved;
    @XmlAttribute(name = "FrameHeight")
    protected Integer frameHeight;
    @XmlAttribute(name = "PixelSkip")
    protected Integer pixelSkip;
    @XmlAttribute(name = "FileSpecRef")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IDREF.class)
    protected org.cip4.lib.xjdf.type.IDREF fileSpecRef;
    @XmlAttribute(name = "ColorRef")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IDREF.class)
    protected org.cip4.lib.xjdf.type.IDREF colorRef;

    /**
     * Gets the value of the pixelColorant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pixelColorant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPixelColorant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PixelColorant }
     * 
     * 
     */
    public List<PixelColorant> getPixelColorant() {
        if (pixelColorant == null) {
            pixelColorant = new ArrayList<PixelColorant>();
        }
        return this.pixelColorant;
    }

    /**
     * Gets the value of the band property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the band property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBand().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Band }
     * 
     * 
     */
    public List<Band> getBand() {
        if (band == null) {
            band = new ArrayList<Band>();
        }
        return this.band;
    }

    /**
     * Gets the value of the bandOrdering property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBandOrdering() {
        return bandOrdering;
    }

    /**
     * Sets the value of the bandOrdering property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBandOrdering(String value) {
        this.bandOrdering = value;
    }

    /**
     * Gets the value of the elementType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElementType() {
        return elementType;
    }

    /**
     * Sets the value of the elementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElementType(String value) {
        this.elementType = value;
    }

    /**
     * Gets the value of the halftoned property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHalftoned() {
        return halftoned;
    }

    /**
     * Sets the value of the halftoned property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHalftoned(Boolean value) {
        this.halftoned = value;
    }

    /**
     * Gets the value of the resolution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.XYPair getResolution() {
        return resolution;
    }

    /**
     * Sets the value of the resolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResolution(org.cip4.lib.xjdf.type.XYPair value) {
        this.resolution = value;
    }

    /**
     * Gets the value of the frameWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFrameWidth() {
        return frameWidth;
    }

    /**
     * Sets the value of the frameWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFrameWidth(Integer value) {
        this.frameWidth = value;
    }

    /**
     * Gets the value of the interleaved property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInterleaved() {
        return interleaved;
    }

    /**
     * Sets the value of the interleaved property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInterleaved(Boolean value) {
        this.interleaved = value;
    }

    /**
     * Gets the value of the frameHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFrameHeight() {
        return frameHeight;
    }

    /**
     * Sets the value of the frameHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFrameHeight(Integer value) {
        this.frameHeight = value;
    }

    /**
     * Gets the value of the pixelSkip property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPixelSkip() {
        return pixelSkip;
    }

    /**
     * Sets the value of the pixelSkip property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPixelSkip(Integer value) {
        this.pixelSkip = value;
    }

    /**
     * Gets the value of the fileSpecRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.IDREF getFileSpecRef() {
        return fileSpecRef;
    }

    /**
     * Sets the value of the fileSpecRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileSpecRef(org.cip4.lib.xjdf.type.IDREF value) {
        this.fileSpecRef = value;
    }

    /**
     * Gets the value of the colorRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.IDREF getColorRef() {
        return colorRef;
    }

    /**
     * Sets the value of the colorRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorRef(org.cip4.lib.xjdf.type.IDREF value) {
        this.colorRef = value;
    }

}
