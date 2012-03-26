
package org.cip4.lib.xjdf.schema.jdf;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StitchingParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StitchingParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;attribute name="NumberOfStitches" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="StitchPositions" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="StitchWidth" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="StitchOrigin" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="WireGauge" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="StapleShape" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Angle" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="StitchType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Offset" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="WireBrand" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StitchingParams")
public class StitchingParams
    extends ParameterType
    implements Serializable
{

    @XmlAttribute(name = "NumberOfStitches")
    protected Integer numberOfStitches;
    @XmlAttribute(name = "StitchPositions")
    protected String stitchPositions;
    @XmlAttribute(name = "StitchWidth")
    protected Double stitchWidth;
    @XmlAttribute(name = "StitchOrigin")
    @XmlSchemaType(name = "anySimpleType")
    protected String stitchOrigin;
    @XmlAttribute(name = "WireGauge")
    protected Double wireGauge;
    @XmlAttribute(name = "StapleShape")
    @XmlSchemaType(name = "anySimpleType")
    protected String stapleShape;
    @XmlAttribute(name = "Angle")
    protected Double angle;
    @XmlAttribute(name = "StitchType")
    @XmlSchemaType(name = "anySimpleType")
    protected String stitchType;
    @XmlAttribute(name = "Offset")
    protected Double offset;
    @XmlAttribute(name = "WireBrand")
    protected String wireBrand;

    /**
     * Gets the value of the numberOfStitches property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfStitches() {
        return numberOfStitches;
    }

    /**
     * Sets the value of the numberOfStitches property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfStitches(Integer value) {
        this.numberOfStitches = value;
    }

    /**
     * Gets the value of the stitchPositions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStitchPositions() {
        return stitchPositions;
    }

    /**
     * Sets the value of the stitchPositions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStitchPositions(String value) {
        this.stitchPositions = value;
    }

    /**
     * Gets the value of the stitchWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStitchWidth() {
        return stitchWidth;
    }

    /**
     * Sets the value of the stitchWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStitchWidth(Double value) {
        this.stitchWidth = value;
    }

    /**
     * Gets the value of the stitchOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStitchOrigin() {
        return stitchOrigin;
    }

    /**
     * Sets the value of the stitchOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStitchOrigin(String value) {
        this.stitchOrigin = value;
    }

    /**
     * Gets the value of the wireGauge property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWireGauge() {
        return wireGauge;
    }

    /**
     * Sets the value of the wireGauge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWireGauge(Double value) {
        this.wireGauge = value;
    }

    /**
     * Gets the value of the stapleShape property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStapleShape() {
        return stapleShape;
    }

    /**
     * Sets the value of the stapleShape property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStapleShape(String value) {
        this.stapleShape = value;
    }

    /**
     * Gets the value of the angle property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAngle() {
        return angle;
    }

    /**
     * Sets the value of the angle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAngle(Double value) {
        this.angle = value;
    }

    /**
     * Gets the value of the stitchType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStitchType() {
        return stitchType;
    }

    /**
     * Sets the value of the stitchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStitchType(String value) {
        this.stitchType = value;
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
     * Gets the value of the wireBrand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWireBrand() {
        return wireBrand;
    }

    /**
     * Sets the value of the wireBrand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWireBrand(String value) {
        this.wireBrand = value;
    }

}
