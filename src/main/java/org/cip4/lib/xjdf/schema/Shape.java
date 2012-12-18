
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


/**
 * <p>Java class for Shape complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Shape">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Shape" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="CutOut" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="CutType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="DDESCutType" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="ShapeDepth" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="TeethPerDimension" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="LockOrigins" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="CutPath" type="{http://www.CIP4.org/JDFSchema_2_0}PDFPath" />
 *       &lt;attribute name="Material" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="ShapeType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CutBox" type="{http://www.CIP4.org/JDFSchema_2_0}rectangle" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Shape", propOrder = {
    "shapes"
})
public class Shape
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "Shape")
    protected List<Shape> shapes;
    @XmlAttribute(name = "CutOut")
    protected Boolean cutOut;
    @XmlAttribute(name = "CutType")
    @XmlSchemaType(name = "anySimpleType")
    protected String cutType;
    @XmlAttribute(name = "DDESCutType")
    protected Integer ddesCutType;
    @XmlAttribute(name = "ShapeDepth")
    protected Double shapeDepth;
    @XmlAttribute(name = "TeethPerDimension")
    protected Double teethPerDimension;
    @XmlAttribute(name = "LockOrigins")
    protected Boolean lockOrigins;
    @XmlAttribute(name = "CutPath")
    protected String cutPath;
    @XmlAttribute(name = "Material")
    protected String material;
    @XmlAttribute(name = "ShapeType")
    @XmlSchemaType(name = "anySimpleType")
    protected String shapeType;
    @XmlAttribute(name = "CutBox")
    protected List<Double> cutBoxes;

    /**
     * Gets the value of the shapes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shapes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShapes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Shape }
     * 
     * 
     */
    public List<Shape> getShapes() {
        if (shapes == null) {
            shapes = new ArrayList<Shape>();
        }
        return this.shapes;
    }

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
     * Gets the value of the ddesCutType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDDESCutType() {
        return ddesCutType;
    }

    /**
     * Sets the value of the ddesCutType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDDESCutType(Integer value) {
        this.ddesCutType = value;
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
     * Gets the value of the cutBoxes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cutBoxes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCutBoxes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getCutBoxes() {
        if (cutBoxes == null) {
            cutBoxes = new ArrayList<Double>();
        }
        return this.cutBoxes;
    }

}
