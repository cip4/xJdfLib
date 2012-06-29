
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 *       &lt;attribute name="PreviewUsage" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
    @XmlAttribute(name = "PreviewUsage")
    @XmlSchemaType(name = "anySimpleType")
    protected String previewUsage;
    @XmlAttribute(name = "CTM")
    protected List<Double> ctms;
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
     * Gets the value of the ctms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ctms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCTMS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getCTMS() {
        if (ctms == null) {
            ctms = new ArrayList<Double>();
        }
        return this.ctms;
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
