
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for PreviewGenerationParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PreviewGenerationParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;attribute name="PreviewUsage" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Resolution" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="Size" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="AspectRatio" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PreviewFileType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Compensation" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ImageSetterParamsRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreviewGenerationParams")
public class PreviewGenerationParams
    extends ParameterType
    implements Serializable
{

    @XmlAttribute(name = "PreviewUsage")
    @XmlSchemaType(name = "anySimpleType")
    protected String previewUsage;
    @XmlAttribute(name = "Resolution")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.XYPair.class)
    protected org.cip4.lib.xjdf.type.XYPair resolution;
    @XmlAttribute(name = "Size")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.XYPair.class)
    protected org.cip4.lib.xjdf.type.XYPair size;
    @XmlAttribute(name = "AspectRatio")
    @XmlSchemaType(name = "anySimpleType")
    protected String aspectRatio;
    @XmlAttribute(name = "PreviewFileType")
    @XmlSchemaType(name = "anySimpleType")
    protected String previewFileType;
    @XmlAttribute(name = "Compensation")
    @XmlSchemaType(name = "anySimpleType")
    protected String compensation;
    @XmlAttribute(name = "ImageSetterParamsRef")
    @XmlIDREF
    protected Object imageSetterParamsRef;

    /**
     * Gets the value of the previewUsage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviewUsage() {
        return previewUsage;
    }

    /**
     * Sets the value of the previewUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviewUsage(String value) {
        this.previewUsage = value;
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
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.XYPair getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSize(org.cip4.lib.xjdf.type.XYPair value) {
        this.size = value;
    }

    /**
     * Gets the value of the aspectRatio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAspectRatio() {
        return aspectRatio;
    }

    /**
     * Sets the value of the aspectRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAspectRatio(String value) {
        this.aspectRatio = value;
    }

    /**
     * Gets the value of the previewFileType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviewFileType() {
        return previewFileType;
    }

    /**
     * Sets the value of the previewFileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviewFileType(String value) {
        this.previewFileType = value;
    }

    /**
     * Gets the value of the compensation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompensation() {
        return compensation;
    }

    /**
     * Sets the value of the compensation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompensation(String value) {
        this.compensation = value;
    }

    /**
     * Gets the value of the imageSetterParamsRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getImageSetterParamsRef() {
        return imageSetterParamsRef;
    }

    /**
     * Sets the value of the imageSetterParamsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setImageSetterParamsRef(Object value) {
        this.imageSetterParamsRef = value;
    }

}
