
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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ElementColorParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElementColorParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ColorSpaceConversionOp" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ColorantAlias" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ICCOutputProfileUsage" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ColorManagementSystem" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="FileSpecRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="AutomatedOverPrintParamsRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElementColorParams", propOrder = {
    "colorSpaceConversionOp",
    "colorantAlias"
})
public class ElementColorParams
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "ColorSpaceConversionOp")
    protected List<ColorSpaceConversionOp> colorSpaceConversionOp;
    @XmlElement(name = "ColorantAlias")
    protected List<ColorantAlias> colorantAlias;
    @XmlAttribute(name = "ICCOutputProfileUsage")
    @XmlSchemaType(name = "anySimpleType")
    protected String iccOutputProfileUsage;
    @XmlAttribute(name = "ColorManagementSystem")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String colorManagementSystem;
    @XmlAttribute(name = "FileSpecRef")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IDREF.class)
    protected org.cip4.lib.xjdf.type.IDREF fileSpecRef;
    @XmlAttribute(name = "AutomatedOverPrintParamsRef")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IDREF.class)
    protected org.cip4.lib.xjdf.type.IDREF automatedOverPrintParamsRef;

    /**
     * Gets the value of the colorSpaceConversionOp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the colorSpaceConversionOp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColorSpaceConversionOp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ColorSpaceConversionOp }
     * 
     * 
     */
    public List<ColorSpaceConversionOp> getColorSpaceConversionOp() {
        if (colorSpaceConversionOp == null) {
            colorSpaceConversionOp = new ArrayList<ColorSpaceConversionOp>();
        }
        return this.colorSpaceConversionOp;
    }

    /**
     * Gets the value of the colorantAlias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the colorantAlias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColorantAlias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ColorantAlias }
     * 
     * 
     */
    public List<ColorantAlias> getColorantAlias() {
        if (colorantAlias == null) {
            colorantAlias = new ArrayList<ColorantAlias>();
        }
        return this.colorantAlias;
    }

    /**
     * Gets the value of the iccOutputProfileUsage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getICCOutputProfileUsage() {
        return iccOutputProfileUsage;
    }

    /**
     * Sets the value of the iccOutputProfileUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setICCOutputProfileUsage(String value) {
        this.iccOutputProfileUsage = value;
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
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.IDREF getFileSpecRef() {
        return fileSpecRef;
    }

    /**
     * Sets the value of the fileSpecRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileSpecRef(org.cip4.lib.xjdf.type.IDREF value) {
        this.fileSpecRef = value;
    }

    /**
     * Gets the value of the automatedOverPrintParamsRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.IDREF getAutomatedOverPrintParamsRef() {
        return automatedOverPrintParamsRef;
    }

    /**
     * Sets the value of the automatedOverPrintParamsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutomatedOverPrintParamsRef(org.cip4.lib.xjdf.type.IDREF value) {
        this.automatedOverPrintParamsRef = value;
    }

}
