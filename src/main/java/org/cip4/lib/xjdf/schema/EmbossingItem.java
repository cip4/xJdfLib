
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
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Position" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Direction" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="EdgeShape" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="EdgeAngle" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="EmbossingType" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="Height" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="ImageSize" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="FoilColorDetails" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="FoilColor" type="{http://www.CIP4.org/JDFSchema_2_0}EnumNamedColor" />
 *       &lt;attribute name="Level" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "position"
})
@XmlRootElement(name = "EmbossingItem")
public class EmbossingItem
    implements Serializable
{

    @XmlElement(name = "Position")
    protected List<Position> position;
    @XmlAttribute(name = "Direction")
    @XmlSchemaType(name = "anySimpleType")
    protected String direction;
    @XmlAttribute(name = "EdgeShape")
    @XmlSchemaType(name = "anySimpleType")
    protected String edgeShape;
    @XmlAttribute(name = "EdgeAngle")
    protected Double edgeAngle;
    @XmlAttribute(name = "EmbossingType")
    protected String embossingType;
    @XmlAttribute(name = "Height")
    protected Double height;
    @XmlAttribute(name = "ImageSize")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.XYPair.class)
    protected org.cip4.lib.xjdf.type.XYPair imageSize;
    @XmlAttribute(name = "FoilColorDetails")
    protected String foilColorDetails;
    @XmlAttribute(name = "FoilColor")
    protected EnumNamedColor foilColor;
    @XmlAttribute(name = "Level")
    @XmlSchemaType(name = "anySimpleType")
    protected String level;

    /**
     * Gets the value of the position property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the position property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPosition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Position }
     * 
     * 
     */
    public List<Position> getPosition() {
        if (position == null) {
            position = new ArrayList<Position>();
        }
        return this.position;
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
     * Gets the value of the foilColorDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoilColorDetails() {
        return foilColorDetails;
    }

    /**
     * Sets the value of the foilColorDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoilColorDetails(String value) {
        this.foilColorDetails = value;
    }

    /**
     * Gets the value of the foilColor property.
     * 
     * @return
     *     possible object is
     *     {@link EnumNamedColor }
     *     
     */
    public EnumNamedColor getFoilColor() {
        return foilColor;
    }

    /**
     * Sets the value of the foilColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumNamedColor }
     *     
     */
    public void setFoilColor(EnumNamedColor value) {
        this.foilColor = value;
    }

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

}
