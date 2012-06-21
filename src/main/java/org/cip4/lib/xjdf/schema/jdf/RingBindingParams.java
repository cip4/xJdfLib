
package org.cip4.lib.xjdf.schema.jdf;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for RingBindingParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RingBindingParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;attribute name="ViewBinder" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="BinderColor" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="SpineColor" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="SpineColorDetails" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="BinderColorDetails" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="RingDiameter" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="BinderName" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="RingMechanic" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="RivetsExposed" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="BinderMaterial" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="SpineWidth" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="RingShape" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="HoleMakingParamsRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RingBindingParams")
public class RingBindingParams
    extends ParameterType
    implements Serializable
{

    @XmlAttribute(name = "ViewBinder")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String viewBinder;
    @XmlAttribute(name = "BinderColor")
    protected String binderColor;
    @XmlAttribute(name = "SpineColor")
    protected String spineColor;
    @XmlAttribute(name = "SpineColorDetails")
    protected String spineColorDetails;
    @XmlAttribute(name = "BinderColorDetails")
    protected String binderColorDetails;
    @XmlAttribute(name = "RingDiameter")
    protected Double ringDiameter;
    @XmlAttribute(name = "BinderName")
    protected String binderName;
    @XmlAttribute(name = "RingMechanic")
    protected Boolean ringMechanic;
    @XmlAttribute(name = "RivetsExposed")
    protected Boolean rivetsExposed;
    @XmlAttribute(name = "BinderMaterial")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String binderMaterial;
    @XmlAttribute(name = "SpineWidth")
    protected Double spineWidth;
    @XmlAttribute(name = "RingShape")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String ringShape;
    @XmlAttribute(name = "HoleMakingParamsRef")
    @XmlIDREF
    protected Object holeMakingParamsRef;

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
     * Gets the value of the binderColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinderColor() {
        return binderColor;
    }

    /**
     * Sets the value of the binderColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinderColor(String value) {
        this.binderColor = value;
    }

    /**
     * Gets the value of the spineColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpineColor() {
        return spineColor;
    }

    /**
     * Sets the value of the spineColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpineColor(String value) {
        this.spineColor = value;
    }

    /**
     * Gets the value of the spineColorDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpineColorDetails() {
        return spineColorDetails;
    }

    /**
     * Sets the value of the spineColorDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpineColorDetails(String value) {
        this.spineColorDetails = value;
    }

    /**
     * Gets the value of the binderColorDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinderColorDetails() {
        return binderColorDetails;
    }

    /**
     * Sets the value of the binderColorDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinderColorDetails(String value) {
        this.binderColorDetails = value;
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
     * Gets the value of the binderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinderName() {
        return binderName;
    }

    /**
     * Sets the value of the binderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinderName(String value) {
        this.binderName = value;
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

    /**
     * Gets the value of the spineWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSpineWidth() {
        return spineWidth;
    }

    /**
     * Sets the value of the spineWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSpineWidth(Double value) {
        this.spineWidth = value;
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
     * Gets the value of the holeMakingParamsRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getHoleMakingParamsRef() {
        return holeMakingParamsRef;
    }

    /**
     * Sets the value of the holeMakingParamsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setHoleMakingParamsRef(Object value) {
        this.holeMakingParamsRef = value;
    }

}
