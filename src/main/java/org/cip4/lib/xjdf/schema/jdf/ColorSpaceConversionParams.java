
package org.cip4.lib.xjdf.schema.jdf;

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
 * <p>Java class for ColorSpaceConversionParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ColorSpaceConversionParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ColorSpaceConversionOp" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="ICCProfileUsage" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ColorManagementSystem" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="FileSpecRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ColorSpaceConversionParams", propOrder = {
    "colorSpaceConversionOps"
})
public class ColorSpaceConversionParams
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "ColorSpaceConversionOp")
    protected List<ColorSpaceConversionOp> colorSpaceConversionOps;
    @XmlAttribute(name = "ICCProfileUsage")
    @XmlSchemaType(name = "anySimpleType")
    protected String iccProfileUsage;
    @XmlAttribute(name = "ColorManagementSystem")
    protected String colorManagementSystem;
    @XmlAttribute(name = "FileSpecRef")
    @XmlIDREF
    protected Object fileSpecRef;

    /**
     * Gets the value of the colorSpaceConversionOps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the colorSpaceConversionOps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColorSpaceConversionOps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ColorSpaceConversionOp }
     * 
     * 
     */
    public List<ColorSpaceConversionOp> getColorSpaceConversionOps() {
        if (colorSpaceConversionOps == null) {
            colorSpaceConversionOps = new ArrayList<ColorSpaceConversionOp>();
        }
        return this.colorSpaceConversionOps;
    }

    /**
     * Gets the value of the iccProfileUsage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getICCProfileUsage() {
        return iccProfileUsage;
    }

    /**
     * Sets the value of the iccProfileUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setICCProfileUsage(String value) {
        this.iccProfileUsage = value;
    }

    /**
     * Gets the value of the colorManagementSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorManagementSystem() {
        return colorManagementSystem;
    }

    /**
     * Sets the value of the colorManagementSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorManagementSystem(String value) {
        this.colorManagementSystem = value;
    }

    /**
     * Gets the value of the fileSpecRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFileSpecRef() {
        return fileSpecRef;
    }

    /**
     * Sets the value of the fileSpecRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFileSpecRef(Object value) {
        this.fileSpecRef = value;
    }

}
