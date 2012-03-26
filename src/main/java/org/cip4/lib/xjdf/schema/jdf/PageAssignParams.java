
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
 *       &lt;attribute name="PreserveOPIComments" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="PreserveCopyPage" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="UsePrologue" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="AllowTransparency" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="EmitDSCWarnings" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="PreserveOverprintSettings" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="UCRandBGInfo" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ParseDSCComments" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="PassThroughJPEGImages" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="LockDistillerParams" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="AllowPSXObjects" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="EmbedJobOptions" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="PreserveHalftoneInfo" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="PreserveEPSInfo" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="TransferFunctionInfo" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="AutoPositionEPSInfo" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="ParseDSCCommentsForDocInfo" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "PageAssignParams")
public class PageAssignParams
    implements Serializable
{

    @XmlAttribute(name = "PreserveOPIComments")
    protected Boolean preserveOPIComments;
    @XmlAttribute(name = "PreserveCopyPage")
    protected Boolean preserveCopyPage;
    @XmlAttribute(name = "UsePrologue")
    protected Boolean usePrologue;
    @XmlAttribute(name = "AllowTransparency")
    protected Boolean allowTransparency;
    @XmlAttribute(name = "EmitDSCWarnings")
    protected Boolean emitDSCWarnings;
    @XmlAttribute(name = "PreserveOverprintSettings")
    protected Boolean preserveOverprintSettings;
    @XmlAttribute(name = "UCRandBGInfo")
    @XmlSchemaType(name = "anySimpleType")
    protected String ucRandBGInfo;
    @XmlAttribute(name = "ParseDSCComments")
    protected Boolean parseDSCComments;
    @XmlAttribute(name = "PassThroughJPEGImages")
    protected Boolean passThroughJPEGImages;
    @XmlAttribute(name = "LockDistillerParams")
    protected Boolean lockDistillerParams;
    @XmlAttribute(name = "AllowPSXObjects")
    protected Boolean allowPSXObjects;
    @XmlAttribute(name = "EmbedJobOptions")
    protected Boolean embedJobOptions;
    @XmlAttribute(name = "PreserveHalftoneInfo")
    protected Boolean preserveHalftoneInfo;
    @XmlAttribute(name = "PreserveEPSInfo")
    protected Boolean preserveEPSInfo;
    @XmlAttribute(name = "TransferFunctionInfo")
    @XmlSchemaType(name = "anySimpleType")
    protected String transferFunctionInfo;
    @XmlAttribute(name = "AutoPositionEPSInfo")
    protected Boolean autoPositionEPSInfo;
    @XmlAttribute(name = "ParseDSCCommentsForDocInfo")
    protected Boolean parseDSCCommentsForDocInfo;

    /**
     * Gets the value of the preserveOPIComments property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getPreserveOPIComments() {
        return preserveOPIComments;
    }

    /**
     * Sets the value of the preserveOPIComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreserveOPIComments(Boolean value) {
        this.preserveOPIComments = value;
    }

    /**
     * Gets the value of the preserveCopyPage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getPreserveCopyPage() {
        return preserveCopyPage;
    }

    /**
     * Sets the value of the preserveCopyPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreserveCopyPage(Boolean value) {
        this.preserveCopyPage = value;
    }

    /**
     * Gets the value of the usePrologue property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUsePrologue() {
        return usePrologue;
    }

    /**
     * Sets the value of the usePrologue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsePrologue(Boolean value) {
        this.usePrologue = value;
    }

    /**
     * Gets the value of the allowTransparency property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAllowTransparency() {
        return allowTransparency;
    }

    /**
     * Sets the value of the allowTransparency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowTransparency(Boolean value) {
        this.allowTransparency = value;
    }

    /**
     * Gets the value of the emitDSCWarnings property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getEmitDSCWarnings() {
        return emitDSCWarnings;
    }

    /**
     * Sets the value of the emitDSCWarnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmitDSCWarnings(Boolean value) {
        this.emitDSCWarnings = value;
    }

    /**
     * Gets the value of the preserveOverprintSettings property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getPreserveOverprintSettings() {
        return preserveOverprintSettings;
    }

    /**
     * Sets the value of the preserveOverprintSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreserveOverprintSettings(Boolean value) {
        this.preserveOverprintSettings = value;
    }

    /**
     * Gets the value of the ucRandBGInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUCRandBGInfo() {
        return ucRandBGInfo;
    }

    /**
     * Sets the value of the ucRandBGInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUCRandBGInfo(String value) {
        this.ucRandBGInfo = value;
    }

    /**
     * Gets the value of the parseDSCComments property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getParseDSCComments() {
        return parseDSCComments;
    }

    /**
     * Sets the value of the parseDSCComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setParseDSCComments(Boolean value) {
        this.parseDSCComments = value;
    }

    /**
     * Gets the value of the passThroughJPEGImages property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getPassThroughJPEGImages() {
        return passThroughJPEGImages;
    }

    /**
     * Sets the value of the passThroughJPEGImages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPassThroughJPEGImages(Boolean value) {
        this.passThroughJPEGImages = value;
    }

    /**
     * Gets the value of the lockDistillerParams property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getLockDistillerParams() {
        return lockDistillerParams;
    }

    /**
     * Sets the value of the lockDistillerParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLockDistillerParams(Boolean value) {
        this.lockDistillerParams = value;
    }

    /**
     * Gets the value of the allowPSXObjects property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAllowPSXObjects() {
        return allowPSXObjects;
    }

    /**
     * Sets the value of the allowPSXObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowPSXObjects(Boolean value) {
        this.allowPSXObjects = value;
    }

    /**
     * Gets the value of the embedJobOptions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getEmbedJobOptions() {
        return embedJobOptions;
    }

    /**
     * Sets the value of the embedJobOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmbedJobOptions(Boolean value) {
        this.embedJobOptions = value;
    }

    /**
     * Gets the value of the preserveHalftoneInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getPreserveHalftoneInfo() {
        return preserveHalftoneInfo;
    }

    /**
     * Sets the value of the preserveHalftoneInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreserveHalftoneInfo(Boolean value) {
        this.preserveHalftoneInfo = value;
    }

    /**
     * Gets the value of the preserveEPSInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getPreserveEPSInfo() {
        return preserveEPSInfo;
    }

    /**
     * Sets the value of the preserveEPSInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreserveEPSInfo(Boolean value) {
        this.preserveEPSInfo = value;
    }

    /**
     * Gets the value of the transferFunctionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferFunctionInfo() {
        return transferFunctionInfo;
    }

    /**
     * Sets the value of the transferFunctionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferFunctionInfo(String value) {
        this.transferFunctionInfo = value;
    }

    /**
     * Gets the value of the autoPositionEPSInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAutoPositionEPSInfo() {
        return autoPositionEPSInfo;
    }

    /**
     * Sets the value of the autoPositionEPSInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoPositionEPSInfo(Boolean value) {
        this.autoPositionEPSInfo = value;
    }

    /**
     * Gets the value of the parseDSCCommentsForDocInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getParseDSCCommentsForDocInfo() {
        return parseDSCCommentsForDocInfo;
    }

    /**
     * Sets the value of the parseDSCCommentsForDocInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setParseDSCCommentsForDocInfo(Boolean value) {
        this.parseDSCCommentsForDocInfo = value;
    }

}
