
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for BarcodeReproParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BarcodeReproParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;attribute name="Magnification" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="ModuleHeight" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="Height" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="Masking" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ModuleWidth" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="Ratio" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="BearerBars" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="BarcodeCompParamsRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BarcodeReproParams")
public class BarcodeReproParams
    extends ParameterType
    implements Serializable
{

    @XmlAttribute(name = "Magnification")
    protected Double magnification;
    @XmlAttribute(name = "ModuleHeight")
    protected Double moduleHeight;
    @XmlAttribute(name = "Height")
    protected Double height;
    @XmlAttribute(name = "Masking")
    @XmlSchemaType(name = "anySimpleType")
    protected String masking;
    @XmlAttribute(name = "ModuleWidth")
    protected Double moduleWidth;
    @XmlAttribute(name = "Ratio")
    protected Double ratio;
    @XmlAttribute(name = "BearerBars")
    @XmlSchemaType(name = "anySimpleType")
    protected String bearerBars;
    @XmlAttribute(name = "BarcodeCompParamsRef")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IDREF.class)
    protected org.cip4.lib.xjdf.type.IDREF barcodeCompParamsRef;

    /**
     * Gets the value of the magnification property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMagnification() {
        return magnification;
    }

    /**
     * Sets the value of the magnification property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMagnification(Double value) {
        this.magnification = value;
    }

    /**
     * Gets the value of the moduleHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getModuleHeight() {
        return moduleHeight;
    }

    /**
     * Sets the value of the moduleHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setModuleHeight(Double value) {
        this.moduleHeight = value;
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
     * Gets the value of the masking property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasking() {
        return masking;
    }

    /**
     * Sets the value of the masking property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasking(String value) {
        this.masking = value;
    }

    /**
     * Gets the value of the moduleWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getModuleWidth() {
        return moduleWidth;
    }

    /**
     * Sets the value of the moduleWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setModuleWidth(Double value) {
        this.moduleWidth = value;
    }

    /**
     * Gets the value of the ratio property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRatio() {
        return ratio;
    }

    /**
     * Sets the value of the ratio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRatio(Double value) {
        this.ratio = value;
    }

    /**
     * Gets the value of the bearerBars property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBearerBars() {
        return bearerBars;
    }

    /**
     * Sets the value of the bearerBars property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBearerBars(String value) {
        this.bearerBars = value;
    }

    /**
     * Gets the value of the barcodeCompParamsRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.IDREF getBarcodeCompParamsRef() {
        return barcodeCompParamsRef;
    }

    /**
     * Sets the value of the barcodeCompParamsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarcodeCompParamsRef(org.cip4.lib.xjdf.type.IDREF value) {
        this.barcodeCompParamsRef = value;
    }

}
