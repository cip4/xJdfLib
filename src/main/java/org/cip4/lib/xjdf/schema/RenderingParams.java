
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RenderingParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RenderingParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ObjectResolution" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="BandWidth" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="BandHeight" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="ColorantDepth" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="BandOrdering" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Interleaved" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="MediaRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="AutomatedOverPrintParamsRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RenderingParams", propOrder = {
    "objectResolution"
})
public class RenderingParams
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "ObjectResolution")
    protected List<ObjectResolution> objectResolution;
    @XmlAttribute(name = "BandWidth")
    protected Integer bandWidth;
    @XmlAttribute(name = "BandHeight")
    protected Integer bandHeight;
    @XmlAttribute(name = "ColorantDepth")
    protected Integer colorantDepth;
    @XmlAttribute(name = "BandOrdering")
    @XmlSchemaType(name = "anySimpleType")
    protected String bandOrdering;
    @XmlAttribute(name = "Interleaved")
    protected Boolean interleaved;
    @XmlAttribute(name = "MediaRef")
    @XmlIDREF
    protected Object mediaRef;
    @XmlAttribute(name = "AutomatedOverPrintParamsRef")
    @XmlIDREF
    protected Object automatedOverPrintParamsRef;

    /**
     * Gets the value of the objectResolution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectResolution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectResolution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectResolution }
     * 
     * 
     */
    public List<ObjectResolution> getObjectResolution() {
        if (objectResolution == null) {
            objectResolution = new ArrayList<ObjectResolution>();
        }
        return this.objectResolution;
    }

    /**
     * Gets the value of the bandWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBandWidth() {
        return bandWidth;
    }

    /**
     * Sets the value of the bandWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBandWidth(Integer value) {
        this.bandWidth = value;
    }

    /**
     * Gets the value of the bandHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBandHeight() {
        return bandHeight;
    }

    /**
     * Sets the value of the bandHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBandHeight(Integer value) {
        this.bandHeight = value;
    }

    /**
     * Gets the value of the colorantDepth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getColorantDepth() {
        return colorantDepth;
    }

    /**
     * Sets the value of the colorantDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setColorantDepth(Integer value) {
        this.colorantDepth = value;
    }

    /**
     * Gets the value of the bandOrdering property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBandOrdering() {
        return bandOrdering;
    }

    /**
     * Sets the value of the bandOrdering property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBandOrdering(String value) {
        this.bandOrdering = value;
    }

    /**
     * Gets the value of the interleaved property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInterleaved() {
        return interleaved;
    }

    /**
     * Sets the value of the interleaved property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInterleaved(Boolean value) {
        this.interleaved = value;
    }

    /**
     * Gets the value of the mediaRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMediaRef() {
        return mediaRef;
    }

    /**
     * Sets the value of the mediaRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMediaRef(Object value) {
        this.mediaRef = value;
    }

    /**
     * Gets the value of the automatedOverPrintParamsRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAutomatedOverPrintParamsRef() {
        return automatedOverPrintParamsRef;
    }

    /**
     * Sets the value of the automatedOverPrintParamsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAutomatedOverPrintParamsRef(Object value) {
        this.automatedOverPrintParamsRef = value;
    }

}
