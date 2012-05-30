
package org.cip4.lib.xjdf.schema.jdf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ColorantControl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ColorantControl">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}DeviceNSpace" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ColorSpaceSubstitute" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ColorantAlias" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="ProcessColorModel" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="ForceSeparations" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="ColorRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="ColorantParamsRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="DeviceColorantOrder" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKENS" />
 *       &lt;attribute name="ColorantConvertProcess" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKENS" />
 *       &lt;attribute name="ColorantOrder" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKENS" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ColorantControl", propOrder = {
    "colorantAlias",
    "colorSpaceSubstitutes",
    "deviceNSpaces"
})
public class ColorantControl
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "ColorantAlias")
    protected List<ColorantAlias> colorantAlias;
    @XmlElement(name = "ColorSpaceSubstitute")
    protected List<ColorSpaceSubstitute> colorSpaceSubstitutes;
    @XmlElement(name = "DeviceNSpace")
    protected List<DeviceNSpace> deviceNSpaces;
    @XmlAttribute(name = "ProcessColorModel")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String processColorModel;
    @XmlAttribute(name = "ForceSeparations")
    protected Boolean forceSeparations;
    @XmlAttribute(name = "ColorRef")
    @XmlIDREF
    protected Object colorRef;
    @XmlAttribute(name = "ColorantParamsRef")
    @XmlIDREF
    protected Object colorantParamsRef;
    @XmlAttribute(name = "DeviceColorantOrder")
    protected List<String> deviceColorantOrders;
    @XmlAttribute(name = "ColorantConvertProcess")
    protected List<String> colorantConvertProcesses;
    @XmlAttribute(name = "ColorantOrder")
    protected List<String> colorantOrders;

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
     * Gets the value of the colorSpaceSubstitutes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the colorSpaceSubstitutes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColorSpaceSubstitutes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ColorSpaceSubstitute }
     * 
     * 
     */
    public List<ColorSpaceSubstitute> getColorSpaceSubstitutes() {
        if (colorSpaceSubstitutes == null) {
            colorSpaceSubstitutes = new ArrayList<ColorSpaceSubstitute>();
        }
        return this.colorSpaceSubstitutes;
    }

    /**
     * Gets the value of the deviceNSpaces property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deviceNSpaces property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeviceNSpaces().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceNSpace }
     * 
     * 
     */
    public List<DeviceNSpace> getDeviceNSpaces() {
        if (deviceNSpaces == null) {
            deviceNSpaces = new ArrayList<DeviceNSpace>();
        }
        return this.deviceNSpaces;
    }

    /**
     * Gets the value of the processColorModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessColorModel() {
        return processColorModel;
    }

    /**
     * Sets the value of the processColorModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessColorModel(String value) {
        this.processColorModel = value;
    }

    /**
     * Gets the value of the forceSeparations property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getForceSeparations() {
        return forceSeparations;
    }

    /**
     * Sets the value of the forceSeparations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForceSeparations(Boolean value) {
        this.forceSeparations = value;
    }

    /**
     * Gets the value of the colorRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getColorRef() {
        return colorRef;
    }

    /**
     * Sets the value of the colorRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setColorRef(Object value) {
        this.colorRef = value;
    }

    /**
     * Gets the value of the colorantParamsRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getColorantParamsRef() {
        return colorantParamsRef;
    }

    /**
     * Sets the value of the colorantParamsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setColorantParamsRef(Object value) {
        this.colorantParamsRef = value;
    }

    /**
     * Gets the value of the deviceColorantOrders property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deviceColorantOrders property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeviceColorantOrders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDeviceColorantOrders() {
        if (deviceColorantOrders == null) {
            deviceColorantOrders = new ArrayList<String>();
        }
        return this.deviceColorantOrders;
    }

    /**
     * Gets the value of the colorantConvertProcesses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the colorantConvertProcesses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColorantConvertProcesses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getColorantConvertProcesses() {
        if (colorantConvertProcesses == null) {
            colorantConvertProcesses = new ArrayList<String>();
        }
        return this.colorantConvertProcesses;
    }

    /**
     * Gets the value of the colorantOrders property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the colorantOrders property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColorantOrders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getColorantOrders() {
        if (colorantOrders == null) {
            colorantOrders = new ArrayList<String>();
        }
        return this.colorantOrders;
    }

}
