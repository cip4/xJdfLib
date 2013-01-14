
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
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for InterpretingParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterpretingParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}FitPolicy" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ObjectResolution" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Scaling" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="Polarity" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ScalingOrigin" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="MirrorAround" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PrintQuality" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Center" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="PosterOverlap" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="Poster" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="PDFInterpretingParamsRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="MediaRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterpretingParams", propOrder = {
    "fitPolicy",
    "objectResolution"
})
public class InterpretingParams
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "FitPolicy")
    protected List<FitPolicy> fitPolicy;
    @XmlElement(name = "ObjectResolution")
    protected List<ObjectResolution> objectResolution;
    @XmlAttribute(name = "Scaling")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.XYPair.class)
    protected org.cip4.lib.xjdf.type.XYPair scaling;
    @XmlAttribute(name = "Polarity")
    @XmlSchemaType(name = "anySimpleType")
    protected String polarity;
    @XmlAttribute(name = "ScalingOrigin")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.XYPair.class)
    protected org.cip4.lib.xjdf.type.XYPair scalingOrigin;
    @XmlAttribute(name = "MirrorAround")
    @XmlSchemaType(name = "anySimpleType")
    protected String mirrorAround;
    @XmlAttribute(name = "PrintQuality")
    @XmlSchemaType(name = "anySimpleType")
    protected String printQuality;
    @XmlAttribute(name = "Center")
    protected Boolean center;
    @XmlAttribute(name = "PosterOverlap")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.XYPair.class)
    protected org.cip4.lib.xjdf.type.XYPair posterOverlap;
    @XmlAttribute(name = "Poster")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.XYPair.class)
    protected org.cip4.lib.xjdf.type.XYPair poster;
    @XmlAttribute(name = "PDFInterpretingParamsRef")
    @XmlIDREF
    protected Object pdfInterpretingParamsRef;
    @XmlAttribute(name = "MediaRef")
    @XmlIDREF
    protected Object mediaRef;

    /**
     * Gets the value of the fitPolicy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fitPolicy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFitPolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FitPolicy }
     * 
     * 
     */
    public List<FitPolicy> getFitPolicy() {
        if (fitPolicy == null) {
            fitPolicy = new ArrayList<FitPolicy>();
        }
        return this.fitPolicy;
    }

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
     * Gets the value of the scaling property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.XYPair getScaling() {
        return scaling;
    }

    /**
     * Sets the value of the scaling property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScaling(org.cip4.lib.xjdf.type.XYPair value) {
        this.scaling = value;
    }

    /**
     * Gets the value of the polarity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolarity() {
        return polarity;
    }

    /**
     * Sets the value of the polarity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolarity(String value) {
        this.polarity = value;
    }

    /**
     * Gets the value of the scalingOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.XYPair getScalingOrigin() {
        return scalingOrigin;
    }

    /**
     * Sets the value of the scalingOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScalingOrigin(org.cip4.lib.xjdf.type.XYPair value) {
        this.scalingOrigin = value;
    }

    /**
     * Gets the value of the mirrorAround property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMirrorAround() {
        return mirrorAround;
    }

    /**
     * Sets the value of the mirrorAround property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMirrorAround(String value) {
        this.mirrorAround = value;
    }

    /**
     * Gets the value of the printQuality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintQuality() {
        return printQuality;
    }

    /**
     * Sets the value of the printQuality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintQuality(String value) {
        this.printQuality = value;
    }

    /**
     * Gets the value of the center property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCenter() {
        return center;
    }

    /**
     * Sets the value of the center property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCenter(Boolean value) {
        this.center = value;
    }

    /**
     * Gets the value of the posterOverlap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.XYPair getPosterOverlap() {
        return posterOverlap;
    }

    /**
     * Sets the value of the posterOverlap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosterOverlap(org.cip4.lib.xjdf.type.XYPair value) {
        this.posterOverlap = value;
    }

    /**
     * Gets the value of the poster property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.XYPair getPoster() {
        return poster;
    }

    /**
     * Sets the value of the poster property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoster(org.cip4.lib.xjdf.type.XYPair value) {
        this.poster = value;
    }

    /**
     * Gets the value of the pdfInterpretingParamsRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPDFInterpretingParamsRef() {
        return pdfInterpretingParamsRef;
    }

    /**
     * Sets the value of the pdfInterpretingParamsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPDFInterpretingParamsRef(Object value) {
        this.pdfInterpretingParamsRef = value;
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

}
