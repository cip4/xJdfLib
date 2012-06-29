
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;
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
 *       &lt;attribute name="ContentType" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="ContentDataRefs" type="{http://www.CIP4.org/JDFSchema_2_0}IDREFS" />
 *       &lt;attribute name="RelativeBox" type="{http://www.CIP4.org/JDFSchema_2_0}rectangle" />
 *       &lt;attribute name="ElementPages" type="{http://www.CIP4.org/JDFSchema_2_0}IntegerRangeList" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "PageElement")
public class PageElement
    implements Serializable
{

    @XmlAttribute(name = "ContentType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String contentType;
    @XmlAttribute(name = "ContentDataRefs")
    @XmlIDREF
    protected List<Object> contentDataRefs;
    @XmlAttribute(name = "RelativeBox")
    protected Double relativeBox;
    @XmlAttribute(name = "ElementPages")
    protected Integer elementPages;

    /**
     * Gets the value of the contentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * Sets the value of the contentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentType(String value) {
        this.contentType = value;
    }

    /**
     * Gets the value of the contentDataRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contentDataRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContentDataRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getContentDataRefs() {
        if (contentDataRefs == null) {
            contentDataRefs = new ArrayList<Object>();
        }
        return this.contentDataRefs;
    }

    /**
     * Gets the value of the relativeBox property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRelativeBox() {
        return relativeBox;
    }

    /**
     * Sets the value of the relativeBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRelativeBox(Double value) {
        this.relativeBox = value;
    }

    /**
     * Gets the value of the elementPages property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getElementPages() {
        return elementPages;
    }

    /**
     * Sets the value of the elementPages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setElementPages(Integer value) {
        this.elementPages = value;
    }

}
