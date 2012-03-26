
package org.cip4.lib.xjdf.schema.jdf;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="PDFXNoTrimBoxError" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="PDFXOutputCondition" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="PDFXRegistryName" type="{http://www.CIP4.org/JDFSchema_2_0}URL" />
 *       &lt;attribute name="PDFXCompliantPDFOnly" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="PDFXTrimBoxToMediaBoxOffset" type="{http://www.CIP4.org/JDFSchema_2_0}rectangle" />
 *       &lt;attribute name="PDFX3Check" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="PDFXSetBleedBoxToMediaBox" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="PDFXTrapped" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PDFXOutputIntentProfile" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="PDFX1aCheck" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="PDFXBleedBoxToTrimBoxOffset" type="{http://www.CIP4.org/JDFSchema_2_0}rectangle" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "PDFXParams")
public class PDFXParams
    implements Serializable
{

    @XmlAttribute(name = "PDFXNoTrimBoxError")
    protected Boolean pdfxNoTrimBoxError;
    @XmlAttribute(name = "PDFXOutputCondition")
    protected String pdfxOutputCondition;
    @XmlAttribute(name = "PDFXRegistryName")
    protected String pdfxRegistryName;
    @XmlAttribute(name = "PDFXCompliantPDFOnly")
    protected Boolean pdfxCompliantPDFOnly;
    @XmlAttribute(name = "PDFXTrimBoxToMediaBoxOffset")
    protected Double pdfxTrimBoxToMediaBoxOffset;
    @XmlAttribute(name = "PDFX3Check")
    protected Boolean pdfx3Check;
    @XmlAttribute(name = "PDFXSetBleedBoxToMediaBox")
    protected Boolean pdfxSetBleedBoxToMediaBox;
    @XmlAttribute(name = "PDFXTrapped")
    @XmlSchemaType(name = "anySimpleType")
    protected String pdfxTrapped;
    @XmlAttribute(name = "PDFXOutputIntentProfile")
    protected String pdfxOutputIntentProfile;
    @XmlAttribute(name = "PDFX1aCheck")
    protected Boolean pdfx1ACheck;
    @XmlAttribute(name = "PDFXBleedBoxToTrimBoxOffset")
    protected Double pdfxBleedBoxToTrimBoxOffset;

    /**
     * Gets the value of the pdfxNoTrimBoxError property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getPDFXNoTrimBoxError() {
        return pdfxNoTrimBoxError;
    }

    /**
     * Sets the value of the pdfxNoTrimBoxError property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPDFXNoTrimBoxError(Boolean value) {
        this.pdfxNoTrimBoxError = value;
    }

    /**
     * Gets the value of the pdfxOutputCondition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDFXOutputCondition() {
        return pdfxOutputCondition;
    }

    /**
     * Sets the value of the pdfxOutputCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDFXOutputCondition(String value) {
        this.pdfxOutputCondition = value;
    }

    /**
     * Gets the value of the pdfxRegistryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDFXRegistryName() {
        return pdfxRegistryName;
    }

    /**
     * Sets the value of the pdfxRegistryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDFXRegistryName(String value) {
        this.pdfxRegistryName = value;
    }

    /**
     * Gets the value of the pdfxCompliantPDFOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getPDFXCompliantPDFOnly() {
        return pdfxCompliantPDFOnly;
    }

    /**
     * Sets the value of the pdfxCompliantPDFOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPDFXCompliantPDFOnly(Boolean value) {
        this.pdfxCompliantPDFOnly = value;
    }

    /**
     * Gets the value of the pdfxTrimBoxToMediaBoxOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPDFXTrimBoxToMediaBoxOffset() {
        return pdfxTrimBoxToMediaBoxOffset;
    }

    /**
     * Sets the value of the pdfxTrimBoxToMediaBoxOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPDFXTrimBoxToMediaBoxOffset(Double value) {
        this.pdfxTrimBoxToMediaBoxOffset = value;
    }

    /**
     * Gets the value of the pdfx3Check property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getPDFX3Check() {
        return pdfx3Check;
    }

    /**
     * Sets the value of the pdfx3Check property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPDFX3Check(Boolean value) {
        this.pdfx3Check = value;
    }

    /**
     * Gets the value of the pdfxSetBleedBoxToMediaBox property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getPDFXSetBleedBoxToMediaBox() {
        return pdfxSetBleedBoxToMediaBox;
    }

    /**
     * Sets the value of the pdfxSetBleedBoxToMediaBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPDFXSetBleedBoxToMediaBox(Boolean value) {
        this.pdfxSetBleedBoxToMediaBox = value;
    }

    /**
     * Gets the value of the pdfxTrapped property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDFXTrapped() {
        return pdfxTrapped;
    }

    /**
     * Sets the value of the pdfxTrapped property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDFXTrapped(String value) {
        this.pdfxTrapped = value;
    }

    /**
     * Gets the value of the pdfxOutputIntentProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDFXOutputIntentProfile() {
        return pdfxOutputIntentProfile;
    }

    /**
     * Sets the value of the pdfxOutputIntentProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDFXOutputIntentProfile(String value) {
        this.pdfxOutputIntentProfile = value;
    }

    /**
     * Gets the value of the pdfx1ACheck property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getPDFX1ACheck() {
        return pdfx1ACheck;
    }

    /**
     * Sets the value of the pdfx1ACheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPDFX1ACheck(Boolean value) {
        this.pdfx1ACheck = value;
    }

    /**
     * Gets the value of the pdfxBleedBoxToTrimBoxOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPDFXBleedBoxToTrimBoxOffset() {
        return pdfxBleedBoxToTrimBoxOffset;
    }

    /**
     * Sets the value of the pdfxBleedBoxToTrimBoxOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPDFXBleedBoxToTrimBoxOffset(Double value) {
        this.pdfxBleedBoxToTrimBoxOffset = value;
    }

}
