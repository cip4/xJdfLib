
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
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}FitPolicy" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}DeviceMark" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ImageShift" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
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
    "imageShifts",
    "deviceMarks",
    "fitPolicies"
})
@XmlRootElement(name = "PageCell")
public class PageCell
    implements Serializable
{

    @XmlElement(name = "ImageShift")
    protected List<ImageShift> imageShifts;
    @XmlElement(name = "DeviceMark")
    protected List<DeviceMark> deviceMarks;
    @XmlElement(name = "FitPolicy")
    protected List<FitPolicy> fitPolicies;
    @XmlAttribute(name = "ClipBox")
    protected List<Double> clipBoxes;
    @XmlAttribute(name = "Rotate")
    @XmlSchemaType(name = "anySimpleType")
    protected String rotate;
    @XmlAttribute(name = "Border")
    protected Double border;
    @XmlAttribute(name = "MarkList")
    protected List<String> markLists;
    @XmlAttribute(name = "TrimSize")
    protected List<Double> trimSizes;
    @XmlAttribute(name = "ColorRef")
    @XmlIDREF
    protected Object colorRef;

    /**
     * Gets the value of the imageShifts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imageShifts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImageShifts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImageShift }
     * 
     * 
     */
    public List<ImageShift> getImageShifts() {
        if (imageShifts == null) {
            imageShifts = new ArrayList<ImageShift>();
        }
        return this.imageShifts;
    }

    /**
     * Gets the value of the deviceMarks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deviceMarks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeviceMarks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceMark }
     * 
     * 
     */
    public List<DeviceMark> getDeviceMarks() {
        if (deviceMarks == null) {
            deviceMarks = new ArrayList<DeviceMark>();
        }
        return this.deviceMarks;
    }

    /**
     * Gets the value of the fitPolicies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fitPolicies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFitPolicies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FitPolicy }
     * 
     * 
     */
    public List<FitPolicy> getFitPolicies() {
        if (fitPolicies == null) {
            fitPolicies = new ArrayList<FitPolicy>();
        }
        return this.fitPolicies;
    }

    /**
     * Gets the value of the clipBoxes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clipBoxes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClipBoxes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getClipBoxes() {
        if (clipBoxes == null) {
            clipBoxes = new ArrayList<Double>();
        }
        return this.clipBoxes;
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
     * Gets the value of the markLists property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the markLists property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarkLists().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMarkLists() {
        if (markLists == null) {
            markLists = new ArrayList<String>();
        }
        return this.markLists;
    }

    /**
     * Gets the value of the trimSizes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trimSizes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrimSizes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getTrimSizes() {
        if (trimSizes == null) {
            trimSizes = new ArrayList<Double>();
        }
        return this.trimSizes;
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
