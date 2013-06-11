
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *       &lt;attribute name="ObjectTags" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKENS" />
 *       &lt;attribute name="Frequency" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="ScreeningType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ScreeningFamily" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="DotSize" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="Angle" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="SourceFrequency" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="AngleMap" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="SourceObjects">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.CIP4.org/JDFSchema_2_0}EnumSourceObjects" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="SpotFunction" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="Separation" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ScreenSelector")
public class ScreenSelector
    implements Serializable
{

    @XmlAttribute(name = "ObjectTags")
    protected List<String> objectTags;
    @XmlAttribute(name = "Frequency")
    protected Double frequency;
    @XmlAttribute(name = "ScreeningType")
    @XmlSchemaType(name = "anySimpleType")
    protected String screeningType;
    @XmlAttribute(name = "ScreeningFamily")
    protected String screeningFamily;
    @XmlAttribute(name = "DotSize")
    protected Double dotSize;
    @XmlAttribute(name = "Angle")
    protected Double angle;
    @XmlAttribute(name = "SourceFrequency")
    protected String sourceFrequency;
    @XmlAttribute(name = "AngleMap")
    protected String angleMap;
    @XmlAttribute(name = "SourceObjects")
    protected List<EnumSourceObjects> sourceObjects;
    @XmlAttribute(name = "SpotFunction")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String spotFunction;
    @XmlAttribute(name = "Separation")
    protected String separation;

    /**
     * Gets the value of the objectTags property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectTags property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectTags().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getObjectTags() {
        if (objectTags == null) {
            objectTags = new ArrayList<String>();
        }
        return this.objectTags;
    }

    /**
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFrequency(Double value) {
        this.frequency = value;
    }

    /**
     * Gets the value of the screeningType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScreeningType() {
        return screeningType;
    }

    /**
     * Sets the value of the screeningType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScreeningType(String value) {
        this.screeningType = value;
    }

    /**
     * Gets the value of the screeningFamily property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScreeningFamily() {
        return screeningFamily;
    }

    /**
     * Sets the value of the screeningFamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScreeningFamily(String value) {
        this.screeningFamily = value;
    }

    /**
     * Gets the value of the dotSize property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDotSize() {
        return dotSize;
    }

    /**
     * Sets the value of the dotSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDotSize(Double value) {
        this.dotSize = value;
    }

    /**
     * Gets the value of the angle property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAngle() {
        return angle;
    }

    /**
     * Sets the value of the angle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAngle(Double value) {
        this.angle = value;
    }

    /**
     * Gets the value of the sourceFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceFrequency() {
        return sourceFrequency;
    }

    /**
     * Sets the value of the sourceFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceFrequency(String value) {
        this.sourceFrequency = value;
    }

    /**
     * Gets the value of the angleMap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAngleMap() {
        return angleMap;
    }

    /**
     * Sets the value of the angleMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAngleMap(String value) {
        this.angleMap = value;
    }

    /**
     * Gets the value of the sourceObjects property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceObjects property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceObjects().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnumSourceObjects }
     * 
     * 
     */
    public List<EnumSourceObjects> getSourceObjects() {
        if (sourceObjects == null) {
            sourceObjects = new ArrayList<EnumSourceObjects>();
        }
        return this.sourceObjects;
    }

    /**
     * Gets the value of the spotFunction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpotFunction() {
        return spotFunction;
    }

    /**
     * Sets the value of the spotFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpotFunction(String value) {
        this.spotFunction = value;
    }

    /**
     * Gets the value of the separation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeparation() {
        return separation;
    }

    /**
     * Sets the value of the separation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeparation(String value) {
        this.separation = value;
    }

}
