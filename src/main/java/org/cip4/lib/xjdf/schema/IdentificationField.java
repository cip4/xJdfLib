
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for IdentificationField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdentificationField">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;attribute name="Purpose" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Position" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="EncodingDetails" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="BoundingBox" type="{http://www.CIP4.org/JDFSchema_2_0}rectangle" />
 *       &lt;attribute name="ValueFormat" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="Orientation" type="{http://www.CIP4.org/JDFSchema_2_0}matrix" />
 *       &lt;attribute name="PurposeDetails" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="Value" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="Page" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="ValueTemplate" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="Encoding" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Format" type="{http://www.CIP4.org/JDFSchema_2_0}Any" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentificationField")
public class IdentificationField
    extends ParameterType
    implements Serializable
{

    @XmlAttribute(name = "Purpose")
    @XmlSchemaType(name = "anySimpleType")
    protected String purpose;
    @XmlAttribute(name = "Position")
    @XmlSchemaType(name = "anySimpleType")
    protected String position;
    @XmlAttribute(name = "EncodingDetails")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String encodingDetails;
    @XmlAttribute(name = "BoundingBox")
    protected List<Double> boundingBoxes;
    @XmlAttribute(name = "ValueFormat")
    protected String valueFormat;
    @XmlAttribute(name = "Orientation")
    protected List<Double> orientations;
    @XmlAttribute(name = "PurposeDetails")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String purposeDetails;
    @XmlAttribute(name = "Value")
    protected String value;
    @XmlAttribute(name = "Page")
    protected Integer page;
    @XmlAttribute(name = "ValueTemplate")
    protected String valueTemplate;
    @XmlAttribute(name = "Encoding")
    @XmlSchemaType(name = "anySimpleType")
    protected String encoding;
    @XmlAttribute(name = "Format")
    protected String format;

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurpose(String value) {
        this.purpose = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosition(String value) {
        this.position = value;
    }

    /**
     * Gets the value of the encodingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncodingDetails() {
        return encodingDetails;
    }

    /**
     * Sets the value of the encodingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncodingDetails(String value) {
        this.encodingDetails = value;
    }

    /**
     * Gets the value of the boundingBoxes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the boundingBoxes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoundingBoxes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getBoundingBoxes() {
        if (boundingBoxes == null) {
            boundingBoxes = new ArrayList<Double>();
        }
        return this.boundingBoxes;
    }

    /**
     * Gets the value of the valueFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueFormat() {
        return valueFormat;
    }

    /**
     * Sets the value of the valueFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueFormat(String value) {
        this.valueFormat = value;
    }

    /**
     * Gets the value of the orientations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orientations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrientations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getOrientations() {
        if (orientations == null) {
            orientations = new ArrayList<Double>();
        }
        return this.orientations;
    }

    /**
     * Gets the value of the purposeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurposeDetails() {
        return purposeDetails;
    }

    /**
     * Sets the value of the purposeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurposeDetails(String value) {
        this.purposeDetails = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the page property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPage() {
        return page;
    }

    /**
     * Sets the value of the page property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPage(Integer value) {
        this.page = value;
    }

    /**
     * Gets the value of the valueTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueTemplate() {
        return valueTemplate;
    }

    /**
     * Sets the value of the valueTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueTemplate(String value) {
        this.valueTemplate = value;
    }

    /**
     * Gets the value of the encoding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncoding() {
        return encoding;
    }

    /**
     * Sets the value of the encoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncoding(String value) {
        this.encoding = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

}
