
package org.cip4.lib.xjdf.schema.jdf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
    protected List<Double> relativeWorkingPaths;
    @XmlAttribute(name = "MeltingTemperature")
    protected Integer meltingTemperature;
    @XmlAttribute(name = "RelativeStartPosition")
    protected List<Double> relativeStartPositions;
    @XmlAttribute(name = "GlueType")
    @XmlSchemaType(name = "anySimpleType")
    protected String glueType;
    @XmlAttribute(name = "GlueLineWidth")
    protected Double glueLineWidth;
    @XmlAttribute(name = "StartPosition")
    protected List<Double> startPositions;
    @XmlAttribute(name = "AreaGlue")
    protected Boolean areaGlue;
    @XmlAttribute(name = "GluingPattern")
    protected List<Double> gluingPatterns;
    @XmlAttribute(name = "WorkingPath")
    protected List<Double> workingPaths;

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
     * Gets the value of the relativeWorkingPaths property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relativeWorkingPaths property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelativeWorkingPaths().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getRelativeWorkingPaths() {
        if (relativeWorkingPaths == null) {
            relativeWorkingPaths = new ArrayList<Double>();
        }
        return this.relativeWorkingPaths;
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
     * Gets the value of the relativeStartPositions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relativeStartPositions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelativeStartPositions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getRelativeStartPositions() {
        if (relativeStartPositions == null) {
            relativeStartPositions = new ArrayList<Double>();
        }
        return this.relativeStartPositions;
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
     * Gets the value of the startPositions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the startPositions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStartPositions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getStartPositions() {
        if (startPositions == null) {
            startPositions = new ArrayList<Double>();
        }
        return this.startPositions;
    }

    /**
     * Gets the value of the areaGlue property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAreaGlue() {
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
     * Gets the value of the gluingPatterns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gluingPatterns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGluingPatterns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getGluingPatterns() {
        if (gluingPatterns == null) {
            gluingPatterns = new ArrayList<Double>();
        }
        return this.gluingPatterns;
    }

    /**
     * Gets the value of the workingPaths property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workingPaths property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkingPaths().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getWorkingPaths() {
        if (workingPaths == null) {
            workingPaths = new ArrayList<Double>();
        }
        return this.workingPaths;
    }

}
