
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
 * <p>Java class for InterpretingParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterpretingParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}FitPolicy" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ObjectResolution" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
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
    "objectResolutions",
    "fitPolicies"
})
public class InterpretingParams
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "ObjectResolution")
    protected List<ObjectResolution> objectResolutions;
    @XmlElement(name = "FitPolicy")
    protected List<FitPolicy> fitPolicies;
    @XmlAttribute(name = "Scaling")
    protected List<Double> scalings;
    @XmlAttribute(name = "Polarity")
    @XmlSchemaType(name = "anySimpleType")
    protected String polarity;
    @XmlAttribute(name = "ScalingOrigin")
    protected List<Double> scalingOrigins;
    @XmlAttribute(name = "MirrorAround")
    @XmlSchemaType(name = "anySimpleType")
    protected String mirrorAround;
    @XmlAttribute(name = "PrintQuality")
    @XmlSchemaType(name = "anySimpleType")
    protected String printQuality;
    @XmlAttribute(name = "Center")
    protected Boolean center;
    @XmlAttribute(name = "PosterOverlap")
    protected List<Double> posterOverlaps;
    @XmlAttribute(name = "Poster")
    protected List<Double> posters;
    @XmlAttribute(name = "PDFInterpretingParamsRef")
    @XmlIDREF
    protected Object pdfInterpretingParamsRef;
    @XmlAttribute(name = "MediaRef")
    @XmlIDREF
    protected Object mediaRef;

    /**
     * Gets the value of the objectResolutions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectResolutions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectResolutions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectResolution }
     * 
     * 
     */
    public List<ObjectResolution> getObjectResolutions() {
        if (objectResolutions == null) {
            objectResolutions = new ArrayList<ObjectResolution>();
        }
        return this.objectResolutions;
    }

    /**
     * Gets the value of the fitPolicies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fitPolicies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFitPolicies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FitPolicy }
     * 
     * 
     */
    public List<FitPolicy> getFitPolicies() {
        if (fitPolicies == null) {
            fitPolicies = new ArrayList<FitPolicy>();
        }
        return this.fitPolicies;
    }

    /**
     * Gets the value of the scalings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scalings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScalings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getScalings() {
        if (scalings == null) {
            scalings = new ArrayList<Double>();
        }
        return this.scalings;
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
     * Gets the value of the scalingOrigins property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scalingOrigins property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScalingOrigins().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getScalingOrigins() {
        if (scalingOrigins == null) {
            scalingOrigins = new ArrayList<Double>();
        }
        return this.scalingOrigins;
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
     * Gets the value of the posterOverlaps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the posterOverlaps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPosterOverlaps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getPosterOverlaps() {
        if (posterOverlaps == null) {
            posterOverlaps = new ArrayList<Double>();
        }
        return this.posterOverlaps;
    }

    /**
     * Gets the value of the posters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the posters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPosters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getPosters() {
        if (posters == null) {
            posters = new ArrayList<Double>();
        }
        return this.posters;
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
