
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IDREF.class)
    protected org.cip4.lib.xjdf.type.IDREF pdfToPSConversionParamsRef;
    @XmlAttribute(name = "PSToPDFConversionParamsRef")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IDREF.class)
    protected org.cip4.lib.xjdf.type.IDREF psToPDFConversionParamsRef;

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
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.IDREF getPDFToPSConversionParamsRef() {
        return pdfToPSConversionParamsRef;
    }

    /**
     * Sets the value of the pdfToPSConversionParamsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDFToPSConversionParamsRef(org.cip4.lib.xjdf.type.IDREF value) {
        this.pdfToPSConversionParamsRef = value;
    }

    /**
     * Gets the value of the psToPDFConversionParamsRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.IDREF getPSToPDFConversionParamsRef() {
        return psToPDFConversionParamsRef;
    }

    /**
     * Sets the value of the psToPDFConversionParamsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSToPDFConversionParamsRef(org.cip4.lib.xjdf.type.IDREF value) {
        this.psToPDFConversionParamsRef = value;
    }

}
