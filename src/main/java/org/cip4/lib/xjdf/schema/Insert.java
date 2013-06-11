
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}GlueLine" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="WrapPages" type="{http://www.CIP4.org/JDFSchema_2_0}IntegerRangeList" />
 *       &lt;attribute name="Folio" type="{http://www.CIP4.org/JDFSchema_2_0}IntegerRangeList" />
 *       &lt;attribute name="Transformation" type="{http://www.CIP4.org/JDFSchema_2_0}matrix" />
 *       &lt;attribute name="GlueType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Method" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "glueLine"
})
@XmlRootElement(name = "Insert")
public class Insert
    implements Serializable
{

    @XmlElement(name = "GlueLine")
    protected List<GlueLine> glueLine;
    @XmlAttribute(name = "WrapPages")
    protected Integer wrapPages;
    @XmlAttribute(name = "Folio")
    protected Integer folio;
    @XmlAttribute(name = "Transformation")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.Matrix.class)
    protected org.cip4.lib.xjdf.type.Matrix transformation;
    @XmlAttribute(name = "GlueType")
    @XmlSchemaType(name = "anySimpleType")
    protected String glueType;
    @XmlAttribute(name = "Method")
    @XmlSchemaType(name = "anySimpleType")
    protected String method;

    /**
     * Gets the value of the glueLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the glueLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGlueLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GlueLine }
     * 
     * 
     */
    public List<GlueLine> getGlueLine() {
        if (glueLine == null) {
            glueLine = new ArrayList<GlueLine>();
        }
        return this.glueLine;
    }

    /**
     * Gets the value of the wrapPages property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWrapPages() {
        return wrapPages;
    }

    /**
     * Sets the value of the wrapPages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWrapPages(Integer value) {
        this.wrapPages = value;
    }

    /**
     * Gets the value of the folio property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFolio() {
        return folio;
    }

    /**
     * Sets the value of the folio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFolio(Integer value) {
        this.folio = value;
    }

    /**
     * Gets the value of the transformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.Matrix getTransformation() {
        return transformation;
    }

    /**
     * Sets the value of the transformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransformation(org.cip4.lib.xjdf.type.Matrix value) {
        this.transformation = value;
    }

    /**
     * Gets the value of the glueType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlueType() {
        return glueType;
    }

    /**
     * Sets the value of the glueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlueType(String value) {
        this.glueType = value;
    }

    /**
     * Gets the value of the method property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethod() {
        return method;
    }

    /**
     * Sets the value of the method property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethod(String value) {
        this.method = value;
    }

}
