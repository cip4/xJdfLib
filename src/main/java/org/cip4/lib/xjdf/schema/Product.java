
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
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
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}GeneralID" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Comment" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ChildProduct" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Intent" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" use="required" type="{http://www.CIP4.org/JDFSchema_2_0}ID" />
 *       &lt;attribute name="DescriptiveName" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="Amount" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="ProductID" type="{http://www.CIP4.org/JDFSchema_2_0}shortString" />
 *       &lt;attribute name="ProductType" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="ProductTypeDetails" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "generalID",
    "comment",
    "childProduct",
    "intent"
})
@XmlRootElement(name = "Product")
public class Product
    implements Serializable
{

    @XmlElement(name = "GeneralID")
    protected List<GeneralID> generalID;
    @XmlElement(name = "Comment")
    protected List<Comment> comment;
    @XmlElement(name = "ChildProduct")
    protected List<ChildProduct> childProduct;
    @XmlElement(name = "Intent")
    protected List<Intent> intent;
    @XmlAttribute(name = "ID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "DescriptiveName")
    protected String descriptiveName;
    @XmlAttribute(name = "Amount")
    protected Integer amount;
    @XmlAttribute(name = "ProductID")
    protected String productID;
    @XmlAttribute(name = "ProductType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String productType;
    @XmlAttribute(name = "ProductTypeDetails")
    protected String productTypeDetails;

    /**
     * Gets the value of the generalID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generalID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeneralID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeneralID }
     * 
     * 
     */
    public List<GeneralID> getGeneralID() {
        if (generalID == null) {
            generalID = new ArrayList<GeneralID>();
        }
        return this.generalID;
    }

    /**
     * Gets the value of the comment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Comment }
     * 
     * 
     */
    public List<Comment> getComment() {
        if (comment == null) {
            comment = new ArrayList<Comment>();
        }
        return this.comment;
    }

    /**
     * Gets the value of the childProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChildProduct }
     * 
     * 
     */
    public List<ChildProduct> getChildProduct() {
        if (childProduct == null) {
            childProduct = new ArrayList<ChildProduct>();
        }
        return this.childProduct;
    }

    /**
     * Gets the value of the intent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Intent }
     * 
     * 
     */
    public List<Intent> getIntent() {
        if (intent == null) {
            intent = new ArrayList<Intent>();
        }
        return this.intent;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the descriptiveName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptiveName() {
        return descriptiveName;
    }

    /**
     * Sets the value of the descriptiveName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptiveName(String value) {
        this.descriptiveName = value;
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
     * Gets the value of the productID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductID() {
        return productID;
    }

    /**
     * Sets the value of the productID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductID(String value) {
        this.productID = value;
    }

    /**
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductType(String value) {
        this.productType = value;
    }

    /**
     * Gets the value of the productTypeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductTypeDetails() {
        return productTypeDetails;
    }

    /**
     * Sets the value of the productTypeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductTypeDetails(String value) {
        this.productTypeDetails = value;
    }

}
