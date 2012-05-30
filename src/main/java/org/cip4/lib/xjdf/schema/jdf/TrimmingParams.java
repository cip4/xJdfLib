
package org.cip4.lib.xjdf.schema.jdf;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrimmingParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrimmingParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;attribute name="TrimmingOffset" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="Height" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="Width" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="TrimCover" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrimmingParams")
public class TrimmingParams
    extends ParameterType
    implements Serializable
{

    @XmlAttribute(name = "TrimmingOffset")
    protected Double trimmingOffset;
    @XmlAttribute(name = "Height")
    protected Double height;
    @XmlAttribute(name = "Width")
    protected Double width;
    @XmlAttribute(name = "TrimCover")
    @XmlSchemaType(name = "anySimpleType")
    protected String trimCover;

    /**
     * Gets the value of the trimmingOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTrimmingOffset() {
        return trimmingOffset;
    }

    /**
     * Sets the value of the trimmingOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTrimmingOffset(Double value) {
        this.trimmingOffset = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHeight(Double value) {
        this.height = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWidth(Double value) {
        this.width = value;
    }

    /**
     * Gets the value of the trimCover property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrimCover() {
        return trimCover;
    }

    /**
     * Sets the value of the trimCover property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrimCover(String value) {
        this.trimCover = value;
    }

}
