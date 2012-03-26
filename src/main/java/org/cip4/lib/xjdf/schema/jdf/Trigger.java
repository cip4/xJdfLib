
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
 * <p>Java class for Trigger complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Trigger">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ChangedPath" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="RepeatTime" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="RepeatStep" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Trigger", propOrder = {
    "changedPaths"
})
public class Trigger
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "ChangedPath")
    protected List<ChangedPath> changedPaths;
    @XmlAttribute(name = "RepeatTime")
    protected Double repeatTime;
    @XmlAttribute(name = "RepeatStep")
    protected Integer repeatStep;

    /**
     * Gets the value of the changedPaths property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the changedPaths property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChangedPaths().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChangedPath }
     * 
     * 
     */
    public List<ChangedPath> getChangedPaths() {
        if (changedPaths == null) {
            changedPaths = new ArrayList<ChangedPath>();
        }
        return this.changedPaths;
    }

    /**
     * Gets the value of the repeatTime property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRepeatTime() {
        return repeatTime;
    }

    /**
     * Sets the value of the repeatTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRepeatTime(Double value) {
        this.repeatTime = value;
    }

    /**
     * Gets the value of the repeatStep property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRepeatStep() {
        return repeatStep;
    }

    /**
     * Sets the value of the repeatStep property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRepeatStep(Integer value) {
        this.repeatStep = value;
    }

}
