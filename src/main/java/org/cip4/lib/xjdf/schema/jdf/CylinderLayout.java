
package org.cip4.lib.xjdf.schema.jdf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for CylinderLayout complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CylinderLayout">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}CylinderPosition" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="DeviceID" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="LayoutRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CylinderLayout", propOrder = {
    "cylinderPositions"
})
public class CylinderLayout
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "CylinderPosition")
    protected List<CylinderPosition> cylinderPositions;
    @XmlAttribute(name = "DeviceID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String deviceID;
    @XmlAttribute(name = "LayoutRef")
    @XmlIDREF
    protected Object layoutRef;

    /**
     * Gets the value of the cylinderPositions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cylinderPositions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCylinderPositions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CylinderPosition }
     * 
     * 
     */
    public List<CylinderPosition> getCylinderPositions() {
        if (cylinderPositions == null) {
            cylinderPositions = new ArrayList<CylinderPosition>();
        }
        return this.cylinderPositions;
    }

    /**
     * Gets the value of the deviceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceID() {
        return deviceID;
    }

    /**
     * Sets the value of the deviceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceID(String value) {
        this.deviceID = value;
    }

    /**
     * Gets the value of the layoutRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLayoutRef() {
        return layoutRef;
    }

    /**
     * Sets the value of the layoutRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLayoutRef(Object value) {
        this.layoutRef = value;
    }

}
