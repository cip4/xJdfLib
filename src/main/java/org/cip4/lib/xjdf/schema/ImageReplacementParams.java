
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ImageReplacementParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImageReplacementParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;attribute name="MaxSearchRecursion" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="MinResolution" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="IgnoreExtensions" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKENS" />
 *       &lt;attribute name="ImageReplacementStrategy" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ImagePreScanStrategy" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="FileSpecRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageReplacementParams")
public class ImageReplacementParams
    extends ParameterType
    implements Serializable
{

    @XmlAttribute(name = "MaxSearchRecursion")
    protected Integer maxSearchRecursion;
    @XmlAttribute(name = "MinResolution")
    protected Double minResolution;
    @XmlAttribute(name = "IgnoreExtensions")
    protected List<String> ignoreExtensions;
    @XmlAttribute(name = "ImageReplacementStrategy")
    @XmlSchemaType(name = "anySimpleType")
    protected String imageReplacementStrategy;
    @XmlAttribute(name = "ImagePreScanStrategy")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String imagePreScanStrategy;
    @XmlAttribute(name = "FileSpecRef")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IDREF.class)
    protected org.cip4.lib.xjdf.type.IDREF fileSpecRef;

    /**
     * Gets the value of the maxSearchRecursion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxSearchRecursion() {
        return maxSearchRecursion;
    }

    /**
     * Sets the value of the maxSearchRecursion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxSearchRecursion(Integer value) {
        this.maxSearchRecursion = value;
    }

    /**
     * Gets the value of the minResolution property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinResolution() {
        return minResolution;
    }

    /**
     * Sets the value of the minResolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinResolution(Double value) {
        this.minResolution = value;
    }

    /**
     * Gets the value of the ignoreExtensions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ignoreExtensions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIgnoreExtensions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIgnoreExtensions() {
        if (ignoreExtensions == null) {
            ignoreExtensions = new ArrayList<String>();
        }
        return this.ignoreExtensions;
    }

    /**
     * Gets the value of the imageReplacementStrategy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageReplacementStrategy() {
        return imageReplacementStrategy;
    }

    /**
     * Sets the value of the imageReplacementStrategy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageReplacementStrategy(String value) {
        this.imageReplacementStrategy = value;
    }

    /**
     * Gets the value of the imagePreScanStrategy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImagePreScanStrategy() {
        return imagePreScanStrategy;
    }

    /**
     * Sets the value of the imagePreScanStrategy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImagePreScanStrategy(String value) {
        this.imagePreScanStrategy = value;
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
