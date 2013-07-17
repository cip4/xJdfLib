
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
 * <p>Java class for QualityControlResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QualityControlResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}QualityMeasurement" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Failed" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="Passed" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="FileSpecRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="BindingQualityParamsRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QualityControlResult", propOrder = {
    "qualityMeasurement"
})
public class QualityControlResult
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "QualityMeasurement")
    protected List<QualityMeasurement> qualityMeasurement;
    @XmlAttribute(name = "Failed")
    protected Integer failed;
    @XmlAttribute(name = "Passed")
    protected Integer passed;
    @XmlAttribute(name = "FileSpecRef")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IDREF.class)
    protected org.cip4.lib.xjdf.type.IDREF fileSpecRef;
    @XmlAttribute(name = "BindingQualityParamsRef")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IDREF.class)
    protected org.cip4.lib.xjdf.type.IDREF bindingQualityParamsRef;

    /**
     * Gets the value of the qualityMeasurement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qualityMeasurement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQualityMeasurement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualityMeasurement }
     * 
     * 
     */
    public List<QualityMeasurement> getQualityMeasurement() {
        if (qualityMeasurement == null) {
            qualityMeasurement = new ArrayList<QualityMeasurement>();
        }
        return this.qualityMeasurement;
    }

    /**
     * Gets the value of the failed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFailed() {
        return failed;
    }

    /**
     * Sets the value of the failed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFailed(Integer value) {
        this.failed = value;
    }

    /**
     * Gets the value of the passed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPassed() {
        return passed;
    }

    /**
     * Sets the value of the passed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPassed(Integer value) {
        this.passed = value;
    }

    /**
     * Gets the value of the fileSpecRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.IDREF getFileSpecRef() {
        return fileSpecRef;
    }

    /**
     * Sets the value of the fileSpecRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileSpecRef(org.cip4.lib.xjdf.type.IDREF value) {
        this.fileSpecRef = value;
    }

    /**
     * Gets the value of the bindingQualityParamsRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.IDREF getBindingQualityParamsRef() {
        return bindingQualityParamsRef;
    }

    /**
     * Sets the value of the bindingQualityParamsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBindingQualityParamsRef(org.cip4.lib.xjdf.type.IDREF value) {
        this.bindingQualityParamsRef = value;
    }

}
