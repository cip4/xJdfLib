
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="CutOut" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="CutPath" type="{http://www.CIP4.org/JDFSchema_2_0}PDFPath" />
 *       &lt;attribute name="Pages" type="{http://www.CIP4.org/JDFSchema_2_0}IntegerRangeList" />
 *       &lt;attribute name="CutBox" type="{http://www.CIP4.org/JDFSchema_2_0}rectangle" />
 *       &lt;attribute name="ShapeType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Material" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="CutType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TeethPerDimension" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="ShapeDepth" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ShapeCut")
public class ShapeCut
    implements Serializable
{

    @XmlAttribute(name = "CutOut")
    protected Boolean cutOut;
    @XmlAttribute(name = "CutPath")
    protected String cutPath;
    @XmlAttribute(name = "Pages")
    protected Integer pages;
    @XmlAttribute(name = "CutBox")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.Rectangle.class)
    protected org.cip4.lib.xjdf.type.Rectangle cutBox;
    @XmlAttribute(name = "ShapeType")
    @XmlSchemaType(name = "anySimpleType")
    protected String shapeType;
    @XmlAttribute(name = "Material")
    protected String material;
    @XmlAttribute(name = "CutType")
    @XmlSchemaType(name = "anySimpleType")
    protected String cutType;
    @XmlAttribute(name = "TeethPerDimension")
    protected Double teethPerDimension;
    @XmlAttribute(name = "ShapeDepth")
    protected Double shapeDepth;

    /**
     * Gets the value of the cutOut property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCutOut() {
        return cutOut;
    }

    /**
     * Sets the value of the cutOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCutOut(Boolean value) {
        this.cutOut = value;
    }

    /**
     * Gets the value of the cutPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCutPath() {
        return cutPath;
    }

    /**
     * Sets the value of the cutPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCutPath(String value) {
        this.cutPath = value;
    }

    /**
     * Gets the value of the pages property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPages() {
        return pages;
    }

    /**
     * Sets the value of the pages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPages(Integer value) {
        this.pages = value;
    }

    /**
     * Gets the value of the cutBox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.Rectangle getCutBox() {
        return cutBox;
    }

    /**
     * Sets the value of the cutBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCutBox(org.cip4.lib.xjdf.type.Rectangle value) {
        this.cutBox = value;
    }

    /**
     * Gets the value of the shapeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShapeType() {
        return shapeType;
    }

    /**
     * Sets the value of the shapeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShapeType(String value) {
        this.shapeType = value;
    }

    /**
     * Gets the value of the material property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Sets the value of the material property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterial(String value) {
        this.material = value;
    }

    /**
     * Gets the value of the cutType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCutType() {
        return cutType;
    }

    /**
     * Sets the value of the cutType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCutType(String value) {
        this.cutType = value;
    }

    /**
     * Gets the value of the teethPerDimension property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTeethPerDimension() {
        return teethPerDimension;
    }

    /**
     * Sets the value of the teethPerDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTeethPerDimension(Double value) {
        this.teethPerDimension = value;
    }

    /**
     * Gets the value of the shapeDepth property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getShapeDepth() {
        return shapeDepth;
    }

    /**
     * Sets the value of the shapeDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setShapeDepth(Double value) {
        this.shapeDepth = value;
    }

}
