
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpinePreparationParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpinePreparationParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;attribute name="WorkingLength" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="MillingDepth" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="StartPosition" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="NotchingDepth" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="NotchingDistance" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="Operations" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKENS" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpinePreparationParams")
public class SpinePreparationParams
    extends ParameterType
    implements Serializable
{

    @XmlAttribute(name = "WorkingLength")
    protected Double workingLength;
    @XmlAttribute(name = "MillingDepth")
    protected Double millingDepth;
    @XmlAttribute(name = "StartPosition")
    protected Double startPosition;
    @XmlAttribute(name = "NotchingDepth")
    protected Double notchingDepth;
    @XmlAttribute(name = "NotchingDistance")
    protected Double notchingDistance;
    @XmlAttribute(name = "Operations")
    protected List<String> operations;

    /**
     * Gets the value of the workingLength property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWorkingLength() {
        return workingLength;
    }

    /**
     * Sets the value of the workingLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWorkingLength(Double value) {
        this.workingLength = value;
    }

    /**
     * Gets the value of the millingDepth property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMillingDepth() {
        return millingDepth;
    }

    /**
     * Sets the value of the millingDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMillingDepth(Double value) {
        this.millingDepth = value;
    }

    /**
     * Gets the value of the startPosition property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStartPosition() {
        return startPosition;
    }

    /**
     * Sets the value of the startPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStartPosition(Double value) {
        this.startPosition = value;
    }

    /**
     * Gets the value of the notchingDepth property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNotchingDepth() {
        return notchingDepth;
    }

    /**
     * Sets the value of the notchingDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNotchingDepth(Double value) {
        this.notchingDepth = value;
    }

    /**
     * Gets the value of the notchingDistance property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNotchingDistance() {
        return notchingDistance;
    }

    /**
     * Sets the value of the notchingDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNotchingDistance(Double value) {
        this.notchingDistance = value;
    }

    /**
     * Gets the value of the operations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOperations() {
        if (operations == null) {
            operations = new ArrayList<String>();
        }
        return this.operations;
    }

}
