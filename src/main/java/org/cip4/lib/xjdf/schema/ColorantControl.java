
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}DeviceNSpace" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ColorSpaceSubstitute" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ColorantAlias" maxOccurs="unbounded" minOccurs="0"/>
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
    "deviceNSpace",
    "colorSpaceSubstitute",
    "colorantAlias"
})
public class ColorantControl
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "DeviceNSpace")
    protected List<DeviceNSpace> deviceNSpace;
    @XmlElement(name = "ColorSpaceSubstitute")
    protected List<ColorSpaceSubstitute> colorSpaceSubstitute;
    @XmlElement(name = "ColorantAlias")
    protected List<ColorantAlias> colorantAlias;
    @XmlAttribute(name = "ProcessColorModel")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String processColorModel;
    @XmlAttribute(name = "ForceSeparations")
    protected Boolean forceSeparations;
    @XmlAttribute(name = "ColorRef")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IDREF.class)
    protected org.cip4.lib.xjdf.type.IDREF colorRef;
    @XmlAttribute(name = "ColorantParamsRef")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IDREF.class)
    protected org.cip4.lib.xjdf.type.IDREF colorantParamsRef;
    @XmlAttribute(name = "DeviceColorantOrder")
    protected List<String> deviceColorantOrder;
    @XmlAttribute(name = "ColorantConvertProcess")
    protected List<String> colorantConvertProcess;
    @XmlAttribute(name = "ColorantOrder")
    protected List<String> colorantOrder;

    /**
     * Gets the value of the deviceNSpace property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deviceNSpace property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeviceNSpace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceNSpace }
     * 
     * 
     */
    public List<DeviceNSpace> getDeviceNSpace() {
        if (deviceNSpace == null) {
            deviceNSpace = new ArrayList<DeviceNSpace>();
        }
        return this.deviceNSpace;
    }

    /**
     * Gets the value of the colorSpaceSubstitute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the colorSpaceSubstitute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColorSpaceSubstitute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ColorSpaceSubstitute }
     * 
     * 
     */
    public List<ColorSpaceSubstitute> getColorSpaceSubstitute() {
        if (colorSpaceSubstitute == null) {
            colorSpaceSubstitute = new ArrayList<ColorSpaceSubstitute>();
        }
        return this.colorSpaceSubstitute;
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
    public Boolean isForceSeparations() {
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
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.IDREF getColorRef() {
        return colorRef;
    }

    /**
     * Sets the value of the colorRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorRef(org.cip4.lib.xjdf.type.IDREF value) {
        this.colorRef = value;
    }

    /**
     * Gets the value of the colorantParamsRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.IDREF getColorantParamsRef() {
        return colorantParamsRef;
    }

    /**
     * Sets the value of the colorantParamsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorantParamsRef(org.cip4.lib.xjdf.type.IDREF value) {
        this.colorantParamsRef = value;
    }

    /**
     * Gets the value of the deviceColorantOrder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deviceColorantOrder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeviceColorantOrder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDeviceColorantOrder() {
        if (deviceColorantOrder == null) {
            deviceColorantOrder = new ArrayList<String>();
        }
        return this.deviceColorantOrder;
    }

    /**
     * Gets the value of the colorantConvertProcess property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the colorantConvertProcess property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColorantConvertProcess().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getColorantConvertProcess() {
        if (colorantConvertProcess == null) {
            colorantConvertProcess = new ArrayList<String>();
        }
        return this.colorantConvertProcess;
    }

    /**
     * Gets the value of the colorantOrder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the colorantOrder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColorantOrder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getColorantOrder() {
        if (colorantOrder == null) {
            colorantOrder = new ArrayList<String>();
        }
        return this.colorantOrder;
    }

}
