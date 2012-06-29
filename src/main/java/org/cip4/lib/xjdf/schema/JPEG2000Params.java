
package org.cip4.lib.xjdf.schema;

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
 *       &lt;attribute name="LayersPerTile" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="TileSize" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="LayerRates" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="ProgressionOrder" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CodeBlockSize" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="NumResolutions" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "JPEG2000Params")
public class JPEG2000Params
    implements Serializable
{

    @XmlAttribute(name = "LayersPerTile")
    protected Integer layersPerTile;
    @XmlAttribute(name = "TileSize")
    protected List<Double> tileSizes;
    @XmlAttribute(name = "LayerRates")
    protected String layerRates;
    @XmlAttribute(name = "ProgressionOrder")
    @XmlSchemaType(name = "anySimpleType")
    protected String progressionOrder;
    @XmlAttribute(name = "CodeBlockSize")
    protected Integer codeBlockSize;
    @XmlAttribute(name = "NumResolutions")
    protected Integer numResolutions;

    /**
     * Gets the value of the layersPerTile property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLayersPerTile() {
        return layersPerTile;
    }

    /**
     * Sets the value of the layersPerTile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLayersPerTile(Integer value) {
        this.layersPerTile = value;
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
     * Gets the value of the layerRates property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLayerRates() {
        return layerRates;
    }

    /**
     * Sets the value of the layerRates property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLayerRates(String value) {
        this.layerRates = value;
    }

    /**
     * Gets the value of the progressionOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgressionOrder() {
        return progressionOrder;
    }

    /**
     * Sets the value of the progressionOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgressionOrder(String value) {
        this.progressionOrder = value;
    }

    /**
     * Gets the value of the codeBlockSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodeBlockSize() {
        return codeBlockSize;
    }

    /**
     * Sets the value of the codeBlockSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodeBlockSize(Integer value) {
        this.codeBlockSize = value;
    }

    /**
     * Gets the value of the numResolutions property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumResolutions() {
        return numResolutions;
    }

    /**
     * Sets the value of the numResolutions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumResolutions(Integer value) {
        this.numResolutions = value;
    }

}
