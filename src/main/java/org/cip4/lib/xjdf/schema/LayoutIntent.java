
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for LayoutIntent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LayoutIntent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}IntentType">
 *       &lt;attribute name="RotatePolicy" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="FolioCount" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NumberUp" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="Sides" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="LayoutRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="SizePolicy" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Pages" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="PageVariance" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="FinishedDimensions" type="{http://www.CIP4.org/JDFSchema_2_0}shape" />
 *       &lt;attribute name="Dimensions" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="FinishedGrainDirection" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LayoutIntent")
public class LayoutIntent
    extends IntentType
    implements Serializable
{

    @XmlAttribute(name = "RotatePolicy")
    @XmlSchemaType(name = "anySimpleType")
    protected String rotatePolicy;
    @XmlAttribute(name = "FolioCount")
    @XmlSchemaType(name = "anySimpleType")
    protected String folioCount;
    @XmlAttribute(name = "NumberUp")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.XYPair.class)
    protected org.cip4.lib.xjdf.type.XYPair numberUp;
    @XmlAttribute(name = "Sides")
    @XmlSchemaType(name = "anySimpleType")
    protected String sides;
    @XmlAttribute(name = "LayoutRef")
    @XmlIDREF
    protected Object layoutRef;
    @XmlAttribute(name = "SizePolicy")
    @XmlSchemaType(name = "anySimpleType")
    protected String sizePolicy;
    @XmlAttribute(name = "Pages")
    protected Integer pages;
    @XmlAttribute(name = "PageVariance")
    protected Integer pageVariance;
    @XmlAttribute(name = "FinishedDimensions")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.Shape.class)
    protected org.cip4.lib.xjdf.type.Shape finishedDimensions;
    @XmlAttribute(name = "Dimensions")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.XYPair.class)
    protected org.cip4.lib.xjdf.type.XYPair dimensions;
    @XmlAttribute(name = "FinishedGrainDirection")
    @XmlSchemaType(name = "anySimpleType")
    protected String finishedGrainDirection;

    /**
     * Gets the value of the rotatePolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRotatePolicy() {
        return rotatePolicy;
    }

    /**
     * Sets the value of the rotatePolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRotatePolicy(String value) {
        this.rotatePolicy = value;
    }

    /**
     * Gets the value of the folioCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolioCount() {
        return folioCount;
    }

    /**
     * Sets the value of the folioCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolioCount(String value) {
        this.folioCount = value;
    }

    /**
     * Gets the value of the numberUp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.XYPair getNumberUp() {
        return numberUp;
    }

    /**
     * Sets the value of the numberUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberUp(org.cip4.lib.xjdf.type.XYPair value) {
        this.numberUp = value;
    }

    /**
     * Gets the value of the sides property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSides() {
        return sides;
    }

    /**
     * Sets the value of the sides property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSides(String value) {
        this.sides = value;
    }

    /**
     * Gets the value of the layoutRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLayoutRef() {
        return layoutRef;
    }

    /**
     * Sets the value of the layoutRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLayoutRef(Object value) {
        this.layoutRef = value;
    }

    /**
     * Gets the value of the sizePolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSizePolicy() {
        return sizePolicy;
    }

    /**
     * Sets the value of the sizePolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSizePolicy(String value) {
        this.sizePolicy = value;
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
     * Gets the value of the pageVariance property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageVariance() {
        return pageVariance;
    }

    /**
     * Sets the value of the pageVariance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageVariance(Integer value) {
        this.pageVariance = value;
    }

    /**
     * Gets the value of the finishedDimensions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.Shape getFinishedDimensions() {
        return finishedDimensions;
    }

    /**
     * Sets the value of the finishedDimensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinishedDimensions(org.cip4.lib.xjdf.type.Shape value) {
        this.finishedDimensions = value;
    }

    /**
     * Gets the value of the dimensions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.XYPair getDimensions() {
        return dimensions;
    }

    /**
     * Sets the value of the dimensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDimensions(org.cip4.lib.xjdf.type.XYPair value) {
        this.dimensions = value;
    }

    /**
     * Gets the value of the finishedGrainDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinishedGrainDirection() {
        return finishedGrainDirection;
    }

    /**
     * Sets the value of the finishedGrainDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinishedGrainDirection(String value) {
        this.finishedGrainDirection = value;
    }

}
