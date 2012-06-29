
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;
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
 *       &lt;attribute name="ImageDownsampleType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ConvertImagesToIndexed" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="AntiAliasImages" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="ImageDownsampleThreshold" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="ImageFilter" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="ImageResolution" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="ImageAutoFilterStrategy" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="DownsampleImages" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="AutoFilterImages" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="JPXQuality" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="EncodeImages" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="DCTQuality" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="ImageDepth" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="ImageType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="JBIG2ParamsRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="DCTParamsRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="CCITTFaxParamsRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="LZWParamsRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="JPEG2000ParamsRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ImageCompression")
public class ImageCompression
    implements Serializable
{

    @XmlAttribute(name = "ImageDownsampleType")
    @XmlSchemaType(name = "anySimpleType")
    protected String imageDownsampleType;
    @XmlAttribute(name = "ConvertImagesToIndexed")
    protected Boolean convertImagesToIndexed;
    @XmlAttribute(name = "AntiAliasImages")
    protected Boolean antiAliasImages;
    @XmlAttribute(name = "ImageDownsampleThreshold")
    protected Double imageDownsampleThreshold;
    @XmlAttribute(name = "ImageFilter")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String imageFilter;
    @XmlAttribute(name = "ImageResolution")
    protected Double imageResolution;
    @XmlAttribute(name = "ImageAutoFilterStrategy")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String imageAutoFilterStrategy;
    @XmlAttribute(name = "DownsampleImages")
    protected Boolean downsampleImages;
    @XmlAttribute(name = "AutoFilterImages")
    protected Boolean autoFilterImages;
    @XmlAttribute(name = "JPXQuality")
    protected Integer jpxQuality;
    @XmlAttribute(name = "EncodeImages")
    protected Boolean encodeImages;
    @XmlAttribute(name = "DCTQuality")
    protected Double dctQuality;
    @XmlAttribute(name = "ImageDepth")
    protected Integer imageDepth;
    @XmlAttribute(name = "ImageType")
    @XmlSchemaType(name = "anySimpleType")
    protected String imageType;
    @XmlAttribute(name = "JBIG2ParamsRef")
    @XmlIDREF
    protected Object jbig2ParamsRef;
    @XmlAttribute(name = "DCTParamsRef")
    @XmlIDREF
    protected Object dctParamsRef;
    @XmlAttribute(name = "CCITTFaxParamsRef")
    @XmlIDREF
    protected Object ccittFaxParamsRef;
    @XmlAttribute(name = "LZWParamsRef")
    @XmlIDREF
    protected Object lzwParamsRef;
    @XmlAttribute(name = "JPEG2000ParamsRef")
    @XmlIDREF
    protected Object jpeg2000ParamsRef;

    /**
     * Gets the value of the imageDownsampleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageDownsampleType() {
        return imageDownsampleType;
    }

    /**
     * Sets the value of the imageDownsampleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageDownsampleType(String value) {
        this.imageDownsampleType = value;
    }

    /**
     * Gets the value of the convertImagesToIndexed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConvertImagesToIndexed() {
        return convertImagesToIndexed;
    }

    /**
     * Sets the value of the convertImagesToIndexed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConvertImagesToIndexed(Boolean value) {
        this.convertImagesToIndexed = value;
    }

    /**
     * Gets the value of the antiAliasImages property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAntiAliasImages() {
        return antiAliasImages;
    }

    /**
     * Sets the value of the antiAliasImages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAntiAliasImages(Boolean value) {
        this.antiAliasImages = value;
    }

    /**
     * Gets the value of the imageDownsampleThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getImageDownsampleThreshold() {
        return imageDownsampleThreshold;
    }

    /**
     * Sets the value of the imageDownsampleThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setImageDownsampleThreshold(Double value) {
        this.imageDownsampleThreshold = value;
    }

    /**
     * Gets the value of the imageFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageFilter() {
        return imageFilter;
    }

    /**
     * Sets the value of the imageFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageFilter(String value) {
        this.imageFilter = value;
    }

    /**
     * Gets the value of the imageResolution property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getImageResolution() {
        return imageResolution;
    }

    /**
     * Sets the value of the imageResolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setImageResolution(Double value) {
        this.imageResolution = value;
    }

    /**
     * Gets the value of the imageAutoFilterStrategy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageAutoFilterStrategy() {
        return imageAutoFilterStrategy;
    }

    /**
     * Sets the value of the imageAutoFilterStrategy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageAutoFilterStrategy(String value) {
        this.imageAutoFilterStrategy = value;
    }

    /**
     * Gets the value of the downsampleImages property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDownsampleImages() {
        return downsampleImages;
    }

    /**
     * Sets the value of the downsampleImages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDownsampleImages(Boolean value) {
        this.downsampleImages = value;
    }

    /**
     * Gets the value of the autoFilterImages property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoFilterImages() {
        return autoFilterImages;
    }

    /**
     * Sets the value of the autoFilterImages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoFilterImages(Boolean value) {
        this.autoFilterImages = value;
    }

    /**
     * Gets the value of the jpxQuality property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getJPXQuality() {
        return jpxQuality;
    }

    /**
     * Sets the value of the jpxQuality property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setJPXQuality(Integer value) {
        this.jpxQuality = value;
    }

    /**
     * Gets the value of the encodeImages property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEncodeImages() {
        return encodeImages;
    }

    /**
     * Sets the value of the encodeImages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEncodeImages(Boolean value) {
        this.encodeImages = value;
    }

    /**
     * Gets the value of the dctQuality property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDCTQuality() {
        return dctQuality;
    }

    /**
     * Sets the value of the dctQuality property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDCTQuality(Double value) {
        this.dctQuality = value;
    }

    /**
     * Gets the value of the imageDepth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getImageDepth() {
        return imageDepth;
    }

    /**
     * Sets the value of the imageDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setImageDepth(Integer value) {
        this.imageDepth = value;
    }

    /**
     * Gets the value of the imageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageType() {
        return imageType;
    }

    /**
     * Sets the value of the imageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageType(String value) {
        this.imageType = value;
    }

    /**
     * Gets the value of the jbig2ParamsRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getJBIG2ParamsRef() {
        return jbig2ParamsRef;
    }

    /**
     * Sets the value of the jbig2ParamsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setJBIG2ParamsRef(Object value) {
        this.jbig2ParamsRef = value;
    }

    /**
     * Gets the value of the dctParamsRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDCTParamsRef() {
        return dctParamsRef;
    }

    /**
     * Sets the value of the dctParamsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDCTParamsRef(Object value) {
        this.dctParamsRef = value;
    }

    /**
     * Gets the value of the ccittFaxParamsRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCCITTFaxParamsRef() {
        return ccittFaxParamsRef;
    }

    /**
     * Sets the value of the ccittFaxParamsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCCITTFaxParamsRef(Object value) {
        this.ccittFaxParamsRef = value;
    }

    /**
     * Gets the value of the lzwParamsRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLZWParamsRef() {
        return lzwParamsRef;
    }

    /**
     * Sets the value of the lzwParamsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLZWParamsRef(Object value) {
        this.lzwParamsRef = value;
    }

    /**
     * Gets the value of the jpeg2000ParamsRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getJPEG2000ParamsRef() {
        return jpeg2000ParamsRef;
    }

    /**
     * Sets the value of the jpeg2000ParamsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setJPEG2000ParamsRef(Object value) {
        this.jpeg2000ParamsRef = value;
    }

}
