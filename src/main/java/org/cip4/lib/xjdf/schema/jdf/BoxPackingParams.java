
package org.cip4.lib.xjdf.schema.jdf;

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
 * <p>Java class for BoxPackingParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BoxPackingParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;attribute name="MaxWeight" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="Pattern" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="Layers" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="Ties" type="{http://www.CIP4.org/JDFSchema_2_0}IntegerList" />
 *       &lt;attribute name="FillMaterial" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="UnderLays" type="{http://www.CIP4.org/JDFSchema_2_0}IntegerList" />
 *       &lt;attribute name="ComponentsPerRow" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="ComponentOrientation" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Copies" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="Rows" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="Columns" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BoxPackingParams")
public class BoxPackingParams
    extends ParameterType
    implements Serializable
{

    @XmlAttribute(name = "MaxWeight")
    protected Double maxWeight;
    @XmlAttribute(name = "Pattern")
    protected String pattern;
    @XmlAttribute(name = "Layers")
    protected Integer layers;
    @XmlAttribute(name = "Ties")
    protected List<Integer> ties;
    @XmlAttribute(name = "FillMaterial")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String fillMaterial;
    @XmlAttribute(name = "UnderLays")
    protected List<Integer> underLays;
    @XmlAttribute(name = "ComponentsPerRow")
    protected Integer componentsPerRow;
    @XmlAttribute(name = "ComponentOrientation")
    @XmlSchemaType(name = "anySimpleType")
    protected String componentOrientation;
    @XmlAttribute(name = "Copies")
    protected Integer copies;
    @XmlAttribute(name = "Rows")
    protected Integer rows;
    @XmlAttribute(name = "Columns")
    protected Integer columns;

    /**
     * Gets the value of the maxWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxWeight() {
        return maxWeight;
    }

    /**
     * Sets the value of the maxWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxWeight(Double value) {
        this.maxWeight = value;
    }

    /**
     * Gets the value of the pattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPattern() {
        return pattern;
    }

    /**
     * Sets the value of the pattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPattern(String value) {
        this.pattern = value;
    }

    /**
     * Gets the value of the layers property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLayers() {
        return layers;
    }

    /**
     * Sets the value of the layers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLayers(Integer value) {
        this.layers = value;
    }

    /**
     * Gets the value of the ties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getTies() {
        if (ties == null) {
            ties = new ArrayList<Integer>();
        }
        return this.ties;
    }

    /**
     * Gets the value of the fillMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFillMaterial() {
        return fillMaterial;
    }

    /**
     * Sets the value of the fillMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFillMaterial(String value) {
        this.fillMaterial = value;
    }

    /**
     * Gets the value of the underLays property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the underLays property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnderLays().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getUnderLays() {
        if (underLays == null) {
            underLays = new ArrayList<Integer>();
        }
        return this.underLays;
    }

    /**
     * Gets the value of the componentsPerRow property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getComponentsPerRow() {
        return componentsPerRow;
    }

    /**
     * Sets the value of the componentsPerRow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setComponentsPerRow(Integer value) {
        this.componentsPerRow = value;
    }

    /**
     * Gets the value of the componentOrientation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponentOrientation() {
        return componentOrientation;
    }

    /**
     * Sets the value of the componentOrientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponentOrientation(String value) {
        this.componentOrientation = value;
    }

    /**
     * Gets the value of the copies property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCopies() {
        return copies;
    }

    /**
     * Sets the value of the copies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCopies(Integer value) {
        this.copies = value;
    }

    /**
     * Gets the value of the rows property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRows() {
        return rows;
    }

    /**
     * Sets the value of the rows property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRows(Integer value) {
        this.rows = value;
    }

    /**
     * Gets the value of the columns property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getColumns() {
        return columns;
    }

    /**
     * Sets the value of the columns property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setColumns(Integer value) {
        this.columns = value;
    }

}
