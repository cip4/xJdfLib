
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;
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
 *       &lt;attribute name="Level" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Position" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="ImageSize" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="Direction" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Height" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="EmbossingType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="EdgeAngle" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="EdgeShape" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="MediaRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="ToolRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="IdentificationFieldRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Emboss")
public class Emboss
    implements Serializable
{

    @XmlAttribute(name = "Level")
    @XmlSchemaType(name = "anySimpleType")
    protected String level;
    @XmlAttribute(name = "Position")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.XYPair.class)
    protected org.cip4.lib.xjdf.type.XYPair position;
    @XmlAttribute(name = "ImageSize")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.XYPair.class)
    protected org.cip4.lib.xjdf.type.XYPair imageSize;
    @XmlAttribute(name = "Direction")
    @XmlSchemaType(name = "anySimpleType")
    protected String direction;
    @XmlAttribute(name = "Height")
    protected Double height;
    @XmlAttribute(name = "EmbossingType")
    @XmlSchemaType(name = "anySimpleType")
    protected String embossingType;
    @XmlAttribute(name = "EdgeAngle")
    protected Double edgeAngle;
    @XmlAttribute(name = "EdgeShape")
    @XmlSchemaType(name = "anySimpleType")
    protected String edgeShape;
    @XmlAttribute(name = "MediaRef")
    @XmlIDREF
    protected Object mediaRef;
    @XmlAttribute(name = "ToolRef")
    @XmlIDREF
    protected Object toolRef;
    @XmlAttribute(name = "IdentificationFieldRef")
    @XmlIDREF
    protected Object identificationFieldRef;

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevel(String value) {
        this.level = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.XYPair getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosition(org.cip4.lib.xjdf.type.XYPair value) {
        this.position = value;
    }

    /**
     * Gets the value of the imageSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.XYPair getImageSize() {
        return imageSize;
    }

    /**
     * Sets the value of the imageSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageSize(org.cip4.lib.xjdf.type.XYPair value) {
        this.imageSize = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirection(String value) {
        this.direction = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHeight(Double value) {
        this.height = value;
    }

    /**
     * Gets the value of the embossingType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmbossingType() {
        return embossingType;
    }

    /**
     * Sets the value of the embossingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmbossingType(String value) {
        this.embossingType = value;
    }

    /**
     * Gets the value of the edgeAngle property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEdgeAngle() {
        return edgeAngle;
    }

    /**
     * Sets the value of the edgeAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEdgeAngle(Double value) {
        this.edgeAngle = value;
    }

    /**
     * Gets the value of the edgeShape property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEdgeShape() {
        return edgeShape;
    }

    /**
     * Sets the value of the edgeShape property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEdgeShape(String value) {
        this.edgeShape = value;
    }

    /**
     * Gets the value of the mediaRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMediaRef() {
        return mediaRef;
    }

    /**
     * Sets the value of the mediaRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMediaRef(Object value) {
        this.mediaRef = value;
    }

    /**
     * Gets the value of the toolRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getToolRef() {
        return toolRef;
    }

    /**
     * Sets the value of the toolRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setToolRef(Object value) {
        this.toolRef = value;
    }

    /**
     * Gets the value of the identificationFieldRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getIdentificationFieldRef() {
        return identificationFieldRef;
    }

    /**
     * Sets the value of the identificationFieldRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setIdentificationFieldRef(Object value) {
        this.identificationFieldRef = value;
    }

}
