
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LayoutShift complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LayoutShift">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ShiftPoint" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LayoutShift", propOrder = {
    "shiftPoint"
})
public class LayoutShift
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "ShiftPoint")
    protected List<ShiftPoint> shiftPoint;

    /**
     * Gets the value of the shiftPoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shiftPoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShiftPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShiftPoint }
     * 
     * 
     */
    public List<ShiftPoint> getShiftPoint() {
        if (shiftPoint == null) {
            shiftPoint = new ArrayList<ShiftPoint>();
        }
        return this.shiftPoint;
    }

}
