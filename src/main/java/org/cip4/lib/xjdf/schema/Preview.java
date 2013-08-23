
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for Preview complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Preview">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;attribute name="Directory" type="{http://www.CIP4.org/JDFSchema_2_0}URL" />
 *       &lt;attribute name="CTM" type="{http://www.CIP4.org/JDFSchema_2_0}matrix" />
 *       &lt;attribute name="MimeTypeDetails" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="URL" type="{http://www.CIP4.org/JDFSchema_2_0}URL" />
 *       &lt;attribute name="PreviewFileType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Compensation" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Preview")
public class Preview
    extends ParameterType
    implements Serializable
{

    @XmlAttribute(name = "Directory")
    protected String directory;
    @XmlAttribute(name = "CTM")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.Matrix.class)
    protected org.cip4.lib.xjdf.type.Matrix ctm;
    @XmlAttribute(name = "MimeTypeDetails")
    protected String mimeTypeDetails;
    @XmlAttribute(name = "URL")
    protected String url;
    @XmlAttribute(name = "PreviewFileType")
    @XmlSchemaType(name = "anySimpleType")
    protected String previewFileType;
    @XmlAttribute(name = "Compensation")
    @XmlSchemaType(name = "anySimpleType")
    protected String compensation;

    /**
     * Gets the value of the directory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectory() {
        return directory;
    }

    /**
     * Sets the value of the directory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectory(String value) {
        this.directory = value;
    }

    /**
     * Gets the value of the ctm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.Matrix getCTM() {
        return ctm;
    }

    /**
     * Sets the value of the ctm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTM(org.cip4.lib.xjdf.type.Matrix value) {
        this.ctm = value;
    }

    /**
     * Gets the value of the mimeTypeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMimeTypeDetails() {
        return mimeTypeDetails;
    }

    /**
     * Sets the value of the mimeTypeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMimeTypeDetails(String value) {
        this.mimeTypeDetails = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
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

}
