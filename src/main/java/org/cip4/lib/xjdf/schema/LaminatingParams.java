
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for LaminatingParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LaminatingParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;attribute name="AdhesiveType" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="HardenerType" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="Temperature" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="LaminatingMethod" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NipWidth" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="LaminatingBox" type="{http://www.CIP4.org/JDFSchema_2_0}rectangle" />
 *       &lt;attribute name="ModuleIndex" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="GapList" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LaminatingParams")
public class LaminatingParams
    extends ParameterType
    implements Serializable
{

    @XmlAttribute(name = "AdhesiveType")
    protected String adhesiveType;
    @XmlAttribute(name = "HardenerType")
    protected String hardenerType;
    @XmlAttribute(name = "Temperature")
    protected Double temperature;
    @XmlAttribute(name = "LaminatingMethod")
    @XmlSchemaType(name = "anySimpleType")
    protected String laminatingMethod;
    @XmlAttribute(name = "NipWidth")
    protected Double nipWidth;
    @XmlAttribute(name = "LaminatingBox")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.Rectangle.class)
    protected org.cip4.lib.xjdf.type.Rectangle laminatingBox;
    @XmlAttribute(name = "ModuleIndex")
    protected Integer moduleIndex;
    @XmlAttribute(name = "GapList")
    protected String gapList;

    /**
     * Gets the value of the adhesiveType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdhesiveType() {
        return adhesiveType;
    }

    /**
     * Sets the value of the adhesiveType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdhesiveType(String value) {
        this.adhesiveType = value;
    }

    /**
     * Gets the value of the hardenerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHardenerType() {
        return hardenerType;
    }

    /**
     * Sets the value of the hardenerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHardenerType(String value) {
        this.hardenerType = value;
    }

    /**
     * Gets the value of the temperature property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTemperature() {
        return temperature;
    }

    /**
     * Sets the value of the temperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTemperature(Double value) {
        this.temperature = value;
    }

    /**
     * Gets the value of the laminatingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLaminatingMethod() {
        return laminatingMethod;
    }

    /**
     * Sets the value of the laminatingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLaminatingMethod(String value) {
        this.laminatingMethod = value;
    }

    /**
     * Gets the value of the nipWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNipWidth() {
        return nipWidth;
    }

    /**
     * Sets the value of the nipWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNipWidth(Double value) {
        this.nipWidth = value;
    }

    /**
     * Gets the value of the laminatingBox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.Rectangle getLaminatingBox() {
        return laminatingBox;
    }

    /**
     * Sets the value of the laminatingBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLaminatingBox(org.cip4.lib.xjdf.type.Rectangle value) {
        this.laminatingBox = value;
    }

    /**
     * Gets the value of the moduleIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getModuleIndex() {
        return moduleIndex;
    }

    /**
     * Sets the value of the moduleIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setModuleIndex(Integer value) {
        this.moduleIndex = value;
    }

    /**
     * Gets the value of the gapList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGapList() {
        return gapList;
    }

    /**
     * Sets the value of the gapList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGapList(String value) {
        this.gapList = value;
    }

}
