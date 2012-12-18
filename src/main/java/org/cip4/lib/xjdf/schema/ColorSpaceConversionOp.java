
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}DeviceNSpace" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="RenderingIntent" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ObjectTags" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKENS" />
 *       &lt;attribute name="SourceObjects">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.CIP4.org/JDFSchema_2_0}EnumSourceObjects" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="SourceRenderingIntent" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PreserveBlack" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="RGBGray2BlackThreshold" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="RGBGray2Black" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="SourceCS" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Operation" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="FileSpecRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="SeparationNames" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKENS" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "deviceNSpace"
})
@XmlRootElement(name = "ColorSpaceConversionOp")
public class ColorSpaceConversionOp
    implements Serializable
{

    @XmlElement(name = "DeviceNSpace")
    protected List<DeviceNSpace> deviceNSpace;
    @XmlAttribute(name = "RenderingIntent")
    @XmlSchemaType(name = "anySimpleType")
    protected String renderingIntent;
    @XmlAttribute(name = "ObjectTags")
    protected List<String> objectTags;
    @XmlAttribute(name = "SourceObjects")
    protected List<EnumSourceObjects> sourceObjects;
    @XmlAttribute(name = "SourceRenderingIntent")
    @XmlSchemaType(name = "anySimpleType")
    protected String sourceRenderingIntent;
    @XmlAttribute(name = "PreserveBlack")
    protected Boolean preserveBlack;
    @XmlAttribute(name = "RGBGray2BlackThreshold")
    protected Double rgbGray2BlackThreshold;
    @XmlAttribute(name = "RGBGray2Black")
    protected Boolean rgbGray2Black;
    @XmlAttribute(name = "SourceCS")
    @XmlSchemaType(name = "anySimpleType")
    protected String sourceCS;
    @XmlAttribute(name = "Operation")
    @XmlSchemaType(name = "anySimpleType")
    protected String operation;
    @XmlAttribute(name = "FileSpecRef")
    @XmlIDREF
    protected Object fileSpecRef;
    @XmlAttribute(name = "SeparationNames")
    protected List<String> separationNames;

    /**
     * Gets the value of the deviceNSpace property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deviceNSpace property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeviceNSpace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceNSpace }
     * 
     * 
     */
    public List<DeviceNSpace> getDeviceNSpace() {
        if (deviceNSpace == null) {
            deviceNSpace = new ArrayList<DeviceNSpace>();
        }
        return this.deviceNSpace;
    }

    /**
     * Gets the value of the renderingIntent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRenderingIntent() {
        return renderingIntent;
    }

    /**
     * Sets the value of the renderingIntent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRenderingIntent(String value) {
        this.renderingIntent = value;
    }

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
     * Gets the value of the sourceRenderingIntent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceRenderingIntent() {
        return sourceRenderingIntent;
    }

    /**
     * Sets the value of the sourceRenderingIntent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceRenderingIntent(String value) {
        this.sourceRenderingIntent = value;
    }

    /**
     * Gets the value of the preserveBlack property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreserveBlack() {
        return preserveBlack;
    }

    /**
     * Sets the value of the preserveBlack property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreserveBlack(Boolean value) {
        this.preserveBlack = value;
    }

    /**
     * Gets the value of the rgbGray2BlackThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRGBGray2BlackThreshold() {
        return rgbGray2BlackThreshold;
    }

    /**
     * Sets the value of the rgbGray2BlackThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRGBGray2BlackThreshold(Double value) {
        this.rgbGray2BlackThreshold = value;
    }

    /**
     * Gets the value of the rgbGray2Black property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRGBGray2Black() {
        return rgbGray2Black;
    }

    /**
     * Sets the value of the rgbGray2Black property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRGBGray2Black(Boolean value) {
        this.rgbGray2Black = value;
    }

    /**
     * Gets the value of the sourceCS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceCS() {
        return sourceCS;
    }

    /**
     * Sets the value of the sourceCS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceCS(String value) {
        this.sourceCS = value;
    }

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperation(String value) {
        this.operation = value;
    }

    /**
     * Gets the value of the fileSpecRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFileSpecRef() {
        return fileSpecRef;
    }

    /**
     * Sets the value of the fileSpecRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFileSpecRef(Object value) {
        this.fileSpecRef = value;
    }

    /**
     * Gets the value of the separationNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the separationNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeparationNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSeparationNames() {
        if (separationNames == null) {
            separationNames = new ArrayList<String>();
        }
        return this.separationNames;
    }

}
