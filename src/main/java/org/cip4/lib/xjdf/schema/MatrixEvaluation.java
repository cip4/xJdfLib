
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for MatrixEvaluation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MatrixEvaluation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}TermType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}BasicPreflightTest" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="RotateMod" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="Shift" type="{http://www.CIP4.org/JDFSchema_2_0}NumberList" />
 *       &lt;attribute name="Tolerance" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="Transforms" type="{http://www.CIP4.org/JDFSchema_2_0}EnumOrientation" />
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
@XmlType(name = "MatrixEvaluation", propOrder = {
    "basicPreflightTest"
})
public class MatrixEvaluation
    extends TermType
    implements Serializable
{

    @XmlElement(name = "BasicPreflightTest")
    protected List<BasicPreflightTest> basicPreflightTest;
    @XmlAttribute(name = "RotateMod")
    protected Double rotateMod;
    @XmlAttribute(name = "Shift")
    protected List<Double> shift;
    @XmlAttribute(name = "Tolerance")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.XYPair.class)
    protected org.cip4.lib.xjdf.type.XYPair tolerance;
    @XmlAttribute(name = "Transforms")
    protected EnumOrientation transforms;
    @XmlAttribute(name = "XPath", required = true)
    protected String xPath;
    @XmlAttribute(name = "XPathRoot")
    protected String xPathRoot;

    /**
     * Gets the value of the basicPreflightTest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the basicPreflightTest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBasicPreflightTest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BasicPreflightTest }
     * 
     * 
     */
    public List<BasicPreflightTest> getBasicPreflightTest() {
        if (basicPreflightTest == null) {
            basicPreflightTest = new ArrayList<BasicPreflightTest>();
        }
        return this.basicPreflightTest;
    }

    /**
     * Gets the value of the rotateMod property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRotateMod() {
        return rotateMod;
    }

    /**
     * Sets the value of the rotateMod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRotateMod(Double value) {
        this.rotateMod = value;
    }

    /**
     * Gets the value of the shift property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shift property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShift().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getShift() {
        if (shift == null) {
            shift = new ArrayList<Double>();
        }
        return this.shift;
    }

    /**
     * Gets the value of the tolerance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.XYPair getTolerance() {
        return tolerance;
    }

    /**
     * Sets the value of the tolerance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTolerance(org.cip4.lib.xjdf.type.XYPair value) {
        this.tolerance = value;
    }

    /**
     * Gets the value of the transforms property.
     * 
     * @return
     *     possible object is
     *     {@link EnumOrientation }
     *     
     */
    public EnumOrientation getTransforms() {
        return transforms;
    }

    /**
     * Sets the value of the transforms property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumOrientation }
     *     
     */
    public void setTransforms(EnumOrientation value) {
        this.transforms = value;
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
