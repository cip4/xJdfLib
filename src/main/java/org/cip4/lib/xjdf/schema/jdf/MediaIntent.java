
package org.cip4.lib.xjdf.schema.jdf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for MediaIntent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MediaIntent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}IntentType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}MediaLayers" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="MediaSetCount" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="UserMediaType" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="PrePrinted" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="MediaType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="HoleType" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="MediaQuality" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="Thickness" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="FluteDirection" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Texture" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="OpacityLevel" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="MediaColorDetails" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="Weight" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="Grade" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="RecycledPercentage" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="MediaTypeDetails" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="MediaColor" type="{http://www.CIP4.org/JDFSchema_2_0}EnumNamedColor" />
 *       &lt;attribute name="Brightness" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="Brand" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="FrontCoatings" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Opacity" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="StockType" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="BuyerSupplied" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="Flute" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="GrainDirection" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="BackCoatings" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MediaIntent", propOrder = {
    "mediaLayers"
})
public class MediaIntent
    extends IntentType
    implements Serializable
{

    @XmlElement(name = "MediaLayers")
    protected List<MediaLayers> mediaLayers;
    @XmlAttribute(name = "MediaSetCount")
    protected Integer mediaSetCount;
    @XmlAttribute(name = "UserMediaType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String userMediaType;
    @XmlAttribute(name = "PrePrinted")
    protected Boolean prePrinted;
    @XmlAttribute(name = "MediaType")
    @XmlSchemaType(name = "anySimpleType")
    protected String mediaType;
    @XmlAttribute(name = "HoleType")
    protected String holeType;
    @XmlAttribute(name = "MediaQuality")
    protected String mediaQuality;
    @XmlAttribute(name = "Thickness")
    protected Double thickness;
    @XmlAttribute(name = "FluteDirection")
    @XmlSchemaType(name = "anySimpleType")
    protected String fluteDirection;
    @XmlAttribute(name = "Texture")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String texture;
    @XmlAttribute(name = "OpacityLevel")
    protected Double opacityLevel;
    @XmlAttribute(name = "MediaColorDetails")
    protected String mediaColorDetails;
    @XmlAttribute(name = "Weight")
    protected Double weight;
    @XmlAttribute(name = "Grade")
    protected Integer grade;
    @XmlAttribute(name = "RecycledPercentage")
    protected Double recycledPercentage;
    @XmlAttribute(name = "MediaTypeDetails")
    protected String mediaTypeDetails;
    @XmlAttribute(name = "MediaColor")
    protected EnumNamedColor mediaColor;
    @XmlAttribute(name = "Brightness")
    protected Double brightness;
    @XmlAttribute(name = "Brand")
    protected String brand;
    @XmlAttribute(name = "FrontCoatings")
    @XmlSchemaType(name = "anySimpleType")
    protected String frontCoatings;
    @XmlAttribute(name = "Opacity")
    @XmlSchemaType(name = "anySimpleType")
    protected String opacity;
    @XmlAttribute(name = "StockType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String stockType;
    @XmlAttribute(name = "BuyerSupplied")
    protected Boolean buyerSupplied;
    @XmlAttribute(name = "Flute")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String flute;
    @XmlAttribute(name = "GrainDirection")
    @XmlSchemaType(name = "anySimpleType")
    protected String grainDirection;
    @XmlAttribute(name = "BackCoatings")
    @XmlSchemaType(name = "anySimpleType")
    protected String backCoatings;

    /**
     * Gets the value of the mediaLayers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mediaLayers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMediaLayers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MediaLayers }
     * 
     * 
     */
    public List<MediaLayers> getMediaLayers() {
        if (mediaLayers == null) {
            mediaLayers = new ArrayList<MediaLayers>();
        }
        return this.mediaLayers;
    }

    /**
     * Gets the value of the mediaSetCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMediaSetCount() {
        return mediaSetCount;
    }

    /**
     * Sets the value of the mediaSetCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMediaSetCount(Integer value) {
        this.mediaSetCount = value;
    }

    /**
     * Gets the value of the userMediaType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserMediaType() {
        return userMediaType;
    }

    /**
     * Sets the value of the userMediaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserMediaType(String value) {
        this.userMediaType = value;
    }

    /**
     * Gets the value of the prePrinted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrePrinted() {
        return prePrinted;
    }

    /**
     * Sets the value of the prePrinted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrePrinted(Boolean value) {
        this.prePrinted = value;
    }

    /**
     * Gets the value of the mediaType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaType() {
        return mediaType;
    }

    /**
     * Sets the value of the mediaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaType(String value) {
        this.mediaType = value;
    }

    /**
     * Gets the value of the holeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoleType() {
        return holeType;
    }

    /**
     * Sets the value of the holeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoleType(String value) {
        this.holeType = value;
    }

    /**
     * Gets the value of the mediaQuality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaQuality() {
        return mediaQuality;
    }

    /**
     * Sets the value of the mediaQuality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaQuality(String value) {
        this.mediaQuality = value;
    }

    /**
     * Gets the value of the thickness property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getThickness() {
        return thickness;
    }

    /**
     * Sets the value of the thickness property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setThickness(Double value) {
        this.thickness = value;
    }

    /**
     * Gets the value of the fluteDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFluteDirection() {
        return fluteDirection;
    }

    /**
     * Sets the value of the fluteDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFluteDirection(String value) {
        this.fluteDirection = value;
    }

    /**
     * Gets the value of the texture property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTexture() {
        return texture;
    }

    /**
     * Sets the value of the texture property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTexture(String value) {
        this.texture = value;
    }

    /**
     * Gets the value of the opacityLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOpacityLevel() {
        return opacityLevel;
    }

    /**
     * Sets the value of the opacityLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOpacityLevel(Double value) {
        this.opacityLevel = value;
    }

    /**
     * Gets the value of the mediaColorDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaColorDetails() {
        return mediaColorDetails;
    }

    /**
     * Sets the value of the mediaColorDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaColorDetails(String value) {
        this.mediaColorDetails = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWeight(Double value) {
        this.weight = value;
    }

    /**
     * Gets the value of the grade property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGrade() {
        return grade;
    }

    /**
     * Sets the value of the grade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGrade(Integer value) {
        this.grade = value;
    }

    /**
     * Gets the value of the recycledPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRecycledPercentage() {
        return recycledPercentage;
    }

    /**
     * Sets the value of the recycledPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRecycledPercentage(Double value) {
        this.recycledPercentage = value;
    }

    /**
     * Gets the value of the mediaTypeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaTypeDetails() {
        return mediaTypeDetails;
    }

    /**
     * Sets the value of the mediaTypeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaTypeDetails(String value) {
        this.mediaTypeDetails = value;
    }

    /**
     * Gets the value of the mediaColor property.
     * 
     * @return
     *     possible object is
     *     {@link EnumNamedColor }
     *     
     */
    public EnumNamedColor getMediaColor() {
        return mediaColor;
    }

    /**
     * Sets the value of the mediaColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumNamedColor }
     *     
     */
    public void setMediaColor(EnumNamedColor value) {
        this.mediaColor = value;
    }

    /**
     * Gets the value of the brightness property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBrightness() {
        return brightness;
    }

    /**
     * Sets the value of the brightness property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBrightness(Double value) {
        this.brightness = value;
    }

    /**
     * Gets the value of the brand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Sets the value of the brand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrand(String value) {
        this.brand = value;
    }

    /**
     * Gets the value of the frontCoatings property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrontCoatings() {
        return frontCoatings;
    }

    /**
     * Sets the value of the frontCoatings property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrontCoatings(String value) {
        this.frontCoatings = value;
    }

    /**
     * Gets the value of the opacity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpacity() {
        return opacity;
    }

    /**
     * Sets the value of the opacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpacity(String value) {
        this.opacity = value;
    }

    /**
     * Gets the value of the stockType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStockType() {
        return stockType;
    }

    /**
     * Sets the value of the stockType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStockType(String value) {
        this.stockType = value;
    }

    /**
     * Gets the value of the buyerSupplied property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBuyerSupplied() {
        return buyerSupplied;
    }

    /**
     * Sets the value of the buyerSupplied property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBuyerSupplied(Boolean value) {
        this.buyerSupplied = value;
    }

    /**
     * Gets the value of the flute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlute() {
        return flute;
    }

    /**
     * Sets the value of the flute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlute(String value) {
        this.flute = value;
    }

    /**
     * Gets the value of the grainDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrainDirection() {
        return grainDirection;
    }

    /**
     * Sets the value of the grainDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrainDirection(String value) {
        this.grainDirection = value;
    }

    /**
     * Gets the value of the backCoatings property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackCoatings() {
        return backCoatings;
    }

    /**
     * Sets the value of the backCoatings property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackCoatings(String value) {
        this.backCoatings = value;
    }

}
