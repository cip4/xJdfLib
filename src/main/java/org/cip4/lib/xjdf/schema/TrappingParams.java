
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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for TrappingParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrappingParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ColorantZoneDetails" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="HalftoneName" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="TrapWidthY" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="MinimumBlackWidth" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="BlackDensityLimit" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="StepLimit" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="ImageToObjectTrapping" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="ImageMaskTrapping" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="BlackColorLimit" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="ImageResolution" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="TrapJoinStyle" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="ImageInternalTrapping" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="ImageTrapWidthY" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="TrapEndStyle" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="TrapColorScaling" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="SlidingTrapLimit" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="ImageTrapPlacement" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TrapWidth" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="ImageToImageTrapping" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="ImageTrapWidth" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="BlackWidth" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrappingParams", propOrder = {
    "colorantZoneDetails"
})
public class TrappingParams
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "ColorantZoneDetails")
    protected List<ColorantZoneDetails> colorantZoneDetails;
    @XmlAttribute(name = "HalftoneName")
    protected String halftoneName;
    @XmlAttribute(name = "TrapWidthY")
    protected Double trapWidthY;
    @XmlAttribute(name = "MinimumBlackWidth")
    protected Double minimumBlackWidth;
    @XmlAttribute(name = "BlackDensityLimit")
    protected Double blackDensityLimit;
    @XmlAttribute(name = "StepLimit")
    protected Double stepLimit;
    @XmlAttribute(name = "ImageToObjectTrapping")
    protected Boolean imageToObjectTrapping;
    @XmlAttribute(name = "ImageMaskTrapping")
    protected Boolean imageMaskTrapping;
    @XmlAttribute(name = "BlackColorLimit")
    protected Double blackColorLimit;
    @XmlAttribute(name = "ImageResolution")
    protected Integer imageResolution;
    @XmlAttribute(name = "TrapJoinStyle")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String trapJoinStyle;
    @XmlAttribute(name = "ImageInternalTrapping")
    protected Boolean imageInternalTrapping;
    @XmlAttribute(name = "ImageTrapWidthY")
    protected Double imageTrapWidthY;
    @XmlAttribute(name = "TrapEndStyle")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String trapEndStyle;
    @XmlAttribute(name = "TrapColorScaling")
    protected Double trapColorScaling;
    @XmlAttribute(name = "SlidingTrapLimit")
    protected Double slidingTrapLimit;
    @XmlAttribute(name = "ImageTrapPlacement")
    @XmlSchemaType(name = "anySimpleType")
    protected String imageTrapPlacement;
    @XmlAttribute(name = "TrapWidth")
    protected Double trapWidth;
    @XmlAttribute(name = "ImageToImageTrapping")
    protected Boolean imageToImageTrapping;
    @XmlAttribute(name = "ImageTrapWidth")
    protected Double imageTrapWidth;
    @XmlAttribute(name = "BlackWidth")
    protected Double blackWidth;

    /**
     * Gets the value of the colorantZoneDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the colorantZoneDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColorantZoneDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ColorantZoneDetails }
     * 
     * 
     */
    public List<ColorantZoneDetails> getColorantZoneDetails() {
        if (colorantZoneDetails == null) {
            colorantZoneDetails = new ArrayList<ColorantZoneDetails>();
        }
        return this.colorantZoneDetails;
    }

    /**
     * Gets the value of the halftoneName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHalftoneName() {
        return halftoneName;
    }

    /**
     * Sets the value of the halftoneName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHalftoneName(String value) {
        this.halftoneName = value;
    }

    /**
     * Gets the value of the trapWidthY property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTrapWidthY() {
        return trapWidthY;
    }

    /**
     * Sets the value of the trapWidthY property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTrapWidthY(Double value) {
        this.trapWidthY = value;
    }

    /**
     * Gets the value of the minimumBlackWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinimumBlackWidth() {
        return minimumBlackWidth;
    }

    /**
     * Sets the value of the minimumBlackWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinimumBlackWidth(Double value) {
        this.minimumBlackWidth = value;
    }

    /**
     * Gets the value of the blackDensityLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBlackDensityLimit() {
        return blackDensityLimit;
    }

    /**
     * Sets the value of the blackDensityLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBlackDensityLimit(Double value) {
        this.blackDensityLimit = value;
    }

    /**
     * Gets the value of the stepLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStepLimit() {
        return stepLimit;
    }

    /**
     * Sets the value of the stepLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStepLimit(Double value) {
        this.stepLimit = value;
    }

    /**
     * Gets the value of the imageToObjectTrapping property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isImageToObjectTrapping() {
        return imageToObjectTrapping;
    }

    /**
     * Sets the value of the imageToObjectTrapping property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setImageToObjectTrapping(Boolean value) {
        this.imageToObjectTrapping = value;
    }

    /**
     * Gets the value of the imageMaskTrapping property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isImageMaskTrapping() {
        return imageMaskTrapping;
    }

    /**
     * Sets the value of the imageMaskTrapping property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setImageMaskTrapping(Boolean value) {
        this.imageMaskTrapping = value;
    }

    /**
     * Gets the value of the blackColorLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBlackColorLimit() {
        return blackColorLimit;
    }

    /**
     * Sets the value of the blackColorLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBlackColorLimit(Double value) {
        this.blackColorLimit = value;
    }

    /**
     * Gets the value of the imageResolution property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getImageResolution() {
        return imageResolution;
    }

    /**
     * Sets the value of the imageResolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setImageResolution(Integer value) {
        this.imageResolution = value;
    }

    /**
     * Gets the value of the trapJoinStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrapJoinStyle() {
        return trapJoinStyle;
    }

    /**
     * Sets the value of the trapJoinStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrapJoinStyle(String value) {
        this.trapJoinStyle = value;
    }

    /**
     * Gets the value of the imageInternalTrapping property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isImageInternalTrapping() {
        return imageInternalTrapping;
    }

    /**
     * Sets the value of the imageInternalTrapping property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setImageInternalTrapping(Boolean value) {
        this.imageInternalTrapping = value;
    }

    /**
     * Gets the value of the imageTrapWidthY property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getImageTrapWidthY() {
        return imageTrapWidthY;
    }

    /**
     * Sets the value of the imageTrapWidthY property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setImageTrapWidthY(Double value) {
        this.imageTrapWidthY = value;
    }

    /**
     * Gets the value of the trapEndStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrapEndStyle() {
        return trapEndStyle;
    }

    /**
     * Sets the value of the trapEndStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrapEndStyle(String value) {
        this.trapEndStyle = value;
    }

    /**
     * Gets the value of the trapColorScaling property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTrapColorScaling() {
        return trapColorScaling;
    }

    /**
     * Sets the value of the trapColorScaling property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTrapColorScaling(Double value) {
        this.trapColorScaling = value;
    }

    /**
     * Gets the value of the slidingTrapLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSlidingTrapLimit() {
        return slidingTrapLimit;
    }

    /**
     * Sets the value of the slidingTrapLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSlidingTrapLimit(Double value) {
        this.slidingTrapLimit = value;
    }

    /**
     * Gets the value of the imageTrapPlacement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageTrapPlacement() {
        return imageTrapPlacement;
    }

    /**
     * Sets the value of the imageTrapPlacement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageTrapPlacement(String value) {
        this.imageTrapPlacement = value;
    }

    /**
     * Gets the value of the trapWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTrapWidth() {
        return trapWidth;
    }

    /**
     * Sets the value of the trapWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTrapWidth(Double value) {
        this.trapWidth = value;
    }

    /**
     * Gets the value of the imageToImageTrapping property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isImageToImageTrapping() {
        return imageToImageTrapping;
    }

    /**
     * Sets the value of the imageToImageTrapping property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setImageToImageTrapping(Boolean value) {
        this.imageToImageTrapping = value;
    }

    /**
     * Gets the value of the imageTrapWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getImageTrapWidth() {
        return imageTrapWidth;
    }

    /**
     * Sets the value of the imageTrapWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setImageTrapWidth(Double value) {
        this.imageTrapWidth = value;
    }

    /**
     * Gets the value of the blackWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBlackWidth() {
        return blackWidth;
    }

    /**
     * Sets the value of the blackWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBlackWidth(Double value) {
        this.blackWidth = value;
    }

}
