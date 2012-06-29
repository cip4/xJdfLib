
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for PackingIntent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackingIntent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}IntentType">
 *       &lt;attribute name="BoxedQuantity" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="WrappingMaterial" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="PalletType" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="PalletCornerBoards" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="PalletSize" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="CartonMaxWeight" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="PalletWrapping" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="CartonQuantity" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="CartonShape" type="{http://www.CIP4.org/JDFSchema_2_0}shape" />
 *       &lt;attribute name="PalletMaxHeight" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="CartonStrength" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="WrappedQuantity" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="PalletMaxWeight" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="PalletQuantity" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="BoxShape" type="{http://www.CIP4.org/JDFSchema_2_0}shape" />
 *       &lt;attribute name="FoldingCatalog" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackingIntent")
public class PackingIntent
    extends IntentType
    implements Serializable
{

    @XmlAttribute(name = "BoxedQuantity")
    protected Integer boxedQuantity;
    @XmlAttribute(name = "WrappingMaterial")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String wrappingMaterial;
    @XmlAttribute(name = "PalletType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String palletType;
    @XmlAttribute(name = "PalletCornerBoards")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String palletCornerBoards;
    @XmlAttribute(name = "PalletSize")
    protected List<Double> palletSizes;
    @XmlAttribute(name = "CartonMaxWeight")
    protected Double cartonMaxWeight;
    @XmlAttribute(name = "PalletWrapping")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String palletWrapping;
    @XmlAttribute(name = "CartonQuantity")
    protected Integer cartonQuantity;
    @XmlAttribute(name = "CartonShape")
    protected List<Double> cartonShapes;
    @XmlAttribute(name = "PalletMaxHeight")
    protected Double palletMaxHeight;
    @XmlAttribute(name = "CartonStrength")
    protected Double cartonStrength;
    @XmlAttribute(name = "WrappedQuantity")
    protected Integer wrappedQuantity;
    @XmlAttribute(name = "PalletMaxWeight")
    protected Double palletMaxWeight;
    @XmlAttribute(name = "PalletQuantity")
    protected Integer palletQuantity;
    @XmlAttribute(name = "BoxShape")
    protected List<Double> boxShapes;
    @XmlAttribute(name = "FoldingCatalog")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String foldingCatalog;

    /**
     * Gets the value of the boxedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBoxedQuantity() {
        return boxedQuantity;
    }

    /**
     * Sets the value of the boxedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBoxedQuantity(Integer value) {
        this.boxedQuantity = value;
    }

    /**
     * Gets the value of the wrappingMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWrappingMaterial() {
        return wrappingMaterial;
    }

    /**
     * Sets the value of the wrappingMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWrappingMaterial(String value) {
        this.wrappingMaterial = value;
    }

    /**
     * Gets the value of the palletType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPalletType() {
        return palletType;
    }

    /**
     * Sets the value of the palletType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPalletType(String value) {
        this.palletType = value;
    }

    /**
     * Gets the value of the palletCornerBoards property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPalletCornerBoards() {
        return palletCornerBoards;
    }

    /**
     * Sets the value of the palletCornerBoards property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPalletCornerBoards(String value) {
        this.palletCornerBoards = value;
    }

    /**
     * Gets the value of the palletSizes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the palletSizes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPalletSizes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getPalletSizes() {
        if (palletSizes == null) {
            palletSizes = new ArrayList<Double>();
        }
        return this.palletSizes;
    }

    /**
     * Gets the value of the cartonMaxWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCartonMaxWeight() {
        return cartonMaxWeight;
    }

    /**
     * Sets the value of the cartonMaxWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCartonMaxWeight(Double value) {
        this.cartonMaxWeight = value;
    }

    /**
     * Gets the value of the palletWrapping property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPalletWrapping() {
        return palletWrapping;
    }

    /**
     * Sets the value of the palletWrapping property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPalletWrapping(String value) {
        this.palletWrapping = value;
    }

    /**
     * Gets the value of the cartonQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCartonQuantity() {
        return cartonQuantity;
    }

    /**
     * Sets the value of the cartonQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCartonQuantity(Integer value) {
        this.cartonQuantity = value;
    }

    /**
     * Gets the value of the cartonShapes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cartonShapes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCartonShapes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getCartonShapes() {
        if (cartonShapes == null) {
            cartonShapes = new ArrayList<Double>();
        }
        return this.cartonShapes;
    }

    /**
     * Gets the value of the palletMaxHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPalletMaxHeight() {
        return palletMaxHeight;
    }

    /**
     * Sets the value of the palletMaxHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPalletMaxHeight(Double value) {
        this.palletMaxHeight = value;
    }

    /**
     * Gets the value of the cartonStrength property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCartonStrength() {
        return cartonStrength;
    }

    /**
     * Sets the value of the cartonStrength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCartonStrength(Double value) {
        this.cartonStrength = value;
    }

    /**
     * Gets the value of the wrappedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWrappedQuantity() {
        return wrappedQuantity;
    }

    /**
     * Sets the value of the wrappedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWrappedQuantity(Integer value) {
        this.wrappedQuantity = value;
    }

    /**
     * Gets the value of the palletMaxWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPalletMaxWeight() {
        return palletMaxWeight;
    }

    /**
     * Sets the value of the palletMaxWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPalletMaxWeight(Double value) {
        this.palletMaxWeight = value;
    }

    /**
     * Gets the value of the palletQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPalletQuantity() {
        return palletQuantity;
    }

    /**
     * Sets the value of the palletQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPalletQuantity(Integer value) {
        this.palletQuantity = value;
    }

    /**
     * Gets the value of the boxShapes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the boxShapes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoxShapes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getBoxShapes() {
        if (boxShapes == null) {
            boxShapes = new ArrayList<Double>();
        }
        return this.boxShapes;
    }

    /**
     * Gets the value of the foldingCatalog property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoldingCatalog() {
        return foldingCatalog;
    }

    /**
     * Sets the value of the foldingCatalog property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoldingCatalog(String value) {
        this.foldingCatalog = value;
    }

}
