
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ShapeDef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShapeDef">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Shape" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="GrainDirection" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Dimensions" type="{http://www.CIP4.org/JDFSchema_2_0}shape" />
 *       &lt;attribute name="LockOrigins" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="FluteDirection" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="MediaSide" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Area" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="CutBox" type="{http://www.CIP4.org/JDFSchema_2_0}rectangle" />
 *       &lt;attribute name="MediaRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="FileSpecRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShapeDef", propOrder = {
    "shape"
})
public class ShapeDef
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "Shape")
    protected List<org.cip4.lib.xjdf.schema.Shape> shape;
    @XmlAttribute(name = "GrainDirection")
    @XmlSchemaType(name = "anySimpleType")
    protected String grainDirection;
    @XmlAttribute(name = "Dimensions")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.Shape.class)
    protected org.cip4.lib.xjdf.type.Shape dimensions;
    @XmlAttribute(name = "LockOrigins")
    protected Boolean lockOrigins;
    @XmlAttribute(name = "FluteDirection")
    @XmlSchemaType(name = "anySimpleType")
    protected String fluteDirection;
    @XmlAttribute(name = "MediaSide")
    @XmlSchemaType(name = "anySimpleType")
    protected String mediaSide;
    @XmlAttribute(name = "Area")
    protected Double area;
    @XmlAttribute(name = "CutBox")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.Rectangle.class)
    protected org.cip4.lib.xjdf.type.Rectangle cutBox;
    @XmlAttribute(name = "MediaRef")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IDREF.class)
    protected org.cip4.lib.xjdf.type.IDREF mediaRef;
    @XmlAttribute(name = "FileSpecRef")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IDREF.class)
    protected org.cip4.lib.xjdf.type.IDREF fileSpecRef;

    /**
     * Gets the value of the shape property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shape property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShape().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link org.cip4.lib.xjdf.schema.Shape }
     * 
     * 
     */
    public List<org.cip4.lib.xjdf.schema.Shape> getShape() {
        if (shape == null) {
            shape = new ArrayList<org.cip4.lib.xjdf.schema.Shape>();
        }
        return this.shape;
    }

    /**
     * Gets the value of the grainDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrainDirection() {
        return grainDirection;
    }

    /**
     * Sets the value of the grainDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrainDirection(String value) {
        this.grainDirection = value;
    }

    /**
     * Gets the value of the dimensions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.Shape getDimensions() {
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
    public void setDimensions(org.cip4.lib.xjdf.type.Shape value) {
        this.dimensions = value;
    }

    /**
     * Gets the value of the lockOrigins property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLockOrigins() {
        return lockOrigins;
    }

    /**
     * Sets the value of the lockOrigins property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLockOrigins(Boolean value) {
        this.lockOrigins = value;
    }

    /**
     * Gets the value of the fluteDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFluteDirection() {
        return fluteDirection;
    }

    /**
     * Sets the value of the fluteDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFluteDirection(String value) {
        this.fluteDirection = value;
    }

    /**
     * Gets the value of the mediaSide property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaSide() {
        return mediaSide;
    }

    /**
     * Sets the value of the mediaSide property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaSide(String value) {
        this.mediaSide = value;
    }

    /**
     * Gets the value of the area property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setArea(Double value) {
        this.area = value;
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
     * Gets the value of the mediaRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.IDREF getMediaRef() {
        return mediaRef;
    }

    /**
     * Sets the value of the mediaRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaRef(org.cip4.lib.xjdf.type.IDREF value) {
        this.mediaRef = value;
    }

    /**
     * Gets the value of the fileSpecRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.IDREF getFileSpecRef() {
        return fileSpecRef;
    }

    /**
     * Sets the value of the fileSpecRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileSpecRef(org.cip4.lib.xjdf.type.IDREF value) {
        this.fileSpecRef = value;
    }

}
