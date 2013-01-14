
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
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
 *       &lt;sequence>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}FitPolicy" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}DeviceMark" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ImageShift" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ClipBox" type="{http://www.CIP4.org/JDFSchema_2_0}rectangle" />
 *       &lt;attribute name="Rotate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Border" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="MarkList" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKENS" />
 *       &lt;attribute name="TrimSize" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="ColorRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fitPolicy",
    "deviceMark",
    "imageShift"
})
@XmlRootElement(name = "PageCell")
public class PageCell
    implements Serializable
{

    @XmlElement(name = "FitPolicy")
    protected List<FitPolicy> fitPolicy;
    @XmlElement(name = "DeviceMark")
    protected List<DeviceMark> deviceMark;
    @XmlElement(name = "ImageShift")
    protected List<ImageShift> imageShift;
    @XmlAttribute(name = "ClipBox")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.Rectangle.class)
    protected org.cip4.lib.xjdf.type.Rectangle clipBox;
    @XmlAttribute(name = "Rotate")
    @XmlSchemaType(name = "anySimpleType")
    protected String rotate;
    @XmlAttribute(name = "Border")
    protected Double border;
    @XmlAttribute(name = "MarkList")
    protected List<String> markList;
    @XmlAttribute(name = "TrimSize")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.XYPair.class)
    protected org.cip4.lib.xjdf.type.XYPair trimSize;
    @XmlAttribute(name = "ColorRef")
    @XmlIDREF
    protected Object colorRef;

    /**
     * Gets the value of the fitPolicy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fitPolicy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFitPolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FitPolicy }
     * 
     * 
     */
    public List<FitPolicy> getFitPolicy() {
        if (fitPolicy == null) {
            fitPolicy = new ArrayList<FitPolicy>();
        }
        return this.fitPolicy;
    }

    /**
     * Gets the value of the deviceMark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deviceMark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeviceMark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceMark }
     * 
     * 
     */
    public List<DeviceMark> getDeviceMark() {
        if (deviceMark == null) {
            deviceMark = new ArrayList<DeviceMark>();
        }
        return this.deviceMark;
    }

    /**
     * Gets the value of the imageShift property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imageShift property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImageShift().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImageShift }
     * 
     * 
     */
    public List<ImageShift> getImageShift() {
        if (imageShift == null) {
            imageShift = new ArrayList<ImageShift>();
        }
        return this.imageShift;
    }

    /**
     * Gets the value of the clipBox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.Rectangle getClipBox() {
        return clipBox;
    }

    /**
     * Sets the value of the clipBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClipBox(org.cip4.lib.xjdf.type.Rectangle value) {
        this.clipBox = value;
    }

    /**
     * Gets the value of the rotate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRotate() {
        return rotate;
    }

    /**
     * Sets the value of the rotate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRotate(String value) {
        this.rotate = value;
    }

    /**
     * Gets the value of the border property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBorder() {
        return border;
    }

    /**
     * Sets the value of the border property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBorder(Double value) {
        this.border = value;
    }

    /**
     * Gets the value of the markList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the markList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarkList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMarkList() {
        if (markList == null) {
            markList = new ArrayList<String>();
        }
        return this.markList;
    }

    /**
     * Gets the value of the trimSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.XYPair getTrimSize() {
        return trimSize;
    }

    /**
     * Sets the value of the trimSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrimSize(org.cip4.lib.xjdf.type.XYPair value) {
        this.trimSize = value;
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

}
