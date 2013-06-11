
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
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
 *       &lt;attribute name="RivetsExposed" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="RingShape" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="ViewBinder" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="RingDiameter" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="HoleType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="BinderBrand" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="RingMechanic" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="BinderMaterial" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "RingBinding")
public class RingBinding
    implements Serializable
{

    @XmlAttribute(name = "RivetsExposed")
    protected Boolean rivetsExposed;
    @XmlAttribute(name = "RingShape")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String ringShape;
    @XmlAttribute(name = "ViewBinder")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String viewBinder;
    @XmlAttribute(name = "RingDiameter")
    protected Double ringDiameter;
    @XmlAttribute(name = "HoleType")
    @XmlSchemaType(name = "anySimpleType")
    protected String holeType;
    @XmlAttribute(name = "BinderBrand")
    protected String binderBrand;
    @XmlAttribute(name = "RingMechanic")
    protected Boolean ringMechanic;
    @XmlAttribute(name = "BinderMaterial")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String binderMaterial;

    /**
     * Gets the value of the rivetsExposed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRivetsExposed() {
        return rivetsExposed;
    }

    /**
     * Sets the value of the rivetsExposed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRivetsExposed(Boolean value) {
        this.rivetsExposed = value;
    }

    /**
     * Gets the value of the ringShape property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRingShape() {
        return ringShape;
    }

    /**
     * Sets the value of the ringShape property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRingShape(String value) {
        this.ringShape = value;
    }

    /**
     * Gets the value of the viewBinder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViewBinder() {
        return viewBinder;
    }

    /**
     * Sets the value of the viewBinder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViewBinder(String value) {
        this.viewBinder = value;
    }

    /**
     * Gets the value of the ringDiameter property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRingDiameter() {
        return ringDiameter;
    }

    /**
     * Sets the value of the ringDiameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRingDiameter(Double value) {
        this.ringDiameter = value;
    }

    /**
     * Gets the value of the holeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoleType() {
        return holeType;
    }

    /**
     * Sets the value of the holeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoleType(String value) {
        this.holeType = value;
    }

    /**
     * Gets the value of the binderBrand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinderBrand() {
        return binderBrand;
    }

    /**
     * Sets the value of the binderBrand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinderBrand(String value) {
        this.binderBrand = value;
    }

    /**
     * Gets the value of the ringMechanic property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRingMechanic() {
        return ringMechanic;
    }

    /**
     * Sets the value of the ringMechanic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRingMechanic(Boolean value) {
        this.ringMechanic = value;
    }

    /**
     * Gets the value of the binderMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinderMaterial() {
        return binderMaterial;
    }

    /**
     * Sets the value of the binderMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinderMaterial(String value) {
        this.binderMaterial = value;
    }

}
