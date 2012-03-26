
package org.cip4.lib.xjdf.schema.jdf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="QuantTable" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="SourceCSs">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.CIP4.org/JDFSchema_2_0}EnumSourceCSs" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="HuffTable" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="HSamples" type="{http://www.CIP4.org/JDFSchema_2_0}IntegerList" />
 *       &lt;attribute name="VSamples" type="{http://www.CIP4.org/JDFSchema_2_0}IntegerList" />
 *       &lt;attribute name="ColorTransform" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="QFactor" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "DCTParams")
public class DCTParams
    implements Serializable
{

    @XmlAttribute(name = "QuantTable")
    protected String quantTable;
    @XmlAttribute(name = "SourceCSs")
    protected List<EnumSourceCSs> sourceCsses;
    @XmlAttribute(name = "HuffTable")
    protected String huffTable;
    @XmlAttribute(name = "HSamples")
    protected List<Integer> hSamples;
    @XmlAttribute(name = "VSamples")
    protected List<Integer> vSamples;
    @XmlAttribute(name = "ColorTransform")
    @XmlSchemaType(name = "anySimpleType")
    protected String colorTransform;
    @XmlAttribute(name = "QFactor")
    protected Double qFactor;

    /**
     * Gets the value of the quantTable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantTable() {
        return quantTable;
    }

    /**
     * Sets the value of the quantTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantTable(String value) {
        this.quantTable = value;
    }

    /**
     * Gets the value of the sourceCsses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceCsses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceCsses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnumSourceCSs }
     * 
     * 
     */
    public List<EnumSourceCSs> getSourceCsses() {
        if (sourceCsses == null) {
            sourceCsses = new ArrayList<EnumSourceCSs>();
        }
        return this.sourceCsses;
    }

    /**
     * Gets the value of the huffTable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHuffTable() {
        return huffTable;
    }

    /**
     * Sets the value of the huffTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHuffTable(String value) {
        this.huffTable = value;
    }

    /**
     * Gets the value of the hSamples property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hSamples property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHSamples().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getHSamples() {
        if (hSamples == null) {
            hSamples = new ArrayList<Integer>();
        }
        return this.hSamples;
    }

    /**
     * Gets the value of the vSamples property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vSamples property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVSamples().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getVSamples() {
        if (vSamples == null) {
            vSamples = new ArrayList<Integer>();
        }
        return this.vSamples;
    }

    /**
     * Gets the value of the colorTransform property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorTransform() {
        return colorTransform;
    }

    /**
     * Sets the value of the colorTransform property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorTransform(String value) {
        this.colorTransform = value;
    }

    /**
     * Gets the value of the qFactor property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQFactor() {
        return qFactor;
    }

    /**
     * Sets the value of the qFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQFactor(Double value) {
        this.qFactor = value;
    }

}
