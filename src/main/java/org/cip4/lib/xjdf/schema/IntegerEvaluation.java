
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
 * <p>Java class for IntegerEvaluation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntegerEvaluation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}TermType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}BasicPreflightTest" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ValueMod" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="ValueList" type="{http://www.CIP4.org/JDFSchema_2_0}IntegerRangeList" />
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
@XmlType(name = "IntegerEvaluation", propOrder = {
    "basicPreflightTest"
})
public class IntegerEvaluation
    extends TermType
    implements Serializable
{

    @XmlElement(name = "BasicPreflightTest")
    protected List<BasicPreflightTest> basicPreflightTest;
    @XmlAttribute(name = "ValueMod")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.XYPair.class)
    protected org.cip4.lib.xjdf.type.XYPair valueMod;
    @XmlAttribute(name = "ValueList")
    protected Integer valueList;
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
     * Gets the value of the valueMod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.XYPair getValueMod() {
        return valueMod;
    }

    /**
     * Sets the value of the valueMod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueMod(org.cip4.lib.xjdf.type.XYPair value) {
        this.valueMod = value;
    }

    /**
     * Gets the value of the valueList property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValueList() {
        return valueList;
    }

    /**
     * Sets the value of the valueList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValueList(Integer value) {
        this.valueList = value;
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
