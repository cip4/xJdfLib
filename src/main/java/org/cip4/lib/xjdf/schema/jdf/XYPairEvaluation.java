
package org.cip4.lib.xjdf.schema.jdf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XYPairEvaluation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XYPairEvaluation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}TermType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}BasicPreflightTest" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="EnumXYRelation" type="{http://www.CIP4.org/JDFSchema_2_0}EnumXYRelation" />
 *       &lt;attribute name="ValueList" type="{http://www.CIP4.org/JDFSchema_2_0}XYPairRangeList" />
 *       &lt;attribute name="Tolerance" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="XPath" use="required" type="{http://www.CIP4.org/JDFSchema_2_0}XPath" />
 *       &lt;attribute name="XPathRoot" type="{http://www.CIP4.org/JDFSchema_2_0}XPath" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XYPairEvaluation", propOrder = {
    "basicPreflightTests"
})
public class XYPairEvaluation
    extends TermType
    implements Serializable
{

    @XmlElement(name = "BasicPreflightTest")
    protected List<BasicPreflightTest> basicPreflightTests;
    @XmlAttribute(name = "EnumXYRelation")
    protected EnumXYRelation enumXYRelation;
    @XmlAttribute(name = "ValueList")
    protected List<Double> valueLists;
    @XmlAttribute(name = "Tolerance")
    protected List<Double> tolerances;
    @XmlAttribute(name = "XPath", required = true)
    protected String xPath;
    @XmlAttribute(name = "XPathRoot")
    protected String xPathRoot;

    /**
     * Gets the value of the basicPreflightTests property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the basicPreflightTests property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBasicPreflightTests().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BasicPreflightTest }
     * 
     * 
     */
    public List<BasicPreflightTest> getBasicPreflightTests() {
        if (basicPreflightTests == null) {
            basicPreflightTests = new ArrayList<BasicPreflightTest>();
        }
        return this.basicPreflightTests;
    }

    /**
     * Gets the value of the enumXYRelation property.
     * 
     * @return
     *     possible object is
     *     {@link EnumXYRelation }
     *     
     */
    public EnumXYRelation getEnumXYRelation() {
        return enumXYRelation;
    }

    /**
     * Sets the value of the enumXYRelation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumXYRelation }
     *     
     */
    public void setEnumXYRelation(EnumXYRelation value) {
        this.enumXYRelation = value;
    }

    /**
     * Gets the value of the valueLists property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valueLists property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValueLists().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getValueLists() {
        if (valueLists == null) {
            valueLists = new ArrayList<Double>();
        }
        return this.valueLists;
    }

    /**
     * Gets the value of the tolerances property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tolerances property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTolerances().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getTolerances() {
        if (tolerances == null) {
            tolerances = new ArrayList<Double>();
        }
        return this.tolerances;
    }

    /**
     * Gets the value of the xPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXPath() {
        return xPath;
    }

    /**
     * Sets the value of the xPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXPath(String value) {
        this.xPath = value;
    }

    /**
     * Gets the value of the xPathRoot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXPathRoot() {
        return xPathRoot;
    }

    /**
     * Sets the value of the xPathRoot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXPathRoot(String value) {
        this.xPathRoot = value;
    }

}
