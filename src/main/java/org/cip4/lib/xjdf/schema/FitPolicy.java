
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for FitPolicy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FitPolicy">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;attribute name="GutterPolicy" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="RotatePolicy" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="SizePolicy" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ClipOffset" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="MinGutter" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FitPolicy")
public class FitPolicy
    extends ParameterType
    implements Serializable
{

    @XmlAttribute(name = "GutterPolicy")
    @XmlSchemaType(name = "anySimpleType")
    protected String gutterPolicy;
    @XmlAttribute(name = "RotatePolicy")
    @XmlSchemaType(name = "anySimpleType")
    protected String rotatePolicy;
    @XmlAttribute(name = "SizePolicy")
    @XmlSchemaType(name = "anySimpleType")
    protected String sizePolicy;
    @XmlAttribute(name = "ClipOffset")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.XYPair.class)
    protected org.cip4.lib.xjdf.type.XYPair clipOffset;
    @XmlAttribute(name = "MinGutter")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.XYPair.class)
    protected org.cip4.lib.xjdf.type.XYPair minGutter;

    /**
     * Gets the value of the gutterPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGutterPolicy() {
        return gutterPolicy;
    }

    /**
     * Sets the value of the gutterPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGutterPolicy(String value) {
        this.gutterPolicy = value;
    }

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
     * Gets the value of the clipOffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.XYPair getClipOffset() {
        return clipOffset;
    }

    /**
     * Sets the value of the clipOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClipOffset(org.cip4.lib.xjdf.type.XYPair value) {
        this.clipOffset = value;
    }

    /**
     * Gets the value of the minGutter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.XYPair getMinGutter() {
        return minGutter;
    }

    /**
     * Sets the value of the minGutter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinGutter(org.cip4.lib.xjdf.type.XYPair value) {
        this.minGutter = value;
    }

}
