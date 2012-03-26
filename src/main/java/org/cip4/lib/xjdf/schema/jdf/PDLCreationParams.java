
package org.cip4.lib.xjdf.schema.jdf;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PDLCreationParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PDLCreationParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;attribute name="MimeType" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="PDFToPSConversionParamsRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="PSToPDFConversionParamsRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PDLCreationParams")
public class PDLCreationParams
    extends ParameterType
    implements Serializable
{

    @XmlAttribute(name = "MimeType")
    protected String mimeType;
    @XmlAttribute(name = "PDFToPSConversionParamsRef")
    @XmlIDREF
    protected Object pdfToPSConversionParamsRef;
    @XmlAttribute(name = "PSToPDFConversionParamsRef")
    @XmlIDREF
    protected Object psToPDFConversionParamsRef;

    /**
     * Gets the value of the mimeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMimeType() {
        return mimeType;
    }

    /**
     * Sets the value of the mimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMimeType(String value) {
        this.mimeType = value;
    }

    /**
     * Gets the value of the pdfToPSConversionParamsRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPDFToPSConversionParamsRef() {
        return pdfToPSConversionParamsRef;
    }

    /**
     * Sets the value of the pdfToPSConversionParamsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPDFToPSConversionParamsRef(Object value) {
        this.pdfToPSConversionParamsRef = value;
    }

    /**
     * Gets the value of the psToPDFConversionParamsRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPSToPDFConversionParamsRef() {
        return psToPDFConversionParamsRef;
    }

    /**
     * Sets the value of the psToPDFConversionParamsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPSToPDFConversionParamsRef(Object value) {
        this.psToPDFConversionParamsRef = value;
    }

}
