
package org.cip4.lib.xjdf.schema.jdf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}TIFFEmbeddedFile" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}TIFFtag" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="WhiteIsZero" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="Segmentation" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ByteOrder" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TileSize" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="RowsPerStrip" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="Interleaving" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="SeparationNameTag" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tifFtags",
    "tiffEmbeddedFiles"
})
@XmlRootElement(name = "TIFFFormatParams")
public class TIFFFormatParams
    implements Serializable
{

    @XmlElement(name = "TIFFtag")
    protected List<TIFFtag> tifFtags;
    @XmlElement(name = "TIFFEmbeddedFile")
    protected List<TIFFEmbeddedFile> tiffEmbeddedFiles;
    @XmlAttribute(name = "WhiteIsZero")
    protected Boolean whiteIsZero;
    @XmlAttribute(name = "Segmentation")
    @XmlSchemaType(name = "anySimpleType")
    protected String segmentation;
    @XmlAttribute(name = "ByteOrder")
    @XmlSchemaType(name = "anySimpleType")
    protected String byteOrder;
    @XmlAttribute(name = "TileSize")
    protected List<Double> tileSizes;
    @XmlAttribute(name = "RowsPerStrip")
    protected Integer rowsPerStrip;
    @XmlAttribute(name = "Interleaving")
    protected Integer interleaving;
    @XmlAttribute(name = "SeparationNameTag")
    protected Integer separationNameTag;

    /**
     * Gets the value of the tifFtags property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tifFtags property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTIFFtags().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TIFFtag }
     * 
     * 
     */
    public List<TIFFtag> getTIFFtags() {
        if (tifFtags == null) {
            tifFtags = new ArrayList<TIFFtag>();
        }
        return this.tifFtags;
    }

    /**
     * Gets the value of the tiffEmbeddedFiles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tiffEmbeddedFiles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTIFFEmbeddedFiles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TIFFEmbeddedFile }
     * 
     * 
     */
    public List<TIFFEmbeddedFile> getTIFFEmbeddedFiles() {
        if (tiffEmbeddedFiles == null) {
            tiffEmbeddedFiles = new ArrayList<TIFFEmbeddedFile>();
        }
        return this.tiffEmbeddedFiles;
    }

    /**
     * Gets the value of the whiteIsZero property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWhiteIsZero() {
        return whiteIsZero;
    }

    /**
     * Sets the value of the whiteIsZero property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWhiteIsZero(Boolean value) {
        this.whiteIsZero = value;
    }

    /**
     * Gets the value of the segmentation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentation() {
        return segmentation;
    }

    /**
     * Sets the value of the segmentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentation(String value) {
        this.segmentation = value;
    }

    /**
     * Gets the value of the byteOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getByteOrder() {
        return byteOrder;
    }

    /**
     * Sets the value of the byteOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setByteOrder(String value) {
        this.byteOrder = value;
    }

    /**
     * Gets the value of the tileSizes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tileSizes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTileSizes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getTileSizes() {
        if (tileSizes == null) {
            tileSizes = new ArrayList<Double>();
        }
        return this.tileSizes;
    }

    /**
     * Gets the value of the rowsPerStrip property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRowsPerStrip() {
        return rowsPerStrip;
    }

    /**
     * Sets the value of the rowsPerStrip property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRowsPerStrip(Integer value) {
        this.rowsPerStrip = value;
    }

    /**
     * Gets the value of the interleaving property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInterleaving() {
        return interleaving;
    }

    /**
     * Sets the value of the interleaving property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInterleaving(Integer value) {
        this.interleaving = value;
    }

    /**
     * Gets the value of the separationNameTag property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSeparationNameTag() {
        return separationNameTag;
    }

    /**
     * Sets the value of the separationNameTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSeparationNameTag(Integer value) {
        this.separationNameTag = value;
    }

}
