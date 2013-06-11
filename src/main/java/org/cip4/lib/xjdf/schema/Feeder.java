
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
 *       &lt;attribute name="Position" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="Opening" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="FeederType" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="AlternatePositions" type="{http://www.CIP4.org/JDFSchema_2_0}IntegerList" />
 *       &lt;attribute name="FeederSynchronization" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Loading" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="MediaRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="ComponentRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="FeederQualityParamsRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Feeder")
public class Feeder
    implements Serializable
{

    @XmlAttribute(name = "Position")
    protected Integer position;
    @XmlAttribute(name = "Opening")
    @XmlSchemaType(name = "anySimpleType")
    protected String opening;
    @XmlAttribute(name = "FeederType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String feederType;
    @XmlAttribute(name = "AlternatePositions")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IntegerList.class)
    protected org.cip4.lib.xjdf.type.IntegerList alternatePositions;
    @XmlAttribute(name = "FeederSynchronization")
    @XmlSchemaType(name = "anySimpleType")
    protected String feederSynchronization;
    @XmlAttribute(name = "Loading")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String loading;
    @XmlAttribute(name = "MediaRef")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IDREF.class)
    protected org.cip4.lib.xjdf.type.IDREF mediaRef;
    @XmlAttribute(name = "ComponentRef")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IDREF.class)
    protected org.cip4.lib.xjdf.type.IDREF componentRef;
    @XmlAttribute(name = "FeederQualityParamsRef")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IDREF.class)
    protected org.cip4.lib.xjdf.type.IDREF feederQualityParamsRef;

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPosition(Integer value) {
        this.position = value;
    }

    /**
     * Gets the value of the opening property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpening() {
        return opening;
    }

    /**
     * Sets the value of the opening property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpening(String value) {
        this.opening = value;
    }

    /**
     * Gets the value of the feederType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeederType() {
        return feederType;
    }

    /**
     * Sets the value of the feederType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeederType(String value) {
        this.feederType = value;
    }

    /**
     * Gets the value of the alternatePositions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.IntegerList getAlternatePositions() {
        return alternatePositions;
    }

    /**
     * Sets the value of the alternatePositions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternatePositions(org.cip4.lib.xjdf.type.IntegerList value) {
        this.alternatePositions = value;
    }

    /**
     * Gets the value of the feederSynchronization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeederSynchronization() {
        return feederSynchronization;
    }

    /**
     * Sets the value of the feederSynchronization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeederSynchronization(String value) {
        this.feederSynchronization = value;
    }

    /**
     * Gets the value of the loading property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoading() {
        return loading;
    }

    /**
     * Sets the value of the loading property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoading(String value) {
        this.loading = value;
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
     * Gets the value of the componentRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.IDREF getComponentRef() {
        return componentRef;
    }

    /**
     * Sets the value of the componentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponentRef(org.cip4.lib.xjdf.type.IDREF value) {
        this.componentRef = value;
    }

    /**
     * Gets the value of the feederQualityParamsRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.IDREF getFeederQualityParamsRef() {
        return feederQualityParamsRef;
    }

    /**
     * Sets the value of the feederQualityParamsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeederQualityParamsRef(org.cip4.lib.xjdf.type.IDREF value) {
        this.feederQualityParamsRef = value;
    }

}
