
package org.cip4.lib.xjdf.schema.jdf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ColorIntent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ColorIntent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}IntentType">
 *       &lt;attribute name="NumColors" type="{http://www.CIP4.org/JDFSchema_2_0}IntegerList" />
 *       &lt;attribute name="ColorRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="ColorsUsed" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKENS" />
 *       &lt;attribute name="Coverage" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="ColorStandard" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="ColorICCStandard" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="Coatings" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ColorIntent")
public class ColorIntent
    extends IntentType
    implements Serializable
{

    @XmlAttribute(name = "NumColors")
    protected List<Integer> numColors;
    @XmlAttribute(name = "ColorRef")
    @XmlIDREF
    protected Object colorRef;
    @XmlAttribute(name = "ColorsUsed")
    protected List<String> colorsUseds;
    @XmlAttribute(name = "Coverage")
    protected Double coverage;
    @XmlAttribute(name = "ColorStandard")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String colorStandard;
    @XmlAttribute(name = "ColorICCStandard")
    protected String colorICCStandard;
    @XmlAttribute(name = "Coatings")
    protected String coatings;

    /**
     * Gets the value of the numColors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numColors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumColors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getNumColors() {
        if (numColors == null) {
            numColors = new ArrayList<Integer>();
        }
        return this.numColors;
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
     * Gets the value of the colorsUseds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the colorsUseds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColorsUseds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getColorsUseds() {
        if (colorsUseds == null) {
            colorsUseds = new ArrayList<String>();
        }
        return this.colorsUseds;
    }

    /**
     * Gets the value of the coverage property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCoverage() {
        return coverage;
    }

    /**
     * Sets the value of the coverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCoverage(Double value) {
        this.coverage = value;
    }

    /**
     * Gets the value of the colorStandard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorStandard() {
        return colorStandard;
    }

    /**
     * Sets the value of the colorStandard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorStandard(String value) {
        this.colorStandard = value;
    }

    /**
     * Gets the value of the colorICCStandard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorICCStandard() {
        return colorICCStandard;
    }

    /**
     * Sets the value of the colorICCStandard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorICCStandard(String value) {
        this.colorICCStandard = value;
    }

    /**
     * Gets the value of the coatings property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoatings() {
        return coatings;
    }

    /**
     * Sets the value of the coatings property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoatings(String value) {
        this.coatings = value;
    }

}
