
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for FormatConversionParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FormatConversionParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;attribute name="TIFFFormatParamsRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="ImageCompressionParamsRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
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
@XmlType(name = "FormatConversionParams")
public class FormatConversionParams
    extends ParameterType
    implements Serializable
{

    @XmlAttribute(name = "TIFFFormatParamsRef")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IDREF.class)
    protected org.cip4.lib.xjdf.type.IDREF tiffFormatParamsRef;
    @XmlAttribute(name = "ImageCompressionParamsRef")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IDREF.class)
    protected org.cip4.lib.xjdf.type.IDREF imageCompressionParamsRef;
    @XmlAttribute(name = "FileSpecRef")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IDREF.class)
    protected org.cip4.lib.xjdf.type.IDREF fileSpecRef;
    @XmlAttribute(name = "ColorRef")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IDREF.class)
    protected org.cip4.lib.xjdf.type.IDREF colorRef;

    /**
     * Gets the value of the tiffFormatParamsRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.IDREF getTIFFFormatParamsRef() {
        return tiffFormatParamsRef;
    }

    /**
     * Sets the value of the tiffFormatParamsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIFFFormatParamsRef(org.cip4.lib.xjdf.type.IDREF value) {
        this.tiffFormatParamsRef = value;
    }

    /**
     * Gets the value of the imageCompressionParamsRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.IDREF getImageCompressionParamsRef() {
        return imageCompressionParamsRef;
    }

    /**
     * Sets the value of the imageCompressionParamsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageCompressionParamsRef(org.cip4.lib.xjdf.type.IDREF value) {
        this.imageCompressionParamsRef = value;
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
