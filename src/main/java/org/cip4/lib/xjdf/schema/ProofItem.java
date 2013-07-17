
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ProofItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProofItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Contract" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="PageIndex" type="{http://www.CIP4.org/JDFSchema_2_0}IntegerRangeList" />
 *       &lt;attribute name="ProofTarget" type="{http://www.CIP4.org/JDFSchema_2_0}URL" />
 *       &lt;attribute name="ProofName" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="ApprovalParamsRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="ProofType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Amount" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="HalfTone" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="SeparationNames" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKENS" />
 *       &lt;attribute name="ColorType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ImageStrategy" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="BrandName" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="Technology" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProofItem")
public class ProofItem
    implements Serializable
{

    @XmlAttribute(name = "Contract")
    protected Boolean contract;
    @XmlAttribute(name = "PageIndex")
    protected Integer pageIndex;
    @XmlAttribute(name = "ProofTarget")
    protected String proofTarget;
    @XmlAttribute(name = "ProofName")
    protected String proofName;
    @XmlAttribute(name = "ApprovalParamsRef")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IDREF.class)
    protected org.cip4.lib.xjdf.type.IDREF approvalParamsRef;
    @XmlAttribute(name = "ProofType")
    @XmlSchemaType(name = "anySimpleType")
    protected String proofType;
    @XmlAttribute(name = "Amount")
    protected Integer amount;
    @XmlAttribute(name = "HalfTone")
    protected Boolean halfTone;
    @XmlAttribute(name = "SeparationNames")
    protected List<String> separationNames;
    @XmlAttribute(name = "ColorType")
    @XmlSchemaType(name = "anySimpleType")
    protected String colorType;
    @XmlAttribute(name = "ImageStrategy")
    @XmlSchemaType(name = "anySimpleType")
    protected String imageStrategy;
    @XmlAttribute(name = "BrandName")
    protected String brandName;
    @XmlAttribute(name = "Technology")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String technology;

    /**
     * Gets the value of the contract property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContract() {
        return contract;
    }

    /**
     * Sets the value of the contract property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContract(Boolean value) {
        this.contract = value;
    }

    /**
     * Gets the value of the pageIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageIndex() {
        return pageIndex;
    }

    /**
     * Sets the value of the pageIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageIndex(Integer value) {
        this.pageIndex = value;
    }

    /**
     * Gets the value of the proofTarget property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProofTarget() {
        return proofTarget;
    }

    /**
     * Sets the value of the proofTarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProofTarget(String value) {
        this.proofTarget = value;
    }

    /**
     * Gets the value of the proofName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProofName() {
        return proofName;
    }

    /**
     * Sets the value of the proofName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProofName(String value) {
        this.proofName = value;
    }

    /**
     * Gets the value of the approvalParamsRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.IDREF getApprovalParamsRef() {
        return approvalParamsRef;
    }

    /**
     * Sets the value of the approvalParamsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovalParamsRef(org.cip4.lib.xjdf.type.IDREF value) {
        this.approvalParamsRef = value;
    }

    /**
     * Gets the value of the proofType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProofType() {
        return proofType;
    }

    /**
     * Sets the value of the proofType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProofType(String value) {
        this.proofType = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAmount(Integer value) {
        this.amount = value;
    }

    /**
     * Gets the value of the halfTone property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHalfTone() {
        return halfTone;
    }

    /**
     * Sets the value of the halfTone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHalfTone(Boolean value) {
        this.halfTone = value;
    }

    /**
     * Gets the value of the separationNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the separationNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeparationNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSeparationNames() {
        if (separationNames == null) {
            separationNames = new ArrayList<String>();
        }
        return this.separationNames;
    }

    /**
     * Gets the value of the colorType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorType() {
        return colorType;
    }

    /**
     * Sets the value of the colorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorType(String value) {
        this.colorType = value;
    }

    /**
     * Gets the value of the imageStrategy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageStrategy() {
        return imageStrategy;
    }

    /**
     * Sets the value of the imageStrategy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageStrategy(String value) {
        this.imageStrategy = value;
    }

    /**
     * Gets the value of the brandName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * Sets the value of the brandName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandName(String value) {
        this.brandName = value;
    }

    /**
     * Gets the value of the technology property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechnology() {
        return technology;
    }

    /**
     * Sets the value of the technology property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechnology(String value) {
        this.technology = value;
    }

}
