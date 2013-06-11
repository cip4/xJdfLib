
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for DevelopingParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DevelopingParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;attribute name="PostBakeTime" type="{http://www.CIP4.org/JDFSchema_2_0}duration" />
 *       &lt;attribute name="PostExposeTime" type="{http://www.CIP4.org/JDFSchema_2_0}duration" />
 *       &lt;attribute name="PreHeatTime" type="{http://www.CIP4.org/JDFSchema_2_0}duration" />
 *       &lt;attribute name="PostBakeTemp" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="PreHeatTemp" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevelopingParams")
public class DevelopingParams
    extends ParameterType
    implements Serializable
{

    @XmlAttribute(name = "PostBakeTime")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.Duration.class)
    protected org.cip4.lib.xjdf.type.Duration postBakeTime;
    @XmlAttribute(name = "PostExposeTime")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.Duration.class)
    protected org.cip4.lib.xjdf.type.Duration postExposeTime;
    @XmlAttribute(name = "PreHeatTime")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.Duration.class)
    protected org.cip4.lib.xjdf.type.Duration preHeatTime;
    @XmlAttribute(name = "PostBakeTemp")
    protected Double postBakeTemp;
    @XmlAttribute(name = "PreHeatTemp")
    protected Double preHeatTemp;

    /**
     * Gets the value of the postBakeTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.Duration getPostBakeTime() {
        return postBakeTime;
    }

    /**
     * Sets the value of the postBakeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostBakeTime(org.cip4.lib.xjdf.type.Duration value) {
        this.postBakeTime = value;
    }

    /**
     * Gets the value of the postExposeTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.Duration getPostExposeTime() {
        return postExposeTime;
    }

    /**
     * Sets the value of the postExposeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostExposeTime(org.cip4.lib.xjdf.type.Duration value) {
        this.postExposeTime = value;
    }

    /**
     * Gets the value of the preHeatTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.Duration getPreHeatTime() {
        return preHeatTime;
    }

    /**
     * Sets the value of the preHeatTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreHeatTime(org.cip4.lib.xjdf.type.Duration value) {
        this.preHeatTime = value;
    }

    /**
     * Gets the value of the postBakeTemp property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPostBakeTemp() {
        return postBakeTemp;
    }

    /**
     * Sets the value of the postBakeTemp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPostBakeTemp(Double value) {
        this.postBakeTemp = value;
    }

    /**
     * Gets the value of the preHeatTemp property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPreHeatTemp() {
        return preHeatTemp;
    }

    /**
     * Sets the value of the preHeatTemp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPreHeatTemp(Double value) {
        this.preHeatTemp = value;
    }

}
