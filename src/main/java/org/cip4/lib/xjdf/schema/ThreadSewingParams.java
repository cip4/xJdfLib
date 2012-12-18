
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ThreadSewingParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThreadSewingParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}GlueLine" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="ThreadBrand" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="Sealing" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="CastingMaterial" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CoreMaterial" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NumberOfNeedles" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="BlindStitch" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="NeedlePositions" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="GlueLineRefSheets" type="{http://www.CIP4.org/JDFSchema_2_0}IntegerList" />
 *       &lt;attribute name="Offset" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="ThreadThickness" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="SewingPattern" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThreadSewingParams", propOrder = {
    "glueLine"
})
public class ThreadSewingParams
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "GlueLine")
    protected List<GlueLine> glueLine;
    @XmlAttribute(name = "ThreadBrand")
    protected String threadBrand;
    @XmlAttribute(name = "Sealing")
    protected Boolean sealing;
    @XmlAttribute(name = "CastingMaterial")
    @XmlSchemaType(name = "anySimpleType")
    protected String castingMaterial;
    @XmlAttribute(name = "CoreMaterial")
    @XmlSchemaType(name = "anySimpleType")
    protected String coreMaterial;
    @XmlAttribute(name = "NumberOfNeedles")
    protected Integer numberOfNeedles;
    @XmlAttribute(name = "BlindStitch")
    protected Boolean blindStitch;
    @XmlAttribute(name = "NeedlePositions")
    protected String needlePositions;
    @XmlAttribute(name = "GlueLineRefSheets")
    protected List<Integer> glueLineRefSheets;
    @XmlAttribute(name = "Offset")
    protected Double offset;
    @XmlAttribute(name = "ThreadThickness")
    protected Double threadThickness;
    @XmlAttribute(name = "SewingPattern")
    @XmlSchemaType(name = "anySimpleType")
    protected String sewingPattern;

    /**
     * Gets the value of the glueLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the glueLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGlueLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GlueLine }
     * 
     * 
     */
    public List<GlueLine> getGlueLine() {
        if (glueLine == null) {
            glueLine = new ArrayList<GlueLine>();
        }
        return this.glueLine;
    }

    /**
     * Gets the value of the threadBrand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThreadBrand() {
        return threadBrand;
    }

    /**
     * Sets the value of the threadBrand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThreadBrand(String value) {
        this.threadBrand = value;
    }

    /**
     * Gets the value of the sealing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSealing() {
        return sealing;
    }

    /**
     * Sets the value of the sealing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSealing(Boolean value) {
        this.sealing = value;
    }

    /**
     * Gets the value of the castingMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCastingMaterial() {
        return castingMaterial;
    }

    /**
     * Sets the value of the castingMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCastingMaterial(String value) {
        this.castingMaterial = value;
    }

    /**
     * Gets the value of the coreMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoreMaterial() {
        return coreMaterial;
    }

    /**
     * Sets the value of the coreMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoreMaterial(String value) {
        this.coreMaterial = value;
    }

    /**
     * Gets the value of the numberOfNeedles property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfNeedles() {
        return numberOfNeedles;
    }

    /**
     * Sets the value of the numberOfNeedles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfNeedles(Integer value) {
        this.numberOfNeedles = value;
    }

    /**
     * Gets the value of the blindStitch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBlindStitch() {
        return blindStitch;
    }

    /**
     * Sets the value of the blindStitch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBlindStitch(Boolean value) {
        this.blindStitch = value;
    }

    /**
     * Gets the value of the needlePositions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNeedlePositions() {
        return needlePositions;
    }

    /**
     * Sets the value of the needlePositions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNeedlePositions(String value) {
        this.needlePositions = value;
    }

    /**
     * Gets the value of the glueLineRefSheets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the glueLineRefSheets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGlueLineRefSheets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getGlueLineRefSheets() {
        if (glueLineRefSheets == null) {
            glueLineRefSheets = new ArrayList<Integer>();
        }
        return this.glueLineRefSheets;
    }

    /**
     * Gets the value of the offset property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOffset(Double value) {
        this.offset = value;
    }

    /**
     * Gets the value of the threadThickness property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getThreadThickness() {
        return threadThickness;
    }

    /**
     * Sets the value of the threadThickness property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setThreadThickness(Double value) {
        this.threadThickness = value;
    }

    /**
     * Gets the value of the sewingPattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSewingPattern() {
        return sewingPattern;
    }

    /**
     * Sets the value of the sewingPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSewingPattern(String value) {
        this.sewingPattern = value;
    }

}
