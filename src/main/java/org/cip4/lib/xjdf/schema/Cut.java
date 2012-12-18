
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
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
 *       &lt;attribute name="RelativeWorkingPath" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="StartPosition" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="CutWidth" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="WorkingPath" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="RelativeStartPosition" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="WorkingDirection" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Cut")
public class Cut
    implements Serializable
{

    @XmlAttribute(name = "RelativeWorkingPath")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.XYPair.class)
    protected org.cip4.lib.xjdf.type.XYPair relativeWorkingPath;
    @XmlAttribute(name = "StartPosition")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.XYPair.class)
    protected org.cip4.lib.xjdf.type.XYPair startPosition;
    @XmlAttribute(name = "CutWidth")
    protected Double cutWidth;
    @XmlAttribute(name = "WorkingPath")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.XYPair.class)
    protected org.cip4.lib.xjdf.type.XYPair workingPath;
    @XmlAttribute(name = "RelativeStartPosition")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.XYPair.class)
    protected org.cip4.lib.xjdf.type.XYPair relativeStartPosition;
    @XmlAttribute(name = "WorkingDirection")
    @XmlSchemaType(name = "anySimpleType")
    protected String workingDirection;

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
     * Gets the value of the cutWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCutWidth() {
        return cutWidth;
    }

    /**
     * Sets the value of the cutWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCutWidth(Double value) {
        this.cutWidth = value;
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
     * Gets the value of the workingDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkingDirection() {
        return workingDirection;
    }

    /**
     * Sets the value of the workingDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkingDirection(String value) {
        this.workingDirection = value;
    }

}
