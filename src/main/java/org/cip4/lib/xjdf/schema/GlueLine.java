
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for GlueLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlueLine">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;attribute name="GlueBrand" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="RelativeWorkingPath" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="MeltingTemperature" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="RelativeStartPosition" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="GlueType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="GlueLineWidth" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="StartPosition" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="AreaGlue" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="GluingPattern" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="WorkingPath" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlueLine")
public class GlueLine
    extends ParameterType
    implements Serializable
{

    @XmlAttribute(name = "GlueBrand")
    protected String glueBrand;
    @XmlAttribute(name = "RelativeWorkingPath")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.XYPair.class)
    protected org.cip4.lib.xjdf.type.XYPair relativeWorkingPath;
    @XmlAttribute(name = "MeltingTemperature")
    protected Integer meltingTemperature;
    @XmlAttribute(name = "RelativeStartPosition")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.XYPair.class)
    protected org.cip4.lib.xjdf.type.XYPair relativeStartPosition;
    @XmlAttribute(name = "GlueType")
    @XmlSchemaType(name = "anySimpleType")
    protected String glueType;
    @XmlAttribute(name = "GlueLineWidth")
    protected Double glueLineWidth;
    @XmlAttribute(name = "StartPosition")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.XYPair.class)
    protected org.cip4.lib.xjdf.type.XYPair startPosition;
    @XmlAttribute(name = "AreaGlue")
    protected Boolean areaGlue;
    @XmlAttribute(name = "GluingPattern")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.XYPair.class)
    protected org.cip4.lib.xjdf.type.XYPair gluingPattern;
    @XmlAttribute(name = "WorkingPath")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.XYPair.class)
    protected org.cip4.lib.xjdf.type.XYPair workingPath;

    /**
     * Gets the value of the glueBrand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlueBrand() {
        return glueBrand;
    }

    /**
     * Sets the value of the glueBrand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlueBrand(String value) {
        this.glueBrand = value;
    }

    /**
     * Gets the value of the relativeWorkingPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.XYPair getRelativeWorkingPath() {
        return relativeWorkingPath;
    }

    /**
     * Sets the value of the relativeWorkingPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelativeWorkingPath(org.cip4.lib.xjdf.type.XYPair value) {
        this.relativeWorkingPath = value;
    }

    /**
     * Gets the value of the meltingTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMeltingTemperature() {
        return meltingTemperature;
    }

    /**
     * Sets the value of the meltingTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMeltingTemperature(Integer value) {
        this.meltingTemperature = value;
    }

    /**
     * Gets the value of the relativeStartPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.XYPair getRelativeStartPosition() {
        return relativeStartPosition;
    }

    /**
     * Sets the value of the relativeStartPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelativeStartPosition(org.cip4.lib.xjdf.type.XYPair value) {
        this.relativeStartPosition = value;
    }

    /**
     * Gets the value of the glueType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlueType() {
        return glueType;
    }

    /**
     * Sets the value of the glueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlueType(String value) {
        this.glueType = value;
    }

    /**
     * Gets the value of the glueLineWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGlueLineWidth() {
        return glueLineWidth;
    }

    /**
     * Sets the value of the glueLineWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGlueLineWidth(Double value) {
        this.glueLineWidth = value;
    }

    /**
     * Gets the value of the startPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.XYPair getStartPosition() {
        return startPosition;
    }

    /**
     * Sets the value of the startPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartPosition(org.cip4.lib.xjdf.type.XYPair value) {
        this.startPosition = value;
    }

    /**
     * Gets the value of the areaGlue property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAreaGlue() {
        return areaGlue;
    }

    /**
     * Sets the value of the areaGlue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAreaGlue(Boolean value) {
        this.areaGlue = value;
    }

    /**
     * Gets the value of the gluingPattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.XYPair getGluingPattern() {
        return gluingPattern;
    }

    /**
     * Sets the value of the gluingPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGluingPattern(org.cip4.lib.xjdf.type.XYPair value) {
        this.gluingPattern = value;
    }

    /**
     * Gets the value of the workingPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.XYPair getWorkingPath() {
        return workingPath;
    }

    /**
     * Sets the value of the workingPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkingPath(org.cip4.lib.xjdf.type.XYPair value) {
        this.workingPath = value;
    }

}
